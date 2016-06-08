package de.xtext.mgse.aos.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.xtext.mgse.aos.services.AgeOfScalaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgeOfScalaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Zeige alle'", "'Geb\\u00E4ude'", "'Baue'", "'Zerst\\u00F6re'", "'Wohngeb\\u00E4ude'", "'Produzierendes Geb\\u00E4ude'", "'Lagergeb\\u00E4ude'", "'Holzf\\u00E4ller'", "'Steinmetz'", "'J\\u00E4ger'", "'Fischerei'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAgeOfScalaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAgeOfScalaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAgeOfScalaParser.tokenNames; }
    public String getGrammarFileName() { return "../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g"; }



     	private AgeOfScalaGrammarAccess grammarAccess;
     	
        public InternalAgeOfScalaParser(TokenStream input, AgeOfScalaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Action";	
       	}
       	
       	@Override
       	protected AgeOfScalaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAction"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:68:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:69:2: (iv_ruleAction= ruleAction EOF )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:70:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction75);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:77:1: ruleAction returns [EObject current=null] : ( ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) ) )+ ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_1 = null;

        EObject lv_action_0_2 = null;


         enterRule(); 
            
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:80:28: ( ( ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) ) )+ )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:81:1: ( ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) ) )+
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:81:1: ( ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||(LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:82:1: ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) )
            	    {
            	    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:82:1: ( (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding ) )
            	    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:83:1: (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding )
            	    {
            	    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:83:1: (lv_action_0_1= ruleShowBuildings | lv_action_0_2= ruleBuildBuilding )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    else if ( ((LA1_0>=13 && LA1_0<=14)) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:84:3: lv_action_0_1= ruleShowBuildings
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActionAccess().getActionShowBuildingsParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleShowBuildings_in_ruleAction132);
            	            lv_action_0_1=ruleShowBuildings();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"action",
            	                    		lv_action_0_1, 
            	                    		"ShowBuildings");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:99:8: lv_action_0_2= ruleBuildBuilding
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActionAccess().getActionBuildBuildingParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleBuildBuilding_in_ruleAction151);
            	            lv_action_0_2=ruleBuildBuilding();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"action",
            	                    		lv_action_0_2, 
            	                    		"BuildBuilding");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleShowBuildings"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:125:1: entryRuleShowBuildings returns [EObject current=null] : iv_ruleShowBuildings= ruleShowBuildings EOF ;
    public final EObject entryRuleShowBuildings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowBuildings = null;


        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:126:2: (iv_ruleShowBuildings= ruleShowBuildings EOF )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:127:2: iv_ruleShowBuildings= ruleShowBuildings EOF
            {
             newCompositeNode(grammarAccess.getShowBuildingsRule()); 
            pushFollow(FOLLOW_ruleShowBuildings_in_entryRuleShowBuildings190);
            iv_ruleShowBuildings=ruleShowBuildings();

            state._fsp--;

             current =iv_ruleShowBuildings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShowBuildings200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShowBuildings"


    // $ANTLR start "ruleShowBuildings"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:134:1: ruleShowBuildings returns [EObject current=null] : (otherlv_0= 'Zeige alle' ( (lv_gebauede_1_0= ruleBuildingTypes ) ) ) ;
    public final EObject ruleShowBuildings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_gebauede_1_0 = null;


         enterRule(); 
            
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:137:28: ( (otherlv_0= 'Zeige alle' ( (lv_gebauede_1_0= ruleBuildingTypes ) ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:138:1: (otherlv_0= 'Zeige alle' ( (lv_gebauede_1_0= ruleBuildingTypes ) ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:138:1: (otherlv_0= 'Zeige alle' ( (lv_gebauede_1_0= ruleBuildingTypes ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:138:3: otherlv_0= 'Zeige alle' ( (lv_gebauede_1_0= ruleBuildingTypes ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleShowBuildings237); 

                	newLeafNode(otherlv_0, grammarAccess.getShowBuildingsAccess().getZeigeAlleKeyword_0());
                
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:142:1: ( (lv_gebauede_1_0= ruleBuildingTypes ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:143:1: (lv_gebauede_1_0= ruleBuildingTypes )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:143:1: (lv_gebauede_1_0= ruleBuildingTypes )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:144:3: lv_gebauede_1_0= ruleBuildingTypes
            {
             
            	        newCompositeNode(grammarAccess.getShowBuildingsAccess().getGebauedeBuildingTypesEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBuildingTypes_in_ruleShowBuildings258);
            lv_gebauede_1_0=ruleBuildingTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowBuildingsRule());
            	        }
                   		set(
                   			current, 
                   			"gebauede",
                    		lv_gebauede_1_0, 
                    		"BuildingTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShowBuildings"


    // $ANTLR start "entryRuleBuildBuilding"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:168:1: entryRuleBuildBuilding returns [EObject current=null] : iv_ruleBuildBuilding= ruleBuildBuilding EOF ;
    public final EObject entryRuleBuildBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildBuilding = null;


        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:169:2: (iv_ruleBuildBuilding= ruleBuildBuilding EOF )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:170:2: iv_ruleBuildBuilding= ruleBuildBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildBuildingRule()); 
            pushFollow(FOLLOW_ruleBuildBuilding_in_entryRuleBuildBuilding294);
            iv_ruleBuildBuilding=ruleBuildBuilding();

            state._fsp--;

             current =iv_ruleBuildBuilding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildBuilding304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildBuilding"


    // $ANTLR start "ruleBuildBuilding"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:177:1: ruleBuildBuilding returns [EObject current=null] : ( ( (lv_buildType_0_0= ruleBuildType ) ) otherlv_1= 'Geb\\u00E4ude' ( (lv_gebauede_2_0= ruleBuildings ) ) ) ;
    public final EObject ruleBuildBuilding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_buildType_0_0 = null;

        Enumerator lv_gebauede_2_0 = null;


         enterRule(); 
            
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:180:28: ( ( ( (lv_buildType_0_0= ruleBuildType ) ) otherlv_1= 'Geb\\u00E4ude' ( (lv_gebauede_2_0= ruleBuildings ) ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:181:1: ( ( (lv_buildType_0_0= ruleBuildType ) ) otherlv_1= 'Geb\\u00E4ude' ( (lv_gebauede_2_0= ruleBuildings ) ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:181:1: ( ( (lv_buildType_0_0= ruleBuildType ) ) otherlv_1= 'Geb\\u00E4ude' ( (lv_gebauede_2_0= ruleBuildings ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:181:2: ( (lv_buildType_0_0= ruleBuildType ) ) otherlv_1= 'Geb\\u00E4ude' ( (lv_gebauede_2_0= ruleBuildings ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:181:2: ( (lv_buildType_0_0= ruleBuildType ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:182:1: (lv_buildType_0_0= ruleBuildType )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:182:1: (lv_buildType_0_0= ruleBuildType )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:183:3: lv_buildType_0_0= ruleBuildType
            {
             
            	        newCompositeNode(grammarAccess.getBuildBuildingAccess().getBuildTypeBuildTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBuildType_in_ruleBuildBuilding350);
            lv_buildType_0_0=ruleBuildType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuildBuildingRule());
            	        }
                   		add(
                   			current, 
                   			"buildType",
                    		lv_buildType_0_0, 
                    		"BuildType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBuildBuilding362); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildBuildingAccess().getGebäudeKeyword_1());
                
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:203:1: ( (lv_gebauede_2_0= ruleBuildings ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:204:1: (lv_gebauede_2_0= ruleBuildings )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:204:1: (lv_gebauede_2_0= ruleBuildings )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:205:3: lv_gebauede_2_0= ruleBuildings
            {
             
            	        newCompositeNode(grammarAccess.getBuildBuildingAccess().getGebauedeBuildingsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBuildings_in_ruleBuildBuilding383);
            lv_gebauede_2_0=ruleBuildings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuildBuildingRule());
            	        }
                   		set(
                   			current, 
                   			"gebauede",
                    		lv_gebauede_2_0, 
                    		"Buildings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildBuilding"


    // $ANTLR start "ruleBuildType"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:229:1: ruleBuildType returns [Enumerator current=null] : ( (enumLiteral_0= 'Baue' ) | (enumLiteral_1= 'Zerst\\u00F6re' ) ) ;
    public final Enumerator ruleBuildType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:231:28: ( ( (enumLiteral_0= 'Baue' ) | (enumLiteral_1= 'Zerst\\u00F6re' ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:232:1: ( (enumLiteral_0= 'Baue' ) | (enumLiteral_1= 'Zerst\\u00F6re' ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:232:1: ( (enumLiteral_0= 'Baue' ) | (enumLiteral_1= 'Zerst\\u00F6re' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:232:2: (enumLiteral_0= 'Baue' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:232:2: (enumLiteral_0= 'Baue' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:232:4: enumLiteral_0= 'Baue'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleBuildType433); 

                            current = grammarAccess.getBuildTypeAccess().getBUILDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuildTypeAccess().getBUILDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:238:6: (enumLiteral_1= 'Zerst\\u00F6re' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:238:6: (enumLiteral_1= 'Zerst\\u00F6re' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:238:8: enumLiteral_1= 'Zerst\\u00F6re'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_14_in_ruleBuildType450); 

                            current = grammarAccess.getBuildTypeAccess().getDESTROYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuildTypeAccess().getDESTROYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildType"


    // $ANTLR start "ruleBuildingTypes"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:248:1: ruleBuildingTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Wohngeb\\u00E4ude' ) | (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' ) | (enumLiteral_2= 'Lagergeb\\u00E4ude' ) ) ;
    public final Enumerator ruleBuildingTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:250:28: ( ( (enumLiteral_0= 'Wohngeb\\u00E4ude' ) | (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' ) | (enumLiteral_2= 'Lagergeb\\u00E4ude' ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:251:1: ( (enumLiteral_0= 'Wohngeb\\u00E4ude' ) | (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' ) | (enumLiteral_2= 'Lagergeb\\u00E4ude' ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:251:1: ( (enumLiteral_0= 'Wohngeb\\u00E4ude' ) | (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' ) | (enumLiteral_2= 'Lagergeb\\u00E4ude' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:251:2: (enumLiteral_0= 'Wohngeb\\u00E4ude' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:251:2: (enumLiteral_0= 'Wohngeb\\u00E4ude' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:251:4: enumLiteral_0= 'Wohngeb\\u00E4ude'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_15_in_ruleBuildingTypes495); 

                            current = grammarAccess.getBuildingTypesAccess().getHOUSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuildingTypesAccess().getHOUSEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:257:6: (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:257:6: (enumLiteral_1= 'Produzierendes Geb\\u00E4ude' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:257:8: enumLiteral_1= 'Produzierendes Geb\\u00E4ude'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_16_in_ruleBuildingTypes512); 

                            current = grammarAccess.getBuildingTypesAccess().getPRODUCINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuildingTypesAccess().getPRODUCINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:263:6: (enumLiteral_2= 'Lagergeb\\u00E4ude' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:263:6: (enumLiteral_2= 'Lagergeb\\u00E4ude' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:263:8: enumLiteral_2= 'Lagergeb\\u00E4ude'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_17_in_ruleBuildingTypes529); 

                            current = grammarAccess.getBuildingTypesAccess().getSTOCKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBuildingTypesAccess().getSTOCKEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildingTypes"


    // $ANTLR start "ruleBuildings"
    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:273:1: ruleBuildings returns [Enumerator current=null] : ( (enumLiteral_0= 'Holzf\\u00E4ller' ) | (enumLiteral_1= 'Steinmetz' ) | (enumLiteral_2= 'J\\u00E4ger' ) | (enumLiteral_3= 'Fischerei' ) ) ;
    public final Enumerator ruleBuildings() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:275:28: ( ( (enumLiteral_0= 'Holzf\\u00E4ller' ) | (enumLiteral_1= 'Steinmetz' ) | (enumLiteral_2= 'J\\u00E4ger' ) | (enumLiteral_3= 'Fischerei' ) ) )
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:276:1: ( (enumLiteral_0= 'Holzf\\u00E4ller' ) | (enumLiteral_1= 'Steinmetz' ) | (enumLiteral_2= 'J\\u00E4ger' ) | (enumLiteral_3= 'Fischerei' ) )
            {
            // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:276:1: ( (enumLiteral_0= 'Holzf\\u00E4ller' ) | (enumLiteral_1= 'Steinmetz' ) | (enumLiteral_2= 'J\\u00E4ger' ) | (enumLiteral_3= 'Fischerei' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:276:2: (enumLiteral_0= 'Holzf\\u00E4ller' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:276:2: (enumLiteral_0= 'Holzf\\u00E4ller' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:276:4: enumLiteral_0= 'Holzf\\u00E4ller'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleBuildings574); 

                            current = grammarAccess.getBuildingsAccess().getLUMBERJACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuildingsAccess().getLUMBERJACKEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:282:6: (enumLiteral_1= 'Steinmetz' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:282:6: (enumLiteral_1= 'Steinmetz' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:282:8: enumLiteral_1= 'Steinmetz'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleBuildings591); 

                            current = grammarAccess.getBuildingsAccess().getMASONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuildingsAccess().getMASONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:288:6: (enumLiteral_2= 'J\\u00E4ger' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:288:6: (enumLiteral_2= 'J\\u00E4ger' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:288:8: enumLiteral_2= 'J\\u00E4ger'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_20_in_ruleBuildings608); 

                            current = grammarAccess.getBuildingsAccess().getHUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBuildingsAccess().getHUNTEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:294:6: (enumLiteral_3= 'Fischerei' )
                    {
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:294:6: (enumLiteral_3= 'Fischerei' )
                    // ../ageOfScala/src-gen/de/xtext/mgse/aos/parser/antlr/internal/InternalAgeOfScala.g:294:8: enumLiteral_3= 'Fischerei'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_ruleBuildings625); 

                            current = grammarAccess.getBuildingsAccess().getFISHERMANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBuildingsAccess().getFISHERMANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildings"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShowBuildings_in_ruleAction132 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_ruleBuildBuilding_in_ruleAction151 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_ruleShowBuildings_in_entryRuleShowBuildings190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShowBuildings200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleShowBuildings237 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_ruleBuildingTypes_in_ruleShowBuildings258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildBuilding_in_entryRuleBuildBuilding294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildBuilding304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildType_in_ruleBuildBuilding350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBuildBuilding362 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleBuildings_in_ruleBuildBuilding383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBuildType433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBuildType450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBuildingTypes495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBuildingTypes512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBuildingTypes529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBuildings574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBuildings591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBuildings608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBuildings625 = new BitSet(new long[]{0x0000000000000002L});

}