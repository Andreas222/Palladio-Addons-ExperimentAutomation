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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FullFactorial'", "'OneFactor'", "'import'", "'datasource'", "':'", "'('", "')'", "'experiment'", "'{'", "'}'", "'description'", "'='", "'initial'", "'allocation'", "'usageModel'", "'middlewareRepository'", "'eventMiddlewareRepository'", "'monitorRepository'", "'variation'", "'target'", "'maxVariations'", "'values'", "'['", "','", "']'", "'nestedIntervall'", "'setValues'", "'linear'", "'exponential'", "'polynomial'", "'stop'", "'repetitions'", "'seeds'", "'tool'", "'EDP2'", "'PCM'", "'simulationTime'", "'measurementCount'"
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

                if ( (LA1_0==14||LA1_0==21||LA1_0==23||LA1_0==29||(LA1_0>=41 && LA1_0<=44)) ) {
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

                if ( ((LA2_0>=24 && LA2_0<=28)) ) {
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
    // InternalExpAuto.g:787:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) );
    public final void rule__ExperimentSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:791:1: ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) )
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
                    // InternalExpAuto.g:828:2: ( ruleToolDefinition )
                    {
                    // InternalExpAuto.g:828:2: ( ruleToolDefinition )
                    // InternalExpAuto.g:829:3: ruleToolDefinition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleToolDefinition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalExpAuto.g:834:2: ( ruleSeedDefinition )
                    {
                    // InternalExpAuto.g:834:2: ( ruleSeedDefinition )
                    // InternalExpAuto.g:835:3: ruleSeedDefinition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsSeedDefinitionParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSeedDefinition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsSeedDefinitionParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalExpAuto.g:840:2: ( ruleExperimentDatasource )
                    {
                    // InternalExpAuto.g:840:2: ( ruleExperimentDatasource )
                    // InternalExpAuto.g:841:3: ruleExperimentDatasource
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsExperimentDatasourceParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleExperimentDatasource();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsExperimentDatasourceParserRuleCall_0_8()); 

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
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
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
            case 33:
            case 36:
                {
                alt6=1;
                }
                break;
            case 19:
            case 37:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            case 40:
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

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
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

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
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


    // $ANTLR start "rule__ConfigValue__Alternatives"
    // InternalExpAuto.g:970:1: rule__ConfigValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__ConfigValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:974:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpAuto.g:975:2: ( RULE_STRING )
                    {
                    // InternalExpAuto.g:975:2: ( RULE_STRING )
                    // InternalExpAuto.g:976:3: RULE_STRING
                    {
                     before(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:981:2: ( RULE_INT )
                    {
                    // InternalExpAuto.g:981:2: ( RULE_INT )
                    // InternalExpAuto.g:982:3: RULE_INT
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
    // InternalExpAuto.g:991:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:995:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpAuto.g:996:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalExpAuto.g:1003:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1007:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalExpAuto.g:1008:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalExpAuto.g:1008:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalExpAuto.g:1009:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalExpAuto.g:1009:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalExpAuto.g:1010:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1011:3: ( rule__Model__ImportsAssignment_0 )
            // InternalExpAuto.g:1011:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_6);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalExpAuto.g:1014:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalExpAuto.g:1015:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1016:3: ( rule__Model__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExpAuto.g:1016:4: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalExpAuto.g:1025:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1029:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalExpAuto.g:1030:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalExpAuto.g:1037:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1041:1: ( ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) )
            // InternalExpAuto.g:1042:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            {
            // InternalExpAuto.g:1042:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            // InternalExpAuto.g:1043:2: ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* )
            {
            // InternalExpAuto.g:1043:2: ( ( rule__Model__DatasourcesAssignment_1 ) )
            // InternalExpAuto.g:1044:3: ( rule__Model__DatasourcesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1045:3: ( rule__Model__DatasourcesAssignment_1 )
            // InternalExpAuto.g:1045:4: rule__Model__DatasourcesAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Model__DatasourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }

            // InternalExpAuto.g:1048:2: ( ( rule__Model__DatasourcesAssignment_1 )* )
            // InternalExpAuto.g:1049:3: ( rule__Model__DatasourcesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1050:3: ( rule__Model__DatasourcesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpAuto.g:1050:4: rule__Model__DatasourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__DatasourcesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalExpAuto.g:1059:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1063:1: ( rule__Model__Group__2__Impl )
            // InternalExpAuto.g:1064:2: rule__Model__Group__2__Impl
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
    // InternalExpAuto.g:1070:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1074:1: ( ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) )
            // InternalExpAuto.g:1075:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            {
            // InternalExpAuto.g:1075:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            // InternalExpAuto.g:1076:2: ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* )
            {
            // InternalExpAuto.g:1076:2: ( ( rule__Model__ExperimentsAssignment_2 ) )
            // InternalExpAuto.g:1077:3: ( rule__Model__ExperimentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1078:3: ( rule__Model__ExperimentsAssignment_2 )
            // InternalExpAuto.g:1078:4: rule__Model__ExperimentsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Model__ExperimentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }

            // InternalExpAuto.g:1081:2: ( ( rule__Model__ExperimentsAssignment_2 )* )
            // InternalExpAuto.g:1082:3: ( rule__Model__ExperimentsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1083:3: ( rule__Model__ExperimentsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpAuto.g:1083:4: rule__Model__ExperimentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__ExperimentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalExpAuto.g:1093:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1097:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalExpAuto.g:1098:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalExpAuto.g:1105:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1109:1: ( ( 'import' ) )
            // InternalExpAuto.g:1110:1: ( 'import' )
            {
            // InternalExpAuto.g:1110:1: ( 'import' )
            // InternalExpAuto.g:1111:2: 'import'
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
    // InternalExpAuto.g:1120:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1124:1: ( rule__Import__Group__1__Impl )
            // InternalExpAuto.g:1125:2: rule__Import__Group__1__Impl
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
    // InternalExpAuto.g:1131:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1135:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalExpAuto.g:1136:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalExpAuto.g:1136:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalExpAuto.g:1137:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalExpAuto.g:1138:2: ( rule__Import__PathAssignment_1 )
            // InternalExpAuto.g:1138:3: rule__Import__PathAssignment_1
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
    // InternalExpAuto.g:1147:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1151:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalExpAuto.g:1152:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
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
    // InternalExpAuto.g:1159:1: rule__Datasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1163:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1164:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1164:1: ( 'datasource' )
            // InternalExpAuto.g:1165:2: 'datasource'
            {
             before(grammarAccess.getDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalExpAuto.g:1174:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1178:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalExpAuto.g:1179:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
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
    // InternalExpAuto.g:1186:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1190:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1191:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1191:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1192:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1193:2: ( rule__Datasource__NameAssignment_1 )
            // InternalExpAuto.g:1193:3: rule__Datasource__NameAssignment_1
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
    // InternalExpAuto.g:1201:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1205:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalExpAuto.g:1206:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
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
    // InternalExpAuto.g:1213:1: rule__Datasource__Group__2__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1217:1: ( ( ':' ) )
            // InternalExpAuto.g:1218:1: ( ':' )
            {
            // InternalExpAuto.g:1218:1: ( ':' )
            // InternalExpAuto.g:1219:2: ':'
            {
             before(grammarAccess.getDatasourceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalExpAuto.g:1228:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl rule__Datasource__Group__4 ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1232:1: ( rule__Datasource__Group__3__Impl rule__Datasource__Group__4 )
            // InternalExpAuto.g:1233:2: rule__Datasource__Group__3__Impl rule__Datasource__Group__4
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
    // InternalExpAuto.g:1240:1: rule__Datasource__Group__3__Impl : ( ( rule__Datasource__SourceTypeAssignment_3 ) ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1244:1: ( ( ( rule__Datasource__SourceTypeAssignment_3 ) ) )
            // InternalExpAuto.g:1245:1: ( ( rule__Datasource__SourceTypeAssignment_3 ) )
            {
            // InternalExpAuto.g:1245:1: ( ( rule__Datasource__SourceTypeAssignment_3 ) )
            // InternalExpAuto.g:1246:2: ( rule__Datasource__SourceTypeAssignment_3 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeAssignment_3()); 
            // InternalExpAuto.g:1247:2: ( rule__Datasource__SourceTypeAssignment_3 )
            // InternalExpAuto.g:1247:3: rule__Datasource__SourceTypeAssignment_3
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
    // InternalExpAuto.g:1255:1: rule__Datasource__Group__4 : rule__Datasource__Group__4__Impl ;
    public final void rule__Datasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1259:1: ( rule__Datasource__Group__4__Impl )
            // InternalExpAuto.g:1260:2: rule__Datasource__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalExpAuto.g:1266:1: rule__Datasource__Group__4__Impl : ( ( rule__Datasource__Group_4__0 )? ) ;
    public final void rule__Datasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1270:1: ( ( ( rule__Datasource__Group_4__0 )? ) )
            // InternalExpAuto.g:1271:1: ( ( rule__Datasource__Group_4__0 )? )
            {
            // InternalExpAuto.g:1271:1: ( ( rule__Datasource__Group_4__0 )? )
            // InternalExpAuto.g:1272:2: ( rule__Datasource__Group_4__0 )?
            {
             before(grammarAccess.getDatasourceAccess().getGroup_4()); 
            // InternalExpAuto.g:1273:2: ( rule__Datasource__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExpAuto.g:1273:3: rule__Datasource__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Datasource__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatasourceAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Datasource__Group_4__0"
    // InternalExpAuto.g:1282:1: rule__Datasource__Group_4__0 : rule__Datasource__Group_4__0__Impl rule__Datasource__Group_4__1 ;
    public final void rule__Datasource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1286:1: ( rule__Datasource__Group_4__0__Impl rule__Datasource__Group_4__1 )
            // InternalExpAuto.g:1287:2: rule__Datasource__Group_4__0__Impl rule__Datasource__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Datasource__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__0"


    // $ANTLR start "rule__Datasource__Group_4__0__Impl"
    // InternalExpAuto.g:1294:1: rule__Datasource__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Datasource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1298:1: ( ( '(' ) )
            // InternalExpAuto.g:1299:1: ( '(' )
            {
            // InternalExpAuto.g:1299:1: ( '(' )
            // InternalExpAuto.g:1300:2: '('
            {
             before(grammarAccess.getDatasourceAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__0__Impl"


    // $ANTLR start "rule__Datasource__Group_4__1"
    // InternalExpAuto.g:1309:1: rule__Datasource__Group_4__1 : rule__Datasource__Group_4__1__Impl rule__Datasource__Group_4__2 ;
    public final void rule__Datasource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1313:1: ( rule__Datasource__Group_4__1__Impl rule__Datasource__Group_4__2 )
            // InternalExpAuto.g:1314:2: rule__Datasource__Group_4__1__Impl rule__Datasource__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Datasource__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__1"


    // $ANTLR start "rule__Datasource__Group_4__1__Impl"
    // InternalExpAuto.g:1321:1: rule__Datasource__Group_4__1__Impl : ( ( rule__Datasource__SourceURIAssignment_4_1 ) ) ;
    public final void rule__Datasource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1325:1: ( ( ( rule__Datasource__SourceURIAssignment_4_1 ) ) )
            // InternalExpAuto.g:1326:1: ( ( rule__Datasource__SourceURIAssignment_4_1 ) )
            {
            // InternalExpAuto.g:1326:1: ( ( rule__Datasource__SourceURIAssignment_4_1 ) )
            // InternalExpAuto.g:1327:2: ( rule__Datasource__SourceURIAssignment_4_1 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceURIAssignment_4_1()); 
            // InternalExpAuto.g:1328:2: ( rule__Datasource__SourceURIAssignment_4_1 )
            // InternalExpAuto.g:1328:3: rule__Datasource__SourceURIAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__SourceURIAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getSourceURIAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__1__Impl"


    // $ANTLR start "rule__Datasource__Group_4__2"
    // InternalExpAuto.g:1336:1: rule__Datasource__Group_4__2 : rule__Datasource__Group_4__2__Impl ;
    public final void rule__Datasource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1340:1: ( rule__Datasource__Group_4__2__Impl )
            // InternalExpAuto.g:1341:2: rule__Datasource__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__2"


    // $ANTLR start "rule__Datasource__Group_4__2__Impl"
    // InternalExpAuto.g:1347:1: rule__Datasource__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Datasource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1351:1: ( ( ')' ) )
            // InternalExpAuto.g:1352:1: ( ')' )
            {
            // InternalExpAuto.g:1352:1: ( ')' )
            // InternalExpAuto.g:1353:2: ')'
            {
             before(grammarAccess.getDatasourceAccess().getRightParenthesisKeyword_4_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_4__2__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalExpAuto.g:1363:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1367:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalExpAuto.g:1368:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
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
    // InternalExpAuto.g:1375:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1379:1: ( ( 'experiment' ) )
            // InternalExpAuto.g:1380:1: ( 'experiment' )
            {
            // InternalExpAuto.g:1380:1: ( 'experiment' )
            // InternalExpAuto.g:1381:2: 'experiment'
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
    // InternalExpAuto.g:1390:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1394:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalExpAuto.g:1395:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
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
    // InternalExpAuto.g:1402:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1406:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1407:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1407:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalExpAuto.g:1408:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1409:2: ( rule__Experiment__NameAssignment_1 )
            // InternalExpAuto.g:1409:3: rule__Experiment__NameAssignment_1
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
    // InternalExpAuto.g:1417:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1421:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalExpAuto.g:1422:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
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
    // InternalExpAuto.g:1429:1: rule__Experiment__Group__2__Impl : ( ':' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1433:1: ( ( ':' ) )
            // InternalExpAuto.g:1434:1: ( ':' )
            {
            // InternalExpAuto.g:1434:1: ( ':' )
            // InternalExpAuto.g:1435:2: ':'
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
    // InternalExpAuto.g:1444:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1448:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalExpAuto.g:1449:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
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
    // InternalExpAuto.g:1456:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__DesignAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1460:1: ( ( ( rule__Experiment__DesignAssignment_3 ) ) )
            // InternalExpAuto.g:1461:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            {
            // InternalExpAuto.g:1461:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            // InternalExpAuto.g:1462:2: ( rule__Experiment__DesignAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 
            // InternalExpAuto.g:1463:2: ( rule__Experiment__DesignAssignment_3 )
            // InternalExpAuto.g:1463:3: rule__Experiment__DesignAssignment_3
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
    // InternalExpAuto.g:1471:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1475:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalExpAuto.g:1476:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
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
    // InternalExpAuto.g:1483:1: rule__Experiment__Group__4__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1487:1: ( ( '{' ) )
            // InternalExpAuto.g:1488:1: ( '{' )
            {
            // InternalExpAuto.g:1488:1: ( '{' )
            // InternalExpAuto.g:1489:2: '{'
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
    // InternalExpAuto.g:1498:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1502:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalExpAuto.g:1503:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
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
    // InternalExpAuto.g:1510:1: rule__Experiment__Group__5__Impl : ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1514:1: ( ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) )
            // InternalExpAuto.g:1515:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            {
            // InternalExpAuto.g:1515:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            // InternalExpAuto.g:1516:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 
            // InternalExpAuto.g:1517:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            // InternalExpAuto.g:1517:3: rule__Experiment__ExperimentSpecificationsAssignment_5
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
    // InternalExpAuto.g:1525:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1529:1: ( rule__Experiment__Group__6__Impl )
            // InternalExpAuto.g:1530:2: rule__Experiment__Group__6__Impl
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
    // InternalExpAuto.g:1536:1: rule__Experiment__Group__6__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1540:1: ( ( '}' ) )
            // InternalExpAuto.g:1541:1: ( '}' )
            {
            // InternalExpAuto.g:1541:1: ( '}' )
            // InternalExpAuto.g:1542:2: '}'
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
    // InternalExpAuto.g:1552:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1556:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalExpAuto.g:1557:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalExpAuto.g:1564:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1568:1: ( ( 'description' ) )
            // InternalExpAuto.g:1569:1: ( 'description' )
            {
            // InternalExpAuto.g:1569:1: ( 'description' )
            // InternalExpAuto.g:1570:2: 'description'
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
    // InternalExpAuto.g:1579:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1583:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalExpAuto.g:1584:2: rule__Description__Group__1__Impl rule__Description__Group__2
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
    // InternalExpAuto.g:1591:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1595:1: ( ( '=' ) )
            // InternalExpAuto.g:1596:1: ( '=' )
            {
            // InternalExpAuto.g:1596:1: ( '=' )
            // InternalExpAuto.g:1597:2: '='
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
    // InternalExpAuto.g:1606:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1610:1: ( rule__Description__Group__2__Impl )
            // InternalExpAuto.g:1611:2: rule__Description__Group__2__Impl
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
    // InternalExpAuto.g:1617:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1621:1: ( ( ( rule__Description__DescriptionAssignment_2 ) ) )
            // InternalExpAuto.g:1622:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            {
            // InternalExpAuto.g:1622:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            // InternalExpAuto.g:1623:2: ( rule__Description__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalExpAuto.g:1624:2: ( rule__Description__DescriptionAssignment_2 )
            // InternalExpAuto.g:1624:3: rule__Description__DescriptionAssignment_2
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
    // InternalExpAuto.g:1633:1: rule__InitialModel__Group__0 : rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 ;
    public final void rule__InitialModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1637:1: ( rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 )
            // InternalExpAuto.g:1638:2: rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1
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
    // InternalExpAuto.g:1645:1: rule__InitialModel__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1649:1: ( ( 'initial' ) )
            // InternalExpAuto.g:1650:1: ( 'initial' )
            {
            // InternalExpAuto.g:1650:1: ( 'initial' )
            // InternalExpAuto.g:1651:2: 'initial'
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
    // InternalExpAuto.g:1660:1: rule__InitialModel__Group__1 : rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 ;
    public final void rule__InitialModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1664:1: ( rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 )
            // InternalExpAuto.g:1665:2: rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2
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
    // InternalExpAuto.g:1672:1: rule__InitialModel__Group__1__Impl : ( '=' ) ;
    public final void rule__InitialModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1676:1: ( ( '=' ) )
            // InternalExpAuto.g:1677:1: ( '=' )
            {
            // InternalExpAuto.g:1677:1: ( '=' )
            // InternalExpAuto.g:1678:2: '='
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
    // InternalExpAuto.g:1687:1: rule__InitialModel__Group__2 : rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 ;
    public final void rule__InitialModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1691:1: ( rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 )
            // InternalExpAuto.g:1692:2: rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3
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
    // InternalExpAuto.g:1699:1: rule__InitialModel__Group__2__Impl : ( ( rule__InitialModel__ModeltypAssignment_2 ) ) ;
    public final void rule__InitialModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1703:1: ( ( ( rule__InitialModel__ModeltypAssignment_2 ) ) )
            // InternalExpAuto.g:1704:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            {
            // InternalExpAuto.g:1704:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            // InternalExpAuto.g:1705:2: ( rule__InitialModel__ModeltypAssignment_2 )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 
            // InternalExpAuto.g:1706:2: ( rule__InitialModel__ModeltypAssignment_2 )
            // InternalExpAuto.g:1706:3: rule__InitialModel__ModeltypAssignment_2
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
    // InternalExpAuto.g:1714:1: rule__InitialModel__Group__3 : rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 ;
    public final void rule__InitialModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1718:1: ( rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 )
            // InternalExpAuto.g:1719:2: rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4
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
    // InternalExpAuto.g:1726:1: rule__InitialModel__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1730:1: ( ( '{' ) )
            // InternalExpAuto.g:1731:1: ( '{' )
            {
            // InternalExpAuto.g:1731:1: ( '{' )
            // InternalExpAuto.g:1732:2: '{'
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
    // InternalExpAuto.g:1741:1: rule__InitialModel__Group__4 : rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 ;
    public final void rule__InitialModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1745:1: ( rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 )
            // InternalExpAuto.g:1746:2: rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5
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
    // InternalExpAuto.g:1753:1: rule__InitialModel__Group__4__Impl : ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) ;
    public final void rule__InitialModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1757:1: ( ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) )
            // InternalExpAuto.g:1758:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            {
            // InternalExpAuto.g:1758:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            // InternalExpAuto.g:1759:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 
            // InternalExpAuto.g:1760:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            // InternalExpAuto.g:1760:3: rule__InitialModel__InitSpecificationsAssignment_4
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
    // InternalExpAuto.g:1768:1: rule__InitialModel__Group__5 : rule__InitialModel__Group__5__Impl ;
    public final void rule__InitialModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1772:1: ( rule__InitialModel__Group__5__Impl )
            // InternalExpAuto.g:1773:2: rule__InitialModel__Group__5__Impl
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
    // InternalExpAuto.g:1779:1: rule__InitialModel__Group__5__Impl : ( '}' ) ;
    public final void rule__InitialModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1783:1: ( ( '}' ) )
            // InternalExpAuto.g:1784:1: ( '}' )
            {
            // InternalExpAuto.g:1784:1: ( '}' )
            // InternalExpAuto.g:1785:2: '}'
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
    // InternalExpAuto.g:1795:1: rule__AllocationModel__Group__0 : rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 ;
    public final void rule__AllocationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1799:1: ( rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 )
            // InternalExpAuto.g:1800:2: rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1
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
    // InternalExpAuto.g:1807:1: rule__AllocationModel__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__AllocationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1811:1: ( ( 'allocation' ) )
            // InternalExpAuto.g:1812:1: ( 'allocation' )
            {
            // InternalExpAuto.g:1812:1: ( 'allocation' )
            // InternalExpAuto.g:1813:2: 'allocation'
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
    // InternalExpAuto.g:1822:1: rule__AllocationModel__Group__1 : rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 ;
    public final void rule__AllocationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1826:1: ( rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 )
            // InternalExpAuto.g:1827:2: rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2
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
    // InternalExpAuto.g:1834:1: rule__AllocationModel__Group__1__Impl : ( '=' ) ;
    public final void rule__AllocationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1838:1: ( ( '=' ) )
            // InternalExpAuto.g:1839:1: ( '=' )
            {
            // InternalExpAuto.g:1839:1: ( '=' )
            // InternalExpAuto.g:1840:2: '='
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
    // InternalExpAuto.g:1849:1: rule__AllocationModel__Group__2 : rule__AllocationModel__Group__2__Impl ;
    public final void rule__AllocationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1853:1: ( rule__AllocationModel__Group__2__Impl )
            // InternalExpAuto.g:1854:2: rule__AllocationModel__Group__2__Impl
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
    // InternalExpAuto.g:1860:1: rule__AllocationModel__Group__2__Impl : ( ( rule__AllocationModel__AllocationAssignment_2 ) ) ;
    public final void rule__AllocationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1864:1: ( ( ( rule__AllocationModel__AllocationAssignment_2 ) ) )
            // InternalExpAuto.g:1865:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            {
            // InternalExpAuto.g:1865:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            // InternalExpAuto.g:1866:2: ( rule__AllocationModel__AllocationAssignment_2 )
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 
            // InternalExpAuto.g:1867:2: ( rule__AllocationModel__AllocationAssignment_2 )
            // InternalExpAuto.g:1867:3: rule__AllocationModel__AllocationAssignment_2
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
    // InternalExpAuto.g:1876:1: rule__UsageModel__Group__0 : rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 ;
    public final void rule__UsageModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1880:1: ( rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 )
            // InternalExpAuto.g:1881:2: rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1
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
    // InternalExpAuto.g:1888:1: rule__UsageModel__Group__0__Impl : ( 'usageModel' ) ;
    public final void rule__UsageModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1892:1: ( ( 'usageModel' ) )
            // InternalExpAuto.g:1893:1: ( 'usageModel' )
            {
            // InternalExpAuto.g:1893:1: ( 'usageModel' )
            // InternalExpAuto.g:1894:2: 'usageModel'
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
    // InternalExpAuto.g:1903:1: rule__UsageModel__Group__1 : rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 ;
    public final void rule__UsageModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1907:1: ( rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 )
            // InternalExpAuto.g:1908:2: rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2
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
    // InternalExpAuto.g:1915:1: rule__UsageModel__Group__1__Impl : ( '=' ) ;
    public final void rule__UsageModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1919:1: ( ( '=' ) )
            // InternalExpAuto.g:1920:1: ( '=' )
            {
            // InternalExpAuto.g:1920:1: ( '=' )
            // InternalExpAuto.g:1921:2: '='
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
    // InternalExpAuto.g:1930:1: rule__UsageModel__Group__2 : rule__UsageModel__Group__2__Impl ;
    public final void rule__UsageModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1934:1: ( rule__UsageModel__Group__2__Impl )
            // InternalExpAuto.g:1935:2: rule__UsageModel__Group__2__Impl
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
    // InternalExpAuto.g:1941:1: rule__UsageModel__Group__2__Impl : ( ( rule__UsageModel__UsageModelAssignment_2 ) ) ;
    public final void rule__UsageModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1945:1: ( ( ( rule__UsageModel__UsageModelAssignment_2 ) ) )
            // InternalExpAuto.g:1946:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            {
            // InternalExpAuto.g:1946:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            // InternalExpAuto.g:1947:2: ( rule__UsageModel__UsageModelAssignment_2 )
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 
            // InternalExpAuto.g:1948:2: ( rule__UsageModel__UsageModelAssignment_2 )
            // InternalExpAuto.g:1948:3: rule__UsageModel__UsageModelAssignment_2
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
    // InternalExpAuto.g:1957:1: rule__MiddlewareRepository__Group__0 : rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 ;
    public final void rule__MiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1961:1: ( rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 )
            // InternalExpAuto.g:1962:2: rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1
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
    // InternalExpAuto.g:1969:1: rule__MiddlewareRepository__Group__0__Impl : ( 'middlewareRepository' ) ;
    public final void rule__MiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1973:1: ( ( 'middlewareRepository' ) )
            // InternalExpAuto.g:1974:1: ( 'middlewareRepository' )
            {
            // InternalExpAuto.g:1974:1: ( 'middlewareRepository' )
            // InternalExpAuto.g:1975:2: 'middlewareRepository'
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
    // InternalExpAuto.g:1984:1: rule__MiddlewareRepository__Group__1 : rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 ;
    public final void rule__MiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1988:1: ( rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 )
            // InternalExpAuto.g:1989:2: rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2
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
    // InternalExpAuto.g:1996:1: rule__MiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2000:1: ( ( '=' ) )
            // InternalExpAuto.g:2001:1: ( '=' )
            {
            // InternalExpAuto.g:2001:1: ( '=' )
            // InternalExpAuto.g:2002:2: '='
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
    // InternalExpAuto.g:2011:1: rule__MiddlewareRepository__Group__2 : rule__MiddlewareRepository__Group__2__Impl ;
    public final void rule__MiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2015:1: ( rule__MiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2016:2: rule__MiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2022:1: rule__MiddlewareRepository__Group__2__Impl : ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) ;
    public final void rule__MiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2026:1: ( ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2027:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2027:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2028:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2029:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            // InternalExpAuto.g:2029:3: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2
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
    // InternalExpAuto.g:2038:1: rule__EventMiddlewareRepository__Group__0 : rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 ;
    public final void rule__EventMiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2042:1: ( rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2043:2: rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1
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
    // InternalExpAuto.g:2050:1: rule__EventMiddlewareRepository__Group__0__Impl : ( 'eventMiddlewareRepository' ) ;
    public final void rule__EventMiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2054:1: ( ( 'eventMiddlewareRepository' ) )
            // InternalExpAuto.g:2055:1: ( 'eventMiddlewareRepository' )
            {
            // InternalExpAuto.g:2055:1: ( 'eventMiddlewareRepository' )
            // InternalExpAuto.g:2056:2: 'eventMiddlewareRepository'
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
    // InternalExpAuto.g:2065:1: rule__EventMiddlewareRepository__Group__1 : rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 ;
    public final void rule__EventMiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2069:1: ( rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2070:2: rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2
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
    // InternalExpAuto.g:2077:1: rule__EventMiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__EventMiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2081:1: ( ( '=' ) )
            // InternalExpAuto.g:2082:1: ( '=' )
            {
            // InternalExpAuto.g:2082:1: ( '=' )
            // InternalExpAuto.g:2083:2: '='
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
    // InternalExpAuto.g:2092:1: rule__EventMiddlewareRepository__Group__2 : rule__EventMiddlewareRepository__Group__2__Impl ;
    public final void rule__EventMiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2096:1: ( rule__EventMiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2097:2: rule__EventMiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2103:1: rule__EventMiddlewareRepository__Group__2__Impl : ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) ;
    public final void rule__EventMiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2107:1: ( ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2108:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2108:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2109:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2110:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            // InternalExpAuto.g:2110:3: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2
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
    // InternalExpAuto.g:2119:1: rule__MonitorRepository__Group__0 : rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 ;
    public final void rule__MonitorRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2123:1: ( rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 )
            // InternalExpAuto.g:2124:2: rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1
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
    // InternalExpAuto.g:2131:1: rule__MonitorRepository__Group__0__Impl : ( 'monitorRepository' ) ;
    public final void rule__MonitorRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2135:1: ( ( 'monitorRepository' ) )
            // InternalExpAuto.g:2136:1: ( 'monitorRepository' )
            {
            // InternalExpAuto.g:2136:1: ( 'monitorRepository' )
            // InternalExpAuto.g:2137:2: 'monitorRepository'
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
    // InternalExpAuto.g:2146:1: rule__MonitorRepository__Group__1 : rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 ;
    public final void rule__MonitorRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2150:1: ( rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 )
            // InternalExpAuto.g:2151:2: rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2
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
    // InternalExpAuto.g:2158:1: rule__MonitorRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MonitorRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2162:1: ( ( '=' ) )
            // InternalExpAuto.g:2163:1: ( '=' )
            {
            // InternalExpAuto.g:2163:1: ( '=' )
            // InternalExpAuto.g:2164:2: '='
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
    // InternalExpAuto.g:2173:1: rule__MonitorRepository__Group__2 : rule__MonitorRepository__Group__2__Impl ;
    public final void rule__MonitorRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2177:1: ( rule__MonitorRepository__Group__2__Impl )
            // InternalExpAuto.g:2178:2: rule__MonitorRepository__Group__2__Impl
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
    // InternalExpAuto.g:2184:1: rule__MonitorRepository__Group__2__Impl : ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) ;
    public final void rule__MonitorRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2188:1: ( ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2189:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2189:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2190:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 
            // InternalExpAuto.g:2191:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            // InternalExpAuto.g:2191:3: rule__MonitorRepository__MonitorRepositoryAssignment_2
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
    // InternalExpAuto.g:2200:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2204:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // InternalExpAuto.g:2205:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
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
    // InternalExpAuto.g:2212:1: rule__Variation__Group__0__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2216:1: ( ( 'variation' ) )
            // InternalExpAuto.g:2217:1: ( 'variation' )
            {
            // InternalExpAuto.g:2217:1: ( 'variation' )
            // InternalExpAuto.g:2218:2: 'variation'
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
    // InternalExpAuto.g:2227:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2231:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // InternalExpAuto.g:2232:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
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
    // InternalExpAuto.g:2239:1: rule__Variation__Group__1__Impl : ( '=' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2243:1: ( ( '=' ) )
            // InternalExpAuto.g:2244:1: ( '=' )
            {
            // InternalExpAuto.g:2244:1: ( '=' )
            // InternalExpAuto.g:2245:2: '='
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
    // InternalExpAuto.g:2254:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2258:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // InternalExpAuto.g:2259:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
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
    // InternalExpAuto.g:2266:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__VariationTypAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2270:1: ( ( ( rule__Variation__VariationTypAssignment_2 ) ) )
            // InternalExpAuto.g:2271:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            {
            // InternalExpAuto.g:2271:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            // InternalExpAuto.g:2272:2: ( rule__Variation__VariationTypAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 
            // InternalExpAuto.g:2273:2: ( rule__Variation__VariationTypAssignment_2 )
            // InternalExpAuto.g:2273:3: rule__Variation__VariationTypAssignment_2
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
    // InternalExpAuto.g:2281:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl rule__Variation__Group__4 ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2285:1: ( rule__Variation__Group__3__Impl rule__Variation__Group__4 )
            // InternalExpAuto.g:2286:2: rule__Variation__Group__3__Impl rule__Variation__Group__4
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
    // InternalExpAuto.g:2293:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__NameAssignment_3 ) ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2297:1: ( ( ( rule__Variation__NameAssignment_3 ) ) )
            // InternalExpAuto.g:2298:1: ( ( rule__Variation__NameAssignment_3 ) )
            {
            // InternalExpAuto.g:2298:1: ( ( rule__Variation__NameAssignment_3 ) )
            // InternalExpAuto.g:2299:2: ( rule__Variation__NameAssignment_3 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_3()); 
            // InternalExpAuto.g:2300:2: ( rule__Variation__NameAssignment_3 )
            // InternalExpAuto.g:2300:3: rule__Variation__NameAssignment_3
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
    // InternalExpAuto.g:2308:1: rule__Variation__Group__4 : rule__Variation__Group__4__Impl rule__Variation__Group__5 ;
    public final void rule__Variation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2312:1: ( rule__Variation__Group__4__Impl rule__Variation__Group__5 )
            // InternalExpAuto.g:2313:2: rule__Variation__Group__4__Impl rule__Variation__Group__5
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
    // InternalExpAuto.g:2320:1: rule__Variation__Group__4__Impl : ( '{' ) ;
    public final void rule__Variation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2324:1: ( ( '{' ) )
            // InternalExpAuto.g:2325:1: ( '{' )
            {
            // InternalExpAuto.g:2325:1: ( '{' )
            // InternalExpAuto.g:2326:2: '{'
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
    // InternalExpAuto.g:2335:1: rule__Variation__Group__5 : rule__Variation__Group__5__Impl rule__Variation__Group__6 ;
    public final void rule__Variation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2339:1: ( rule__Variation__Group__5__Impl rule__Variation__Group__6 )
            // InternalExpAuto.g:2340:2: rule__Variation__Group__5__Impl rule__Variation__Group__6
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
    // InternalExpAuto.g:2347:1: rule__Variation__Group__5__Impl : ( 'target' ) ;
    public final void rule__Variation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2351:1: ( ( 'target' ) )
            // InternalExpAuto.g:2352:1: ( 'target' )
            {
            // InternalExpAuto.g:2352:1: ( 'target' )
            // InternalExpAuto.g:2353:2: 'target'
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
    // InternalExpAuto.g:2362:1: rule__Variation__Group__6 : rule__Variation__Group__6__Impl rule__Variation__Group__7 ;
    public final void rule__Variation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2366:1: ( rule__Variation__Group__6__Impl rule__Variation__Group__7 )
            // InternalExpAuto.g:2367:2: rule__Variation__Group__6__Impl rule__Variation__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalExpAuto.g:2374:1: rule__Variation__Group__6__Impl : ( '=' ) ;
    public final void rule__Variation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2378:1: ( ( '=' ) )
            // InternalExpAuto.g:2379:1: ( '=' )
            {
            // InternalExpAuto.g:2379:1: ( '=' )
            // InternalExpAuto.g:2380:2: '='
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
    // InternalExpAuto.g:2389:1: rule__Variation__Group__7 : rule__Variation__Group__7__Impl rule__Variation__Group__8 ;
    public final void rule__Variation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2393:1: ( rule__Variation__Group__7__Impl rule__Variation__Group__8 )
            // InternalExpAuto.g:2394:2: rule__Variation__Group__7__Impl rule__Variation__Group__8
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
    // InternalExpAuto.g:2401:1: rule__Variation__Group__7__Impl : ( ( rule__Variation__TargetAssignment_7 ) ) ;
    public final void rule__Variation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2405:1: ( ( ( rule__Variation__TargetAssignment_7 ) ) )
            // InternalExpAuto.g:2406:1: ( ( rule__Variation__TargetAssignment_7 ) )
            {
            // InternalExpAuto.g:2406:1: ( ( rule__Variation__TargetAssignment_7 ) )
            // InternalExpAuto.g:2407:2: ( rule__Variation__TargetAssignment_7 )
            {
             before(grammarAccess.getVariationAccess().getTargetAssignment_7()); 
            // InternalExpAuto.g:2408:2: ( rule__Variation__TargetAssignment_7 )
            // InternalExpAuto.g:2408:3: rule__Variation__TargetAssignment_7
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
    // InternalExpAuto.g:2416:1: rule__Variation__Group__8 : rule__Variation__Group__8__Impl rule__Variation__Group__9 ;
    public final void rule__Variation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2420:1: ( rule__Variation__Group__8__Impl rule__Variation__Group__9 )
            // InternalExpAuto.g:2421:2: rule__Variation__Group__8__Impl rule__Variation__Group__9
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
    // InternalExpAuto.g:2428:1: rule__Variation__Group__8__Impl : ( 'maxVariations' ) ;
    public final void rule__Variation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2432:1: ( ( 'maxVariations' ) )
            // InternalExpAuto.g:2433:1: ( 'maxVariations' )
            {
            // InternalExpAuto.g:2433:1: ( 'maxVariations' )
            // InternalExpAuto.g:2434:2: 'maxVariations'
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
    // InternalExpAuto.g:2443:1: rule__Variation__Group__9 : rule__Variation__Group__9__Impl rule__Variation__Group__10 ;
    public final void rule__Variation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2447:1: ( rule__Variation__Group__9__Impl rule__Variation__Group__10 )
            // InternalExpAuto.g:2448:2: rule__Variation__Group__9__Impl rule__Variation__Group__10
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
    // InternalExpAuto.g:2455:1: rule__Variation__Group__9__Impl : ( '=' ) ;
    public final void rule__Variation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2459:1: ( ( '=' ) )
            // InternalExpAuto.g:2460:1: ( '=' )
            {
            // InternalExpAuto.g:2460:1: ( '=' )
            // InternalExpAuto.g:2461:2: '='
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
    // InternalExpAuto.g:2470:1: rule__Variation__Group__10 : rule__Variation__Group__10__Impl rule__Variation__Group__11 ;
    public final void rule__Variation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2474:1: ( rule__Variation__Group__10__Impl rule__Variation__Group__11 )
            // InternalExpAuto.g:2475:2: rule__Variation__Group__10__Impl rule__Variation__Group__11
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
    // InternalExpAuto.g:2482:1: rule__Variation__Group__10__Impl : ( ( rule__Variation__MaxVariationsAssignment_10 ) ) ;
    public final void rule__Variation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2486:1: ( ( ( rule__Variation__MaxVariationsAssignment_10 ) ) )
            // InternalExpAuto.g:2487:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            {
            // InternalExpAuto.g:2487:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            // InternalExpAuto.g:2488:2: ( rule__Variation__MaxVariationsAssignment_10 )
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 
            // InternalExpAuto.g:2489:2: ( rule__Variation__MaxVariationsAssignment_10 )
            // InternalExpAuto.g:2489:3: rule__Variation__MaxVariationsAssignment_10
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
    // InternalExpAuto.g:2497:1: rule__Variation__Group__11 : rule__Variation__Group__11__Impl rule__Variation__Group__12 ;
    public final void rule__Variation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2501:1: ( rule__Variation__Group__11__Impl rule__Variation__Group__12 )
            // InternalExpAuto.g:2502:2: rule__Variation__Group__11__Impl rule__Variation__Group__12
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
    // InternalExpAuto.g:2509:1: rule__Variation__Group__11__Impl : ( 'values' ) ;
    public final void rule__Variation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2513:1: ( ( 'values' ) )
            // InternalExpAuto.g:2514:1: ( 'values' )
            {
            // InternalExpAuto.g:2514:1: ( 'values' )
            // InternalExpAuto.g:2515:2: 'values'
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
    // InternalExpAuto.g:2524:1: rule__Variation__Group__12 : rule__Variation__Group__12__Impl rule__Variation__Group__13 ;
    public final void rule__Variation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2528:1: ( rule__Variation__Group__12__Impl rule__Variation__Group__13 )
            // InternalExpAuto.g:2529:2: rule__Variation__Group__12__Impl rule__Variation__Group__13
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
    // InternalExpAuto.g:2536:1: rule__Variation__Group__12__Impl : ( '=' ) ;
    public final void rule__Variation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2540:1: ( ( '=' ) )
            // InternalExpAuto.g:2541:1: ( '=' )
            {
            // InternalExpAuto.g:2541:1: ( '=' )
            // InternalExpAuto.g:2542:2: '='
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
    // InternalExpAuto.g:2551:1: rule__Variation__Group__13 : rule__Variation__Group__13__Impl rule__Variation__Group__14 ;
    public final void rule__Variation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2555:1: ( rule__Variation__Group__13__Impl rule__Variation__Group__14 )
            // InternalExpAuto.g:2556:2: rule__Variation__Group__13__Impl rule__Variation__Group__14
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
    // InternalExpAuto.g:2563:1: rule__Variation__Group__13__Impl : ( ( rule__Variation__ValueProviderAssignment_13 ) ) ;
    public final void rule__Variation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2567:1: ( ( ( rule__Variation__ValueProviderAssignment_13 ) ) )
            // InternalExpAuto.g:2568:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            {
            // InternalExpAuto.g:2568:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            // InternalExpAuto.g:2569:2: ( rule__Variation__ValueProviderAssignment_13 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 
            // InternalExpAuto.g:2570:2: ( rule__Variation__ValueProviderAssignment_13 )
            // InternalExpAuto.g:2570:3: rule__Variation__ValueProviderAssignment_13
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
    // InternalExpAuto.g:2578:1: rule__Variation__Group__14 : rule__Variation__Group__14__Impl ;
    public final void rule__Variation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2582:1: ( rule__Variation__Group__14__Impl )
            // InternalExpAuto.g:2583:2: rule__Variation__Group__14__Impl
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
    // InternalExpAuto.g:2589:1: rule__Variation__Group__14__Impl : ( '}' ) ;
    public final void rule__Variation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2593:1: ( ( '}' ) )
            // InternalExpAuto.g:2594:1: ( '}' )
            {
            // InternalExpAuto.g:2594:1: ( '}' )
            // InternalExpAuto.g:2595:2: '}'
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
    // InternalExpAuto.g:2605:1: rule__NestedIntervalsValueProvider__Group_0__0 : rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2609:1: ( rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 )
            // InternalExpAuto.g:2610:2: rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1
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
    // InternalExpAuto.g:2617:1: rule__NestedIntervalsValueProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2621:1: ( ( '[' ) )
            // InternalExpAuto.g:2622:1: ( '[' )
            {
            // InternalExpAuto.g:2622:1: ( '[' )
            // InternalExpAuto.g:2623:2: '['
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
    // InternalExpAuto.g:2632:1: rule__NestedIntervalsValueProvider__Group_0__1 : rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2636:1: ( rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 )
            // InternalExpAuto.g:2637:2: rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2
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
    // InternalExpAuto.g:2644:1: rule__NestedIntervalsValueProvider__Group_0__1__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2648:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) )
            // InternalExpAuto.g:2649:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2649:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            // InternalExpAuto.g:2650:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 
            // InternalExpAuto.g:2651:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            // InternalExpAuto.g:2651:3: rule__NestedIntervalsValueProvider__MinAssignment_0_1
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
    // InternalExpAuto.g:2659:1: rule__NestedIntervalsValueProvider__Group_0__2 : rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2663:1: ( rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 )
            // InternalExpAuto.g:2664:2: rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3
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
    // InternalExpAuto.g:2671:1: rule__NestedIntervalsValueProvider__Group_0__2__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2675:1: ( ( ',' ) )
            // InternalExpAuto.g:2676:1: ( ',' )
            {
            // InternalExpAuto.g:2676:1: ( ',' )
            // InternalExpAuto.g:2677:2: ','
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
    // InternalExpAuto.g:2686:1: rule__NestedIntervalsValueProvider__Group_0__3 : rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2690:1: ( rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 )
            // InternalExpAuto.g:2691:2: rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4
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
    // InternalExpAuto.g:2698:1: rule__NestedIntervalsValueProvider__Group_0__3__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2702:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) )
            // InternalExpAuto.g:2703:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            {
            // InternalExpAuto.g:2703:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            // InternalExpAuto.g:2704:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 
            // InternalExpAuto.g:2705:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            // InternalExpAuto.g:2705:3: rule__NestedIntervalsValueProvider__MaxAssignment_0_3
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
    // InternalExpAuto.g:2713:1: rule__NestedIntervalsValueProvider__Group_0__4 : rule__NestedIntervalsValueProvider__Group_0__4__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2717:1: ( rule__NestedIntervalsValueProvider__Group_0__4__Impl )
            // InternalExpAuto.g:2718:2: rule__NestedIntervalsValueProvider__Group_0__4__Impl
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
    // InternalExpAuto.g:2724:1: rule__NestedIntervalsValueProvider__Group_0__4__Impl : ( ']' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2728:1: ( ( ']' ) )
            // InternalExpAuto.g:2729:1: ( ']' )
            {
            // InternalExpAuto.g:2729:1: ( ']' )
            // InternalExpAuto.g:2730:2: ']'
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
    // InternalExpAuto.g:2740:1: rule__NestedIntervalsValueProvider__Group_1__0 : rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2744:1: ( rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 )
            // InternalExpAuto.g:2745:2: rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1
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
    // InternalExpAuto.g:2752:1: rule__NestedIntervalsValueProvider__Group_1__0__Impl : ( 'nestedIntervall' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2756:1: ( ( 'nestedIntervall' ) )
            // InternalExpAuto.g:2757:1: ( 'nestedIntervall' )
            {
            // InternalExpAuto.g:2757:1: ( 'nestedIntervall' )
            // InternalExpAuto.g:2758:2: 'nestedIntervall'
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
    // InternalExpAuto.g:2767:1: rule__NestedIntervalsValueProvider__Group_1__1 : rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2771:1: ( rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 )
            // InternalExpAuto.g:2772:2: rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2
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
    // InternalExpAuto.g:2779:1: rule__NestedIntervalsValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2783:1: ( ( '(' ) )
            // InternalExpAuto.g:2784:1: ( '(' )
            {
            // InternalExpAuto.g:2784:1: ( '(' )
            // InternalExpAuto.g:2785:2: '('
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
    // InternalExpAuto.g:2794:1: rule__NestedIntervalsValueProvider__Group_1__2 : rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2798:1: ( rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 )
            // InternalExpAuto.g:2799:2: rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3
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
    // InternalExpAuto.g:2806:1: rule__NestedIntervalsValueProvider__Group_1__2__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2810:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) )
            // InternalExpAuto.g:2811:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            {
            // InternalExpAuto.g:2811:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            // InternalExpAuto.g:2812:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 
            // InternalExpAuto.g:2813:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            // InternalExpAuto.g:2813:3: rule__NestedIntervalsValueProvider__MinAssignment_1_2
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
    // InternalExpAuto.g:2821:1: rule__NestedIntervalsValueProvider__Group_1__3 : rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2825:1: ( rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 )
            // InternalExpAuto.g:2826:2: rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4
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
    // InternalExpAuto.g:2833:1: rule__NestedIntervalsValueProvider__Group_1__3__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2837:1: ( ( ',' ) )
            // InternalExpAuto.g:2838:1: ( ',' )
            {
            // InternalExpAuto.g:2838:1: ( ',' )
            // InternalExpAuto.g:2839:2: ','
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
    // InternalExpAuto.g:2848:1: rule__NestedIntervalsValueProvider__Group_1__4 : rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2852:1: ( rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 )
            // InternalExpAuto.g:2853:2: rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5
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
    // InternalExpAuto.g:2860:1: rule__NestedIntervalsValueProvider__Group_1__4__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2864:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) )
            // InternalExpAuto.g:2865:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            {
            // InternalExpAuto.g:2865:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            // InternalExpAuto.g:2866:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 
            // InternalExpAuto.g:2867:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            // InternalExpAuto.g:2867:3: rule__NestedIntervalsValueProvider__MaxAssignment_1_4
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
    // InternalExpAuto.g:2875:1: rule__NestedIntervalsValueProvider__Group_1__5 : rule__NestedIntervalsValueProvider__Group_1__5__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2879:1: ( rule__NestedIntervalsValueProvider__Group_1__5__Impl )
            // InternalExpAuto.g:2880:2: rule__NestedIntervalsValueProvider__Group_1__5__Impl
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
    // InternalExpAuto.g:2886:1: rule__NestedIntervalsValueProvider__Group_1__5__Impl : ( ')' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2890:1: ( ( ')' ) )
            // InternalExpAuto.g:2891:1: ( ')' )
            {
            // InternalExpAuto.g:2891:1: ( ')' )
            // InternalExpAuto.g:2892:2: ')'
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
    // InternalExpAuto.g:2902:1: rule__SetValueProvider__Group_0__0 : rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 ;
    public final void rule__SetValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2906:1: ( rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 )
            // InternalExpAuto.g:2907:2: rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1
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
    // InternalExpAuto.g:2914:1: rule__SetValueProvider__Group_0__0__Impl : ( '{' ) ;
    public final void rule__SetValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2918:1: ( ( '{' ) )
            // InternalExpAuto.g:2919:1: ( '{' )
            {
            // InternalExpAuto.g:2919:1: ( '{' )
            // InternalExpAuto.g:2920:2: '{'
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
    // InternalExpAuto.g:2929:1: rule__SetValueProvider__Group_0__1 : rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 ;
    public final void rule__SetValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2933:1: ( rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 )
            // InternalExpAuto.g:2934:2: rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2
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
    // InternalExpAuto.g:2941:1: rule__SetValueProvider__Group_0__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) ;
    public final void rule__SetValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2945:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) )
            // InternalExpAuto.g:2946:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2946:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            // InternalExpAuto.g:2947:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 
            // InternalExpAuto.g:2948:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            // InternalExpAuto.g:2948:3: rule__SetValueProvider__ValuesAssignment_0_1
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
    // InternalExpAuto.g:2956:1: rule__SetValueProvider__Group_0__2 : rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 ;
    public final void rule__SetValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2960:1: ( rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 )
            // InternalExpAuto.g:2961:2: rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3
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
    // InternalExpAuto.g:2968:1: rule__SetValueProvider__Group_0__2__Impl : ( ( rule__SetValueProvider__Group_0_2__0 )* ) ;
    public final void rule__SetValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2972:1: ( ( ( rule__SetValueProvider__Group_0_2__0 )* ) )
            // InternalExpAuto.g:2973:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            {
            // InternalExpAuto.g:2973:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            // InternalExpAuto.g:2974:2: ( rule__SetValueProvider__Group_0_2__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 
            // InternalExpAuto.g:2975:2: ( rule__SetValueProvider__Group_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpAuto.g:2975:3: rule__SetValueProvider__Group_0_2__0
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
    // InternalExpAuto.g:2983:1: rule__SetValueProvider__Group_0__3 : rule__SetValueProvider__Group_0__3__Impl ;
    public final void rule__SetValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2987:1: ( rule__SetValueProvider__Group_0__3__Impl )
            // InternalExpAuto.g:2988:2: rule__SetValueProvider__Group_0__3__Impl
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
    // InternalExpAuto.g:2994:1: rule__SetValueProvider__Group_0__3__Impl : ( '}' ) ;
    public final void rule__SetValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2998:1: ( ( '}' ) )
            // InternalExpAuto.g:2999:1: ( '}' )
            {
            // InternalExpAuto.g:2999:1: ( '}' )
            // InternalExpAuto.g:3000:2: '}'
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
    // InternalExpAuto.g:3010:1: rule__SetValueProvider__Group_0_2__0 : rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 ;
    public final void rule__SetValueProvider__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3014:1: ( rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 )
            // InternalExpAuto.g:3015:2: rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1
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
    // InternalExpAuto.g:3022:1: rule__SetValueProvider__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3026:1: ( ( ',' ) )
            // InternalExpAuto.g:3027:1: ( ',' )
            {
            // InternalExpAuto.g:3027:1: ( ',' )
            // InternalExpAuto.g:3028:2: ','
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
    // InternalExpAuto.g:3037:1: rule__SetValueProvider__Group_0_2__1 : rule__SetValueProvider__Group_0_2__1__Impl ;
    public final void rule__SetValueProvider__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3041:1: ( rule__SetValueProvider__Group_0_2__1__Impl )
            // InternalExpAuto.g:3042:2: rule__SetValueProvider__Group_0_2__1__Impl
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
    // InternalExpAuto.g:3048:1: rule__SetValueProvider__Group_0_2__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) ;
    public final void rule__SetValueProvider__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3052:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) )
            // InternalExpAuto.g:3053:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            {
            // InternalExpAuto.g:3053:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            // InternalExpAuto.g:3054:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 
            // InternalExpAuto.g:3055:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            // InternalExpAuto.g:3055:3: rule__SetValueProvider__ValuesAssignment_0_2_1
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
    // InternalExpAuto.g:3064:1: rule__SetValueProvider__Group_1__0 : rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 ;
    public final void rule__SetValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3068:1: ( rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 )
            // InternalExpAuto.g:3069:2: rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1
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
    // InternalExpAuto.g:3076:1: rule__SetValueProvider__Group_1__0__Impl : ( 'setValues' ) ;
    public final void rule__SetValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3080:1: ( ( 'setValues' ) )
            // InternalExpAuto.g:3081:1: ( 'setValues' )
            {
            // InternalExpAuto.g:3081:1: ( 'setValues' )
            // InternalExpAuto.g:3082:2: 'setValues'
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
    // InternalExpAuto.g:3091:1: rule__SetValueProvider__Group_1__1 : rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 ;
    public final void rule__SetValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3095:1: ( rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 )
            // InternalExpAuto.g:3096:2: rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2
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
    // InternalExpAuto.g:3103:1: rule__SetValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SetValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3107:1: ( ( '(' ) )
            // InternalExpAuto.g:3108:1: ( '(' )
            {
            // InternalExpAuto.g:3108:1: ( '(' )
            // InternalExpAuto.g:3109:2: '('
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
    // InternalExpAuto.g:3118:1: rule__SetValueProvider__Group_1__2 : rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 ;
    public final void rule__SetValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3122:1: ( rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 )
            // InternalExpAuto.g:3123:2: rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3
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
    // InternalExpAuto.g:3130:1: rule__SetValueProvider__Group_1__2__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) ;
    public final void rule__SetValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3134:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) )
            // InternalExpAuto.g:3135:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            {
            // InternalExpAuto.g:3135:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            // InternalExpAuto.g:3136:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 
            // InternalExpAuto.g:3137:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            // InternalExpAuto.g:3137:3: rule__SetValueProvider__ValuesAssignment_1_2
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
    // InternalExpAuto.g:3145:1: rule__SetValueProvider__Group_1__3 : rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 ;
    public final void rule__SetValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3149:1: ( rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 )
            // InternalExpAuto.g:3150:2: rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4
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
    // InternalExpAuto.g:3157:1: rule__SetValueProvider__Group_1__3__Impl : ( ( rule__SetValueProvider__Group_1_3__0 )* ) ;
    public final void rule__SetValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3161:1: ( ( ( rule__SetValueProvider__Group_1_3__0 )* ) )
            // InternalExpAuto.g:3162:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            {
            // InternalExpAuto.g:3162:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            // InternalExpAuto.g:3163:2: ( rule__SetValueProvider__Group_1_3__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 
            // InternalExpAuto.g:3164:2: ( rule__SetValueProvider__Group_1_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:3164:3: rule__SetValueProvider__Group_1_3__0
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
    // InternalExpAuto.g:3172:1: rule__SetValueProvider__Group_1__4 : rule__SetValueProvider__Group_1__4__Impl ;
    public final void rule__SetValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3176:1: ( rule__SetValueProvider__Group_1__4__Impl )
            // InternalExpAuto.g:3177:2: rule__SetValueProvider__Group_1__4__Impl
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
    // InternalExpAuto.g:3183:1: rule__SetValueProvider__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SetValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3187:1: ( ( ')' ) )
            // InternalExpAuto.g:3188:1: ( ')' )
            {
            // InternalExpAuto.g:3188:1: ( ')' )
            // InternalExpAuto.g:3189:2: ')'
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
    // InternalExpAuto.g:3199:1: rule__SetValueProvider__Group_1_3__0 : rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 ;
    public final void rule__SetValueProvider__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3203:1: ( rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 )
            // InternalExpAuto.g:3204:2: rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1
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
    // InternalExpAuto.g:3211:1: rule__SetValueProvider__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3215:1: ( ( ',' ) )
            // InternalExpAuto.g:3216:1: ( ',' )
            {
            // InternalExpAuto.g:3216:1: ( ',' )
            // InternalExpAuto.g:3217:2: ','
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
    // InternalExpAuto.g:3226:1: rule__SetValueProvider__Group_1_3__1 : rule__SetValueProvider__Group_1_3__1__Impl ;
    public final void rule__SetValueProvider__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3230:1: ( rule__SetValueProvider__Group_1_3__1__Impl )
            // InternalExpAuto.g:3231:2: rule__SetValueProvider__Group_1_3__1__Impl
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
    // InternalExpAuto.g:3237:1: rule__SetValueProvider__Group_1_3__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) ;
    public final void rule__SetValueProvider__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3241:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) )
            // InternalExpAuto.g:3242:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            {
            // InternalExpAuto.g:3242:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            // InternalExpAuto.g:3243:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 
            // InternalExpAuto.g:3244:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            // InternalExpAuto.g:3244:3: rule__SetValueProvider__ValuesAssignment_1_3_1
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
    // InternalExpAuto.g:3253:1: rule__LinearValueProvider__Group__0 : rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 ;
    public final void rule__LinearValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3257:1: ( rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 )
            // InternalExpAuto.g:3258:2: rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1
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
    // InternalExpAuto.g:3265:1: rule__LinearValueProvider__Group__0__Impl : ( 'linear' ) ;
    public final void rule__LinearValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3269:1: ( ( 'linear' ) )
            // InternalExpAuto.g:3270:1: ( 'linear' )
            {
            // InternalExpAuto.g:3270:1: ( 'linear' )
            // InternalExpAuto.g:3271:2: 'linear'
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
    // InternalExpAuto.g:3280:1: rule__LinearValueProvider__Group__1 : rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 ;
    public final void rule__LinearValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3284:1: ( rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 )
            // InternalExpAuto.g:3285:2: rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2
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
    // InternalExpAuto.g:3292:1: rule__LinearValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__LinearValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3296:1: ( ( '(' ) )
            // InternalExpAuto.g:3297:1: ( '(' )
            {
            // InternalExpAuto.g:3297:1: ( '(' )
            // InternalExpAuto.g:3298:2: '('
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
    // InternalExpAuto.g:3307:1: rule__LinearValueProvider__Group__2 : rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 ;
    public final void rule__LinearValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3311:1: ( rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 )
            // InternalExpAuto.g:3312:2: rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3
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
    // InternalExpAuto.g:3319:1: rule__LinearValueProvider__Group__2__Impl : ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) ;
    public final void rule__LinearValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3323:1: ( ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) )
            // InternalExpAuto.g:3324:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            {
            // InternalExpAuto.g:3324:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            // InternalExpAuto.g:3325:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 
            // InternalExpAuto.g:3326:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            // InternalExpAuto.g:3326:3: rule__LinearValueProvider__SummandAssignment_2
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
    // InternalExpAuto.g:3334:1: rule__LinearValueProvider__Group__3 : rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 ;
    public final void rule__LinearValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3338:1: ( rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 )
            // InternalExpAuto.g:3339:2: rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4
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
    // InternalExpAuto.g:3346:1: rule__LinearValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__LinearValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3350:1: ( ( ',' ) )
            // InternalExpAuto.g:3351:1: ( ',' )
            {
            // InternalExpAuto.g:3351:1: ( ',' )
            // InternalExpAuto.g:3352:2: ','
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
    // InternalExpAuto.g:3361:1: rule__LinearValueProvider__Group__4 : rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 ;
    public final void rule__LinearValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3365:1: ( rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 )
            // InternalExpAuto.g:3366:2: rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5
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
    // InternalExpAuto.g:3373:1: rule__LinearValueProvider__Group__4__Impl : ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__LinearValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3377:1: ( ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3378:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3378:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3379:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3380:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3380:3: rule__LinearValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3388:1: rule__LinearValueProvider__Group__5 : rule__LinearValueProvider__Group__5__Impl ;
    public final void rule__LinearValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3392:1: ( rule__LinearValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3393:2: rule__LinearValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3399:1: rule__LinearValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__LinearValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3403:1: ( ( ')' ) )
            // InternalExpAuto.g:3404:1: ( ')' )
            {
            // InternalExpAuto.g:3404:1: ( ')' )
            // InternalExpAuto.g:3405:2: ')'
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
    // InternalExpAuto.g:3415:1: rule__ExponentialValueProvider__Group__0 : rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 ;
    public final void rule__ExponentialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3419:1: ( rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 )
            // InternalExpAuto.g:3420:2: rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1
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
    // InternalExpAuto.g:3427:1: rule__ExponentialValueProvider__Group__0__Impl : ( 'exponential' ) ;
    public final void rule__ExponentialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3431:1: ( ( 'exponential' ) )
            // InternalExpAuto.g:3432:1: ( 'exponential' )
            {
            // InternalExpAuto.g:3432:1: ( 'exponential' )
            // InternalExpAuto.g:3433:2: 'exponential'
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
    // InternalExpAuto.g:3442:1: rule__ExponentialValueProvider__Group__1 : rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 ;
    public final void rule__ExponentialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3446:1: ( rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 )
            // InternalExpAuto.g:3447:2: rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2
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
    // InternalExpAuto.g:3454:1: rule__ExponentialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__ExponentialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3458:1: ( ( '(' ) )
            // InternalExpAuto.g:3459:1: ( '(' )
            {
            // InternalExpAuto.g:3459:1: ( '(' )
            // InternalExpAuto.g:3460:2: '('
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
    // InternalExpAuto.g:3469:1: rule__ExponentialValueProvider__Group__2 : rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 ;
    public final void rule__ExponentialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3473:1: ( rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 )
            // InternalExpAuto.g:3474:2: rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3
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
    // InternalExpAuto.g:3481:1: rule__ExponentialValueProvider__Group__2__Impl : ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) ;
    public final void rule__ExponentialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3485:1: ( ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) )
            // InternalExpAuto.g:3486:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            {
            // InternalExpAuto.g:3486:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            // InternalExpAuto.g:3487:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 
            // InternalExpAuto.g:3488:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            // InternalExpAuto.g:3488:3: rule__ExponentialValueProvider__BaseAssignment_2
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
    // InternalExpAuto.g:3496:1: rule__ExponentialValueProvider__Group__3 : rule__ExponentialValueProvider__Group__3__Impl ;
    public final void rule__ExponentialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3500:1: ( rule__ExponentialValueProvider__Group__3__Impl )
            // InternalExpAuto.g:3501:2: rule__ExponentialValueProvider__Group__3__Impl
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
    // InternalExpAuto.g:3507:1: rule__ExponentialValueProvider__Group__3__Impl : ( ')' ) ;
    public final void rule__ExponentialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3511:1: ( ( ')' ) )
            // InternalExpAuto.g:3512:1: ( ')' )
            {
            // InternalExpAuto.g:3512:1: ( ')' )
            // InternalExpAuto.g:3513:2: ')'
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
    // InternalExpAuto.g:3523:1: rule__PolynomialValueProvider__Group__0 : rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 ;
    public final void rule__PolynomialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3527:1: ( rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 )
            // InternalExpAuto.g:3528:2: rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1
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
    // InternalExpAuto.g:3535:1: rule__PolynomialValueProvider__Group__0__Impl : ( 'polynomial' ) ;
    public final void rule__PolynomialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3539:1: ( ( 'polynomial' ) )
            // InternalExpAuto.g:3540:1: ( 'polynomial' )
            {
            // InternalExpAuto.g:3540:1: ( 'polynomial' )
            // InternalExpAuto.g:3541:2: 'polynomial'
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
    // InternalExpAuto.g:3550:1: rule__PolynomialValueProvider__Group__1 : rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 ;
    public final void rule__PolynomialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3554:1: ( rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 )
            // InternalExpAuto.g:3555:2: rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2
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
    // InternalExpAuto.g:3562:1: rule__PolynomialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__PolynomialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3566:1: ( ( '(' ) )
            // InternalExpAuto.g:3567:1: ( '(' )
            {
            // InternalExpAuto.g:3567:1: ( '(' )
            // InternalExpAuto.g:3568:2: '('
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
    // InternalExpAuto.g:3577:1: rule__PolynomialValueProvider__Group__2 : rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 ;
    public final void rule__PolynomialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3581:1: ( rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 )
            // InternalExpAuto.g:3582:2: rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3
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
    // InternalExpAuto.g:3589:1: rule__PolynomialValueProvider__Group__2__Impl : ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) ;
    public final void rule__PolynomialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3593:1: ( ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) )
            // InternalExpAuto.g:3594:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            {
            // InternalExpAuto.g:3594:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            // InternalExpAuto.g:3595:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 
            // InternalExpAuto.g:3596:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            // InternalExpAuto.g:3596:3: rule__PolynomialValueProvider__ExponentAssignment_2
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
    // InternalExpAuto.g:3604:1: rule__PolynomialValueProvider__Group__3 : rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 ;
    public final void rule__PolynomialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3608:1: ( rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 )
            // InternalExpAuto.g:3609:2: rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4
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
    // InternalExpAuto.g:3616:1: rule__PolynomialValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__PolynomialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3620:1: ( ( ',' ) )
            // InternalExpAuto.g:3621:1: ( ',' )
            {
            // InternalExpAuto.g:3621:1: ( ',' )
            // InternalExpAuto.g:3622:2: ','
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
    // InternalExpAuto.g:3631:1: rule__PolynomialValueProvider__Group__4 : rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 ;
    public final void rule__PolynomialValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3635:1: ( rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 )
            // InternalExpAuto.g:3636:2: rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5
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
    // InternalExpAuto.g:3643:1: rule__PolynomialValueProvider__Group__4__Impl : ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__PolynomialValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3647:1: ( ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3648:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3648:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3649:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3650:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3650:3: rule__PolynomialValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3658:1: rule__PolynomialValueProvider__Group__5 : rule__PolynomialValueProvider__Group__5__Impl ;
    public final void rule__PolynomialValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3662:1: ( rule__PolynomialValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3663:2: rule__PolynomialValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3669:1: rule__PolynomialValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__PolynomialValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3673:1: ( ( ')' ) )
            // InternalExpAuto.g:3674:1: ( ')' )
            {
            // InternalExpAuto.g:3674:1: ( ')' )
            // InternalExpAuto.g:3675:2: ')'
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
    // InternalExpAuto.g:3685:1: rule__StopTimeCondition__Group__0 : rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 ;
    public final void rule__StopTimeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3689:1: ( rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 )
            // InternalExpAuto.g:3690:2: rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1
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
    // InternalExpAuto.g:3697:1: rule__StopTimeCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopTimeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3701:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3702:1: ( 'stop' )
            {
            // InternalExpAuto.g:3702:1: ( 'stop' )
            // InternalExpAuto.g:3703:2: 'stop'
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
    // InternalExpAuto.g:3712:1: rule__StopTimeCondition__Group__1 : rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 ;
    public final void rule__StopTimeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3716:1: ( rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 )
            // InternalExpAuto.g:3717:2: rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2
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
    // InternalExpAuto.g:3724:1: rule__StopTimeCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopTimeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3728:1: ( ( '=' ) )
            // InternalExpAuto.g:3729:1: ( '=' )
            {
            // InternalExpAuto.g:3729:1: ( '=' )
            // InternalExpAuto.g:3730:2: '='
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
    // InternalExpAuto.g:3739:1: rule__StopTimeCondition__Group__2 : rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 ;
    public final void rule__StopTimeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3743:1: ( rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 )
            // InternalExpAuto.g:3744:2: rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3
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
    // InternalExpAuto.g:3751:1: rule__StopTimeCondition__Group__2__Impl : ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopTimeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3755:1: ( ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3756:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3756:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3757:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3758:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3758:3: rule__StopTimeCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3766:1: rule__StopTimeCondition__Group__3 : rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 ;
    public final void rule__StopTimeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3770:1: ( rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 )
            // InternalExpAuto.g:3771:2: rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4
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
    // InternalExpAuto.g:3778:1: rule__StopTimeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopTimeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3782:1: ( ( '(' ) )
            // InternalExpAuto.g:3783:1: ( '(' )
            {
            // InternalExpAuto.g:3783:1: ( '(' )
            // InternalExpAuto.g:3784:2: '('
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
    // InternalExpAuto.g:3793:1: rule__StopTimeCondition__Group__4 : rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 ;
    public final void rule__StopTimeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3797:1: ( rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 )
            // InternalExpAuto.g:3798:2: rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5
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
    // InternalExpAuto.g:3805:1: rule__StopTimeCondition__Group__4__Impl : ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopTimeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3809:1: ( ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3810:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3810:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3811:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3812:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3812:3: rule__StopTimeCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3820:1: rule__StopTimeCondition__Group__5 : rule__StopTimeCondition__Group__5__Impl ;
    public final void rule__StopTimeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3824:1: ( rule__StopTimeCondition__Group__5__Impl )
            // InternalExpAuto.g:3825:2: rule__StopTimeCondition__Group__5__Impl
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
    // InternalExpAuto.g:3831:1: rule__StopTimeCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopTimeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3835:1: ( ( ')' ) )
            // InternalExpAuto.g:3836:1: ( ')' )
            {
            // InternalExpAuto.g:3836:1: ( ')' )
            // InternalExpAuto.g:3837:2: ')'
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
    // InternalExpAuto.g:3847:1: rule__StopCountCondition__Group__0 : rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 ;
    public final void rule__StopCountCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3851:1: ( rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 )
            // InternalExpAuto.g:3852:2: rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1
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
    // InternalExpAuto.g:3859:1: rule__StopCountCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopCountCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3863:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3864:1: ( 'stop' )
            {
            // InternalExpAuto.g:3864:1: ( 'stop' )
            // InternalExpAuto.g:3865:2: 'stop'
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
    // InternalExpAuto.g:3874:1: rule__StopCountCondition__Group__1 : rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 ;
    public final void rule__StopCountCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3878:1: ( rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 )
            // InternalExpAuto.g:3879:2: rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2
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
    // InternalExpAuto.g:3886:1: rule__StopCountCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopCountCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3890:1: ( ( '=' ) )
            // InternalExpAuto.g:3891:1: ( '=' )
            {
            // InternalExpAuto.g:3891:1: ( '=' )
            // InternalExpAuto.g:3892:2: '='
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
    // InternalExpAuto.g:3901:1: rule__StopCountCondition__Group__2 : rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 ;
    public final void rule__StopCountCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3905:1: ( rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 )
            // InternalExpAuto.g:3906:2: rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3
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
    // InternalExpAuto.g:3913:1: rule__StopCountCondition__Group__2__Impl : ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopCountCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3917:1: ( ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3918:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3918:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3919:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3920:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3920:3: rule__StopCountCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3928:1: rule__StopCountCondition__Group__3 : rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 ;
    public final void rule__StopCountCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3932:1: ( rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 )
            // InternalExpAuto.g:3933:2: rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4
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
    // InternalExpAuto.g:3940:1: rule__StopCountCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopCountCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3944:1: ( ( '(' ) )
            // InternalExpAuto.g:3945:1: ( '(' )
            {
            // InternalExpAuto.g:3945:1: ( '(' )
            // InternalExpAuto.g:3946:2: '('
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
    // InternalExpAuto.g:3955:1: rule__StopCountCondition__Group__4 : rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 ;
    public final void rule__StopCountCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3959:1: ( rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 )
            // InternalExpAuto.g:3960:2: rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5
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
    // InternalExpAuto.g:3967:1: rule__StopCountCondition__Group__4__Impl : ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopCountCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3971:1: ( ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3972:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3972:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3973:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3974:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3974:3: rule__StopCountCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3982:1: rule__StopCountCondition__Group__5 : rule__StopCountCondition__Group__5__Impl ;
    public final void rule__StopCountCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3986:1: ( rule__StopCountCondition__Group__5__Impl )
            // InternalExpAuto.g:3987:2: rule__StopCountCondition__Group__5__Impl
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
    // InternalExpAuto.g:3993:1: rule__StopCountCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopCountCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3997:1: ( ( ')' ) )
            // InternalExpAuto.g:3998:1: ( ')' )
            {
            // InternalExpAuto.g:3998:1: ( ')' )
            // InternalExpAuto.g:3999:2: ')'
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
    // InternalExpAuto.g:4009:1: rule__NumberOfExperiments__Group__0 : rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 ;
    public final void rule__NumberOfExperiments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4013:1: ( rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 )
            // InternalExpAuto.g:4014:2: rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1
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
    // InternalExpAuto.g:4021:1: rule__NumberOfExperiments__Group__0__Impl : ( 'repetitions' ) ;
    public final void rule__NumberOfExperiments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4025:1: ( ( 'repetitions' ) )
            // InternalExpAuto.g:4026:1: ( 'repetitions' )
            {
            // InternalExpAuto.g:4026:1: ( 'repetitions' )
            // InternalExpAuto.g:4027:2: 'repetitions'
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
    // InternalExpAuto.g:4036:1: rule__NumberOfExperiments__Group__1 : rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 ;
    public final void rule__NumberOfExperiments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4040:1: ( rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 )
            // InternalExpAuto.g:4041:2: rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2
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
    // InternalExpAuto.g:4048:1: rule__NumberOfExperiments__Group__1__Impl : ( '=' ) ;
    public final void rule__NumberOfExperiments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4052:1: ( ( '=' ) )
            // InternalExpAuto.g:4053:1: ( '=' )
            {
            // InternalExpAuto.g:4053:1: ( '=' )
            // InternalExpAuto.g:4054:2: '='
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
    // InternalExpAuto.g:4063:1: rule__NumberOfExperiments__Group__2 : rule__NumberOfExperiments__Group__2__Impl ;
    public final void rule__NumberOfExperiments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4067:1: ( rule__NumberOfExperiments__Group__2__Impl )
            // InternalExpAuto.g:4068:2: rule__NumberOfExperiments__Group__2__Impl
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
    // InternalExpAuto.g:4074:1: rule__NumberOfExperiments__Group__2__Impl : ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) ;
    public final void rule__NumberOfExperiments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4078:1: ( ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) )
            // InternalExpAuto.g:4079:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            {
            // InternalExpAuto.g:4079:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            // InternalExpAuto.g:4080:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 
            // InternalExpAuto.g:4081:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            // InternalExpAuto.g:4081:3: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2
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
    // InternalExpAuto.g:4090:1: rule__SeedDefinition__Group__0 : rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 ;
    public final void rule__SeedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4094:1: ( rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 )
            // InternalExpAuto.g:4095:2: rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1
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
    // InternalExpAuto.g:4102:1: rule__SeedDefinition__Group__0__Impl : ( 'seeds' ) ;
    public final void rule__SeedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4106:1: ( ( 'seeds' ) )
            // InternalExpAuto.g:4107:1: ( 'seeds' )
            {
            // InternalExpAuto.g:4107:1: ( 'seeds' )
            // InternalExpAuto.g:4108:2: 'seeds'
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
    // InternalExpAuto.g:4117:1: rule__SeedDefinition__Group__1 : rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 ;
    public final void rule__SeedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4121:1: ( rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 )
            // InternalExpAuto.g:4122:2: rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2
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
    // InternalExpAuto.g:4129:1: rule__SeedDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__SeedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4133:1: ( ( '=' ) )
            // InternalExpAuto.g:4134:1: ( '=' )
            {
            // InternalExpAuto.g:4134:1: ( '=' )
            // InternalExpAuto.g:4135:2: '='
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
    // InternalExpAuto.g:4144:1: rule__SeedDefinition__Group__2 : rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 ;
    public final void rule__SeedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4148:1: ( rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 )
            // InternalExpAuto.g:4149:2: rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3
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
    // InternalExpAuto.g:4156:1: rule__SeedDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4160:1: ( ( '{' ) )
            // InternalExpAuto.g:4161:1: ( '{' )
            {
            // InternalExpAuto.g:4161:1: ( '{' )
            // InternalExpAuto.g:4162:2: '{'
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
    // InternalExpAuto.g:4171:1: rule__SeedDefinition__Group__3 : rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 ;
    public final void rule__SeedDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4175:1: ( rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 )
            // InternalExpAuto.g:4176:2: rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4
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
    // InternalExpAuto.g:4183:1: rule__SeedDefinition__Group__3__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) ;
    public final void rule__SeedDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4187:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) )
            // InternalExpAuto.g:4188:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            {
            // InternalExpAuto.g:4188:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            // InternalExpAuto.g:4189:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 
            // InternalExpAuto.g:4190:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            // InternalExpAuto.g:4190:3: rule__SeedDefinition__SeedListsAssignment_3
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
    // InternalExpAuto.g:4198:1: rule__SeedDefinition__Group__4 : rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 ;
    public final void rule__SeedDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4202:1: ( rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 )
            // InternalExpAuto.g:4203:2: rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5
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
    // InternalExpAuto.g:4210:1: rule__SeedDefinition__Group__4__Impl : ( ( rule__SeedDefinition__Group_4__0 )* ) ;
    public final void rule__SeedDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4214:1: ( ( ( rule__SeedDefinition__Group_4__0 )* ) )
            // InternalExpAuto.g:4215:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            {
            // InternalExpAuto.g:4215:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            // InternalExpAuto.g:4216:2: ( rule__SeedDefinition__Group_4__0 )*
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 
            // InternalExpAuto.g:4217:2: ( rule__SeedDefinition__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:4217:3: rule__SeedDefinition__Group_4__0
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
    // InternalExpAuto.g:4225:1: rule__SeedDefinition__Group__5 : rule__SeedDefinition__Group__5__Impl ;
    public final void rule__SeedDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4229:1: ( rule__SeedDefinition__Group__5__Impl )
            // InternalExpAuto.g:4230:2: rule__SeedDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4236:1: rule__SeedDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__SeedDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4240:1: ( ( '}' ) )
            // InternalExpAuto.g:4241:1: ( '}' )
            {
            // InternalExpAuto.g:4241:1: ( '}' )
            // InternalExpAuto.g:4242:2: '}'
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
    // InternalExpAuto.g:4252:1: rule__SeedDefinition__Group_4__0 : rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 ;
    public final void rule__SeedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4256:1: ( rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 )
            // InternalExpAuto.g:4257:2: rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1
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
    // InternalExpAuto.g:4264:1: rule__SeedDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SeedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4268:1: ( ( ',' ) )
            // InternalExpAuto.g:4269:1: ( ',' )
            {
            // InternalExpAuto.g:4269:1: ( ',' )
            // InternalExpAuto.g:4270:2: ','
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
    // InternalExpAuto.g:4279:1: rule__SeedDefinition__Group_4__1 : rule__SeedDefinition__Group_4__1__Impl ;
    public final void rule__SeedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4283:1: ( rule__SeedDefinition__Group_4__1__Impl )
            // InternalExpAuto.g:4284:2: rule__SeedDefinition__Group_4__1__Impl
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
    // InternalExpAuto.g:4290:1: rule__SeedDefinition__Group_4__1__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) ;
    public final void rule__SeedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4294:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) )
            // InternalExpAuto.g:4295:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            {
            // InternalExpAuto.g:4295:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            // InternalExpAuto.g:4296:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 
            // InternalExpAuto.g:4297:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            // InternalExpAuto.g:4297:3: rule__SeedDefinition__SeedListsAssignment_4_1
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
    // InternalExpAuto.g:4306:1: rule__ListOfSeeds__Group__0 : rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 ;
    public final void rule__ListOfSeeds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4310:1: ( rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 )
            // InternalExpAuto.g:4311:2: rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1
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
    // InternalExpAuto.g:4318:1: rule__ListOfSeeds__Group__0__Impl : ( '{' ) ;
    public final void rule__ListOfSeeds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4322:1: ( ( '{' ) )
            // InternalExpAuto.g:4323:1: ( '{' )
            {
            // InternalExpAuto.g:4323:1: ( '{' )
            // InternalExpAuto.g:4324:2: '{'
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
    // InternalExpAuto.g:4333:1: rule__ListOfSeeds__Group__1 : rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 ;
    public final void rule__ListOfSeeds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4337:1: ( rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 )
            // InternalExpAuto.g:4338:2: rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2
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
    // InternalExpAuto.g:4345:1: rule__ListOfSeeds__Group__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) ;
    public final void rule__ListOfSeeds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4349:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) )
            // InternalExpAuto.g:4350:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            {
            // InternalExpAuto.g:4350:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            // InternalExpAuto.g:4351:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 
            // InternalExpAuto.g:4352:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            // InternalExpAuto.g:4352:3: rule__ListOfSeeds__SeedsAssignment_1
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
    // InternalExpAuto.g:4360:1: rule__ListOfSeeds__Group__2 : rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 ;
    public final void rule__ListOfSeeds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4364:1: ( rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 )
            // InternalExpAuto.g:4365:2: rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3
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
    // InternalExpAuto.g:4372:1: rule__ListOfSeeds__Group__2__Impl : ( ( rule__ListOfSeeds__Group_2__0 )* ) ;
    public final void rule__ListOfSeeds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4376:1: ( ( ( rule__ListOfSeeds__Group_2__0 )* ) )
            // InternalExpAuto.g:4377:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            {
            // InternalExpAuto.g:4377:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            // InternalExpAuto.g:4378:2: ( rule__ListOfSeeds__Group_2__0 )*
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup_2()); 
            // InternalExpAuto.g:4379:2: ( rule__ListOfSeeds__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:4379:3: rule__ListOfSeeds__Group_2__0
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
    // InternalExpAuto.g:4387:1: rule__ListOfSeeds__Group__3 : rule__ListOfSeeds__Group__3__Impl ;
    public final void rule__ListOfSeeds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4391:1: ( rule__ListOfSeeds__Group__3__Impl )
            // InternalExpAuto.g:4392:2: rule__ListOfSeeds__Group__3__Impl
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
    // InternalExpAuto.g:4398:1: rule__ListOfSeeds__Group__3__Impl : ( '}' ) ;
    public final void rule__ListOfSeeds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4402:1: ( ( '}' ) )
            // InternalExpAuto.g:4403:1: ( '}' )
            {
            // InternalExpAuto.g:4403:1: ( '}' )
            // InternalExpAuto.g:4404:2: '}'
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
    // InternalExpAuto.g:4414:1: rule__ListOfSeeds__Group_2__0 : rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 ;
    public final void rule__ListOfSeeds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4418:1: ( rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 )
            // InternalExpAuto.g:4419:2: rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1
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
    // InternalExpAuto.g:4426:1: rule__ListOfSeeds__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOfSeeds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4430:1: ( ( ',' ) )
            // InternalExpAuto.g:4431:1: ( ',' )
            {
            // InternalExpAuto.g:4431:1: ( ',' )
            // InternalExpAuto.g:4432:2: ','
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
    // InternalExpAuto.g:4441:1: rule__ListOfSeeds__Group_2__1 : rule__ListOfSeeds__Group_2__1__Impl ;
    public final void rule__ListOfSeeds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4445:1: ( rule__ListOfSeeds__Group_2__1__Impl )
            // InternalExpAuto.g:4446:2: rule__ListOfSeeds__Group_2__1__Impl
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
    // InternalExpAuto.g:4452:1: rule__ListOfSeeds__Group_2__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) ;
    public final void rule__ListOfSeeds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4456:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) )
            // InternalExpAuto.g:4457:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            {
            // InternalExpAuto.g:4457:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            // InternalExpAuto.g:4458:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 
            // InternalExpAuto.g:4459:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            // InternalExpAuto.g:4459:3: rule__ListOfSeeds__SeedsAssignment_2_1
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
    // InternalExpAuto.g:4468:1: rule__ExperimentDatasource__Group__0 : rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 ;
    public final void rule__ExperimentDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4472:1: ( rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 )
            // InternalExpAuto.g:4473:2: rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1
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
    // InternalExpAuto.g:4480:1: rule__ExperimentDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__ExperimentDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4484:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:4485:1: ( 'datasource' )
            {
            // InternalExpAuto.g:4485:1: ( 'datasource' )
            // InternalExpAuto.g:4486:2: 'datasource'
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
    // InternalExpAuto.g:4495:1: rule__ExperimentDatasource__Group__1 : rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 ;
    public final void rule__ExperimentDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4499:1: ( rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 )
            // InternalExpAuto.g:4500:2: rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2
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
    // InternalExpAuto.g:4507:1: rule__ExperimentDatasource__Group__1__Impl : ( '=' ) ;
    public final void rule__ExperimentDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4511:1: ( ( '=' ) )
            // InternalExpAuto.g:4512:1: ( '=' )
            {
            // InternalExpAuto.g:4512:1: ( '=' )
            // InternalExpAuto.g:4513:2: '='
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
    // InternalExpAuto.g:4522:1: rule__ExperimentDatasource__Group__2 : rule__ExperimentDatasource__Group__2__Impl ;
    public final void rule__ExperimentDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4526:1: ( rule__ExperimentDatasource__Group__2__Impl )
            // InternalExpAuto.g:4527:2: rule__ExperimentDatasource__Group__2__Impl
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
    // InternalExpAuto.g:4533:1: rule__ExperimentDatasource__Group__2__Impl : ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) ;
    public final void rule__ExperimentDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4537:1: ( ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) )
            // InternalExpAuto.g:4538:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            {
            // InternalExpAuto.g:4538:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            // InternalExpAuto.g:4539:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 
            // InternalExpAuto.g:4540:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            // InternalExpAuto.g:4540:3: rule__ExperimentDatasource__SourceAssignment_2
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
    // InternalExpAuto.g:4549:1: rule__ToolDefinition__Group__0 : rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 ;
    public final void rule__ToolDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4553:1: ( rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 )
            // InternalExpAuto.g:4554:2: rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1
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
    // InternalExpAuto.g:4561:1: rule__ToolDefinition__Group__0__Impl : ( 'tool' ) ;
    public final void rule__ToolDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4565:1: ( ( 'tool' ) )
            // InternalExpAuto.g:4566:1: ( 'tool' )
            {
            // InternalExpAuto.g:4566:1: ( 'tool' )
            // InternalExpAuto.g:4567:2: 'tool'
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
    // InternalExpAuto.g:4576:1: rule__ToolDefinition__Group__1 : rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 ;
    public final void rule__ToolDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4580:1: ( rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 )
            // InternalExpAuto.g:4581:2: rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:4588:1: rule__ToolDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__ToolDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4592:1: ( ( '=' ) )
            // InternalExpAuto.g:4593:1: ( '=' )
            {
            // InternalExpAuto.g:4593:1: ( '=' )
            // InternalExpAuto.g:4594:2: '='
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
    // InternalExpAuto.g:4603:1: rule__ToolDefinition__Group__2 : rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 ;
    public final void rule__ToolDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4607:1: ( rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 )
            // InternalExpAuto.g:4608:2: rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3
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
    // InternalExpAuto.g:4615:1: rule__ToolDefinition__Group__2__Impl : ( ( rule__ToolDefinition__ToolAssignment_2 ) ) ;
    public final void rule__ToolDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4619:1: ( ( ( rule__ToolDefinition__ToolAssignment_2 ) ) )
            // InternalExpAuto.g:4620:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            {
            // InternalExpAuto.g:4620:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            // InternalExpAuto.g:4621:2: ( rule__ToolDefinition__ToolAssignment_2 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 
            // InternalExpAuto.g:4622:2: ( rule__ToolDefinition__ToolAssignment_2 )
            // InternalExpAuto.g:4622:3: rule__ToolDefinition__ToolAssignment_2
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
    // InternalExpAuto.g:4630:1: rule__ToolDefinition__Group__3 : rule__ToolDefinition__Group__3__Impl ;
    public final void rule__ToolDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4634:1: ( rule__ToolDefinition__Group__3__Impl )
            // InternalExpAuto.g:4635:2: rule__ToolDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalExpAuto.g:4641:1: rule__ToolDefinition__Group__3__Impl : ( ( rule__ToolDefinition__Group_3__0 )? ) ;
    public final void rule__ToolDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4645:1: ( ( ( rule__ToolDefinition__Group_3__0 )? ) )
            // InternalExpAuto.g:4646:1: ( ( rule__ToolDefinition__Group_3__0 )? )
            {
            // InternalExpAuto.g:4646:1: ( ( rule__ToolDefinition__Group_3__0 )? )
            // InternalExpAuto.g:4647:2: ( rule__ToolDefinition__Group_3__0 )?
            {
             before(grammarAccess.getToolDefinitionAccess().getGroup_3()); 
            // InternalExpAuto.g:4648:2: ( rule__ToolDefinition__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExpAuto.g:4648:3: rule__ToolDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ToolDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getToolDefinitionAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ToolDefinition__Group_3__0"
    // InternalExpAuto.g:4657:1: rule__ToolDefinition__Group_3__0 : rule__ToolDefinition__Group_3__0__Impl rule__ToolDefinition__Group_3__1 ;
    public final void rule__ToolDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4661:1: ( rule__ToolDefinition__Group_3__0__Impl rule__ToolDefinition__Group_3__1 )
            // InternalExpAuto.g:4662:2: rule__ToolDefinition__Group_3__0__Impl rule__ToolDefinition__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__ToolDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__0"


    // $ANTLR start "rule__ToolDefinition__Group_3__0__Impl"
    // InternalExpAuto.g:4669:1: rule__ToolDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ToolDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4673:1: ( ( '{' ) )
            // InternalExpAuto.g:4674:1: ( '{' )
            {
            // InternalExpAuto.g:4674:1: ( '{' )
            // InternalExpAuto.g:4675:2: '{'
            {
             before(grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ToolDefinition__Group_3__1"
    // InternalExpAuto.g:4684:1: rule__ToolDefinition__Group_3__1 : rule__ToolDefinition__Group_3__1__Impl rule__ToolDefinition__Group_3__2 ;
    public final void rule__ToolDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4688:1: ( rule__ToolDefinition__Group_3__1__Impl rule__ToolDefinition__Group_3__2 )
            // InternalExpAuto.g:4689:2: rule__ToolDefinition__Group_3__1__Impl rule__ToolDefinition__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__ToolDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__1"


    // $ANTLR start "rule__ToolDefinition__Group_3__1__Impl"
    // InternalExpAuto.g:4696:1: rule__ToolDefinition__Group_3__1__Impl : ( ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )* ) ;
    public final void rule__ToolDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4700:1: ( ( ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )* ) )
            // InternalExpAuto.g:4701:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )* )
            {
            // InternalExpAuto.g:4701:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )* )
            // InternalExpAuto.g:4702:2: ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )*
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_3_1()); 
            // InternalExpAuto.g:4703:2: ( rule__ToolDefinition__ConfigParamsAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalExpAuto.g:4703:3: rule__ToolDefinition__ConfigParamsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ToolDefinition__ConfigParamsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ToolDefinition__Group_3__2"
    // InternalExpAuto.g:4711:1: rule__ToolDefinition__Group_3__2 : rule__ToolDefinition__Group_3__2__Impl ;
    public final void rule__ToolDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4715:1: ( rule__ToolDefinition__Group_3__2__Impl )
            // InternalExpAuto.g:4716:2: rule__ToolDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__2"


    // $ANTLR start "rule__ToolDefinition__Group_3__2__Impl"
    // InternalExpAuto.g:4722:1: rule__ToolDefinition__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ToolDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4726:1: ( ( '}' ) )
            // InternalExpAuto.g:4727:1: ( '}' )
            {
            // InternalExpAuto.g:4727:1: ( '}' )
            // InternalExpAuto.g:4728:2: '}'
            {
             before(grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ConfigurationParams__Group__0"
    // InternalExpAuto.g:4738:1: rule__ConfigurationParams__Group__0 : rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 ;
    public final void rule__ConfigurationParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4742:1: ( rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 )
            // InternalExpAuto.g:4743:2: rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1
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
    // InternalExpAuto.g:4750:1: rule__ConfigurationParams__Group__0__Impl : ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4754:1: ( ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) )
            // InternalExpAuto.g:4755:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            {
            // InternalExpAuto.g:4755:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            // InternalExpAuto.g:4756:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0()); 
            // InternalExpAuto.g:4757:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            // InternalExpAuto.g:4757:3: rule__ConfigurationParams__KeyAssignment_0
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
    // InternalExpAuto.g:4765:1: rule__ConfigurationParams__Group__1 : rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 ;
    public final void rule__ConfigurationParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4769:1: ( rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 )
            // InternalExpAuto.g:4770:2: rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2
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
    // InternalExpAuto.g:4777:1: rule__ConfigurationParams__Group__1__Impl : ( '=' ) ;
    public final void rule__ConfigurationParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4781:1: ( ( '=' ) )
            // InternalExpAuto.g:4782:1: ( '=' )
            {
            // InternalExpAuto.g:4782:1: ( '=' )
            // InternalExpAuto.g:4783:2: '='
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
    // InternalExpAuto.g:4792:1: rule__ConfigurationParams__Group__2 : rule__ConfigurationParams__Group__2__Impl ;
    public final void rule__ConfigurationParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4796:1: ( rule__ConfigurationParams__Group__2__Impl )
            // InternalExpAuto.g:4797:2: rule__ConfigurationParams__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalExpAuto.g:4803:1: rule__ConfigurationParams__Group__2__Impl : ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) ;
    public final void rule__ConfigurationParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4807:1: ( ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) )
            // InternalExpAuto.g:4808:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            {
            // InternalExpAuto.g:4808:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            // InternalExpAuto.g:4809:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2()); 
            // InternalExpAuto.g:4810:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            // InternalExpAuto.g:4810:3: rule__ConfigurationParams__ValueAssignment_2
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalExpAuto.g:4819:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4823:1: ( ( ruleImport ) )
            // InternalExpAuto.g:4824:2: ( ruleImport )
            {
            // InternalExpAuto.g:4824:2: ( ruleImport )
            // InternalExpAuto.g:4825:3: ruleImport
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
    // InternalExpAuto.g:4834:1: rule__Model__DatasourcesAssignment_1 : ( ruleDatasource ) ;
    public final void rule__Model__DatasourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4838:1: ( ( ruleDatasource ) )
            // InternalExpAuto.g:4839:2: ( ruleDatasource )
            {
            // InternalExpAuto.g:4839:2: ( ruleDatasource )
            // InternalExpAuto.g:4840:3: ruleDatasource
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
    // InternalExpAuto.g:4849:1: rule__Model__ExperimentsAssignment_2 : ( ruleExperiment ) ;
    public final void rule__Model__ExperimentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4853:1: ( ( ruleExperiment ) )
            // InternalExpAuto.g:4854:2: ( ruleExperiment )
            {
            // InternalExpAuto.g:4854:2: ( ruleExperiment )
            // InternalExpAuto.g:4855:3: ruleExperiment
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
    // InternalExpAuto.g:4864:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4868:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4869:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4869:2: ( RULE_STRING )
            // InternalExpAuto.g:4870:3: RULE_STRING
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
    // InternalExpAuto.g:4879:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4883:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:4884:2: ( RULE_ID )
            {
            // InternalExpAuto.g:4884:2: ( RULE_ID )
            // InternalExpAuto.g:4885:3: RULE_ID
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
    // InternalExpAuto.g:4894:1: rule__Datasource__SourceTypeAssignment_3 : ( ( 'EDP2' ) ) ;
    public final void rule__Datasource__SourceTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4898:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:4899:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:4899:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:4900:3: ( 'EDP2' )
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            // InternalExpAuto.g:4901:3: ( 'EDP2' )
            // InternalExpAuto.g:4902:4: 'EDP2'
            {
             before(grammarAccess.getDatasourceAccess().getSourceTypeEDP2Keyword_3_0()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__Datasource__SourceURIAssignment_4_1"
    // InternalExpAuto.g:4913:1: rule__Datasource__SourceURIAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Datasource__SourceURIAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4917:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4918:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4918:2: ( RULE_STRING )
            // InternalExpAuto.g:4919:3: RULE_STRING
            {
             before(grammarAccess.getDatasourceAccess().getSourceURISTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getSourceURISTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__SourceURIAssignment_4_1"


    // $ANTLR start "rule__Experiment__NameAssignment_1"
    // InternalExpAuto.g:4928:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4932:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:4933:2: ( RULE_ID )
            {
            // InternalExpAuto.g:4933:2: ( RULE_ID )
            // InternalExpAuto.g:4934:3: RULE_ID
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
    // InternalExpAuto.g:4943:1: rule__Experiment__DesignAssignment_3 : ( ( rule__Experiment__DesignAlternatives_3_0 ) ) ;
    public final void rule__Experiment__DesignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4947:1: ( ( ( rule__Experiment__DesignAlternatives_3_0 ) ) )
            // InternalExpAuto.g:4948:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            {
            // InternalExpAuto.g:4948:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            // InternalExpAuto.g:4949:3: ( rule__Experiment__DesignAlternatives_3_0 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 
            // InternalExpAuto.g:4950:3: ( rule__Experiment__DesignAlternatives_3_0 )
            // InternalExpAuto.g:4950:4: rule__Experiment__DesignAlternatives_3_0
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
    // InternalExpAuto.g:4958:1: rule__Experiment__ExperimentSpecificationsAssignment_5 : ( ruleExperimentSpecifications ) ;
    public final void rule__Experiment__ExperimentSpecificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4962:1: ( ( ruleExperimentSpecifications ) )
            // InternalExpAuto.g:4963:2: ( ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:4963:2: ( ruleExperimentSpecifications )
            // InternalExpAuto.g:4964:3: ruleExperimentSpecifications
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
    // InternalExpAuto.g:4973:1: rule__ExperimentSpecifications__SpecificationsAssignment : ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__ExperimentSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4977:1: ( ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:4978:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:4978:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:4979:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:4980:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:4980:4: rule__ExperimentSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:4988:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4992:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4993:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4993:2: ( RULE_STRING )
            // InternalExpAuto.g:4994:3: RULE_STRING
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
    // InternalExpAuto.g:5003:1: rule__InitialModel__ModeltypAssignment_2 : ( ( 'PCM' ) ) ;
    public final void rule__InitialModel__ModeltypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5007:1: ( ( ( 'PCM' ) ) )
            // InternalExpAuto.g:5008:2: ( ( 'PCM' ) )
            {
            // InternalExpAuto.g:5008:2: ( ( 'PCM' ) )
            // InternalExpAuto.g:5009:3: ( 'PCM' )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            // InternalExpAuto.g:5010:3: ( 'PCM' )
            // InternalExpAuto.g:5011:4: 'PCM'
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalExpAuto.g:5022:1: rule__InitialModel__InitSpecificationsAssignment_4 : ( ruleInitSpecifications ) ;
    public final void rule__InitialModel__InitSpecificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5026:1: ( ( ruleInitSpecifications ) )
            // InternalExpAuto.g:5027:2: ( ruleInitSpecifications )
            {
            // InternalExpAuto.g:5027:2: ( ruleInitSpecifications )
            // InternalExpAuto.g:5028:3: ruleInitSpecifications
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
    // InternalExpAuto.g:5037:1: rule__InitSpecifications__SpecificationsAssignment : ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__InitSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5041:1: ( ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5042:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5042:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5043:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5044:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5044:4: rule__InitSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5052:1: rule__AllocationModel__AllocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllocationModel__AllocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5056:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5057:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5057:2: ( RULE_STRING )
            // InternalExpAuto.g:5058:3: RULE_STRING
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
    // InternalExpAuto.g:5067:1: rule__UsageModel__UsageModelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsageModel__UsageModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5071:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5072:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5072:2: ( RULE_STRING )
            // InternalExpAuto.g:5073:3: RULE_STRING
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
    // InternalExpAuto.g:5082:1: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5086:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5087:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5087:2: ( RULE_STRING )
            // InternalExpAuto.g:5088:3: RULE_STRING
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
    // InternalExpAuto.g:5097:1: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5101:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5102:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5102:2: ( RULE_STRING )
            // InternalExpAuto.g:5103:3: RULE_STRING
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
    // InternalExpAuto.g:5112:1: rule__MonitorRepository__MonitorRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonitorRepository__MonitorRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5116:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5117:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5117:2: ( RULE_STRING )
            // InternalExpAuto.g:5118:3: RULE_STRING
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
    // InternalExpAuto.g:5127:1: rule__Variation__VariationTypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__VariationTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5131:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5132:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5132:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5133:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 
            // InternalExpAuto.g:5134:3: ( RULE_ID )
            // InternalExpAuto.g:5135:4: RULE_ID
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
    // InternalExpAuto.g:5146:1: rule__Variation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Variation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5150:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5151:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5151:2: ( RULE_ID )
            // InternalExpAuto.g:5152:3: RULE_ID
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
    // InternalExpAuto.g:5161:1: rule__Variation__TargetAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__Variation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5165:1: ( ( ( RULE_STRING ) ) )
            // InternalExpAuto.g:5166:2: ( ( RULE_STRING ) )
            {
            // InternalExpAuto.g:5166:2: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5167:3: ( RULE_STRING )
            {
             before(grammarAccess.getVariationAccess().getTargetEObjectCrossReference_7_0()); 
            // InternalExpAuto.g:5168:3: ( RULE_STRING )
            // InternalExpAuto.g:5169:4: RULE_STRING
            {
             before(grammarAccess.getVariationAccess().getTargetEObjectSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariationAccess().getTargetEObjectSTRINGTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getVariationAccess().getTargetEObjectCrossReference_7_0()); 

            }


            }

        }
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
    // InternalExpAuto.g:5180:1: rule__Variation__MaxVariationsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Variation__MaxVariationsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5184:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5185:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5185:2: ( RULE_INT )
            // InternalExpAuto.g:5186:3: RULE_INT
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
    // InternalExpAuto.g:5195:1: rule__Variation__ValueProviderAssignment_13 : ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) ;
    public final void rule__Variation__ValueProviderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5199:1: ( ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) )
            // InternalExpAuto.g:5200:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            {
            // InternalExpAuto.g:5200:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            // InternalExpAuto.g:5201:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 
            // InternalExpAuto.g:5202:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            // InternalExpAuto.g:5202:4: rule__Variation__ValueProviderAlternatives_13_0
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
    // InternalExpAuto.g:5210:1: rule__NestedIntervalsValueProvider__MinAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5214:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5215:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5215:2: ( RULE_INT )
            // InternalExpAuto.g:5216:3: RULE_INT
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
    // InternalExpAuto.g:5225:1: rule__NestedIntervalsValueProvider__MaxAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5229:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5230:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5230:2: ( RULE_INT )
            // InternalExpAuto.g:5231:3: RULE_INT
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
    // InternalExpAuto.g:5240:1: rule__NestedIntervalsValueProvider__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5244:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5245:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5245:2: ( RULE_INT )
            // InternalExpAuto.g:5246:3: RULE_INT
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
    // InternalExpAuto.g:5255:1: rule__NestedIntervalsValueProvider__MaxAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5259:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5260:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5260:2: ( RULE_INT )
            // InternalExpAuto.g:5261:3: RULE_INT
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
    // InternalExpAuto.g:5270:1: rule__SetValueProvider__ValuesAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5274:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5275:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5275:2: ( RULE_INT )
            // InternalExpAuto.g:5276:3: RULE_INT
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
    // InternalExpAuto.g:5285:1: rule__SetValueProvider__ValuesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5289:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5290:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5290:2: ( RULE_INT )
            // InternalExpAuto.g:5291:3: RULE_INT
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
    // InternalExpAuto.g:5300:1: rule__SetValueProvider__ValuesAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5304:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5305:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5305:2: ( RULE_INT )
            // InternalExpAuto.g:5306:3: RULE_INT
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
    // InternalExpAuto.g:5315:1: rule__SetValueProvider__ValuesAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5319:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5320:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5320:2: ( RULE_INT )
            // InternalExpAuto.g:5321:3: RULE_INT
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
    // InternalExpAuto.g:5330:1: rule__LinearValueProvider__SummandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__SummandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5334:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5335:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5335:2: ( RULE_INT )
            // InternalExpAuto.g:5336:3: RULE_INT
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
    // InternalExpAuto.g:5345:1: rule__LinearValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5349:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5350:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5350:2: ( RULE_INT )
            // InternalExpAuto.g:5351:3: RULE_INT
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
    // InternalExpAuto.g:5360:1: rule__ExponentialValueProvider__BaseAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExponentialValueProvider__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5364:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5365:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5365:2: ( RULE_INT )
            // InternalExpAuto.g:5366:3: RULE_INT
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
    // InternalExpAuto.g:5375:1: rule__PolynomialValueProvider__ExponentAssignment_2 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5379:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5380:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5380:2: ( RULE_INT )
            // InternalExpAuto.g:5381:3: RULE_INT
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
    // InternalExpAuto.g:5390:1: rule__PolynomialValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5394:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5395:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5395:2: ( RULE_INT )
            // InternalExpAuto.g:5396:3: RULE_INT
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
    // InternalExpAuto.g:5405:1: rule__StopTimeCondition__StopTypAssignment_2 : ( ( 'simulationTime' ) ) ;
    public final void rule__StopTimeCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5409:1: ( ( ( 'simulationTime' ) ) )
            // InternalExpAuto.g:5410:2: ( ( 'simulationTime' ) )
            {
            // InternalExpAuto.g:5410:2: ( ( 'simulationTime' ) )
            // InternalExpAuto.g:5411:3: ( 'simulationTime' )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            // InternalExpAuto.g:5412:3: ( 'simulationTime' )
            // InternalExpAuto.g:5413:4: 'simulationTime'
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalExpAuto.g:5424:1: rule__StopTimeCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopTimeCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5428:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5429:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5429:2: ( RULE_INT )
            // InternalExpAuto.g:5430:3: RULE_INT
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
    // InternalExpAuto.g:5439:1: rule__StopCountCondition__StopTypAssignment_2 : ( ( 'measurementCount' ) ) ;
    public final void rule__StopCountCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5443:1: ( ( ( 'measurementCount' ) ) )
            // InternalExpAuto.g:5444:2: ( ( 'measurementCount' ) )
            {
            // InternalExpAuto.g:5444:2: ( ( 'measurementCount' ) )
            // InternalExpAuto.g:5445:3: ( 'measurementCount' )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            // InternalExpAuto.g:5446:3: ( 'measurementCount' )
            // InternalExpAuto.g:5447:4: 'measurementCount'
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalExpAuto.g:5458:1: rule__StopCountCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopCountCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5462:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5463:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5463:2: ( RULE_INT )
            // InternalExpAuto.g:5464:3: RULE_INT
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
    // InternalExpAuto.g:5473:1: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5477:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5478:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5478:2: ( RULE_INT )
            // InternalExpAuto.g:5479:3: RULE_INT
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
    // InternalExpAuto.g:5488:1: rule__SeedDefinition__SeedListsAssignment_3 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5492:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5493:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5493:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5494:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5503:1: rule__SeedDefinition__SeedListsAssignment_4_1 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5507:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5508:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5508:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5509:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5518:1: rule__ListOfSeeds__SeedsAssignment_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5522:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5523:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5523:2: ( RULE_INT )
            // InternalExpAuto.g:5524:3: RULE_INT
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
    // InternalExpAuto.g:5533:1: rule__ListOfSeeds__SeedsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5537:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5538:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5538:2: ( RULE_INT )
            // InternalExpAuto.g:5539:3: RULE_INT
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
    // InternalExpAuto.g:5548:1: rule__ExperimentDatasource__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExperimentDatasource__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5552:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5553:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5553:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5554:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalExpAuto.g:5555:3: ( RULE_ID )
            // InternalExpAuto.g:5556:4: RULE_ID
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
    // InternalExpAuto.g:5567:1: rule__ToolDefinition__ToolAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ToolDefinition__ToolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5571:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5572:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5572:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5573:3: ( RULE_ID )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolEObjectWithNameCrossReference_2_0()); 
            // InternalExpAuto.g:5574:3: ( RULE_ID )
            // InternalExpAuto.g:5575:4: RULE_ID
            {
             before(grammarAccess.getToolDefinitionAccess().getToolEObjectWithNameIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToolDefinitionAccess().getToolEObjectWithNameIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getToolDefinitionAccess().getToolEObjectWithNameCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ToolDefinition__ConfigParamsAssignment_3_1"
    // InternalExpAuto.g:5586:1: rule__ToolDefinition__ConfigParamsAssignment_3_1 : ( ruleConfigurationParams ) ;
    public final void rule__ToolDefinition__ConfigParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5590:1: ( ( ruleConfigurationParams ) )
            // InternalExpAuto.g:5591:2: ( ruleConfigurationParams )
            {
            // InternalExpAuto.g:5591:2: ( ruleConfigurationParams )
            // InternalExpAuto.g:5592:3: ruleConfigurationParams
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationParams();

            state._fsp--;

             after(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToolDefinition__ConfigParamsAssignment_3_1"


    // $ANTLR start "rule__ConfigurationParams__KeyAssignment_0"
    // InternalExpAuto.g:5601:1: rule__ConfigurationParams__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigurationParams__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5605:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5606:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5606:2: ( RULE_ID )
            // InternalExpAuto.g:5607:3: RULE_ID
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
    // InternalExpAuto.g:5616:1: rule__ConfigurationParams__ValueAssignment_2 : ( ruleConfigValue ) ;
    public final void rule__ConfigurationParams__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5620:1: ( ( ruleConfigValue ) )
            // InternalExpAuto.g:5621:2: ( ruleConfigValue )
            {
            // InternalExpAuto.g:5621:2: ( ruleConfigValue )
            // InternalExpAuto.g:5622:3: ruleConfigValue
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
    static final String dfa_2s = "\1\16\3\uffff\1\26\4\uffff\1\57\2\uffff";
    static final String dfa_3s = "\1\54\3\uffff\1\26\4\uffff\1\60\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\4\1\5";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\6\uffff\1\1\1\uffff\1\2\5\uffff\1\3\13\uffff\1\4\1\5\1\7\1\6",
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
            return "787:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) );";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001E0020A04000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
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
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});

}