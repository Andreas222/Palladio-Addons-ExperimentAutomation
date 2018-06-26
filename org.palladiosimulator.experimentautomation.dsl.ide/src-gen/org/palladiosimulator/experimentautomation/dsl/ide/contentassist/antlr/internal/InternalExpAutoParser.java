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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FullFactorial'", "'OneFactor'", "'SimuCom'", "'SimuLizar'", "'import'", "'datasource'", "':'", "'('", "')'", "'experiment'", "'{'", "'}'", "'description'", "'='", "'initial'", "'allocation'", "'usageModel'", "'middlewareRepository'", "'eventMiddlewareRepository'", "'monitorRepository'", "'variation'", "'target'", "'maxVariations'", "'values'", "'['", "','", "']'", "'nestedIntervall'", "'setValues'", "'linear'", "'exponential'", "'polynomial'", "'stop'", "'repetitions'", "'seeds'", "'tool'", "';'", "'EDP2'", "'PCM'", "'simulationTime'", "'measurementCount'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    // InternalExpAuto.g:112:1: ruleDatasource : ( ( rule__Datasource__Group__0 ) ) ;
    public final void ruleDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:116:2: ( ( ( rule__Datasource__Group__0 ) ) )
            // InternalExpAuto.g:117:2: ( ( rule__Datasource__Group__0 ) )
            {
            // InternalExpAuto.g:117:2: ( ( rule__Datasource__Group__0 ) )
            // InternalExpAuto.g:118:3: ( rule__Datasource__Group__0 )
            {
             before(grammarAccess.getDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:119:3: ( rule__Datasource__Group__0 )
            // InternalExpAuto.g:119:4: rule__Datasource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getGroup()); 

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


    // $ANTLR start "entryRuleExperiment"
    // InternalExpAuto.g:128:1: entryRuleExperiment : ruleExperiment EOF ;
    public final void entryRuleExperiment() throws RecognitionException {
        try {
            // InternalExpAuto.g:129:1: ( ruleExperiment EOF )
            // InternalExpAuto.g:130:1: ruleExperiment EOF
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
    // InternalExpAuto.g:137:1: ruleExperiment : ( ( rule__Experiment__Group__0 ) ) ;
    public final void ruleExperiment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:141:2: ( ( ( rule__Experiment__Group__0 ) ) )
            // InternalExpAuto.g:142:2: ( ( rule__Experiment__Group__0 ) )
            {
            // InternalExpAuto.g:142:2: ( ( rule__Experiment__Group__0 ) )
            // InternalExpAuto.g:143:3: ( rule__Experiment__Group__0 )
            {
             before(grammarAccess.getExperimentAccess().getGroup()); 
            // InternalExpAuto.g:144:3: ( rule__Experiment__Group__0 )
            // InternalExpAuto.g:144:4: rule__Experiment__Group__0
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
    // InternalExpAuto.g:153:1: entryRuleExperimentSpecifications : ruleExperimentSpecifications EOF ;
    public final void entryRuleExperimentSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:154:1: ( ruleExperimentSpecifications EOF )
            // InternalExpAuto.g:155:1: ruleExperimentSpecifications EOF
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
    // InternalExpAuto.g:162:1: ruleExperimentSpecifications : ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleExperimentSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:166:2: ( ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:167:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:167:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:168:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:168:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:169:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:170:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:170:5: rule__ExperimentSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:173:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:174:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:175:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==23||LA1_0==25||LA1_0==31||(LA1_0>=43 && LA1_0<=46)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpAuto.g:175:5: rule__ExperimentSpecifications__SpecificationsAssignment
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
    // InternalExpAuto.g:185:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalExpAuto.g:186:1: ( ruleDescription EOF )
            // InternalExpAuto.g:187:1: ruleDescription EOF
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
    // InternalExpAuto.g:194:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:198:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalExpAuto.g:199:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalExpAuto.g:199:2: ( ( rule__Description__Group__0 ) )
            // InternalExpAuto.g:200:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalExpAuto.g:201:3: ( rule__Description__Group__0 )
            // InternalExpAuto.g:201:4: rule__Description__Group__0
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
    // InternalExpAuto.g:210:1: entryRuleInitialModel : ruleInitialModel EOF ;
    public final void entryRuleInitialModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:211:1: ( ruleInitialModel EOF )
            // InternalExpAuto.g:212:1: ruleInitialModel EOF
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
    // InternalExpAuto.g:219:1: ruleInitialModel : ( ( rule__InitialModel__Group__0 ) ) ;
    public final void ruleInitialModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:223:2: ( ( ( rule__InitialModel__Group__0 ) ) )
            // InternalExpAuto.g:224:2: ( ( rule__InitialModel__Group__0 ) )
            {
            // InternalExpAuto.g:224:2: ( ( rule__InitialModel__Group__0 ) )
            // InternalExpAuto.g:225:3: ( rule__InitialModel__Group__0 )
            {
             before(grammarAccess.getInitialModelAccess().getGroup()); 
            // InternalExpAuto.g:226:3: ( rule__InitialModel__Group__0 )
            // InternalExpAuto.g:226:4: rule__InitialModel__Group__0
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
    // InternalExpAuto.g:235:1: entryRuleInitSpecifications : ruleInitSpecifications EOF ;
    public final void entryRuleInitSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:236:1: ( ruleInitSpecifications EOF )
            // InternalExpAuto.g:237:1: ruleInitSpecifications EOF
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
    // InternalExpAuto.g:244:1: ruleInitSpecifications : ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleInitSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:248:2: ( ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:249:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:249:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:250:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:250:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:251:4: ( rule__InitSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:252:4: ( rule__InitSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:252:5: rule__InitSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__InitSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:255:3: ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:256:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:257:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=26 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpAuto.g:257:5: rule__InitSpecifications__SpecificationsAssignment
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
    // InternalExpAuto.g:267:1: entryRuleAllocationModel : ruleAllocationModel EOF ;
    public final void entryRuleAllocationModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:268:1: ( ruleAllocationModel EOF )
            // InternalExpAuto.g:269:1: ruleAllocationModel EOF
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
    // InternalExpAuto.g:276:1: ruleAllocationModel : ( ( rule__AllocationModel__Group__0 ) ) ;
    public final void ruleAllocationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:280:2: ( ( ( rule__AllocationModel__Group__0 ) ) )
            // InternalExpAuto.g:281:2: ( ( rule__AllocationModel__Group__0 ) )
            {
            // InternalExpAuto.g:281:2: ( ( rule__AllocationModel__Group__0 ) )
            // InternalExpAuto.g:282:3: ( rule__AllocationModel__Group__0 )
            {
             before(grammarAccess.getAllocationModelAccess().getGroup()); 
            // InternalExpAuto.g:283:3: ( rule__AllocationModel__Group__0 )
            // InternalExpAuto.g:283:4: rule__AllocationModel__Group__0
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
    // InternalExpAuto.g:292:1: entryRuleUsageModel : ruleUsageModel EOF ;
    public final void entryRuleUsageModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:293:1: ( ruleUsageModel EOF )
            // InternalExpAuto.g:294:1: ruleUsageModel EOF
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
    // InternalExpAuto.g:301:1: ruleUsageModel : ( ( rule__UsageModel__Group__0 ) ) ;
    public final void ruleUsageModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:305:2: ( ( ( rule__UsageModel__Group__0 ) ) )
            // InternalExpAuto.g:306:2: ( ( rule__UsageModel__Group__0 ) )
            {
            // InternalExpAuto.g:306:2: ( ( rule__UsageModel__Group__0 ) )
            // InternalExpAuto.g:307:3: ( rule__UsageModel__Group__0 )
            {
             before(grammarAccess.getUsageModelAccess().getGroup()); 
            // InternalExpAuto.g:308:3: ( rule__UsageModel__Group__0 )
            // InternalExpAuto.g:308:4: rule__UsageModel__Group__0
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
    // InternalExpAuto.g:317:1: entryRuleMiddlewareRepository : ruleMiddlewareRepository EOF ;
    public final void entryRuleMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:318:1: ( ruleMiddlewareRepository EOF )
            // InternalExpAuto.g:319:1: ruleMiddlewareRepository EOF
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
    // InternalExpAuto.g:326:1: ruleMiddlewareRepository : ( ( rule__MiddlewareRepository__Group__0 ) ) ;
    public final void ruleMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:330:2: ( ( ( rule__MiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:331:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:331:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:332:3: ( rule__MiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:333:3: ( rule__MiddlewareRepository__Group__0 )
            // InternalExpAuto.g:333:4: rule__MiddlewareRepository__Group__0
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
    // InternalExpAuto.g:342:1: entryRuleEventMiddlewareRepository : ruleEventMiddlewareRepository EOF ;
    public final void entryRuleEventMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:343:1: ( ruleEventMiddlewareRepository EOF )
            // InternalExpAuto.g:344:1: ruleEventMiddlewareRepository EOF
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
    // InternalExpAuto.g:351:1: ruleEventMiddlewareRepository : ( ( rule__EventMiddlewareRepository__Group__0 ) ) ;
    public final void ruleEventMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:355:2: ( ( ( rule__EventMiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:356:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:356:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:357:3: ( rule__EventMiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:358:3: ( rule__EventMiddlewareRepository__Group__0 )
            // InternalExpAuto.g:358:4: rule__EventMiddlewareRepository__Group__0
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
    // InternalExpAuto.g:367:1: entryRuleMonitorRepository : ruleMonitorRepository EOF ;
    public final void entryRuleMonitorRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:368:1: ( ruleMonitorRepository EOF )
            // InternalExpAuto.g:369:1: ruleMonitorRepository EOF
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
    // InternalExpAuto.g:376:1: ruleMonitorRepository : ( ( rule__MonitorRepository__Group__0 ) ) ;
    public final void ruleMonitorRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:380:2: ( ( ( rule__MonitorRepository__Group__0 ) ) )
            // InternalExpAuto.g:381:2: ( ( rule__MonitorRepository__Group__0 ) )
            {
            // InternalExpAuto.g:381:2: ( ( rule__MonitorRepository__Group__0 ) )
            // InternalExpAuto.g:382:3: ( rule__MonitorRepository__Group__0 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:383:3: ( rule__MonitorRepository__Group__0 )
            // InternalExpAuto.g:383:4: rule__MonitorRepository__Group__0
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
    // InternalExpAuto.g:392:1: entryRuleVariation : ruleVariation EOF ;
    public final void entryRuleVariation() throws RecognitionException {
        try {
            // InternalExpAuto.g:393:1: ( ruleVariation EOF )
            // InternalExpAuto.g:394:1: ruleVariation EOF
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
    // InternalExpAuto.g:401:1: ruleVariation : ( ( rule__Variation__Group__0 ) ) ;
    public final void ruleVariation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:405:2: ( ( ( rule__Variation__Group__0 ) ) )
            // InternalExpAuto.g:406:2: ( ( rule__Variation__Group__0 ) )
            {
            // InternalExpAuto.g:406:2: ( ( rule__Variation__Group__0 ) )
            // InternalExpAuto.g:407:3: ( rule__Variation__Group__0 )
            {
             before(grammarAccess.getVariationAccess().getGroup()); 
            // InternalExpAuto.g:408:3: ( rule__Variation__Group__0 )
            // InternalExpAuto.g:408:4: rule__Variation__Group__0
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
    // InternalExpAuto.g:417:1: entryRuleNestedIntervalsValueProvider : ruleNestedIntervalsValueProvider EOF ;
    public final void entryRuleNestedIntervalsValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:418:1: ( ruleNestedIntervalsValueProvider EOF )
            // InternalExpAuto.g:419:1: ruleNestedIntervalsValueProvider EOF
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
    // InternalExpAuto.g:426:1: ruleNestedIntervalsValueProvider : ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) ;
    public final void ruleNestedIntervalsValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:430:2: ( ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:431:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:431:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            // InternalExpAuto.g:432:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:433:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            // InternalExpAuto.g:433:4: rule__NestedIntervalsValueProvider__Alternatives
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
    // InternalExpAuto.g:442:1: entryRuleSetValueProvider : ruleSetValueProvider EOF ;
    public final void entryRuleSetValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:443:1: ( ruleSetValueProvider EOF )
            // InternalExpAuto.g:444:1: ruleSetValueProvider EOF
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
    // InternalExpAuto.g:451:1: ruleSetValueProvider : ( ( rule__SetValueProvider__Alternatives ) ) ;
    public final void ruleSetValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:455:2: ( ( ( rule__SetValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:456:2: ( ( rule__SetValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:456:2: ( ( rule__SetValueProvider__Alternatives ) )
            // InternalExpAuto.g:457:3: ( rule__SetValueProvider__Alternatives )
            {
             before(grammarAccess.getSetValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:458:3: ( rule__SetValueProvider__Alternatives )
            // InternalExpAuto.g:458:4: rule__SetValueProvider__Alternatives
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
    // InternalExpAuto.g:467:1: entryRuleLinearValueProvider : ruleLinearValueProvider EOF ;
    public final void entryRuleLinearValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:468:1: ( ruleLinearValueProvider EOF )
            // InternalExpAuto.g:469:1: ruleLinearValueProvider EOF
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
    // InternalExpAuto.g:476:1: ruleLinearValueProvider : ( ( rule__LinearValueProvider__Group__0 ) ) ;
    public final void ruleLinearValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:480:2: ( ( ( rule__LinearValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:481:2: ( ( rule__LinearValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:481:2: ( ( rule__LinearValueProvider__Group__0 ) )
            // InternalExpAuto.g:482:3: ( rule__LinearValueProvider__Group__0 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:483:3: ( rule__LinearValueProvider__Group__0 )
            // InternalExpAuto.g:483:4: rule__LinearValueProvider__Group__0
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
    // InternalExpAuto.g:492:1: entryRuleExponentialValueProvider : ruleExponentialValueProvider EOF ;
    public final void entryRuleExponentialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:493:1: ( ruleExponentialValueProvider EOF )
            // InternalExpAuto.g:494:1: ruleExponentialValueProvider EOF
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
    // InternalExpAuto.g:501:1: ruleExponentialValueProvider : ( ( rule__ExponentialValueProvider__Group__0 ) ) ;
    public final void ruleExponentialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:505:2: ( ( ( rule__ExponentialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:506:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:506:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            // InternalExpAuto.g:507:3: ( rule__ExponentialValueProvider__Group__0 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:508:3: ( rule__ExponentialValueProvider__Group__0 )
            // InternalExpAuto.g:508:4: rule__ExponentialValueProvider__Group__0
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
    // InternalExpAuto.g:517:1: entryRulePolynomialValueProvider : rulePolynomialValueProvider EOF ;
    public final void entryRulePolynomialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:518:1: ( rulePolynomialValueProvider EOF )
            // InternalExpAuto.g:519:1: rulePolynomialValueProvider EOF
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
    // InternalExpAuto.g:526:1: rulePolynomialValueProvider : ( ( rule__PolynomialValueProvider__Group__0 ) ) ;
    public final void rulePolynomialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:530:2: ( ( ( rule__PolynomialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:531:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:531:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            // InternalExpAuto.g:532:3: ( rule__PolynomialValueProvider__Group__0 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:533:3: ( rule__PolynomialValueProvider__Group__0 )
            // InternalExpAuto.g:533:4: rule__PolynomialValueProvider__Group__0
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
    // InternalExpAuto.g:542:1: entryRuleStopTimeCondition : ruleStopTimeCondition EOF ;
    public final void entryRuleStopTimeCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:543:1: ( ruleStopTimeCondition EOF )
            // InternalExpAuto.g:544:1: ruleStopTimeCondition EOF
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
    // InternalExpAuto.g:551:1: ruleStopTimeCondition : ( ( rule__StopTimeCondition__Group__0 ) ) ;
    public final void ruleStopTimeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:555:2: ( ( ( rule__StopTimeCondition__Group__0 ) ) )
            // InternalExpAuto.g:556:2: ( ( rule__StopTimeCondition__Group__0 ) )
            {
            // InternalExpAuto.g:556:2: ( ( rule__StopTimeCondition__Group__0 ) )
            // InternalExpAuto.g:557:3: ( rule__StopTimeCondition__Group__0 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getGroup()); 
            // InternalExpAuto.g:558:3: ( rule__StopTimeCondition__Group__0 )
            // InternalExpAuto.g:558:4: rule__StopTimeCondition__Group__0
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
    // InternalExpAuto.g:567:1: entryRuleStopCountCondition : ruleStopCountCondition EOF ;
    public final void entryRuleStopCountCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:568:1: ( ruleStopCountCondition EOF )
            // InternalExpAuto.g:569:1: ruleStopCountCondition EOF
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
    // InternalExpAuto.g:576:1: ruleStopCountCondition : ( ( rule__StopCountCondition__Group__0 ) ) ;
    public final void ruleStopCountCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:580:2: ( ( ( rule__StopCountCondition__Group__0 ) ) )
            // InternalExpAuto.g:581:2: ( ( rule__StopCountCondition__Group__0 ) )
            {
            // InternalExpAuto.g:581:2: ( ( rule__StopCountCondition__Group__0 ) )
            // InternalExpAuto.g:582:3: ( rule__StopCountCondition__Group__0 )
            {
             before(grammarAccess.getStopCountConditionAccess().getGroup()); 
            // InternalExpAuto.g:583:3: ( rule__StopCountCondition__Group__0 )
            // InternalExpAuto.g:583:4: rule__StopCountCondition__Group__0
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
    // InternalExpAuto.g:592:1: entryRuleNumberOfExperiments : ruleNumberOfExperiments EOF ;
    public final void entryRuleNumberOfExperiments() throws RecognitionException {
        try {
            // InternalExpAuto.g:593:1: ( ruleNumberOfExperiments EOF )
            // InternalExpAuto.g:594:1: ruleNumberOfExperiments EOF
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
    // InternalExpAuto.g:601:1: ruleNumberOfExperiments : ( ( rule__NumberOfExperiments__Group__0 ) ) ;
    public final void ruleNumberOfExperiments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:605:2: ( ( ( rule__NumberOfExperiments__Group__0 ) ) )
            // InternalExpAuto.g:606:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            {
            // InternalExpAuto.g:606:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            // InternalExpAuto.g:607:3: ( rule__NumberOfExperiments__Group__0 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getGroup()); 
            // InternalExpAuto.g:608:3: ( rule__NumberOfExperiments__Group__0 )
            // InternalExpAuto.g:608:4: rule__NumberOfExperiments__Group__0
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
    // InternalExpAuto.g:617:1: entryRuleSeedDefinition : ruleSeedDefinition EOF ;
    public final void entryRuleSeedDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:618:1: ( ruleSeedDefinition EOF )
            // InternalExpAuto.g:619:1: ruleSeedDefinition EOF
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
    // InternalExpAuto.g:626:1: ruleSeedDefinition : ( ( rule__SeedDefinition__Group__0 ) ) ;
    public final void ruleSeedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:630:2: ( ( ( rule__SeedDefinition__Group__0 ) ) )
            // InternalExpAuto.g:631:2: ( ( rule__SeedDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:631:2: ( ( rule__SeedDefinition__Group__0 ) )
            // InternalExpAuto.g:632:3: ( rule__SeedDefinition__Group__0 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:633:3: ( rule__SeedDefinition__Group__0 )
            // InternalExpAuto.g:633:4: rule__SeedDefinition__Group__0
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
    // InternalExpAuto.g:642:1: entryRuleListOfSeeds : ruleListOfSeeds EOF ;
    public final void entryRuleListOfSeeds() throws RecognitionException {
        try {
            // InternalExpAuto.g:643:1: ( ruleListOfSeeds EOF )
            // InternalExpAuto.g:644:1: ruleListOfSeeds EOF
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
    // InternalExpAuto.g:651:1: ruleListOfSeeds : ( ( rule__ListOfSeeds__Group__0 ) ) ;
    public final void ruleListOfSeeds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:655:2: ( ( ( rule__ListOfSeeds__Group__0 ) ) )
            // InternalExpAuto.g:656:2: ( ( rule__ListOfSeeds__Group__0 ) )
            {
            // InternalExpAuto.g:656:2: ( ( rule__ListOfSeeds__Group__0 ) )
            // InternalExpAuto.g:657:3: ( rule__ListOfSeeds__Group__0 )
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup()); 
            // InternalExpAuto.g:658:3: ( rule__ListOfSeeds__Group__0 )
            // InternalExpAuto.g:658:4: rule__ListOfSeeds__Group__0
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
    // InternalExpAuto.g:667:1: entryRuleExperimentDatasource : ruleExperimentDatasource EOF ;
    public final void entryRuleExperimentDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:668:1: ( ruleExperimentDatasource EOF )
            // InternalExpAuto.g:669:1: ruleExperimentDatasource EOF
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
    // InternalExpAuto.g:676:1: ruleExperimentDatasource : ( ( rule__ExperimentDatasource__Group__0 ) ) ;
    public final void ruleExperimentDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:680:2: ( ( ( rule__ExperimentDatasource__Group__0 ) ) )
            // InternalExpAuto.g:681:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:681:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            // InternalExpAuto.g:682:3: ( rule__ExperimentDatasource__Group__0 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:683:3: ( rule__ExperimentDatasource__Group__0 )
            // InternalExpAuto.g:683:4: rule__ExperimentDatasource__Group__0
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
    // InternalExpAuto.g:692:1: entryRuleToolDefinition : ruleToolDefinition EOF ;
    public final void entryRuleToolDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:693:1: ( ruleToolDefinition EOF )
            // InternalExpAuto.g:694:1: ruleToolDefinition EOF
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
    // InternalExpAuto.g:701:1: ruleToolDefinition : ( ( rule__ToolDefinition__Group__0 ) ) ;
    public final void ruleToolDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:705:2: ( ( ( rule__ToolDefinition__Group__0 ) ) )
            // InternalExpAuto.g:706:2: ( ( rule__ToolDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:706:2: ( ( rule__ToolDefinition__Group__0 ) )
            // InternalExpAuto.g:707:3: ( rule__ToolDefinition__Group__0 )
            {
             before(grammarAccess.getToolDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:708:3: ( rule__ToolDefinition__Group__0 )
            // InternalExpAuto.g:708:4: rule__ToolDefinition__Group__0
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
    // InternalExpAuto.g:717:1: entryRuleConfigurationParams : ruleConfigurationParams EOF ;
    public final void entryRuleConfigurationParams() throws RecognitionException {
        try {
            // InternalExpAuto.g:718:1: ( ruleConfigurationParams EOF )
            // InternalExpAuto.g:719:1: ruleConfigurationParams EOF
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
    // InternalExpAuto.g:726:1: ruleConfigurationParams : ( ( rule__ConfigurationParams__Group__0 ) ) ;
    public final void ruleConfigurationParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:730:2: ( ( ( rule__ConfigurationParams__Group__0 ) ) )
            // InternalExpAuto.g:731:2: ( ( rule__ConfigurationParams__Group__0 ) )
            {
            // InternalExpAuto.g:731:2: ( ( rule__ConfigurationParams__Group__0 ) )
            // InternalExpAuto.g:732:3: ( rule__ConfigurationParams__Group__0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getGroup()); 
            // InternalExpAuto.g:733:3: ( rule__ConfigurationParams__Group__0 )
            // InternalExpAuto.g:733:4: rule__ConfigurationParams__Group__0
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
    // InternalExpAuto.g:742:1: entryRuleConfigValue : ruleConfigValue EOF ;
    public final void entryRuleConfigValue() throws RecognitionException {
        try {
            // InternalExpAuto.g:743:1: ( ruleConfigValue EOF )
            // InternalExpAuto.g:744:1: ruleConfigValue EOF
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
    // InternalExpAuto.g:751:1: ruleConfigValue : ( ( rule__ConfigValue__Alternatives ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:755:2: ( ( ( rule__ConfigValue__Alternatives ) ) )
            // InternalExpAuto.g:756:2: ( ( rule__ConfigValue__Alternatives ) )
            {
            // InternalExpAuto.g:756:2: ( ( rule__ConfigValue__Alternatives ) )
            // InternalExpAuto.g:757:3: ( rule__ConfigValue__Alternatives )
            {
             before(grammarAccess.getConfigValueAccess().getAlternatives()); 
            // InternalExpAuto.g:758:3: ( rule__ConfigValue__Alternatives )
            // InternalExpAuto.g:758:4: rule__ConfigValue__Alternatives
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


    // $ANTLR start "rule__Experiment__DesignAlternatives_3_0"
    // InternalExpAuto.g:766:1: rule__Experiment__DesignAlternatives_3_0 : ( ( 'FullFactorial' ) | ( 'OneFactor' ) );
    public final void rule__Experiment__DesignAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:770:1: ( ( 'FullFactorial' ) | ( 'OneFactor' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpAuto.g:771:2: ( 'FullFactorial' )
                    {
                    // InternalExpAuto.g:771:2: ( 'FullFactorial' )
                    // InternalExpAuto.g:772:3: 'FullFactorial'
                    {
                     before(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:777:2: ( 'OneFactor' )
                    {
                    // InternalExpAuto.g:777:2: ( 'OneFactor' )
                    // InternalExpAuto.g:778:3: 'OneFactor'
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
    // InternalExpAuto.g:787:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) );
    public final void rule__ExperimentSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:791:1: ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalExpAuto.g:792:2: ( ruleDescription )
                    {
                    // InternalExpAuto.g:792:2: ( ruleDescription )
                    // InternalExpAuto.g:793:3: ruleDescription
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
                    // InternalExpAuto.g:798:2: ( ruleInitialModel )
                    {
                    // InternalExpAuto.g:798:2: ( ruleInitialModel )
                    // InternalExpAuto.g:799:3: ruleInitialModel
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
                    // InternalExpAuto.g:804:2: ( ruleVariation )
                    {
                    // InternalExpAuto.g:804:2: ( ruleVariation )
                    // InternalExpAuto.g:805:3: ruleVariation
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
                    // InternalExpAuto.g:810:2: ( ruleStopTimeCondition )
                    {
                    // InternalExpAuto.g:810:2: ( ruleStopTimeCondition )
                    // InternalExpAuto.g:811:3: ruleStopTimeCondition
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
                    // InternalExpAuto.g:816:2: ( ruleStopCountCondition )
                    {
                    // InternalExpAuto.g:816:2: ( ruleStopCountCondition )
                    // InternalExpAuto.g:817:3: ruleStopCountCondition
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
                    // InternalExpAuto.g:822:2: ( ruleNumberOfExperiments )
                    {
                    // InternalExpAuto.g:822:2: ( ruleNumberOfExperiments )
                    // InternalExpAuto.g:823:3: ruleNumberOfExperiments
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
                    // InternalExpAuto.g:828:2: ( ruleSeedDefinition )
                    {
                    // InternalExpAuto.g:828:2: ( ruleSeedDefinition )
                    // InternalExpAuto.g:829:3: ruleSeedDefinition
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
                    // InternalExpAuto.g:834:2: ( ruleExperimentDatasource )
                    {
                    // InternalExpAuto.g:834:2: ( ruleExperimentDatasource )
                    // InternalExpAuto.g:835:3: ruleExperimentDatasource
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
                    // InternalExpAuto.g:840:2: ( ruleToolDefinition )
                    {
                    // InternalExpAuto.g:840:2: ( ruleToolDefinition )
                    // InternalExpAuto.g:841:3: ruleToolDefinition
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
    // InternalExpAuto.g:850:1: rule__InitSpecifications__SpecificationsAlternatives_0 : ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) );
    public final void rule__InitSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:854:1: ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExpAuto.g:855:2: ( ruleAllocationModel )
                    {
                    // InternalExpAuto.g:855:2: ( ruleAllocationModel )
                    // InternalExpAuto.g:856:3: ruleAllocationModel
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
                    // InternalExpAuto.g:861:2: ( ruleUsageModel )
                    {
                    // InternalExpAuto.g:861:2: ( ruleUsageModel )
                    // InternalExpAuto.g:862:3: ruleUsageModel
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
                    // InternalExpAuto.g:867:2: ( ruleMiddlewareRepository )
                    {
                    // InternalExpAuto.g:867:2: ( ruleMiddlewareRepository )
                    // InternalExpAuto.g:868:3: ruleMiddlewareRepository
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
                    // InternalExpAuto.g:873:2: ( ruleEventMiddlewareRepository )
                    {
                    // InternalExpAuto.g:873:2: ( ruleEventMiddlewareRepository )
                    // InternalExpAuto.g:874:3: ruleEventMiddlewareRepository
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
                    // InternalExpAuto.g:879:2: ( ruleMonitorRepository )
                    {
                    // InternalExpAuto.g:879:2: ( ruleMonitorRepository )
                    // InternalExpAuto.g:880:3: ruleMonitorRepository
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
    // InternalExpAuto.g:889:1: rule__Variation__ValueProviderAlternatives_13_0 : ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) );
    public final void rule__Variation__ValueProviderAlternatives_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:893:1: ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 35:
            case 38:
                {
                alt6=1;
                }
                break;
            case 21:
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 41:
                {
                alt6=4;
                }
                break;
            case 42:
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
                    // InternalExpAuto.g:894:2: ( ruleNestedIntervalsValueProvider )
                    {
                    // InternalExpAuto.g:894:2: ( ruleNestedIntervalsValueProvider )
                    // InternalExpAuto.g:895:3: ruleNestedIntervalsValueProvider
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
                    // InternalExpAuto.g:900:2: ( ruleSetValueProvider )
                    {
                    // InternalExpAuto.g:900:2: ( ruleSetValueProvider )
                    // InternalExpAuto.g:901:3: ruleSetValueProvider
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
                    // InternalExpAuto.g:906:2: ( ruleLinearValueProvider )
                    {
                    // InternalExpAuto.g:906:2: ( ruleLinearValueProvider )
                    // InternalExpAuto.g:907:3: ruleLinearValueProvider
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
                    // InternalExpAuto.g:912:2: ( ruleExponentialValueProvider )
                    {
                    // InternalExpAuto.g:912:2: ( ruleExponentialValueProvider )
                    // InternalExpAuto.g:913:3: ruleExponentialValueProvider
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
                    // InternalExpAuto.g:918:2: ( rulePolynomialValueProvider )
                    {
                    // InternalExpAuto.g:918:2: ( rulePolynomialValueProvider )
                    // InternalExpAuto.g:919:3: rulePolynomialValueProvider
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
    // InternalExpAuto.g:928:1: rule__NestedIntervalsValueProvider__Alternatives : ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) );
    public final void rule__NestedIntervalsValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:932:1: ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpAuto.g:933:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:933:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:934:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:935:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    // InternalExpAuto.g:935:4: rule__NestedIntervalsValueProvider__Group_0__0
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
                    // InternalExpAuto.g:939:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:939:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:940:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:941:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    // InternalExpAuto.g:941:4: rule__NestedIntervalsValueProvider__Group_1__0
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
    // InternalExpAuto.g:949:1: rule__SetValueProvider__Alternatives : ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) );
    public final void rule__SetValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:953:1: ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpAuto.g:954:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:954:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:955:3: ( rule__SetValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:956:3: ( rule__SetValueProvider__Group_0__0 )
                    // InternalExpAuto.g:956:4: rule__SetValueProvider__Group_0__0
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
                    // InternalExpAuto.g:960:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:960:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:961:3: ( rule__SetValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:962:3: ( rule__SetValueProvider__Group_1__0 )
                    // InternalExpAuto.g:962:4: rule__SetValueProvider__Group_1__0
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


    // $ANTLR start "rule__ToolDefinition__ToolAlternatives_2_0"
    // InternalExpAuto.g:970:1: rule__ToolDefinition__ToolAlternatives_2_0 : ( ( 'SimuCom' ) | ( 'SimuLizar' ) );
    public final void rule__ToolDefinition__ToolAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:974:1: ( ( 'SimuCom' ) | ( 'SimuLizar' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpAuto.g:975:2: ( 'SimuCom' )
                    {
                    // InternalExpAuto.g:975:2: ( 'SimuCom' )
                    // InternalExpAuto.g:976:3: 'SimuCom'
                    {
                     before(grammarAccess.getToolDefinitionAccess().getToolSimuComKeyword_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getToolDefinitionAccess().getToolSimuComKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:981:2: ( 'SimuLizar' )
                    {
                    // InternalExpAuto.g:981:2: ( 'SimuLizar' )
                    // InternalExpAuto.g:982:3: 'SimuLizar'
                    {
                     before(grammarAccess.getToolDefinitionAccess().getToolSimuLizarKeyword_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getToolDefinitionAccess().getToolSimuLizarKeyword_2_0_1()); 

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
    // $ANTLR end "rule__ToolDefinition__ToolAlternatives_2_0"


    // $ANTLR start "rule__ConfigValue__Alternatives"
    // InternalExpAuto.g:991:1: rule__ConfigValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__ConfigValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:995:1: ( ( RULE_STRING ) | ( RULE_INT ) )
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
                    // InternalExpAuto.g:996:2: ( RULE_STRING )
                    {
                    // InternalExpAuto.g:996:2: ( RULE_STRING )
                    // InternalExpAuto.g:997:3: RULE_STRING
                    {
                     before(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1002:2: ( RULE_INT )
                    {
                    // InternalExpAuto.g:1002:2: ( RULE_INT )
                    // InternalExpAuto.g:1003:3: RULE_INT
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
    // InternalExpAuto.g:1012:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1016:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpAuto.g:1017:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalExpAuto.g:1024:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1028:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalExpAuto.g:1029:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalExpAuto.g:1029:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalExpAuto.g:1030:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalExpAuto.g:1030:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalExpAuto.g:1031:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1032:3: ( rule__Model__ImportsAssignment_0 )
            // InternalExpAuto.g:1032:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_6);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalExpAuto.g:1035:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalExpAuto.g:1036:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1037:3: ( rule__Model__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpAuto.g:1037:4: rule__Model__ImportsAssignment_0
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
    // InternalExpAuto.g:1046:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1050:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalExpAuto.g:1051:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalExpAuto.g:1058:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1062:1: ( ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) )
            // InternalExpAuto.g:1063:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            {
            // InternalExpAuto.g:1063:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            // InternalExpAuto.g:1064:2: ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* )
            {
            // InternalExpAuto.g:1064:2: ( ( rule__Model__DatasourcesAssignment_1 ) )
            // InternalExpAuto.g:1065:3: ( rule__Model__DatasourcesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1066:3: ( rule__Model__DatasourcesAssignment_1 )
            // InternalExpAuto.g:1066:4: rule__Model__DatasourcesAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Model__DatasourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }

            // InternalExpAuto.g:1069:2: ( ( rule__Model__DatasourcesAssignment_1 )* )
            // InternalExpAuto.g:1070:3: ( rule__Model__DatasourcesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1071:3: ( rule__Model__DatasourcesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpAuto.g:1071:4: rule__Model__DatasourcesAssignment_1
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
    // InternalExpAuto.g:1080:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1084:1: ( rule__Model__Group__2__Impl )
            // InternalExpAuto.g:1085:2: rule__Model__Group__2__Impl
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
    // InternalExpAuto.g:1091:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1095:1: ( ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) )
            // InternalExpAuto.g:1096:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            {
            // InternalExpAuto.g:1096:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            // InternalExpAuto.g:1097:2: ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* )
            {
            // InternalExpAuto.g:1097:2: ( ( rule__Model__ExperimentsAssignment_2 ) )
            // InternalExpAuto.g:1098:3: ( rule__Model__ExperimentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1099:3: ( rule__Model__ExperimentsAssignment_2 )
            // InternalExpAuto.g:1099:4: rule__Model__ExperimentsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Model__ExperimentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }

            // InternalExpAuto.g:1102:2: ( ( rule__Model__ExperimentsAssignment_2 )* )
            // InternalExpAuto.g:1103:3: ( rule__Model__ExperimentsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1104:3: ( rule__Model__ExperimentsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpAuto.g:1104:4: rule__Model__ExperimentsAssignment_2
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
    // InternalExpAuto.g:1114:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1118:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalExpAuto.g:1119:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalExpAuto.g:1126:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1130:1: ( ( 'import' ) )
            // InternalExpAuto.g:1131:1: ( 'import' )
            {
            // InternalExpAuto.g:1131:1: ( 'import' )
            // InternalExpAuto.g:1132:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalExpAuto.g:1141:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1145:1: ( rule__Import__Group__1__Impl )
            // InternalExpAuto.g:1146:2: rule__Import__Group__1__Impl
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
    // InternalExpAuto.g:1152:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1156:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalExpAuto.g:1157:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalExpAuto.g:1157:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalExpAuto.g:1158:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalExpAuto.g:1159:2: ( rule__Import__PathAssignment_1 )
            // InternalExpAuto.g:1159:3: rule__Import__PathAssignment_1
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


    // $ANTLR start "rule__Datasource__Group__0"
    // InternalExpAuto.g:1168:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1172:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalExpAuto.g:1173:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Datasource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__1();

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
    // $ANTLR end "rule__Datasource__Group__0"


    // $ANTLR start "rule__Datasource__Group__0__Impl"
    // InternalExpAuto.g:1180:1: rule__Datasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1184:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1185:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1185:1: ( 'datasource' )
            // InternalExpAuto.g:1186:2: 'datasource'
            {
             before(grammarAccess.getDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getDatasourceKeyword_0()); 

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
    // $ANTLR end "rule__Datasource__Group__0__Impl"


    // $ANTLR start "rule__Datasource__Group__1"
    // InternalExpAuto.g:1195:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1199:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalExpAuto.g:1200:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Datasource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__2();

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
    // $ANTLR end "rule__Datasource__Group__1"


    // $ANTLR start "rule__Datasource__Group__1__Impl"
    // InternalExpAuto.g:1207:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1211:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1212:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1212:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1213:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1214:2: ( rule__Datasource__NameAssignment_1 )
            // InternalExpAuto.g:1214:3: rule__Datasource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Datasource__Group__1__Impl"


    // $ANTLR start "rule__Datasource__Group__2"
    // InternalExpAuto.g:1222:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1226:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalExpAuto.g:1227:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Datasource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__3();

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
    // $ANTLR end "rule__Datasource__Group__2"


    // $ANTLR start "rule__Datasource__Group__2__Impl"
    // InternalExpAuto.g:1234:1: rule__Datasource__Group__2__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1238:1: ( ( ':' ) )
            // InternalExpAuto.g:1239:1: ( ':' )
            {
            // InternalExpAuto.g:1239:1: ( ':' )
            // InternalExpAuto.g:1240:2: ':'
            {
             before(grammarAccess.getDatasourceAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Datasource__Group__2__Impl"


    // $ANTLR start "rule__Datasource__Group__3"
    // InternalExpAuto.g:1249:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl rule__Datasource__Group__4 ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1253:1: ( rule__Datasource__Group__3__Impl rule__Datasource__Group__4 )
            // InternalExpAuto.g:1254:2: rule__Datasource__Group__3__Impl rule__Datasource__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Datasource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__4();

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
    // $ANTLR end "rule__Datasource__Group__3"


    // $ANTLR start "rule__Datasource__Group__3__Impl"
    // InternalExpAuto.g:1261:1: rule__Datasource__Group__3__Impl : ( ( rule__Datasource__SourceTypeAssignment_3 ) ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1265:1: ( ( ( rule__Datasource__SourceTypeAssignment_3 ) ) )
            // InternalExpAuto.g:1266:1: ( ( rule__Datasource__SourceTypeAssignment_3 ) )
            {
            // InternalExpAuto.g:1266:1: ( ( rule__Datasource__SourceTypeAssignment_3 ) )
            // InternalExpAuto.g:1267:2: ( rule__Datasource__SourceTypeAssignment_3 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeAssignment_3()); 
            // InternalExpAuto.g:1268:2: ( rule__Datasource__SourceTypeAssignment_3 )
            // InternalExpAuto.g:1268:3: rule__Datasource__SourceTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__SourceTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getSourceTypeAssignment_3()); 

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
    // $ANTLR end "rule__Datasource__Group__3__Impl"


    // $ANTLR start "rule__Datasource__Group__4"
    // InternalExpAuto.g:1276:1: rule__Datasource__Group__4 : rule__Datasource__Group__4__Impl rule__Datasource__Group__5 ;
    public final void rule__Datasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1280:1: ( rule__Datasource__Group__4__Impl rule__Datasource__Group__5 )
            // InternalExpAuto.g:1281:2: rule__Datasource__Group__4__Impl rule__Datasource__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Datasource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__5();

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
    // $ANTLR end "rule__Datasource__Group__4"


    // $ANTLR start "rule__Datasource__Group__4__Impl"
    // InternalExpAuto.g:1288:1: rule__Datasource__Group__4__Impl : ( '(' ) ;
    public final void rule__Datasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1292:1: ( ( '(' ) )
            // InternalExpAuto.g:1293:1: ( '(' )
            {
            // InternalExpAuto.g:1293:1: ( '(' )
            // InternalExpAuto.g:1294:2: '('
            {
             before(grammarAccess.getDatasourceAccess().getLeftParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Datasource__Group__4__Impl"


    // $ANTLR start "rule__Datasource__Group__5"
    // InternalExpAuto.g:1303:1: rule__Datasource__Group__5 : rule__Datasource__Group__5__Impl rule__Datasource__Group__6 ;
    public final void rule__Datasource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1307:1: ( rule__Datasource__Group__5__Impl rule__Datasource__Group__6 )
            // InternalExpAuto.g:1308:2: rule__Datasource__Group__5__Impl rule__Datasource__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Datasource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__6();

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
    // $ANTLR end "rule__Datasource__Group__5"


    // $ANTLR start "rule__Datasource__Group__5__Impl"
    // InternalExpAuto.g:1315:1: rule__Datasource__Group__5__Impl : ( ( rule__Datasource__SourceURIAssignment_5 ) ) ;
    public final void rule__Datasource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1319:1: ( ( ( rule__Datasource__SourceURIAssignment_5 ) ) )
            // InternalExpAuto.g:1320:1: ( ( rule__Datasource__SourceURIAssignment_5 ) )
            {
            // InternalExpAuto.g:1320:1: ( ( rule__Datasource__SourceURIAssignment_5 ) )
            // InternalExpAuto.g:1321:2: ( rule__Datasource__SourceURIAssignment_5 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceURIAssignment_5()); 
            // InternalExpAuto.g:1322:2: ( rule__Datasource__SourceURIAssignment_5 )
            // InternalExpAuto.g:1322:3: rule__Datasource__SourceURIAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__SourceURIAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getSourceURIAssignment_5()); 

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
    // $ANTLR end "rule__Datasource__Group__5__Impl"


    // $ANTLR start "rule__Datasource__Group__6"
    // InternalExpAuto.g:1330:1: rule__Datasource__Group__6 : rule__Datasource__Group__6__Impl ;
    public final void rule__Datasource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1334:1: ( rule__Datasource__Group__6__Impl )
            // InternalExpAuto.g:1335:2: rule__Datasource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__6__Impl();

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
    // $ANTLR end "rule__Datasource__Group__6"


    // $ANTLR start "rule__Datasource__Group__6__Impl"
    // InternalExpAuto.g:1341:1: rule__Datasource__Group__6__Impl : ( ')' ) ;
    public final void rule__Datasource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1345:1: ( ( ')' ) )
            // InternalExpAuto.g:1346:1: ( ')' )
            {
            // InternalExpAuto.g:1346:1: ( ')' )
            // InternalExpAuto.g:1347:2: ')'
            {
             before(grammarAccess.getDatasourceAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Datasource__Group__6__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalExpAuto.g:1357:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1361:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalExpAuto.g:1362:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
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
    // InternalExpAuto.g:1369:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1373:1: ( ( 'experiment' ) )
            // InternalExpAuto.g:1374:1: ( 'experiment' )
            {
            // InternalExpAuto.g:1374:1: ( 'experiment' )
            // InternalExpAuto.g:1375:2: 'experiment'
            {
             before(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExpAuto.g:1384:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1388:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalExpAuto.g:1389:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
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
    // InternalExpAuto.g:1396:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1400:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1401:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1401:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalExpAuto.g:1402:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1403:2: ( rule__Experiment__NameAssignment_1 )
            // InternalExpAuto.g:1403:3: rule__Experiment__NameAssignment_1
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
    // InternalExpAuto.g:1411:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1415:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalExpAuto.g:1416:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
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
    // InternalExpAuto.g:1423:1: rule__Experiment__Group__2__Impl : ( ':' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1427:1: ( ( ':' ) )
            // InternalExpAuto.g:1428:1: ( ':' )
            {
            // InternalExpAuto.g:1428:1: ( ':' )
            // InternalExpAuto.g:1429:2: ':'
            {
             before(grammarAccess.getExperimentAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalExpAuto.g:1438:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1442:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalExpAuto.g:1443:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
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
    // InternalExpAuto.g:1450:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__DesignAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1454:1: ( ( ( rule__Experiment__DesignAssignment_3 ) ) )
            // InternalExpAuto.g:1455:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            {
            // InternalExpAuto.g:1455:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            // InternalExpAuto.g:1456:2: ( rule__Experiment__DesignAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 
            // InternalExpAuto.g:1457:2: ( rule__Experiment__DesignAssignment_3 )
            // InternalExpAuto.g:1457:3: rule__Experiment__DesignAssignment_3
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
    // InternalExpAuto.g:1465:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1469:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalExpAuto.g:1470:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
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
    // InternalExpAuto.g:1477:1: rule__Experiment__Group__4__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1481:1: ( ( '{' ) )
            // InternalExpAuto.g:1482:1: ( '{' )
            {
            // InternalExpAuto.g:1482:1: ( '{' )
            // InternalExpAuto.g:1483:2: '{'
            {
             before(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:1492:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1496:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalExpAuto.g:1497:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
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
    // InternalExpAuto.g:1504:1: rule__Experiment__Group__5__Impl : ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1508:1: ( ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) )
            // InternalExpAuto.g:1509:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            {
            // InternalExpAuto.g:1509:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            // InternalExpAuto.g:1510:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 
            // InternalExpAuto.g:1511:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            // InternalExpAuto.g:1511:3: rule__Experiment__ExperimentSpecificationsAssignment_5
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
    // InternalExpAuto.g:1519:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1523:1: ( rule__Experiment__Group__6__Impl )
            // InternalExpAuto.g:1524:2: rule__Experiment__Group__6__Impl
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
    // InternalExpAuto.g:1530:1: rule__Experiment__Group__6__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1534:1: ( ( '}' ) )
            // InternalExpAuto.g:1535:1: ( '}' )
            {
            // InternalExpAuto.g:1535:1: ( '}' )
            // InternalExpAuto.g:1536:2: '}'
            {
             before(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:1546:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1550:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalExpAuto.g:1551:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalExpAuto.g:1558:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1562:1: ( ( 'description' ) )
            // InternalExpAuto.g:1563:1: ( 'description' )
            {
            // InternalExpAuto.g:1563:1: ( 'description' )
            // InternalExpAuto.g:1564:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalExpAuto.g:1573:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1577:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalExpAuto.g:1578:2: rule__Description__Group__1__Impl rule__Description__Group__2
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
    // InternalExpAuto.g:1585:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1589:1: ( ( '=' ) )
            // InternalExpAuto.g:1590:1: ( '=' )
            {
            // InternalExpAuto.g:1590:1: ( '=' )
            // InternalExpAuto.g:1591:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:1600:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1604:1: ( rule__Description__Group__2__Impl )
            // InternalExpAuto.g:1605:2: rule__Description__Group__2__Impl
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
    // InternalExpAuto.g:1611:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1615:1: ( ( ( rule__Description__DescriptionAssignment_2 ) ) )
            // InternalExpAuto.g:1616:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            {
            // InternalExpAuto.g:1616:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            // InternalExpAuto.g:1617:2: ( rule__Description__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalExpAuto.g:1618:2: ( rule__Description__DescriptionAssignment_2 )
            // InternalExpAuto.g:1618:3: rule__Description__DescriptionAssignment_2
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
    // InternalExpAuto.g:1627:1: rule__InitialModel__Group__0 : rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 ;
    public final void rule__InitialModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1631:1: ( rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 )
            // InternalExpAuto.g:1632:2: rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1
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
    // InternalExpAuto.g:1639:1: rule__InitialModel__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1643:1: ( ( 'initial' ) )
            // InternalExpAuto.g:1644:1: ( 'initial' )
            {
            // InternalExpAuto.g:1644:1: ( 'initial' )
            // InternalExpAuto.g:1645:2: 'initial'
            {
             before(grammarAccess.getInitialModelAccess().getInitialKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalExpAuto.g:1654:1: rule__InitialModel__Group__1 : rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 ;
    public final void rule__InitialModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1658:1: ( rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 )
            // InternalExpAuto.g:1659:2: rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2
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
    // InternalExpAuto.g:1666:1: rule__InitialModel__Group__1__Impl : ( '=' ) ;
    public final void rule__InitialModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1670:1: ( ( '=' ) )
            // InternalExpAuto.g:1671:1: ( '=' )
            {
            // InternalExpAuto.g:1671:1: ( '=' )
            // InternalExpAuto.g:1672:2: '='
            {
             before(grammarAccess.getInitialModelAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:1681:1: rule__InitialModel__Group__2 : rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 ;
    public final void rule__InitialModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1685:1: ( rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 )
            // InternalExpAuto.g:1686:2: rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3
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
    // InternalExpAuto.g:1693:1: rule__InitialModel__Group__2__Impl : ( ( rule__InitialModel__ModeltypAssignment_2 ) ) ;
    public final void rule__InitialModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1697:1: ( ( ( rule__InitialModel__ModeltypAssignment_2 ) ) )
            // InternalExpAuto.g:1698:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            {
            // InternalExpAuto.g:1698:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            // InternalExpAuto.g:1699:2: ( rule__InitialModel__ModeltypAssignment_2 )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 
            // InternalExpAuto.g:1700:2: ( rule__InitialModel__ModeltypAssignment_2 )
            // InternalExpAuto.g:1700:3: rule__InitialModel__ModeltypAssignment_2
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
    // InternalExpAuto.g:1708:1: rule__InitialModel__Group__3 : rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 ;
    public final void rule__InitialModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1712:1: ( rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 )
            // InternalExpAuto.g:1713:2: rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4
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
    // InternalExpAuto.g:1720:1: rule__InitialModel__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1724:1: ( ( '{' ) )
            // InternalExpAuto.g:1725:1: ( '{' )
            {
            // InternalExpAuto.g:1725:1: ( '{' )
            // InternalExpAuto.g:1726:2: '{'
            {
             before(grammarAccess.getInitialModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:1735:1: rule__InitialModel__Group__4 : rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 ;
    public final void rule__InitialModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1739:1: ( rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 )
            // InternalExpAuto.g:1740:2: rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5
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
    // InternalExpAuto.g:1747:1: rule__InitialModel__Group__4__Impl : ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) ;
    public final void rule__InitialModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1751:1: ( ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) )
            // InternalExpAuto.g:1752:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            {
            // InternalExpAuto.g:1752:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            // InternalExpAuto.g:1753:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 
            // InternalExpAuto.g:1754:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            // InternalExpAuto.g:1754:3: rule__InitialModel__InitSpecificationsAssignment_4
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
    // InternalExpAuto.g:1762:1: rule__InitialModel__Group__5 : rule__InitialModel__Group__5__Impl ;
    public final void rule__InitialModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1766:1: ( rule__InitialModel__Group__5__Impl )
            // InternalExpAuto.g:1767:2: rule__InitialModel__Group__5__Impl
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
    // InternalExpAuto.g:1773:1: rule__InitialModel__Group__5__Impl : ( '}' ) ;
    public final void rule__InitialModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1777:1: ( ( '}' ) )
            // InternalExpAuto.g:1778:1: ( '}' )
            {
            // InternalExpAuto.g:1778:1: ( '}' )
            // InternalExpAuto.g:1779:2: '}'
            {
             before(grammarAccess.getInitialModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:1789:1: rule__AllocationModel__Group__0 : rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 ;
    public final void rule__AllocationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1793:1: ( rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 )
            // InternalExpAuto.g:1794:2: rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1
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
    // InternalExpAuto.g:1801:1: rule__AllocationModel__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__AllocationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1805:1: ( ( 'allocation' ) )
            // InternalExpAuto.g:1806:1: ( 'allocation' )
            {
            // InternalExpAuto.g:1806:1: ( 'allocation' )
            // InternalExpAuto.g:1807:2: 'allocation'
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalExpAuto.g:1816:1: rule__AllocationModel__Group__1 : rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 ;
    public final void rule__AllocationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1820:1: ( rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 )
            // InternalExpAuto.g:1821:2: rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2
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
    // InternalExpAuto.g:1828:1: rule__AllocationModel__Group__1__Impl : ( '=' ) ;
    public final void rule__AllocationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1832:1: ( ( '=' ) )
            // InternalExpAuto.g:1833:1: ( '=' )
            {
            // InternalExpAuto.g:1833:1: ( '=' )
            // InternalExpAuto.g:1834:2: '='
            {
             before(grammarAccess.getAllocationModelAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:1843:1: rule__AllocationModel__Group__2 : rule__AllocationModel__Group__2__Impl ;
    public final void rule__AllocationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1847:1: ( rule__AllocationModel__Group__2__Impl )
            // InternalExpAuto.g:1848:2: rule__AllocationModel__Group__2__Impl
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
    // InternalExpAuto.g:1854:1: rule__AllocationModel__Group__2__Impl : ( ( rule__AllocationModel__AllocationAssignment_2 ) ) ;
    public final void rule__AllocationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1858:1: ( ( ( rule__AllocationModel__AllocationAssignment_2 ) ) )
            // InternalExpAuto.g:1859:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            {
            // InternalExpAuto.g:1859:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            // InternalExpAuto.g:1860:2: ( rule__AllocationModel__AllocationAssignment_2 )
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 
            // InternalExpAuto.g:1861:2: ( rule__AllocationModel__AllocationAssignment_2 )
            // InternalExpAuto.g:1861:3: rule__AllocationModel__AllocationAssignment_2
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
    // InternalExpAuto.g:1870:1: rule__UsageModel__Group__0 : rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 ;
    public final void rule__UsageModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1874:1: ( rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 )
            // InternalExpAuto.g:1875:2: rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1
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
    // InternalExpAuto.g:1882:1: rule__UsageModel__Group__0__Impl : ( 'usageModel' ) ;
    public final void rule__UsageModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1886:1: ( ( 'usageModel' ) )
            // InternalExpAuto.g:1887:1: ( 'usageModel' )
            {
            // InternalExpAuto.g:1887:1: ( 'usageModel' )
            // InternalExpAuto.g:1888:2: 'usageModel'
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalExpAuto.g:1897:1: rule__UsageModel__Group__1 : rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 ;
    public final void rule__UsageModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1901:1: ( rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 )
            // InternalExpAuto.g:1902:2: rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2
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
    // InternalExpAuto.g:1909:1: rule__UsageModel__Group__1__Impl : ( '=' ) ;
    public final void rule__UsageModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1913:1: ( ( '=' ) )
            // InternalExpAuto.g:1914:1: ( '=' )
            {
            // InternalExpAuto.g:1914:1: ( '=' )
            // InternalExpAuto.g:1915:2: '='
            {
             before(grammarAccess.getUsageModelAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:1924:1: rule__UsageModel__Group__2 : rule__UsageModel__Group__2__Impl ;
    public final void rule__UsageModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1928:1: ( rule__UsageModel__Group__2__Impl )
            // InternalExpAuto.g:1929:2: rule__UsageModel__Group__2__Impl
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
    // InternalExpAuto.g:1935:1: rule__UsageModel__Group__2__Impl : ( ( rule__UsageModel__UsageModelAssignment_2 ) ) ;
    public final void rule__UsageModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1939:1: ( ( ( rule__UsageModel__UsageModelAssignment_2 ) ) )
            // InternalExpAuto.g:1940:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            {
            // InternalExpAuto.g:1940:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            // InternalExpAuto.g:1941:2: ( rule__UsageModel__UsageModelAssignment_2 )
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 
            // InternalExpAuto.g:1942:2: ( rule__UsageModel__UsageModelAssignment_2 )
            // InternalExpAuto.g:1942:3: rule__UsageModel__UsageModelAssignment_2
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
    // InternalExpAuto.g:1951:1: rule__MiddlewareRepository__Group__0 : rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 ;
    public final void rule__MiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1955:1: ( rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 )
            // InternalExpAuto.g:1956:2: rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1
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
    // InternalExpAuto.g:1963:1: rule__MiddlewareRepository__Group__0__Impl : ( 'middlewareRepository' ) ;
    public final void rule__MiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1967:1: ( ( 'middlewareRepository' ) )
            // InternalExpAuto.g:1968:1: ( 'middlewareRepository' )
            {
            // InternalExpAuto.g:1968:1: ( 'middlewareRepository' )
            // InternalExpAuto.g:1969:2: 'middlewareRepository'
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExpAuto.g:1978:1: rule__MiddlewareRepository__Group__1 : rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 ;
    public final void rule__MiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1982:1: ( rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 )
            // InternalExpAuto.g:1983:2: rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2
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
    // InternalExpAuto.g:1990:1: rule__MiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1994:1: ( ( '=' ) )
            // InternalExpAuto.g:1995:1: ( '=' )
            {
            // InternalExpAuto.g:1995:1: ( '=' )
            // InternalExpAuto.g:1996:2: '='
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2005:1: rule__MiddlewareRepository__Group__2 : rule__MiddlewareRepository__Group__2__Impl ;
    public final void rule__MiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2009:1: ( rule__MiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2010:2: rule__MiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2016:1: rule__MiddlewareRepository__Group__2__Impl : ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) ;
    public final void rule__MiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2020:1: ( ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2021:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2021:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2022:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2023:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            // InternalExpAuto.g:2023:3: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2
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
    // InternalExpAuto.g:2032:1: rule__EventMiddlewareRepository__Group__0 : rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 ;
    public final void rule__EventMiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2036:1: ( rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2037:2: rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1
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
    // InternalExpAuto.g:2044:1: rule__EventMiddlewareRepository__Group__0__Impl : ( 'eventMiddlewareRepository' ) ;
    public final void rule__EventMiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2048:1: ( ( 'eventMiddlewareRepository' ) )
            // InternalExpAuto.g:2049:1: ( 'eventMiddlewareRepository' )
            {
            // InternalExpAuto.g:2049:1: ( 'eventMiddlewareRepository' )
            // InternalExpAuto.g:2050:2: 'eventMiddlewareRepository'
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddlewareRepositoryKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExpAuto.g:2059:1: rule__EventMiddlewareRepository__Group__1 : rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 ;
    public final void rule__EventMiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2063:1: ( rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2064:2: rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2
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
    // InternalExpAuto.g:2071:1: rule__EventMiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__EventMiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2075:1: ( ( '=' ) )
            // InternalExpAuto.g:2076:1: ( '=' )
            {
            // InternalExpAuto.g:2076:1: ( '=' )
            // InternalExpAuto.g:2077:2: '='
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2086:1: rule__EventMiddlewareRepository__Group__2 : rule__EventMiddlewareRepository__Group__2__Impl ;
    public final void rule__EventMiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2090:1: ( rule__EventMiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2091:2: rule__EventMiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2097:1: rule__EventMiddlewareRepository__Group__2__Impl : ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) ;
    public final void rule__EventMiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2101:1: ( ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2102:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2102:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2103:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2104:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            // InternalExpAuto.g:2104:3: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2
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
    // InternalExpAuto.g:2113:1: rule__MonitorRepository__Group__0 : rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 ;
    public final void rule__MonitorRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2117:1: ( rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 )
            // InternalExpAuto.g:2118:2: rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1
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
    // InternalExpAuto.g:2125:1: rule__MonitorRepository__Group__0__Impl : ( 'monitorRepository' ) ;
    public final void rule__MonitorRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2129:1: ( ( 'monitorRepository' ) )
            // InternalExpAuto.g:2130:1: ( 'monitorRepository' )
            {
            // InternalExpAuto.g:2130:1: ( 'monitorRepository' )
            // InternalExpAuto.g:2131:2: 'monitorRepository'
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalExpAuto.g:2140:1: rule__MonitorRepository__Group__1 : rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 ;
    public final void rule__MonitorRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2144:1: ( rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 )
            // InternalExpAuto.g:2145:2: rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2
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
    // InternalExpAuto.g:2152:1: rule__MonitorRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MonitorRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2156:1: ( ( '=' ) )
            // InternalExpAuto.g:2157:1: ( '=' )
            {
            // InternalExpAuto.g:2157:1: ( '=' )
            // InternalExpAuto.g:2158:2: '='
            {
             before(grammarAccess.getMonitorRepositoryAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2167:1: rule__MonitorRepository__Group__2 : rule__MonitorRepository__Group__2__Impl ;
    public final void rule__MonitorRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2171:1: ( rule__MonitorRepository__Group__2__Impl )
            // InternalExpAuto.g:2172:2: rule__MonitorRepository__Group__2__Impl
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
    // InternalExpAuto.g:2178:1: rule__MonitorRepository__Group__2__Impl : ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) ;
    public final void rule__MonitorRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2182:1: ( ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2183:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2183:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2184:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 
            // InternalExpAuto.g:2185:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            // InternalExpAuto.g:2185:3: rule__MonitorRepository__MonitorRepositoryAssignment_2
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
    // InternalExpAuto.g:2194:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2198:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // InternalExpAuto.g:2199:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
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
    // InternalExpAuto.g:2206:1: rule__Variation__Group__0__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2210:1: ( ( 'variation' ) )
            // InternalExpAuto.g:2211:1: ( 'variation' )
            {
            // InternalExpAuto.g:2211:1: ( 'variation' )
            // InternalExpAuto.g:2212:2: 'variation'
            {
             before(grammarAccess.getVariationAccess().getVariationKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExpAuto.g:2221:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2225:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // InternalExpAuto.g:2226:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
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
    // InternalExpAuto.g:2233:1: rule__Variation__Group__1__Impl : ( '=' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2237:1: ( ( '=' ) )
            // InternalExpAuto.g:2238:1: ( '=' )
            {
            // InternalExpAuto.g:2238:1: ( '=' )
            // InternalExpAuto.g:2239:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2248:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2252:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // InternalExpAuto.g:2253:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
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
    // InternalExpAuto.g:2260:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__VariationTypAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2264:1: ( ( ( rule__Variation__VariationTypAssignment_2 ) ) )
            // InternalExpAuto.g:2265:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            {
            // InternalExpAuto.g:2265:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            // InternalExpAuto.g:2266:2: ( rule__Variation__VariationTypAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 
            // InternalExpAuto.g:2267:2: ( rule__Variation__VariationTypAssignment_2 )
            // InternalExpAuto.g:2267:3: rule__Variation__VariationTypAssignment_2
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
    // InternalExpAuto.g:2275:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl rule__Variation__Group__4 ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2279:1: ( rule__Variation__Group__3__Impl rule__Variation__Group__4 )
            // InternalExpAuto.g:2280:2: rule__Variation__Group__3__Impl rule__Variation__Group__4
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
    // InternalExpAuto.g:2287:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__NameAssignment_3 ) ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2291:1: ( ( ( rule__Variation__NameAssignment_3 ) ) )
            // InternalExpAuto.g:2292:1: ( ( rule__Variation__NameAssignment_3 ) )
            {
            // InternalExpAuto.g:2292:1: ( ( rule__Variation__NameAssignment_3 ) )
            // InternalExpAuto.g:2293:2: ( rule__Variation__NameAssignment_3 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_3()); 
            // InternalExpAuto.g:2294:2: ( rule__Variation__NameAssignment_3 )
            // InternalExpAuto.g:2294:3: rule__Variation__NameAssignment_3
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
    // InternalExpAuto.g:2302:1: rule__Variation__Group__4 : rule__Variation__Group__4__Impl rule__Variation__Group__5 ;
    public final void rule__Variation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2306:1: ( rule__Variation__Group__4__Impl rule__Variation__Group__5 )
            // InternalExpAuto.g:2307:2: rule__Variation__Group__4__Impl rule__Variation__Group__5
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
    // InternalExpAuto.g:2314:1: rule__Variation__Group__4__Impl : ( '{' ) ;
    public final void rule__Variation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2318:1: ( ( '{' ) )
            // InternalExpAuto.g:2319:1: ( '{' )
            {
            // InternalExpAuto.g:2319:1: ( '{' )
            // InternalExpAuto.g:2320:2: '{'
            {
             before(grammarAccess.getVariationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:2329:1: rule__Variation__Group__5 : rule__Variation__Group__5__Impl rule__Variation__Group__6 ;
    public final void rule__Variation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2333:1: ( rule__Variation__Group__5__Impl rule__Variation__Group__6 )
            // InternalExpAuto.g:2334:2: rule__Variation__Group__5__Impl rule__Variation__Group__6
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
    // InternalExpAuto.g:2341:1: rule__Variation__Group__5__Impl : ( 'target' ) ;
    public final void rule__Variation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2345:1: ( ( 'target' ) )
            // InternalExpAuto.g:2346:1: ( 'target' )
            {
            // InternalExpAuto.g:2346:1: ( 'target' )
            // InternalExpAuto.g:2347:2: 'target'
            {
             before(grammarAccess.getVariationAccess().getTargetKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalExpAuto.g:2356:1: rule__Variation__Group__6 : rule__Variation__Group__6__Impl rule__Variation__Group__7 ;
    public final void rule__Variation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2360:1: ( rule__Variation__Group__6__Impl rule__Variation__Group__7 )
            // InternalExpAuto.g:2361:2: rule__Variation__Group__6__Impl rule__Variation__Group__7
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
    // InternalExpAuto.g:2368:1: rule__Variation__Group__6__Impl : ( '=' ) ;
    public final void rule__Variation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2372:1: ( ( '=' ) )
            // InternalExpAuto.g:2373:1: ( '=' )
            {
            // InternalExpAuto.g:2373:1: ( '=' )
            // InternalExpAuto.g:2374:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2383:1: rule__Variation__Group__7 : rule__Variation__Group__7__Impl rule__Variation__Group__8 ;
    public final void rule__Variation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2387:1: ( rule__Variation__Group__7__Impl rule__Variation__Group__8 )
            // InternalExpAuto.g:2388:2: rule__Variation__Group__7__Impl rule__Variation__Group__8
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
    // InternalExpAuto.g:2395:1: rule__Variation__Group__7__Impl : ( ( rule__Variation__TargetAssignment_7 ) ) ;
    public final void rule__Variation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2399:1: ( ( ( rule__Variation__TargetAssignment_7 ) ) )
            // InternalExpAuto.g:2400:1: ( ( rule__Variation__TargetAssignment_7 ) )
            {
            // InternalExpAuto.g:2400:1: ( ( rule__Variation__TargetAssignment_7 ) )
            // InternalExpAuto.g:2401:2: ( rule__Variation__TargetAssignment_7 )
            {
             before(grammarAccess.getVariationAccess().getTargetAssignment_7()); 
            // InternalExpAuto.g:2402:2: ( rule__Variation__TargetAssignment_7 )
            // InternalExpAuto.g:2402:3: rule__Variation__TargetAssignment_7
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
    // InternalExpAuto.g:2410:1: rule__Variation__Group__8 : rule__Variation__Group__8__Impl rule__Variation__Group__9 ;
    public final void rule__Variation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2414:1: ( rule__Variation__Group__8__Impl rule__Variation__Group__9 )
            // InternalExpAuto.g:2415:2: rule__Variation__Group__8__Impl rule__Variation__Group__9
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
    // InternalExpAuto.g:2422:1: rule__Variation__Group__8__Impl : ( 'maxVariations' ) ;
    public final void rule__Variation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2426:1: ( ( 'maxVariations' ) )
            // InternalExpAuto.g:2427:1: ( 'maxVariations' )
            {
            // InternalExpAuto.g:2427:1: ( 'maxVariations' )
            // InternalExpAuto.g:2428:2: 'maxVariations'
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsKeyword_8()); 
            match(input,33,FOLLOW_2); 
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
    // InternalExpAuto.g:2437:1: rule__Variation__Group__9 : rule__Variation__Group__9__Impl rule__Variation__Group__10 ;
    public final void rule__Variation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2441:1: ( rule__Variation__Group__9__Impl rule__Variation__Group__10 )
            // InternalExpAuto.g:2442:2: rule__Variation__Group__9__Impl rule__Variation__Group__10
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
    // InternalExpAuto.g:2449:1: rule__Variation__Group__9__Impl : ( '=' ) ;
    public final void rule__Variation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2453:1: ( ( '=' ) )
            // InternalExpAuto.g:2454:1: ( '=' )
            {
            // InternalExpAuto.g:2454:1: ( '=' )
            // InternalExpAuto.g:2455:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2464:1: rule__Variation__Group__10 : rule__Variation__Group__10__Impl rule__Variation__Group__11 ;
    public final void rule__Variation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2468:1: ( rule__Variation__Group__10__Impl rule__Variation__Group__11 )
            // InternalExpAuto.g:2469:2: rule__Variation__Group__10__Impl rule__Variation__Group__11
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
    // InternalExpAuto.g:2476:1: rule__Variation__Group__10__Impl : ( ( rule__Variation__MaxVariationsAssignment_10 ) ) ;
    public final void rule__Variation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2480:1: ( ( ( rule__Variation__MaxVariationsAssignment_10 ) ) )
            // InternalExpAuto.g:2481:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            {
            // InternalExpAuto.g:2481:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            // InternalExpAuto.g:2482:2: ( rule__Variation__MaxVariationsAssignment_10 )
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 
            // InternalExpAuto.g:2483:2: ( rule__Variation__MaxVariationsAssignment_10 )
            // InternalExpAuto.g:2483:3: rule__Variation__MaxVariationsAssignment_10
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
    // InternalExpAuto.g:2491:1: rule__Variation__Group__11 : rule__Variation__Group__11__Impl rule__Variation__Group__12 ;
    public final void rule__Variation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2495:1: ( rule__Variation__Group__11__Impl rule__Variation__Group__12 )
            // InternalExpAuto.g:2496:2: rule__Variation__Group__11__Impl rule__Variation__Group__12
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
    // InternalExpAuto.g:2503:1: rule__Variation__Group__11__Impl : ( 'values' ) ;
    public final void rule__Variation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2507:1: ( ( 'values' ) )
            // InternalExpAuto.g:2508:1: ( 'values' )
            {
            // InternalExpAuto.g:2508:1: ( 'values' )
            // InternalExpAuto.g:2509:2: 'values'
            {
             before(grammarAccess.getVariationAccess().getValuesKeyword_11()); 
            match(input,34,FOLLOW_2); 
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
    // InternalExpAuto.g:2518:1: rule__Variation__Group__12 : rule__Variation__Group__12__Impl rule__Variation__Group__13 ;
    public final void rule__Variation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2522:1: ( rule__Variation__Group__12__Impl rule__Variation__Group__13 )
            // InternalExpAuto.g:2523:2: rule__Variation__Group__12__Impl rule__Variation__Group__13
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
    // InternalExpAuto.g:2530:1: rule__Variation__Group__12__Impl : ( '=' ) ;
    public final void rule__Variation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2534:1: ( ( '=' ) )
            // InternalExpAuto.g:2535:1: ( '=' )
            {
            // InternalExpAuto.g:2535:1: ( '=' )
            // InternalExpAuto.g:2536:2: '='
            {
             before(grammarAccess.getVariationAccess().getEqualsSignKeyword_12()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:2545:1: rule__Variation__Group__13 : rule__Variation__Group__13__Impl rule__Variation__Group__14 ;
    public final void rule__Variation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2549:1: ( rule__Variation__Group__13__Impl rule__Variation__Group__14 )
            // InternalExpAuto.g:2550:2: rule__Variation__Group__13__Impl rule__Variation__Group__14
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
    // InternalExpAuto.g:2557:1: rule__Variation__Group__13__Impl : ( ( rule__Variation__ValueProviderAssignment_13 ) ) ;
    public final void rule__Variation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2561:1: ( ( ( rule__Variation__ValueProviderAssignment_13 ) ) )
            // InternalExpAuto.g:2562:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            {
            // InternalExpAuto.g:2562:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            // InternalExpAuto.g:2563:2: ( rule__Variation__ValueProviderAssignment_13 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 
            // InternalExpAuto.g:2564:2: ( rule__Variation__ValueProviderAssignment_13 )
            // InternalExpAuto.g:2564:3: rule__Variation__ValueProviderAssignment_13
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
    // InternalExpAuto.g:2572:1: rule__Variation__Group__14 : rule__Variation__Group__14__Impl ;
    public final void rule__Variation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2576:1: ( rule__Variation__Group__14__Impl )
            // InternalExpAuto.g:2577:2: rule__Variation__Group__14__Impl
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
    // InternalExpAuto.g:2583:1: rule__Variation__Group__14__Impl : ( '}' ) ;
    public final void rule__Variation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2587:1: ( ( '}' ) )
            // InternalExpAuto.g:2588:1: ( '}' )
            {
            // InternalExpAuto.g:2588:1: ( '}' )
            // InternalExpAuto.g:2589:2: '}'
            {
             before(grammarAccess.getVariationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:2599:1: rule__NestedIntervalsValueProvider__Group_0__0 : rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2603:1: ( rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 )
            // InternalExpAuto.g:2604:2: rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1
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
    // InternalExpAuto.g:2611:1: rule__NestedIntervalsValueProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2615:1: ( ( '[' ) )
            // InternalExpAuto.g:2616:1: ( '[' )
            {
            // InternalExpAuto.g:2616:1: ( '[' )
            // InternalExpAuto.g:2617:2: '['
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalExpAuto.g:2626:1: rule__NestedIntervalsValueProvider__Group_0__1 : rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2630:1: ( rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 )
            // InternalExpAuto.g:2631:2: rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2
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
    // InternalExpAuto.g:2638:1: rule__NestedIntervalsValueProvider__Group_0__1__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2642:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) )
            // InternalExpAuto.g:2643:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2643:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            // InternalExpAuto.g:2644:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 
            // InternalExpAuto.g:2645:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            // InternalExpAuto.g:2645:3: rule__NestedIntervalsValueProvider__MinAssignment_0_1
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
    // InternalExpAuto.g:2653:1: rule__NestedIntervalsValueProvider__Group_0__2 : rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2657:1: ( rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 )
            // InternalExpAuto.g:2658:2: rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3
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
    // InternalExpAuto.g:2665:1: rule__NestedIntervalsValueProvider__Group_0__2__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2669:1: ( ( ',' ) )
            // InternalExpAuto.g:2670:1: ( ',' )
            {
            // InternalExpAuto.g:2670:1: ( ',' )
            // InternalExpAuto.g:2671:2: ','
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_0_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:2680:1: rule__NestedIntervalsValueProvider__Group_0__3 : rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2684:1: ( rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 )
            // InternalExpAuto.g:2685:2: rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4
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
    // InternalExpAuto.g:2692:1: rule__NestedIntervalsValueProvider__Group_0__3__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2696:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) )
            // InternalExpAuto.g:2697:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            {
            // InternalExpAuto.g:2697:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            // InternalExpAuto.g:2698:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 
            // InternalExpAuto.g:2699:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            // InternalExpAuto.g:2699:3: rule__NestedIntervalsValueProvider__MaxAssignment_0_3
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
    // InternalExpAuto.g:2707:1: rule__NestedIntervalsValueProvider__Group_0__4 : rule__NestedIntervalsValueProvider__Group_0__4__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2711:1: ( rule__NestedIntervalsValueProvider__Group_0__4__Impl )
            // InternalExpAuto.g:2712:2: rule__NestedIntervalsValueProvider__Group_0__4__Impl
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
    // InternalExpAuto.g:2718:1: rule__NestedIntervalsValueProvider__Group_0__4__Impl : ( ']' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2722:1: ( ( ']' ) )
            // InternalExpAuto.g:2723:1: ( ']' )
            {
            // InternalExpAuto.g:2723:1: ( ']' )
            // InternalExpAuto.g:2724:2: ']'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalExpAuto.g:2734:1: rule__NestedIntervalsValueProvider__Group_1__0 : rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2738:1: ( rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 )
            // InternalExpAuto.g:2739:2: rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1
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
    // InternalExpAuto.g:2746:1: rule__NestedIntervalsValueProvider__Group_1__0__Impl : ( 'nestedIntervall' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2750:1: ( ( 'nestedIntervall' ) )
            // InternalExpAuto.g:2751:1: ( 'nestedIntervall' )
            {
            // InternalExpAuto.g:2751:1: ( 'nestedIntervall' )
            // InternalExpAuto.g:2752:2: 'nestedIntervall'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getNestedIntervallKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalExpAuto.g:2761:1: rule__NestedIntervalsValueProvider__Group_1__1 : rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2765:1: ( rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 )
            // InternalExpAuto.g:2766:2: rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2
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
    // InternalExpAuto.g:2773:1: rule__NestedIntervalsValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2777:1: ( ( '(' ) )
            // InternalExpAuto.g:2778:1: ( '(' )
            {
            // InternalExpAuto.g:2778:1: ( '(' )
            // InternalExpAuto.g:2779:2: '('
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:2788:1: rule__NestedIntervalsValueProvider__Group_1__2 : rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2792:1: ( rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 )
            // InternalExpAuto.g:2793:2: rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3
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
    // InternalExpAuto.g:2800:1: rule__NestedIntervalsValueProvider__Group_1__2__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2804:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) )
            // InternalExpAuto.g:2805:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            {
            // InternalExpAuto.g:2805:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            // InternalExpAuto.g:2806:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 
            // InternalExpAuto.g:2807:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            // InternalExpAuto.g:2807:3: rule__NestedIntervalsValueProvider__MinAssignment_1_2
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
    // InternalExpAuto.g:2815:1: rule__NestedIntervalsValueProvider__Group_1__3 : rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2819:1: ( rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 )
            // InternalExpAuto.g:2820:2: rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4
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
    // InternalExpAuto.g:2827:1: rule__NestedIntervalsValueProvider__Group_1__3__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2831:1: ( ( ',' ) )
            // InternalExpAuto.g:2832:1: ( ',' )
            {
            // InternalExpAuto.g:2832:1: ( ',' )
            // InternalExpAuto.g:2833:2: ','
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getCommaKeyword_1_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:2842:1: rule__NestedIntervalsValueProvider__Group_1__4 : rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2846:1: ( rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 )
            // InternalExpAuto.g:2847:2: rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5
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
    // InternalExpAuto.g:2854:1: rule__NestedIntervalsValueProvider__Group_1__4__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2858:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) )
            // InternalExpAuto.g:2859:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            {
            // InternalExpAuto.g:2859:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            // InternalExpAuto.g:2860:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 
            // InternalExpAuto.g:2861:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            // InternalExpAuto.g:2861:3: rule__NestedIntervalsValueProvider__MaxAssignment_1_4
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
    // InternalExpAuto.g:2869:1: rule__NestedIntervalsValueProvider__Group_1__5 : rule__NestedIntervalsValueProvider__Group_1__5__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2873:1: ( rule__NestedIntervalsValueProvider__Group_1__5__Impl )
            // InternalExpAuto.g:2874:2: rule__NestedIntervalsValueProvider__Group_1__5__Impl
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
    // InternalExpAuto.g:2880:1: rule__NestedIntervalsValueProvider__Group_1__5__Impl : ( ')' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2884:1: ( ( ')' ) )
            // InternalExpAuto.g:2885:1: ( ')' )
            {
            // InternalExpAuto.g:2885:1: ( ')' )
            // InternalExpAuto.g:2886:2: ')'
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getRightParenthesisKeyword_1_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:2896:1: rule__SetValueProvider__Group_0__0 : rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 ;
    public final void rule__SetValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2900:1: ( rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 )
            // InternalExpAuto.g:2901:2: rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1
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
    // InternalExpAuto.g:2908:1: rule__SetValueProvider__Group_0__0__Impl : ( '{' ) ;
    public final void rule__SetValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2912:1: ( ( '{' ) )
            // InternalExpAuto.g:2913:1: ( '{' )
            {
            // InternalExpAuto.g:2913:1: ( '{' )
            // InternalExpAuto.g:2914:2: '{'
            {
             before(grammarAccess.getSetValueProviderAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:2923:1: rule__SetValueProvider__Group_0__1 : rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 ;
    public final void rule__SetValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2927:1: ( rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 )
            // InternalExpAuto.g:2928:2: rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2
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
    // InternalExpAuto.g:2935:1: rule__SetValueProvider__Group_0__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) ;
    public final void rule__SetValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2939:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) )
            // InternalExpAuto.g:2940:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2940:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            // InternalExpAuto.g:2941:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 
            // InternalExpAuto.g:2942:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            // InternalExpAuto.g:2942:3: rule__SetValueProvider__ValuesAssignment_0_1
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
    // InternalExpAuto.g:2950:1: rule__SetValueProvider__Group_0__2 : rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 ;
    public final void rule__SetValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2954:1: ( rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 )
            // InternalExpAuto.g:2955:2: rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3
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
    // InternalExpAuto.g:2962:1: rule__SetValueProvider__Group_0__2__Impl : ( ( rule__SetValueProvider__Group_0_2__0 )* ) ;
    public final void rule__SetValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2966:1: ( ( ( rule__SetValueProvider__Group_0_2__0 )* ) )
            // InternalExpAuto.g:2967:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            {
            // InternalExpAuto.g:2967:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            // InternalExpAuto.g:2968:2: ( rule__SetValueProvider__Group_0_2__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 
            // InternalExpAuto.g:2969:2: ( rule__SetValueProvider__Group_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpAuto.g:2969:3: rule__SetValueProvider__Group_0_2__0
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
    // InternalExpAuto.g:2977:1: rule__SetValueProvider__Group_0__3 : rule__SetValueProvider__Group_0__3__Impl ;
    public final void rule__SetValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2981:1: ( rule__SetValueProvider__Group_0__3__Impl )
            // InternalExpAuto.g:2982:2: rule__SetValueProvider__Group_0__3__Impl
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
    // InternalExpAuto.g:2988:1: rule__SetValueProvider__Group_0__3__Impl : ( '}' ) ;
    public final void rule__SetValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2992:1: ( ( '}' ) )
            // InternalExpAuto.g:2993:1: ( '}' )
            {
            // InternalExpAuto.g:2993:1: ( '}' )
            // InternalExpAuto.g:2994:2: '}'
            {
             before(grammarAccess.getSetValueProviderAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:3004:1: rule__SetValueProvider__Group_0_2__0 : rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 ;
    public final void rule__SetValueProvider__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3008:1: ( rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 )
            // InternalExpAuto.g:3009:2: rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1
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
    // InternalExpAuto.g:3016:1: rule__SetValueProvider__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3020:1: ( ( ',' ) )
            // InternalExpAuto.g:3021:1: ( ',' )
            {
            // InternalExpAuto.g:3021:1: ( ',' )
            // InternalExpAuto.g:3022:2: ','
            {
             before(grammarAccess.getSetValueProviderAccess().getCommaKeyword_0_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:3031:1: rule__SetValueProvider__Group_0_2__1 : rule__SetValueProvider__Group_0_2__1__Impl ;
    public final void rule__SetValueProvider__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3035:1: ( rule__SetValueProvider__Group_0_2__1__Impl )
            // InternalExpAuto.g:3036:2: rule__SetValueProvider__Group_0_2__1__Impl
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
    // InternalExpAuto.g:3042:1: rule__SetValueProvider__Group_0_2__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) ;
    public final void rule__SetValueProvider__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3046:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) )
            // InternalExpAuto.g:3047:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            {
            // InternalExpAuto.g:3047:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            // InternalExpAuto.g:3048:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 
            // InternalExpAuto.g:3049:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            // InternalExpAuto.g:3049:3: rule__SetValueProvider__ValuesAssignment_0_2_1
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
    // InternalExpAuto.g:3058:1: rule__SetValueProvider__Group_1__0 : rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 ;
    public final void rule__SetValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3062:1: ( rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 )
            // InternalExpAuto.g:3063:2: rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1
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
    // InternalExpAuto.g:3070:1: rule__SetValueProvider__Group_1__0__Impl : ( 'setValues' ) ;
    public final void rule__SetValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3074:1: ( ( 'setValues' ) )
            // InternalExpAuto.g:3075:1: ( 'setValues' )
            {
            // InternalExpAuto.g:3075:1: ( 'setValues' )
            // InternalExpAuto.g:3076:2: 'setValues'
            {
             before(grammarAccess.getSetValueProviderAccess().getSetValuesKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalExpAuto.g:3085:1: rule__SetValueProvider__Group_1__1 : rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 ;
    public final void rule__SetValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3089:1: ( rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 )
            // InternalExpAuto.g:3090:2: rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2
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
    // InternalExpAuto.g:3097:1: rule__SetValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SetValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3101:1: ( ( '(' ) )
            // InternalExpAuto.g:3102:1: ( '(' )
            {
            // InternalExpAuto.g:3102:1: ( '(' )
            // InternalExpAuto.g:3103:2: '('
            {
             before(grammarAccess.getSetValueProviderAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3112:1: rule__SetValueProvider__Group_1__2 : rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 ;
    public final void rule__SetValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3116:1: ( rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 )
            // InternalExpAuto.g:3117:2: rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3
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
    // InternalExpAuto.g:3124:1: rule__SetValueProvider__Group_1__2__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) ;
    public final void rule__SetValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3128:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) )
            // InternalExpAuto.g:3129:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            {
            // InternalExpAuto.g:3129:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            // InternalExpAuto.g:3130:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 
            // InternalExpAuto.g:3131:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            // InternalExpAuto.g:3131:3: rule__SetValueProvider__ValuesAssignment_1_2
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
    // InternalExpAuto.g:3139:1: rule__SetValueProvider__Group_1__3 : rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 ;
    public final void rule__SetValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3143:1: ( rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 )
            // InternalExpAuto.g:3144:2: rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4
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
    // InternalExpAuto.g:3151:1: rule__SetValueProvider__Group_1__3__Impl : ( ( rule__SetValueProvider__Group_1_3__0 )* ) ;
    public final void rule__SetValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3155:1: ( ( ( rule__SetValueProvider__Group_1_3__0 )* ) )
            // InternalExpAuto.g:3156:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            {
            // InternalExpAuto.g:3156:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            // InternalExpAuto.g:3157:2: ( rule__SetValueProvider__Group_1_3__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 
            // InternalExpAuto.g:3158:2: ( rule__SetValueProvider__Group_1_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:3158:3: rule__SetValueProvider__Group_1_3__0
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
    // InternalExpAuto.g:3166:1: rule__SetValueProvider__Group_1__4 : rule__SetValueProvider__Group_1__4__Impl ;
    public final void rule__SetValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3170:1: ( rule__SetValueProvider__Group_1__4__Impl )
            // InternalExpAuto.g:3171:2: rule__SetValueProvider__Group_1__4__Impl
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
    // InternalExpAuto.g:3177:1: rule__SetValueProvider__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SetValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3181:1: ( ( ')' ) )
            // InternalExpAuto.g:3182:1: ( ')' )
            {
            // InternalExpAuto.g:3182:1: ( ')' )
            // InternalExpAuto.g:3183:2: ')'
            {
             before(grammarAccess.getSetValueProviderAccess().getRightParenthesisKeyword_1_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:3193:1: rule__SetValueProvider__Group_1_3__0 : rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 ;
    public final void rule__SetValueProvider__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3197:1: ( rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 )
            // InternalExpAuto.g:3198:2: rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1
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
    // InternalExpAuto.g:3205:1: rule__SetValueProvider__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3209:1: ( ( ',' ) )
            // InternalExpAuto.g:3210:1: ( ',' )
            {
            // InternalExpAuto.g:3210:1: ( ',' )
            // InternalExpAuto.g:3211:2: ','
            {
             before(grammarAccess.getSetValueProviderAccess().getCommaKeyword_1_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:3220:1: rule__SetValueProvider__Group_1_3__1 : rule__SetValueProvider__Group_1_3__1__Impl ;
    public final void rule__SetValueProvider__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3224:1: ( rule__SetValueProvider__Group_1_3__1__Impl )
            // InternalExpAuto.g:3225:2: rule__SetValueProvider__Group_1_3__1__Impl
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
    // InternalExpAuto.g:3231:1: rule__SetValueProvider__Group_1_3__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) ;
    public final void rule__SetValueProvider__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3235:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) )
            // InternalExpAuto.g:3236:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            {
            // InternalExpAuto.g:3236:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            // InternalExpAuto.g:3237:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 
            // InternalExpAuto.g:3238:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            // InternalExpAuto.g:3238:3: rule__SetValueProvider__ValuesAssignment_1_3_1
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
    // InternalExpAuto.g:3247:1: rule__LinearValueProvider__Group__0 : rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 ;
    public final void rule__LinearValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3251:1: ( rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 )
            // InternalExpAuto.g:3252:2: rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1
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
    // InternalExpAuto.g:3259:1: rule__LinearValueProvider__Group__0__Impl : ( 'linear' ) ;
    public final void rule__LinearValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3263:1: ( ( 'linear' ) )
            // InternalExpAuto.g:3264:1: ( 'linear' )
            {
            // InternalExpAuto.g:3264:1: ( 'linear' )
            // InternalExpAuto.g:3265:2: 'linear'
            {
             before(grammarAccess.getLinearValueProviderAccess().getLinearKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalExpAuto.g:3274:1: rule__LinearValueProvider__Group__1 : rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 ;
    public final void rule__LinearValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3278:1: ( rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 )
            // InternalExpAuto.g:3279:2: rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2
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
    // InternalExpAuto.g:3286:1: rule__LinearValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__LinearValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3290:1: ( ( '(' ) )
            // InternalExpAuto.g:3291:1: ( '(' )
            {
            // InternalExpAuto.g:3291:1: ( '(' )
            // InternalExpAuto.g:3292:2: '('
            {
             before(grammarAccess.getLinearValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3301:1: rule__LinearValueProvider__Group__2 : rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 ;
    public final void rule__LinearValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3305:1: ( rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 )
            // InternalExpAuto.g:3306:2: rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3
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
    // InternalExpAuto.g:3313:1: rule__LinearValueProvider__Group__2__Impl : ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) ;
    public final void rule__LinearValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3317:1: ( ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) )
            // InternalExpAuto.g:3318:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            {
            // InternalExpAuto.g:3318:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            // InternalExpAuto.g:3319:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 
            // InternalExpAuto.g:3320:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            // InternalExpAuto.g:3320:3: rule__LinearValueProvider__SummandAssignment_2
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
    // InternalExpAuto.g:3328:1: rule__LinearValueProvider__Group__3 : rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 ;
    public final void rule__LinearValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3332:1: ( rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 )
            // InternalExpAuto.g:3333:2: rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4
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
    // InternalExpAuto.g:3340:1: rule__LinearValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__LinearValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3344:1: ( ( ',' ) )
            // InternalExpAuto.g:3345:1: ( ',' )
            {
            // InternalExpAuto.g:3345:1: ( ',' )
            // InternalExpAuto.g:3346:2: ','
            {
             before(grammarAccess.getLinearValueProviderAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:3355:1: rule__LinearValueProvider__Group__4 : rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 ;
    public final void rule__LinearValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3359:1: ( rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 )
            // InternalExpAuto.g:3360:2: rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5
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
    // InternalExpAuto.g:3367:1: rule__LinearValueProvider__Group__4__Impl : ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__LinearValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3371:1: ( ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3372:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3372:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3373:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3374:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3374:3: rule__LinearValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3382:1: rule__LinearValueProvider__Group__5 : rule__LinearValueProvider__Group__5__Impl ;
    public final void rule__LinearValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3386:1: ( rule__LinearValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3387:2: rule__LinearValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3393:1: rule__LinearValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__LinearValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3397:1: ( ( ')' ) )
            // InternalExpAuto.g:3398:1: ( ')' )
            {
            // InternalExpAuto.g:3398:1: ( ')' )
            // InternalExpAuto.g:3399:2: ')'
            {
             before(grammarAccess.getLinearValueProviderAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:3409:1: rule__ExponentialValueProvider__Group__0 : rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 ;
    public final void rule__ExponentialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3413:1: ( rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 )
            // InternalExpAuto.g:3414:2: rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1
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
    // InternalExpAuto.g:3421:1: rule__ExponentialValueProvider__Group__0__Impl : ( 'exponential' ) ;
    public final void rule__ExponentialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3425:1: ( ( 'exponential' ) )
            // InternalExpAuto.g:3426:1: ( 'exponential' )
            {
            // InternalExpAuto.g:3426:1: ( 'exponential' )
            // InternalExpAuto.g:3427:2: 'exponential'
            {
             before(grammarAccess.getExponentialValueProviderAccess().getExponentialKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalExpAuto.g:3436:1: rule__ExponentialValueProvider__Group__1 : rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 ;
    public final void rule__ExponentialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3440:1: ( rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 )
            // InternalExpAuto.g:3441:2: rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2
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
    // InternalExpAuto.g:3448:1: rule__ExponentialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__ExponentialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3452:1: ( ( '(' ) )
            // InternalExpAuto.g:3453:1: ( '(' )
            {
            // InternalExpAuto.g:3453:1: ( '(' )
            // InternalExpAuto.g:3454:2: '('
            {
             before(grammarAccess.getExponentialValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3463:1: rule__ExponentialValueProvider__Group__2 : rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 ;
    public final void rule__ExponentialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3467:1: ( rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 )
            // InternalExpAuto.g:3468:2: rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3
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
    // InternalExpAuto.g:3475:1: rule__ExponentialValueProvider__Group__2__Impl : ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) ;
    public final void rule__ExponentialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3479:1: ( ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) )
            // InternalExpAuto.g:3480:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            {
            // InternalExpAuto.g:3480:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            // InternalExpAuto.g:3481:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 
            // InternalExpAuto.g:3482:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            // InternalExpAuto.g:3482:3: rule__ExponentialValueProvider__BaseAssignment_2
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
    // InternalExpAuto.g:3490:1: rule__ExponentialValueProvider__Group__3 : rule__ExponentialValueProvider__Group__3__Impl ;
    public final void rule__ExponentialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3494:1: ( rule__ExponentialValueProvider__Group__3__Impl )
            // InternalExpAuto.g:3495:2: rule__ExponentialValueProvider__Group__3__Impl
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
    // InternalExpAuto.g:3501:1: rule__ExponentialValueProvider__Group__3__Impl : ( ')' ) ;
    public final void rule__ExponentialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3505:1: ( ( ')' ) )
            // InternalExpAuto.g:3506:1: ( ')' )
            {
            // InternalExpAuto.g:3506:1: ( ')' )
            // InternalExpAuto.g:3507:2: ')'
            {
             before(grammarAccess.getExponentialValueProviderAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:3517:1: rule__PolynomialValueProvider__Group__0 : rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 ;
    public final void rule__PolynomialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3521:1: ( rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 )
            // InternalExpAuto.g:3522:2: rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1
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
    // InternalExpAuto.g:3529:1: rule__PolynomialValueProvider__Group__0__Impl : ( 'polynomial' ) ;
    public final void rule__PolynomialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3533:1: ( ( 'polynomial' ) )
            // InternalExpAuto.g:3534:1: ( 'polynomial' )
            {
            // InternalExpAuto.g:3534:1: ( 'polynomial' )
            // InternalExpAuto.g:3535:2: 'polynomial'
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getPolynomialKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalExpAuto.g:3544:1: rule__PolynomialValueProvider__Group__1 : rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 ;
    public final void rule__PolynomialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3548:1: ( rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 )
            // InternalExpAuto.g:3549:2: rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2
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
    // InternalExpAuto.g:3556:1: rule__PolynomialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__PolynomialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3560:1: ( ( '(' ) )
            // InternalExpAuto.g:3561:1: ( '(' )
            {
            // InternalExpAuto.g:3561:1: ( '(' )
            // InternalExpAuto.g:3562:2: '('
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3571:1: rule__PolynomialValueProvider__Group__2 : rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 ;
    public final void rule__PolynomialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3575:1: ( rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 )
            // InternalExpAuto.g:3576:2: rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3
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
    // InternalExpAuto.g:3583:1: rule__PolynomialValueProvider__Group__2__Impl : ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) ;
    public final void rule__PolynomialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3587:1: ( ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) )
            // InternalExpAuto.g:3588:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            {
            // InternalExpAuto.g:3588:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            // InternalExpAuto.g:3589:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 
            // InternalExpAuto.g:3590:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            // InternalExpAuto.g:3590:3: rule__PolynomialValueProvider__ExponentAssignment_2
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
    // InternalExpAuto.g:3598:1: rule__PolynomialValueProvider__Group__3 : rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 ;
    public final void rule__PolynomialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3602:1: ( rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 )
            // InternalExpAuto.g:3603:2: rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4
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
    // InternalExpAuto.g:3610:1: rule__PolynomialValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__PolynomialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3614:1: ( ( ',' ) )
            // InternalExpAuto.g:3615:1: ( ',' )
            {
            // InternalExpAuto.g:3615:1: ( ',' )
            // InternalExpAuto.g:3616:2: ','
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:3625:1: rule__PolynomialValueProvider__Group__4 : rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 ;
    public final void rule__PolynomialValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3629:1: ( rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 )
            // InternalExpAuto.g:3630:2: rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5
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
    // InternalExpAuto.g:3637:1: rule__PolynomialValueProvider__Group__4__Impl : ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__PolynomialValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3641:1: ( ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3642:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3642:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3643:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3644:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3644:3: rule__PolynomialValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3652:1: rule__PolynomialValueProvider__Group__5 : rule__PolynomialValueProvider__Group__5__Impl ;
    public final void rule__PolynomialValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3656:1: ( rule__PolynomialValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3657:2: rule__PolynomialValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3663:1: rule__PolynomialValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__PolynomialValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3667:1: ( ( ')' ) )
            // InternalExpAuto.g:3668:1: ( ')' )
            {
            // InternalExpAuto.g:3668:1: ( ')' )
            // InternalExpAuto.g:3669:2: ')'
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:3679:1: rule__StopTimeCondition__Group__0 : rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 ;
    public final void rule__StopTimeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3683:1: ( rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 )
            // InternalExpAuto.g:3684:2: rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1
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
    // InternalExpAuto.g:3691:1: rule__StopTimeCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopTimeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3695:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3696:1: ( 'stop' )
            {
            // InternalExpAuto.g:3696:1: ( 'stop' )
            // InternalExpAuto.g:3697:2: 'stop'
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalExpAuto.g:3706:1: rule__StopTimeCondition__Group__1 : rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 ;
    public final void rule__StopTimeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3710:1: ( rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 )
            // InternalExpAuto.g:3711:2: rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2
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
    // InternalExpAuto.g:3718:1: rule__StopTimeCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopTimeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3722:1: ( ( '=' ) )
            // InternalExpAuto.g:3723:1: ( '=' )
            {
            // InternalExpAuto.g:3723:1: ( '=' )
            // InternalExpAuto.g:3724:2: '='
            {
             before(grammarAccess.getStopTimeConditionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:3733:1: rule__StopTimeCondition__Group__2 : rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 ;
    public final void rule__StopTimeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3737:1: ( rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 )
            // InternalExpAuto.g:3738:2: rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3
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
    // InternalExpAuto.g:3745:1: rule__StopTimeCondition__Group__2__Impl : ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopTimeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3749:1: ( ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3750:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3750:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3751:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3752:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3752:3: rule__StopTimeCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3760:1: rule__StopTimeCondition__Group__3 : rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 ;
    public final void rule__StopTimeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3764:1: ( rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 )
            // InternalExpAuto.g:3765:2: rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4
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
    // InternalExpAuto.g:3772:1: rule__StopTimeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopTimeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3776:1: ( ( '(' ) )
            // InternalExpAuto.g:3777:1: ( '(' )
            {
            // InternalExpAuto.g:3777:1: ( '(' )
            // InternalExpAuto.g:3778:2: '('
            {
             before(grammarAccess.getStopTimeConditionAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3787:1: rule__StopTimeCondition__Group__4 : rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 ;
    public final void rule__StopTimeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3791:1: ( rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 )
            // InternalExpAuto.g:3792:2: rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5
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
    // InternalExpAuto.g:3799:1: rule__StopTimeCondition__Group__4__Impl : ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopTimeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3803:1: ( ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3804:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3804:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3805:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3806:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3806:3: rule__StopTimeCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3814:1: rule__StopTimeCondition__Group__5 : rule__StopTimeCondition__Group__5__Impl ;
    public final void rule__StopTimeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3818:1: ( rule__StopTimeCondition__Group__5__Impl )
            // InternalExpAuto.g:3819:2: rule__StopTimeCondition__Group__5__Impl
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
    // InternalExpAuto.g:3825:1: rule__StopTimeCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopTimeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3829:1: ( ( ')' ) )
            // InternalExpAuto.g:3830:1: ( ')' )
            {
            // InternalExpAuto.g:3830:1: ( ')' )
            // InternalExpAuto.g:3831:2: ')'
            {
             before(grammarAccess.getStopTimeConditionAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:3841:1: rule__StopCountCondition__Group__0 : rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 ;
    public final void rule__StopCountCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3845:1: ( rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 )
            // InternalExpAuto.g:3846:2: rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1
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
    // InternalExpAuto.g:3853:1: rule__StopCountCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopCountCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3857:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3858:1: ( 'stop' )
            {
            // InternalExpAuto.g:3858:1: ( 'stop' )
            // InternalExpAuto.g:3859:2: 'stop'
            {
             before(grammarAccess.getStopCountConditionAccess().getStopKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalExpAuto.g:3868:1: rule__StopCountCondition__Group__1 : rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 ;
    public final void rule__StopCountCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3872:1: ( rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 )
            // InternalExpAuto.g:3873:2: rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2
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
    // InternalExpAuto.g:3880:1: rule__StopCountCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopCountCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3884:1: ( ( '=' ) )
            // InternalExpAuto.g:3885:1: ( '=' )
            {
            // InternalExpAuto.g:3885:1: ( '=' )
            // InternalExpAuto.g:3886:2: '='
            {
             before(grammarAccess.getStopCountConditionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:3895:1: rule__StopCountCondition__Group__2 : rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 ;
    public final void rule__StopCountCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3899:1: ( rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 )
            // InternalExpAuto.g:3900:2: rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3
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
    // InternalExpAuto.g:3907:1: rule__StopCountCondition__Group__2__Impl : ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopCountCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3911:1: ( ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3912:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3912:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3913:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3914:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3914:3: rule__StopCountCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3922:1: rule__StopCountCondition__Group__3 : rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 ;
    public final void rule__StopCountCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3926:1: ( rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 )
            // InternalExpAuto.g:3927:2: rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4
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
    // InternalExpAuto.g:3934:1: rule__StopCountCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopCountCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3938:1: ( ( '(' ) )
            // InternalExpAuto.g:3939:1: ( '(' )
            {
            // InternalExpAuto.g:3939:1: ( '(' )
            // InternalExpAuto.g:3940:2: '('
            {
             before(grammarAccess.getStopCountConditionAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExpAuto.g:3949:1: rule__StopCountCondition__Group__4 : rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 ;
    public final void rule__StopCountCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3953:1: ( rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 )
            // InternalExpAuto.g:3954:2: rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5
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
    // InternalExpAuto.g:3961:1: rule__StopCountCondition__Group__4__Impl : ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopCountCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3965:1: ( ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3966:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3966:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3967:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3968:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3968:3: rule__StopCountCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3976:1: rule__StopCountCondition__Group__5 : rule__StopCountCondition__Group__5__Impl ;
    public final void rule__StopCountCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3980:1: ( rule__StopCountCondition__Group__5__Impl )
            // InternalExpAuto.g:3981:2: rule__StopCountCondition__Group__5__Impl
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
    // InternalExpAuto.g:3987:1: rule__StopCountCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopCountCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3991:1: ( ( ')' ) )
            // InternalExpAuto.g:3992:1: ( ')' )
            {
            // InternalExpAuto.g:3992:1: ( ')' )
            // InternalExpAuto.g:3993:2: ')'
            {
             before(grammarAccess.getStopCountConditionAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExpAuto.g:4003:1: rule__NumberOfExperiments__Group__0 : rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 ;
    public final void rule__NumberOfExperiments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4007:1: ( rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 )
            // InternalExpAuto.g:4008:2: rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1
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
    // InternalExpAuto.g:4015:1: rule__NumberOfExperiments__Group__0__Impl : ( 'repetitions' ) ;
    public final void rule__NumberOfExperiments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4019:1: ( ( 'repetitions' ) )
            // InternalExpAuto.g:4020:1: ( 'repetitions' )
            {
            // InternalExpAuto.g:4020:1: ( 'repetitions' )
            // InternalExpAuto.g:4021:2: 'repetitions'
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getRepetitionsKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalExpAuto.g:4030:1: rule__NumberOfExperiments__Group__1 : rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 ;
    public final void rule__NumberOfExperiments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4034:1: ( rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 )
            // InternalExpAuto.g:4035:2: rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2
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
    // InternalExpAuto.g:4042:1: rule__NumberOfExperiments__Group__1__Impl : ( '=' ) ;
    public final void rule__NumberOfExperiments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4046:1: ( ( '=' ) )
            // InternalExpAuto.g:4047:1: ( '=' )
            {
            // InternalExpAuto.g:4047:1: ( '=' )
            // InternalExpAuto.g:4048:2: '='
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:4057:1: rule__NumberOfExperiments__Group__2 : rule__NumberOfExperiments__Group__2__Impl ;
    public final void rule__NumberOfExperiments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4061:1: ( rule__NumberOfExperiments__Group__2__Impl )
            // InternalExpAuto.g:4062:2: rule__NumberOfExperiments__Group__2__Impl
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
    // InternalExpAuto.g:4068:1: rule__NumberOfExperiments__Group__2__Impl : ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) ;
    public final void rule__NumberOfExperiments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4072:1: ( ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) )
            // InternalExpAuto.g:4073:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            {
            // InternalExpAuto.g:4073:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            // InternalExpAuto.g:4074:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 
            // InternalExpAuto.g:4075:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            // InternalExpAuto.g:4075:3: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2
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
    // InternalExpAuto.g:4084:1: rule__SeedDefinition__Group__0 : rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 ;
    public final void rule__SeedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4088:1: ( rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 )
            // InternalExpAuto.g:4089:2: rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1
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
    // InternalExpAuto.g:4096:1: rule__SeedDefinition__Group__0__Impl : ( 'seeds' ) ;
    public final void rule__SeedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4100:1: ( ( 'seeds' ) )
            // InternalExpAuto.g:4101:1: ( 'seeds' )
            {
            // InternalExpAuto.g:4101:1: ( 'seeds' )
            // InternalExpAuto.g:4102:2: 'seeds'
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedsKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalExpAuto.g:4111:1: rule__SeedDefinition__Group__1 : rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 ;
    public final void rule__SeedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4115:1: ( rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 )
            // InternalExpAuto.g:4116:2: rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2
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
    // InternalExpAuto.g:4123:1: rule__SeedDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__SeedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4127:1: ( ( '=' ) )
            // InternalExpAuto.g:4128:1: ( '=' )
            {
            // InternalExpAuto.g:4128:1: ( '=' )
            // InternalExpAuto.g:4129:2: '='
            {
             before(grammarAccess.getSeedDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:4138:1: rule__SeedDefinition__Group__2 : rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 ;
    public final void rule__SeedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4142:1: ( rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 )
            // InternalExpAuto.g:4143:2: rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3
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
    // InternalExpAuto.g:4150:1: rule__SeedDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4154:1: ( ( '{' ) )
            // InternalExpAuto.g:4155:1: ( '{' )
            {
            // InternalExpAuto.g:4155:1: ( '{' )
            // InternalExpAuto.g:4156:2: '{'
            {
             before(grammarAccess.getSeedDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:4165:1: rule__SeedDefinition__Group__3 : rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 ;
    public final void rule__SeedDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4169:1: ( rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 )
            // InternalExpAuto.g:4170:2: rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4
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
    // InternalExpAuto.g:4177:1: rule__SeedDefinition__Group__3__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) ;
    public final void rule__SeedDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4181:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) )
            // InternalExpAuto.g:4182:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            {
            // InternalExpAuto.g:4182:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            // InternalExpAuto.g:4183:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 
            // InternalExpAuto.g:4184:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            // InternalExpAuto.g:4184:3: rule__SeedDefinition__SeedListsAssignment_3
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
    // InternalExpAuto.g:4192:1: rule__SeedDefinition__Group__4 : rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 ;
    public final void rule__SeedDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4196:1: ( rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 )
            // InternalExpAuto.g:4197:2: rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5
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
    // InternalExpAuto.g:4204:1: rule__SeedDefinition__Group__4__Impl : ( ( rule__SeedDefinition__Group_4__0 )* ) ;
    public final void rule__SeedDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4208:1: ( ( ( rule__SeedDefinition__Group_4__0 )* ) )
            // InternalExpAuto.g:4209:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            {
            // InternalExpAuto.g:4209:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            // InternalExpAuto.g:4210:2: ( rule__SeedDefinition__Group_4__0 )*
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 
            // InternalExpAuto.g:4211:2: ( rule__SeedDefinition__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:4211:3: rule__SeedDefinition__Group_4__0
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
    // InternalExpAuto.g:4219:1: rule__SeedDefinition__Group__5 : rule__SeedDefinition__Group__5__Impl ;
    public final void rule__SeedDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4223:1: ( rule__SeedDefinition__Group__5__Impl )
            // InternalExpAuto.g:4224:2: rule__SeedDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4230:1: rule__SeedDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__SeedDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4234:1: ( ( '}' ) )
            // InternalExpAuto.g:4235:1: ( '}' )
            {
            // InternalExpAuto.g:4235:1: ( '}' )
            // InternalExpAuto.g:4236:2: '}'
            {
             before(grammarAccess.getSeedDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:4246:1: rule__SeedDefinition__Group_4__0 : rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 ;
    public final void rule__SeedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4250:1: ( rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 )
            // InternalExpAuto.g:4251:2: rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1
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
    // InternalExpAuto.g:4258:1: rule__SeedDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SeedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4262:1: ( ( ',' ) )
            // InternalExpAuto.g:4263:1: ( ',' )
            {
            // InternalExpAuto.g:4263:1: ( ',' )
            // InternalExpAuto.g:4264:2: ','
            {
             before(grammarAccess.getSeedDefinitionAccess().getCommaKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:4273:1: rule__SeedDefinition__Group_4__1 : rule__SeedDefinition__Group_4__1__Impl ;
    public final void rule__SeedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4277:1: ( rule__SeedDefinition__Group_4__1__Impl )
            // InternalExpAuto.g:4278:2: rule__SeedDefinition__Group_4__1__Impl
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
    // InternalExpAuto.g:4284:1: rule__SeedDefinition__Group_4__1__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) ;
    public final void rule__SeedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4288:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) )
            // InternalExpAuto.g:4289:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            {
            // InternalExpAuto.g:4289:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            // InternalExpAuto.g:4290:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 
            // InternalExpAuto.g:4291:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            // InternalExpAuto.g:4291:3: rule__SeedDefinition__SeedListsAssignment_4_1
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
    // InternalExpAuto.g:4300:1: rule__ListOfSeeds__Group__0 : rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 ;
    public final void rule__ListOfSeeds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4304:1: ( rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 )
            // InternalExpAuto.g:4305:2: rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1
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
    // InternalExpAuto.g:4312:1: rule__ListOfSeeds__Group__0__Impl : ( '{' ) ;
    public final void rule__ListOfSeeds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4316:1: ( ( '{' ) )
            // InternalExpAuto.g:4317:1: ( '{' )
            {
            // InternalExpAuto.g:4317:1: ( '{' )
            // InternalExpAuto.g:4318:2: '{'
            {
             before(grammarAccess.getListOfSeedsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:4327:1: rule__ListOfSeeds__Group__1 : rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 ;
    public final void rule__ListOfSeeds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4331:1: ( rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 )
            // InternalExpAuto.g:4332:2: rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2
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
    // InternalExpAuto.g:4339:1: rule__ListOfSeeds__Group__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) ;
    public final void rule__ListOfSeeds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4343:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) )
            // InternalExpAuto.g:4344:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            {
            // InternalExpAuto.g:4344:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            // InternalExpAuto.g:4345:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 
            // InternalExpAuto.g:4346:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            // InternalExpAuto.g:4346:3: rule__ListOfSeeds__SeedsAssignment_1
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
    // InternalExpAuto.g:4354:1: rule__ListOfSeeds__Group__2 : rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 ;
    public final void rule__ListOfSeeds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4358:1: ( rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 )
            // InternalExpAuto.g:4359:2: rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3
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
    // InternalExpAuto.g:4366:1: rule__ListOfSeeds__Group__2__Impl : ( ( rule__ListOfSeeds__Group_2__0 )* ) ;
    public final void rule__ListOfSeeds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4370:1: ( ( ( rule__ListOfSeeds__Group_2__0 )* ) )
            // InternalExpAuto.g:4371:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            {
            // InternalExpAuto.g:4371:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            // InternalExpAuto.g:4372:2: ( rule__ListOfSeeds__Group_2__0 )*
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup_2()); 
            // InternalExpAuto.g:4373:2: ( rule__ListOfSeeds__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:4373:3: rule__ListOfSeeds__Group_2__0
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
    // InternalExpAuto.g:4381:1: rule__ListOfSeeds__Group__3 : rule__ListOfSeeds__Group__3__Impl ;
    public final void rule__ListOfSeeds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4385:1: ( rule__ListOfSeeds__Group__3__Impl )
            // InternalExpAuto.g:4386:2: rule__ListOfSeeds__Group__3__Impl
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
    // InternalExpAuto.g:4392:1: rule__ListOfSeeds__Group__3__Impl : ( '}' ) ;
    public final void rule__ListOfSeeds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4396:1: ( ( '}' ) )
            // InternalExpAuto.g:4397:1: ( '}' )
            {
            // InternalExpAuto.g:4397:1: ( '}' )
            // InternalExpAuto.g:4398:2: '}'
            {
             before(grammarAccess.getListOfSeedsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:4408:1: rule__ListOfSeeds__Group_2__0 : rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 ;
    public final void rule__ListOfSeeds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4412:1: ( rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 )
            // InternalExpAuto.g:4413:2: rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1
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
    // InternalExpAuto.g:4420:1: rule__ListOfSeeds__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOfSeeds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4424:1: ( ( ',' ) )
            // InternalExpAuto.g:4425:1: ( ',' )
            {
            // InternalExpAuto.g:4425:1: ( ',' )
            // InternalExpAuto.g:4426:2: ','
            {
             before(grammarAccess.getListOfSeedsAccess().getCommaKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExpAuto.g:4435:1: rule__ListOfSeeds__Group_2__1 : rule__ListOfSeeds__Group_2__1__Impl ;
    public final void rule__ListOfSeeds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4439:1: ( rule__ListOfSeeds__Group_2__1__Impl )
            // InternalExpAuto.g:4440:2: rule__ListOfSeeds__Group_2__1__Impl
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
    // InternalExpAuto.g:4446:1: rule__ListOfSeeds__Group_2__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) ;
    public final void rule__ListOfSeeds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4450:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) )
            // InternalExpAuto.g:4451:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            {
            // InternalExpAuto.g:4451:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            // InternalExpAuto.g:4452:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 
            // InternalExpAuto.g:4453:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            // InternalExpAuto.g:4453:3: rule__ListOfSeeds__SeedsAssignment_2_1
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
    // InternalExpAuto.g:4462:1: rule__ExperimentDatasource__Group__0 : rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 ;
    public final void rule__ExperimentDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4466:1: ( rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 )
            // InternalExpAuto.g:4467:2: rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1
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
    // InternalExpAuto.g:4474:1: rule__ExperimentDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__ExperimentDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4478:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:4479:1: ( 'datasource' )
            {
            // InternalExpAuto.g:4479:1: ( 'datasource' )
            // InternalExpAuto.g:4480:2: 'datasource'
            {
             before(grammarAccess.getExperimentDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalExpAuto.g:4489:1: rule__ExperimentDatasource__Group__1 : rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 ;
    public final void rule__ExperimentDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4493:1: ( rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 )
            // InternalExpAuto.g:4494:2: rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2
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
    // InternalExpAuto.g:4501:1: rule__ExperimentDatasource__Group__1__Impl : ( '=' ) ;
    public final void rule__ExperimentDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4505:1: ( ( '=' ) )
            // InternalExpAuto.g:4506:1: ( '=' )
            {
            // InternalExpAuto.g:4506:1: ( '=' )
            // InternalExpAuto.g:4507:2: '='
            {
             before(grammarAccess.getExperimentDatasourceAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:4516:1: rule__ExperimentDatasource__Group__2 : rule__ExperimentDatasource__Group__2__Impl ;
    public final void rule__ExperimentDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4520:1: ( rule__ExperimentDatasource__Group__2__Impl )
            // InternalExpAuto.g:4521:2: rule__ExperimentDatasource__Group__2__Impl
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
    // InternalExpAuto.g:4527:1: rule__ExperimentDatasource__Group__2__Impl : ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) ;
    public final void rule__ExperimentDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4531:1: ( ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) )
            // InternalExpAuto.g:4532:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            {
            // InternalExpAuto.g:4532:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            // InternalExpAuto.g:4533:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 
            // InternalExpAuto.g:4534:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            // InternalExpAuto.g:4534:3: rule__ExperimentDatasource__SourceAssignment_2
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
    // InternalExpAuto.g:4543:1: rule__ToolDefinition__Group__0 : rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 ;
    public final void rule__ToolDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4547:1: ( rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 )
            // InternalExpAuto.g:4548:2: rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1
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
    // InternalExpAuto.g:4555:1: rule__ToolDefinition__Group__0__Impl : ( 'tool' ) ;
    public final void rule__ToolDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4559:1: ( ( 'tool' ) )
            // InternalExpAuto.g:4560:1: ( 'tool' )
            {
            // InternalExpAuto.g:4560:1: ( 'tool' )
            // InternalExpAuto.g:4561:2: 'tool'
            {
             before(grammarAccess.getToolDefinitionAccess().getToolKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalExpAuto.g:4570:1: rule__ToolDefinition__Group__1 : rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 ;
    public final void rule__ToolDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4574:1: ( rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 )
            // InternalExpAuto.g:4575:2: rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalExpAuto.g:4582:1: rule__ToolDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__ToolDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4586:1: ( ( '=' ) )
            // InternalExpAuto.g:4587:1: ( '=' )
            {
            // InternalExpAuto.g:4587:1: ( '=' )
            // InternalExpAuto.g:4588:2: '='
            {
             before(grammarAccess.getToolDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:4597:1: rule__ToolDefinition__Group__2 : rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 ;
    public final void rule__ToolDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4601:1: ( rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 )
            // InternalExpAuto.g:4602:2: rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3
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
    // InternalExpAuto.g:4609:1: rule__ToolDefinition__Group__2__Impl : ( ( rule__ToolDefinition__ToolAssignment_2 ) ) ;
    public final void rule__ToolDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4613:1: ( ( ( rule__ToolDefinition__ToolAssignment_2 ) ) )
            // InternalExpAuto.g:4614:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            {
            // InternalExpAuto.g:4614:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            // InternalExpAuto.g:4615:2: ( rule__ToolDefinition__ToolAssignment_2 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 
            // InternalExpAuto.g:4616:2: ( rule__ToolDefinition__ToolAssignment_2 )
            // InternalExpAuto.g:4616:3: rule__ToolDefinition__ToolAssignment_2
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
    // InternalExpAuto.g:4624:1: rule__ToolDefinition__Group__3 : rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 ;
    public final void rule__ToolDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4628:1: ( rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 )
            // InternalExpAuto.g:4629:2: rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalExpAuto.g:4636:1: rule__ToolDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ToolDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4640:1: ( ( '{' ) )
            // InternalExpAuto.g:4641:1: ( '{' )
            {
            // InternalExpAuto.g:4641:1: ( '{' )
            // InternalExpAuto.g:4642:2: '{'
            {
             before(grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExpAuto.g:4651:1: rule__ToolDefinition__Group__4 : rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 ;
    public final void rule__ToolDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4655:1: ( rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 )
            // InternalExpAuto.g:4656:2: rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalExpAuto.g:4663:1: rule__ToolDefinition__Group__4__Impl : ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) ;
    public final void rule__ToolDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4667:1: ( ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) )
            // InternalExpAuto.g:4668:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            {
            // InternalExpAuto.g:4668:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            // InternalExpAuto.g:4669:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_4()); 
            // InternalExpAuto.g:4670:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpAuto.g:4670:3: rule__ToolDefinition__ConfigParamsAssignment_4
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalExpAuto.g:4678:1: rule__ToolDefinition__Group__5 : rule__ToolDefinition__Group__5__Impl ;
    public final void rule__ToolDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4682:1: ( rule__ToolDefinition__Group__5__Impl )
            // InternalExpAuto.g:4683:2: rule__ToolDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4689:1: rule__ToolDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ToolDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4693:1: ( ( '}' ) )
            // InternalExpAuto.g:4694:1: ( '}' )
            {
            // InternalExpAuto.g:4694:1: ( '}' )
            // InternalExpAuto.g:4695:2: '}'
            {
             before(grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExpAuto.g:4705:1: rule__ConfigurationParams__Group__0 : rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 ;
    public final void rule__ConfigurationParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4709:1: ( rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 )
            // InternalExpAuto.g:4710:2: rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1
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
    // InternalExpAuto.g:4717:1: rule__ConfigurationParams__Group__0__Impl : ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4721:1: ( ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) )
            // InternalExpAuto.g:4722:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            {
            // InternalExpAuto.g:4722:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            // InternalExpAuto.g:4723:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0()); 
            // InternalExpAuto.g:4724:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            // InternalExpAuto.g:4724:3: rule__ConfigurationParams__KeyAssignment_0
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
    // InternalExpAuto.g:4732:1: rule__ConfigurationParams__Group__1 : rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 ;
    public final void rule__ConfigurationParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4736:1: ( rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 )
            // InternalExpAuto.g:4737:2: rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalExpAuto.g:4744:1: rule__ConfigurationParams__Group__1__Impl : ( '=' ) ;
    public final void rule__ConfigurationParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4748:1: ( ( '=' ) )
            // InternalExpAuto.g:4749:1: ( '=' )
            {
            // InternalExpAuto.g:4749:1: ( '=' )
            // InternalExpAuto.g:4750:2: '='
            {
             before(grammarAccess.getConfigurationParamsAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExpAuto.g:4759:1: rule__ConfigurationParams__Group__2 : rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3 ;
    public final void rule__ConfigurationParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4763:1: ( rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3 )
            // InternalExpAuto.g:4764:2: rule__ConfigurationParams__Group__2__Impl rule__ConfigurationParams__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalExpAuto.g:4771:1: rule__ConfigurationParams__Group__2__Impl : ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) ;
    public final void rule__ConfigurationParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4775:1: ( ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) )
            // InternalExpAuto.g:4776:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            {
            // InternalExpAuto.g:4776:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            // InternalExpAuto.g:4777:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2()); 
            // InternalExpAuto.g:4778:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            // InternalExpAuto.g:4778:3: rule__ConfigurationParams__ValueAssignment_2
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
    // InternalExpAuto.g:4786:1: rule__ConfigurationParams__Group__3 : rule__ConfigurationParams__Group__3__Impl ;
    public final void rule__ConfigurationParams__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4790:1: ( rule__ConfigurationParams__Group__3__Impl )
            // InternalExpAuto.g:4791:2: rule__ConfigurationParams__Group__3__Impl
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
    // InternalExpAuto.g:4797:1: rule__ConfigurationParams__Group__3__Impl : ( ';' ) ;
    public final void rule__ConfigurationParams__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4801:1: ( ( ';' ) )
            // InternalExpAuto.g:4802:1: ( ';' )
            {
            // InternalExpAuto.g:4802:1: ( ';' )
            // InternalExpAuto.g:4803:2: ';'
            {
             before(grammarAccess.getConfigurationParamsAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalExpAuto.g:4813:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4817:1: ( ( ruleImport ) )
            // InternalExpAuto.g:4818:2: ( ruleImport )
            {
            // InternalExpAuto.g:4818:2: ( ruleImport )
            // InternalExpAuto.g:4819:3: ruleImport
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
    // InternalExpAuto.g:4828:1: rule__Model__DatasourcesAssignment_1 : ( ruleDatasource ) ;
    public final void rule__Model__DatasourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4832:1: ( ( ruleDatasource ) )
            // InternalExpAuto.g:4833:2: ( ruleDatasource )
            {
            // InternalExpAuto.g:4833:2: ( ruleDatasource )
            // InternalExpAuto.g:4834:3: ruleDatasource
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
    // InternalExpAuto.g:4843:1: rule__Model__ExperimentsAssignment_2 : ( ruleExperiment ) ;
    public final void rule__Model__ExperimentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4847:1: ( ( ruleExperiment ) )
            // InternalExpAuto.g:4848:2: ( ruleExperiment )
            {
            // InternalExpAuto.g:4848:2: ( ruleExperiment )
            // InternalExpAuto.g:4849:3: ruleExperiment
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
    // InternalExpAuto.g:4858:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4862:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4863:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4863:2: ( RULE_STRING )
            // InternalExpAuto.g:4864:3: RULE_STRING
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


    // $ANTLR start "rule__Datasource__NameAssignment_1"
    // InternalExpAuto.g:4873:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4877:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:4878:2: ( RULE_ID )
            {
            // InternalExpAuto.g:4878:2: ( RULE_ID )
            // InternalExpAuto.g:4879:3: RULE_ID
            {
             before(grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Datasource__NameAssignment_1"


    // $ANTLR start "rule__Datasource__SourceTypeAssignment_3"
    // InternalExpAuto.g:4888:1: rule__Datasource__SourceTypeAssignment_3 : ( ( 'EDP2' ) ) ;
    public final void rule__Datasource__SourceTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4892:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:4893:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:4893:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:4894:3: ( 'EDP2' )
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            // InternalExpAuto.g:4895:3: ( 'EDP2' )
            // InternalExpAuto.g:4896:4: 'EDP2'
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

            }

             after(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 

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
    // $ANTLR end "rule__Datasource__SourceTypeAssignment_3"


    // $ANTLR start "rule__Datasource__SourceURIAssignment_5"
    // InternalExpAuto.g:4907:1: rule__Datasource__SourceURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Datasource__SourceURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4911:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4912:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4912:2: ( RULE_STRING )
            // InternalExpAuto.g:4913:3: RULE_STRING
            {
             before(grammarAccess.getDatasourceAccess().getSourceURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getSourceURISTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Datasource__SourceURIAssignment_5"


    // $ANTLR start "rule__Experiment__NameAssignment_1"
    // InternalExpAuto.g:4922:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4926:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:4927:2: ( RULE_ID )
            {
            // InternalExpAuto.g:4927:2: ( RULE_ID )
            // InternalExpAuto.g:4928:3: RULE_ID
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
    // InternalExpAuto.g:4937:1: rule__Experiment__DesignAssignment_3 : ( ( rule__Experiment__DesignAlternatives_3_0 ) ) ;
    public final void rule__Experiment__DesignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4941:1: ( ( ( rule__Experiment__DesignAlternatives_3_0 ) ) )
            // InternalExpAuto.g:4942:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            {
            // InternalExpAuto.g:4942:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            // InternalExpAuto.g:4943:3: ( rule__Experiment__DesignAlternatives_3_0 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 
            // InternalExpAuto.g:4944:3: ( rule__Experiment__DesignAlternatives_3_0 )
            // InternalExpAuto.g:4944:4: rule__Experiment__DesignAlternatives_3_0
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
    // InternalExpAuto.g:4952:1: rule__Experiment__ExperimentSpecificationsAssignment_5 : ( ruleExperimentSpecifications ) ;
    public final void rule__Experiment__ExperimentSpecificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4956:1: ( ( ruleExperimentSpecifications ) )
            // InternalExpAuto.g:4957:2: ( ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:4957:2: ( ruleExperimentSpecifications )
            // InternalExpAuto.g:4958:3: ruleExperimentSpecifications
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
    // InternalExpAuto.g:4967:1: rule__ExperimentSpecifications__SpecificationsAssignment : ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__ExperimentSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4971:1: ( ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:4972:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:4972:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:4973:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:4974:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:4974:4: rule__ExperimentSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:4982:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4986:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4987:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4987:2: ( RULE_STRING )
            // InternalExpAuto.g:4988:3: RULE_STRING
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
    // InternalExpAuto.g:4997:1: rule__InitialModel__ModeltypAssignment_2 : ( ( 'PCM' ) ) ;
    public final void rule__InitialModel__ModeltypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5001:1: ( ( ( 'PCM' ) ) )
            // InternalExpAuto.g:5002:2: ( ( 'PCM' ) )
            {
            // InternalExpAuto.g:5002:2: ( ( 'PCM' ) )
            // InternalExpAuto.g:5003:3: ( 'PCM' )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            // InternalExpAuto.g:5004:3: ( 'PCM' )
            // InternalExpAuto.g:5005:4: 'PCM'
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalExpAuto.g:5016:1: rule__InitialModel__InitSpecificationsAssignment_4 : ( ruleInitSpecifications ) ;
    public final void rule__InitialModel__InitSpecificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5020:1: ( ( ruleInitSpecifications ) )
            // InternalExpAuto.g:5021:2: ( ruleInitSpecifications )
            {
            // InternalExpAuto.g:5021:2: ( ruleInitSpecifications )
            // InternalExpAuto.g:5022:3: ruleInitSpecifications
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
    // InternalExpAuto.g:5031:1: rule__InitSpecifications__SpecificationsAssignment : ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__InitSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5035:1: ( ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5036:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5036:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5037:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5038:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5038:4: rule__InitSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5046:1: rule__AllocationModel__AllocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllocationModel__AllocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5050:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5051:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5051:2: ( RULE_STRING )
            // InternalExpAuto.g:5052:3: RULE_STRING
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
    // InternalExpAuto.g:5061:1: rule__UsageModel__UsageModelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsageModel__UsageModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5065:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5066:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5066:2: ( RULE_STRING )
            // InternalExpAuto.g:5067:3: RULE_STRING
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
    // InternalExpAuto.g:5076:1: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5080:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5081:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5081:2: ( RULE_STRING )
            // InternalExpAuto.g:5082:3: RULE_STRING
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
    // InternalExpAuto.g:5091:1: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5095:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5096:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5096:2: ( RULE_STRING )
            // InternalExpAuto.g:5097:3: RULE_STRING
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
    // InternalExpAuto.g:5106:1: rule__MonitorRepository__MonitorRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonitorRepository__MonitorRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5110:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5111:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5111:2: ( RULE_STRING )
            // InternalExpAuto.g:5112:3: RULE_STRING
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
    // InternalExpAuto.g:5121:1: rule__Variation__VariationTypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__VariationTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5125:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5126:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5126:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5127:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 
            // InternalExpAuto.g:5128:3: ( RULE_ID )
            // InternalExpAuto.g:5129:4: RULE_ID
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
    // InternalExpAuto.g:5140:1: rule__Variation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Variation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5144:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5145:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5145:2: ( RULE_ID )
            // InternalExpAuto.g:5146:3: RULE_ID
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
    // InternalExpAuto.g:5155:1: rule__Variation__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5159:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5160:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5160:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5161:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0()); 
            // InternalExpAuto.g:5162:3: ( RULE_ID )
            // InternalExpAuto.g:5163:4: RULE_ID
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
    // InternalExpAuto.g:5174:1: rule__Variation__MaxVariationsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Variation__MaxVariationsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5178:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5179:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5179:2: ( RULE_INT )
            // InternalExpAuto.g:5180:3: RULE_INT
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
    // InternalExpAuto.g:5189:1: rule__Variation__ValueProviderAssignment_13 : ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) ;
    public final void rule__Variation__ValueProviderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5193:1: ( ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) )
            // InternalExpAuto.g:5194:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            {
            // InternalExpAuto.g:5194:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            // InternalExpAuto.g:5195:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 
            // InternalExpAuto.g:5196:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            // InternalExpAuto.g:5196:4: rule__Variation__ValueProviderAlternatives_13_0
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
    // InternalExpAuto.g:5204:1: rule__NestedIntervalsValueProvider__MinAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5208:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5209:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5209:2: ( RULE_INT )
            // InternalExpAuto.g:5210:3: RULE_INT
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
    // InternalExpAuto.g:5219:1: rule__NestedIntervalsValueProvider__MaxAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5223:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5224:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5224:2: ( RULE_INT )
            // InternalExpAuto.g:5225:3: RULE_INT
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
    // InternalExpAuto.g:5234:1: rule__NestedIntervalsValueProvider__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5238:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5239:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5239:2: ( RULE_INT )
            // InternalExpAuto.g:5240:3: RULE_INT
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
    // InternalExpAuto.g:5249:1: rule__NestedIntervalsValueProvider__MaxAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5253:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5254:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5254:2: ( RULE_INT )
            // InternalExpAuto.g:5255:3: RULE_INT
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
    // InternalExpAuto.g:5264:1: rule__SetValueProvider__ValuesAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5268:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5269:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5269:2: ( RULE_INT )
            // InternalExpAuto.g:5270:3: RULE_INT
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
    // InternalExpAuto.g:5279:1: rule__SetValueProvider__ValuesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5283:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5284:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5284:2: ( RULE_INT )
            // InternalExpAuto.g:5285:3: RULE_INT
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
    // InternalExpAuto.g:5294:1: rule__SetValueProvider__ValuesAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5298:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5299:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5299:2: ( RULE_INT )
            // InternalExpAuto.g:5300:3: RULE_INT
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
    // InternalExpAuto.g:5309:1: rule__SetValueProvider__ValuesAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5313:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5314:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5314:2: ( RULE_INT )
            // InternalExpAuto.g:5315:3: RULE_INT
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
    // InternalExpAuto.g:5324:1: rule__LinearValueProvider__SummandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__SummandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5328:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5329:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5329:2: ( RULE_INT )
            // InternalExpAuto.g:5330:3: RULE_INT
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
    // InternalExpAuto.g:5339:1: rule__LinearValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5343:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5344:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5344:2: ( RULE_INT )
            // InternalExpAuto.g:5345:3: RULE_INT
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
    // InternalExpAuto.g:5354:1: rule__ExponentialValueProvider__BaseAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExponentialValueProvider__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5358:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5359:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5359:2: ( RULE_INT )
            // InternalExpAuto.g:5360:3: RULE_INT
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
    // InternalExpAuto.g:5369:1: rule__PolynomialValueProvider__ExponentAssignment_2 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5373:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5374:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5374:2: ( RULE_INT )
            // InternalExpAuto.g:5375:3: RULE_INT
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
    // InternalExpAuto.g:5384:1: rule__PolynomialValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5388:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5389:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5389:2: ( RULE_INT )
            // InternalExpAuto.g:5390:3: RULE_INT
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
    // InternalExpAuto.g:5399:1: rule__StopTimeCondition__StopTypAssignment_2 : ( ( 'simulationTime' ) ) ;
    public final void rule__StopTimeCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5403:1: ( ( ( 'simulationTime' ) ) )
            // InternalExpAuto.g:5404:2: ( ( 'simulationTime' ) )
            {
            // InternalExpAuto.g:5404:2: ( ( 'simulationTime' ) )
            // InternalExpAuto.g:5405:3: ( 'simulationTime' )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            // InternalExpAuto.g:5406:3: ( 'simulationTime' )
            // InternalExpAuto.g:5407:4: 'simulationTime'
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalExpAuto.g:5418:1: rule__StopTimeCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopTimeCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5422:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5423:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5423:2: ( RULE_INT )
            // InternalExpAuto.g:5424:3: RULE_INT
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
    // InternalExpAuto.g:5433:1: rule__StopCountCondition__StopTypAssignment_2 : ( ( 'measurementCount' ) ) ;
    public final void rule__StopCountCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5437:1: ( ( ( 'measurementCount' ) ) )
            // InternalExpAuto.g:5438:2: ( ( 'measurementCount' ) )
            {
            // InternalExpAuto.g:5438:2: ( ( 'measurementCount' ) )
            // InternalExpAuto.g:5439:3: ( 'measurementCount' )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            // InternalExpAuto.g:5440:3: ( 'measurementCount' )
            // InternalExpAuto.g:5441:4: 'measurementCount'
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalExpAuto.g:5452:1: rule__StopCountCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopCountCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5456:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5457:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5457:2: ( RULE_INT )
            // InternalExpAuto.g:5458:3: RULE_INT
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
    // InternalExpAuto.g:5467:1: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5471:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5472:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5472:2: ( RULE_INT )
            // InternalExpAuto.g:5473:3: RULE_INT
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
    // InternalExpAuto.g:5482:1: rule__SeedDefinition__SeedListsAssignment_3 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5486:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5487:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5487:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5488:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5497:1: rule__SeedDefinition__SeedListsAssignment_4_1 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5501:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5502:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5502:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5503:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5512:1: rule__ListOfSeeds__SeedsAssignment_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5516:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5517:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5517:2: ( RULE_INT )
            // InternalExpAuto.g:5518:3: RULE_INT
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
    // InternalExpAuto.g:5527:1: rule__ListOfSeeds__SeedsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5531:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5532:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5532:2: ( RULE_INT )
            // InternalExpAuto.g:5533:3: RULE_INT
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
    // InternalExpAuto.g:5542:1: rule__ExperimentDatasource__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExperimentDatasource__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5546:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5547:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5547:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5548:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalExpAuto.g:5549:3: ( RULE_ID )
            // InternalExpAuto.g:5550:4: RULE_ID
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
    // InternalExpAuto.g:5561:1: rule__ToolDefinition__ToolAssignment_2 : ( ( rule__ToolDefinition__ToolAlternatives_2_0 ) ) ;
    public final void rule__ToolDefinition__ToolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5565:1: ( ( ( rule__ToolDefinition__ToolAlternatives_2_0 ) ) )
            // InternalExpAuto.g:5566:2: ( ( rule__ToolDefinition__ToolAlternatives_2_0 ) )
            {
            // InternalExpAuto.g:5566:2: ( ( rule__ToolDefinition__ToolAlternatives_2_0 ) )
            // InternalExpAuto.g:5567:3: ( rule__ToolDefinition__ToolAlternatives_2_0 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAlternatives_2_0()); 
            // InternalExpAuto.g:5568:3: ( rule__ToolDefinition__ToolAlternatives_2_0 )
            // InternalExpAuto.g:5568:4: rule__ToolDefinition__ToolAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__ToolAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getToolDefinitionAccess().getToolAlternatives_2_0()); 

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
    // InternalExpAuto.g:5576:1: rule__ToolDefinition__ConfigParamsAssignment_4 : ( ruleConfigurationParams ) ;
    public final void rule__ToolDefinition__ConfigParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5580:1: ( ( ruleConfigurationParams ) )
            // InternalExpAuto.g:5581:2: ( ruleConfigurationParams )
            {
            // InternalExpAuto.g:5581:2: ( ruleConfigurationParams )
            // InternalExpAuto.g:5582:3: ruleConfigurationParams
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
    // InternalExpAuto.g:5591:1: rule__ConfigurationParams__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigurationParams__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5595:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5596:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5596:2: ( RULE_ID )
            // InternalExpAuto.g:5597:3: RULE_ID
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
    // InternalExpAuto.g:5606:1: rule__ConfigurationParams__ValueAssignment_2 : ( ruleConfigValue ) ;
    public final void rule__ConfigurationParams__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5610:1: ( ( ruleConfigValue ) )
            // InternalExpAuto.g:5611:2: ( ruleConfigValue )
            {
            // InternalExpAuto.g:5611:2: ( ruleConfigValue )
            // InternalExpAuto.g:5612:3: ruleConfigValue
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\3\uffff\1\30\4\uffff\1\62\2\uffff";
    static final String dfa_3s = "\1\56\3\uffff\1\30\4\uffff\1\63\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5";
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "787:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleToolDefinition ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000780082810002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000780082810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000007C800200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});

}