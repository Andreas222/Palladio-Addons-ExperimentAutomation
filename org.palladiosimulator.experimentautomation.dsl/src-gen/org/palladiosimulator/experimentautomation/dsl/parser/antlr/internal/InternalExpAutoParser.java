package org.palladiosimulator.experimentautomation.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.experimentautomation.dsl.services.ExpAutoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpAutoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datasource'", "':'", "'EDP2'", "'('", "')'", "'experiment'", "'FullFactorial'", "'OneFactor'", "'{'", "'}'", "'description'", "'='", "'initial'", "'PCM'", "'allocation'", "'usageModel'", "'middlewareRepository'", "'eventMiddlewareRepository'", "'monitorRepository'", "'variation'", "'target'", "'maxVariations'", "'values'", "'['", "','", "']'", "'nestedIntervall'", "'setValues'", "'linear'", "'exponential'", "'polynomial'", "'stop'", "'simulationTime'", "'measurementCount'", "'repetitions'", "'seeds'", "'tool'", "';'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalExpAutoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpAutoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpAutoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpAuto.g"; }



     	private ExpAutoGrammarAccess grammarAccess;

        public InternalExpAutoParser(TokenStream input, ExpAutoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ExpAutoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalExpAuto.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExpAuto.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExpAuto.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExpAuto.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_datasources_1_0= ruleDatasource ) )+ ( (lv_experiments_2_0= ruleExperiment ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_datasources_1_0 = null;

        EObject lv_experiments_2_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_datasources_1_0= ruleDatasource ) )+ ( (lv_experiments_2_0= ruleExperiment ) )+ ) )
            // InternalExpAuto.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_datasources_1_0= ruleDatasource ) )+ ( (lv_experiments_2_0= ruleExperiment ) )+ )
            {
            // InternalExpAuto.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_datasources_1_0= ruleDatasource ) )+ ( (lv_experiments_2_0= ruleExperiment ) )+ )
            // InternalExpAuto.g:79:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_datasources_1_0= ruleDatasource ) )+ ( (lv_experiments_2_0= ruleExperiment ) )+
            {
            // InternalExpAuto.g:79:3: ( (lv_imports_0_0= ruleImport ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpAuto.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalExpAuto.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalExpAuto.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalExpAuto.g:98:3: ( (lv_datasources_1_0= ruleDatasource ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpAuto.g:99:4: (lv_datasources_1_0= ruleDatasource )
            	    {
            	    // InternalExpAuto.g:99:4: (lv_datasources_1_0= ruleDatasource )
            	    // InternalExpAuto.g:100:5: lv_datasources_1_0= ruleDatasource
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDatasourcesDatasourceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_datasources_1_0=ruleDatasource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"datasources",
            	    						lv_datasources_1_0,
            	    						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.Datasource");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalExpAuto.g:117:3: ( (lv_experiments_2_0= ruleExperiment ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpAuto.g:118:4: (lv_experiments_2_0= ruleExperiment )
            	    {
            	    // InternalExpAuto.g:118:4: (lv_experiments_2_0= ruleExperiment )
            	    // InternalExpAuto.g:119:5: lv_experiments_2_0= ruleExperiment
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getExperimentsExperimentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_experiments_2_0=ruleExperiment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"experiments",
            	    						lv_experiments_2_0,
            	    						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.Experiment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalExpAuto.g:140:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalExpAuto.g:140:47: (iv_ruleImport= ruleImport EOF )
            // InternalExpAuto.g:141:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalExpAuto.g:147:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:153:2: ( (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:154:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:154:2: (otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalExpAuto.g:155:3: otherlv_0= 'import' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalExpAuto.g:159:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalExpAuto.g:160:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalExpAuto.g:160:4: (lv_path_1_0= RULE_STRING )
            // InternalExpAuto.g:161:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDatasource"
    // InternalExpAuto.g:181:1: entryRuleDatasource returns [EObject current=null] : iv_ruleDatasource= ruleDatasource EOF ;
    public final EObject entryRuleDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasource = null;


        try {
            // InternalExpAuto.g:181:51: (iv_ruleDatasource= ruleDatasource EOF )
            // InternalExpAuto.g:182:2: iv_ruleDatasource= ruleDatasource EOF
            {
             newCompositeNode(grammarAccess.getDatasourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasource=ruleDatasource();

            state._fsp--;

             current =iv_ruleDatasource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDatasource"


    // $ANTLR start "ruleDatasource"
    // InternalExpAuto.g:188:1: ruleDatasource returns [EObject current=null] : (this_FileDatasource_0= ruleFileDatasource | this_MemoryDatasource_1= ruleMemoryDatasource ) ;
    public final EObject ruleDatasource() throws RecognitionException {
        EObject current = null;

        EObject this_FileDatasource_0 = null;

        EObject this_MemoryDatasource_1 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:194:2: ( (this_FileDatasource_0= ruleFileDatasource | this_MemoryDatasource_1= ruleMemoryDatasource ) )
            // InternalExpAuto.g:195:2: (this_FileDatasource_0= ruleFileDatasource | this_MemoryDatasource_1= ruleMemoryDatasource )
            {
            // InternalExpAuto.g:195:2: (this_FileDatasource_0= ruleFileDatasource | this_MemoryDatasource_1= ruleMemoryDatasource )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==13) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==14) ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4==15) ) {
                                alt4=1;
                            }
                            else if ( (LA4_4==EOF||LA4_4==12||LA4_4==17) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpAuto.g:196:3: this_FileDatasource_0= ruleFileDatasource
                    {

                    			newCompositeNode(grammarAccess.getDatasourceAccess().getFileDatasourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileDatasource_0=ruleFileDatasource();

                    state._fsp--;


                    			current = this_FileDatasource_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:205:3: this_MemoryDatasource_1= ruleMemoryDatasource
                    {

                    			newCompositeNode(grammarAccess.getDatasourceAccess().getMemoryDatasourceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoryDatasource_1=ruleMemoryDatasource();

                    state._fsp--;


                    			current = this_MemoryDatasource_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDatasource"


    // $ANTLR start "entryRuleFileDatasource"
    // InternalExpAuto.g:217:1: entryRuleFileDatasource returns [EObject current=null] : iv_ruleFileDatasource= ruleFileDatasource EOF ;
    public final EObject entryRuleFileDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileDatasource = null;


        try {
            // InternalExpAuto.g:217:55: (iv_ruleFileDatasource= ruleFileDatasource EOF )
            // InternalExpAuto.g:218:2: iv_ruleFileDatasource= ruleFileDatasource EOF
            {
             newCompositeNode(grammarAccess.getFileDatasourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileDatasource=ruleFileDatasource();

            state._fsp--;

             current =iv_ruleFileDatasource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileDatasource"


    // $ANTLR start "ruleFileDatasource"
    // InternalExpAuto.g:224:1: ruleFileDatasource returns [EObject current=null] : (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) otherlv_4= '(' ( (lv_sourceURI_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleFileDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_sourceType_3_0=null;
        Token otherlv_4=null;
        Token lv_sourceURI_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalExpAuto.g:230:2: ( (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) otherlv_4= '(' ( (lv_sourceURI_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // InternalExpAuto.g:231:2: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) otherlv_4= '(' ( (lv_sourceURI_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // InternalExpAuto.g:231:2: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) otherlv_4= '(' ( (lv_sourceURI_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // InternalExpAuto.g:232:3: otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) otherlv_4= '(' ( (lv_sourceURI_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFileDatasourceAccess().getDatasourceKeyword_0());
            		
            // InternalExpAuto.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpAuto.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpAuto.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalExpAuto.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFileDatasourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileDatasourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFileDatasourceAccess().getColonKeyword_2());
            		
            // InternalExpAuto.g:258:3: ( (lv_sourceType_3_0= 'EDP2' ) )
            // InternalExpAuto.g:259:4: (lv_sourceType_3_0= 'EDP2' )
            {
            // InternalExpAuto.g:259:4: (lv_sourceType_3_0= 'EDP2' )
            // InternalExpAuto.g:260:5: lv_sourceType_3_0= 'EDP2'
            {
            lv_sourceType_3_0=(Token)match(input,14,FOLLOW_10); 

            					newLeafNode(lv_sourceType_3_0, grammarAccess.getFileDatasourceAccess().getSourceTypeEDP2Keyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileDatasourceRule());
            					}
            					setWithLastConsumed(current, "sourceType", lv_sourceType_3_0, "EDP2");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFileDatasourceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalExpAuto.g:276:3: ( (lv_sourceURI_5_0= RULE_STRING ) )
            // InternalExpAuto.g:277:4: (lv_sourceURI_5_0= RULE_STRING )
            {
            // InternalExpAuto.g:277:4: (lv_sourceURI_5_0= RULE_STRING )
            // InternalExpAuto.g:278:5: lv_sourceURI_5_0= RULE_STRING
            {
            lv_sourceURI_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_sourceURI_5_0, grammarAccess.getFileDatasourceAccess().getSourceURISTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileDatasourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceURI",
            						lv_sourceURI_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFileDatasourceAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleFileDatasource"


    // $ANTLR start "entryRuleMemoryDatasource"
    // InternalExpAuto.g:302:1: entryRuleMemoryDatasource returns [EObject current=null] : iv_ruleMemoryDatasource= ruleMemoryDatasource EOF ;
    public final EObject entryRuleMemoryDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryDatasource = null;


        try {
            // InternalExpAuto.g:302:57: (iv_ruleMemoryDatasource= ruleMemoryDatasource EOF )
            // InternalExpAuto.g:303:2: iv_ruleMemoryDatasource= ruleMemoryDatasource EOF
            {
             newCompositeNode(grammarAccess.getMemoryDatasourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryDatasource=ruleMemoryDatasource();

            state._fsp--;

             current =iv_ruleMemoryDatasource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMemoryDatasource"


    // $ANTLR start "ruleMemoryDatasource"
    // InternalExpAuto.g:309:1: ruleMemoryDatasource returns [EObject current=null] : (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) ) ;
    public final EObject ruleMemoryDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_sourceType_3_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:315:2: ( (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) ) )
            // InternalExpAuto.g:316:2: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) )
            {
            // InternalExpAuto.g:316:2: (otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) ) )
            // InternalExpAuto.g:317:3: otherlv_0= 'datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_sourceType_3_0= 'EDP2' ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMemoryDatasourceAccess().getDatasourceKeyword_0());
            		
            // InternalExpAuto.g:321:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpAuto.g:322:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpAuto.g:322:4: (lv_name_1_0= RULE_ID )
            // InternalExpAuto.g:323:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemoryDatasourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemoryDatasourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMemoryDatasourceAccess().getColonKeyword_2());
            		
            // InternalExpAuto.g:343:3: ( (lv_sourceType_3_0= 'EDP2' ) )
            // InternalExpAuto.g:344:4: (lv_sourceType_3_0= 'EDP2' )
            {
            // InternalExpAuto.g:344:4: (lv_sourceType_3_0= 'EDP2' )
            // InternalExpAuto.g:345:5: lv_sourceType_3_0= 'EDP2'
            {
            lv_sourceType_3_0=(Token)match(input,14,FOLLOW_2); 

            					newLeafNode(lv_sourceType_3_0, grammarAccess.getMemoryDatasourceAccess().getSourceTypeEDP2Keyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemoryDatasourceRule());
            					}
            					setWithLastConsumed(current, "sourceType", lv_sourceType_3_0, "EDP2");
            				

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
    // $ANTLR end "ruleMemoryDatasource"


    // $ANTLR start "entryRuleExperiment"
    // InternalExpAuto.g:361:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalExpAuto.g:361:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalExpAuto.g:362:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalExpAuto.g:368:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) ) otherlv_4= '{' ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) ) otherlv_6= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_design_3_1=null;
        Token lv_design_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_experimentSpecifications_5_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:374:2: ( (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) ) otherlv_4= '{' ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) ) otherlv_6= '}' ) )
            // InternalExpAuto.g:375:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) ) otherlv_4= '{' ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) ) otherlv_6= '}' )
            {
            // InternalExpAuto.g:375:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) ) otherlv_4= '{' ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) ) otherlv_6= '}' )
            // InternalExpAuto.g:376:3: otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) ) otherlv_4= '{' ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
            		
            // InternalExpAuto.g:380:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpAuto.g:381:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpAuto.g:381:4: (lv_name_1_0= RULE_ID )
            // InternalExpAuto.g:382:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getColonKeyword_2());
            		
            // InternalExpAuto.g:402:3: ( ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) ) )
            // InternalExpAuto.g:403:4: ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) )
            {
            // InternalExpAuto.g:403:4: ( (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' ) )
            // InternalExpAuto.g:404:5: (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' )
            {
            // InternalExpAuto.g:404:5: (lv_design_3_1= 'FullFactorial' | lv_design_3_2= 'OneFactor' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpAuto.g:405:6: lv_design_3_1= 'FullFactorial'
                    {
                    lv_design_3_1=(Token)match(input,18,FOLLOW_13); 

                    						newLeafNode(lv_design_3_1, grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentRule());
                    						}
                    						setWithLastConsumed(current, "design", lv_design_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:416:6: lv_design_3_2= 'OneFactor'
                    {
                    lv_design_3_2=(Token)match(input,19,FOLLOW_13); 

                    						newLeafNode(lv_design_3_2, grammarAccess.getExperimentAccess().getDesignOneFactorKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentRule());
                    						}
                    						setWithLastConsumed(current, "design", lv_design_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalExpAuto.g:433:3: ( (lv_experimentSpecifications_5_0= ruleExperimentSpecifications ) )
            // InternalExpAuto.g:434:4: (lv_experimentSpecifications_5_0= ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:434:4: (lv_experimentSpecifications_5_0= ruleExperimentSpecifications )
            // InternalExpAuto.g:435:5: lv_experimentSpecifications_5_0= ruleExperimentSpecifications
            {

            					newCompositeNode(grammarAccess.getExperimentAccess().getExperimentSpecificationsExperimentSpecificationsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_experimentSpecifications_5_0=ruleExperimentSpecifications();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentRule());
            					}
            					set(
            						current,
            						"experimentSpecifications",
            						lv_experimentSpecifications_5_0,
            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ExperimentSpecifications");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleExperimentSpecifications"
    // InternalExpAuto.g:460:1: entryRuleExperimentSpecifications returns [EObject current=null] : iv_ruleExperimentSpecifications= ruleExperimentSpecifications EOF ;
    public final EObject entryRuleExperimentSpecifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentSpecifications = null;


        try {
            // InternalExpAuto.g:460:65: (iv_ruleExperimentSpecifications= ruleExperimentSpecifications EOF )
            // InternalExpAuto.g:461:2: iv_ruleExperimentSpecifications= ruleExperimentSpecifications EOF
            {
             newCompositeNode(grammarAccess.getExperimentSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentSpecifications=ruleExperimentSpecifications();

            state._fsp--;

             current =iv_ruleExperimentSpecifications; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExperimentSpecifications"


    // $ANTLR start "ruleExperimentSpecifications"
    // InternalExpAuto.g:467:1: ruleExperimentSpecifications returns [EObject current=null] : ( ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) ) )+ ;
    public final EObject ruleExperimentSpecifications() throws RecognitionException {
        EObject current = null;

        EObject lv_specifications_0_1 = null;

        EObject lv_specifications_0_2 = null;

        EObject lv_specifications_0_3 = null;

        EObject lv_specifications_0_4 = null;

        EObject lv_specifications_0_5 = null;

        EObject lv_specifications_0_6 = null;

        EObject lv_specifications_0_7 = null;

        EObject lv_specifications_0_8 = null;

        EObject lv_specifications_0_9 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:473:2: ( ( ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) ) )+ )
            // InternalExpAuto.g:474:2: ( ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) ) )+
            {
            // InternalExpAuto.g:474:2: ( ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||LA7_0==22||LA7_0==24||LA7_0==31||LA7_0==43||(LA7_0>=46 && LA7_0<=48)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExpAuto.g:475:3: ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) )
            	    {
            	    // InternalExpAuto.g:475:3: ( (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition ) )
            	    // InternalExpAuto.g:476:4: (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition )
            	    {
            	    // InternalExpAuto.g:476:4: (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition )
            	    int alt6=9;
            	    alt6 = dfa6.predict(input);
            	    switch (alt6) {
            	        case 1 :
            	            // InternalExpAuto.g:477:5: lv_specifications_0_1= ruleDescription
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsDescriptionParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_1=ruleDescription();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_1,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.Description");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalExpAuto.g:493:5: lv_specifications_0_2= ruleInitialModel
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsInitialModelParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_2=ruleInitialModel();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_2,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.InitialModel");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalExpAuto.g:509:5: lv_specifications_0_3= ruleVariation
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsVariationParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_3=ruleVariation();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_3,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.Variation");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalExpAuto.g:525:5: lv_specifications_0_4= ruleStopTimeCondition
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopTimeConditionParserRuleCall_0_3());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_4=ruleStopTimeCondition();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_4,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.StopTimeCondition");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalExpAuto.g:541:5: lv_specifications_0_5= ruleStopCountCondition
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopCountConditionParserRuleCall_0_4());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_5=ruleStopCountCondition();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_5,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.StopCountCondition");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 6 :
            	            // InternalExpAuto.g:557:5: lv_specifications_0_6= ruleNumberOfExperiments
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsNumberOfExperimentsParserRuleCall_0_5());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_6=ruleNumberOfExperiments();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_6,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.NumberOfExperiments");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 7 :
            	            // InternalExpAuto.g:573:5: lv_specifications_0_7= ruleSeedDefinition
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsSeedDefinitionParserRuleCall_0_6());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_7=ruleSeedDefinition();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_7,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.SeedDefinition");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 8 :
            	            // InternalExpAuto.g:589:5: lv_specifications_0_8= ruleExperimentDatasource
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsExperimentDatasourceParserRuleCall_0_7());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_8=ruleExperimentDatasource();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_8,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ExperimentDatasource");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 9 :
            	            // InternalExpAuto.g:605:5: lv_specifications_0_9= ruleToolDefinition
            	            {

            	            					newCompositeNode(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_8());
            	            				
            	            pushFollow(FOLLOW_16);
            	            lv_specifications_0_9=ruleToolDefinition();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getExperimentSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_9,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ToolDefinition");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleExperimentSpecifications"


    // $ANTLR start "entryRuleDescription"
    // InternalExpAuto.g:626:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalExpAuto.g:626:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalExpAuto.g:627:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalExpAuto.g:633:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:639:2: ( (otherlv_0= 'description' otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:640:2: (otherlv_0= 'description' otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:640:2: (otherlv_0= 'description' otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:641:3: otherlv_0= 'description' otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:649:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalExpAuto.g:650:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:650:4: (lv_description_2_0= RULE_STRING )
            // InternalExpAuto.g:651:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_2_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleInitialModel"
    // InternalExpAuto.g:671:1: entryRuleInitialModel returns [EObject current=null] : iv_ruleInitialModel= ruleInitialModel EOF ;
    public final EObject entryRuleInitialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialModel = null;


        try {
            // InternalExpAuto.g:671:53: (iv_ruleInitialModel= ruleInitialModel EOF )
            // InternalExpAuto.g:672:2: iv_ruleInitialModel= ruleInitialModel EOF
            {
             newCompositeNode(grammarAccess.getInitialModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialModel=ruleInitialModel();

            state._fsp--;

             current =iv_ruleInitialModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialModel"


    // $ANTLR start "ruleInitialModel"
    // InternalExpAuto.g:678:1: ruleInitialModel returns [EObject current=null] : (otherlv_0= 'initial' otherlv_1= '=' ( (lv_modeltyp_2_0= 'PCM' ) ) otherlv_3= '{' ( (lv_initSpecifications_4_0= ruleInitSpecifications ) ) otherlv_5= '}' ) ;
    public final EObject ruleInitialModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_modeltyp_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initSpecifications_4_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:684:2: ( (otherlv_0= 'initial' otherlv_1= '=' ( (lv_modeltyp_2_0= 'PCM' ) ) otherlv_3= '{' ( (lv_initSpecifications_4_0= ruleInitSpecifications ) ) otherlv_5= '}' ) )
            // InternalExpAuto.g:685:2: (otherlv_0= 'initial' otherlv_1= '=' ( (lv_modeltyp_2_0= 'PCM' ) ) otherlv_3= '{' ( (lv_initSpecifications_4_0= ruleInitSpecifications ) ) otherlv_5= '}' )
            {
            // InternalExpAuto.g:685:2: (otherlv_0= 'initial' otherlv_1= '=' ( (lv_modeltyp_2_0= 'PCM' ) ) otherlv_3= '{' ( (lv_initSpecifications_4_0= ruleInitSpecifications ) ) otherlv_5= '}' )
            // InternalExpAuto.g:686:3: otherlv_0= 'initial' otherlv_1= '=' ( (lv_modeltyp_2_0= 'PCM' ) ) otherlv_3= '{' ( (lv_initSpecifications_4_0= ruleInitSpecifications ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialModelAccess().getInitialKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialModelAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:694:3: ( (lv_modeltyp_2_0= 'PCM' ) )
            // InternalExpAuto.g:695:4: (lv_modeltyp_2_0= 'PCM' )
            {
            // InternalExpAuto.g:695:4: (lv_modeltyp_2_0= 'PCM' )
            // InternalExpAuto.g:696:5: lv_modeltyp_2_0= 'PCM'
            {
            lv_modeltyp_2_0=(Token)match(input,25,FOLLOW_13); 

            					newLeafNode(lv_modeltyp_2_0, grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialModelRule());
            					}
            					setWithLastConsumed(current, "modeltyp", lv_modeltyp_2_0, "PCM");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalExpAuto.g:712:3: ( (lv_initSpecifications_4_0= ruleInitSpecifications ) )
            // InternalExpAuto.g:713:4: (lv_initSpecifications_4_0= ruleInitSpecifications )
            {
            // InternalExpAuto.g:713:4: (lv_initSpecifications_4_0= ruleInitSpecifications )
            // InternalExpAuto.g:714:5: lv_initSpecifications_4_0= ruleInitSpecifications
            {

            					newCompositeNode(grammarAccess.getInitialModelAccess().getInitSpecificationsInitSpecificationsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_initSpecifications_4_0=ruleInitSpecifications();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialModelRule());
            					}
            					set(
            						current,
            						"initSpecifications",
            						lv_initSpecifications_4_0,
            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.InitSpecifications");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInitialModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInitialModel"


    // $ANTLR start "entryRuleInitSpecifications"
    // InternalExpAuto.g:739:1: entryRuleInitSpecifications returns [EObject current=null] : iv_ruleInitSpecifications= ruleInitSpecifications EOF ;
    public final EObject entryRuleInitSpecifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSpecifications = null;


        try {
            // InternalExpAuto.g:739:59: (iv_ruleInitSpecifications= ruleInitSpecifications EOF )
            // InternalExpAuto.g:740:2: iv_ruleInitSpecifications= ruleInitSpecifications EOF
            {
             newCompositeNode(grammarAccess.getInitSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitSpecifications=ruleInitSpecifications();

            state._fsp--;

             current =iv_ruleInitSpecifications; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitSpecifications"


    // $ANTLR start "ruleInitSpecifications"
    // InternalExpAuto.g:746:1: ruleInitSpecifications returns [EObject current=null] : ( ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) ) )+ ;
    public final EObject ruleInitSpecifications() throws RecognitionException {
        EObject current = null;

        EObject lv_specifications_0_1 = null;

        EObject lv_specifications_0_2 = null;

        EObject lv_specifications_0_3 = null;

        EObject lv_specifications_0_4 = null;

        EObject lv_specifications_0_5 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:752:2: ( ( ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) ) )+ )
            // InternalExpAuto.g:753:2: ( ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) ) )+
            {
            // InternalExpAuto.g:753:2: ( ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=26 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExpAuto.g:754:3: ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) )
            	    {
            	    // InternalExpAuto.g:754:3: ( (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository ) )
            	    // InternalExpAuto.g:755:4: (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository )
            	    {
            	    // InternalExpAuto.g:755:4: (lv_specifications_0_1= ruleAllocationModel | lv_specifications_0_2= ruleUsageModel | lv_specifications_0_3= ruleMiddlewareRepository | lv_specifications_0_4= ruleEventMiddlewareRepository | lv_specifications_0_5= ruleMonitorRepository )
            	    int alt8=5;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // InternalExpAuto.g:756:5: lv_specifications_0_1= ruleAllocationModel
            	            {

            	            					newCompositeNode(grammarAccess.getInitSpecificationsAccess().getSpecificationsAllocationModelParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_20);
            	            lv_specifications_0_1=ruleAllocationModel();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getInitSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_1,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.AllocationModel");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalExpAuto.g:772:5: lv_specifications_0_2= ruleUsageModel
            	            {

            	            					newCompositeNode(grammarAccess.getInitSpecificationsAccess().getSpecificationsUsageModelParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_20);
            	            lv_specifications_0_2=ruleUsageModel();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getInitSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_2,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.UsageModel");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalExpAuto.g:788:5: lv_specifications_0_3= ruleMiddlewareRepository
            	            {

            	            					newCompositeNode(grammarAccess.getInitSpecificationsAccess().getSpecificationsMiddlewareRepositoryParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_20);
            	            lv_specifications_0_3=ruleMiddlewareRepository();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getInitSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_3,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.MiddlewareRepository");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalExpAuto.g:804:5: lv_specifications_0_4= ruleEventMiddlewareRepository
            	            {

            	            					newCompositeNode(grammarAccess.getInitSpecificationsAccess().getSpecificationsEventMiddlewareRepositoryParserRuleCall_0_3());
            	            				
            	            pushFollow(FOLLOW_20);
            	            lv_specifications_0_4=ruleEventMiddlewareRepository();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getInitSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_4,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.EventMiddlewareRepository");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalExpAuto.g:820:5: lv_specifications_0_5= ruleMonitorRepository
            	            {

            	            					newCompositeNode(grammarAccess.getInitSpecificationsAccess().getSpecificationsMonitorRepositoryParserRuleCall_0_4());
            	            				
            	            pushFollow(FOLLOW_20);
            	            lv_specifications_0_5=ruleMonitorRepository();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getInitSpecificationsRule());
            	            					}
            	            					add(
            	            						current,
            	            						"specifications",
            	            						lv_specifications_0_5,
            	            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.MonitorRepository");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ruleInitSpecifications"


    // $ANTLR start "entryRuleAllocationModel"
    // InternalExpAuto.g:841:1: entryRuleAllocationModel returns [EObject current=null] : iv_ruleAllocationModel= ruleAllocationModel EOF ;
    public final EObject entryRuleAllocationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationModel = null;


        try {
            // InternalExpAuto.g:841:56: (iv_ruleAllocationModel= ruleAllocationModel EOF )
            // InternalExpAuto.g:842:2: iv_ruleAllocationModel= ruleAllocationModel EOF
            {
             newCompositeNode(grammarAccess.getAllocationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationModel=ruleAllocationModel();

            state._fsp--;

             current =iv_ruleAllocationModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllocationModel"


    // $ANTLR start "ruleAllocationModel"
    // InternalExpAuto.g:848:1: ruleAllocationModel returns [EObject current=null] : (otherlv_0= 'allocation' otherlv_1= '=' ( (lv_allocation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAllocationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_allocation_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:854:2: ( (otherlv_0= 'allocation' otherlv_1= '=' ( (lv_allocation_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:855:2: (otherlv_0= 'allocation' otherlv_1= '=' ( (lv_allocation_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:855:2: (otherlv_0= 'allocation' otherlv_1= '=' ( (lv_allocation_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:856:3: otherlv_0= 'allocation' otherlv_1= '=' ( (lv_allocation_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationModelAccess().getAllocationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationModelAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:864:3: ( (lv_allocation_2_0= RULE_STRING ) )
            // InternalExpAuto.g:865:4: (lv_allocation_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:865:4: (lv_allocation_2_0= RULE_STRING )
            // InternalExpAuto.g:866:5: lv_allocation_2_0= RULE_STRING
            {
            lv_allocation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_allocation_2_0, grammarAccess.getAllocationModelAccess().getAllocationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"allocation",
            						lv_allocation_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAllocationModel"


    // $ANTLR start "entryRuleUsageModel"
    // InternalExpAuto.g:886:1: entryRuleUsageModel returns [EObject current=null] : iv_ruleUsageModel= ruleUsageModel EOF ;
    public final EObject entryRuleUsageModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageModel = null;


        try {
            // InternalExpAuto.g:886:51: (iv_ruleUsageModel= ruleUsageModel EOF )
            // InternalExpAuto.g:887:2: iv_ruleUsageModel= ruleUsageModel EOF
            {
             newCompositeNode(grammarAccess.getUsageModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsageModel=ruleUsageModel();

            state._fsp--;

             current =iv_ruleUsageModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUsageModel"


    // $ANTLR start "ruleUsageModel"
    // InternalExpAuto.g:893:1: ruleUsageModel returns [EObject current=null] : (otherlv_0= 'usageModel' otherlv_1= '=' ( (lv_usageModel_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUsageModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_usageModel_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:899:2: ( (otherlv_0= 'usageModel' otherlv_1= '=' ( (lv_usageModel_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:900:2: (otherlv_0= 'usageModel' otherlv_1= '=' ( (lv_usageModel_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:900:2: (otherlv_0= 'usageModel' otherlv_1= '=' ( (lv_usageModel_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:901:3: otherlv_0= 'usageModel' otherlv_1= '=' ( (lv_usageModel_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getUsageModelAccess().getUsageModelKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUsageModelAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:909:3: ( (lv_usageModel_2_0= RULE_STRING ) )
            // InternalExpAuto.g:910:4: (lv_usageModel_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:910:4: (lv_usageModel_2_0= RULE_STRING )
            // InternalExpAuto.g:911:5: lv_usageModel_2_0= RULE_STRING
            {
            lv_usageModel_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_usageModel_2_0, grammarAccess.getUsageModelAccess().getUsageModelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsageModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"usageModel",
            						lv_usageModel_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUsageModel"


    // $ANTLR start "entryRuleMiddlewareRepository"
    // InternalExpAuto.g:931:1: entryRuleMiddlewareRepository returns [EObject current=null] : iv_ruleMiddlewareRepository= ruleMiddlewareRepository EOF ;
    public final EObject entryRuleMiddlewareRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddlewareRepository = null;


        try {
            // InternalExpAuto.g:931:61: (iv_ruleMiddlewareRepository= ruleMiddlewareRepository EOF )
            // InternalExpAuto.g:932:2: iv_ruleMiddlewareRepository= ruleMiddlewareRepository EOF
            {
             newCompositeNode(grammarAccess.getMiddlewareRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiddlewareRepository=ruleMiddlewareRepository();

            state._fsp--;

             current =iv_ruleMiddlewareRepository; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMiddlewareRepository"


    // $ANTLR start "ruleMiddlewareRepository"
    // InternalExpAuto.g:938:1: ruleMiddlewareRepository returns [EObject current=null] : (otherlv_0= 'middlewareRepository' otherlv_1= '=' ( (lv_middlewareRepository_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMiddlewareRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_middlewareRepository_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:944:2: ( (otherlv_0= 'middlewareRepository' otherlv_1= '=' ( (lv_middlewareRepository_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:945:2: (otherlv_0= 'middlewareRepository' otherlv_1= '=' ( (lv_middlewareRepository_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:945:2: (otherlv_0= 'middlewareRepository' otherlv_1= '=' ( (lv_middlewareRepository_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:946:3: otherlv_0= 'middlewareRepository' otherlv_1= '=' ( (lv_middlewareRepository_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddlewareRepositoryAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:954:3: ( (lv_middlewareRepository_2_0= RULE_STRING ) )
            // InternalExpAuto.g:955:4: (lv_middlewareRepository_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:955:4: (lv_middlewareRepository_2_0= RULE_STRING )
            // InternalExpAuto.g:956:5: lv_middlewareRepository_2_0= RULE_STRING
            {
            lv_middlewareRepository_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_middlewareRepository_2_0, grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositorySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMiddlewareRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"middlewareRepository",
            						lv_middlewareRepository_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMiddlewareRepository"


    // $ANTLR start "entryRuleEventMiddlewareRepository"
    // InternalExpAuto.g:976:1: entryRuleEventMiddlewareRepository returns [EObject current=null] : iv_ruleEventMiddlewareRepository= ruleEventMiddlewareRepository EOF ;
    public final EObject entryRuleEventMiddlewareRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventMiddlewareRepository = null;


        try {
            // InternalExpAuto.g:976:66: (iv_ruleEventMiddlewareRepository= ruleEventMiddlewareRepository EOF )
            // InternalExpAuto.g:977:2: iv_ruleEventMiddlewareRepository= ruleEventMiddlewareRepository EOF
            {
             newCompositeNode(grammarAccess.getEventMiddlewareRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventMiddlewareRepository=ruleEventMiddlewareRepository();

            state._fsp--;

             current =iv_ruleEventMiddlewareRepository; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventMiddlewareRepository"


    // $ANTLR start "ruleEventMiddlewareRepository"
    // InternalExpAuto.g:983:1: ruleEventMiddlewareRepository returns [EObject current=null] : (otherlv_0= 'eventMiddlewareRepository' otherlv_1= '=' ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventMiddlewareRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eventMiddelwareRepository_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:989:2: ( (otherlv_0= 'eventMiddlewareRepository' otherlv_1= '=' ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:990:2: (otherlv_0= 'eventMiddlewareRepository' otherlv_1= '=' ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:990:2: (otherlv_0= 'eventMiddlewareRepository' otherlv_1= '=' ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:991:3: otherlv_0= 'eventMiddlewareRepository' otherlv_1= '=' ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddlewareRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEventMiddlewareRepositoryAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:999:3: ( (lv_eventMiddelwareRepository_2_0= RULE_STRING ) )
            // InternalExpAuto.g:1000:4: (lv_eventMiddelwareRepository_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:1000:4: (lv_eventMiddelwareRepository_2_0= RULE_STRING )
            // InternalExpAuto.g:1001:5: lv_eventMiddelwareRepository_2_0= RULE_STRING
            {
            lv_eventMiddelwareRepository_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_eventMiddelwareRepository_2_0, grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositorySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventMiddlewareRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventMiddelwareRepository",
            						lv_eventMiddelwareRepository_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleEventMiddlewareRepository"


    // $ANTLR start "entryRuleMonitorRepository"
    // InternalExpAuto.g:1021:1: entryRuleMonitorRepository returns [EObject current=null] : iv_ruleMonitorRepository= ruleMonitorRepository EOF ;
    public final EObject entryRuleMonitorRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorRepository = null;


        try {
            // InternalExpAuto.g:1021:58: (iv_ruleMonitorRepository= ruleMonitorRepository EOF )
            // InternalExpAuto.g:1022:2: iv_ruleMonitorRepository= ruleMonitorRepository EOF
            {
             newCompositeNode(grammarAccess.getMonitorRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorRepository=ruleMonitorRepository();

            state._fsp--;

             current =iv_ruleMonitorRepository; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitorRepository"


    // $ANTLR start "ruleMonitorRepository"
    // InternalExpAuto.g:1028:1: ruleMonitorRepository returns [EObject current=null] : (otherlv_0= 'monitorRepository' otherlv_1= '=' ( (lv_monitorRepository_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMonitorRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_monitorRepository_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1034:2: ( (otherlv_0= 'monitorRepository' otherlv_1= '=' ( (lv_monitorRepository_2_0= RULE_STRING ) ) ) )
            // InternalExpAuto.g:1035:2: (otherlv_0= 'monitorRepository' otherlv_1= '=' ( (lv_monitorRepository_2_0= RULE_STRING ) ) )
            {
            // InternalExpAuto.g:1035:2: (otherlv_0= 'monitorRepository' otherlv_1= '=' ( (lv_monitorRepository_2_0= RULE_STRING ) ) )
            // InternalExpAuto.g:1036:3: otherlv_0= 'monitorRepository' otherlv_1= '=' ( (lv_monitorRepository_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitorRepositoryAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:1044:3: ( (lv_monitorRepository_2_0= RULE_STRING ) )
            // InternalExpAuto.g:1045:4: (lv_monitorRepository_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:1045:4: (lv_monitorRepository_2_0= RULE_STRING )
            // InternalExpAuto.g:1046:5: lv_monitorRepository_2_0= RULE_STRING
            {
            lv_monitorRepository_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_monitorRepository_2_0, grammarAccess.getMonitorRepositoryAccess().getMonitorRepositorySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"monitorRepository",
            						lv_monitorRepository_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMonitorRepository"


    // $ANTLR start "entryRuleVariation"
    // InternalExpAuto.g:1066:1: entryRuleVariation returns [EObject current=null] : iv_ruleVariation= ruleVariation EOF ;
    public final EObject entryRuleVariation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariation = null;


        try {
            // InternalExpAuto.g:1066:50: (iv_ruleVariation= ruleVariation EOF )
            // InternalExpAuto.g:1067:2: iv_ruleVariation= ruleVariation EOF
            {
             newCompositeNode(grammarAccess.getVariationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariation=ruleVariation();

            state._fsp--;

             current =iv_ruleVariation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariation"


    // $ANTLR start "ruleVariation"
    // InternalExpAuto.g:1073:1: ruleVariation returns [EObject current=null] : (otherlv_0= 'variation' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'maxVariations' otherlv_9= '=' ( (lv_maxVariations_10_0= RULE_INT ) ) otherlv_11= 'values' otherlv_12= '=' ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleVariation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_maxVariations_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_valueProvider_13_1 = null;

        EObject lv_valueProvider_13_2 = null;

        EObject lv_valueProvider_13_3 = null;

        EObject lv_valueProvider_13_4 = null;

        EObject lv_valueProvider_13_5 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:1079:2: ( (otherlv_0= 'variation' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'maxVariations' otherlv_9= '=' ( (lv_maxVariations_10_0= RULE_INT ) ) otherlv_11= 'values' otherlv_12= '=' ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) ) otherlv_14= '}' ) )
            // InternalExpAuto.g:1080:2: (otherlv_0= 'variation' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'maxVariations' otherlv_9= '=' ( (lv_maxVariations_10_0= RULE_INT ) ) otherlv_11= 'values' otherlv_12= '=' ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) ) otherlv_14= '}' )
            {
            // InternalExpAuto.g:1080:2: (otherlv_0= 'variation' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'maxVariations' otherlv_9= '=' ( (lv_maxVariations_10_0= RULE_INT ) ) otherlv_11= 'values' otherlv_12= '=' ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) ) otherlv_14= '}' )
            // InternalExpAuto.g:1081:3: otherlv_0= 'variation' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'maxVariations' otherlv_9= '=' ( (lv_maxVariations_10_0= RULE_INT ) ) otherlv_11= 'values' otherlv_12= '=' ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getVariationAccess().getVariationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVariationAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:1089:3: ( (otherlv_2= RULE_ID ) )
            // InternalExpAuto.g:1090:4: (otherlv_2= RULE_ID )
            {
            // InternalExpAuto.g:1090:4: (otherlv_2= RULE_ID )
            // InternalExpAuto.g:1091:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_2, grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0());
            				

            }


            }

            // InternalExpAuto.g:1102:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExpAuto.g:1103:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExpAuto.g:1103:4: (lv_name_3_0= RULE_ID )
            // InternalExpAuto.g:1104:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getVariationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getVariationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getVariationAccess().getTargetKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getVariationAccess().getEqualsSignKeyword_6());
            		
            // InternalExpAuto.g:1132:3: ( (otherlv_7= RULE_ID ) )
            // InternalExpAuto.g:1133:4: (otherlv_7= RULE_ID )
            {
            // InternalExpAuto.g:1133:4: (otherlv_7= RULE_ID )
            // InternalExpAuto.g:1134:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_7, grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getVariationAccess().getMaxVariationsKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getVariationAccess().getEqualsSignKeyword_9());
            		
            // InternalExpAuto.g:1153:3: ( (lv_maxVariations_10_0= RULE_INT ) )
            // InternalExpAuto.g:1154:4: (lv_maxVariations_10_0= RULE_INT )
            {
            // InternalExpAuto.g:1154:4: (lv_maxVariations_10_0= RULE_INT )
            // InternalExpAuto.g:1155:5: lv_maxVariations_10_0= RULE_INT
            {
            lv_maxVariations_10_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_maxVariations_10_0, grammarAccess.getVariationAccess().getMaxVariationsINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxVariations",
            						lv_maxVariations_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getVariationAccess().getValuesKeyword_11());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_12, grammarAccess.getVariationAccess().getEqualsSignKeyword_12());
            		
            // InternalExpAuto.g:1179:3: ( ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) ) )
            // InternalExpAuto.g:1180:4: ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) )
            {
            // InternalExpAuto.g:1180:4: ( (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider ) )
            // InternalExpAuto.g:1181:5: (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider )
            {
            // InternalExpAuto.g:1181:5: (lv_valueProvider_13_1= ruleNestedIntervalsValueProvider | lv_valueProvider_13_2= ruleSetValueProvider | lv_valueProvider_13_3= ruleLinearValueProvider | lv_valueProvider_13_4= ruleExponentialValueProvider | lv_valueProvider_13_5= rulePolynomialValueProvider )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 35:
            case 38:
                {
                alt10=1;
                }
                break;
            case 20:
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            case 41:
                {
                alt10=4;
                }
                break;
            case 42:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalExpAuto.g:1182:6: lv_valueProvider_13_1= ruleNestedIntervalsValueProvider
                    {

                    						newCompositeNode(grammarAccess.getVariationAccess().getValueProviderNestedIntervalsValueProviderParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_valueProvider_13_1=ruleNestedIntervalsValueProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariationRule());
                    						}
                    						set(
                    							current,
                    							"valueProvider",
                    							lv_valueProvider_13_1,
                    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.NestedIntervalsValueProvider");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1198:6: lv_valueProvider_13_2= ruleSetValueProvider
                    {

                    						newCompositeNode(grammarAccess.getVariationAccess().getValueProviderSetValueProviderParserRuleCall_13_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_valueProvider_13_2=ruleSetValueProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariationRule());
                    						}
                    						set(
                    							current,
                    							"valueProvider",
                    							lv_valueProvider_13_2,
                    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.SetValueProvider");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalExpAuto.g:1214:6: lv_valueProvider_13_3= ruleLinearValueProvider
                    {

                    						newCompositeNode(grammarAccess.getVariationAccess().getValueProviderLinearValueProviderParserRuleCall_13_0_2());
                    					
                    pushFollow(FOLLOW_15);
                    lv_valueProvider_13_3=ruleLinearValueProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariationRule());
                    						}
                    						set(
                    							current,
                    							"valueProvider",
                    							lv_valueProvider_13_3,
                    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.LinearValueProvider");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalExpAuto.g:1230:6: lv_valueProvider_13_4= ruleExponentialValueProvider
                    {

                    						newCompositeNode(grammarAccess.getVariationAccess().getValueProviderExponentialValueProviderParserRuleCall_13_0_3());
                    					
                    pushFollow(FOLLOW_15);
                    lv_valueProvider_13_4=ruleExponentialValueProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariationRule());
                    						}
                    						set(
                    							current,
                    							"valueProvider",
                    							lv_valueProvider_13_4,
                    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ExponentialValueProvider");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalExpAuto.g:1246:6: lv_valueProvider_13_5= rulePolynomialValueProvider
                    {

                    						newCompositeNode(grammarAccess.getVariationAccess().getValueProviderPolynomialValueProviderParserRuleCall_13_0_4());
                    					
                    pushFollow(FOLLOW_15);
                    lv_valueProvider_13_5=rulePolynomialValueProvider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariationRule());
                    						}
                    						set(
                    							current,
                    							"valueProvider",
                    							lv_valueProvider_13_5,
                    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.PolynomialValueProvider");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getVariationAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleVariation"


    // $ANTLR start "entryRuleNestedIntervalsValueProvider"
    // InternalExpAuto.g:1272:1: entryRuleNestedIntervalsValueProvider returns [EObject current=null] : iv_ruleNestedIntervalsValueProvider= ruleNestedIntervalsValueProvider EOF ;
    public final EObject entryRuleNestedIntervalsValueProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedIntervalsValueProvider = null;


        try {
            // InternalExpAuto.g:1272:69: (iv_ruleNestedIntervalsValueProvider= ruleNestedIntervalsValueProvider EOF )
            // InternalExpAuto.g:1273:2: iv_ruleNestedIntervalsValueProvider= ruleNestedIntervalsValueProvider EOF
            {
             newCompositeNode(grammarAccess.getNestedIntervalsValueProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedIntervalsValueProvider=ruleNestedIntervalsValueProvider();

            state._fsp--;

             current =iv_ruleNestedIntervalsValueProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedIntervalsValueProvider"


    // $ANTLR start "ruleNestedIntervalsValueProvider"
    // InternalExpAuto.g:1279:1: ruleNestedIntervalsValueProvider returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) | (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' ) ) ;
    public final EObject ruleNestedIntervalsValueProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_min_7_0=null;
        Token otherlv_8=null;
        Token lv_max_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1285:2: ( ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) | (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' ) ) )
            // InternalExpAuto.g:1286:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) | (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' ) )
            {
            // InternalExpAuto.g:1286:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) | (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpAuto.g:1287:3: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
                    {
                    // InternalExpAuto.g:1287:3: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
                    // InternalExpAuto.g:1288:4: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getNestedIntervalsValueProviderAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalExpAuto.g:1292:4: ( (lv_min_1_0= RULE_INT ) )
                    // InternalExpAuto.g:1293:5: (lv_min_1_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1293:5: (lv_min_1_0= RULE_INT )
                    // InternalExpAuto.g:1294:6: lv_min_1_0= RULE_INT
                    {
                    lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_min_1_0, grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedIntervalsValueProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_0_2());
                    			
                    // InternalExpAuto.g:1314:4: ( (lv_max_3_0= RULE_INT ) )
                    // InternalExpAuto.g:1315:5: (lv_max_3_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1315:5: (lv_max_3_0= RULE_INT )
                    // InternalExpAuto.g:1316:6: lv_max_3_0= RULE_INT
                    {
                    lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_max_3_0, grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedIntervalsValueProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getNestedIntervalsValueProviderAccess().getRightSquareBracketKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1338:3: (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' )
                    {
                    // InternalExpAuto.g:1338:3: (otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')' )
                    // InternalExpAuto.g:1339:4: otherlv_5= 'nestedIntervall' otherlv_6= '(' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_max_9_0= RULE_INT ) ) otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getNestedIntervalsValueProviderAccess().getNestedIntervallKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getNestedIntervalsValueProviderAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalExpAuto.g:1347:4: ( (lv_min_7_0= RULE_INT ) )
                    // InternalExpAuto.g:1348:5: (lv_min_7_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1348:5: (lv_min_7_0= RULE_INT )
                    // InternalExpAuto.g:1349:6: lv_min_7_0= RULE_INT
                    {
                    lv_min_7_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_min_7_0, grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedIntervalsValueProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_1_3());
                    			
                    // InternalExpAuto.g:1369:4: ( (lv_max_9_0= RULE_INT ) )
                    // InternalExpAuto.g:1370:5: (lv_max_9_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1370:5: (lv_max_9_0= RULE_INT )
                    // InternalExpAuto.g:1371:6: lv_max_9_0= RULE_INT
                    {
                    lv_max_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_max_9_0, grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestedIntervalsValueProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getNestedIntervalsValueProviderAccess().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "ruleNestedIntervalsValueProvider"


    // $ANTLR start "entryRuleSetValueProvider"
    // InternalExpAuto.g:1396:1: entryRuleSetValueProvider returns [EObject current=null] : iv_ruleSetValueProvider= ruleSetValueProvider EOF ;
    public final EObject entryRuleSetValueProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetValueProvider = null;


        try {
            // InternalExpAuto.g:1396:57: (iv_ruleSetValueProvider= ruleSetValueProvider EOF )
            // InternalExpAuto.g:1397:2: iv_ruleSetValueProvider= ruleSetValueProvider EOF
            {
             newCompositeNode(grammarAccess.getSetValueProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetValueProvider=ruleSetValueProvider();

            state._fsp--;

             current =iv_ruleSetValueProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetValueProvider"


    // $ANTLR start "ruleSetValueProvider"
    // InternalExpAuto.g:1403:1: ruleSetValueProvider returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' ) | (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' ) ) ;
    public final EObject ruleSetValueProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        Token otherlv_8=null;
        Token lv_values_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1409:2: ( ( (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' ) | (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' ) ) )
            // InternalExpAuto.g:1410:2: ( (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' ) | (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' ) )
            {
            // InternalExpAuto.g:1410:2: ( (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' ) | (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalExpAuto.g:1411:3: (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' )
                    {
                    // InternalExpAuto.g:1411:3: (otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}' )
                    // InternalExpAuto.g:1412:4: otherlv_0= '{' ( (lv_values_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )* otherlv_4= '}'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getSetValueProviderAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    // InternalExpAuto.g:1416:4: ( (lv_values_1_0= RULE_INT ) )
                    // InternalExpAuto.g:1417:5: (lv_values_1_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1417:5: (lv_values_1_0= RULE_INT )
                    // InternalExpAuto.g:1418:6: lv_values_1_0= RULE_INT
                    {
                    lv_values_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_values_1_0, grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetValueProviderRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalExpAuto.g:1434:4: (otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==36) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalExpAuto.g:1435:5: otherlv_2= ',' ( (lv_values_3_0= RULE_INT ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_23); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getSetValueProviderAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalExpAuto.g:1439:5: ( (lv_values_3_0= RULE_INT ) )
                    	    // InternalExpAuto.g:1440:6: (lv_values_3_0= RULE_INT )
                    	    {
                    	    // InternalExpAuto.g:1440:6: (lv_values_3_0= RULE_INT )
                    	    // InternalExpAuto.g:1441:7: lv_values_3_0= RULE_INT
                    	    {
                    	    lv_values_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    	    							newLeafNode(lv_values_3_0, grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSetValueProviderRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_3_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSetValueProviderAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1464:3: (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' )
                    {
                    // InternalExpAuto.g:1464:3: (otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')' )
                    // InternalExpAuto.g:1465:4: otherlv_5= 'setValues' otherlv_6= '(' ( (lv_values_7_0= RULE_INT ) ) (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetValueProviderAccess().getSetValuesKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getSetValueProviderAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalExpAuto.g:1473:4: ( (lv_values_7_0= RULE_INT ) )
                    // InternalExpAuto.g:1474:5: (lv_values_7_0= RULE_INT )
                    {
                    // InternalExpAuto.g:1474:5: (lv_values_7_0= RULE_INT )
                    // InternalExpAuto.g:1475:6: lv_values_7_0= RULE_INT
                    {
                    lv_values_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_values_7_0, grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetValueProviderRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalExpAuto.g:1491:4: (otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==36) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalExpAuto.g:1492:5: otherlv_8= ',' ( (lv_values_9_0= RULE_INT ) )
                    	    {
                    	    otherlv_8=(Token)match(input,36,FOLLOW_23); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSetValueProviderAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalExpAuto.g:1496:5: ( (lv_values_9_0= RULE_INT ) )
                    	    // InternalExpAuto.g:1497:6: (lv_values_9_0= RULE_INT )
                    	    {
                    	    // InternalExpAuto.g:1497:6: (lv_values_9_0= RULE_INT )
                    	    // InternalExpAuto.g:1498:7: lv_values_9_0= RULE_INT
                    	    {
                    	    lv_values_9_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    	    							newLeafNode(lv_values_9_0, grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSetValueProviderRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_9_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getSetValueProviderAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSetValueProvider"


    // $ANTLR start "entryRuleLinearValueProvider"
    // InternalExpAuto.g:1524:1: entryRuleLinearValueProvider returns [EObject current=null] : iv_ruleLinearValueProvider= ruleLinearValueProvider EOF ;
    public final EObject entryRuleLinearValueProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearValueProvider = null;


        try {
            // InternalExpAuto.g:1524:60: (iv_ruleLinearValueProvider= ruleLinearValueProvider EOF )
            // InternalExpAuto.g:1525:2: iv_ruleLinearValueProvider= ruleLinearValueProvider EOF
            {
             newCompositeNode(grammarAccess.getLinearValueProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinearValueProvider=ruleLinearValueProvider();

            state._fsp--;

             current =iv_ruleLinearValueProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinearValueProvider"


    // $ANTLR start "ruleLinearValueProvider"
    // InternalExpAuto.g:1531:1: ruleLinearValueProvider returns [EObject current=null] : (otherlv_0= 'linear' otherlv_1= '(' ( (lv_summand_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleLinearValueProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_summand_2_0=null;
        Token otherlv_3=null;
        Token lv_factor_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1537:2: ( (otherlv_0= 'linear' otherlv_1= '(' ( (lv_summand_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalExpAuto.g:1538:2: (otherlv_0= 'linear' otherlv_1= '(' ( (lv_summand_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalExpAuto.g:1538:2: (otherlv_0= 'linear' otherlv_1= '(' ( (lv_summand_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalExpAuto.g:1539:3: otherlv_0= 'linear' otherlv_1= '(' ( (lv_summand_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLinearValueProviderAccess().getLinearKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getLinearValueProviderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpAuto.g:1547:3: ( (lv_summand_2_0= RULE_INT ) )
            // InternalExpAuto.g:1548:4: (lv_summand_2_0= RULE_INT )
            {
            // InternalExpAuto.g:1548:4: (lv_summand_2_0= RULE_INT )
            // InternalExpAuto.g:1549:5: lv_summand_2_0= RULE_INT
            {
            lv_summand_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_summand_2_0, grammarAccess.getLinearValueProviderAccess().getSummandINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinearValueProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"summand",
            						lv_summand_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLinearValueProviderAccess().getCommaKeyword_3());
            		
            // InternalExpAuto.g:1569:3: ( (lv_factor_4_0= RULE_INT ) )
            // InternalExpAuto.g:1570:4: (lv_factor_4_0= RULE_INT )
            {
            // InternalExpAuto.g:1570:4: (lv_factor_4_0= RULE_INT )
            // InternalExpAuto.g:1571:5: lv_factor_4_0= RULE_INT
            {
            lv_factor_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_factor_4_0, grammarAccess.getLinearValueProviderAccess().getFactorINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinearValueProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factor",
            						lv_factor_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinearValueProviderAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleLinearValueProvider"


    // $ANTLR start "entryRuleExponentialValueProvider"
    // InternalExpAuto.g:1595:1: entryRuleExponentialValueProvider returns [EObject current=null] : iv_ruleExponentialValueProvider= ruleExponentialValueProvider EOF ;
    public final EObject entryRuleExponentialValueProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialValueProvider = null;


        try {
            // InternalExpAuto.g:1595:65: (iv_ruleExponentialValueProvider= ruleExponentialValueProvider EOF )
            // InternalExpAuto.g:1596:2: iv_ruleExponentialValueProvider= ruleExponentialValueProvider EOF
            {
             newCompositeNode(grammarAccess.getExponentialValueProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentialValueProvider=ruleExponentialValueProvider();

            state._fsp--;

             current =iv_ruleExponentialValueProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExponentialValueProvider"


    // $ANTLR start "ruleExponentialValueProvider"
    // InternalExpAuto.g:1602:1: ruleExponentialValueProvider returns [EObject current=null] : (otherlv_0= 'exponential' otherlv_1= '(' ( (lv_base_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleExponentialValueProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_base_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1608:2: ( (otherlv_0= 'exponential' otherlv_1= '(' ( (lv_base_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalExpAuto.g:1609:2: (otherlv_0= 'exponential' otherlv_1= '(' ( (lv_base_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalExpAuto.g:1609:2: (otherlv_0= 'exponential' otherlv_1= '(' ( (lv_base_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalExpAuto.g:1610:3: otherlv_0= 'exponential' otherlv_1= '(' ( (lv_base_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExponentialValueProviderAccess().getExponentialKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getExponentialValueProviderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpAuto.g:1618:3: ( (lv_base_2_0= RULE_INT ) )
            // InternalExpAuto.g:1619:4: (lv_base_2_0= RULE_INT )
            {
            // InternalExpAuto.g:1619:4: (lv_base_2_0= RULE_INT )
            // InternalExpAuto.g:1620:5: lv_base_2_0= RULE_INT
            {
            lv_base_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_base_2_0, grammarAccess.getExponentialValueProviderAccess().getBaseINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExponentialValueProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base",
            						lv_base_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExponentialValueProviderAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleExponentialValueProvider"


    // $ANTLR start "entryRulePolynomialValueProvider"
    // InternalExpAuto.g:1644:1: entryRulePolynomialValueProvider returns [EObject current=null] : iv_rulePolynomialValueProvider= rulePolynomialValueProvider EOF ;
    public final EObject entryRulePolynomialValueProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolynomialValueProvider = null;


        try {
            // InternalExpAuto.g:1644:64: (iv_rulePolynomialValueProvider= rulePolynomialValueProvider EOF )
            // InternalExpAuto.g:1645:2: iv_rulePolynomialValueProvider= rulePolynomialValueProvider EOF
            {
             newCompositeNode(grammarAccess.getPolynomialValueProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolynomialValueProvider=rulePolynomialValueProvider();

            state._fsp--;

             current =iv_rulePolynomialValueProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePolynomialValueProvider"


    // $ANTLR start "rulePolynomialValueProvider"
    // InternalExpAuto.g:1651:1: rulePolynomialValueProvider returns [EObject current=null] : (otherlv_0= 'polynomial' otherlv_1= '(' ( (lv_exponent_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject rulePolynomialValueProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_exponent_2_0=null;
        Token otherlv_3=null;
        Token lv_factor_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1657:2: ( (otherlv_0= 'polynomial' otherlv_1= '(' ( (lv_exponent_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalExpAuto.g:1658:2: (otherlv_0= 'polynomial' otherlv_1= '(' ( (lv_exponent_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalExpAuto.g:1658:2: (otherlv_0= 'polynomial' otherlv_1= '(' ( (lv_exponent_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalExpAuto.g:1659:3: otherlv_0= 'polynomial' otherlv_1= '(' ( (lv_exponent_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_factor_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPolynomialValueProviderAccess().getPolynomialKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPolynomialValueProviderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpAuto.g:1667:3: ( (lv_exponent_2_0= RULE_INT ) )
            // InternalExpAuto.g:1668:4: (lv_exponent_2_0= RULE_INT )
            {
            // InternalExpAuto.g:1668:4: (lv_exponent_2_0= RULE_INT )
            // InternalExpAuto.g:1669:5: lv_exponent_2_0= RULE_INT
            {
            lv_exponent_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_exponent_2_0, grammarAccess.getPolynomialValueProviderAccess().getExponentINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolynomialValueProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exponent",
            						lv_exponent_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getPolynomialValueProviderAccess().getCommaKeyword_3());
            		
            // InternalExpAuto.g:1689:3: ( (lv_factor_4_0= RULE_INT ) )
            // InternalExpAuto.g:1690:4: (lv_factor_4_0= RULE_INT )
            {
            // InternalExpAuto.g:1690:4: (lv_factor_4_0= RULE_INT )
            // InternalExpAuto.g:1691:5: lv_factor_4_0= RULE_INT
            {
            lv_factor_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_factor_4_0, grammarAccess.getPolynomialValueProviderAccess().getFactorINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolynomialValueProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factor",
            						lv_factor_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPolynomialValueProviderAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "rulePolynomialValueProvider"


    // $ANTLR start "entryRuleStopTimeCondition"
    // InternalExpAuto.g:1715:1: entryRuleStopTimeCondition returns [EObject current=null] : iv_ruleStopTimeCondition= ruleStopTimeCondition EOF ;
    public final EObject entryRuleStopTimeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopTimeCondition = null;


        try {
            // InternalExpAuto.g:1715:58: (iv_ruleStopTimeCondition= ruleStopTimeCondition EOF )
            // InternalExpAuto.g:1716:2: iv_ruleStopTimeCondition= ruleStopTimeCondition EOF
            {
             newCompositeNode(grammarAccess.getStopTimeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopTimeCondition=ruleStopTimeCondition();

            state._fsp--;

             current =iv_ruleStopTimeCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStopTimeCondition"


    // $ANTLR start "ruleStopTimeCondition"
    // InternalExpAuto.g:1722:1: ruleStopTimeCondition returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'simulationTime' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleStopTimeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stopTyp_2_0=null;
        Token otherlv_3=null;
        Token lv_stopParam_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1728:2: ( (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'simulationTime' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalExpAuto.g:1729:2: (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'simulationTime' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalExpAuto.g:1729:2: (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'simulationTime' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalExpAuto.g:1730:3: otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'simulationTime' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStopTimeConditionAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getStopTimeConditionAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:1738:3: ( (lv_stopTyp_2_0= 'simulationTime' ) )
            // InternalExpAuto.g:1739:4: (lv_stopTyp_2_0= 'simulationTime' )
            {
            // InternalExpAuto.g:1739:4: (lv_stopTyp_2_0= 'simulationTime' )
            // InternalExpAuto.g:1740:5: lv_stopTyp_2_0= 'simulationTime'
            {
            lv_stopTyp_2_0=(Token)match(input,44,FOLLOW_10); 

            					newLeafNode(lv_stopTyp_2_0, grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopTimeConditionRule());
            					}
            					setWithLastConsumed(current, "stopTyp", lv_stopTyp_2_0, "simulationTime");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getStopTimeConditionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalExpAuto.g:1756:3: ( (lv_stopParam_4_0= RULE_INT ) )
            // InternalExpAuto.g:1757:4: (lv_stopParam_4_0= RULE_INT )
            {
            // InternalExpAuto.g:1757:4: (lv_stopParam_4_0= RULE_INT )
            // InternalExpAuto.g:1758:5: lv_stopParam_4_0= RULE_INT
            {
            lv_stopParam_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_stopParam_4_0, grammarAccess.getStopTimeConditionAccess().getStopParamINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopTimeConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stopParam",
            						lv_stopParam_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStopTimeConditionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleStopTimeCondition"


    // $ANTLR start "entryRuleStopCountCondition"
    // InternalExpAuto.g:1782:1: entryRuleStopCountCondition returns [EObject current=null] : iv_ruleStopCountCondition= ruleStopCountCondition EOF ;
    public final EObject entryRuleStopCountCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopCountCondition = null;


        try {
            // InternalExpAuto.g:1782:59: (iv_ruleStopCountCondition= ruleStopCountCondition EOF )
            // InternalExpAuto.g:1783:2: iv_ruleStopCountCondition= ruleStopCountCondition EOF
            {
             newCompositeNode(grammarAccess.getStopCountConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopCountCondition=ruleStopCountCondition();

            state._fsp--;

             current =iv_ruleStopCountCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStopCountCondition"


    // $ANTLR start "ruleStopCountCondition"
    // InternalExpAuto.g:1789:1: ruleStopCountCondition returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'measurementCount' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleStopCountCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stopTyp_2_0=null;
        Token otherlv_3=null;
        Token lv_stopParam_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1795:2: ( (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'measurementCount' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalExpAuto.g:1796:2: (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'measurementCount' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalExpAuto.g:1796:2: (otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'measurementCount' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalExpAuto.g:1797:3: otherlv_0= 'stop' otherlv_1= '=' ( (lv_stopTyp_2_0= 'measurementCount' ) ) otherlv_3= '(' ( (lv_stopParam_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStopCountConditionAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getStopCountConditionAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:1805:3: ( (lv_stopTyp_2_0= 'measurementCount' ) )
            // InternalExpAuto.g:1806:4: (lv_stopTyp_2_0= 'measurementCount' )
            {
            // InternalExpAuto.g:1806:4: (lv_stopTyp_2_0= 'measurementCount' )
            // InternalExpAuto.g:1807:5: lv_stopTyp_2_0= 'measurementCount'
            {
            lv_stopTyp_2_0=(Token)match(input,45,FOLLOW_10); 

            					newLeafNode(lv_stopTyp_2_0, grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopCountConditionRule());
            					}
            					setWithLastConsumed(current, "stopTyp", lv_stopTyp_2_0, "measurementCount");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getStopCountConditionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalExpAuto.g:1823:3: ( (lv_stopParam_4_0= RULE_INT ) )
            // InternalExpAuto.g:1824:4: (lv_stopParam_4_0= RULE_INT )
            {
            // InternalExpAuto.g:1824:4: (lv_stopParam_4_0= RULE_INT )
            // InternalExpAuto.g:1825:5: lv_stopParam_4_0= RULE_INT
            {
            lv_stopParam_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_stopParam_4_0, grammarAccess.getStopCountConditionAccess().getStopParamINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopCountConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stopParam",
            						lv_stopParam_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStopCountConditionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleStopCountCondition"


    // $ANTLR start "entryRuleNumberOfExperiments"
    // InternalExpAuto.g:1849:1: entryRuleNumberOfExperiments returns [EObject current=null] : iv_ruleNumberOfExperiments= ruleNumberOfExperiments EOF ;
    public final EObject entryRuleNumberOfExperiments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOfExperiments = null;


        try {
            // InternalExpAuto.g:1849:60: (iv_ruleNumberOfExperiments= ruleNumberOfExperiments EOF )
            // InternalExpAuto.g:1850:2: iv_ruleNumberOfExperiments= ruleNumberOfExperiments EOF
            {
             newCompositeNode(grammarAccess.getNumberOfExperimentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberOfExperiments=ruleNumberOfExperiments();

            state._fsp--;

             current =iv_ruleNumberOfExperiments; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberOfExperiments"


    // $ANTLR start "ruleNumberOfExperiments"
    // InternalExpAuto.g:1856:1: ruleNumberOfExperiments returns [EObject current=null] : (otherlv_0= 'repetitions' otherlv_1= '=' ( (lv_numberOfRepetitions_2_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberOfExperiments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numberOfRepetitions_2_0=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1862:2: ( (otherlv_0= 'repetitions' otherlv_1= '=' ( (lv_numberOfRepetitions_2_0= RULE_INT ) ) ) )
            // InternalExpAuto.g:1863:2: (otherlv_0= 'repetitions' otherlv_1= '=' ( (lv_numberOfRepetitions_2_0= RULE_INT ) ) )
            {
            // InternalExpAuto.g:1863:2: (otherlv_0= 'repetitions' otherlv_1= '=' ( (lv_numberOfRepetitions_2_0= RULE_INT ) ) )
            // InternalExpAuto.g:1864:3: otherlv_0= 'repetitions' otherlv_1= '=' ( (lv_numberOfRepetitions_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOfExperimentsAccess().getRepetitionsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOfExperimentsAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:1872:3: ( (lv_numberOfRepetitions_2_0= RULE_INT ) )
            // InternalExpAuto.g:1873:4: (lv_numberOfRepetitions_2_0= RULE_INT )
            {
            // InternalExpAuto.g:1873:4: (lv_numberOfRepetitions_2_0= RULE_INT )
            // InternalExpAuto.g:1874:5: lv_numberOfRepetitions_2_0= RULE_INT
            {
            lv_numberOfRepetitions_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_numberOfRepetitions_2_0, grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOfExperimentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberOfRepetitions",
            						lv_numberOfRepetitions_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumberOfExperiments"


    // $ANTLR start "entryRuleSeedDefinition"
    // InternalExpAuto.g:1894:1: entryRuleSeedDefinition returns [EObject current=null] : iv_ruleSeedDefinition= ruleSeedDefinition EOF ;
    public final EObject entryRuleSeedDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeedDefinition = null;


        try {
            // InternalExpAuto.g:1894:55: (iv_ruleSeedDefinition= ruleSeedDefinition EOF )
            // InternalExpAuto.g:1895:2: iv_ruleSeedDefinition= ruleSeedDefinition EOF
            {
             newCompositeNode(grammarAccess.getSeedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeedDefinition=ruleSeedDefinition();

            state._fsp--;

             current =iv_ruleSeedDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSeedDefinition"


    // $ANTLR start "ruleSeedDefinition"
    // InternalExpAuto.g:1901:1: ruleSeedDefinition returns [EObject current=null] : (otherlv_0= 'seeds' otherlv_1= '=' otherlv_2= '{' ( (lv_seedLists_3_0= ruleListOfSeeds ) ) (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSeedDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_seedLists_3_0 = null;

        EObject lv_seedLists_5_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:1907:2: ( (otherlv_0= 'seeds' otherlv_1= '=' otherlv_2= '{' ( (lv_seedLists_3_0= ruleListOfSeeds ) ) (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )* otherlv_6= '}' ) )
            // InternalExpAuto.g:1908:2: (otherlv_0= 'seeds' otherlv_1= '=' otherlv_2= '{' ( (lv_seedLists_3_0= ruleListOfSeeds ) ) (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )* otherlv_6= '}' )
            {
            // InternalExpAuto.g:1908:2: (otherlv_0= 'seeds' otherlv_1= '=' otherlv_2= '{' ( (lv_seedLists_3_0= ruleListOfSeeds ) ) (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )* otherlv_6= '}' )
            // InternalExpAuto.g:1909:3: otherlv_0= 'seeds' otherlv_1= '=' otherlv_2= '{' ( (lv_seedLists_3_0= ruleListOfSeeds ) ) (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSeedDefinitionAccess().getSeedsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSeedDefinitionAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSeedDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalExpAuto.g:1921:3: ( (lv_seedLists_3_0= ruleListOfSeeds ) )
            // InternalExpAuto.g:1922:4: (lv_seedLists_3_0= ruleListOfSeeds )
            {
            // InternalExpAuto.g:1922:4: (lv_seedLists_3_0= ruleListOfSeeds )
            // InternalExpAuto.g:1923:5: lv_seedLists_3_0= ruleListOfSeeds
            {

            					newCompositeNode(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_seedLists_3_0=ruleListOfSeeds();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeedDefinitionRule());
            					}
            					add(
            						current,
            						"seedLists",
            						lv_seedLists_3_0,
            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ListOfSeeds");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpAuto.g:1940:3: (otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:1941:4: otherlv_4= ',' ( (lv_seedLists_5_0= ruleListOfSeeds ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSeedDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalExpAuto.g:1945:4: ( (lv_seedLists_5_0= ruleListOfSeeds ) )
            	    // InternalExpAuto.g:1946:5: (lv_seedLists_5_0= ruleListOfSeeds )
            	    {
            	    // InternalExpAuto.g:1946:5: (lv_seedLists_5_0= ruleListOfSeeds )
            	    // InternalExpAuto.g:1947:6: lv_seedLists_5_0= ruleListOfSeeds
            	    {

            	    						newCompositeNode(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_seedLists_5_0=ruleListOfSeeds();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSeedDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"seedLists",
            	    							lv_seedLists_5_0,
            	    							"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ListOfSeeds");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSeedDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSeedDefinition"


    // $ANTLR start "entryRuleListOfSeeds"
    // InternalExpAuto.g:1973:1: entryRuleListOfSeeds returns [EObject current=null] : iv_ruleListOfSeeds= ruleListOfSeeds EOF ;
    public final EObject entryRuleListOfSeeds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfSeeds = null;


        try {
            // InternalExpAuto.g:1973:52: (iv_ruleListOfSeeds= ruleListOfSeeds EOF )
            // InternalExpAuto.g:1974:2: iv_ruleListOfSeeds= ruleListOfSeeds EOF
            {
             newCompositeNode(grammarAccess.getListOfSeedsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfSeeds=ruleListOfSeeds();

            state._fsp--;

             current =iv_ruleListOfSeeds; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListOfSeeds"


    // $ANTLR start "ruleListOfSeeds"
    // InternalExpAuto.g:1980:1: ruleListOfSeeds returns [EObject current=null] : (otherlv_0= '{' ( (lv_seeds_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleListOfSeeds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_seeds_1_0=null;
        Token otherlv_2=null;
        Token lv_seeds_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExpAuto.g:1986:2: ( (otherlv_0= '{' ( (lv_seeds_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )* otherlv_4= '}' ) )
            // InternalExpAuto.g:1987:2: (otherlv_0= '{' ( (lv_seeds_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )* otherlv_4= '}' )
            {
            // InternalExpAuto.g:1987:2: (otherlv_0= '{' ( (lv_seeds_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )* otherlv_4= '}' )
            // InternalExpAuto.g:1988:3: otherlv_0= '{' ( (lv_seeds_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfSeedsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalExpAuto.g:1992:3: ( (lv_seeds_1_0= RULE_INT ) )
            // InternalExpAuto.g:1993:4: (lv_seeds_1_0= RULE_INT )
            {
            // InternalExpAuto.g:1993:4: (lv_seeds_1_0= RULE_INT )
            // InternalExpAuto.g:1994:5: lv_seeds_1_0= RULE_INT
            {
            lv_seeds_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_seeds_1_0, grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSeedsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"seeds",
            						lv_seeds_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalExpAuto.g:2010:3: (otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:2011:4: otherlv_2= ',' ( (lv_seeds_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListOfSeedsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalExpAuto.g:2015:4: ( (lv_seeds_3_0= RULE_INT ) )
            	    // InternalExpAuto.g:2016:5: (lv_seeds_3_0= RULE_INT )
            	    {
            	    // InternalExpAuto.g:2016:5: (lv_seeds_3_0= RULE_INT )
            	    // InternalExpAuto.g:2017:6: lv_seeds_3_0= RULE_INT
            	    {
            	    lv_seeds_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            	    						newLeafNode(lv_seeds_3_0, grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfSeedsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"seeds",
            	    							lv_seeds_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListOfSeedsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleListOfSeeds"


    // $ANTLR start "entryRuleExperimentDatasource"
    // InternalExpAuto.g:2042:1: entryRuleExperimentDatasource returns [EObject current=null] : iv_ruleExperimentDatasource= ruleExperimentDatasource EOF ;
    public final EObject entryRuleExperimentDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentDatasource = null;


        try {
            // InternalExpAuto.g:2042:61: (iv_ruleExperimentDatasource= ruleExperimentDatasource EOF )
            // InternalExpAuto.g:2043:2: iv_ruleExperimentDatasource= ruleExperimentDatasource EOF
            {
             newCompositeNode(grammarAccess.getExperimentDatasourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentDatasource=ruleExperimentDatasource();

            state._fsp--;

             current =iv_ruleExperimentDatasource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExperimentDatasource"


    // $ANTLR start "ruleExperimentDatasource"
    // InternalExpAuto.g:2049:1: ruleExperimentDatasource returns [EObject current=null] : (otherlv_0= 'datasource' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExperimentDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExpAuto.g:2055:2: ( (otherlv_0= 'datasource' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExpAuto.g:2056:2: (otherlv_0= 'datasource' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExpAuto.g:2056:2: (otherlv_0= 'datasource' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalExpAuto.g:2057:3: otherlv_0= 'datasource' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentDatasourceAccess().getDatasourceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentDatasourceAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:2065:3: ( (otherlv_2= RULE_ID ) )
            // InternalExpAuto.g:2066:4: (otherlv_2= RULE_ID )
            {
            // InternalExpAuto.g:2066:4: (otherlv_2= RULE_ID )
            // InternalExpAuto.g:2067:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentDatasourceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0());
            				

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
    // $ANTLR end "ruleExperimentDatasource"


    // $ANTLR start "entryRuleToolDefinition"
    // InternalExpAuto.g:2082:1: entryRuleToolDefinition returns [EObject current=null] : iv_ruleToolDefinition= ruleToolDefinition EOF ;
    public final EObject entryRuleToolDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolDefinition = null;


        try {
            // InternalExpAuto.g:2082:55: (iv_ruleToolDefinition= ruleToolDefinition EOF )
            // InternalExpAuto.g:2083:2: iv_ruleToolDefinition= ruleToolDefinition EOF
            {
             newCompositeNode(grammarAccess.getToolDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToolDefinition=ruleToolDefinition();

            state._fsp--;

             current =iv_ruleToolDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToolDefinition"


    // $ANTLR start "ruleToolDefinition"
    // InternalExpAuto.g:2089:1: ruleToolDefinition returns [EObject current=null] : (otherlv_0= 'tool' otherlv_1= '=' ( (lv_tool_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_configParams_4_0= ruleConfigurationParams ) )* otherlv_5= '}' ) ;
    public final EObject ruleToolDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configParams_4_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:2095:2: ( (otherlv_0= 'tool' otherlv_1= '=' ( (lv_tool_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_configParams_4_0= ruleConfigurationParams ) )* otherlv_5= '}' ) )
            // InternalExpAuto.g:2096:2: (otherlv_0= 'tool' otherlv_1= '=' ( (lv_tool_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_configParams_4_0= ruleConfigurationParams ) )* otherlv_5= '}' )
            {
            // InternalExpAuto.g:2096:2: (otherlv_0= 'tool' otherlv_1= '=' ( (lv_tool_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_configParams_4_0= ruleConfigurationParams ) )* otherlv_5= '}' )
            // InternalExpAuto.g:2097:3: otherlv_0= 'tool' otherlv_1= '=' ( (lv_tool_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_configParams_4_0= ruleConfigurationParams ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getToolDefinitionAccess().getToolKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getToolDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:2105:3: ( (lv_tool_2_0= RULE_STRING ) )
            // InternalExpAuto.g:2106:4: (lv_tool_2_0= RULE_STRING )
            {
            // InternalExpAuto.g:2106:4: (lv_tool_2_0= RULE_STRING )
            // InternalExpAuto.g:2107:5: lv_tool_2_0= RULE_STRING
            {
            lv_tool_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_tool_2_0, grammarAccess.getToolDefinitionAccess().getToolSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToolDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tool",
            						lv_tool_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalExpAuto.g:2127:3: ( (lv_configParams_4_0= ruleConfigurationParams ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:2128:4: (lv_configParams_4_0= ruleConfigurationParams )
            	    {
            	    // InternalExpAuto.g:2128:4: (lv_configParams_4_0= ruleConfigurationParams )
            	    // InternalExpAuto.g:2129:5: lv_configParams_4_0= ruleConfigurationParams
            	    {

            	    					newCompositeNode(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_configParams_4_0=ruleConfigurationParams();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getToolDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configParams",
            	    						lv_configParams_4_0,
            	    						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ConfigurationParams");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleToolDefinition"


    // $ANTLR start "entryRuleConfigurationParams"
    // InternalExpAuto.g:2154:1: entryRuleConfigurationParams returns [EObject current=null] : iv_ruleConfigurationParams= ruleConfigurationParams EOF ;
    public final EObject entryRuleConfigurationParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParams = null;


        try {
            // InternalExpAuto.g:2154:60: (iv_ruleConfigurationParams= ruleConfigurationParams EOF )
            // InternalExpAuto.g:2155:2: iv_ruleConfigurationParams= ruleConfigurationParams EOF
            {
             newCompositeNode(grammarAccess.getConfigurationParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationParams=ruleConfigurationParams();

            state._fsp--;

             current =iv_ruleConfigurationParams; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigurationParams"


    // $ANTLR start "ruleConfigurationParams"
    // InternalExpAuto.g:2161:1: ruleConfigurationParams returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleConfigValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleConfigurationParams() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalExpAuto.g:2167:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleConfigValue ) ) otherlv_3= ';' ) )
            // InternalExpAuto.g:2168:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleConfigValue ) ) otherlv_3= ';' )
            {
            // InternalExpAuto.g:2168:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleConfigValue ) ) otherlv_3= ';' )
            // InternalExpAuto.g:2169:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleConfigValue ) ) otherlv_3= ';'
            {
            // InternalExpAuto.g:2169:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalExpAuto.g:2170:4: (lv_key_0_0= RULE_ID )
            {
            // InternalExpAuto.g:2170:4: (lv_key_0_0= RULE_ID )
            // InternalExpAuto.g:2171:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_key_0_0, grammarAccess.getConfigurationParamsAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationParamsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationParamsAccess().getEqualsSignKeyword_1());
            		
            // InternalExpAuto.g:2191:3: ( (lv_value_2_0= ruleConfigValue ) )
            // InternalExpAuto.g:2192:4: (lv_value_2_0= ruleConfigValue )
            {
            // InternalExpAuto.g:2192:4: (lv_value_2_0= ruleConfigValue )
            // InternalExpAuto.g:2193:5: lv_value_2_0= ruleConfigValue
            {

            					newCompositeNode(grammarAccess.getConfigurationParamsAccess().getValueConfigValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_value_2_0=ruleConfigValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationParamsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.palladiosimulator.experimentautomation.dsl.ExpAuto.ConfigValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationParamsAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConfigurationParams"


    // $ANTLR start "entryRuleConfigValue"
    // InternalExpAuto.g:2218:1: entryRuleConfigValue returns [String current=null] : iv_ruleConfigValue= ruleConfigValue EOF ;
    public final String entryRuleConfigValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConfigValue = null;


        try {
            // InternalExpAuto.g:2218:51: (iv_ruleConfigValue= ruleConfigValue EOF )
            // InternalExpAuto.g:2219:2: iv_ruleConfigValue= ruleConfigValue EOF
            {
             newCompositeNode(grammarAccess.getConfigValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigValue=ruleConfigValue();

            state._fsp--;

             current =iv_ruleConfigValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigValue"


    // $ANTLR start "ruleConfigValue"
    // InternalExpAuto.g:2225:1: ruleConfigValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleConfigValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalExpAuto.g:2231:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) )
            // InternalExpAuto.g:2232:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            {
            // InternalExpAuto.g:2232:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalExpAuto.g:2233:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:2241:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getConfigValueAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleConfigValue"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\14\3\uffff\1\27\4\uffff\1\54\2\uffff";
    static final String dfa_3s = "\1\60\3\uffff\1\27\4\uffff\1\55\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\11\uffff\1\1\1\uffff\1\2\6\uffff\1\3\13\uffff\1\4\2\uffff\1\5\1\6\1\10",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "476:4: (lv_specifications_0_1= ruleDescription | lv_specifications_0_2= ruleInitialModel | lv_specifications_0_3= ruleVariation | lv_specifications_0_4= ruleStopTimeCondition | lv_specifications_0_5= ruleStopCountCondition | lv_specifications_0_6= ruleNumberOfExperiments | lv_specifications_0_7= ruleSeedDefinition | lv_specifications_0_8= ruleExperimentDatasource | lv_specifications_0_9= ruleToolDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001C80081401000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001C80081401002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007C800100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});

}