package de.xtext.mgse.aos.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.xtext.mgse.aos.ageOfScala.Action;
import de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage;
import de.xtext.mgse.aos.ageOfScala.BuildBuilding;
import de.xtext.mgse.aos.ageOfScala.ShowBuildings;
import de.xtext.mgse.aos.services.AgeOfScalaGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AgeOfScalaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AgeOfScalaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AgeOfScalaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AgeOfScalaPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case AgeOfScalaPackage.BUILD_BUILDING:
				if(context == grammarAccess.getBuildBuildingRule()) {
					sequence_BuildBuilding(context, (BuildBuilding) semanticObject); 
					return; 
				}
				else break;
			case AgeOfScalaPackage.SHOW_BUILDINGS:
				if(context == grammarAccess.getShowBuildingsRule()) {
					sequence_ShowBuildings(context, (ShowBuildings) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (action+=ShowBuildings | action+=BuildBuilding)+
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (buildType+=BuildType gebauede=Buildings)
	 */
	protected void sequence_BuildBuilding(EObject context, BuildBuilding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     gebauede=BuildingTypes
	 */
	protected void sequence_ShowBuildings(EObject context, ShowBuildings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AgeOfScalaPackage.Literals.SHOW_BUILDINGS__GEBAUEDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgeOfScalaPackage.Literals.SHOW_BUILDINGS__GEBAUEDE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShowBuildingsAccess().getGebauedeBuildingTypesEnumRuleCall_1_0(), semanticObject.getGebauede());
		feeder.finish();
	}
}
