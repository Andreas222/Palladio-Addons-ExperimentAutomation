package org.palladiosimulator.experimentautomation.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.experimentautomation.dsl.services.ExpAutoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpAutoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FullFactorial'", "'OneFactor'", "'import'", "'datasource'", "':'", "'('", "')'", "'experiment'", "'{'", "'}'", "'description'", "'='", "'initial'", "'allocation'", "'usageModel'", "'middlewareRepository'", "'eventMiddlewareRepository'", "'monitorRepository'", "'variation'", "'target'", "'maxVariations'", "'values'", "'['", "','", "']'", "'nestedIntervall'", "'setValues'", "'linear'", "'exponential'", "'polynomial'", "'stop'", "'repetitions'", "'seeds'", "'tool'", "';'", "'EDP2'", "'PCM'", "'simulationTime'", "'measurementCount'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(ExpAutoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalExpAuto.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:54:1: ( ruleModel EOF )
            // InternalExpAuto.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExpAuto.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalExpAuto.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalExpAuto.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalExpAuto.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalExpAuto.g:69:3: ( rule__Model__Group__0 )
            // InternalExpAuto.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalExpAuto.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalExpAuto.g:79:1: ( ruleImport EOF )
            // InternalExpAuto.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalExpAuto.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalExpAuto.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalExpAuto.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalExpAuto.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalExpAuto.g:94:3: ( rule__Import__Group__0 )
            // InternalExpAuto.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDatasource"
    // InternalExpAuto.g:103:1: entryRuleDatasource : ruleDatasource EOF ;
    public final void entryRuleDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:104:1: ( ruleDatasource EOF )
            // InternalExpAuto.g:105:1: ruleDatasource EOF
            {
             before(grammarAccess.getDatasourceRule()); 
            pushFollow(FOLLOW_1);
            ruleDatasource();

            state._fsp--;

             after(grammarAccess.getDatasourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatasource"


    // $ANTLR start "ruleDatasource"
    // InternalExpAuto.g:112:1: ruleDatasource : ( ( rule__Datasource__Alternatives ) ) ;
    public final void ruleDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:116:2: ( ( ( rule__Datasource__Alternatives ) ) )
            // InternalExpAuto.g:117:2: ( ( rule__Datasource__Alternatives ) )
            {
            // InternalExpAuto.g:117:2: ( ( rule__Datasource__Alternatives ) )
            // InternalExpAuto.g:118:3: ( rule__Datasource__Alternatives )
            {
             before(grammarAccess.getDatasourceAccess().getAlternatives()); 
            // InternalExpAuto.g:119:3: ( rule__Datasource__Alternatives )
            // InternalExpAuto.g:119:4: rule__Datasource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatasource"


    // $ANTLR start "entryRuleFileDatasource"
    // InternalExpAuto.g:128:1: entryRuleFileDatasource : ruleFileDatasource EOF ;
    public final void entryRuleFileDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:129:1: ( ruleFileDatasource EOF )
            // InternalExpAuto.g:130:1: ruleFileDatasource EOF
            {
             before(grammarAccess.getFileDatasourceRule()); 
            pushFollow(FOLLOW_1);
            ruleFileDatasource();

            state._fsp--;

             after(grammarAccess.getFileDatasourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileDatasource"


    // $ANTLR start "ruleFileDatasource"
    // InternalExpAuto.g:137:1: ruleFileDatasource : ( ( rule__FileDatasource__Group__0 ) ) ;
    public final void ruleFileDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:141:2: ( ( ( rule__FileDatasource__Group__0 ) ) )
            // InternalExpAuto.g:142:2: ( ( rule__FileDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:142:2: ( ( rule__FileDatasource__Group__0 ) )
            // InternalExpAuto.g:143:3: ( rule__FileDatasource__Group__0 )
            {
             before(grammarAccess.getFileDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:144:3: ( rule__FileDatasource__Group__0 )
            // InternalExpAuto.g:144:4: rule__FileDatasource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileDatasource"


    // $ANTLR start "entryRuleMemoryDatasource"
    // InternalExpAuto.g:153:1: entryRuleMemoryDatasource : ruleMemoryDatasource EOF ;
    public final void entryRuleMemoryDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:154:1: ( ruleMemoryDatasource EOF )
            // InternalExpAuto.g:155:1: ruleMemoryDatasource EOF
            {
             before(grammarAccess.getMemoryDatasourceRule()); 
            pushFollow(FOLLOW_1);
            ruleMemoryDatasource();

            state._fsp--;

             after(grammarAccess.getMemoryDatasourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemoryDatasource"


    // $ANTLR start "ruleMemoryDatasource"
    // InternalExpAuto.g:162:1: ruleMemoryDatasource : ( ( rule__MemoryDatasource__Group__0 ) ) ;
    public final void ruleMemoryDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:166:2: ( ( ( rule__MemoryDatasource__Group__0 ) ) )
            // InternalExpAuto.g:167:2: ( ( rule__MemoryDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:167:2: ( ( rule__MemoryDatasource__Group__0 ) )
            // InternalExpAuto.g:168:3: ( rule__MemoryDatasource__Group__0 )
            {
             before(grammarAccess.getMemoryDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:169:3: ( rule__MemoryDatasource__Group__0 )
            // InternalExpAuto.g:169:4: rule__MemoryDatasource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemoryDatasourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryDatasource"


    // $ANTLR start "entryRuleExperiment"
    // InternalExpAuto.g:178:1: entryRuleExperiment : ruleExperiment EOF ;
    public final void entryRuleExperiment() throws RecognitionException {
        try {
            // InternalExpAuto.g:179:1: ( ruleExperiment EOF )
            // InternalExpAuto.g:180:1: ruleExperiment EOF
            {
             before(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            ruleExperiment();

            state._fsp--;

             after(grammarAccess.getExperimentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalExpAuto.g:187:1: ruleExperiment : ( ( rule__Experiment__Group__0 ) ) ;
    public final void ruleExperiment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:191:2: ( ( ( rule__Experiment__Group__0 ) ) )
            // InternalExpAuto.g:192:2: ( ( rule__Experiment__Group__0 ) )
            {
            // InternalExpAuto.g:192:2: ( ( rule__Experiment__Group__0 ) )
            // InternalExpAuto.g:193:3: ( rule__Experiment__Group__0 )
            {
             before(grammarAccess.getExperimentAccess().getGroup()); 
            // InternalExpAuto.g:194:3: ( rule__Experiment__Group__0 )
            // InternalExpAuto.g:194:4: rule__Experiment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleExperimentSpecifications"
    // InternalExpAuto.g:203:1: entryRuleExperimentSpecifications : ruleExperimentSpecifications EOF ;
    public final void entryRuleExperimentSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:204:1: ( ruleExperimentSpecifications EOF )
            // InternalExpAuto.g:205:1: ruleExperimentSpecifications EOF
            {
             before(grammarAccess.getExperimentSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            ruleExperimentSpecifications();

            state._fsp--;

             after(grammarAccess.getExperimentSpecificationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperimentSpecifications"


    // $ANTLR start "ruleExperimentSpecifications"
    // InternalExpAuto.g:212:1: ruleExperimentSpecifications : ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleExperimentSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:216:2: ( ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:217:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:217:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:218:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:218:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:219:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:220:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:220:5: rule__ExperimentSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:223:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:224:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:225:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==21||LA1_0==23||LA1_0==29||(LA1_0>=41 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpAuto.g:225:5: rule__ExperimentSpecifications__SpecificationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ExperimentSpecifications__SpecificationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentSpecifications"


    // $ANTLR start "entryRuleDescription"
    // InternalExpAuto.g:235:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalExpAuto.g:236:1: ( ruleDescription EOF )
            // InternalExpAuto.g:237:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalExpAuto.g:244:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:248:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalExpAuto.g:249:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalExpAuto.g:249:2: ( ( rule__Description__Group__0 ) )
            // InternalExpAuto.g:250:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalExpAuto.g:251:3: ( rule__Description__Group__0 )
            // InternalExpAuto.g:251:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleInitialModel"
    // InternalExpAuto.g:260:1: entryRuleInitialModel : ruleInitialModel EOF ;
    public final void entryRuleInitialModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:261:1: ( ruleInitialModel EOF )
            // InternalExpAuto.g:262:1: ruleInitialModel EOF
            {
             before(grammarAccess.getInitialModelRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialModel();

            state._fsp--;

             after(grammarAccess.getInitialModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialModel"


    // $ANTLR start "ruleInitialModel"
    // InternalExpAuto.g:269:1: ruleInitialModel : ( ( rule__InitialModel__Group__0 ) ) ;
    public final void ruleInitialModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:273:2: ( ( ( rule__InitialModel__Group__0 ) ) )
            // InternalExpAuto.g:274:2: ( ( rule__InitialModel__Group__0 ) )
            {
            // InternalExpAuto.g:274:2: ( ( rule__InitialModel__Group__0 ) )
            // InternalExpAuto.g:275:3: ( rule__InitialModel__Group__0 )
            {
             before(grammarAccess.getInitialModelAccess().getGroup()); 
            // InternalExpAuto.g:276:3: ( rule__InitialModel__Group__0 )
            // InternalExpAuto.g:276:4: rule__InitialModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialModel"


    // $ANTLR start "entryRuleInitSpecifications"
    // InternalExpAuto.g:285:1: entryRuleInitSpecifications : ruleInitSpecifications EOF ;
    public final void entryRuleInitSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:286:1: ( ruleInitSpecifications EOF )
            // InternalExpAuto.g:287:1: ruleInitSpecifications EOF
            {
             before(grammarAccess.getInitSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            ruleInitSpecifications();

            state._fsp--;

             after(grammarAccess.getInitSpecificationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitSpecifications"


    // $ANTLR start "ruleInitSpecifications"
    // InternalExpAuto.g:294:1: ruleInitSpecifications : ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleInitSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:298:2: ( ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:299:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:299:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:300:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:300:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:301:4: ( rule__InitSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:302:4: ( rule__InitSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:302:5: rule__InitSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__InitSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:305:3: ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:306:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:307:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=28)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpAuto.g:307:5: rule__InitSpecifications__SpecificationsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__InitSpecifications__SpecificationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitSpecifications"


    // $ANTLR start "entryRuleAllocationModel"
    // InternalExpAuto.g:317:1: entryRuleAllocationModel : ruleAllocationModel EOF ;
    public final void entryRuleAllocationModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:318:1: ( ruleAllocationModel EOF )
            // InternalExpAuto.g:319:1: ruleAllocationModel EOF
            {
             before(grammarAccess.getAllocationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationModel();

            state._fsp--;

             after(grammarAccess.getAllocationModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocationModel"


    // $ANTLR start "ruleAllocationModel"
    // InternalExpAuto.g:326:1: ruleAllocationModel : ( ( rule__AllocationModel__Group__0 ) ) ;
    public final void ruleAllocationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:330:2: ( ( ( rule__AllocationModel__Group__0 ) ) )
            // InternalExpAuto.g:331:2: ( ( rule__AllocationModel__Group__0 ) )
            {
            // InternalExpAuto.g:331:2: ( ( rule__AllocationModel__Group__0 ) )
            // InternalExpAuto.g:332:3: ( rule__AllocationModel__Group__0 )
            {
             before(grammarAccess.getAllocationModelAccess().getGroup()); 
            // InternalExpAuto.g:333:3: ( rule__AllocationModel__Group__0 )
            // InternalExpAuto.g:333:4: rule__AllocationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationModel"


    // $ANTLR start "entryRuleUsageModel"
    // InternalExpAuto.g:342:1: entryRuleUsageModel : ruleUsageModel EOF ;
    public final void entryRuleUsageModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:343:1: ( ruleUsageModel EOF )
            // InternalExpAuto.g:344:1: ruleUsageModel EOF
            {
             before(grammarAccess.getUsageModelRule()); 
            pushFollow(FOLLOW_1);
            ruleUsageModel();

            state._fsp--;

             after(grammarAccess.getUsageModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsageModel"


    // $ANTLR start "ruleUsageModel"
    // InternalExpAuto.g:351:1: ruleUsageModel : ( ( rule__UsageModel__Group__0 ) ) ;
    public final void ruleUsageModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:355:2: ( ( ( rule__UsageModel__Group__0 ) ) )
            // InternalExpAuto.g:356:2: ( ( rule__UsageModel__Group__0 ) )
            {
            // InternalExpAuto.g:356:2: ( ( rule__UsageModel__Group__0 ) )
            // InternalExpAuto.g:357:3: ( rule__UsageModel__Group__0 )
            {
             before(grammarAccess.getUsageModelAccess().getGroup()); 
            // InternalExpAuto.g:358:3: ( rule__UsageModel__Group__0 )
            // InternalExpAuto.g:358:4: rule__UsageModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsageModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsageModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsageModel"


    // $ANTLR start "entryRuleMiddlewareRepository"
    // InternalExpAuto.g:367:1: entryRuleMiddlewareRepository : ruleMiddlewareRepository EOF ;
    public final void entryRuleMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:368:1: ( ruleMiddlewareRepository EOF )
            // InternalExpAuto.g:369:1: ruleMiddlewareRepository EOF
            {
             before(grammarAccess.getMiddlewareRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleMiddlewareRepository();

            state._fsp--;

             after(grammarAccess.getMiddlewareRepositoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiddlewareRepository"


    // $ANTLR start "ruleMiddlewareRepository"
    // InternalExpAuto.g:376:1: ruleMiddlewareRepository : ( ( rule__MiddlewareRepository__Group__0 ) ) ;
    public final void ruleMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:380:2: ( ( ( rule__MiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:381:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:381:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:382:3: ( rule__MiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:383:3: ( rule__MiddlewareRepository__Group__0 )
            // InternalExpAuto.g:383:4: rule__MiddlewareRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiddlewareRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiddlewareRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiddlewareRepository"


    // $ANTLR start "entryRuleEventMiddlewareRepository"
    // InternalExpAuto.g:392:1: entryRuleEventMiddlewareRepository : ruleEventMiddlewareRepository EOF ;
    public final void entryRuleEventMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:393:1: ( ruleEventMiddlewareRepository EOF )
            // InternalExpAuto.g:394:1: ruleEventMiddlewareRepository EOF
            {
             before(grammarAccess.getEventMiddlewareRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleEventMiddlewareRepository();

            state._fsp--;

             after(grammarAccess.getEventMiddlewareRepositoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventMiddlewareRepository"


    // $ANTLR start "ruleEventMiddlewareRepository"
    // InternalExpAuto.g:401:1: ruleEventMiddlewareRepository : ( ( rule__EventMiddlewareRepository__Group__0 ) ) ;
    public final void ruleEventMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:405:2: ( ( ( rule__EventMiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:406:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:406:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:407:3: ( rule__EventMiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:408:3: ( rule__EventMiddlewareRepository__Group__0 )
            // InternalExpAuto.g:408:4: rule__EventMiddlewareRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventMiddlewareRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventMiddlewareRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventMiddlewareRepository"


    // $ANTLR start "entryRuleMonitorRepository"
    // InternalExpAuto.g:417:1: entryRuleMonitorRepository : ruleMonitorRepository EOF ;
    public final void entryRuleMonitorRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:418:1: ( ruleMonitorRepository EOF )
            // InternalExpAuto.g:419:1: ruleMonitorRepository EOF
            {
             before(grammarAccess.getMonitorRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitorRepository();

            state._fsp--;

             after(grammarAccess.getMonitorRepositoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMonitorRepository"


    // $ANTLR start "ruleMonitorRepository"
    // InternalExpAuto.g:426:1: ruleMonitorRepository : ( ( rule__MonitorRepository__Group__0 ) ) ;
    public final void ruleMonitorRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:430:2: ( ( ( rule__MonitorRepository__Group__0 ) ) )
            // InternalExpAuto.g:431:2: ( ( rule__MonitorRepository__Group__0 ) )
            {
            // InternalExpAuto.g:431:2: ( ( rule__MonitorRepository__Group__0 ) )
            // InternalExpAuto.g:432:3: ( rule__MonitorRepository__Group__0 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:433:3: ( rule__MonitorRepository__Group__0 )
            // InternalExpAuto.g:433:4: rule__MonitorRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitorRepository"


    // $ANTLR start "entryRuleVariation"
    // InternalExpAuto.g:442:1: entryRuleVariation : ruleVariation EOF ;
    public final void entryRuleVariation() throws RecognitionException {
        try {
            // InternalExpAuto.g:443:1: ( ruleVariation EOF )
            // InternalExpAuto.g:444:1: ruleVariation EOF
            {
             before(grammarAccess.getVariationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariation();

            state._fsp--;

             after(grammarAccess.getVariationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariation"


    // $ANTLR start "ruleVariation"
    // InternalExpAuto.g:451:1: ruleVariation : ( ( rule__Variation__Group__0 ) ) ;
    public final void ruleVariation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:455:2: ( ( ( rule__Variation__Group__0 ) ) )
            // InternalExpAuto.g:456:2: ( ( rule__Variation__Group__0 ) )
            {
            // InternalExpAuto.g:456:2: ( ( rule__Variation__Group__0 ) )
            // InternalExpAuto.g:457:3: ( rule__Variation__Group__0 )
            {
             before(grammarAccess.getVariationAccess().getGroup()); 
            // InternalExpAuto.g:458:3: ( rule__Variation__Group__0 )
            // InternalExpAuto.g:458:4: rule__Variation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariation"


    // $ANTLR start "entryRuleNestedIntervalsValueProvider"
    // InternalExpAuto.g:467:1: entryRuleNestedIntervalsValueProvider : ruleNestedIntervalsValueProvider EOF ;
    public final void entryRuleNestedIntervalsValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:468:1: ( ruleNestedIntervalsValueProvider EOF )
            // InternalExpAuto.g:469:1: ruleNestedIntervalsValueProvider EOF
            {
             before(grammarAccess.getNestedIntervalsValueProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedIntervalsValueProvider();

            state._fsp--;

             after(grammarAccess.getNestedIntervalsValueProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedIntervalsValueProvider"


    // $ANTLR start "ruleNestedIntervalsValueProvider"
    // InternalExpAuto.g:476:1: ruleNestedIntervalsValueProvider : ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) ;
    public final void ruleNestedIntervalsValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:480:2: ( ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:481:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:481:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            // InternalExpAuto.g:482:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:483:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            // InternalExpAuto.g:483:4: rule__NestedIntervalsValueProvider__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNestedIntervalsValueProviderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedIntervalsValueProvider"


    // $ANTLR start "entryRuleSetValueProvider"
    // InternalExpAuto.g:492:1: entryRuleSetValueProvider : ruleSetValueProvider EOF ;
    public final void entryRuleSetValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:493:1: ( ruleSetValueProvider EOF )
            // InternalExpAuto.g:494:1: ruleSetValueProvider EOF
            {
             before(grammarAccess.getSetValueProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleSetValueProvider();

            state._fsp--;

             after(grammarAccess.getSetValueProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetValueProvider"


    // $ANTLR start "ruleSetValueProvider"
    // InternalExpAuto.g:501:1: ruleSetValueProvider : ( ( rule__SetValueProvider__Alternatives ) ) ;
    public final void ruleSetValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:505:2: ( ( ( rule__SetValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:506:2: ( ( rule__SetValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:506:2: ( ( rule__SetValueProvider__Alternatives ) )
            // InternalExpAuto.g:507:3: ( rule__SetValueProvider__Alternatives )
            {
             before(grammarAccess.getSetValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:508:3: ( rule__SetValueProvider__Alternatives )
            // InternalExpAuto.g:508:4: rule__SetValueProvider__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetValueProviderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetValueProvider"


    // $ANTLR start "entryRuleLinearValueProvider"
    // InternalExpAuto.g:517:1: entryRuleLinearValueProvider : ruleLinearValueProvider EOF ;
    public final void entryRuleLinearValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:518:1: ( ruleLinearValueProvider EOF )
            // InternalExpAuto.g:519:1: ruleLinearValueProvider EOF
            {
             before(grammarAccess.getLinearValueProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleLinearValueProvider();

            state._fsp--;

             after(grammarAccess.getLinearValueProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinearValueProvider"


    // $ANTLR start "ruleLinearValueProvider"
    // InternalExpAuto.g:526:1: ruleLinearValueProvider : ( ( rule__LinearValueProvider__Group__0 ) ) ;
    public final void ruleLinearValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:530:2: ( ( ( rule__LinearValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:531:2: ( ( rule__LinearValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:531:2: ( ( rule__LinearValueProvider__Group__0 ) )
            // InternalExpAuto.g:532:3: ( rule__LinearValueProvider__Group__0 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:533:3: ( rule__LinearValueProvider__Group__0 )
            // InternalExpAuto.g:533:4: rule__LinearValueProvider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinearValueProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearValueProvider"


    // $ANTLR start "entryRuleExponentialValueProvider"
    // InternalExpAuto.g:542:1: entryRuleExponentialValueProvider : ruleExponentialValueProvider EOF ;
    public final void entryRuleExponentialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:543:1: ( ruleExponentialValueProvider EOF )
            // InternalExpAuto.g:544:1: ruleExponentialValueProvider EOF
            {
             before(grammarAccess.getExponentialValueProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleExponentialValueProvider();

            state._fsp--;

             after(grammarAccess.getExponentialValueProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponentialValueProvider"


    // $ANTLR start "ruleExponentialValueProvider"
    // InternalExpAuto.g:551:1: ruleExponentialValueProvider : ( ( rule__ExponentialValueProvider__Group__0 ) ) ;
    public final void ruleExponentialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:555:2: ( ( ( rule__ExponentialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:556:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:556:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            // InternalExpAuto.g:557:3: ( rule__ExponentialValueProvider__Group__0 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:558:3: ( rule__ExponentialValueProvider__Group__0 )
            // InternalExpAuto.g:558:4: rule__ExponentialValueProvider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentialValueProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponentialValueProvider"


    // $ANTLR start "entryRulePolynomialValueProvider"
    // InternalExpAuto.g:567:1: entryRulePolynomialValueProvider : rulePolynomialValueProvider EOF ;
    public final void entryRulePolynomialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:568:1: ( rulePolynomialValueProvider EOF )
            // InternalExpAuto.g:569:1: rulePolynomialValueProvider EOF
            {
             before(grammarAccess.getPolynomialValueProviderRule()); 
            pushFollow(FOLLOW_1);
            rulePolynomialValueProvider();

            state._fsp--;

             after(grammarAccess.getPolynomialValueProviderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolynomialValueProvider"


    // $ANTLR start "rulePolynomialValueProvider"
    // InternalExpAuto.g:576:1: rulePolynomialValueProvider : ( ( rule__PolynomialValueProvider__Group__0 ) ) ;
    public final void rulePolynomialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:580:2: ( ( ( rule__PolynomialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:581:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:581:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            // InternalExpAuto.g:582:3: ( rule__PolynomialValueProvider__Group__0 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:583:3: ( rule__PolynomialValueProvider__Group__0 )
            // InternalExpAuto.g:583:4: rule__PolynomialValueProvider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolynomialValueProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolynomialValueProvider"


    // $ANTLR start "entryRuleStopTimeCondition"
    // InternalExpAuto.g:592:1: entryRuleStopTimeCondition : ruleStopTimeCondition EOF ;
    public final void entryRuleStopTimeCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:593:1: ( ruleStopTimeCondition EOF )
            // InternalExpAuto.g:594:1: ruleStopTimeCondition EOF
            {
             before(grammarAccess.getStopTimeConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleStopTimeCondition();

            state._fsp--;

             after(grammarAccess.getStopTimeConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStopTimeCondition"


    // $ANTLR start "ruleStopTimeCondition"
    // InternalExpAuto.g:601:1: ruleStopTimeCondition : ( ( rule__StopTimeCondition__Group__0 ) ) ;
    public final void ruleStopTimeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:605:2: ( ( ( rule__StopTimeCondition__Group__0 ) ) )
            // InternalExpAuto.g:606:2: ( ( rule__StopTimeCondition__Group__0 ) )
            {
            // InternalExpAuto.g:606:2: ( ( rule__StopTimeCondition__Group__0 ) )
            // InternalExpAuto.g:607:3: ( rule__StopTimeCondition__Group__0 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getGroup()); 
            // InternalExpAuto.g:608:3: ( rule__StopTimeCondition__Group__0 )
            // InternalExpAuto.g:608:4: rule__StopTimeCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopTimeConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStopTimeCondition"


    // $ANTLR start "entryRuleStopCountCondition"
    // InternalExpAuto.g:617:1: entryRuleStopCountCondition : ruleStopCountCondition EOF ;
    public final void entryRuleStopCountCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:618:1: ( ruleStopCountCondition EOF )
            // InternalExpAuto.g:619:1: ruleStopCountCondition EOF
            {
             before(grammarAccess.getStopCountConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleStopCountCondition();

            state._fsp--;

             after(grammarAccess.getStopCountConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStopCountCondition"


    // $ANTLR start "ruleStopCountCondition"
    // InternalExpAuto.g:626:1: ruleStopCountCondition : ( ( rule__StopCountCondition__Group__0 ) ) ;
    public final void ruleStopCountCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:630:2: ( ( ( rule__StopCountCondition__Group__0 ) ) )
            // InternalExpAuto.g:631:2: ( ( rule__StopCountCondition__Group__0 ) )
            {
            // InternalExpAuto.g:631:2: ( ( rule__StopCountCondition__Group__0 ) )
            // InternalExpAuto.g:632:3: ( rule__StopCountCondition__Group__0 )
            {
             before(grammarAccess.getStopCountConditionAccess().getGroup()); 
            // InternalExpAuto.g:633:3: ( rule__StopCountCondition__Group__0 )
            // InternalExpAuto.g:633:4: rule__StopCountCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopCountConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStopCountCondition"


    // $ANTLR start "entryRuleNumberOfExperiments"
    // InternalExpAuto.g:642:1: entryRuleNumberOfExperiments : ruleNumberOfExperiments EOF ;
    public final void entryRuleNumberOfExperiments() throws RecognitionException {
        try {
            // InternalExpAuto.g:643:1: ( ruleNumberOfExperiments EOF )
            // InternalExpAuto.g:644:1: ruleNumberOfExperiments EOF
            {
             before(grammarAccess.getNumberOfExperimentsRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberOfExperiments();

            state._fsp--;

             after(grammarAccess.getNumberOfExperimentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberOfExperiments"


    // $ANTLR start "ruleNumberOfExperiments"
    // InternalExpAuto.g:651:1: ruleNumberOfExperiments : ( ( rule__NumberOfExperiments__Group__0 ) ) ;
    public final void ruleNumberOfExperiments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:655:2: ( ( ( rule__NumberOfExperiments__Group__0 ) ) )
            // InternalExpAuto.g:656:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            {
            // InternalExpAuto.g:656:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            // InternalExpAuto.g:657:3: ( rule__NumberOfExperiments__Group__0 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getGroup()); 
            // InternalExpAuto.g:658:3: ( rule__NumberOfExperiments__Group__0 )
            // InternalExpAuto.g:658:4: rule__NumberOfExperiments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberOfExperiments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberOfExperimentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberOfExperiments"


    // $ANTLR start "entryRuleSeedDefinition"
    // InternalExpAuto.g:667:1: entryRuleSeedDefinition : ruleSeedDefinition EOF ;
    public final void entryRuleSeedDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:668:1: ( ruleSeedDefinition EOF )
            // InternalExpAuto.g:669:1: ruleSeedDefinition EOF
            {
             before(grammarAccess.getSeedDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSeedDefinition();

            state._fsp--;

             after(grammarAccess.getSeedDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeedDefinition"


    // $ANTLR start "ruleSeedDefinition"
    // InternalExpAuto.g:676:1: ruleSeedDefinition : ( ( rule__SeedDefinition__Group__0 ) ) ;
    public final void ruleSeedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:680:2: ( ( ( rule__SeedDefinition__Group__0 ) ) )
            // InternalExpAuto.g:681:2: ( ( rule__SeedDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:681:2: ( ( rule__SeedDefinition__Group__0 ) )
            // InternalExpAuto.g:682:3: ( rule__SeedDefinition__Group__0 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:683:3: ( rule__SeedDefinition__Group__0 )
            // InternalExpAuto.g:683:4: rule__SeedDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeedDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeedDefinition"


    // $ANTLR start "entryRuleListOfSeeds"
    // InternalExpAuto.g:692:1: entryRuleListOfSeeds : ruleListOfSeeds EOF ;
    public final void entryRuleListOfSeeds() throws RecognitionException {
        try {
            // InternalExpAuto.g:693:1: ( ruleListOfSeeds EOF )
            // InternalExpAuto.g:694:1: ruleListOfSeeds EOF
            {
             before(grammarAccess.getListOfSeedsRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfSeeds();

            state._fsp--;

             after(grammarAccess.getListOfSeedsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfSeeds"


    // $ANTLR start "ruleListOfSeeds"
    // InternalExpAuto.g:701:1: ruleListOfSeeds : ( ( rule__ListOfSeeds__Group__0 ) ) ;
    public final void ruleListOfSeeds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:705:2: ( ( ( rule__ListOfSeeds__Group__0 ) ) )
            // InternalExpAuto.g:706:2: ( ( rule__ListOfSeeds__Group__0 ) )
            {
            // InternalExpAuto.g:706:2: ( ( rule__ListOfSeeds__Group__0 ) )
            // InternalExpAuto.g:707:3: ( rule__ListOfSeeds__Group__0 )
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup()); 
            // InternalExpAuto.g:708:3: ( rule__ListOfSeeds__Group__0 )
            // InternalExpAuto.g:708:4: rule__ListOfSeeds__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfSeedsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfSeeds"


    // $ANTLR start "entryRuleExperimentDatasource"
    // InternalExpAuto.g:717:1: entryRuleExperimentDatasource : ruleExperimentDatasource EOF ;
    public final void entryRuleExperimentDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:718:1: ( ruleExperimentDatasource EOF )
            // InternalExpAuto.g:719:1: ruleExperimentDatasource EOF
            {
             before(grammarAccess.getExperimentDatasourceRule()); 
            pushFollow(FOLLOW_1);
            ruleExperimentDatasource();

            state._fsp--;

             after(grammarAccess.getExperimentDatasourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperimentDatasource"


    // $ANTLR start "ruleExperimentDatasource"
    // InternalExpAuto.g:726:1: ruleExperimentDatasource : ( ( rule__ExperimentDatasource__Group__0 ) ) ;
    public final void ruleExperimentDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:730:2: ( ( ( rule__ExperimentDatasource__Group__0 ) ) )
            // InternalExpAuto.g:731:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:731:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            // InternalExpAuto.g:732:3: ( rule__ExperimentDatasource__Group__0 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:733:3: ( rule__ExperimentDatasource__Group__0 )
            // InternalExpAuto.g:733:4: rule__ExperimentDatasource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentDatasource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentDatasourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentDatasource"


    // $ANTLR start "entryRuleToolDefinition"
    // InternalExpAuto.g:742:1: entryRuleToolDefinition : ruleToolDefinition EOF ;
    public final void entryRuleToolDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:743:1: ( ruleToolDefinition EOF )
            // InternalExpAuto.g:744:1: ruleToolDefinition EOF
            {
             before(grammarAccess.getToolDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleToolDefinition();

            state._fsp--;

             after(grammarAccess.getToolDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToolDefinition"


    // $ANTLR start "ruleToolDefinition"
    // InternalExpAuto.g:751:1: ruleToolDefinition : ( ( rule__ToolDefinition__Group__0 ) ) ;
    public final void ruleToolDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:755:2: ( ( ( rule__ToolDefinition__Group__0 ) ) )
            // InternalExpAuto.g:756:2: ( ( rule__ToolDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:756:2: ( ( rule__ToolDefinition__Group__0 ) )
            // InternalExpAuto.g:757:3: ( rule__ToolDefinition__Group__0 )
            {
             before(grammarAccess.getToolDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:758:3: ( rule__ToolDefinition__Group__0 )
            // InternalExpAuto.g:758:4: rule__ToolDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToolDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToolDefinition"


    // $ANTLR start "entryRuleConfigurationParams"
    // InternalExpAuto.g:767:1: entryRuleConfigurationParams : ruleConfigurationParams EOF ;
    public final void entryRuleConfigurationParams() throws RecognitionException {
        try {
            // InternalExpAuto.g:768:1: ( ruleConfigurationParams EOF )
            // InternalExpAuto.g:769:1: ruleConfigurationParams EOF
            {
             before(grammarAccess.getConfigurationParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationParams();

            state._fsp--;

             after(grammarAccess.getConfigurationParamsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationParams"


    // $ANTLR start "ruleConfigurationParams"
    // InternalExpAuto.g:776:1: ruleConfigurationParams : ( ( rule__ConfigurationParams__Group__0 ) ) ;
    public final void ruleConfigurationParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:780:2: ( ( ( rule__ConfigurationParams__Group__0 ) ) )
            // InternalExpAuto.g:781:2: ( ( rule__ConfigurationParams__Group__0 ) )
            {
            // InternalExpAuto.g:781:2: ( ( rule__ConfigurationParams__Group__0 ) )
            // InternalExpAuto.g:782:3: ( rule__ConfigurationParams__Group__0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getGroup()); 
            // InternalExpAuto.g:783:3: ( rule__ConfigurationParams__Group__0 )
            // InternalExpAuto.g:783:4: rule__ConfigurationParams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationParams"


    // $ANTLR start "entryRuleConfigValue"
    // InternalExpAuto.g:792:1: entryRuleConfigValue : ruleConfigValue EOF ;
    public final void entryRuleConfigValue() throws RecognitionException {
        try {
            // InternalExpAuto.g:793:1: ( ruleConfigValue EOF )
            // InternalExpAuto.g:794:1: ruleConfigValue EOF
            {
             before(grammarAccess.getConfigValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigValue();

            state._fsp--;

             after(grammarAccess.getConfigValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigValue"


    // $ANTLR start "ruleConfigValue"
    // InternalExpAuto.g:801:1: ruleConfigValue : ( ( rule__ConfigValue__Alternatives ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:805:2: ( ( ( rule__ConfigValue__Alternatives ) ) )
            // InternalExpAuto.g:806:2: ( ( rule__ConfigValue__Alternatives ) )
            {
            // InternalExpAuto.g:806:2: ( ( rule__ConfigValue__Alternatives ) )
            // InternalExpAuto.g:807:3: ( rule__ConfigValue__Alternatives )
            {
             before(grammarAccess.getConfigValueAccess().getAlternatives()); 
            // InternalExpAuto.g:808:3: ( rule__ConfigValue__Alternatives )
            // InternalExpAuto.g:808:4: rule__ConfigValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConfigValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigValue"


    // $ANTLR start "rule__Datasource__Alternatives"
    // InternalExpAuto.g:816:1: rule__Datasource__Alternatives : ( ( ruleFileDatasource ) | ( ruleMemoryDatasource ) );
    public final void rule__Datasource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:820:1: ( ( ruleFileDatasource ) | ( ruleMemoryDatasource ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==15) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==46) ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4==16) ) {
                                alt3=1;
                            }
                            else if ( (LA3_4==EOF||LA3_4==14||LA3_4==18) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpAuto.g:821:2: ( ruleFileDatasource )
                    {
                    // InternalExpAuto.g:821:2: ( ruleFileDatasource )
                    // InternalExpAuto.g:822:3: ruleFileDatasource
                    {
                     before(grammarAccess.getDatasourceAccess().getFileDatasourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFileDatasource();

                    state._fsp--;

                     after(grammarAccess.getDatasourceAccess().getFileDatasourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:827:2: ( ruleMemoryDatasource )
                    {
                    // InternalExpAuto.g:827:2: ( ruleMemoryDatasource )
                    // InternalExpAuto.g:828:3: ruleMemoryDatasource
                    {
                     before(grammarAccess.getDatasourceAccess().getMemoryDatasourceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMemoryDatasource();

                    state._fsp--;

                     after(grammarAccess.getDatasourceAccess().getMemoryDatasourceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Alternatives"


    // $ANTLR start "rule__Experiment__DesignAlternatives_3_0"
    // InternalExpAuto.g:837:1: rule__Experiment__DesignAlternatives_3_0 : ( ( 'FullFactorial' ) | ( 'OneFactor' ) );
    public final void rule__Experiment__DesignAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:841:1: ( ( 'FullFactorial' ) | ( 'OneFactor' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpAuto.g:842:2: ( 'FullFactorial' )
                    {
                    // InternalExpAuto.g:842:2: ( 'FullFactorial' )
                    // InternalExpAuto.g:843:3: 'FullFactorial'
                    {
                     before(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:848:2: ( 'OneFactor' )
                    {
                    // InternalExpAuto.g:848:2: ( 'OneFactor' )
                    // InternalExpAuto.g:849:3: 'OneFactor'
                    {
                     before(grammarAccess.getExperimentAccess().getDesignOneFactorKeyword_3_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExperimentAccess().getDesignOneFactorKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__DesignAlternatives_3_0"


    // $ANTLR start "rule__ExperimentSpecifications__SpecificationsAlternatives_0"
    // InternalExpAuto.g:858:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) );
    public final void rule__ExperimentSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:862:1: ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalExpAuto.g:863:2: ( ruleDescription )
                    {
                    // InternalExpAuto.g:863:2: ( ruleDescription )
                    // InternalExpAuto.g:864:3: ruleDescription
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsDescriptionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsDescriptionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:869:2: ( ruleInitialModel )
                    {
                    // InternalExpAuto.g:869:2: ( ruleInitialModel )
                    // InternalExpAuto.g:870:3: ruleInitialModel
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsInitialModelParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInitialModel();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsInitialModelParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpAuto.g:875:2: ( ruleVariation )
                    {
                    // InternalExpAuto.g:875:2: ( ruleVariation )
                    // InternalExpAuto.g:876:3: ruleVariation
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsVariationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariation();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsVariationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpAuto.g:881:2: ( ruleStopTimeCondition )
                    {
                    // InternalExpAuto.g:881:2: ( ruleStopTimeCondition )
                    // InternalExpAuto.g:882:3: ruleStopTimeCondition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopTimeConditionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStopTimeCondition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopTimeConditionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpAuto.g:887:2: ( ruleStopCountCondition )
                    {
                    // InternalExpAuto.g:887:2: ( ruleStopCountCondition )
                    // InternalExpAuto.g:888:3: ruleStopCountCondition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopCountConditionParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStopCountCondition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsStopCountConditionParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExpAuto.g:893:2: ( ruleNumberOfExperiments )
                    {
                    // InternalExpAuto.g:893:2: ( ruleNumberOfExperiments )
                    // InternalExpAuto.g:894:3: ruleNumberOfExperiments
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsNumberOfExperimentsParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberOfExperiments();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsNumberOfExperimentsParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExpAuto.g:899:2: ( ruleSeedDefinition )
                    {
                    // InternalExpAuto.g:899:2: ( ruleSeedDefinition )
                    // InternalExpAuto.g:900:3: ruleSeedDefinition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsSeedDefinitionParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSeedDefinition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsSeedDefinitionParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalExpAuto.g:905:2: ( ruleExperimentDatasource )
                    {
                    // InternalExpAuto.g:905:2: ( ruleExperimentDatasource )
                    // InternalExpAuto.g:906:3: ruleExperimentDatasource
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsExperimentDatasourceParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleExperimentDatasource();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsExperimentDatasourceParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalExpAuto.g:911:2: ( ruleToolDefinition )
                    {
                    // InternalExpAuto.g:911:2: ( ruleToolDefinition )
                    // InternalExpAuto.g:912:3: ruleToolDefinition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleToolDefinition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentSpecifications__SpecificationsAlternatives_0"


    // $ANTLR start "rule__InitSpecifications__SpecificationsAlternatives_0"
    // InternalExpAuto.g:921:1: rule__InitSpecifications__SpecificationsAlternatives_0 : ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) );
    public final void rule__InitSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:925:1: ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExpAuto.g:926:2: ( ruleAllocationModel )
                    {
                    // InternalExpAuto.g:926:2: ( ruleAllocationModel )
                    // InternalExpAuto.g:927:3: ruleAllocationModel
                    {
                     before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAllocationModelParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllocationModel();

                    state._fsp--;

                     after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAllocationModelParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:932:2: ( ruleUsageModel )
                    {
                    // InternalExpAuto.g:932:2: ( ruleUsageModel )
                    // InternalExpAuto.g:933:3: ruleUsageModel
                    {
                     before(grammarAccess.getInitSpecificationsAccess().getSpecificationsUsageModelParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUsageModel();

                    state._fsp--;

                     after(grammarAccess.getInitSpecificationsAccess().getSpecificationsUsageModelParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpAuto.g:938:2: ( ruleMiddlewareRepository )
                    {
                    // InternalExpAuto.g:938:2: ( ruleMiddlewareRepository )
                    // InternalExpAuto.g:939:3: ruleMiddlewareRepository
                    {
                     before(grammarAccess.getInitSpecificationsAccess().getSpecificationsMiddlewareRepositoryParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMiddlewareRepository();

                    state._fsp--;

                     after(grammarAccess.getInitSpecificationsAccess().getSpecificationsMiddlewareRepositoryParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpAuto.g:944:2: ( ruleEventMiddlewareRepository )
                    {
                    // InternalExpAuto.g:944:2: ( ruleEventMiddlewareRepository )
                    // InternalExpAuto.g:945:3: ruleEventMiddlewareRepository
                    {
                     before(grammarAccess.getInitSpecificationsAccess().getSpecificationsEventMiddlewareRepositoryParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEventMiddlewareRepository();

                    state._fsp--;

                     after(grammarAccess.getInitSpecificationsAccess().getSpecificationsEventMiddlewareRepositoryParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpAuto.g:950:2: ( ruleMonitorRepository )
                    {
                    // InternalExpAuto.g:950:2: ( ruleMonitorRepository )
                    // InternalExpAuto.g:951:3: ruleMonitorRepository
                    {
                     before(grammarAccess.getInitSpecificationsAccess().getSpecificationsMonitorRepositoryParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMonitorRepository();

                    state._fsp--;

                     after(grammarAccess.getInitSpecificationsAccess().getSpecificationsMonitorRepositoryParserRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitSpecifications__SpecificationsAlternatives_0"


    // $ANTLR start "rule__Variation__ValueProviderAlternatives_13_0"
    // InternalExpAuto.g:960:1: rule__Variation__ValueProviderAlternatives_13_0 : ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) );
    public final void rule__Variation__ValueProviderAlternatives_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:964:1: ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 33:
            case 36:
                {
                alt7=1;
                }
                break;
            case 19:
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 39:
                {
                alt7=4;
                }
                break;
            case 40:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExpAuto.g:965:2: ( ruleNestedIntervalsValueProvider )
                    {
                    // InternalExpAuto.g:965:2: ( ruleNestedIntervalsValueProvider )
                    // InternalExpAuto.g:966:3: ruleNestedIntervalsValueProvider
                    {
                     before(grammarAccess.getVariationAccess().getValueProviderNestedIntervalsValueProviderParserRuleCall_13_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedIntervalsValueProvider();

                    state._fsp--;

                     after(grammarAccess.getVariationAccess().getValueProviderNestedIntervalsValueProviderParserRuleCall_13_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:971:2: ( ruleSetValueProvider )
                    {
                    // InternalExpAuto.g:971:2: ( ruleSetValueProvider )
                    // InternalExpAuto.g:972:3: ruleSetValueProvider
                    {
                     before(grammarAccess.getVariationAccess().getValueProviderSetValueProviderParserRuleCall_13_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetValueProvider();

                    state._fsp--;

                     after(grammarAccess.getVariationAccess().getValueProviderSetValueProviderParserRuleCall_13_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpAuto.g:977:2: ( ruleLinearValueProvider )
                    {
                    // InternalExpAuto.g:977:2: ( ruleLinearValueProvider )
                    // InternalExpAuto.g:978:3: ruleLinearValueProvider
                    {
                     before(grammarAccess.getVariationAccess().getValueProviderLinearValueProviderParserRuleCall_13_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinearValueProvider();

                    state._fsp--;

                     after(grammarAccess.getVariationAccess().getValueProviderLinearValueProviderParserRuleCall_13_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpAuto.g:983:2: ( ruleExponentialValueProvider )
                    {
                    // InternalExpAuto.g:983:2: ( ruleExponentialValueProvider )
                    // InternalExpAuto.g:984:3: ruleExponentialValueProvider
                    {
                     before(grammarAccess.getVariationAccess().getValueProviderExponentialValueProviderParserRuleCall_13_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExponentialValueProvider();

                    state._fsp--;

                     after(grammarAccess.getVariationAccess().getValueProviderExponentialValueProviderParserRuleCall_13_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpAuto.g:989:2: ( rulePolynomialValueProvider )
                    {
                    // InternalExpAuto.g:989:2: ( rulePolynomialValueProvider )
                    // InternalExpAuto.g:990:3: rulePolynomialValueProvider
                    {
                     before(grammarAccess.getVariationAccess().getValueProviderPolynomialValueProviderParserRuleCall_13_0_4()); 
                    pushFollow(FOLLOW_2);
                    rulePolynomialValueProvider();

                    state._fsp--;

                     after(grammarAccess.getVariationAccess().getValueProviderPolynomialValueProviderParserRuleCall_13_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__ValueProviderAlternatives_13_0"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Alternatives"
    // InternalExpAuto.g:999:1: rule__NestedIntervalsValueProvider__Alternatives : ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) );
    public final void rule__NestedIntervalsValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1003:1: ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            else if ( (LA8_0==36) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpAuto.g:1004:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1004:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1005:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1006:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1006:4: rule__NestedIntervalsValueProvider__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedIntervalsValueProvider__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1010:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1010:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1011:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1012:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1012:4: rule__NestedIntervalsValueProvider__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedIntervalsValueProvider__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Alternatives"


    // $ANTLR start "rule__SetValueProvider__Alternatives"
    // InternalExpAuto.g:1020:1: rule__SetValueProvider__Alternatives : ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) );
    public final void rule__SetValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1024:1: ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==37) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpAuto.g:1025:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1025:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1026:3: ( rule__SetValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1027:3: ( rule__SetValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1027:4: rule__SetValueProvider__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetValueProvider__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetValueProviderAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1031:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1031:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1032:3: ( rule__SetValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1033:3: ( rule__SetValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1033:4: rule__SetValueProvider__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetValueProvider__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetValueProviderAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Alternatives"


    // $ANTLR start "rule__ConfigValue__Alternatives"
    // InternalExpAuto.g:1041:1: rule__ConfigValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__ConfigValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1045:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpAuto.g:1046:2: ( RULE_STRING )
                    {
                    // InternalExpAuto.g:1046:2: ( RULE_STRING )
                    // InternalExpAuto.g:1047:3: RULE_STRING
                    {
                     before(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1052:2: ( RULE_INT )
                    {
                    // InternalExpAuto.g:1052:2: ( RULE_INT )
                    // InternalExpAuto.g:1053:3: RULE_INT
                    {
                     before(grammarAccess.getConfigValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigValue__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalExpAuto.g:1062:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1066:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpAuto.g:1067:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalExpAuto.g:1074:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1078:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalExpAuto.g:1079:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalExpAuto.g:1079:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalExpAuto.g:1080:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalExpAuto.g:1080:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalExpAuto.g:1081:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1082:3: ( rule__Model__ImportsAssignment_0 )
            // InternalExpAuto.g:1082:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_6);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalExpAuto.g:1085:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalExpAuto.g:1086:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1087:3: ( rule__Model__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpAuto.g:1087:4: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalExpAuto.g:1096:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1100:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalExpAuto.g:1101:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalExpAuto.g:1108:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1112:1: ( ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) )
            // InternalExpAuto.g:1113:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            {
            // InternalExpAuto.g:1113:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            // InternalExpAuto.g:1114:2: ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* )
            {
            // InternalExpAuto.g:1114:2: ( ( rule__Model__DatasourcesAssignment_1 ) )
            // InternalExpAuto.g:1115:3: ( rule__Model__DatasourcesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1116:3: ( rule__Model__DatasourcesAssignment_1 )
            // InternalExpAuto.g:1116:4: rule__Model__DatasourcesAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Model__DatasourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }

            // InternalExpAuto.g:1119:2: ( ( rule__Model__DatasourcesAssignment_1 )* )
            // InternalExpAuto.g:1120:3: ( rule__Model__DatasourcesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1121:3: ( rule__Model__DatasourcesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpAuto.g:1121:4: rule__Model__DatasourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__DatasourcesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalExpAuto.g:1130:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1134:1: ( rule__Model__Group__2__Impl )
            // InternalExpAuto.g:1135:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalExpAuto.g:1141:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1145:1: ( ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) )
            // InternalExpAuto.g:1146:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            {
            // InternalExpAuto.g:1146:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            // InternalExpAuto.g:1147:2: ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* )
            {
            // InternalExpAuto.g:1147:2: ( ( rule__Model__ExperimentsAssignment_2 ) )
            // InternalExpAuto.g:1148:3: ( rule__Model__ExperimentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1149:3: ( rule__Model__ExperimentsAssignment_2 )
            // InternalExpAuto.g:1149:4: rule__Model__ExperimentsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Model__ExperimentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }

            // InternalExpAuto.g:1152:2: ( ( rule__Model__ExperimentsAssignment_2 )* )
            // InternalExpAuto.g:1153:3: ( rule__Model__ExperimentsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1154:3: ( rule__Model__ExperimentsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpAuto.g:1154:4: rule__Model__ExperimentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__ExperimentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalExpAuto.g:1164:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1168:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalExpAuto.g:1169:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalExpAuto.g:1176:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1180:1: ( ( 'import' ) )
            // InternalExpAuto.g:1181:1: ( 'import' )
            {
            // InternalExpAuto.g:1181:1: ( 'import' )
            // InternalExpAuto.g:1182:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalExpAuto.g:1191:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1195:1: ( rule__Import__Group__1__Impl )
            // InternalExpAuto.g:1196:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalExpAuto.g:1202:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1206:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalExpAuto.g:1207:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalExpAuto.g:1207:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalExpAuto.g:1208:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalExpAuto.g:1209:2: ( rule__Import__PathAssignment_1 )
            // InternalExpAuto.g:1209:3: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__FileDatasource__Group__0"
    // InternalExpAuto.g:1218:1: rule__FileDatasource__Group__0 : rule__FileDatasource__Group__0__Impl rule__FileDatasource__Group__1 ;
    public final void rule__FileDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1222:1: ( rule__FileDatasource__Group__0__Impl rule__FileDatasource__Group__1 )
            // InternalExpAuto.g:1223:2: rule__FileDatasource__Group__0__Impl rule__FileDatasource__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FileDatasource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__0"


    // $ANTLR start "rule__FileDatasource__Group__0__Impl"
    // InternalExpAuto.g:1230:1: rule__FileDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__FileDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1234:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1235:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1235:1: ( 'datasource' )
            // InternalExpAuto.g:1236:2: 'datasource'
            {
             before(grammarAccess.getFileDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getDatasourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__0__Impl"


    // $ANTLR start "rule__FileDatasource__Group__1"
    // InternalExpAuto.g:1245:1: rule__FileDatasource__Group__1 : rule__FileDatasource__Group__1__Impl rule__FileDatasource__Group__2 ;
    public final void rule__FileDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1249:1: ( rule__FileDatasource__Group__1__Impl rule__FileDatasource__Group__2 )
            // InternalExpAuto.g:1250:2: rule__FileDatasource__Group__1__Impl rule__FileDatasource__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__FileDatasource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__1"


    // $ANTLR start "rule__FileDatasource__Group__1__Impl"
    // InternalExpAuto.g:1257:1: rule__FileDatasource__Group__1__Impl : ( ( rule__FileDatasource__NameAssignment_1 ) ) ;
    public final void rule__FileDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1261:1: ( ( ( rule__FileDatasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1262:1: ( ( rule__FileDatasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1262:1: ( ( rule__FileDatasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1263:2: ( rule__FileDatasource__NameAssignment_1 )
            {
             before(grammarAccess.getFileDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1264:2: ( rule__FileDatasource__NameAssignment_1 )
            // InternalExpAuto.g:1264:3: rule__FileDatasource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__1__Impl"


    // $ANTLR start "rule__FileDatasource__Group__2"
    // InternalExpAuto.g:1272:1: rule__FileDatasource__Group__2 : rule__FileDatasource__Group__2__Impl rule__FileDatasource__Group__3 ;
    public final void rule__FileDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1276:1: ( rule__FileDatasource__Group__2__Impl rule__FileDatasource__Group__3 )
            // InternalExpAuto.g:1277:2: rule__FileDatasource__Group__2__Impl rule__FileDatasource__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FileDatasource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__2"


    // $ANTLR start "rule__FileDatasource__Group__2__Impl"
    // InternalExpAuto.g:1284:1: rule__FileDatasource__Group__2__Impl : ( ':' ) ;
    public final void rule__FileDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1288:1: ( ( ':' ) )
            // InternalExpAuto.g:1289:1: ( ':' )
            {
            // InternalExpAuto.g:1289:1: ( ':' )
            // InternalExpAuto.g:1290:2: ':'
            {
             before(grammarAccess.getFileDatasourceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__2__Impl"


    // $ANTLR start "rule__FileDatasource__Group__3"
    // InternalExpAuto.g:1299:1: rule__FileDatasource__Group__3 : rule__FileDatasource__Group__3__Impl rule__FileDatasource__Group__4 ;
    public final void rule__FileDatasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1303:1: ( rule__FileDatasource__Group__3__Impl rule__FileDatasource__Group__4 )
            // InternalExpAuto.g:1304:2: rule__FileDatasource__Group__3__Impl rule__FileDatasource__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__FileDatasource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__3"


    // $ANTLR start "rule__FileDatasource__Group__3__Impl"
    // InternalExpAuto.g:1311:1: rule__FileDatasource__Group__3__Impl : ( ( rule__FileDatasource__SourceTypeAssignment_3 ) ) ;
    public final void rule__FileDatasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1315:1: ( ( ( rule__FileDatasource__SourceTypeAssignment_3 ) ) )
            // InternalExpAuto.g:1316:1: ( ( rule__FileDatasource__SourceTypeAssignment_3 ) )
            {
            // InternalExpAuto.g:1316:1: ( ( rule__FileDatasource__SourceTypeAssignment_3 ) )
            // InternalExpAuto.g:1317:2: ( rule__FileDatasource__SourceTypeAssignment_3 )
            {
             before(grammarAccess.getFileDatasourceAccess().getSourceTypeAssignment_3()); 
            // InternalExpAuto.g:1318:2: ( rule__FileDatasource__SourceTypeAssignment_3 )
            // InternalExpAuto.g:1318:3: rule__FileDatasource__SourceTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasource__SourceTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceAccess().getSourceTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__3__Impl"


    // $ANTLR start "rule__FileDatasource__Group__4"
    // InternalExpAuto.g:1326:1: rule__FileDatasource__Group__4 : rule__FileDatasource__Group__4__Impl rule__FileDatasource__Group__5 ;
    public final void rule__FileDatasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1330:1: ( rule__FileDatasource__Group__4__Impl rule__FileDatasource__Group__5 )
            // InternalExpAuto.g:1331:2: rule__FileDatasource__Group__4__Impl rule__FileDatasource__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__FileDatasource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__4"


    // $ANTLR start "rule__FileDatasource__Group__4__Impl"
    // InternalExpAuto.g:1338:1: rule__FileDatasource__Group__4__Impl : ( '(' ) ;
    public final void rule__FileDatasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1342:1: ( ( '(' ) )
            // InternalExpAuto.g:1343:1: ( '(' )
            {
            // InternalExpAuto.g:1343:1: ( '(' )
            // InternalExpAuto.g:1344:2: '('
            {
             before(grammarAccess.getFileDatasourceAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__4__Impl"


    // $ANTLR start "rule__FileDatasource__Group__5"
    // InternalExpAuto.g:1353:1: rule__FileDatasource__Group__5 : rule__FileDatasource__Group__5__Impl rule__FileDatasource__Group__6 ;
    public final void rule__FileDatasource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1357:1: ( rule__FileDatasource__Group__5__Impl rule__FileDatasource__Group__6 )
            // InternalExpAuto.g:1358:2: rule__FileDatasource__Group__5__Impl rule__FileDatasource__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__FileDatasource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__5"


    // $ANTLR start "rule__FileDatasource__Group__5__Impl"
    // InternalExpAuto.g:1365:1: rule__FileDatasource__Group__5__Impl : ( ( rule__FileDatasource__SourceURIAssignment_5 ) ) ;
    public final void rule__FileDatasource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1369:1: ( ( ( rule__FileDatasource__SourceURIAssignment_5 ) ) )
            // InternalExpAuto.g:1370:1: ( ( rule__FileDatasource__SourceURIAssignment_5 ) )
            {
            // InternalExpAuto.g:1370:1: ( ( rule__FileDatasource__SourceURIAssignment_5 ) )
            // InternalExpAuto.g:1371:2: ( rule__FileDatasource__SourceURIAssignment_5 )
            {
             before(grammarAccess.getFileDatasourceAccess().getSourceURIAssignment_5()); 
            // InternalExpAuto.g:1372:2: ( rule__FileDatasource__SourceURIAssignment_5 )
            // InternalExpAuto.g:1372:3: rule__FileDatasource__SourceURIAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasource__SourceURIAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceAccess().getSourceURIAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__5__Impl"


    // $ANTLR start "rule__FileDatasource__Group__6"
    // InternalExpAuto.g:1380:1: rule__FileDatasource__Group__6 : rule__FileDatasource__Group__6__Impl ;
    public final void rule__FileDatasource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1384:1: ( rule__FileDatasource__Group__6__Impl )
            // InternalExpAuto.g:1385:2: rule__FileDatasource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasource__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__6"


    // $ANTLR start "rule__FileDatasource__Group__6__Impl"
    // InternalExpAuto.g:1391:1: rule__FileDatasource__Group__6__Impl : ( ')' ) ;
    public final void rule__FileDatasource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1395:1: ( ( ')' ) )
            // InternalExpAuto.g:1396:1: ( ')' )
            {
            // InternalExpAuto.g:1396:1: ( ')' )
            // InternalExpAuto.g:1397:2: ')'
            {
             before(grammarAccess.getFileDatasourceAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__Group__6__Impl"


    // $ANTLR start "rule__MemoryDatasource__Group__0"
    // InternalExpAuto.g:1407:1: rule__MemoryDatasource__Group__0 : rule__MemoryDatasource__Group__0__Impl rule__MemoryDatasource__Group__1 ;
    public final void rule__MemoryDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1411:1: ( rule__MemoryDatasource__Group__0__Impl rule__MemoryDatasource__Group__1 )
            // InternalExpAuto.g:1412:2: rule__MemoryDatasource__Group__0__Impl rule__MemoryDatasource__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MemoryDatasource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__0"


    // $ANTLR start "rule__MemoryDatasource__Group__0__Impl"
    // InternalExpAuto.g:1419:1: rule__MemoryDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__MemoryDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1423:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1424:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1424:1: ( 'datasource' )
            // InternalExpAuto.g:1425:2: 'datasource'
            {
             before(grammarAccess.getMemoryDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemoryDatasourceAccess().getDatasourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__0__Impl"


    // $ANTLR start "rule__MemoryDatasource__Group__1"
    // InternalExpAuto.g:1434:1: rule__MemoryDatasource__Group__1 : rule__MemoryDatasource__Group__1__Impl rule__MemoryDatasource__Group__2 ;
    public final void rule__MemoryDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1438:1: ( rule__MemoryDatasource__Group__1__Impl rule__MemoryDatasource__Group__2 )
            // InternalExpAuto.g:1439:2: rule__MemoryDatasource__Group__1__Impl rule__MemoryDatasource__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MemoryDatasource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__1"


    // $ANTLR start "rule__MemoryDatasource__Group__1__Impl"
    // InternalExpAuto.g:1446:1: rule__MemoryDatasource__Group__1__Impl : ( ( rule__MemoryDatasource__NameAssignment_1 ) ) ;
    public final void rule__MemoryDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1450:1: ( ( ( rule__MemoryDatasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1451:1: ( ( rule__MemoryDatasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1451:1: ( ( rule__MemoryDatasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1452:2: ( rule__MemoryDatasource__NameAssignment_1 )
            {
             before(grammarAccess.getMemoryDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1453:2: ( rule__MemoryDatasource__NameAssignment_1 )
            // InternalExpAuto.g:1453:3: rule__MemoryDatasource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemoryDatasourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__1__Impl"


    // $ANTLR start "rule__MemoryDatasource__Group__2"
    // InternalExpAuto.g:1461:1: rule__MemoryDatasource__Group__2 : rule__MemoryDatasource__Group__2__Impl rule__MemoryDatasource__Group__3 ;
    public final void rule__MemoryDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1465:1: ( rule__MemoryDatasource__Group__2__Impl rule__MemoryDatasource__Group__3 )
            // InternalExpAuto.g:1466:2: rule__MemoryDatasource__Group__2__Impl rule__MemoryDatasource__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MemoryDatasource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__2"


    // $ANTLR start "rule__MemoryDatasource__Group__2__Impl"
    // InternalExpAuto.g:1473:1: rule__MemoryDatasource__Group__2__Impl : ( ':' ) ;
    public final void rule__MemoryDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1477:1: ( ( ':' ) )
            // InternalExpAuto.g:1478:1: ( ':' )
            {
            // InternalExpAuto.g:1478:1: ( ':' )
            // InternalExpAuto.g:1479:2: ':'
            {
             before(grammarAccess.getMemoryDatasourceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemoryDatasourceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__2__Impl"


    // $ANTLR start "rule__MemoryDatasource__Group__3"
    // InternalExpAuto.g:1488:1: rule__MemoryDatasource__Group__3 : rule__MemoryDatasource__Group__3__Impl ;
    public final void rule__MemoryDatasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1492:1: ( rule__MemoryDatasource__Group__3__Impl )
            // InternalExpAuto.g:1493:2: rule__MemoryDatasource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__3"


    // $ANTLR start "rule__MemoryDatasource__Group__3__Impl"
    // InternalExpAuto.g:1499:1: rule__MemoryDatasource__Group__3__Impl : ( ( rule__MemoryDatasource__SourceTypeAssignment_3 ) ) ;
    public final void rule__MemoryDatasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1503:1: ( ( ( rule__MemoryDatasource__SourceTypeAssignment_3 ) ) )
            // InternalExpAuto.g:1504:1: ( ( rule__MemoryDatasource__SourceTypeAssignment_3 ) )
            {
            // InternalExpAuto.g:1504:1: ( ( rule__MemoryDatasource__SourceTypeAssignment_3 ) )
            // InternalExpAuto.g:1505:2: ( rule__MemoryDatasource__SourceTypeAssignment_3 )
            {
             before(grammarAccess.getMemoryDatasourceAccess().getSourceTypeAssignment_3()); 
            // InternalExpAuto.g:1506:2: ( rule__MemoryDatasource__SourceTypeAssignment_3 )
            // InternalExpAuto.g:1506:3: rule__MemoryDatasource__SourceTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MemoryDatasource__SourceTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemoryDatasourceAccess().getSourceTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__Group__3__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalExpAuto.g:1515:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1519:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalExpAuto.g:1520:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Experiment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0"


    // $ANTLR start "rule__Experiment__Group__0__Impl"
    // InternalExpAuto.g:1527:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1531:1: ( ( 'experiment' ) )
            // InternalExpAuto.g:1532:1: ( 'experiment' )
            {
            // InternalExpAuto.g:1532:1: ( 'experiment' )
            // InternalExpAuto.g:1533:2: 'experiment'
            {
             before(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0__Impl"


    // $ANTLR start "rule__Experiment__Group__1"
    // InternalExpAuto.g:1542:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1546:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalExpAuto.g:1547:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Experiment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1"


    // $ANTLR start "rule__Experiment__Group__1__Impl"
    // InternalExpAuto.g:1554:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1558:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1559:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1559:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalExpAuto.g:1560:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1561:2: ( rule__Experiment__NameAssignment_1 )
            // InternalExpAuto.g:1561:3: rule__Experiment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1__Impl"


    // $ANTLR start "rule__Experiment__Group__2"
    // InternalExpAuto.g:1569:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1573:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalExpAuto.g:1574:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Experiment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2"


    // $ANTLR start "rule__Experiment__Group__2__Impl"
    // InternalExpAuto.g:1581:1: rule__Experiment__Group__2__Impl : ( ':' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1585:1: ( ( ':' ) )
            // InternalExpAuto.g:1586:1: ( ':' )
            {
            // InternalExpAuto.g:1586:1: ( ':' )
            // InternalExpAuto.g:1587:2: ':'
            {
             before(grammarAccess.getExperimentAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2__Impl"


    // $ANTLR start "rule__Experiment__Group__3"
    // InternalExpAuto.g:1596:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1600:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalExpAuto.g:1601:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Experiment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3"


    // $ANTLR start "rule__Experiment__Group__3__Impl"
    // InternalExpAuto.g:1608:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__DesignAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1612:1: ( ( ( rule__Experiment__DesignAssignment_3 ) ) )
            // InternalExpAuto.g:1613:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            {
            // InternalExpAuto.g:1613:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            // InternalExpAuto.g:1614:2: ( rule__Experiment__DesignAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 
            // InternalExpAuto.g:1615:2: ( rule__Experiment__DesignAssignment_3 )
            // InternalExpAuto.g:1615:3: rule__Experiment__DesignAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__DesignAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3__Impl"


    // $ANTLR start "rule__Experiment__Group__4"
    // InternalExpAuto.g:1623:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1627:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalExpAuto.g:1628:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Experiment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4"


    // $ANTLR start "rule__Experiment__Group__4__Impl"
    // InternalExpAuto.g:1635:1: rule__Experiment__Group__4__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1639:1: ( ( '{' ) )
            // InternalExpAuto.g:1640:1: ( '{' )
            {
            // InternalExpAuto.g:1640:1: ( '{' )
            // InternalExpAuto.g:1641:2: '{'
            {
             before(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4__Impl"


    // $ANTLR start "rule__Experiment__Group__5"
    // InternalExpAuto.g:1650:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1654:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalExpAuto.g:1655:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Experiment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5"


    // $ANTLR start "rule__Experiment__Group__5__Impl"
    // InternalExpAuto.g:1662:1: rule__Experiment__Group__5__Impl : ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1666:1: ( ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) )
            // InternalExpAuto.g:1667:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            {
            // InternalExpAuto.g:1667:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            // InternalExpAuto.g:1668:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 
            // InternalExpAuto.g:1669:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            // InternalExpAuto.g:1669:3: rule__Experiment__ExperimentSpecificationsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__ExperimentSpecificationsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5__Impl"


    // $ANTLR start "rule__Experiment__Group__6"
    // InternalExpAuto.g:1677:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1681:1: ( rule__Experiment__Group__6__Impl )
            // InternalExpAuto.g:1682:2: rule__Experiment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6"


    // $ANTLR start "rule__Experiment__Group__6__Impl"
    // InternalExpAuto.g:1688:1: rule__Experiment__Group__6__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1692:1: ( ( '}' ) )
            // InternalExpAuto.g:1693:1: ( '}' )
            {
            // InternalExpAuto.g:1693:1: ( '}' )
            // InternalExpAuto.g:1694:2: '}'
            {
             before(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalExpAuto.g:1704:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1708:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalExpAuto.g:1709:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalExpAuto.g:1716:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1720:1: ( ( 'description' ) )
            // InternalExpAuto.g:1721:1: ( 'description' )
            {
            // InternalExpAuto.g:1721:1: ( 'description' )
            // InternalExpAuto.g:1722:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalExpAuto.g:1731:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1735:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalExpAuto.g:1736:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalExpAuto.g:1743:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1747:1: ( ( '=' ) )
            // InternalExpAuto.g:1748:1: ( '=' )
            {
            // InternalExpAuto.g:1748:1: ( '=' )
            // InternalExpAuto.g:1749:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalExpAuto.g:1758:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1762:1: ( rule__Description__Group__2__Impl )
            // InternalExpAuto.g:1763:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalExpAuto.g:1769:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1773:1: ( ( ( rule__Description__DescriptionAssignment_2 ) ) )
            // InternalExpAuto.g:1774:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            {
            // InternalExpAuto.g:1774:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            // InternalExpAuto.g:1775:2: ( rule__Description__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalExpAuto.g:1776:2: ( rule__Description__DescriptionAssignment_2 )
            // InternalExpAuto.g:1776:3: rule__Description__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Description__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__InitialModel__Group__0"
    // InternalExpAuto.g:1785:1: rule__InitialModel__Group__0 : rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 ;
    public final void rule__InitialModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1789:1: ( rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 )
            // InternalExpAuto.g:1790:2: rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__InitialModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__0"


    // $ANTLR start "rule__InitialModel__Group__0__Impl"
    // InternalExpAuto.g:1797:1: rule__InitialModel__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1801:1: ( ( 'initial' ) )
            // InternalExpAuto.g:1802:1: ( 'initial' )
            {
            // InternalExpAuto.g:1802:1: ( 'initial' )
            // InternalExpAuto.g:1803:2: 'initial'
            {
             before(grammarAccess.getInitialModelAccess().getInitialKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInitialModelAccess().getInitialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__0__Impl"


    // $ANTLR start "rule__InitialModel__Group__1"
    // InternalExpAuto.g:1812:1: rule__InitialModel__Group__1 : rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 ;
    public final void rule__InitialModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1816:1: ( rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 )
            // InternalExpAuto.g:1817:2: rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InitialModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__1"


    // $ANTLR start "rule__InitialModel__Group__1__Impl"
    // InternalExpAuto.g:1824:1: rule__InitialModel__Group__1__Impl : ( '=' ) ;
    public final void rule__InitialModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1828:1: ( ( '=' ) )
            // InternalExpAuto.g:1829:1: ( '=' )
            {
            // InternalExpAuto.g:1829:1: ( '=' )
            // InternalExpAuto.g:1830:2: '='
            {
             before(grammarAccess.getInitialModelAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInitialModelAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__1__Impl"


    // $ANTLR start "rule__InitialModel__Group__2"
    // InternalExpAuto.g:1839:1: rule__InitialModel__Group__2 : rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 ;
    public final void rule__InitialModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1843:1: ( rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 )
            // InternalExpAuto.g:1844:2: rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__InitialModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__2"


    // $ANTLR start "rule__InitialModel__Group__2__Impl"
    // InternalExpAuto.g:1851:1: rule__InitialModel__Group__2__Impl : ( ( rule__InitialModel__ModeltypAssignment_2 ) ) ;
    public final void rule__InitialModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1855:1: ( ( ( rule__InitialModel__ModeltypAssignment_2 ) ) )
            // InternalExpAuto.g:1856:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            {
            // InternalExpAuto.g:1856:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            // InternalExpAuto.g:1857:2: ( rule__InitialModel__ModeltypAssignment_2 )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 
            // InternalExpAuto.g:1858:2: ( rule__InitialModel__ModeltypAssignment_2 )
            // InternalExpAuto.g:1858:3: rule__InitialModel__ModeltypAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialModel__ModeltypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__2__Impl"


    // $ANTLR start "rule__InitialModel__Group__3"
    // InternalExpAuto.g:1866:1: rule__InitialModel__Group__3 : rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 ;
    public final void rule__InitialModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1870:1: ( rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 )
            // InternalExpAuto.g:1871:2: rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__InitialModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__3"


    // $ANTLR start "rule__InitialModel__Group__3__Impl"
    // InternalExpAuto.g:1878:1: rule__InitialModel__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1882:1: ( ( '{' ) )
            // InternalExpAuto.g:1883:1: ( '{' )
            {
            // InternalExpAuto.g:1883:1: ( '{' )
            // InternalExpAuto.g:1884:2: '{'
            {
             before(grammarAccess.getInitialModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__3__Impl"


    // $ANTLR start "rule__InitialModel__Group__4"
    // InternalExpAuto.g:1893:1: rule__InitialModel__Group__4 : rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 ;
    public final void rule__InitialModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1897:1: ( rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 )
            // InternalExpAuto.g:1898:2: rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__InitialModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__4"


    // $ANTLR start "rule__InitialModel__Group__4__Impl"
    // InternalExpAuto.g:1905:1: rule__InitialModel__Group__4__Impl : ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) ;
    public final void rule__InitialModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1909:1: ( ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) )
            // InternalExpAuto.g:1910:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            {
            // InternalExpAuto.g:1910:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            // InternalExpAuto.g:1911:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 
            // InternalExpAuto.g:1912:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            // InternalExpAuto.g:1912:3: rule__InitialModel__InitSpecificationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InitialModel__InitSpecificationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__4__Impl"


    // $ANTLR start "rule__InitialModel__Group__5"
    // InternalExpAuto.g:1920:1: rule__InitialModel__Group__5 : rule__InitialModel__Group__5__Impl ;
    public final void rule__InitialModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1924:1: ( rule__InitialModel__Group__5__Impl )
            // InternalExpAuto.g:1925:2: rule__InitialModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__5"


    // $ANTLR start "rule__InitialModel__Group__5__Impl"
    // InternalExpAuto.g:1931:1: rule__InitialModel__Group__5__Impl : ( '}' ) ;
    public final void rule__InitialModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1935:1: ( ( '}' ) )
            // InternalExpAuto.g:1936:1: ( '}' )
            {
            // InternalExpAuto.g:1936:1: ( '}' )
            // InternalExpAuto.g:1937:2: '}'
            {
             before(grammarAccess.getInitialModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__Group__5__Impl"


    // $ANTLR start "rule__AllocationModel__Group__0"
    // InternalExpAuto.g:1947:1: rule__AllocationModel__Group__0 : rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 ;
    public final void rule__AllocationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1951:1: ( rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 )
            // InternalExpAuto.g:1952:2: rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AllocationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__0"


    // $ANTLR start "rule__AllocationModel__Group__0__Impl"
    // InternalExpAuto.g:1959:1: rule__AllocationModel__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__AllocationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1963:1: ( ( 'allocation' ) )
            // InternalExpAuto.g:1964:1: ( 'allocation' )
            {
            // InternalExpAuto.g:1964:1: ( 'allocation' )
            // InternalExpAuto.g:1965:2: 'allocation'
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAllocationModelAccess().getAllocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__0__Impl"


    // $ANTLR start "rule__AllocationModel__Group__1"
    // InternalExpAuto.g:1974:1: rule__AllocationModel__Group__1 : rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 ;
    public final void rule__AllocationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1978:1: ( rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 )
            // InternalExpAuto.g:1979:2: rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AllocationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__1"


    // $ANTLR start "rule__AllocationModel__Group__1__Impl"
    // InternalExpAuto.g:1986:1: rule__AllocationModel__Group__1__Impl : ( '=' ) ;
    public final void rule__AllocationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1990:1: ( ( '=' ) )
            // InternalExpAuto.g:1991:1: ( '=' )
            {
            // InternalExpAuto.g:1991:1: ( '=' )
            // InternalExpAuto.g:1992:2: '='
            {
             before(grammarAccess.getAllocationModelAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationModelAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__1__Impl"


    // $ANTLR start "rule__AllocationModel__Group__2"
    // InternalExpAuto.g:2001:1: rule__AllocationModel__Group__2 : rule__AllocationModel__Group__2__Impl ;
    public final void rule__AllocationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2005:1: ( rule__AllocationModel__Group__2__Impl )
            // InternalExpAuto.g:2006:2: rule__AllocationModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__2"


    // $ANTLR start "rule__AllocationModel__Group__2__Impl"
    // InternalExpAuto.g:2012:1: rule__AllocationModel__Group__2__Impl : ( ( rule__AllocationModel__AllocationAssignment_2 ) ) ;
    public final void rule__AllocationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2016:1: ( ( ( rule__AllocationModel__AllocationAssignment_2 ) ) )
            // InternalExpAuto.g:2017:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            {
            // InternalExpAuto.g:2017:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            // InternalExpAuto.g:2018:2: ( rule__AllocationModel__AllocationAssignment_2 )
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 
            // InternalExpAuto.g:2019:2: ( rule__AllocationModel__AllocationAssignment_2 )
            // InternalExpAuto.g:2019:3: rule__AllocationModel__AllocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocationModel__AllocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__Group__2__Impl"


    // $ANTLR start "rule__UsageModel__Group__0"
    // InternalExpAuto.g:2028:1: rule__UsageModel__Group__0 : rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 ;
    public final void rule__UsageModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2032:1: ( rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 )
            // InternalExpAuto.g:2033:2: rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__UsageModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__0"


    // $ANTLR start "rule__UsageModel__Group__0__Impl"
    // InternalExpAuto.g:2040:1: rule__UsageModel__Group__0__Impl : ( 'usageModel' ) ;
    public final void rule__UsageModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2044:1: ( ( 'usageModel' ) )
            // InternalExpAuto.g:2045:1: ( 'usageModel' )
            {
            // InternalExpAuto.g:2045:1: ( 'usageModel' )
            // InternalExpAuto.g:2046:2: 'usageModel'
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUsageModelAccess().getUsageModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__0__Impl"


    // $ANTLR start "rule__UsageModel__Group__1"
    // InternalExpAuto.g:2055:1: rule__UsageModel__Group__1 : rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 ;
    public final void rule__UsageModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2059:1: ( rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 )
            // InternalExpAuto.g:2060:2: rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UsageModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__1"


    // $ANTLR start "rule__UsageModel__Group__1__Impl"
    // InternalExpAuto.g:2067:1: rule__UsageModel__Group__1__Impl : ( '=' ) ;
    public final void rule__UsageModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2071:1: ( ( '=' ) )
            // InternalExpAuto.g:2072:1: ( '=' )
            {
            // InternalExpAuto.g:2072:1: ( '=' )
            // InternalExpAuto.g:2073:2: '='
            {
             before(grammarAccess.getUsageModelAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUsageModelAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__1__Impl"


    // $ANTLR start "rule__UsageModel__Group__2"
    // InternalExpAuto.g:2082:1: rule__UsageModel__Group__2 : rule__UsageModel__Group__2__Impl ;
    public final void rule__UsageModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2086:1: ( rule__UsageModel__Group__2__Impl )
            // InternalExpAuto.g:2087:2: rule__UsageModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsageModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__2"


    // $ANTLR start "rule__UsageModel__Group__2__Impl"
    // InternalExpAuto.g:2093:1: rule__UsageModel__Group__2__Impl : ( ( rule__UsageModel__UsageModelAssignment_2 ) ) ;
    public final void rule__UsageModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2097:1: ( ( ( rule__UsageModel__UsageModelAssignment_2 ) ) )
            // InternalExpAuto.g:2098:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            {
            // InternalExpAuto.g:2098:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            // InternalExpAuto.g:2099:2: ( rule__UsageModel__UsageModelAssignment_2 )
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 
            // InternalExpAuto.g:2100:2: ( rule__UsageModel__UsageModelAssignment_2 )
            // InternalExpAuto.g:2100:3: rule__UsageModel__UsageModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UsageModel__UsageModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__Group__2__Impl"


    // $ANTLR start "rule__MiddlewareRepository__Group__0"
    // InternalExpAuto.g:2109:1: rule__MiddlewareRepository__Group__0 : rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 ;
    public final void rule__MiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2113:1: ( rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2114:2: rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MiddlewareRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddlewareRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__0"


    // $ANTLR start "rule__MiddlewareRepository__Group__0__Impl"
    // InternalExpAuto.g:2121:1: rule__MiddlewareRepository__Group__0__Impl : ( 'middlewareRepository' ) ;
    public final void rule__MiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2125:1: ( ( 'middlewareRepository' ) )
            // InternalExpAuto.g:2126:1: ( 'middlewareRepository' )
            {
            // InternalExpAuto.g:2126:1: ( 'middlewareRepository' )
            // InternalExpAuto.g:2127:2: 'middlewareRepository'
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__0__Impl"


    // $ANTLR start "rule__MiddlewareRepository__Group__1"
    // InternalExpAuto.g:2136:1: rule__MiddlewareRepository__Group__1 : rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 ;
    public final void rule__MiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2140:1: ( rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2141:2: rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MiddlewareRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddlewareRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__1"


    // $ANTLR start "rule__MiddlewareRepository__Group__1__Impl"
    // InternalExpAuto.g:2148:1: rule__MiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2152:1: ( ( '=' ) )
            // InternalExpAuto.g:2153:1: ( '=' )
            {
            // InternalExpAuto.g:2153:1: ( '=' )
            // InternalExpAuto.g:2154:2: '='
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__1__Impl"


    // $ANTLR start "rule__MiddlewareRepository__Group__2"
    // InternalExpAuto.g:2163:1: rule__MiddlewareRepository__Group__2 : rule__MiddlewareRepository__Group__2__Impl ;
    public final void rule__MiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2167:1: ( rule__MiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2168:2: rule__MiddlewareRepository__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddlewareRepository__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__2"


    // $ANTLR start "rule__MiddlewareRepository__Group__2__Impl"
    // InternalExpAuto.g:2174:1: rule__MiddlewareRepository__Group__2__Impl : ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) ;
    public final void rule__MiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2178:1: ( ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2179:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2179:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2180:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2181:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            // InternalExpAuto.g:2181:3: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__Group__2__Impl"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__0"
    // InternalExpAuto.g:2190:1: rule__EventMiddlewareRepository__Group__0 : rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 ;
    public final void rule__EventMiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2194:1: ( rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2195:2: rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EventMiddlewareRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventMiddlewareRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__0"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__0__Impl"
    // InternalExpAuto.g:2202:1: rule__EventMiddlewareRepository__Group__0__Impl : ( 'eventMiddlewareRepository' ) ;
    public final void rule__EventMiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2206:1: ( ( 'eventMiddlewareRepository' ) )
            // InternalExpAuto.g:2207:1: ( 'eventMiddlewareRepository' )
            {
            // InternalExpAuto.g:2207:1: ( 'eventMiddlewareRepository' )
            // InternalExpAuto.g:2208:2: 'eventMiddlewareRepository'
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddlewareRepositoryKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddlewareRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__0__Impl"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__1"
    // InternalExpAuto.g:2217:1: rule__EventMiddlewareRepository__Group__1 : rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 ;
    public final void rule__EventMiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2221:1: ( rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2222:2: rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EventMiddlewareRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventMiddlewareRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__1"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__1__Impl"
    // InternalExpAuto.g:2229:1: rule__EventMiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__EventMiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2233:1: ( ( '=' ) )
            // InternalExpAuto.g:2234:1: ( '=' )
            {
            // InternalExpAuto.g:2234:1: ( '=' )
            // InternalExpAuto.g:2235:2: '='
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEventMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__1__Impl"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__2"
    // InternalExpAuto.g:2244:1: rule__EventMiddlewareRepository__Group__2 : rule__EventMiddlewareRepository__Group__2__Impl ;
    public final void rule__EventMiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2248:1: ( rule__EventMiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2249:2: rule__EventMiddlewareRepository__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventMiddlewareRepository__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__2"


    // $ANTLR start "rule__EventMiddlewareRepository__Group__2__Impl"
    // InternalExpAuto.g:2255:1: rule__EventMiddlewareRepository__Group__2__Impl : ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) ;
    public final void rule__EventMiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2259:1: ( ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2260:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2260:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2261:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2262:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            // InternalExpAuto.g:2262:3: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__Group__2__Impl"


    // $ANTLR start "rule__MonitorRepository__Group__0"
    // InternalExpAuto.g:2271:1: rule__MonitorRepository__Group__0 : rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 ;
    public final void rule__MonitorRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2275:1: ( rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 )
            // InternalExpAuto.g:2276:2: rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MonitorRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__0"


    // $ANTLR start "rule__MonitorRepository__Group__0__Impl"
    // InternalExpAuto.g:2283:1: rule__MonitorRepository__Group__0__Impl : ( 'monitorRepository' ) ;
    public final void rule__MonitorRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2287:1: ( ( 'monitorRepository' ) )
            // InternalExpAuto.g:2288:1: ( 'monitorRepository' )
            {
            // InternalExpAuto.g:2288:1: ( 'monitorRepository' )
            // InternalExpAuto.g:2289:2: 'monitorRepository'
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__0__Impl"


    // $ANTLR start "rule__MonitorRepository__Group__1"
    // InternalExpAuto.g:2298:1: rule__MonitorRepository__Group__1 : rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 ;
    public final void rule__MonitorRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2302:1: ( rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 )
            // InternalExpAuto.g:2303:2: rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MonitorRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__1"


    // $ANTLR start "rule__MonitorRepository__Group__1__Impl"
    // InternalExpAuto.g:2310:1: rule__MonitorRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MonitorRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2314:1: ( ( '=' ) )
            // InternalExpAuto.g:2315:1: ( '=' )
            {
            // InternalExpAuto.g:2315:1: ( '=' )
            // InternalExpAuto.g:2316:2: '='
            {
             before(grammarAccess.getMonitorRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMonitorRepositoryAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__1__Impl"


    // $ANTLR start "rule__MonitorRepository__Group__2"
    // InternalExpAuto.g:2325:1: rule__MonitorRepository__Group__2 : rule__MonitorRepository__Group__2__Impl ;
    public final void rule__MonitorRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2329:1: ( rule__MonitorRepository__Group__2__Impl )
            // InternalExpAuto.g:2330:2: rule__MonitorRepository__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorRepository__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__2"


    // $ANTLR start "rule__MonitorRepository__Group__2__Impl"
    // InternalExpAuto.g:2336:1: rule__MonitorRepository__Group__2__Impl : ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) ;
    public final void rule__MonitorRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2340:1: ( ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2341:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2341:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2342:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 
            // InternalExpAuto.g:2343:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            // InternalExpAuto.g:2343:3: rule__MonitorRepository__MonitorRepositoryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorRepository__MonitorRepositoryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__Group__2__Impl"


    // $ANTLR start "rule__Variation__Group__0"
    // InternalExpAuto.g:2352:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2356:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // InternalExpAuto.g:2357:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Variation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__0"


    // $ANTLR start "rule__Variation__Group__0__Impl"
    // InternalExpAuto.g:2364:1: rule__Variation__Group__0__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2368:1: ( ( 'variation' ) )
            // InternalExpAuto.g:2369:1: ( 'variation' )
            {
            // InternalExpAuto.g:2369:1: ( 'variation' )
            // InternalExpAuto.g:2370:2: 'variation'
            {
             before(grammarAccess.getVariationAccess().getVariationKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getVariationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__0__Impl"


    // $ANTLR start "rule__Variation__Group__1"
    // InternalExpAuto.g:2379:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2383:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // InternalExpAuto.g:2384:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Variation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__1"


    // $ANTLR start "rule__Variation__Group__1__Impl"
    // InternalExpAuto.g:2391:1: rule__Variation__Group__1__Impl : ( '=' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2395:1: ( ( '=' ) )
            // InternalExpAuto.g:2396:1: ( '=' )
            {
            // InternalExpAuto.g:2396:1: ( '=' )
            // InternalExpAuto.g:2397:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__1__Impl"


    // $ANTLR start "rule__Variation__Group__2"
    // InternalExpAuto.g:2406:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2410:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // InternalExpAuto.g:2411:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Variation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__2"


    // $ANTLR start "rule__Variation__Group__2__Impl"
    // InternalExpAuto.g:2418:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__VariationTypAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2422:1: ( ( ( rule__Variation__VariationTypAssignment_2 ) ) )
            // InternalExpAuto.g:2423:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            {
            // InternalExpAuto.g:2423:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            // InternalExpAuto.g:2424:2: ( rule__Variation__VariationTypAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 
            // InternalExpAuto.g:2425:2: ( rule__Variation__VariationTypAssignment_2 )
            // InternalExpAuto.g:2425:3: rule__Variation__VariationTypAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variation__VariationTypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__2__Impl"


    // $ANTLR start "rule__Variation__Group__3"
    // InternalExpAuto.g:2433:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl rule__Variation__Group__4 ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2437:1: ( rule__Variation__Group__3__Impl rule__Variation__Group__4 )
            // InternalExpAuto.g:2438:2: rule__Variation__Group__3__Impl rule__Variation__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Variation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__3"


    // $ANTLR start "rule__Variation__Group__3__Impl"
    // InternalExpAuto.g:2445:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__NameAssignment_3 ) ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2449:1: ( ( ( rule__Variation__NameAssignment_3 ) ) )
            // InternalExpAuto.g:2450:1: ( ( rule__Variation__NameAssignment_3 ) )
            {
            // InternalExpAuto.g:2450:1: ( ( rule__Variation__NameAssignment_3 ) )
            // InternalExpAuto.g:2451:2: ( rule__Variation__NameAssignment_3 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_3()); 
            // InternalExpAuto.g:2452:2: ( rule__Variation__NameAssignment_3 )
            // InternalExpAuto.g:2452:3: rule__Variation__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variation__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__3__Impl"


    // $ANTLR start "rule__Variation__Group__4"
    // InternalExpAuto.g:2460:1: rule__Variation__Group__4 : rule__Variation__Group__4__Impl rule__Variation__Group__5 ;
    public final void rule__Variation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2464:1: ( rule__Variation__Group__4__Impl rule__Variation__Group__5 )
            // InternalExpAuto.g:2465:2: rule__Variation__Group__4__Impl rule__Variation__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Variation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__4"


    // $ANTLR start "rule__Variation__Group__4__Impl"
    // InternalExpAuto.g:2472:1: rule__Variation__Group__4__Impl : ( '{' ) ;
    public final void rule__Variation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2476:1: ( ( '{' ) )
            // InternalExpAuto.g:2477:1: ( '{' )
            {
            // InternalExpAuto.g:2477:1: ( '{' )
            // InternalExpAuto.g:2478:2: '{'
            {
             before(grammarAccess.getVariationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__4__Impl"


    // $ANTLR start "rule__Variation__Group__5"
    // InternalExpAuto.g:2487:1: rule__Variation__Group__5 : rule__Variation__Group__5__Impl rule__Variation__Group__6 ;
    public final void rule__Variation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2491:1: ( rule__Variation__Group__5__Impl rule__Variation__Group__6 )
            // InternalExpAuto.g:2492:2: rule__Variation__Group__5__Impl rule__Variation__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Variation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__5"


    // $ANTLR start "rule__Variation__Group__5__Impl"
    // InternalExpAuto.g:2499:1: rule__Variation__Group__5__Impl : ( 'target' ) ;
    public final void rule__Variation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2503:1: ( ( 'target' ) )
            // InternalExpAuto.g:2504:1: ( 'target' )
            {
            // InternalExpAuto.g:2504:1: ( 'target' )
            // InternalExpAuto.g:2505:2: 'target'
            {
             before(grammarAccess.getVariationAccess().getTargetKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__5__Impl"


    // $ANTLR start "rule__Variation__Group__6"
    // InternalExpAuto.g:2514:1: rule__Variation__Group__6 : rule__Variation__Group__6__Impl rule__Variation__Group__7 ;
    public final void rule__Variation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2518:1: ( rule__Variation__Group__6__Impl rule__Variation__Group__7 )
            // InternalExpAuto.g:2519:2: rule__Variation__Group__6__Impl rule__Variation__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Variation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__6"


    // $ANTLR start "rule__Variation__Group__6__Impl"
    // InternalExpAuto.g:2526:1: rule__Variation__Group__6__Impl : ( '=' ) ;
    public final void rule__Variation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2530:1: ( ( '=' ) )
            // InternalExpAuto.g:2531:1: ( '=' )
            {
            // InternalExpAuto.g:2531:1: ( '=' )
            // InternalExpAuto.g:2532:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__6__Impl"


    // $ANTLR start "rule__Variation__Group__7"
    // InternalExpAuto.g:2541:1: rule__Variation__Group__7 : rule__Variation__Group__7__Impl rule__Variation__Group__8 ;
    public final void rule__Variation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2545:1: ( rule__Variation__Group__7__Impl rule__Variation__Group__8 )
            // InternalExpAuto.g:2546:2: rule__Variation__Group__7__Impl rule__Variation__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Variation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__7"


    // $ANTLR start "rule__Variation__Group__7__Impl"
    // InternalExpAuto.g:2553:1: rule__Variation__Group__7__Impl : ( ( rule__Variation__TargetAssignment_7 ) ) ;
    public final void rule__Variation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2557:1: ( ( ( rule__Variation__TargetAssignment_7 ) ) )
            // InternalExpAuto.g:2558:1: ( ( rule__Variation__TargetAssignment_7 ) )
            {
            // InternalExpAuto.g:2558:1: ( ( rule__Variation__TargetAssignment_7 ) )
            // InternalExpAuto.g:2559:2: ( rule__Variation__TargetAssignment_7 )
            {
             before(grammarAccess.getVariationAccess().getTargetAssignment_7()); 
            // InternalExpAuto.g:2560:2: ( rule__Variation__TargetAssignment_7 )
            // InternalExpAuto.g:2560:3: rule__Variation__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Variation__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getTargetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__7__Impl"


    // $ANTLR start "rule__Variation__Group__8"
    // InternalExpAuto.g:2568:1: rule__Variation__Group__8 : rule__Variation__Group__8__Impl rule__Variation__Group__9 ;
    public final void rule__Variation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2572:1: ( rule__Variation__Group__8__Impl rule__Variation__Group__9 )
            // InternalExpAuto.g:2573:2: rule__Variation__Group__8__Impl rule__Variation__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Variation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__8"


    // $ANTLR start "rule__Variation__Group__8__Impl"
    // InternalExpAuto.g:2580:1: rule__Variation__Group__8__Impl : ( 'maxVariations' ) ;
    public final void rule__Variation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2584:1: ( ( 'maxVariations' ) )
            // InternalExpAuto.g:2585:1: ( 'maxVariations' )
            {
            // InternalExpAuto.g:2585:1: ( 'maxVariations' )
            // InternalExpAuto.g:2586:2: 'maxVariations'
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getMaxVariationsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__8__Impl"


    // $ANTLR start "rule__Variation__Group__9"
    // InternalExpAuto.g:2595:1: rule__Variation__Group__9 : rule__Variation__Group__9__Impl rule__Variation__Group__10 ;
    public final void rule__Variation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2599:1: ( rule__Variation__Group__9__Impl rule__Variation__Group__10 )
            // InternalExpAuto.g:2600:2: rule__Variation__Group__9__Impl rule__Variation__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Variation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__9"


    // $ANTLR start "rule__Variation__Group__9__Impl"
    // InternalExpAuto.g:2607:1: rule__Variation__Group__9__Impl : ( '=' ) ;
    public final void rule__Variation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2611:1: ( ( '=' ) )
            // InternalExpAuto.g:2612:1: ( '=' )
            {
            // InternalExpAuto.g:2612:1: ( '=' )
            // InternalExpAuto.g:2613:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__9__Impl"


    // $ANTLR start "rule__Variation__Group__10"
    // InternalExpAuto.g:2622:1: rule__Variation__Group__10 : rule__Variation__Group__10__Impl rule__Variation__Group__11 ;
    public final void rule__Variation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2626:1: ( rule__Variation__Group__10__Impl rule__Variation__Group__11 )
            // InternalExpAuto.g:2627:2: rule__Variation__Group__10__Impl rule__Variation__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__Variation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__10"


    // $ANTLR start "rule__Variation__Group__10__Impl"
    // InternalExpAuto.g:2634:1: rule__Variation__Group__10__Impl : ( ( rule__Variation__MaxVariationsAssignment_10 ) ) ;
    public final void rule__Variation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2638:1: ( ( ( rule__Variation__MaxVariationsAssignment_10 ) ) )
            // InternalExpAuto.g:2639:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            {
            // InternalExpAuto.g:2639:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            // InternalExpAuto.g:2640:2: ( rule__Variation__MaxVariationsAssignment_10 )
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 
            // InternalExpAuto.g:2641:2: ( rule__Variation__MaxVariationsAssignment_10 )
            // InternalExpAuto.g:2641:3: rule__Variation__MaxVariationsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Variation__MaxVariationsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__10__Impl"


    // $ANTLR start "rule__Variation__Group__11"
    // InternalExpAuto.g:2649:1: rule__Variation__Group__11 : rule__Variation__Group__11__Impl rule__Variation__Group__12 ;
    public final void rule__Variation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2653:1: ( rule__Variation__Group__11__Impl rule__Variation__Group__12 )
            // InternalExpAuto.g:2654:2: rule__Variation__Group__11__Impl rule__Variation__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Variation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__11"


    // $ANTLR start "rule__Variation__Group__11__Impl"
    // InternalExpAuto.g:2661:1: rule__Variation__Group__11__Impl : ( 'values' ) ;
    public final void rule__Variation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2665:1: ( ( 'values' ) )
            // InternalExpAuto.g:2666:1: ( 'values' )
            {
            // InternalExpAuto.g:2666:1: ( 'values' )
            // InternalExpAuto.g:2667:2: 'values'
            {
             before(grammarAccess.getVariationAccess().getValuesKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getValuesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__11__Impl"


    // $ANTLR start "rule__Variation__Group__12"
    // InternalExpAuto.g:2676:1: rule__Variation__Group__12 : rule__Variation__Group__12__Impl rule__Variation__Group__13 ;
    public final void rule__Variation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2680:1: ( rule__Variation__Group__12__Impl rule__Variation__Group__13 )
            // InternalExpAuto.g:2681:2: rule__Variation__Group__12__Impl rule__Variation__Group__13
            {
            pushFollow(FOLLOW_27);
            rule__Variation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__12"


    // $ANTLR start "rule__Variation__Group__12__Impl"
    // InternalExpAuto.g:2688:1: rule__Variation__Group__12__Impl : ( '=' ) ;
    public final void rule__Variation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2692:1: ( ( '=' ) )
            // InternalExpAuto.g:2693:1: ( '=' )
            {
            // InternalExpAuto.g:2693:1: ( '=' )
            // InternalExpAuto.g:2694:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__12__Impl"


    // $ANTLR start "rule__Variation__Group__13"
    // InternalExpAuto.g:2703:1: rule__Variation__Group__13 : rule__Variation__Group__13__Impl rule__Variation__Group__14 ;
    public final void rule__Variation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2707:1: ( rule__Variation__Group__13__Impl rule__Variation__Group__14 )
            // InternalExpAuto.g:2708:2: rule__Variation__Group__13__Impl rule__Variation__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Variation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__13"


    // $ANTLR start "rule__Variation__Group__13__Impl"
    // InternalExpAuto.g:2715:1: rule__Variation__Group__13__Impl : ( ( rule__Variation__ValueProviderAssignment_13 ) ) ;
    public final void rule__Variation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2719:1: ( ( ( rule__Variation__ValueProviderAssignment_13 ) ) )
            // InternalExpAuto.g:2720:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            {
            // InternalExpAuto.g:2720:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            // InternalExpAuto.g:2721:2: ( rule__Variation__ValueProviderAssignment_13 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 
            // InternalExpAuto.g:2722:2: ( rule__Variation__ValueProviderAssignment_13 )
            // InternalExpAuto.g:2722:3: rule__Variation__ValueProviderAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Variation__ValueProviderAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__13__Impl"


    // $ANTLR start "rule__Variation__Group__14"
    // InternalExpAuto.g:2730:1: rule__Variation__Group__14 : rule__Variation__Group__14__Impl ;
    public final void rule__Variation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2734:1: ( rule__Variation__Group__14__Impl )
            // InternalExpAuto.g:2735:2: rule__Variation__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variation__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__14"


    // $ANTLR start "rule__Variation__Group__14__Impl"
    // InternalExpAuto.g:2741:1: rule__Variation__Group__14__Impl : ( '}' ) ;
    public final void rule__Variation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2745:1: ( ( '}' ) )
            // InternalExpAuto.g:2746:1: ( '}' )
            {
            // InternalExpAuto.g:2746:1: ( '}' )
            // InternalExpAuto.g:2747:2: '}'
            {
             before(grammarAccess.getVariationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__14__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__0"
    // InternalExpAuto.g:2757:1: rule__NestedIntervalsValueProvider__Group_0__0 : rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2761:1: ( rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 )
            // InternalExpAuto.g:2762:2: rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__NestedIntervalsValueProvider__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__0"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__0__Impl"
    // InternalExpAuto.g:2769:1: rule__NestedIntervalsValueProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2773:1: ( ( '[' ) )
            // InternalExpAuto.g:2774:1: ( '[' )
            {
            // InternalExpAuto.g:2774:1: ( '[' )
            // InternalExpAuto.g:2775:2: '['
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__0__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__1"
    // InternalExpAuto.g:2784:1: rule__NestedIntervalsValueProvider__Group_0__1 : rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2788:1: ( rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 )
            // InternalExpAuto.g:2789:2: rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__NestedIntervalsValueProvider__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__1"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__1__Impl"
    // InternalExpAuto.g:2796:1: rule__NestedIntervalsValueProvider__Group_0__1__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2800:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) )
            // InternalExpAuto.g:2801:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2801:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            // InternalExpAuto.g:2802:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 
            // InternalExpAuto.g:2803:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            // InternalExpAuto.g:2803:3: rule__NestedIntervalsValueProvider__MinAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__MinAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__1__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__2"
    // InternalExpAuto.g:2811:1: rule__NestedIntervalsValueProvider__Group_0__2 : rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2815:1: ( rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 )
            // InternalExpAuto.g:2816:2: rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3
            {
            pushFollow(FOLLOW_25);
            rule__NestedIntervalsValueProvider__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__2"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__2__Impl"
    // InternalExpAuto.g:2823:1: rule__NestedIntervalsValueProvider__Group_0__2__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2827:1: ( ( ',' ) )
            // InternalExpAuto.g:2828:1: ( ',' )
            {
            // InternalExpAuto.g:2828:1: ( ',' )
            // InternalExpAuto.g:2829:2: ','
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_0_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__2__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__3"
    // InternalExpAuto.g:2838:1: rule__NestedIntervalsValueProvider__Group_0__3 : rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2842:1: ( rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 )
            // InternalExpAuto.g:2843:2: rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4
            {
            pushFollow(FOLLOW_29);
            rule__NestedIntervalsValueProvider__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__3"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__3__Impl"
    // InternalExpAuto.g:2850:1: rule__NestedIntervalsValueProvider__Group_0__3__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2854:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) )
            // InternalExpAuto.g:2855:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            {
            // InternalExpAuto.g:2855:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            // InternalExpAuto.g:2856:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 
            // InternalExpAuto.g:2857:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            // InternalExpAuto.g:2857:3: rule__NestedIntervalsValueProvider__MaxAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__MaxAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__3__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__4"
    // InternalExpAuto.g:2865:1: rule__NestedIntervalsValueProvider__Group_0__4 : rule__NestedIntervalsValueProvider__Group_0__4__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2869:1: ( rule__NestedIntervalsValueProvider__Group_0__4__Impl )
            // InternalExpAuto.g:2870:2: rule__NestedIntervalsValueProvider__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__4"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_0__4__Impl"
    // InternalExpAuto.g:2876:1: rule__NestedIntervalsValueProvider__Group_0__4__Impl : ( ']' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2880:1: ( ( ']' ) )
            // InternalExpAuto.g:2881:1: ( ']' )
            {
            // InternalExpAuto.g:2881:1: ( ']' )
            // InternalExpAuto.g:2882:2: ']'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getRightSquareBracketKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_0__4__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__0"
    // InternalExpAuto.g:2892:1: rule__NestedIntervalsValueProvider__Group_1__0 : rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2896:1: ( rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 )
            // InternalExpAuto.g:2897:2: rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__NestedIntervalsValueProvider__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__0"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__0__Impl"
    // InternalExpAuto.g:2904:1: rule__NestedIntervalsValueProvider__Group_1__0__Impl : ( 'nestedIntervall' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2908:1: ( ( 'nestedIntervall' ) )
            // InternalExpAuto.g:2909:1: ( 'nestedIntervall' )
            {
            // InternalExpAuto.g:2909:1: ( 'nestedIntervall' )
            // InternalExpAuto.g:2910:2: 'nestedIntervall'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getNestedIntervallKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getNestedIntervallKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__0__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__1"
    // InternalExpAuto.g:2919:1: rule__NestedIntervalsValueProvider__Group_1__1 : rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2923:1: ( rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 )
            // InternalExpAuto.g:2924:2: rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__NestedIntervalsValueProvider__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__1"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__1__Impl"
    // InternalExpAuto.g:2931:1: rule__NestedIntervalsValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2935:1: ( ( '(' ) )
            // InternalExpAuto.g:2936:1: ( '(' )
            {
            // InternalExpAuto.g:2936:1: ( '(' )
            // InternalExpAuto.g:2937:2: '('
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__1__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__2"
    // InternalExpAuto.g:2946:1: rule__NestedIntervalsValueProvider__Group_1__2 : rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2950:1: ( rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 )
            // InternalExpAuto.g:2951:2: rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__NestedIntervalsValueProvider__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__2"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__2__Impl"
    // InternalExpAuto.g:2958:1: rule__NestedIntervalsValueProvider__Group_1__2__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2962:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) )
            // InternalExpAuto.g:2963:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            {
            // InternalExpAuto.g:2963:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            // InternalExpAuto.g:2964:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 
            // InternalExpAuto.g:2965:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            // InternalExpAuto.g:2965:3: rule__NestedIntervalsValueProvider__MinAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__MinAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__2__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__3"
    // InternalExpAuto.g:2973:1: rule__NestedIntervalsValueProvider__Group_1__3 : rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2977:1: ( rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 )
            // InternalExpAuto.g:2978:2: rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4
            {
            pushFollow(FOLLOW_25);
            rule__NestedIntervalsValueProvider__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__3"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__3__Impl"
    // InternalExpAuto.g:2985:1: rule__NestedIntervalsValueProvider__Group_1__3__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2989:1: ( ( ',' ) )
            // InternalExpAuto.g:2990:1: ( ',' )
            {
            // InternalExpAuto.g:2990:1: ( ',' )
            // InternalExpAuto.g:2991:2: ','
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_1_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__3__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__4"
    // InternalExpAuto.g:3000:1: rule__NestedIntervalsValueProvider__Group_1__4 : rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3004:1: ( rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 )
            // InternalExpAuto.g:3005:2: rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5
            {
            pushFollow(FOLLOW_15);
            rule__NestedIntervalsValueProvider__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__4"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__4__Impl"
    // InternalExpAuto.g:3012:1: rule__NestedIntervalsValueProvider__Group_1__4__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3016:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) )
            // InternalExpAuto.g:3017:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            {
            // InternalExpAuto.g:3017:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            // InternalExpAuto.g:3018:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 
            // InternalExpAuto.g:3019:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            // InternalExpAuto.g:3019:3: rule__NestedIntervalsValueProvider__MaxAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__MaxAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__4__Impl"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__5"
    // InternalExpAuto.g:3027:1: rule__NestedIntervalsValueProvider__Group_1__5 : rule__NestedIntervalsValueProvider__Group_1__5__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3031:1: ( rule__NestedIntervalsValueProvider__Group_1__5__Impl )
            // InternalExpAuto.g:3032:2: rule__NestedIntervalsValueProvider__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedIntervalsValueProvider__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__5"


    // $ANTLR start "rule__NestedIntervalsValueProvider__Group_1__5__Impl"
    // InternalExpAuto.g:3038:1: rule__NestedIntervalsValueProvider__Group_1__5__Impl : ( ')' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3042:1: ( ( ')' ) )
            // InternalExpAuto.g:3043:1: ( ')' )
            {
            // InternalExpAuto.g:3043:1: ( ')' )
            // InternalExpAuto.g:3044:2: ')'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getRightParenthesisKeyword_1_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__Group_1__5__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0__0"
    // InternalExpAuto.g:3054:1: rule__SetValueProvider__Group_0__0 : rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 ;
    public final void rule__SetValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3058:1: ( rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 )
            // InternalExpAuto.g:3059:2: rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__SetValueProvider__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__0"


    // $ANTLR start "rule__SetValueProvider__Group_0__0__Impl"
    // InternalExpAuto.g:3066:1: rule__SetValueProvider__Group_0__0__Impl : ( '{' ) ;
    public final void rule__SetValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3070:1: ( ( '{' ) )
            // InternalExpAuto.g:3071:1: ( '{' )
            {
            // InternalExpAuto.g:3071:1: ( '{' )
            // InternalExpAuto.g:3072:2: '{'
            {
             before(grammarAccess.getSetValueProviderAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__0__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0__1"
    // InternalExpAuto.g:3081:1: rule__SetValueProvider__Group_0__1 : rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 ;
    public final void rule__SetValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3085:1: ( rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 )
            // InternalExpAuto.g:3086:2: rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__SetValueProvider__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__1"


    // $ANTLR start "rule__SetValueProvider__Group_0__1__Impl"
    // InternalExpAuto.g:3093:1: rule__SetValueProvider__Group_0__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) ;
    public final void rule__SetValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3097:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) )
            // InternalExpAuto.g:3098:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            {
            // InternalExpAuto.g:3098:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            // InternalExpAuto.g:3099:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 
            // InternalExpAuto.g:3100:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            // InternalExpAuto.g:3100:3: rule__SetValueProvider__ValuesAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__ValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__1__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0__2"
    // InternalExpAuto.g:3108:1: rule__SetValueProvider__Group_0__2 : rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 ;
    public final void rule__SetValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3112:1: ( rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 )
            // InternalExpAuto.g:3113:2: rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3
            {
            pushFollow(FOLLOW_30);
            rule__SetValueProvider__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__2"


    // $ANTLR start "rule__SetValueProvider__Group_0__2__Impl"
    // InternalExpAuto.g:3120:1: rule__SetValueProvider__Group_0__2__Impl : ( ( rule__SetValueProvider__Group_0_2__0 )* ) ;
    public final void rule__SetValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3124:1: ( ( ( rule__SetValueProvider__Group_0_2__0 )* ) )
            // InternalExpAuto.g:3125:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            {
            // InternalExpAuto.g:3125:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            // InternalExpAuto.g:3126:2: ( rule__SetValueProvider__Group_0_2__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 
            // InternalExpAuto.g:3127:2: ( rule__SetValueProvider__Group_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpAuto.g:3127:3: rule__SetValueProvider__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SetValueProvider__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__2__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0__3"
    // InternalExpAuto.g:3135:1: rule__SetValueProvider__Group_0__3 : rule__SetValueProvider__Group_0__3__Impl ;
    public final void rule__SetValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3139:1: ( rule__SetValueProvider__Group_0__3__Impl )
            // InternalExpAuto.g:3140:2: rule__SetValueProvider__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__3"


    // $ANTLR start "rule__SetValueProvider__Group_0__3__Impl"
    // InternalExpAuto.g:3146:1: rule__SetValueProvider__Group_0__3__Impl : ( '}' ) ;
    public final void rule__SetValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3150:1: ( ( '}' ) )
            // InternalExpAuto.g:3151:1: ( '}' )
            {
            // InternalExpAuto.g:3151:1: ( '}' )
            // InternalExpAuto.g:3152:2: '}'
            {
             before(grammarAccess.getSetValueProviderAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getRightCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0__3__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0_2__0"
    // InternalExpAuto.g:3162:1: rule__SetValueProvider__Group_0_2__0 : rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 ;
    public final void rule__SetValueProvider__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3166:1: ( rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 )
            // InternalExpAuto.g:3167:2: rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1
            {
            pushFollow(FOLLOW_25);
            rule__SetValueProvider__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0_2__0"


    // $ANTLR start "rule__SetValueProvider__Group_0_2__0__Impl"
    // InternalExpAuto.g:3174:1: rule__SetValueProvider__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3178:1: ( ( ',' ) )
            // InternalExpAuto.g:3179:1: ( ',' )
            {
            // InternalExpAuto.g:3179:1: ( ',' )
            // InternalExpAuto.g:3180:2: ','
            {
             before(grammarAccess.getSetValueProviderAccess().getCommaKeyword_0_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getCommaKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0_2__0__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_0_2__1"
    // InternalExpAuto.g:3189:1: rule__SetValueProvider__Group_0_2__1 : rule__SetValueProvider__Group_0_2__1__Impl ;
    public final void rule__SetValueProvider__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3193:1: ( rule__SetValueProvider__Group_0_2__1__Impl )
            // InternalExpAuto.g:3194:2: rule__SetValueProvider__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0_2__1"


    // $ANTLR start "rule__SetValueProvider__Group_0_2__1__Impl"
    // InternalExpAuto.g:3200:1: rule__SetValueProvider__Group_0_2__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) ;
    public final void rule__SetValueProvider__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3204:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) )
            // InternalExpAuto.g:3205:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            {
            // InternalExpAuto.g:3205:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            // InternalExpAuto.g:3206:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 
            // InternalExpAuto.g:3207:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            // InternalExpAuto.g:3207:3: rule__SetValueProvider__ValuesAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__ValuesAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_0_2__1__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1__0"
    // InternalExpAuto.g:3216:1: rule__SetValueProvider__Group_1__0 : rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 ;
    public final void rule__SetValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3220:1: ( rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 )
            // InternalExpAuto.g:3221:2: rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__SetValueProvider__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__0"


    // $ANTLR start "rule__SetValueProvider__Group_1__0__Impl"
    // InternalExpAuto.g:3228:1: rule__SetValueProvider__Group_1__0__Impl : ( 'setValues' ) ;
    public final void rule__SetValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3232:1: ( ( 'setValues' ) )
            // InternalExpAuto.g:3233:1: ( 'setValues' )
            {
            // InternalExpAuto.g:3233:1: ( 'setValues' )
            // InternalExpAuto.g:3234:2: 'setValues'
            {
             before(grammarAccess.getSetValueProviderAccess().getSetValuesKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getSetValuesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__0__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1__1"
    // InternalExpAuto.g:3243:1: rule__SetValueProvider__Group_1__1 : rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 ;
    public final void rule__SetValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3247:1: ( rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 )
            // InternalExpAuto.g:3248:2: rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__SetValueProvider__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__1"


    // $ANTLR start "rule__SetValueProvider__Group_1__1__Impl"
    // InternalExpAuto.g:3255:1: rule__SetValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SetValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3259:1: ( ( '(' ) )
            // InternalExpAuto.g:3260:1: ( '(' )
            {
            // InternalExpAuto.g:3260:1: ( '(' )
            // InternalExpAuto.g:3261:2: '('
            {
             before(grammarAccess.getSetValueProviderAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__1__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1__2"
    // InternalExpAuto.g:3270:1: rule__SetValueProvider__Group_1__2 : rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 ;
    public final void rule__SetValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3274:1: ( rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 )
            // InternalExpAuto.g:3275:2: rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3
            {
            pushFollow(FOLLOW_32);
            rule__SetValueProvider__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__2"


    // $ANTLR start "rule__SetValueProvider__Group_1__2__Impl"
    // InternalExpAuto.g:3282:1: rule__SetValueProvider__Group_1__2__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) ;
    public final void rule__SetValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3286:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) )
            // InternalExpAuto.g:3287:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            {
            // InternalExpAuto.g:3287:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            // InternalExpAuto.g:3288:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 
            // InternalExpAuto.g:3289:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            // InternalExpAuto.g:3289:3: rule__SetValueProvider__ValuesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__ValuesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__2__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1__3"
    // InternalExpAuto.g:3297:1: rule__SetValueProvider__Group_1__3 : rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 ;
    public final void rule__SetValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3301:1: ( rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 )
            // InternalExpAuto.g:3302:2: rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4
            {
            pushFollow(FOLLOW_32);
            rule__SetValueProvider__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__3"


    // $ANTLR start "rule__SetValueProvider__Group_1__3__Impl"
    // InternalExpAuto.g:3309:1: rule__SetValueProvider__Group_1__3__Impl : ( ( rule__SetValueProvider__Group_1_3__0 )* ) ;
    public final void rule__SetValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3313:1: ( ( ( rule__SetValueProvider__Group_1_3__0 )* ) )
            // InternalExpAuto.g:3314:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            {
            // InternalExpAuto.g:3314:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            // InternalExpAuto.g:3315:2: ( rule__SetValueProvider__Group_1_3__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 
            // InternalExpAuto.g:3316:2: ( rule__SetValueProvider__Group_1_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:3316:3: rule__SetValueProvider__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SetValueProvider__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__3__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1__4"
    // InternalExpAuto.g:3324:1: rule__SetValueProvider__Group_1__4 : rule__SetValueProvider__Group_1__4__Impl ;
    public final void rule__SetValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3328:1: ( rule__SetValueProvider__Group_1__4__Impl )
            // InternalExpAuto.g:3329:2: rule__SetValueProvider__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__4"


    // $ANTLR start "rule__SetValueProvider__Group_1__4__Impl"
    // InternalExpAuto.g:3335:1: rule__SetValueProvider__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SetValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3339:1: ( ( ')' ) )
            // InternalExpAuto.g:3340:1: ( ')' )
            {
            // InternalExpAuto.g:3340:1: ( ')' )
            // InternalExpAuto.g:3341:2: ')'
            {
             before(grammarAccess.getSetValueProviderAccess().getRightParenthesisKeyword_1_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1__4__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1_3__0"
    // InternalExpAuto.g:3351:1: rule__SetValueProvider__Group_1_3__0 : rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 ;
    public final void rule__SetValueProvider__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3355:1: ( rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 )
            // InternalExpAuto.g:3356:2: rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1
            {
            pushFollow(FOLLOW_25);
            rule__SetValueProvider__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1_3__0"


    // $ANTLR start "rule__SetValueProvider__Group_1_3__0__Impl"
    // InternalExpAuto.g:3363:1: rule__SetValueProvider__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3367:1: ( ( ',' ) )
            // InternalExpAuto.g:3368:1: ( ',' )
            {
            // InternalExpAuto.g:3368:1: ( ',' )
            // InternalExpAuto.g:3369:2: ','
            {
             before(grammarAccess.getSetValueProviderAccess().getCommaKeyword_1_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1_3__0__Impl"


    // $ANTLR start "rule__SetValueProvider__Group_1_3__1"
    // InternalExpAuto.g:3378:1: rule__SetValueProvider__Group_1_3__1 : rule__SetValueProvider__Group_1_3__1__Impl ;
    public final void rule__SetValueProvider__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3382:1: ( rule__SetValueProvider__Group_1_3__1__Impl )
            // InternalExpAuto.g:3383:2: rule__SetValueProvider__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1_3__1"


    // $ANTLR start "rule__SetValueProvider__Group_1_3__1__Impl"
    // InternalExpAuto.g:3389:1: rule__SetValueProvider__Group_1_3__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) ;
    public final void rule__SetValueProvider__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3393:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) )
            // InternalExpAuto.g:3394:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            {
            // InternalExpAuto.g:3394:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            // InternalExpAuto.g:3395:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 
            // InternalExpAuto.g:3396:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            // InternalExpAuto.g:3396:3: rule__SetValueProvider__ValuesAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SetValueProvider__ValuesAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__Group_1_3__1__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__0"
    // InternalExpAuto.g:3405:1: rule__LinearValueProvider__Group__0 : rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 ;
    public final void rule__LinearValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3409:1: ( rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 )
            // InternalExpAuto.g:3410:2: rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__LinearValueProvider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__0"


    // $ANTLR start "rule__LinearValueProvider__Group__0__Impl"
    // InternalExpAuto.g:3417:1: rule__LinearValueProvider__Group__0__Impl : ( 'linear' ) ;
    public final void rule__LinearValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3421:1: ( ( 'linear' ) )
            // InternalExpAuto.g:3422:1: ( 'linear' )
            {
            // InternalExpAuto.g:3422:1: ( 'linear' )
            // InternalExpAuto.g:3423:2: 'linear'
            {
             before(grammarAccess.getLinearValueProviderAccess().getLinearKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getLinearKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__0__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__1"
    // InternalExpAuto.g:3432:1: rule__LinearValueProvider__Group__1 : rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 ;
    public final void rule__LinearValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3436:1: ( rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 )
            // InternalExpAuto.g:3437:2: rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LinearValueProvider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__1"


    // $ANTLR start "rule__LinearValueProvider__Group__1__Impl"
    // InternalExpAuto.g:3444:1: rule__LinearValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__LinearValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3448:1: ( ( '(' ) )
            // InternalExpAuto.g:3449:1: ( '(' )
            {
            // InternalExpAuto.g:3449:1: ( '(' )
            // InternalExpAuto.g:3450:2: '('
            {
             before(grammarAccess.getLinearValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__1__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__2"
    // InternalExpAuto.g:3459:1: rule__LinearValueProvider__Group__2 : rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 ;
    public final void rule__LinearValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3463:1: ( rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 )
            // InternalExpAuto.g:3464:2: rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__LinearValueProvider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__2"


    // $ANTLR start "rule__LinearValueProvider__Group__2__Impl"
    // InternalExpAuto.g:3471:1: rule__LinearValueProvider__Group__2__Impl : ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) ;
    public final void rule__LinearValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3475:1: ( ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) )
            // InternalExpAuto.g:3476:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            {
            // InternalExpAuto.g:3476:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            // InternalExpAuto.g:3477:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 
            // InternalExpAuto.g:3478:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            // InternalExpAuto.g:3478:3: rule__LinearValueProvider__SummandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__SummandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__2__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__3"
    // InternalExpAuto.g:3486:1: rule__LinearValueProvider__Group__3 : rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 ;
    public final void rule__LinearValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3490:1: ( rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 )
            // InternalExpAuto.g:3491:2: rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__LinearValueProvider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__3"


    // $ANTLR start "rule__LinearValueProvider__Group__3__Impl"
    // InternalExpAuto.g:3498:1: rule__LinearValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__LinearValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3502:1: ( ( ',' ) )
            // InternalExpAuto.g:3503:1: ( ',' )
            {
            // InternalExpAuto.g:3503:1: ( ',' )
            // InternalExpAuto.g:3504:2: ','
            {
             before(grammarAccess.getLinearValueProviderAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__3__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__4"
    // InternalExpAuto.g:3513:1: rule__LinearValueProvider__Group__4 : rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 ;
    public final void rule__LinearValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3517:1: ( rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 )
            // InternalExpAuto.g:3518:2: rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__LinearValueProvider__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__4"


    // $ANTLR start "rule__LinearValueProvider__Group__4__Impl"
    // InternalExpAuto.g:3525:1: rule__LinearValueProvider__Group__4__Impl : ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__LinearValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3529:1: ( ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3530:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3530:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3531:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3532:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3532:3: rule__LinearValueProvider__FactorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__FactorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__4__Impl"


    // $ANTLR start "rule__LinearValueProvider__Group__5"
    // InternalExpAuto.g:3540:1: rule__LinearValueProvider__Group__5 : rule__LinearValueProvider__Group__5__Impl ;
    public final void rule__LinearValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3544:1: ( rule__LinearValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3545:2: rule__LinearValueProvider__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinearValueProvider__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__5"


    // $ANTLR start "rule__LinearValueProvider__Group__5__Impl"
    // InternalExpAuto.g:3551:1: rule__LinearValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__LinearValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3555:1: ( ( ')' ) )
            // InternalExpAuto.g:3556:1: ( ')' )
            {
            // InternalExpAuto.g:3556:1: ( ')' )
            // InternalExpAuto.g:3557:2: ')'
            {
             before(grammarAccess.getLinearValueProviderAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__Group__5__Impl"


    // $ANTLR start "rule__ExponentialValueProvider__Group__0"
    // InternalExpAuto.g:3567:1: rule__ExponentialValueProvider__Group__0 : rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 ;
    public final void rule__ExponentialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3571:1: ( rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 )
            // InternalExpAuto.g:3572:2: rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExponentialValueProvider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__0"


    // $ANTLR start "rule__ExponentialValueProvider__Group__0__Impl"
    // InternalExpAuto.g:3579:1: rule__ExponentialValueProvider__Group__0__Impl : ( 'exponential' ) ;
    public final void rule__ExponentialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3583:1: ( ( 'exponential' ) )
            // InternalExpAuto.g:3584:1: ( 'exponential' )
            {
            // InternalExpAuto.g:3584:1: ( 'exponential' )
            // InternalExpAuto.g:3585:2: 'exponential'
            {
             before(grammarAccess.getExponentialValueProviderAccess().getExponentialKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExponentialValueProviderAccess().getExponentialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__0__Impl"


    // $ANTLR start "rule__ExponentialValueProvider__Group__1"
    // InternalExpAuto.g:3594:1: rule__ExponentialValueProvider__Group__1 : rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 ;
    public final void rule__ExponentialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3598:1: ( rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 )
            // InternalExpAuto.g:3599:2: rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ExponentialValueProvider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__1"


    // $ANTLR start "rule__ExponentialValueProvider__Group__1__Impl"
    // InternalExpAuto.g:3606:1: rule__ExponentialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__ExponentialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3610:1: ( ( '(' ) )
            // InternalExpAuto.g:3611:1: ( '(' )
            {
            // InternalExpAuto.g:3611:1: ( '(' )
            // InternalExpAuto.g:3612:2: '('
            {
             before(grammarAccess.getExponentialValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExponentialValueProviderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__1__Impl"


    // $ANTLR start "rule__ExponentialValueProvider__Group__2"
    // InternalExpAuto.g:3621:1: rule__ExponentialValueProvider__Group__2 : rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 ;
    public final void rule__ExponentialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3625:1: ( rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 )
            // InternalExpAuto.g:3626:2: rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ExponentialValueProvider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__2"


    // $ANTLR start "rule__ExponentialValueProvider__Group__2__Impl"
    // InternalExpAuto.g:3633:1: rule__ExponentialValueProvider__Group__2__Impl : ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) ;
    public final void rule__ExponentialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3637:1: ( ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) )
            // InternalExpAuto.g:3638:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            {
            // InternalExpAuto.g:3638:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            // InternalExpAuto.g:3639:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 
            // InternalExpAuto.g:3640:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            // InternalExpAuto.g:3640:3: rule__ExponentialValueProvider__BaseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__BaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__2__Impl"


    // $ANTLR start "rule__ExponentialValueProvider__Group__3"
    // InternalExpAuto.g:3648:1: rule__ExponentialValueProvider__Group__3 : rule__ExponentialValueProvider__Group__3__Impl ;
    public final void rule__ExponentialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3652:1: ( rule__ExponentialValueProvider__Group__3__Impl )
            // InternalExpAuto.g:3653:2: rule__ExponentialValueProvider__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentialValueProvider__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__3"


    // $ANTLR start "rule__ExponentialValueProvider__Group__3__Impl"
    // InternalExpAuto.g:3659:1: rule__ExponentialValueProvider__Group__3__Impl : ( ')' ) ;
    public final void rule__ExponentialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3663:1: ( ( ')' ) )
            // InternalExpAuto.g:3664:1: ( ')' )
            {
            // InternalExpAuto.g:3664:1: ( ')' )
            // InternalExpAuto.g:3665:2: ')'
            {
             before(grammarAccess.getExponentialValueProviderAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExponentialValueProviderAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__Group__3__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__0"
    // InternalExpAuto.g:3675:1: rule__PolynomialValueProvider__Group__0 : rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 ;
    public final void rule__PolynomialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3679:1: ( rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 )
            // InternalExpAuto.g:3680:2: rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PolynomialValueProvider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__0"


    // $ANTLR start "rule__PolynomialValueProvider__Group__0__Impl"
    // InternalExpAuto.g:3687:1: rule__PolynomialValueProvider__Group__0__Impl : ( 'polynomial' ) ;
    public final void rule__PolynomialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3691:1: ( ( 'polynomial' ) )
            // InternalExpAuto.g:3692:1: ( 'polynomial' )
            {
            // InternalExpAuto.g:3692:1: ( 'polynomial' )
            // InternalExpAuto.g:3693:2: 'polynomial'
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getPolynomialKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getPolynomialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__0__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__1"
    // InternalExpAuto.g:3702:1: rule__PolynomialValueProvider__Group__1 : rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 ;
    public final void rule__PolynomialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3706:1: ( rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 )
            // InternalExpAuto.g:3707:2: rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__PolynomialValueProvider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__1"


    // $ANTLR start "rule__PolynomialValueProvider__Group__1__Impl"
    // InternalExpAuto.g:3714:1: rule__PolynomialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__PolynomialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3718:1: ( ( '(' ) )
            // InternalExpAuto.g:3719:1: ( '(' )
            {
            // InternalExpAuto.g:3719:1: ( '(' )
            // InternalExpAuto.g:3720:2: '('
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__1__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__2"
    // InternalExpAuto.g:3729:1: rule__PolynomialValueProvider__Group__2 : rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 ;
    public final void rule__PolynomialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3733:1: ( rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 )
            // InternalExpAuto.g:3734:2: rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__PolynomialValueProvider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__2"


    // $ANTLR start "rule__PolynomialValueProvider__Group__2__Impl"
    // InternalExpAuto.g:3741:1: rule__PolynomialValueProvider__Group__2__Impl : ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) ;
    public final void rule__PolynomialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3745:1: ( ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) )
            // InternalExpAuto.g:3746:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            {
            // InternalExpAuto.g:3746:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            // InternalExpAuto.g:3747:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 
            // InternalExpAuto.g:3748:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            // InternalExpAuto.g:3748:3: rule__PolynomialValueProvider__ExponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__ExponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__2__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__3"
    // InternalExpAuto.g:3756:1: rule__PolynomialValueProvider__Group__3 : rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 ;
    public final void rule__PolynomialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3760:1: ( rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 )
            // InternalExpAuto.g:3761:2: rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__PolynomialValueProvider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__3"


    // $ANTLR start "rule__PolynomialValueProvider__Group__3__Impl"
    // InternalExpAuto.g:3768:1: rule__PolynomialValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__PolynomialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3772:1: ( ( ',' ) )
            // InternalExpAuto.g:3773:1: ( ',' )
            {
            // InternalExpAuto.g:3773:1: ( ',' )
            // InternalExpAuto.g:3774:2: ','
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__3__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__4"
    // InternalExpAuto.g:3783:1: rule__PolynomialValueProvider__Group__4 : rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 ;
    public final void rule__PolynomialValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3787:1: ( rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 )
            // InternalExpAuto.g:3788:2: rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PolynomialValueProvider__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__4"


    // $ANTLR start "rule__PolynomialValueProvider__Group__4__Impl"
    // InternalExpAuto.g:3795:1: rule__PolynomialValueProvider__Group__4__Impl : ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__PolynomialValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3799:1: ( ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3800:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3800:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3801:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3802:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3802:3: rule__PolynomialValueProvider__FactorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__FactorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__4__Impl"


    // $ANTLR start "rule__PolynomialValueProvider__Group__5"
    // InternalExpAuto.g:3810:1: rule__PolynomialValueProvider__Group__5 : rule__PolynomialValueProvider__Group__5__Impl ;
    public final void rule__PolynomialValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3814:1: ( rule__PolynomialValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3815:2: rule__PolynomialValueProvider__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolynomialValueProvider__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__5"


    // $ANTLR start "rule__PolynomialValueProvider__Group__5__Impl"
    // InternalExpAuto.g:3821:1: rule__PolynomialValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__PolynomialValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3825:1: ( ( ')' ) )
            // InternalExpAuto.g:3826:1: ( ')' )
            {
            // InternalExpAuto.g:3826:1: ( ')' )
            // InternalExpAuto.g:3827:2: ')'
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__Group__5__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__0"
    // InternalExpAuto.g:3837:1: rule__StopTimeCondition__Group__0 : rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 ;
    public final void rule__StopTimeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3841:1: ( rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 )
            // InternalExpAuto.g:3842:2: rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StopTimeCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__0"


    // $ANTLR start "rule__StopTimeCondition__Group__0__Impl"
    // InternalExpAuto.g:3849:1: rule__StopTimeCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopTimeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3853:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3854:1: ( 'stop' )
            {
            // InternalExpAuto.g:3854:1: ( 'stop' )
            // InternalExpAuto.g:3855:2: 'stop'
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__0__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__1"
    // InternalExpAuto.g:3864:1: rule__StopTimeCondition__Group__1 : rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 ;
    public final void rule__StopTimeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3868:1: ( rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 )
            // InternalExpAuto.g:3869:2: rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__StopTimeCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__1"


    // $ANTLR start "rule__StopTimeCondition__Group__1__Impl"
    // InternalExpAuto.g:3876:1: rule__StopTimeCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopTimeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3880:1: ( ( '=' ) )
            // InternalExpAuto.g:3881:1: ( '=' )
            {
            // InternalExpAuto.g:3881:1: ( '=' )
            // InternalExpAuto.g:3882:2: '='
            {
             before(grammarAccess.getStopTimeConditionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__1__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__2"
    // InternalExpAuto.g:3891:1: rule__StopTimeCondition__Group__2 : rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 ;
    public final void rule__StopTimeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3895:1: ( rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 )
            // InternalExpAuto.g:3896:2: rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StopTimeCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__2"


    // $ANTLR start "rule__StopTimeCondition__Group__2__Impl"
    // InternalExpAuto.g:3903:1: rule__StopTimeCondition__Group__2__Impl : ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopTimeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3907:1: ( ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3908:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3908:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3909:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3910:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3910:3: rule__StopTimeCondition__StopTypAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__StopTypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__2__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__3"
    // InternalExpAuto.g:3918:1: rule__StopTimeCondition__Group__3 : rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 ;
    public final void rule__StopTimeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3922:1: ( rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 )
            // InternalExpAuto.g:3923:2: rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__StopTimeCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__3"


    // $ANTLR start "rule__StopTimeCondition__Group__3__Impl"
    // InternalExpAuto.g:3930:1: rule__StopTimeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopTimeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3934:1: ( ( '(' ) )
            // InternalExpAuto.g:3935:1: ( '(' )
            {
            // InternalExpAuto.g:3935:1: ( '(' )
            // InternalExpAuto.g:3936:2: '('
            {
             before(grammarAccess.getStopTimeConditionAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__3__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__4"
    // InternalExpAuto.g:3945:1: rule__StopTimeCondition__Group__4 : rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 ;
    public final void rule__StopTimeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3949:1: ( rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 )
            // InternalExpAuto.g:3950:2: rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__StopTimeCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__4"


    // $ANTLR start "rule__StopTimeCondition__Group__4__Impl"
    // InternalExpAuto.g:3957:1: rule__StopTimeCondition__Group__4__Impl : ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopTimeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3961:1: ( ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3962:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3962:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3963:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3964:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3964:3: rule__StopTimeCondition__StopParamAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__StopParamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__4__Impl"


    // $ANTLR start "rule__StopTimeCondition__Group__5"
    // InternalExpAuto.g:3972:1: rule__StopTimeCondition__Group__5 : rule__StopTimeCondition__Group__5__Impl ;
    public final void rule__StopTimeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3976:1: ( rule__StopTimeCondition__Group__5__Impl )
            // InternalExpAuto.g:3977:2: rule__StopTimeCondition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopTimeCondition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__5"


    // $ANTLR start "rule__StopTimeCondition__Group__5__Impl"
    // InternalExpAuto.g:3983:1: rule__StopTimeCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopTimeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3987:1: ( ( ')' ) )
            // InternalExpAuto.g:3988:1: ( ')' )
            {
            // InternalExpAuto.g:3988:1: ( ')' )
            // InternalExpAuto.g:3989:2: ')'
            {
             before(grammarAccess.getStopTimeConditionAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__Group__5__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__0"
    // InternalExpAuto.g:3999:1: rule__StopCountCondition__Group__0 : rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 ;
    public final void rule__StopCountCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4003:1: ( rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 )
            // InternalExpAuto.g:4004:2: rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StopCountCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__0"


    // $ANTLR start "rule__StopCountCondition__Group__0__Impl"
    // InternalExpAuto.g:4011:1: rule__StopCountCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopCountCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4015:1: ( ( 'stop' ) )
            // InternalExpAuto.g:4016:1: ( 'stop' )
            {
            // InternalExpAuto.g:4016:1: ( 'stop' )
            // InternalExpAuto.g:4017:2: 'stop'
            {
             before(grammarAccess.getStopCountConditionAccess().getStopKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__0__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__1"
    // InternalExpAuto.g:4026:1: rule__StopCountCondition__Group__1 : rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 ;
    public final void rule__StopCountCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4030:1: ( rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 )
            // InternalExpAuto.g:4031:2: rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__StopCountCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__1"


    // $ANTLR start "rule__StopCountCondition__Group__1__Impl"
    // InternalExpAuto.g:4038:1: rule__StopCountCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopCountCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4042:1: ( ( '=' ) )
            // InternalExpAuto.g:4043:1: ( '=' )
            {
            // InternalExpAuto.g:4043:1: ( '=' )
            // InternalExpAuto.g:4044:2: '='
            {
             before(grammarAccess.getStopCountConditionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__1__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__2"
    // InternalExpAuto.g:4053:1: rule__StopCountCondition__Group__2 : rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 ;
    public final void rule__StopCountCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4057:1: ( rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 )
            // InternalExpAuto.g:4058:2: rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StopCountCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__2"


    // $ANTLR start "rule__StopCountCondition__Group__2__Impl"
    // InternalExpAuto.g:4065:1: rule__StopCountCondition__Group__2__Impl : ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopCountCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4069:1: ( ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:4070:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:4070:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:4071:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:4072:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:4072:3: rule__StopCountCondition__StopTypAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StopCountCondition__StopTypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__2__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__3"
    // InternalExpAuto.g:4080:1: rule__StopCountCondition__Group__3 : rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 ;
    public final void rule__StopCountCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4084:1: ( rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 )
            // InternalExpAuto.g:4085:2: rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__StopCountCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__3"


    // $ANTLR start "rule__StopCountCondition__Group__3__Impl"
    // InternalExpAuto.g:4092:1: rule__StopCountCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopCountCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4096:1: ( ( '(' ) )
            // InternalExpAuto.g:4097:1: ( '(' )
            {
            // InternalExpAuto.g:4097:1: ( '(' )
            // InternalExpAuto.g:4098:2: '('
            {
             before(grammarAccess.getStopCountConditionAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__3__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__4"
    // InternalExpAuto.g:4107:1: rule__StopCountCondition__Group__4 : rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 ;
    public final void rule__StopCountCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4111:1: ( rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 )
            // InternalExpAuto.g:4112:2: rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__StopCountCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__4"


    // $ANTLR start "rule__StopCountCondition__Group__4__Impl"
    // InternalExpAuto.g:4119:1: rule__StopCountCondition__Group__4__Impl : ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopCountCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4123:1: ( ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:4124:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:4124:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:4125:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:4126:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:4126:3: rule__StopCountCondition__StopParamAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StopCountCondition__StopParamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__4__Impl"


    // $ANTLR start "rule__StopCountCondition__Group__5"
    // InternalExpAuto.g:4134:1: rule__StopCountCondition__Group__5 : rule__StopCountCondition__Group__5__Impl ;
    public final void rule__StopCountCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4138:1: ( rule__StopCountCondition__Group__5__Impl )
            // InternalExpAuto.g:4139:2: rule__StopCountCondition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopCountCondition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__5"


    // $ANTLR start "rule__StopCountCondition__Group__5__Impl"
    // InternalExpAuto.g:4145:1: rule__StopCountCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopCountCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4149:1: ( ( ')' ) )
            // InternalExpAuto.g:4150:1: ( ')' )
            {
            // InternalExpAuto.g:4150:1: ( ')' )
            // InternalExpAuto.g:4151:2: ')'
            {
             before(grammarAccess.getStopCountConditionAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__Group__5__Impl"


    // $ANTLR start "rule__NumberOfExperiments__Group__0"
    // InternalExpAuto.g:4161:1: rule__NumberOfExperiments__Group__0 : rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 ;
    public final void rule__NumberOfExperiments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4165:1: ( rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 )
            // InternalExpAuto.g:4166:2: rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NumberOfExperiments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOfExperiments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__0"


    // $ANTLR start "rule__NumberOfExperiments__Group__0__Impl"
    // InternalExpAuto.g:4173:1: rule__NumberOfExperiments__Group__0__Impl : ( 'repetitions' ) ;
    public final void rule__NumberOfExperiments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4177:1: ( ( 'repetitions' ) )
            // InternalExpAuto.g:4178:1: ( 'repetitions' )
            {
            // InternalExpAuto.g:4178:1: ( 'repetitions' )
            // InternalExpAuto.g:4179:2: 'repetitions'
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getRepetitionsKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNumberOfExperimentsAccess().getRepetitionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__0__Impl"


    // $ANTLR start "rule__NumberOfExperiments__Group__1"
    // InternalExpAuto.g:4188:1: rule__NumberOfExperiments__Group__1 : rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 ;
    public final void rule__NumberOfExperiments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4192:1: ( rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 )
            // InternalExpAuto.g:4193:2: rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__NumberOfExperiments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOfExperiments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__1"


    // $ANTLR start "rule__NumberOfExperiments__Group__1__Impl"
    // InternalExpAuto.g:4200:1: rule__NumberOfExperiments__Group__1__Impl : ( '=' ) ;
    public final void rule__NumberOfExperiments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4204:1: ( ( '=' ) )
            // InternalExpAuto.g:4205:1: ( '=' )
            {
            // InternalExpAuto.g:4205:1: ( '=' )
            // InternalExpAuto.g:4206:2: '='
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOfExperimentsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__1__Impl"


    // $ANTLR start "rule__NumberOfExperiments__Group__2"
    // InternalExpAuto.g:4215:1: rule__NumberOfExperiments__Group__2 : rule__NumberOfExperiments__Group__2__Impl ;
    public final void rule__NumberOfExperiments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4219:1: ( rule__NumberOfExperiments__Group__2__Impl )
            // InternalExpAuto.g:4220:2: rule__NumberOfExperiments__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberOfExperiments__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__2"


    // $ANTLR start "rule__NumberOfExperiments__Group__2__Impl"
    // InternalExpAuto.g:4226:1: rule__NumberOfExperiments__Group__2__Impl : ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) ;
    public final void rule__NumberOfExperiments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4230:1: ( ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) )
            // InternalExpAuto.g:4231:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            {
            // InternalExpAuto.g:4231:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            // InternalExpAuto.g:4232:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 
            // InternalExpAuto.g:4233:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            // InternalExpAuto.g:4233:3: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__Group__2__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__0"
    // InternalExpAuto.g:4242:1: rule__SeedDefinition__Group__0 : rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 ;
    public final void rule__SeedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4246:1: ( rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 )
            // InternalExpAuto.g:4247:2: rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SeedDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__0"


    // $ANTLR start "rule__SeedDefinition__Group__0__Impl"
    // InternalExpAuto.g:4254:1: rule__SeedDefinition__Group__0__Impl : ( 'seeds' ) ;
    public final void rule__SeedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4258:1: ( ( 'seeds' ) )
            // InternalExpAuto.g:4259:1: ( 'seeds' )
            {
            // InternalExpAuto.g:4259:1: ( 'seeds' )
            // InternalExpAuto.g:4260:2: 'seeds'
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedsKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSeedDefinitionAccess().getSeedsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__0__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__1"
    // InternalExpAuto.g:4269:1: rule__SeedDefinition__Group__1 : rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 ;
    public final void rule__SeedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4273:1: ( rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 )
            // InternalExpAuto.g:4274:2: rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SeedDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__1"


    // $ANTLR start "rule__SeedDefinition__Group__1__Impl"
    // InternalExpAuto.g:4281:1: rule__SeedDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__SeedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4285:1: ( ( '=' ) )
            // InternalExpAuto.g:4286:1: ( '=' )
            {
            // InternalExpAuto.g:4286:1: ( '=' )
            // InternalExpAuto.g:4287:2: '='
            {
             before(grammarAccess.getSeedDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSeedDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__1__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__2"
    // InternalExpAuto.g:4296:1: rule__SeedDefinition__Group__2 : rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 ;
    public final void rule__SeedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4300:1: ( rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 )
            // InternalExpAuto.g:4301:2: rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SeedDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__2"


    // $ANTLR start "rule__SeedDefinition__Group__2__Impl"
    // InternalExpAuto.g:4308:1: rule__SeedDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4312:1: ( ( '{' ) )
            // InternalExpAuto.g:4313:1: ( '{' )
            {
            // InternalExpAuto.g:4313:1: ( '{' )
            // InternalExpAuto.g:4314:2: '{'
            {
             before(grammarAccess.getSeedDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSeedDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__2__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__3"
    // InternalExpAuto.g:4323:1: rule__SeedDefinition__Group__3 : rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 ;
    public final void rule__SeedDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4327:1: ( rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 )
            // InternalExpAuto.g:4328:2: rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__SeedDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__3"


    // $ANTLR start "rule__SeedDefinition__Group__3__Impl"
    // InternalExpAuto.g:4335:1: rule__SeedDefinition__Group__3__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) ;
    public final void rule__SeedDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4339:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) )
            // InternalExpAuto.g:4340:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            {
            // InternalExpAuto.g:4340:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            // InternalExpAuto.g:4341:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 
            // InternalExpAuto.g:4342:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            // InternalExpAuto.g:4342:3: rule__SeedDefinition__SeedListsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SeedDefinition__SeedListsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__3__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__4"
    // InternalExpAuto.g:4350:1: rule__SeedDefinition__Group__4 : rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 ;
    public final void rule__SeedDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4354:1: ( rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 )
            // InternalExpAuto.g:4355:2: rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__SeedDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__4"


    // $ANTLR start "rule__SeedDefinition__Group__4__Impl"
    // InternalExpAuto.g:4362:1: rule__SeedDefinition__Group__4__Impl : ( ( rule__SeedDefinition__Group_4__0 )* ) ;
    public final void rule__SeedDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4366:1: ( ( ( rule__SeedDefinition__Group_4__0 )* ) )
            // InternalExpAuto.g:4367:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            {
            // InternalExpAuto.g:4367:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            // InternalExpAuto.g:4368:2: ( rule__SeedDefinition__Group_4__0 )*
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 
            // InternalExpAuto.g:4369:2: ( rule__SeedDefinition__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:4369:3: rule__SeedDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SeedDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__4__Impl"


    // $ANTLR start "rule__SeedDefinition__Group__5"
    // InternalExpAuto.g:4377:1: rule__SeedDefinition__Group__5 : rule__SeedDefinition__Group__5__Impl ;
    public final void rule__SeedDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4381:1: ( rule__SeedDefinition__Group__5__Impl )
            // InternalExpAuto.g:4382:2: rule__SeedDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__5"


    // $ANTLR start "rule__SeedDefinition__Group__5__Impl"
    // InternalExpAuto.g:4388:1: rule__SeedDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__SeedDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4392:1: ( ( '}' ) )
            // InternalExpAuto.g:4393:1: ( '}' )
            {
            // InternalExpAuto.g:4393:1: ( '}' )
            // InternalExpAuto.g:4394:2: '}'
            {
             before(grammarAccess.getSeedDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSeedDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group__5__Impl"


    // $ANTLR start "rule__SeedDefinition__Group_4__0"
    // InternalExpAuto.g:4404:1: rule__SeedDefinition__Group_4__0 : rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 ;
    public final void rule__SeedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4408:1: ( rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 )
            // InternalExpAuto.g:4409:2: rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__SeedDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group_4__0"


    // $ANTLR start "rule__SeedDefinition__Group_4__0__Impl"
    // InternalExpAuto.g:4416:1: rule__SeedDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SeedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4420:1: ( ( ',' ) )
            // InternalExpAuto.g:4421:1: ( ',' )
            {
            // InternalExpAuto.g:4421:1: ( ',' )
            // InternalExpAuto.g:4422:2: ','
            {
             before(grammarAccess.getSeedDefinitionAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSeedDefinitionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__SeedDefinition__Group_4__1"
    // InternalExpAuto.g:4431:1: rule__SeedDefinition__Group_4__1 : rule__SeedDefinition__Group_4__1__Impl ;
    public final void rule__SeedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4435:1: ( rule__SeedDefinition__Group_4__1__Impl )
            // InternalExpAuto.g:4436:2: rule__SeedDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeedDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group_4__1"


    // $ANTLR start "rule__SeedDefinition__Group_4__1__Impl"
    // InternalExpAuto.g:4442:1: rule__SeedDefinition__Group_4__1__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) ;
    public final void rule__SeedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4446:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) )
            // InternalExpAuto.g:4447:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            {
            // InternalExpAuto.g:4447:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            // InternalExpAuto.g:4448:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 
            // InternalExpAuto.g:4449:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            // InternalExpAuto.g:4449:3: rule__SeedDefinition__SeedListsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SeedDefinition__SeedListsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group__0"
    // InternalExpAuto.g:4458:1: rule__ListOfSeeds__Group__0 : rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 ;
    public final void rule__ListOfSeeds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4462:1: ( rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 )
            // InternalExpAuto.g:4463:2: rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ListOfSeeds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__0"


    // $ANTLR start "rule__ListOfSeeds__Group__0__Impl"
    // InternalExpAuto.g:4470:1: rule__ListOfSeeds__Group__0__Impl : ( '{' ) ;
    public final void rule__ListOfSeeds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4474:1: ( ( '{' ) )
            // InternalExpAuto.g:4475:1: ( '{' )
            {
            // InternalExpAuto.g:4475:1: ( '{' )
            // InternalExpAuto.g:4476:2: '{'
            {
             before(grammarAccess.getListOfSeedsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListOfSeedsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__0__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group__1"
    // InternalExpAuto.g:4485:1: rule__ListOfSeeds__Group__1 : rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 ;
    public final void rule__ListOfSeeds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4489:1: ( rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 )
            // InternalExpAuto.g:4490:2: rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__ListOfSeeds__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__1"


    // $ANTLR start "rule__ListOfSeeds__Group__1__Impl"
    // InternalExpAuto.g:4497:1: rule__ListOfSeeds__Group__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) ;
    public final void rule__ListOfSeeds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4501:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) )
            // InternalExpAuto.g:4502:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            {
            // InternalExpAuto.g:4502:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            // InternalExpAuto.g:4503:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 
            // InternalExpAuto.g:4504:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            // InternalExpAuto.g:4504:3: rule__ListOfSeeds__SeedsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__SeedsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__1__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group__2"
    // InternalExpAuto.g:4512:1: rule__ListOfSeeds__Group__2 : rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 ;
    public final void rule__ListOfSeeds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4516:1: ( rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 )
            // InternalExpAuto.g:4517:2: rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ListOfSeeds__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__2"


    // $ANTLR start "rule__ListOfSeeds__Group__2__Impl"
    // InternalExpAuto.g:4524:1: rule__ListOfSeeds__Group__2__Impl : ( ( rule__ListOfSeeds__Group_2__0 )* ) ;
    public final void rule__ListOfSeeds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4528:1: ( ( ( rule__ListOfSeeds__Group_2__0 )* ) )
            // InternalExpAuto.g:4529:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            {
            // InternalExpAuto.g:4529:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            // InternalExpAuto.g:4530:2: ( rule__ListOfSeeds__Group_2__0 )*
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup_2()); 
            // InternalExpAuto.g:4531:2: ( rule__ListOfSeeds__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:4531:3: rule__ListOfSeeds__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ListOfSeeds__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getListOfSeedsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__2__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group__3"
    // InternalExpAuto.g:4539:1: rule__ListOfSeeds__Group__3 : rule__ListOfSeeds__Group__3__Impl ;
    public final void rule__ListOfSeeds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4543:1: ( rule__ListOfSeeds__Group__3__Impl )
            // InternalExpAuto.g:4544:2: rule__ListOfSeeds__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__3"


    // $ANTLR start "rule__ListOfSeeds__Group__3__Impl"
    // InternalExpAuto.g:4550:1: rule__ListOfSeeds__Group__3__Impl : ( '}' ) ;
    public final void rule__ListOfSeeds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4554:1: ( ( '}' ) )
            // InternalExpAuto.g:4555:1: ( '}' )
            {
            // InternalExpAuto.g:4555:1: ( '}' )
            // InternalExpAuto.g:4556:2: '}'
            {
             before(grammarAccess.getListOfSeedsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListOfSeedsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group__3__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group_2__0"
    // InternalExpAuto.g:4566:1: rule__ListOfSeeds__Group_2__0 : rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 ;
    public final void rule__ListOfSeeds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4570:1: ( rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 )
            // InternalExpAuto.g:4571:2: rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__ListOfSeeds__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group_2__0"


    // $ANTLR start "rule__ListOfSeeds__Group_2__0__Impl"
    // InternalExpAuto.g:4578:1: rule__ListOfSeeds__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOfSeeds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4582:1: ( ( ',' ) )
            // InternalExpAuto.g:4583:1: ( ',' )
            {
            // InternalExpAuto.g:4583:1: ( ',' )
            // InternalExpAuto.g:4584:2: ','
            {
             before(grammarAccess.getListOfSeedsAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getListOfSeedsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group_2__0__Impl"


    // $ANTLR start "rule__ListOfSeeds__Group_2__1"
    // InternalExpAuto.g:4593:1: rule__ListOfSeeds__Group_2__1 : rule__ListOfSeeds__Group_2__1__Impl ;
    public final void rule__ListOfSeeds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4597:1: ( rule__ListOfSeeds__Group_2__1__Impl )
            // InternalExpAuto.g:4598:2: rule__ListOfSeeds__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group_2__1"


    // $ANTLR start "rule__ListOfSeeds__Group_2__1__Impl"
    // InternalExpAuto.g:4604:1: rule__ListOfSeeds__Group_2__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) ;
    public final void rule__ListOfSeeds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4608:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) )
            // InternalExpAuto.g:4609:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            {
            // InternalExpAuto.g:4609:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            // InternalExpAuto.g:4610:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 
            // InternalExpAuto.g:4611:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            // InternalExpAuto.g:4611:3: rule__ListOfSeeds__SeedsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfSeeds__SeedsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__Group_2__1__Impl"


    // $ANTLR start "rule__ExperimentDatasource__Group__0"
    // InternalExpAuto.g:4620:1: rule__ExperimentDatasource__Group__0 : rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 ;
    public final void rule__ExperimentDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4624:1: ( rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 )
            // InternalExpAuto.g:4625:2: rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ExperimentDatasource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentDatasource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__0"


    // $ANTLR start "rule__ExperimentDatasource__Group__0__Impl"
    // InternalExpAuto.g:4632:1: rule__ExperimentDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__ExperimentDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4636:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:4637:1: ( 'datasource' )
            {
            // InternalExpAuto.g:4637:1: ( 'datasource' )
            // InternalExpAuto.g:4638:2: 'datasource'
            {
             before(grammarAccess.getExperimentDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExperimentDatasourceAccess().getDatasourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__0__Impl"


    // $ANTLR start "rule__ExperimentDatasource__Group__1"
    // InternalExpAuto.g:4647:1: rule__ExperimentDatasource__Group__1 : rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 ;
    public final void rule__ExperimentDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4651:1: ( rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 )
            // InternalExpAuto.g:4652:2: rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExperimentDatasource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentDatasource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__1"


    // $ANTLR start "rule__ExperimentDatasource__Group__1__Impl"
    // InternalExpAuto.g:4659:1: rule__ExperimentDatasource__Group__1__Impl : ( '=' ) ;
    public final void rule__ExperimentDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4663:1: ( ( '=' ) )
            // InternalExpAuto.g:4664:1: ( '=' )
            {
            // InternalExpAuto.g:4664:1: ( '=' )
            // InternalExpAuto.g:4665:2: '='
            {
             before(grammarAccess.getExperimentDatasourceAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExperimentDatasourceAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__1__Impl"


    // $ANTLR start "rule__ExperimentDatasource__Group__2"
    // InternalExpAuto.g:4674:1: rule__ExperimentDatasource__Group__2 : rule__ExperimentDatasource__Group__2__Impl ;
    public final void rule__ExperimentDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4678:1: ( rule__ExperimentDatasource__Group__2__Impl )
            // InternalExpAuto.g:4679:2: rule__ExperimentDatasource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentDatasource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__2"


    // $ANTLR start "rule__ExperimentDatasource__Group__2__Impl"
    // InternalExpAuto.g:4685:1: rule__ExperimentDatasource__Group__2__Impl : ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) ;
    public final void rule__ExperimentDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4689:1: ( ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) )
            // InternalExpAuto.g:4690:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            {
            // InternalExpAuto.g:4690:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            // InternalExpAuto.g:4691:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 
            // InternalExpAuto.g:4692:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            // InternalExpAuto.g:4692:3: rule__ExperimentDatasource__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentDatasource__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__Group__2__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__0"
    // InternalExpAuto.g:4701:1: rule__ToolDefinition__Group__0 : rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 ;
    public final void rule__ToolDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4705:1: ( rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 )
            // InternalExpAuto.g:4706:2: rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ToolDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__0"


    // $ANTLR start "rule__ToolDefinition__Group__0__Impl"
    // InternalExpAuto.g:4713:1: rule__ToolDefinition__Group__0__Impl : ( 'tool' ) ;
    public final void rule__ToolDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4717:1: ( ( 'tool' ) )
            // InternalExpAuto.g:4718:1: ( 'tool' )
            {
            // InternalExpAuto.g:4718:1: ( 'tool' )
            // InternalExpAuto.g:4719:2: 'tool'
            {
             before(grammarAccess.getToolDefinitionAccess().getToolKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getToolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__0__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__1"
    // InternalExpAuto.g:4728:1: rule__ToolDefinition__Group__1 : rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 ;
    public final void rule__ToolDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4732:1: ( rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 )
            // InternalExpAuto.g:4733:2: rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ToolDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__1"


    // $ANTLR start "rule__ToolDefinition__Group__1__Impl"
    // InternalExpAuto.g:4740:1: rule__ToolDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__ToolDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4744:1: ( ( '=' ) )
            // InternalExpAuto.g:4745:1: ( '=' )
            {
            // InternalExpAuto.g:4745:1: ( '=' )
            // InternalExpAuto.g:4746:2: '='
            {
             before(grammarAccess.getToolDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__1__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__2"
    // InternalExpAuto.g:4755:1: rule__ToolDefinition__Group__2 : rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 ;
    public final void rule__ToolDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4759:1: ( rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 )
            // InternalExpAuto.g:4760:2: rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ToolDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__2"


    // $ANTLR start "rule__ToolDefinition__Group__2__Impl"
    // InternalExpAuto.g:4767:1: rule__ToolDefinition__Group__2__Impl : ( ( rule__ToolDefinition__ToolAssignment_2 ) ) ;
    public final void rule__ToolDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4771:1: ( ( ( rule__ToolDefinition__ToolAssignment_2 ) ) )
            // InternalExpAuto.g:4772:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            {
            // InternalExpAuto.g:4772:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            // InternalExpAuto.g:4773:2: ( rule__ToolDefinition__ToolAssignment_2 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 
            // InternalExpAuto.g:4774:2: ( rule__ToolDefinition__ToolAssignment_2 )
            // InternalExpAuto.g:4774:3: rule__ToolDefinition__ToolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__ToolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__2__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__3"
    // InternalExpAuto.g:4782:1: rule__ToolDefinition__Group__3 : rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 ;
    public final void rule__ToolDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4786:1: ( rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 )
            // InternalExpAuto.g:4787:2: rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ToolDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__3"


    // $ANTLR start "rule__ToolDefinition__Group__3__Impl"
    // InternalExpAuto.g:4794:1: rule__ToolDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ToolDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4798:1: ( ( '{' ) )
            // InternalExpAuto.g:4799:1: ( '{' )
            {
            // InternalExpAuto.g:4799:1: ( '{' )
            // InternalExpAuto.g:4800:2: '{'
            {
             before(grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__3__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__4"
    // InternalExpAuto.g:4809:1: rule__ToolDefinition__Group__4 : rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 ;
    public final void rule__ToolDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4813:1: ( rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 )
            // InternalExpAuto.g:4814:2: rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ToolDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__4"


    // $ANTLR start "rule__ToolDefinition__Group__4__Impl"
    // InternalExpAuto.g:4821:1: rule__ToolDefinition__Group__4__Impl : ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) ;
    public final void rule__ToolDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4825:1: ( ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) )
            // InternalExpAuto.g:4826:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            {
            // InternalExpAuto.g:4826:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            // InternalExpAuto.g:4827:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_4()); 
            // InternalExpAuto.g:4828:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpAuto.g:4828:3: rule__ToolDefinition__ConfigParamsAssignment_4
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ToolDefinition__ConfigParamsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__4__Impl"


    // $ANTLR start "rule__ToolDefinition__Group__5"
    // InternalExpAuto.g:4836:1: rule__ToolDefinition__Group__5 : rule__ToolDefinition__Group__5__Impl ;
    public final void rule__ToolDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4840:1: ( rule__ToolDefinition__Group__5__Impl )
            // InternalExpAuto.g:4841:2: rule__ToolDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__5"


    // $ANTLR start "rule__ToolDefinition__Group__5__Impl"
    // InternalExpAuto.g:4847:1: rule__ToolDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ToolDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4851:1: ( ( '}' ) )
            // InternalExpAuto.g:4852:1: ( '}' )
            {
            // InternalExpAuto.g:4852:1: ( '}' )
            // InternalExpAuto.g:4853:2: '}'
            {
             before(grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group__5__Impl"


    // $ANTLR start "rule__ConfigurationParams__Group__0"
    // InternalExpAuto.g:4863:1: rule__ConfigurationParams__Group__0 : rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 ;
    public final void rule__ConfigurationParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4867:1: ( rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 )
            // InternalExpAuto.g:4868:2: rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ConfigurationParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__0"


    // $ANTLR start "rule__ConfigurationParams__Group__0__Impl"
    // InternalExpAuto.g:4875:1: rule__ConfigurationParams__Group__0__Impl : ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4879:1: ( ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) )
            // InternalExpAuto.g:4880:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            {
            // InternalExpAuto.g:4880:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            // InternalExpAuto.g:4881:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0()); 
            // InternalExpAuto.g:4882:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            // InternalExpAuto.g:4882:3: rule__ConfigurationParams__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationParams__Group__1"
    // InternalExpAuto.g:4890:1: rule__ConfigurationParams__Group__1 : rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 ;
    public final void rule__ConfigurationParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4894:1: ( rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 )
            // InternalExpAuto.g:4895:2: rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ConfigurationParams__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__1"


    // $ANTLR start "rule__ConfigurationParams__Group__1__Impl"
    // InternalExpAuto.g:4902:1: rule__ConfigurationParams__Group__1__Impl : ( '=' ) ;
    public final void rule__ConfigurationParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4906:1: ( ( '=' ) )
            // InternalExpAuto.g:4907:1: ( '=' )
            {
            // InternalExpAuto.g:4907:1: ( '=' )
            // InternalExpAuto.g:4908:2: '='
            {
             before(grammarAccess.getConfigurationParamsAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConfigurationParamsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationParams__Group__2"
    // InternalExpAuto.g:4917:1: rule__ConfigurationParams__Group__2 : rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3 ;
    public final void rule__ConfigurationParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4921:1: ( rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3 )
            // InternalExpAuto.g:4922:2: rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ConfigurationParams__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__2"


    // $ANTLR start "rule__ConfigurationParams__Group__2__Impl"
    // InternalExpAuto.g:4929:1: rule__ConfigurationParams__Group__2__Impl : ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) ;
    public final void rule__ConfigurationParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4933:1: ( ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) )
            // InternalExpAuto.g:4934:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            {
            // InternalExpAuto.g:4934:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            // InternalExpAuto.g:4935:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2()); 
            // InternalExpAuto.g:4936:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            // InternalExpAuto.g:4936:3: rule__ConfigurationParams__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationParams__Group__3"
    // InternalExpAuto.g:4944:1: rule__ConfigurationParams__Group__3 : rule__ConfigurationParams__Group__3__Impl ;
    public final void rule__ConfigurationParams__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4948:1: ( rule__ConfigurationParams__Group__3__Impl )
            // InternalExpAuto.g:4949:2: rule__ConfigurationParams__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__3"


    // $ANTLR start "rule__ConfigurationParams__Group__3__Impl"
    // InternalExpAuto.g:4955:1: rule__ConfigurationParams__Group__3__Impl : ( ';' ) ;
    public final void rule__ConfigurationParams__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4959:1: ( ( ';' ) )
            // InternalExpAuto.g:4960:1: ( ';' )
            {
            // InternalExpAuto.g:4960:1: ( ';' )
            // InternalExpAuto.g:4961:2: ';'
            {
             before(grammarAccess.getConfigurationParamsAccess().getSemicolonKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConfigurationParamsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__Group__3__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalExpAuto.g:4971:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4975:1: ( ( ruleImport ) )
            // InternalExpAuto.g:4976:2: ( ruleImport )
            {
            // InternalExpAuto.g:4976:2: ( ruleImport )
            // InternalExpAuto.g:4977:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__DatasourcesAssignment_1"
    // InternalExpAuto.g:4986:1: rule__Model__DatasourcesAssignment_1 : ( ruleDatasource ) ;
    public final void rule__Model__DatasourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4990:1: ( ( ruleDatasource ) )
            // InternalExpAuto.g:4991:2: ( ruleDatasource )
            {
            // InternalExpAuto.g:4991:2: ( ruleDatasource )
            // InternalExpAuto.g:4992:3: ruleDatasource
            {
             before(grammarAccess.getModelAccess().getDatasourcesDatasourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatasource();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDatasourcesDatasourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DatasourcesAssignment_1"


    // $ANTLR start "rule__Model__ExperimentsAssignment_2"
    // InternalExpAuto.g:5001:1: rule__Model__ExperimentsAssignment_2 : ( ruleExperiment ) ;
    public final void rule__Model__ExperimentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5005:1: ( ( ruleExperiment ) )
            // InternalExpAuto.g:5006:2: ( ruleExperiment )
            {
            // InternalExpAuto.g:5006:2: ( ruleExperiment )
            // InternalExpAuto.g:5007:3: ruleExperiment
            {
             before(grammarAccess.getModelAccess().getExperimentsExperimentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExperiment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExperimentsExperimentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExperimentsAssignment_2"


    // $ANTLR start "rule__Import__PathAssignment_1"
    // InternalExpAuto.g:5016:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5020:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5021:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5021:2: ( RULE_STRING )
            // InternalExpAuto.g:5022:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__PathAssignment_1"


    // $ANTLR start "rule__FileDatasource__NameAssignment_1"
    // InternalExpAuto.g:5031:1: rule__FileDatasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FileDatasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5035:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5036:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5036:2: ( RULE_ID )
            // InternalExpAuto.g:5037:3: RULE_ID
            {
             before(grammarAccess.getFileDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__NameAssignment_1"


    // $ANTLR start "rule__FileDatasource__SourceTypeAssignment_3"
    // InternalExpAuto.g:5046:1: rule__FileDatasource__SourceTypeAssignment_3 : ( ( 'EDP2' ) ) ;
    public final void rule__FileDatasource__SourceTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5050:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:5051:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:5051:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:5052:3: ( 'EDP2' )
            {
             before(grammarAccess.getFileDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            // InternalExpAuto.g:5053:3: ( 'EDP2' )
            // InternalExpAuto.g:5054:4: 'EDP2'
            {
             before(grammarAccess.getFileDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

            }

             after(grammarAccess.getFileDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__SourceTypeAssignment_3"


    // $ANTLR start "rule__FileDatasource__SourceURIAssignment_5"
    // InternalExpAuto.g:5065:1: rule__FileDatasource__SourceURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FileDatasource__SourceURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5069:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5070:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5070:2: ( RULE_STRING )
            // InternalExpAuto.g:5071:3: RULE_STRING
            {
             before(grammarAccess.getFileDatasourceAccess().getSourceURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceAccess().getSourceURISTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasource__SourceURIAssignment_5"


    // $ANTLR start "rule__MemoryDatasource__NameAssignment_1"
    // InternalExpAuto.g:5080:1: rule__MemoryDatasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MemoryDatasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5084:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5085:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5085:2: ( RULE_ID )
            // InternalExpAuto.g:5086:3: RULE_ID
            {
             before(grammarAccess.getMemoryDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemoryDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__NameAssignment_1"


    // $ANTLR start "rule__MemoryDatasource__SourceTypeAssignment_3"
    // InternalExpAuto.g:5095:1: rule__MemoryDatasource__SourceTypeAssignment_3 : ( ( 'EDP2' ) ) ;
    public final void rule__MemoryDatasource__SourceTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5099:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:5100:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:5100:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:5101:3: ( 'EDP2' )
            {
             before(grammarAccess.getMemoryDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            // InternalExpAuto.g:5102:3: ( 'EDP2' )
            // InternalExpAuto.g:5103:4: 'EDP2'
            {
             before(grammarAccess.getMemoryDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMemoryDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

            }

             after(grammarAccess.getMemoryDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasource__SourceTypeAssignment_3"


    // $ANTLR start "rule__Experiment__NameAssignment_1"
    // InternalExpAuto.g:5114:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5118:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5119:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5119:2: ( RULE_ID )
            // InternalExpAuto.g:5120:3: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__NameAssignment_1"


    // $ANTLR start "rule__Experiment__DesignAssignment_3"
    // InternalExpAuto.g:5129:1: rule__Experiment__DesignAssignment_3 : ( ( rule__Experiment__DesignAlternatives_3_0 ) ) ;
    public final void rule__Experiment__DesignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5133:1: ( ( ( rule__Experiment__DesignAlternatives_3_0 ) ) )
            // InternalExpAuto.g:5134:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            {
            // InternalExpAuto.g:5134:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            // InternalExpAuto.g:5135:3: ( rule__Experiment__DesignAlternatives_3_0 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 
            // InternalExpAuto.g:5136:3: ( rule__Experiment__DesignAlternatives_3_0 )
            // InternalExpAuto.g:5136:4: rule__Experiment__DesignAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__DesignAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__DesignAssignment_3"


    // $ANTLR start "rule__Experiment__ExperimentSpecificationsAssignment_5"
    // InternalExpAuto.g:5144:1: rule__Experiment__ExperimentSpecificationsAssignment_5 : ( ruleExperimentSpecifications ) ;
    public final void rule__Experiment__ExperimentSpecificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5148:1: ( ( ruleExperimentSpecifications ) )
            // InternalExpAuto.g:5149:2: ( ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:5149:2: ( ruleExperimentSpecifications )
            // InternalExpAuto.g:5150:3: ruleExperimentSpecifications
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsExperimentSpecificationsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExperimentSpecifications();

            state._fsp--;

             after(grammarAccess.getExperimentAccess().getExperimentSpecificationsExperimentSpecificationsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__ExperimentSpecificationsAssignment_5"


    // $ANTLR start "rule__ExperimentSpecifications__SpecificationsAssignment"
    // InternalExpAuto.g:5159:1: rule__ExperimentSpecifications__SpecificationsAssignment : ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__ExperimentSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5163:1: ( ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5164:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5164:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5165:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5166:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5166:4: rule__ExperimentSpecifications__SpecificationsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentSpecifications__SpecificationsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentSpecifications__SpecificationsAssignment"


    // $ANTLR start "rule__Description__DescriptionAssignment_2"
    // InternalExpAuto.g:5174:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5178:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5179:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5179:2: ( RULE_STRING )
            // InternalExpAuto.g:5180:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescriptionAssignment_2"


    // $ANTLR start "rule__InitialModel__ModeltypAssignment_2"
    // InternalExpAuto.g:5189:1: rule__InitialModel__ModeltypAssignment_2 : ( ( 'PCM' ) ) ;
    public final void rule__InitialModel__ModeltypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5193:1: ( ( ( 'PCM' ) ) )
            // InternalExpAuto.g:5194:2: ( ( 'PCM' ) )
            {
            // InternalExpAuto.g:5194:2: ( ( 'PCM' ) )
            // InternalExpAuto.g:5195:3: ( 'PCM' )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            // InternalExpAuto.g:5196:3: ( 'PCM' )
            // InternalExpAuto.g:5197:4: 'PCM'
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 

            }

             after(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__ModeltypAssignment_2"


    // $ANTLR start "rule__InitialModel__InitSpecificationsAssignment_4"
    // InternalExpAuto.g:5208:1: rule__InitialModel__InitSpecificationsAssignment_4 : ( ruleInitSpecifications ) ;
    public final void rule__InitialModel__InitSpecificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5212:1: ( ( ruleInitSpecifications ) )
            // InternalExpAuto.g:5213:2: ( ruleInitSpecifications )
            {
            // InternalExpAuto.g:5213:2: ( ruleInitSpecifications )
            // InternalExpAuto.g:5214:3: ruleInitSpecifications
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsInitSpecificationsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInitSpecifications();

            state._fsp--;

             after(grammarAccess.getInitialModelAccess().getInitSpecificationsInitSpecificationsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialModel__InitSpecificationsAssignment_4"


    // $ANTLR start "rule__InitSpecifications__SpecificationsAssignment"
    // InternalExpAuto.g:5223:1: rule__InitSpecifications__SpecificationsAssignment : ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__InitSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5227:1: ( ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5228:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5228:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5229:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5230:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5230:4: rule__InitSpecifications__SpecificationsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__InitSpecifications__SpecificationsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitSpecifications__SpecificationsAssignment"


    // $ANTLR start "rule__AllocationModel__AllocationAssignment_2"
    // InternalExpAuto.g:5238:1: rule__AllocationModel__AllocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllocationModel__AllocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5242:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5243:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5243:2: ( RULE_STRING )
            // InternalExpAuto.g:5244:3: RULE_STRING
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAllocationModelAccess().getAllocationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationModel__AllocationAssignment_2"


    // $ANTLR start "rule__UsageModel__UsageModelAssignment_2"
    // InternalExpAuto.g:5253:1: rule__UsageModel__UsageModelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsageModel__UsageModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5257:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5258:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5258:2: ( RULE_STRING )
            // InternalExpAuto.g:5259:3: RULE_STRING
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsageModelAccess().getUsageModelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageModel__UsageModelAssignment_2"


    // $ANTLR start "rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2"
    // InternalExpAuto.g:5268:1: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5272:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5273:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5273:2: ( RULE_STRING )
            // InternalExpAuto.g:5274:3: RULE_STRING
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositorySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositorySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2"


    // $ANTLR start "rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2"
    // InternalExpAuto.g:5283:1: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5287:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5288:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5288:2: ( RULE_STRING )
            // InternalExpAuto.g:5289:3: RULE_STRING
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositorySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositorySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2"


    // $ANTLR start "rule__MonitorRepository__MonitorRepositoryAssignment_2"
    // InternalExpAuto.g:5298:1: rule__MonitorRepository__MonitorRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonitorRepository__MonitorRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5302:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5303:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5303:2: ( RULE_STRING )
            // InternalExpAuto.g:5304:3: RULE_STRING
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositorySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositorySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorRepository__MonitorRepositoryAssignment_2"


    // $ANTLR start "rule__Variation__VariationTypAssignment_2"
    // InternalExpAuto.g:5313:1: rule__Variation__VariationTypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__VariationTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5317:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5318:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5318:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5319:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 
            // InternalExpAuto.g:5320:3: ( RULE_ID )
            // InternalExpAuto.g:5321:4: RULE_ID
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getVariationTypValueVariationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__VariationTypAssignment_2"


    // $ANTLR start "rule__Variation__NameAssignment_3"
    // InternalExpAuto.g:5332:1: rule__Variation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Variation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5336:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5337:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5337:2: ( RULE_ID )
            // InternalExpAuto.g:5338:3: RULE_ID
            {
             before(grammarAccess.getVariationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__NameAssignment_3"


    // $ANTLR start "rule__Variation__TargetAssignment_7"
    // InternalExpAuto.g:5347:1: rule__Variation__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5351:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5352:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5352:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5353:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0()); 
            // InternalExpAuto.g:5354:3: ( RULE_ID )
            // InternalExpAuto.g:5355:4: RULE_ID
            {
             before(grammarAccess.getVariationAccess().getTargetIdentifierIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getTargetIdentifierIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__TargetAssignment_7"


    // $ANTLR start "rule__Variation__MaxVariationsAssignment_10"
    // InternalExpAuto.g:5366:1: rule__Variation__MaxVariationsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Variation__MaxVariationsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5370:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5371:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5371:2: ( RULE_INT )
            // InternalExpAuto.g:5372:3: RULE_INT
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getMaxVariationsINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__MaxVariationsAssignment_10"


    // $ANTLR start "rule__Variation__ValueProviderAssignment_13"
    // InternalExpAuto.g:5381:1: rule__Variation__ValueProviderAssignment_13 : ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) ;
    public final void rule__Variation__ValueProviderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5385:1: ( ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) )
            // InternalExpAuto.g:5386:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            {
            // InternalExpAuto.g:5386:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            // InternalExpAuto.g:5387:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 
            // InternalExpAuto.g:5388:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            // InternalExpAuto.g:5388:4: rule__Variation__ValueProviderAlternatives_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Variation__ValueProviderAlternatives_13_0();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__ValueProviderAssignment_13"


    // $ANTLR start "rule__NestedIntervalsValueProvider__MinAssignment_0_1"
    // InternalExpAuto.g:5396:1: rule__NestedIntervalsValueProvider__MinAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5400:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5401:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5401:2: ( RULE_INT )
            // InternalExpAuto.g:5402:3: RULE_INT
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__MinAssignment_0_1"


    // $ANTLR start "rule__NestedIntervalsValueProvider__MaxAssignment_0_3"
    // InternalExpAuto.g:5411:1: rule__NestedIntervalsValueProvider__MaxAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5415:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5416:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5416:2: ( RULE_INT )
            // InternalExpAuto.g:5417:3: RULE_INT
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__MaxAssignment_0_3"


    // $ANTLR start "rule__NestedIntervalsValueProvider__MinAssignment_1_2"
    // InternalExpAuto.g:5426:1: rule__NestedIntervalsValueProvider__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5430:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5431:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5431:2: ( RULE_INT )
            // InternalExpAuto.g:5432:3: RULE_INT
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMinINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__MinAssignment_1_2"


    // $ANTLR start "rule__NestedIntervalsValueProvider__MaxAssignment_1_4"
    // InternalExpAuto.g:5441:1: rule__NestedIntervalsValueProvider__MaxAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5445:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5446:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5446:2: ( RULE_INT )
            // InternalExpAuto.g:5447:3: RULE_INT
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxINTTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedIntervalsValueProvider__MaxAssignment_1_4"


    // $ANTLR start "rule__SetValueProvider__ValuesAssignment_0_1"
    // InternalExpAuto.g:5456:1: rule__SetValueProvider__ValuesAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5460:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5461:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5461:2: ( RULE_INT )
            // InternalExpAuto.g:5462:3: RULE_INT
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__ValuesAssignment_0_1"


    // $ANTLR start "rule__SetValueProvider__ValuesAssignment_0_2_1"
    // InternalExpAuto.g:5471:1: rule__SetValueProvider__ValuesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5475:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5476:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5476:2: ( RULE_INT )
            // InternalExpAuto.g:5477:3: RULE_INT
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__ValuesAssignment_0_2_1"


    // $ANTLR start "rule__SetValueProvider__ValuesAssignment_1_2"
    // InternalExpAuto.g:5486:1: rule__SetValueProvider__ValuesAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5490:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5491:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5491:2: ( RULE_INT )
            // InternalExpAuto.g:5492:3: RULE_INT
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__ValuesAssignment_1_2"


    // $ANTLR start "rule__SetValueProvider__ValuesAssignment_1_3_1"
    // InternalExpAuto.g:5501:1: rule__SetValueProvider__ValuesAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5505:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5506:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5506:2: ( RULE_INT )
            // InternalExpAuto.g:5507:3: RULE_INT
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetValueProviderAccess().getValuesINTTerminalRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetValueProvider__ValuesAssignment_1_3_1"


    // $ANTLR start "rule__LinearValueProvider__SummandAssignment_2"
    // InternalExpAuto.g:5516:1: rule__LinearValueProvider__SummandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__SummandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5520:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5521:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5521:2: ( RULE_INT )
            // InternalExpAuto.g:5522:3: RULE_INT
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getSummandINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__SummandAssignment_2"


    // $ANTLR start "rule__LinearValueProvider__FactorAssignment_4"
    // InternalExpAuto.g:5531:1: rule__LinearValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5535:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5536:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5536:2: ( RULE_INT )
            // InternalExpAuto.g:5537:3: RULE_INT
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinearValueProviderAccess().getFactorINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearValueProvider__FactorAssignment_4"


    // $ANTLR start "rule__ExponentialValueProvider__BaseAssignment_2"
    // InternalExpAuto.g:5546:1: rule__ExponentialValueProvider__BaseAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExponentialValueProvider__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5550:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5551:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5551:2: ( RULE_INT )
            // InternalExpAuto.g:5552:3: RULE_INT
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExponentialValueProviderAccess().getBaseINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentialValueProvider__BaseAssignment_2"


    // $ANTLR start "rule__PolynomialValueProvider__ExponentAssignment_2"
    // InternalExpAuto.g:5561:1: rule__PolynomialValueProvider__ExponentAssignment_2 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5565:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5566:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5566:2: ( RULE_INT )
            // InternalExpAuto.g:5567:3: RULE_INT
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getExponentINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__ExponentAssignment_2"


    // $ANTLR start "rule__PolynomialValueProvider__FactorAssignment_4"
    // InternalExpAuto.g:5576:1: rule__PolynomialValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5580:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5581:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5581:2: ( RULE_INT )
            // InternalExpAuto.g:5582:3: RULE_INT
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPolynomialValueProviderAccess().getFactorINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolynomialValueProvider__FactorAssignment_4"


    // $ANTLR start "rule__StopTimeCondition__StopTypAssignment_2"
    // InternalExpAuto.g:5591:1: rule__StopTimeCondition__StopTypAssignment_2 : ( ( 'simulationTime' ) ) ;
    public final void rule__StopTimeCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5595:1: ( ( ( 'simulationTime' ) ) )
            // InternalExpAuto.g:5596:2: ( ( 'simulationTime' ) )
            {
            // InternalExpAuto.g:5596:2: ( ( 'simulationTime' ) )
            // InternalExpAuto.g:5597:3: ( 'simulationTime' )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            // InternalExpAuto.g:5598:3: ( 'simulationTime' )
            // InternalExpAuto.g:5599:4: 'simulationTime'
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 

            }

             after(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__StopTypAssignment_2"


    // $ANTLR start "rule__StopTimeCondition__StopParamAssignment_4"
    // InternalExpAuto.g:5610:1: rule__StopTimeCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopTimeCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5614:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5615:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5615:2: ( RULE_INT )
            // InternalExpAuto.g:5616:3: RULE_INT
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStopTimeConditionAccess().getStopParamINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopTimeCondition__StopParamAssignment_4"


    // $ANTLR start "rule__StopCountCondition__StopTypAssignment_2"
    // InternalExpAuto.g:5625:1: rule__StopCountCondition__StopTypAssignment_2 : ( ( 'measurementCount' ) ) ;
    public final void rule__StopCountCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5629:1: ( ( ( 'measurementCount' ) ) )
            // InternalExpAuto.g:5630:2: ( ( 'measurementCount' ) )
            {
            // InternalExpAuto.g:5630:2: ( ( 'measurementCount' ) )
            // InternalExpAuto.g:5631:3: ( 'measurementCount' )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            // InternalExpAuto.g:5632:3: ( 'measurementCount' )
            // InternalExpAuto.g:5633:4: 'measurementCount'
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 

            }

             after(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__StopTypAssignment_2"


    // $ANTLR start "rule__StopCountCondition__StopParamAssignment_4"
    // InternalExpAuto.g:5644:1: rule__StopCountCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopCountCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5648:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5649:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5649:2: ( RULE_INT )
            // InternalExpAuto.g:5650:3: RULE_INT
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStopCountConditionAccess().getStopParamINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopCountCondition__StopParamAssignment_4"


    // $ANTLR start "rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2"
    // InternalExpAuto.g:5659:1: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5663:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5664:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5664:2: ( RULE_INT )
            // InternalExpAuto.g:5665:3: RULE_INT
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2"


    // $ANTLR start "rule__SeedDefinition__SeedListsAssignment_3"
    // InternalExpAuto.g:5674:1: rule__SeedDefinition__SeedListsAssignment_3 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5678:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5679:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5679:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5680:3: ruleListOfSeeds
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfSeeds();

            state._fsp--;

             after(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__SeedListsAssignment_3"


    // $ANTLR start "rule__SeedDefinition__SeedListsAssignment_4_1"
    // InternalExpAuto.g:5689:1: rule__SeedDefinition__SeedListsAssignment_4_1 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5693:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5694:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5694:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5695:3: ruleListOfSeeds
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfSeeds();

            state._fsp--;

             after(grammarAccess.getSeedDefinitionAccess().getSeedListsListOfSeedsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeedDefinition__SeedListsAssignment_4_1"


    // $ANTLR start "rule__ListOfSeeds__SeedsAssignment_1"
    // InternalExpAuto.g:5704:1: rule__ListOfSeeds__SeedsAssignment_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5708:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5709:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5709:2: ( RULE_INT )
            // InternalExpAuto.g:5710:3: RULE_INT
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__SeedsAssignment_1"


    // $ANTLR start "rule__ListOfSeeds__SeedsAssignment_2_1"
    // InternalExpAuto.g:5719:1: rule__ListOfSeeds__SeedsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5723:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5724:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5724:2: ( RULE_INT )
            // InternalExpAuto.g:5725:3: RULE_INT
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getListOfSeedsAccess().getSeedsINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfSeeds__SeedsAssignment_2_1"


    // $ANTLR start "rule__ExperimentDatasource__SourceAssignment_2"
    // InternalExpAuto.g:5734:1: rule__ExperimentDatasource__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExperimentDatasource__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5738:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5739:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5739:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5740:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalExpAuto.g:5741:3: ( RULE_ID )
            // InternalExpAuto.g:5742:4: RULE_ID
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentDatasource__SourceAssignment_2"


    // $ANTLR start "rule__ToolDefinition__ToolAssignment_2"
    // InternalExpAuto.g:5753:1: rule__ToolDefinition__ToolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ToolDefinition__ToolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5757:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5758:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5758:2: ( RULE_STRING )
            // InternalExpAuto.g:5759:3: RULE_STRING
            {
             before(grammarAccess.getToolDefinitionAccess().getToolSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getToolSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__ToolAssignment_2"


    // $ANTLR start "rule__ToolDefinition__ConfigParamsAssignment_4"
    // InternalExpAuto.g:5768:1: rule__ToolDefinition__ConfigParamsAssignment_4 : ( ruleConfigurationParams ) ;
    public final void rule__ToolDefinition__ConfigParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5772:1: ( ( ruleConfigurationParams ) )
            // InternalExpAuto.g:5773:2: ( ruleConfigurationParams )
            {
            // InternalExpAuto.g:5773:2: ( ruleConfigurationParams )
            // InternalExpAuto.g:5774:3: ruleConfigurationParams
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationParams();

            state._fsp--;

             after(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__ConfigParamsAssignment_4"


    // $ANTLR start "rule__ConfigurationParams__KeyAssignment_0"
    // InternalExpAuto.g:5783:1: rule__ConfigurationParams__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigurationParams__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5787:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5788:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5788:2: ( RULE_ID )
            // InternalExpAuto.g:5789:3: RULE_ID
            {
             before(grammarAccess.getConfigurationParamsAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationParamsAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__KeyAssignment_0"


    // $ANTLR start "rule__ConfigurationParams__ValueAssignment_2"
    // InternalExpAuto.g:5798:1: rule__ConfigurationParams__ValueAssignment_2 : ( ruleConfigValue ) ;
    public final void rule__ConfigurationParams__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5802:1: ( ( ruleConfigValue ) )
            // InternalExpAuto.g:5803:2: ( ruleConfigValue )
            {
            // InternalExpAuto.g:5803:2: ( ruleConfigValue )
            // InternalExpAuto.g:5804:3: ruleConfigValue
            {
             before(grammarAccess.getConfigurationParamsAccess().getValueConfigValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigValue();

            state._fsp--;

             after(grammarAccess.getConfigurationParamsAccess().getValueConfigValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__ValueAssignment_2"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\16\3\uffff\1\26\4\uffff\1\60\2\uffff";
    static final String dfa_3s = "\1\54\3\uffff\1\26\4\uffff\1\61\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\5\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\6\uffff\1\1\1\uffff\1\2\5\uffff\1\3\13\uffff\1\4\1\5\1\6\1\10",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "858:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001E0020A04002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001E0020A04000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001F200080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});

}