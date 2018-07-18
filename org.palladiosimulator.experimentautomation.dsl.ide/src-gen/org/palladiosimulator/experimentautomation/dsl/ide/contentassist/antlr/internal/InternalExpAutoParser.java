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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FullFactorial'", "'OneFactor'", "'import'", "'datasource'", "':'", "'('", "')'", "'experiment'", "'{'", "'}'", "'description'", "'='", "'initial'", "'allocation'", "'usageModel'", "'middlewareRepository'", "'eventMiddlewareRepository'", "'monitorRepository'", "'variation'", "'target'", "'maxVariations'", "'values'", "'['", "','", "']'", "'nestedIntervall'", "'setValues'", "'linear'", "'exponential'", "'polynomial'", "'stop'", "'repetitions'", "'tool'", "'seeds'", "'EDP2'", "'PCM'", "'simulationTime'", "'measurementCount'"
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


    // $ANTLR start "entryRuleDatasourceSpecification"
    // InternalExpAuto.g:128:1: entryRuleDatasourceSpecification : ruleDatasourceSpecification EOF ;
    public final void entryRuleDatasourceSpecification() throws RecognitionException {
        try {
            // InternalExpAuto.g:129:1: ( ruleDatasourceSpecification EOF )
            // InternalExpAuto.g:130:1: ruleDatasourceSpecification EOF
            {
             before(grammarAccess.getDatasourceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleDatasourceSpecification();

            state._fsp--;

             after(grammarAccess.getDatasourceSpecificationRule()); 
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
    // $ANTLR end "entryRuleDatasourceSpecification"


    // $ANTLR start "ruleDatasourceSpecification"
    // InternalExpAuto.g:137:1: ruleDatasourceSpecification : ( ( rule__DatasourceSpecification__SpecificationAssignment ) ) ;
    public final void ruleDatasourceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:141:2: ( ( ( rule__DatasourceSpecification__SpecificationAssignment ) ) )
            // InternalExpAuto.g:142:2: ( ( rule__DatasourceSpecification__SpecificationAssignment ) )
            {
            // InternalExpAuto.g:142:2: ( ( rule__DatasourceSpecification__SpecificationAssignment ) )
            // InternalExpAuto.g:143:3: ( rule__DatasourceSpecification__SpecificationAssignment )
            {
             before(grammarAccess.getDatasourceSpecificationAccess().getSpecificationAssignment()); 
            // InternalExpAuto.g:144:3: ( rule__DatasourceSpecification__SpecificationAssignment )
            // InternalExpAuto.g:144:4: rule__DatasourceSpecification__SpecificationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DatasourceSpecification__SpecificationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceSpecificationAccess().getSpecificationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatasourceSpecification"


    // $ANTLR start "entryRuleFileDatasourceSpecification"
    // InternalExpAuto.g:153:1: entryRuleFileDatasourceSpecification : ruleFileDatasourceSpecification EOF ;
    public final void entryRuleFileDatasourceSpecification() throws RecognitionException {
        try {
            // InternalExpAuto.g:154:1: ( ruleFileDatasourceSpecification EOF )
            // InternalExpAuto.g:155:1: ruleFileDatasourceSpecification EOF
            {
             before(grammarAccess.getFileDatasourceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFileDatasourceSpecification();

            state._fsp--;

             after(grammarAccess.getFileDatasourceSpecificationRule()); 
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
    // $ANTLR end "entryRuleFileDatasourceSpecification"


    // $ANTLR start "ruleFileDatasourceSpecification"
    // InternalExpAuto.g:162:1: ruleFileDatasourceSpecification : ( ( rule__FileDatasourceSpecification__Group__0 ) ) ;
    public final void ruleFileDatasourceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:166:2: ( ( ( rule__FileDatasourceSpecification__Group__0 ) ) )
            // InternalExpAuto.g:167:2: ( ( rule__FileDatasourceSpecification__Group__0 ) )
            {
            // InternalExpAuto.g:167:2: ( ( rule__FileDatasourceSpecification__Group__0 ) )
            // InternalExpAuto.g:168:3: ( rule__FileDatasourceSpecification__Group__0 )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getGroup()); 
            // InternalExpAuto.g:169:3: ( rule__FileDatasourceSpecification__Group__0 )
            // InternalExpAuto.g:169:4: rule__FileDatasourceSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileDatasourceSpecification"


    // $ANTLR start "entryRuleMemoryDatasourceSpecification"
    // InternalExpAuto.g:178:1: entryRuleMemoryDatasourceSpecification : ruleMemoryDatasourceSpecification EOF ;
    public final void entryRuleMemoryDatasourceSpecification() throws RecognitionException {
        try {
            // InternalExpAuto.g:179:1: ( ruleMemoryDatasourceSpecification EOF )
            // InternalExpAuto.g:180:1: ruleMemoryDatasourceSpecification EOF
            {
             before(grammarAccess.getMemoryDatasourceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleMemoryDatasourceSpecification();

            state._fsp--;

             after(grammarAccess.getMemoryDatasourceSpecificationRule()); 
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
    // $ANTLR end "entryRuleMemoryDatasourceSpecification"


    // $ANTLR start "ruleMemoryDatasourceSpecification"
    // InternalExpAuto.g:187:1: ruleMemoryDatasourceSpecification : ( ( rule__MemoryDatasourceSpecification__SourceTypeAssignment ) ) ;
    public final void ruleMemoryDatasourceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:191:2: ( ( ( rule__MemoryDatasourceSpecification__SourceTypeAssignment ) ) )
            // InternalExpAuto.g:192:2: ( ( rule__MemoryDatasourceSpecification__SourceTypeAssignment ) )
            {
            // InternalExpAuto.g:192:2: ( ( rule__MemoryDatasourceSpecification__SourceTypeAssignment ) )
            // InternalExpAuto.g:193:3: ( rule__MemoryDatasourceSpecification__SourceTypeAssignment )
            {
             before(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeAssignment()); 
            // InternalExpAuto.g:194:3: ( rule__MemoryDatasourceSpecification__SourceTypeAssignment )
            // InternalExpAuto.g:194:4: rule__MemoryDatasourceSpecification__SourceTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MemoryDatasourceSpecification__SourceTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryDatasourceSpecification"


    // $ANTLR start "entryRuleExperiment"
    // InternalExpAuto.g:203:1: entryRuleExperiment : ruleExperiment EOF ;
    public final void entryRuleExperiment() throws RecognitionException {
        try {
            // InternalExpAuto.g:204:1: ( ruleExperiment EOF )
            // InternalExpAuto.g:205:1: ruleExperiment EOF
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
    // InternalExpAuto.g:212:1: ruleExperiment : ( ( rule__Experiment__Group__0 ) ) ;
    public final void ruleExperiment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:216:2: ( ( ( rule__Experiment__Group__0 ) ) )
            // InternalExpAuto.g:217:2: ( ( rule__Experiment__Group__0 ) )
            {
            // InternalExpAuto.g:217:2: ( ( rule__Experiment__Group__0 ) )
            // InternalExpAuto.g:218:3: ( rule__Experiment__Group__0 )
            {
             before(grammarAccess.getExperimentAccess().getGroup()); 
            // InternalExpAuto.g:219:3: ( rule__Experiment__Group__0 )
            // InternalExpAuto.g:219:4: rule__Experiment__Group__0
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
    // InternalExpAuto.g:228:1: entryRuleExperimentSpecifications : ruleExperimentSpecifications EOF ;
    public final void entryRuleExperimentSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:229:1: ( ruleExperimentSpecifications EOF )
            // InternalExpAuto.g:230:1: ruleExperimentSpecifications EOF
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
    // InternalExpAuto.g:237:1: ruleExperimentSpecifications : ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleExperimentSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:241:2: ( ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:242:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:242:2: ( ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:243:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) ) ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:243:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:244:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:245:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:245:5: rule__ExperimentSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:248:3: ( ( rule__ExperimentSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:249:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:250:4: ( rule__ExperimentSpecifications__SpecificationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==21||LA1_0==23||LA1_0==29||(LA1_0>=41 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpAuto.g:250:5: rule__ExperimentSpecifications__SpecificationsAssignment
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
    // InternalExpAuto.g:260:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalExpAuto.g:261:1: ( ruleDescription EOF )
            // InternalExpAuto.g:262:1: ruleDescription EOF
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
    // InternalExpAuto.g:269:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:273:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalExpAuto.g:274:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalExpAuto.g:274:2: ( ( rule__Description__Group__0 ) )
            // InternalExpAuto.g:275:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalExpAuto.g:276:3: ( rule__Description__Group__0 )
            // InternalExpAuto.g:276:4: rule__Description__Group__0
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
    // InternalExpAuto.g:285:1: entryRuleInitialModel : ruleInitialModel EOF ;
    public final void entryRuleInitialModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:286:1: ( ruleInitialModel EOF )
            // InternalExpAuto.g:287:1: ruleInitialModel EOF
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
    // InternalExpAuto.g:294:1: ruleInitialModel : ( ( rule__InitialModel__Group__0 ) ) ;
    public final void ruleInitialModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:298:2: ( ( ( rule__InitialModel__Group__0 ) ) )
            // InternalExpAuto.g:299:2: ( ( rule__InitialModel__Group__0 ) )
            {
            // InternalExpAuto.g:299:2: ( ( rule__InitialModel__Group__0 ) )
            // InternalExpAuto.g:300:3: ( rule__InitialModel__Group__0 )
            {
             before(grammarAccess.getInitialModelAccess().getGroup()); 
            // InternalExpAuto.g:301:3: ( rule__InitialModel__Group__0 )
            // InternalExpAuto.g:301:4: rule__InitialModel__Group__0
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
    // InternalExpAuto.g:310:1: entryRuleInitSpecifications : ruleInitSpecifications EOF ;
    public final void entryRuleInitSpecifications() throws RecognitionException {
        try {
            // InternalExpAuto.g:311:1: ( ruleInitSpecifications EOF )
            // InternalExpAuto.g:312:1: ruleInitSpecifications EOF
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
    // InternalExpAuto.g:319:1: ruleInitSpecifications : ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) ;
    public final void ruleInitSpecifications() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:323:2: ( ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) ) )
            // InternalExpAuto.g:324:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            {
            // InternalExpAuto.g:324:2: ( ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* ) )
            // InternalExpAuto.g:325:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) ) ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            {
            // InternalExpAuto.g:325:3: ( ( rule__InitSpecifications__SpecificationsAssignment ) )
            // InternalExpAuto.g:326:4: ( rule__InitSpecifications__SpecificationsAssignment )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:327:4: ( rule__InitSpecifications__SpecificationsAssignment )
            // InternalExpAuto.g:327:5: rule__InitSpecifications__SpecificationsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__InitSpecifications__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 

            }

            // InternalExpAuto.g:330:3: ( ( rule__InitSpecifications__SpecificationsAssignment )* )
            // InternalExpAuto.g:331:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment()); 
            // InternalExpAuto.g:332:4: ( rule__InitSpecifications__SpecificationsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=28)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpAuto.g:332:5: rule__InitSpecifications__SpecificationsAssignment
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
    // InternalExpAuto.g:342:1: entryRuleAllocationModel : ruleAllocationModel EOF ;
    public final void entryRuleAllocationModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:343:1: ( ruleAllocationModel EOF )
            // InternalExpAuto.g:344:1: ruleAllocationModel EOF
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
    // InternalExpAuto.g:351:1: ruleAllocationModel : ( ( rule__AllocationModel__Group__0 ) ) ;
    public final void ruleAllocationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:355:2: ( ( ( rule__AllocationModel__Group__0 ) ) )
            // InternalExpAuto.g:356:2: ( ( rule__AllocationModel__Group__0 ) )
            {
            // InternalExpAuto.g:356:2: ( ( rule__AllocationModel__Group__0 ) )
            // InternalExpAuto.g:357:3: ( rule__AllocationModel__Group__0 )
            {
             before(grammarAccess.getAllocationModelAccess().getGroup()); 
            // InternalExpAuto.g:358:3: ( rule__AllocationModel__Group__0 )
            // InternalExpAuto.g:358:4: rule__AllocationModel__Group__0
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
    // InternalExpAuto.g:367:1: entryRuleUsageModel : ruleUsageModel EOF ;
    public final void entryRuleUsageModel() throws RecognitionException {
        try {
            // InternalExpAuto.g:368:1: ( ruleUsageModel EOF )
            // InternalExpAuto.g:369:1: ruleUsageModel EOF
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
    // InternalExpAuto.g:376:1: ruleUsageModel : ( ( rule__UsageModel__Group__0 ) ) ;
    public final void ruleUsageModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:380:2: ( ( ( rule__UsageModel__Group__0 ) ) )
            // InternalExpAuto.g:381:2: ( ( rule__UsageModel__Group__0 ) )
            {
            // InternalExpAuto.g:381:2: ( ( rule__UsageModel__Group__0 ) )
            // InternalExpAuto.g:382:3: ( rule__UsageModel__Group__0 )
            {
             before(grammarAccess.getUsageModelAccess().getGroup()); 
            // InternalExpAuto.g:383:3: ( rule__UsageModel__Group__0 )
            // InternalExpAuto.g:383:4: rule__UsageModel__Group__0
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
    // InternalExpAuto.g:392:1: entryRuleMiddlewareRepository : ruleMiddlewareRepository EOF ;
    public final void entryRuleMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:393:1: ( ruleMiddlewareRepository EOF )
            // InternalExpAuto.g:394:1: ruleMiddlewareRepository EOF
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
    // InternalExpAuto.g:401:1: ruleMiddlewareRepository : ( ( rule__MiddlewareRepository__Group__0 ) ) ;
    public final void ruleMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:405:2: ( ( ( rule__MiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:406:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:406:2: ( ( rule__MiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:407:3: ( rule__MiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:408:3: ( rule__MiddlewareRepository__Group__0 )
            // InternalExpAuto.g:408:4: rule__MiddlewareRepository__Group__0
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
    // InternalExpAuto.g:417:1: entryRuleEventMiddlewareRepository : ruleEventMiddlewareRepository EOF ;
    public final void entryRuleEventMiddlewareRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:418:1: ( ruleEventMiddlewareRepository EOF )
            // InternalExpAuto.g:419:1: ruleEventMiddlewareRepository EOF
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
    // InternalExpAuto.g:426:1: ruleEventMiddlewareRepository : ( ( rule__EventMiddlewareRepository__Group__0 ) ) ;
    public final void ruleEventMiddlewareRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:430:2: ( ( ( rule__EventMiddlewareRepository__Group__0 ) ) )
            // InternalExpAuto.g:431:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            {
            // InternalExpAuto.g:431:2: ( ( rule__EventMiddlewareRepository__Group__0 ) )
            // InternalExpAuto.g:432:3: ( rule__EventMiddlewareRepository__Group__0 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:433:3: ( rule__EventMiddlewareRepository__Group__0 )
            // InternalExpAuto.g:433:4: rule__EventMiddlewareRepository__Group__0
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
    // InternalExpAuto.g:442:1: entryRuleMonitorRepository : ruleMonitorRepository EOF ;
    public final void entryRuleMonitorRepository() throws RecognitionException {
        try {
            // InternalExpAuto.g:443:1: ( ruleMonitorRepository EOF )
            // InternalExpAuto.g:444:1: ruleMonitorRepository EOF
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
    // InternalExpAuto.g:451:1: ruleMonitorRepository : ( ( rule__MonitorRepository__Group__0 ) ) ;
    public final void ruleMonitorRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:455:2: ( ( ( rule__MonitorRepository__Group__0 ) ) )
            // InternalExpAuto.g:456:2: ( ( rule__MonitorRepository__Group__0 ) )
            {
            // InternalExpAuto.g:456:2: ( ( rule__MonitorRepository__Group__0 ) )
            // InternalExpAuto.g:457:3: ( rule__MonitorRepository__Group__0 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getGroup()); 
            // InternalExpAuto.g:458:3: ( rule__MonitorRepository__Group__0 )
            // InternalExpAuto.g:458:4: rule__MonitorRepository__Group__0
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
    // InternalExpAuto.g:467:1: entryRuleVariation : ruleVariation EOF ;
    public final void entryRuleVariation() throws RecognitionException {
        try {
            // InternalExpAuto.g:468:1: ( ruleVariation EOF )
            // InternalExpAuto.g:469:1: ruleVariation EOF
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
    // InternalExpAuto.g:476:1: ruleVariation : ( ( rule__Variation__Group__0 ) ) ;
    public final void ruleVariation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:480:2: ( ( ( rule__Variation__Group__0 ) ) )
            // InternalExpAuto.g:481:2: ( ( rule__Variation__Group__0 ) )
            {
            // InternalExpAuto.g:481:2: ( ( rule__Variation__Group__0 ) )
            // InternalExpAuto.g:482:3: ( rule__Variation__Group__0 )
            {
             before(grammarAccess.getVariationAccess().getGroup()); 
            // InternalExpAuto.g:483:3: ( rule__Variation__Group__0 )
            // InternalExpAuto.g:483:4: rule__Variation__Group__0
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
    // InternalExpAuto.g:492:1: entryRuleNestedIntervalsValueProvider : ruleNestedIntervalsValueProvider EOF ;
    public final void entryRuleNestedIntervalsValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:493:1: ( ruleNestedIntervalsValueProvider EOF )
            // InternalExpAuto.g:494:1: ruleNestedIntervalsValueProvider EOF
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
    // InternalExpAuto.g:501:1: ruleNestedIntervalsValueProvider : ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) ;
    public final void ruleNestedIntervalsValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:505:2: ( ( ( rule__NestedIntervalsValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:506:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:506:2: ( ( rule__NestedIntervalsValueProvider__Alternatives ) )
            // InternalExpAuto.g:507:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:508:3: ( rule__NestedIntervalsValueProvider__Alternatives )
            // InternalExpAuto.g:508:4: rule__NestedIntervalsValueProvider__Alternatives
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
    // InternalExpAuto.g:517:1: entryRuleSetValueProvider : ruleSetValueProvider EOF ;
    public final void entryRuleSetValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:518:1: ( ruleSetValueProvider EOF )
            // InternalExpAuto.g:519:1: ruleSetValueProvider EOF
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
    // InternalExpAuto.g:526:1: ruleSetValueProvider : ( ( rule__SetValueProvider__Alternatives ) ) ;
    public final void ruleSetValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:530:2: ( ( ( rule__SetValueProvider__Alternatives ) ) )
            // InternalExpAuto.g:531:2: ( ( rule__SetValueProvider__Alternatives ) )
            {
            // InternalExpAuto.g:531:2: ( ( rule__SetValueProvider__Alternatives ) )
            // InternalExpAuto.g:532:3: ( rule__SetValueProvider__Alternatives )
            {
             before(grammarAccess.getSetValueProviderAccess().getAlternatives()); 
            // InternalExpAuto.g:533:3: ( rule__SetValueProvider__Alternatives )
            // InternalExpAuto.g:533:4: rule__SetValueProvider__Alternatives
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
    // InternalExpAuto.g:542:1: entryRuleLinearValueProvider : ruleLinearValueProvider EOF ;
    public final void entryRuleLinearValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:543:1: ( ruleLinearValueProvider EOF )
            // InternalExpAuto.g:544:1: ruleLinearValueProvider EOF
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
    // InternalExpAuto.g:551:1: ruleLinearValueProvider : ( ( rule__LinearValueProvider__Group__0 ) ) ;
    public final void ruleLinearValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:555:2: ( ( ( rule__LinearValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:556:2: ( ( rule__LinearValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:556:2: ( ( rule__LinearValueProvider__Group__0 ) )
            // InternalExpAuto.g:557:3: ( rule__LinearValueProvider__Group__0 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:558:3: ( rule__LinearValueProvider__Group__0 )
            // InternalExpAuto.g:558:4: rule__LinearValueProvider__Group__0
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
    // InternalExpAuto.g:567:1: entryRuleExponentialValueProvider : ruleExponentialValueProvider EOF ;
    public final void entryRuleExponentialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:568:1: ( ruleExponentialValueProvider EOF )
            // InternalExpAuto.g:569:1: ruleExponentialValueProvider EOF
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
    // InternalExpAuto.g:576:1: ruleExponentialValueProvider : ( ( rule__ExponentialValueProvider__Group__0 ) ) ;
    public final void ruleExponentialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:580:2: ( ( ( rule__ExponentialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:581:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:581:2: ( ( rule__ExponentialValueProvider__Group__0 ) )
            // InternalExpAuto.g:582:3: ( rule__ExponentialValueProvider__Group__0 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:583:3: ( rule__ExponentialValueProvider__Group__0 )
            // InternalExpAuto.g:583:4: rule__ExponentialValueProvider__Group__0
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
    // InternalExpAuto.g:592:1: entryRulePolynomialValueProvider : rulePolynomialValueProvider EOF ;
    public final void entryRulePolynomialValueProvider() throws RecognitionException {
        try {
            // InternalExpAuto.g:593:1: ( rulePolynomialValueProvider EOF )
            // InternalExpAuto.g:594:1: rulePolynomialValueProvider EOF
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
    // InternalExpAuto.g:601:1: rulePolynomialValueProvider : ( ( rule__PolynomialValueProvider__Group__0 ) ) ;
    public final void rulePolynomialValueProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:605:2: ( ( ( rule__PolynomialValueProvider__Group__0 ) ) )
            // InternalExpAuto.g:606:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            {
            // InternalExpAuto.g:606:2: ( ( rule__PolynomialValueProvider__Group__0 ) )
            // InternalExpAuto.g:607:3: ( rule__PolynomialValueProvider__Group__0 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getGroup()); 
            // InternalExpAuto.g:608:3: ( rule__PolynomialValueProvider__Group__0 )
            // InternalExpAuto.g:608:4: rule__PolynomialValueProvider__Group__0
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
    // InternalExpAuto.g:617:1: entryRuleStopTimeCondition : ruleStopTimeCondition EOF ;
    public final void entryRuleStopTimeCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:618:1: ( ruleStopTimeCondition EOF )
            // InternalExpAuto.g:619:1: ruleStopTimeCondition EOF
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
    // InternalExpAuto.g:626:1: ruleStopTimeCondition : ( ( rule__StopTimeCondition__Group__0 ) ) ;
    public final void ruleStopTimeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:630:2: ( ( ( rule__StopTimeCondition__Group__0 ) ) )
            // InternalExpAuto.g:631:2: ( ( rule__StopTimeCondition__Group__0 ) )
            {
            // InternalExpAuto.g:631:2: ( ( rule__StopTimeCondition__Group__0 ) )
            // InternalExpAuto.g:632:3: ( rule__StopTimeCondition__Group__0 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getGroup()); 
            // InternalExpAuto.g:633:3: ( rule__StopTimeCondition__Group__0 )
            // InternalExpAuto.g:633:4: rule__StopTimeCondition__Group__0
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
    // InternalExpAuto.g:642:1: entryRuleStopCountCondition : ruleStopCountCondition EOF ;
    public final void entryRuleStopCountCondition() throws RecognitionException {
        try {
            // InternalExpAuto.g:643:1: ( ruleStopCountCondition EOF )
            // InternalExpAuto.g:644:1: ruleStopCountCondition EOF
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
    // InternalExpAuto.g:651:1: ruleStopCountCondition : ( ( rule__StopCountCondition__Group__0 ) ) ;
    public final void ruleStopCountCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:655:2: ( ( ( rule__StopCountCondition__Group__0 ) ) )
            // InternalExpAuto.g:656:2: ( ( rule__StopCountCondition__Group__0 ) )
            {
            // InternalExpAuto.g:656:2: ( ( rule__StopCountCondition__Group__0 ) )
            // InternalExpAuto.g:657:3: ( rule__StopCountCondition__Group__0 )
            {
             before(grammarAccess.getStopCountConditionAccess().getGroup()); 
            // InternalExpAuto.g:658:3: ( rule__StopCountCondition__Group__0 )
            // InternalExpAuto.g:658:4: rule__StopCountCondition__Group__0
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
    // InternalExpAuto.g:667:1: entryRuleNumberOfExperiments : ruleNumberOfExperiments EOF ;
    public final void entryRuleNumberOfExperiments() throws RecognitionException {
        try {
            // InternalExpAuto.g:668:1: ( ruleNumberOfExperiments EOF )
            // InternalExpAuto.g:669:1: ruleNumberOfExperiments EOF
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
    // InternalExpAuto.g:676:1: ruleNumberOfExperiments : ( ( rule__NumberOfExperiments__Group__0 ) ) ;
    public final void ruleNumberOfExperiments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:680:2: ( ( ( rule__NumberOfExperiments__Group__0 ) ) )
            // InternalExpAuto.g:681:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            {
            // InternalExpAuto.g:681:2: ( ( rule__NumberOfExperiments__Group__0 ) )
            // InternalExpAuto.g:682:3: ( rule__NumberOfExperiments__Group__0 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getGroup()); 
            // InternalExpAuto.g:683:3: ( rule__NumberOfExperiments__Group__0 )
            // InternalExpAuto.g:683:4: rule__NumberOfExperiments__Group__0
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


    // $ANTLR start "entryRuleSeedDefinition"
    // InternalExpAuto.g:767:1: entryRuleSeedDefinition : ruleSeedDefinition EOF ;
    public final void entryRuleSeedDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:768:1: ( ruleSeedDefinition EOF )
            // InternalExpAuto.g:769:1: ruleSeedDefinition EOF
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
    // InternalExpAuto.g:776:1: ruleSeedDefinition : ( ( rule__SeedDefinition__Group__0 ) ) ;
    public final void ruleSeedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:780:2: ( ( ( rule__SeedDefinition__Group__0 ) ) )
            // InternalExpAuto.g:781:2: ( ( rule__SeedDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:781:2: ( ( rule__SeedDefinition__Group__0 ) )
            // InternalExpAuto.g:782:3: ( rule__SeedDefinition__Group__0 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:783:3: ( rule__SeedDefinition__Group__0 )
            // InternalExpAuto.g:783:4: rule__SeedDefinition__Group__0
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
    // InternalExpAuto.g:792:1: entryRuleListOfSeeds : ruleListOfSeeds EOF ;
    public final void entryRuleListOfSeeds() throws RecognitionException {
        try {
            // InternalExpAuto.g:793:1: ( ruleListOfSeeds EOF )
            // InternalExpAuto.g:794:1: ruleListOfSeeds EOF
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
    // InternalExpAuto.g:801:1: ruleListOfSeeds : ( ( rule__ListOfSeeds__Group__0 ) ) ;
    public final void ruleListOfSeeds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:805:2: ( ( ( rule__ListOfSeeds__Group__0 ) ) )
            // InternalExpAuto.g:806:2: ( ( rule__ListOfSeeds__Group__0 ) )
            {
            // InternalExpAuto.g:806:2: ( ( rule__ListOfSeeds__Group__0 ) )
            // InternalExpAuto.g:807:3: ( rule__ListOfSeeds__Group__0 )
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup()); 
            // InternalExpAuto.g:808:3: ( rule__ListOfSeeds__Group__0 )
            // InternalExpAuto.g:808:4: rule__ListOfSeeds__Group__0
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
    // InternalExpAuto.g:817:1: entryRuleExperimentDatasource : ruleExperimentDatasource EOF ;
    public final void entryRuleExperimentDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:818:1: ( ruleExperimentDatasource EOF )
            // InternalExpAuto.g:819:1: ruleExperimentDatasource EOF
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
    // InternalExpAuto.g:826:1: ruleExperimentDatasource : ( ( rule__ExperimentDatasource__Group__0 ) ) ;
    public final void ruleExperimentDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:830:2: ( ( ( rule__ExperimentDatasource__Group__0 ) ) )
            // InternalExpAuto.g:831:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:831:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            // InternalExpAuto.g:832:3: ( rule__ExperimentDatasource__Group__0 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:833:3: ( rule__ExperimentDatasource__Group__0 )
            // InternalExpAuto.g:833:4: rule__ExperimentDatasource__Group__0
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


    // $ANTLR start "rule__DatasourceSpecification__SpecificationAlternatives_0"
    // InternalExpAuto.g:841:1: rule__DatasourceSpecification__SpecificationAlternatives_0 : ( ( ruleFileDatasourceSpecification ) | ( ruleMemoryDatasourceSpecification ) );
    public final void rule__DatasourceSpecification__SpecificationAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:845:1: ( ( ruleFileDatasourceSpecification ) | ( ruleMemoryDatasourceSpecification ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==14||LA3_1==18) ) {
                    alt3=2;
                }
                else if ( (LA3_1==16) ) {
                    alt3=1;
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
                    // InternalExpAuto.g:846:2: ( ruleFileDatasourceSpecification )
                    {
                    // InternalExpAuto.g:846:2: ( ruleFileDatasourceSpecification )
                    // InternalExpAuto.g:847:3: ruleFileDatasourceSpecification
                    {
                     before(grammarAccess.getDatasourceSpecificationAccess().getSpecificationFileDatasourceSpecificationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFileDatasourceSpecification();

                    state._fsp--;

                     after(grammarAccess.getDatasourceSpecificationAccess().getSpecificationFileDatasourceSpecificationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:852:2: ( ruleMemoryDatasourceSpecification )
                    {
                    // InternalExpAuto.g:852:2: ( ruleMemoryDatasourceSpecification )
                    // InternalExpAuto.g:853:3: ruleMemoryDatasourceSpecification
                    {
                     before(grammarAccess.getDatasourceSpecificationAccess().getSpecificationMemoryDatasourceSpecificationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMemoryDatasourceSpecification();

                    state._fsp--;

                     after(grammarAccess.getDatasourceSpecificationAccess().getSpecificationMemoryDatasourceSpecificationParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DatasourceSpecification__SpecificationAlternatives_0"


    // $ANTLR start "rule__Experiment__DesignAlternatives_3_0"
    // InternalExpAuto.g:862:1: rule__Experiment__DesignAlternatives_3_0 : ( ( 'FullFactorial' ) | ( 'OneFactor' ) );
    public final void rule__Experiment__DesignAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:866:1: ( ( 'FullFactorial' ) | ( 'OneFactor' ) )
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
                    // InternalExpAuto.g:867:2: ( 'FullFactorial' )
                    {
                    // InternalExpAuto.g:867:2: ( 'FullFactorial' )
                    // InternalExpAuto.g:868:3: 'FullFactorial'
                    {
                     before(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:873:2: ( 'OneFactor' )
                    {
                    // InternalExpAuto.g:873:2: ( 'OneFactor' )
                    // InternalExpAuto.g:874:3: 'OneFactor'
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
    // InternalExpAuto.g:883:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) );
    public final void rule__ExperimentSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:887:1: ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalExpAuto.g:888:2: ( ruleDescription )
                    {
                    // InternalExpAuto.g:888:2: ( ruleDescription )
                    // InternalExpAuto.g:889:3: ruleDescription
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
                    // InternalExpAuto.g:894:2: ( ruleInitialModel )
                    {
                    // InternalExpAuto.g:894:2: ( ruleInitialModel )
                    // InternalExpAuto.g:895:3: ruleInitialModel
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
                    // InternalExpAuto.g:900:2: ( ruleVariation )
                    {
                    // InternalExpAuto.g:900:2: ( ruleVariation )
                    // InternalExpAuto.g:901:3: ruleVariation
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
                    // InternalExpAuto.g:906:2: ( ruleStopTimeCondition )
                    {
                    // InternalExpAuto.g:906:2: ( ruleStopTimeCondition )
                    // InternalExpAuto.g:907:3: ruleStopTimeCondition
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
                    // InternalExpAuto.g:912:2: ( ruleStopCountCondition )
                    {
                    // InternalExpAuto.g:912:2: ( ruleStopCountCondition )
                    // InternalExpAuto.g:913:3: ruleStopCountCondition
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
                    // InternalExpAuto.g:918:2: ( ruleNumberOfExperiments )
                    {
                    // InternalExpAuto.g:918:2: ( ruleNumberOfExperiments )
                    // InternalExpAuto.g:919:3: ruleNumberOfExperiments
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
                    // InternalExpAuto.g:924:2: ( ruleToolDefinition )
                    {
                    // InternalExpAuto.g:924:2: ( ruleToolDefinition )
                    // InternalExpAuto.g:925:3: ruleToolDefinition
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
                    // InternalExpAuto.g:930:2: ( ruleSeedDefinition )
                    {
                    // InternalExpAuto.g:930:2: ( ruleSeedDefinition )
                    // InternalExpAuto.g:931:3: ruleSeedDefinition
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
                    // InternalExpAuto.g:936:2: ( ruleExperimentDatasource )
                    {
                    // InternalExpAuto.g:936:2: ( ruleExperimentDatasource )
                    // InternalExpAuto.g:937:3: ruleExperimentDatasource
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
    // InternalExpAuto.g:946:1: rule__InitSpecifications__SpecificationsAlternatives_0 : ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) );
    public final void rule__InitSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:950:1: ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) )
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
                    // InternalExpAuto.g:951:2: ( ruleAllocationModel )
                    {
                    // InternalExpAuto.g:951:2: ( ruleAllocationModel )
                    // InternalExpAuto.g:952:3: ruleAllocationModel
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
                    // InternalExpAuto.g:957:2: ( ruleUsageModel )
                    {
                    // InternalExpAuto.g:957:2: ( ruleUsageModel )
                    // InternalExpAuto.g:958:3: ruleUsageModel
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
                    // InternalExpAuto.g:963:2: ( ruleMiddlewareRepository )
                    {
                    // InternalExpAuto.g:963:2: ( ruleMiddlewareRepository )
                    // InternalExpAuto.g:964:3: ruleMiddlewareRepository
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
                    // InternalExpAuto.g:969:2: ( ruleEventMiddlewareRepository )
                    {
                    // InternalExpAuto.g:969:2: ( ruleEventMiddlewareRepository )
                    // InternalExpAuto.g:970:3: ruleEventMiddlewareRepository
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
                    // InternalExpAuto.g:975:2: ( ruleMonitorRepository )
                    {
                    // InternalExpAuto.g:975:2: ( ruleMonitorRepository )
                    // InternalExpAuto.g:976:3: ruleMonitorRepository
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
    // InternalExpAuto.g:985:1: rule__Variation__ValueProviderAlternatives_13_0 : ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) );
    public final void rule__Variation__ValueProviderAlternatives_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:989:1: ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) )
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
                    // InternalExpAuto.g:990:2: ( ruleNestedIntervalsValueProvider )
                    {
                    // InternalExpAuto.g:990:2: ( ruleNestedIntervalsValueProvider )
                    // InternalExpAuto.g:991:3: ruleNestedIntervalsValueProvider
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
                    // InternalExpAuto.g:996:2: ( ruleSetValueProvider )
                    {
                    // InternalExpAuto.g:996:2: ( ruleSetValueProvider )
                    // InternalExpAuto.g:997:3: ruleSetValueProvider
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
                    // InternalExpAuto.g:1002:2: ( ruleLinearValueProvider )
                    {
                    // InternalExpAuto.g:1002:2: ( ruleLinearValueProvider )
                    // InternalExpAuto.g:1003:3: ruleLinearValueProvider
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
                    // InternalExpAuto.g:1008:2: ( ruleExponentialValueProvider )
                    {
                    // InternalExpAuto.g:1008:2: ( ruleExponentialValueProvider )
                    // InternalExpAuto.g:1009:3: ruleExponentialValueProvider
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
                    // InternalExpAuto.g:1014:2: ( rulePolynomialValueProvider )
                    {
                    // InternalExpAuto.g:1014:2: ( rulePolynomialValueProvider )
                    // InternalExpAuto.g:1015:3: rulePolynomialValueProvider
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
    // InternalExpAuto.g:1024:1: rule__NestedIntervalsValueProvider__Alternatives : ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) );
    public final void rule__NestedIntervalsValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1028:1: ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) )
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
                    // InternalExpAuto.g:1029:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1029:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1030:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1031:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1031:4: rule__NestedIntervalsValueProvider__Group_0__0
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
                    // InternalExpAuto.g:1035:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1035:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1036:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1037:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1037:4: rule__NestedIntervalsValueProvider__Group_1__0
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
    // InternalExpAuto.g:1045:1: rule__SetValueProvider__Alternatives : ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) );
    public final void rule__SetValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1049:1: ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) )
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
                    // InternalExpAuto.g:1050:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1050:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1051:3: ( rule__SetValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1052:3: ( rule__SetValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1052:4: rule__SetValueProvider__Group_0__0
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
                    // InternalExpAuto.g:1056:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1056:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1057:3: ( rule__SetValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1058:3: ( rule__SetValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1058:4: rule__SetValueProvider__Group_1__0
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
    // InternalExpAuto.g:1066:1: rule__ConfigValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__ConfigValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1070:1: ( ( RULE_STRING ) | ( RULE_INT ) )
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
                    // InternalExpAuto.g:1071:2: ( RULE_STRING )
                    {
                    // InternalExpAuto.g:1071:2: ( RULE_STRING )
                    // InternalExpAuto.g:1072:3: RULE_STRING
                    {
                     before(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1077:2: ( RULE_INT )
                    {
                    // InternalExpAuto.g:1077:2: ( RULE_INT )
                    // InternalExpAuto.g:1078:3: RULE_INT
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
    // InternalExpAuto.g:1087:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1091:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpAuto.g:1092:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalExpAuto.g:1099:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1103:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalExpAuto.g:1104:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalExpAuto.g:1104:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalExpAuto.g:1105:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalExpAuto.g:1105:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalExpAuto.g:1106:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1107:3: ( rule__Model__ImportsAssignment_0 )
            // InternalExpAuto.g:1107:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_6);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalExpAuto.g:1110:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalExpAuto.g:1111:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1112:3: ( rule__Model__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpAuto.g:1112:4: rule__Model__ImportsAssignment_0
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
    // InternalExpAuto.g:1121:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1125:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalExpAuto.g:1126:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalExpAuto.g:1133:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1137:1: ( ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) )
            // InternalExpAuto.g:1138:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            {
            // InternalExpAuto.g:1138:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            // InternalExpAuto.g:1139:2: ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* )
            {
            // InternalExpAuto.g:1139:2: ( ( rule__Model__DatasourcesAssignment_1 ) )
            // InternalExpAuto.g:1140:3: ( rule__Model__DatasourcesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1141:3: ( rule__Model__DatasourcesAssignment_1 )
            // InternalExpAuto.g:1141:4: rule__Model__DatasourcesAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Model__DatasourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }

            // InternalExpAuto.g:1144:2: ( ( rule__Model__DatasourcesAssignment_1 )* )
            // InternalExpAuto.g:1145:3: ( rule__Model__DatasourcesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1146:3: ( rule__Model__DatasourcesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpAuto.g:1146:4: rule__Model__DatasourcesAssignment_1
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
    // InternalExpAuto.g:1155:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1159:1: ( rule__Model__Group__2__Impl )
            // InternalExpAuto.g:1160:2: rule__Model__Group__2__Impl
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
    // InternalExpAuto.g:1166:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1170:1: ( ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) )
            // InternalExpAuto.g:1171:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            {
            // InternalExpAuto.g:1171:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            // InternalExpAuto.g:1172:2: ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* )
            {
            // InternalExpAuto.g:1172:2: ( ( rule__Model__ExperimentsAssignment_2 ) )
            // InternalExpAuto.g:1173:3: ( rule__Model__ExperimentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1174:3: ( rule__Model__ExperimentsAssignment_2 )
            // InternalExpAuto.g:1174:4: rule__Model__ExperimentsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Model__ExperimentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }

            // InternalExpAuto.g:1177:2: ( ( rule__Model__ExperimentsAssignment_2 )* )
            // InternalExpAuto.g:1178:3: ( rule__Model__ExperimentsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1179:3: ( rule__Model__ExperimentsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpAuto.g:1179:4: rule__Model__ExperimentsAssignment_2
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
    // InternalExpAuto.g:1189:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1193:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalExpAuto.g:1194:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalExpAuto.g:1201:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1205:1: ( ( 'import' ) )
            // InternalExpAuto.g:1206:1: ( 'import' )
            {
            // InternalExpAuto.g:1206:1: ( 'import' )
            // InternalExpAuto.g:1207:2: 'import'
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
    // InternalExpAuto.g:1216:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1220:1: ( rule__Import__Group__1__Impl )
            // InternalExpAuto.g:1221:2: rule__Import__Group__1__Impl
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
    // InternalExpAuto.g:1227:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1231:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalExpAuto.g:1232:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalExpAuto.g:1232:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalExpAuto.g:1233:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalExpAuto.g:1234:2: ( rule__Import__PathAssignment_1 )
            // InternalExpAuto.g:1234:3: rule__Import__PathAssignment_1
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
    // InternalExpAuto.g:1243:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1247:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalExpAuto.g:1248:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
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
    // InternalExpAuto.g:1255:1: rule__Datasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1259:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1260:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1260:1: ( 'datasource' )
            // InternalExpAuto.g:1261:2: 'datasource'
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
    // InternalExpAuto.g:1270:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1274:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalExpAuto.g:1275:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
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
    // InternalExpAuto.g:1282:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1286:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1287:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1287:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1288:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1289:2: ( rule__Datasource__NameAssignment_1 )
            // InternalExpAuto.g:1289:3: rule__Datasource__NameAssignment_1
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
    // InternalExpAuto.g:1297:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1301:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalExpAuto.g:1302:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
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
    // InternalExpAuto.g:1309:1: rule__Datasource__Group__2__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1313:1: ( ( ':' ) )
            // InternalExpAuto.g:1314:1: ( ':' )
            {
            // InternalExpAuto.g:1314:1: ( ':' )
            // InternalExpAuto.g:1315:2: ':'
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
    // InternalExpAuto.g:1324:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1328:1: ( rule__Datasource__Group__3__Impl )
            // InternalExpAuto.g:1329:2: rule__Datasource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalExpAuto.g:1335:1: rule__Datasource__Group__3__Impl : ( ( rule__Datasource__SpecificationAssignment_3 ) ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1339:1: ( ( ( rule__Datasource__SpecificationAssignment_3 ) ) )
            // InternalExpAuto.g:1340:1: ( ( rule__Datasource__SpecificationAssignment_3 ) )
            {
            // InternalExpAuto.g:1340:1: ( ( rule__Datasource__SpecificationAssignment_3 ) )
            // InternalExpAuto.g:1341:2: ( rule__Datasource__SpecificationAssignment_3 )
            {
             before(grammarAccess.getDatasourceAccess().getSpecificationAssignment_3()); 
            // InternalExpAuto.g:1342:2: ( rule__Datasource__SpecificationAssignment_3 )
            // InternalExpAuto.g:1342:3: rule__Datasource__SpecificationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__SpecificationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getSpecificationAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FileDatasourceSpecification__Group__0"
    // InternalExpAuto.g:1351:1: rule__FileDatasourceSpecification__Group__0 : rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1 ;
    public final void rule__FileDatasourceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1355:1: ( rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1 )
            // InternalExpAuto.g:1356:2: rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FileDatasourceSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__0"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__0__Impl"
    // InternalExpAuto.g:1363:1: rule__FileDatasourceSpecification__Group__0__Impl : ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) ) ;
    public final void rule__FileDatasourceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1367:1: ( ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) ) )
            // InternalExpAuto.g:1368:1: ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) )
            {
            // InternalExpAuto.g:1368:1: ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) )
            // InternalExpAuto.g:1369:2: ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeAssignment_0()); 
            // InternalExpAuto.g:1370:2: ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 )
            // InternalExpAuto.g:1370:3: rule__FileDatasourceSpecification__SourceTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__SourceTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__0__Impl"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__1"
    // InternalExpAuto.g:1378:1: rule__FileDatasourceSpecification__Group__1 : rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2 ;
    public final void rule__FileDatasourceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1382:1: ( rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2 )
            // InternalExpAuto.g:1383:2: rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FileDatasourceSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__1"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__1__Impl"
    // InternalExpAuto.g:1390:1: rule__FileDatasourceSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__FileDatasourceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1394:1: ( ( '(' ) )
            // InternalExpAuto.g:1395:1: ( '(' )
            {
            // InternalExpAuto.g:1395:1: ( '(' )
            // InternalExpAuto.g:1396:2: '('
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceSpecificationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__1__Impl"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__2"
    // InternalExpAuto.g:1405:1: rule__FileDatasourceSpecification__Group__2 : rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3 ;
    public final void rule__FileDatasourceSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1409:1: ( rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3 )
            // InternalExpAuto.g:1410:2: rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FileDatasourceSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__2"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__2__Impl"
    // InternalExpAuto.g:1417:1: rule__FileDatasourceSpecification__Group__2__Impl : ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) ) ;
    public final void rule__FileDatasourceSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1421:1: ( ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) ) )
            // InternalExpAuto.g:1422:1: ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) )
            {
            // InternalExpAuto.g:1422:1: ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) )
            // InternalExpAuto.g:1423:2: ( rule__FileDatasourceSpecification__SourceURIAssignment_2 )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURIAssignment_2()); 
            // InternalExpAuto.g:1424:2: ( rule__FileDatasourceSpecification__SourceURIAssignment_2 )
            // InternalExpAuto.g:1424:3: rule__FileDatasourceSpecification__SourceURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__SourceURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__2__Impl"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__3"
    // InternalExpAuto.g:1432:1: rule__FileDatasourceSpecification__Group__3 : rule__FileDatasourceSpecification__Group__3__Impl ;
    public final void rule__FileDatasourceSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1436:1: ( rule__FileDatasourceSpecification__Group__3__Impl )
            // InternalExpAuto.g:1437:2: rule__FileDatasourceSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDatasourceSpecification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__3"


    // $ANTLR start "rule__FileDatasourceSpecification__Group__3__Impl"
    // InternalExpAuto.g:1443:1: rule__FileDatasourceSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__FileDatasourceSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1447:1: ( ( ')' ) )
            // InternalExpAuto.g:1448:1: ( ')' )
            {
            // InternalExpAuto.g:1448:1: ( ')' )
            // InternalExpAuto.g:1449:2: ')'
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceSpecificationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__Group__3__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalExpAuto.g:1459:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1463:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalExpAuto.g:1464:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
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
    // InternalExpAuto.g:1471:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1475:1: ( ( 'experiment' ) )
            // InternalExpAuto.g:1476:1: ( 'experiment' )
            {
            // InternalExpAuto.g:1476:1: ( 'experiment' )
            // InternalExpAuto.g:1477:2: 'experiment'
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
    // InternalExpAuto.g:1486:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1490:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalExpAuto.g:1491:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
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
    // InternalExpAuto.g:1498:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1502:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1503:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1503:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalExpAuto.g:1504:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1505:2: ( rule__Experiment__NameAssignment_1 )
            // InternalExpAuto.g:1505:3: rule__Experiment__NameAssignment_1
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
    // InternalExpAuto.g:1513:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1517:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalExpAuto.g:1518:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
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
    // InternalExpAuto.g:1525:1: rule__Experiment__Group__2__Impl : ( ':' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1529:1: ( ( ':' ) )
            // InternalExpAuto.g:1530:1: ( ':' )
            {
            // InternalExpAuto.g:1530:1: ( ':' )
            // InternalExpAuto.g:1531:2: ':'
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
    // InternalExpAuto.g:1540:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1544:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalExpAuto.g:1545:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
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
    // InternalExpAuto.g:1552:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__DesignAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1556:1: ( ( ( rule__Experiment__DesignAssignment_3 ) ) )
            // InternalExpAuto.g:1557:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            {
            // InternalExpAuto.g:1557:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            // InternalExpAuto.g:1558:2: ( rule__Experiment__DesignAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 
            // InternalExpAuto.g:1559:2: ( rule__Experiment__DesignAssignment_3 )
            // InternalExpAuto.g:1559:3: rule__Experiment__DesignAssignment_3
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
    // InternalExpAuto.g:1567:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1571:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalExpAuto.g:1572:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
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
    // InternalExpAuto.g:1579:1: rule__Experiment__Group__4__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1583:1: ( ( '{' ) )
            // InternalExpAuto.g:1584:1: ( '{' )
            {
            // InternalExpAuto.g:1584:1: ( '{' )
            // InternalExpAuto.g:1585:2: '{'
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
    // InternalExpAuto.g:1594:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1598:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalExpAuto.g:1599:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
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
    // InternalExpAuto.g:1606:1: rule__Experiment__Group__5__Impl : ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1610:1: ( ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) )
            // InternalExpAuto.g:1611:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            {
            // InternalExpAuto.g:1611:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            // InternalExpAuto.g:1612:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 
            // InternalExpAuto.g:1613:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            // InternalExpAuto.g:1613:3: rule__Experiment__ExperimentSpecificationsAssignment_5
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
    // InternalExpAuto.g:1621:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1625:1: ( rule__Experiment__Group__6__Impl )
            // InternalExpAuto.g:1626:2: rule__Experiment__Group__6__Impl
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
    // InternalExpAuto.g:1632:1: rule__Experiment__Group__6__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1636:1: ( ( '}' ) )
            // InternalExpAuto.g:1637:1: ( '}' )
            {
            // InternalExpAuto.g:1637:1: ( '}' )
            // InternalExpAuto.g:1638:2: '}'
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
    // InternalExpAuto.g:1648:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1652:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalExpAuto.g:1653:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalExpAuto.g:1660:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1664:1: ( ( 'description' ) )
            // InternalExpAuto.g:1665:1: ( 'description' )
            {
            // InternalExpAuto.g:1665:1: ( 'description' )
            // InternalExpAuto.g:1666:2: 'description'
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
    // InternalExpAuto.g:1675:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1679:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalExpAuto.g:1680:2: rule__Description__Group__1__Impl rule__Description__Group__2
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
    // InternalExpAuto.g:1687:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1691:1: ( ( '=' ) )
            // InternalExpAuto.g:1692:1: ( '=' )
            {
            // InternalExpAuto.g:1692:1: ( '=' )
            // InternalExpAuto.g:1693:2: '='
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
    // InternalExpAuto.g:1702:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1706:1: ( rule__Description__Group__2__Impl )
            // InternalExpAuto.g:1707:2: rule__Description__Group__2__Impl
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
    // InternalExpAuto.g:1713:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1717:1: ( ( ( rule__Description__DescriptionAssignment_2 ) ) )
            // InternalExpAuto.g:1718:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            {
            // InternalExpAuto.g:1718:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            // InternalExpAuto.g:1719:2: ( rule__Description__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalExpAuto.g:1720:2: ( rule__Description__DescriptionAssignment_2 )
            // InternalExpAuto.g:1720:3: rule__Description__DescriptionAssignment_2
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
    // InternalExpAuto.g:1729:1: rule__InitialModel__Group__0 : rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 ;
    public final void rule__InitialModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1733:1: ( rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 )
            // InternalExpAuto.g:1734:2: rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1
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
    // InternalExpAuto.g:1741:1: rule__InitialModel__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1745:1: ( ( 'initial' ) )
            // InternalExpAuto.g:1746:1: ( 'initial' )
            {
            // InternalExpAuto.g:1746:1: ( 'initial' )
            // InternalExpAuto.g:1747:2: 'initial'
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
    // InternalExpAuto.g:1756:1: rule__InitialModel__Group__1 : rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 ;
    public final void rule__InitialModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1760:1: ( rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 )
            // InternalExpAuto.g:1761:2: rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2
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
    // InternalExpAuto.g:1768:1: rule__InitialModel__Group__1__Impl : ( '=' ) ;
    public final void rule__InitialModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1772:1: ( ( '=' ) )
            // InternalExpAuto.g:1773:1: ( '=' )
            {
            // InternalExpAuto.g:1773:1: ( '=' )
            // InternalExpAuto.g:1774:2: '='
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
    // InternalExpAuto.g:1783:1: rule__InitialModel__Group__2 : rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 ;
    public final void rule__InitialModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1787:1: ( rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 )
            // InternalExpAuto.g:1788:2: rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3
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
    // InternalExpAuto.g:1795:1: rule__InitialModel__Group__2__Impl : ( ( rule__InitialModel__ModeltypAssignment_2 ) ) ;
    public final void rule__InitialModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1799:1: ( ( ( rule__InitialModel__ModeltypAssignment_2 ) ) )
            // InternalExpAuto.g:1800:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            {
            // InternalExpAuto.g:1800:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            // InternalExpAuto.g:1801:2: ( rule__InitialModel__ModeltypAssignment_2 )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 
            // InternalExpAuto.g:1802:2: ( rule__InitialModel__ModeltypAssignment_2 )
            // InternalExpAuto.g:1802:3: rule__InitialModel__ModeltypAssignment_2
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
    // InternalExpAuto.g:1810:1: rule__InitialModel__Group__3 : rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 ;
    public final void rule__InitialModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1814:1: ( rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 )
            // InternalExpAuto.g:1815:2: rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4
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
    // InternalExpAuto.g:1822:1: rule__InitialModel__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1826:1: ( ( '{' ) )
            // InternalExpAuto.g:1827:1: ( '{' )
            {
            // InternalExpAuto.g:1827:1: ( '{' )
            // InternalExpAuto.g:1828:2: '{'
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
    // InternalExpAuto.g:1837:1: rule__InitialModel__Group__4 : rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 ;
    public final void rule__InitialModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1841:1: ( rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 )
            // InternalExpAuto.g:1842:2: rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5
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
    // InternalExpAuto.g:1849:1: rule__InitialModel__Group__4__Impl : ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) ;
    public final void rule__InitialModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1853:1: ( ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) )
            // InternalExpAuto.g:1854:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            {
            // InternalExpAuto.g:1854:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            // InternalExpAuto.g:1855:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 
            // InternalExpAuto.g:1856:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            // InternalExpAuto.g:1856:3: rule__InitialModel__InitSpecificationsAssignment_4
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
    // InternalExpAuto.g:1864:1: rule__InitialModel__Group__5 : rule__InitialModel__Group__5__Impl ;
    public final void rule__InitialModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1868:1: ( rule__InitialModel__Group__5__Impl )
            // InternalExpAuto.g:1869:2: rule__InitialModel__Group__5__Impl
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
    // InternalExpAuto.g:1875:1: rule__InitialModel__Group__5__Impl : ( '}' ) ;
    public final void rule__InitialModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1879:1: ( ( '}' ) )
            // InternalExpAuto.g:1880:1: ( '}' )
            {
            // InternalExpAuto.g:1880:1: ( '}' )
            // InternalExpAuto.g:1881:2: '}'
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
    // InternalExpAuto.g:1891:1: rule__AllocationModel__Group__0 : rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 ;
    public final void rule__AllocationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1895:1: ( rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 )
            // InternalExpAuto.g:1896:2: rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1
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
    // InternalExpAuto.g:1903:1: rule__AllocationModel__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__AllocationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1907:1: ( ( 'allocation' ) )
            // InternalExpAuto.g:1908:1: ( 'allocation' )
            {
            // InternalExpAuto.g:1908:1: ( 'allocation' )
            // InternalExpAuto.g:1909:2: 'allocation'
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
    // InternalExpAuto.g:1918:1: rule__AllocationModel__Group__1 : rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 ;
    public final void rule__AllocationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1922:1: ( rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 )
            // InternalExpAuto.g:1923:2: rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2
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
    // InternalExpAuto.g:1930:1: rule__AllocationModel__Group__1__Impl : ( '=' ) ;
    public final void rule__AllocationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1934:1: ( ( '=' ) )
            // InternalExpAuto.g:1935:1: ( '=' )
            {
            // InternalExpAuto.g:1935:1: ( '=' )
            // InternalExpAuto.g:1936:2: '='
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
    // InternalExpAuto.g:1945:1: rule__AllocationModel__Group__2 : rule__AllocationModel__Group__2__Impl ;
    public final void rule__AllocationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1949:1: ( rule__AllocationModel__Group__2__Impl )
            // InternalExpAuto.g:1950:2: rule__AllocationModel__Group__2__Impl
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
    // InternalExpAuto.g:1956:1: rule__AllocationModel__Group__2__Impl : ( ( rule__AllocationModel__AllocationAssignment_2 ) ) ;
    public final void rule__AllocationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1960:1: ( ( ( rule__AllocationModel__AllocationAssignment_2 ) ) )
            // InternalExpAuto.g:1961:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            {
            // InternalExpAuto.g:1961:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            // InternalExpAuto.g:1962:2: ( rule__AllocationModel__AllocationAssignment_2 )
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 
            // InternalExpAuto.g:1963:2: ( rule__AllocationModel__AllocationAssignment_2 )
            // InternalExpAuto.g:1963:3: rule__AllocationModel__AllocationAssignment_2
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
    // InternalExpAuto.g:1972:1: rule__UsageModel__Group__0 : rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 ;
    public final void rule__UsageModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1976:1: ( rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 )
            // InternalExpAuto.g:1977:2: rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1
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
    // InternalExpAuto.g:1984:1: rule__UsageModel__Group__0__Impl : ( 'usageModel' ) ;
    public final void rule__UsageModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1988:1: ( ( 'usageModel' ) )
            // InternalExpAuto.g:1989:1: ( 'usageModel' )
            {
            // InternalExpAuto.g:1989:1: ( 'usageModel' )
            // InternalExpAuto.g:1990:2: 'usageModel'
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
    // InternalExpAuto.g:1999:1: rule__UsageModel__Group__1 : rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 ;
    public final void rule__UsageModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2003:1: ( rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 )
            // InternalExpAuto.g:2004:2: rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2
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
    // InternalExpAuto.g:2011:1: rule__UsageModel__Group__1__Impl : ( '=' ) ;
    public final void rule__UsageModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2015:1: ( ( '=' ) )
            // InternalExpAuto.g:2016:1: ( '=' )
            {
            // InternalExpAuto.g:2016:1: ( '=' )
            // InternalExpAuto.g:2017:2: '='
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
    // InternalExpAuto.g:2026:1: rule__UsageModel__Group__2 : rule__UsageModel__Group__2__Impl ;
    public final void rule__UsageModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2030:1: ( rule__UsageModel__Group__2__Impl )
            // InternalExpAuto.g:2031:2: rule__UsageModel__Group__2__Impl
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
    // InternalExpAuto.g:2037:1: rule__UsageModel__Group__2__Impl : ( ( rule__UsageModel__UsageModelAssignment_2 ) ) ;
    public final void rule__UsageModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2041:1: ( ( ( rule__UsageModel__UsageModelAssignment_2 ) ) )
            // InternalExpAuto.g:2042:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            {
            // InternalExpAuto.g:2042:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            // InternalExpAuto.g:2043:2: ( rule__UsageModel__UsageModelAssignment_2 )
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 
            // InternalExpAuto.g:2044:2: ( rule__UsageModel__UsageModelAssignment_2 )
            // InternalExpAuto.g:2044:3: rule__UsageModel__UsageModelAssignment_2
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
    // InternalExpAuto.g:2053:1: rule__MiddlewareRepository__Group__0 : rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 ;
    public final void rule__MiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2057:1: ( rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2058:2: rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1
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
    // InternalExpAuto.g:2065:1: rule__MiddlewareRepository__Group__0__Impl : ( 'middlewareRepository' ) ;
    public final void rule__MiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2069:1: ( ( 'middlewareRepository' ) )
            // InternalExpAuto.g:2070:1: ( 'middlewareRepository' )
            {
            // InternalExpAuto.g:2070:1: ( 'middlewareRepository' )
            // InternalExpAuto.g:2071:2: 'middlewareRepository'
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
    // InternalExpAuto.g:2080:1: rule__MiddlewareRepository__Group__1 : rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 ;
    public final void rule__MiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2084:1: ( rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2085:2: rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2
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
    // InternalExpAuto.g:2092:1: rule__MiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2096:1: ( ( '=' ) )
            // InternalExpAuto.g:2097:1: ( '=' )
            {
            // InternalExpAuto.g:2097:1: ( '=' )
            // InternalExpAuto.g:2098:2: '='
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
    // InternalExpAuto.g:2107:1: rule__MiddlewareRepository__Group__2 : rule__MiddlewareRepository__Group__2__Impl ;
    public final void rule__MiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2111:1: ( rule__MiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2112:2: rule__MiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2118:1: rule__MiddlewareRepository__Group__2__Impl : ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) ;
    public final void rule__MiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2122:1: ( ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2123:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2123:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2124:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2125:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            // InternalExpAuto.g:2125:3: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2
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
    // InternalExpAuto.g:2134:1: rule__EventMiddlewareRepository__Group__0 : rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 ;
    public final void rule__EventMiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2138:1: ( rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2139:2: rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1
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
    // InternalExpAuto.g:2146:1: rule__EventMiddlewareRepository__Group__0__Impl : ( 'eventMiddlewareRepository' ) ;
    public final void rule__EventMiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2150:1: ( ( 'eventMiddlewareRepository' ) )
            // InternalExpAuto.g:2151:1: ( 'eventMiddlewareRepository' )
            {
            // InternalExpAuto.g:2151:1: ( 'eventMiddlewareRepository' )
            // InternalExpAuto.g:2152:2: 'eventMiddlewareRepository'
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
    // InternalExpAuto.g:2161:1: rule__EventMiddlewareRepository__Group__1 : rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 ;
    public final void rule__EventMiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2165:1: ( rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2166:2: rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2
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
    // InternalExpAuto.g:2173:1: rule__EventMiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__EventMiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2177:1: ( ( '=' ) )
            // InternalExpAuto.g:2178:1: ( '=' )
            {
            // InternalExpAuto.g:2178:1: ( '=' )
            // InternalExpAuto.g:2179:2: '='
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
    // InternalExpAuto.g:2188:1: rule__EventMiddlewareRepository__Group__2 : rule__EventMiddlewareRepository__Group__2__Impl ;
    public final void rule__EventMiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2192:1: ( rule__EventMiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2193:2: rule__EventMiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2199:1: rule__EventMiddlewareRepository__Group__2__Impl : ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) ;
    public final void rule__EventMiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2203:1: ( ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2204:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2204:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2205:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2206:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            // InternalExpAuto.g:2206:3: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2
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
    // InternalExpAuto.g:2215:1: rule__MonitorRepository__Group__0 : rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 ;
    public final void rule__MonitorRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2219:1: ( rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 )
            // InternalExpAuto.g:2220:2: rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1
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
    // InternalExpAuto.g:2227:1: rule__MonitorRepository__Group__0__Impl : ( 'monitorRepository' ) ;
    public final void rule__MonitorRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2231:1: ( ( 'monitorRepository' ) )
            // InternalExpAuto.g:2232:1: ( 'monitorRepository' )
            {
            // InternalExpAuto.g:2232:1: ( 'monitorRepository' )
            // InternalExpAuto.g:2233:2: 'monitorRepository'
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
    // InternalExpAuto.g:2242:1: rule__MonitorRepository__Group__1 : rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 ;
    public final void rule__MonitorRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2246:1: ( rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 )
            // InternalExpAuto.g:2247:2: rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2
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
    // InternalExpAuto.g:2254:1: rule__MonitorRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MonitorRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2258:1: ( ( '=' ) )
            // InternalExpAuto.g:2259:1: ( '=' )
            {
            // InternalExpAuto.g:2259:1: ( '=' )
            // InternalExpAuto.g:2260:2: '='
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
    // InternalExpAuto.g:2269:1: rule__MonitorRepository__Group__2 : rule__MonitorRepository__Group__2__Impl ;
    public final void rule__MonitorRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2273:1: ( rule__MonitorRepository__Group__2__Impl )
            // InternalExpAuto.g:2274:2: rule__MonitorRepository__Group__2__Impl
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
    // InternalExpAuto.g:2280:1: rule__MonitorRepository__Group__2__Impl : ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) ;
    public final void rule__MonitorRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2284:1: ( ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2285:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2285:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2286:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 
            // InternalExpAuto.g:2287:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            // InternalExpAuto.g:2287:3: rule__MonitorRepository__MonitorRepositoryAssignment_2
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
    // InternalExpAuto.g:2296:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2300:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // InternalExpAuto.g:2301:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
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
    // InternalExpAuto.g:2308:1: rule__Variation__Group__0__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2312:1: ( ( 'variation' ) )
            // InternalExpAuto.g:2313:1: ( 'variation' )
            {
            // InternalExpAuto.g:2313:1: ( 'variation' )
            // InternalExpAuto.g:2314:2: 'variation'
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
    // InternalExpAuto.g:2323:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2327:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // InternalExpAuto.g:2328:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
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
    // InternalExpAuto.g:2335:1: rule__Variation__Group__1__Impl : ( '=' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2339:1: ( ( '=' ) )
            // InternalExpAuto.g:2340:1: ( '=' )
            {
            // InternalExpAuto.g:2340:1: ( '=' )
            // InternalExpAuto.g:2341:2: '='
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
    // InternalExpAuto.g:2350:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2354:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // InternalExpAuto.g:2355:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
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
    // InternalExpAuto.g:2362:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__VariationTypAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2366:1: ( ( ( rule__Variation__VariationTypAssignment_2 ) ) )
            // InternalExpAuto.g:2367:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            {
            // InternalExpAuto.g:2367:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            // InternalExpAuto.g:2368:2: ( rule__Variation__VariationTypAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 
            // InternalExpAuto.g:2369:2: ( rule__Variation__VariationTypAssignment_2 )
            // InternalExpAuto.g:2369:3: rule__Variation__VariationTypAssignment_2
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
    // InternalExpAuto.g:2377:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl rule__Variation__Group__4 ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2381:1: ( rule__Variation__Group__3__Impl rule__Variation__Group__4 )
            // InternalExpAuto.g:2382:2: rule__Variation__Group__3__Impl rule__Variation__Group__4
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
    // InternalExpAuto.g:2389:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__NameAssignment_3 ) ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2393:1: ( ( ( rule__Variation__NameAssignment_3 ) ) )
            // InternalExpAuto.g:2394:1: ( ( rule__Variation__NameAssignment_3 ) )
            {
            // InternalExpAuto.g:2394:1: ( ( rule__Variation__NameAssignment_3 ) )
            // InternalExpAuto.g:2395:2: ( rule__Variation__NameAssignment_3 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_3()); 
            // InternalExpAuto.g:2396:2: ( rule__Variation__NameAssignment_3 )
            // InternalExpAuto.g:2396:3: rule__Variation__NameAssignment_3
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
    // InternalExpAuto.g:2404:1: rule__Variation__Group__4 : rule__Variation__Group__4__Impl rule__Variation__Group__5 ;
    public final void rule__Variation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2408:1: ( rule__Variation__Group__4__Impl rule__Variation__Group__5 )
            // InternalExpAuto.g:2409:2: rule__Variation__Group__4__Impl rule__Variation__Group__5
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
    // InternalExpAuto.g:2416:1: rule__Variation__Group__4__Impl : ( '{' ) ;
    public final void rule__Variation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2420:1: ( ( '{' ) )
            // InternalExpAuto.g:2421:1: ( '{' )
            {
            // InternalExpAuto.g:2421:1: ( '{' )
            // InternalExpAuto.g:2422:2: '{'
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
    // InternalExpAuto.g:2431:1: rule__Variation__Group__5 : rule__Variation__Group__5__Impl rule__Variation__Group__6 ;
    public final void rule__Variation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2435:1: ( rule__Variation__Group__5__Impl rule__Variation__Group__6 )
            // InternalExpAuto.g:2436:2: rule__Variation__Group__5__Impl rule__Variation__Group__6
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
    // InternalExpAuto.g:2443:1: rule__Variation__Group__5__Impl : ( 'target' ) ;
    public final void rule__Variation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2447:1: ( ( 'target' ) )
            // InternalExpAuto.g:2448:1: ( 'target' )
            {
            // InternalExpAuto.g:2448:1: ( 'target' )
            // InternalExpAuto.g:2449:2: 'target'
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
    // InternalExpAuto.g:2458:1: rule__Variation__Group__6 : rule__Variation__Group__6__Impl rule__Variation__Group__7 ;
    public final void rule__Variation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2462:1: ( rule__Variation__Group__6__Impl rule__Variation__Group__7 )
            // InternalExpAuto.g:2463:2: rule__Variation__Group__6__Impl rule__Variation__Group__7
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
    // InternalExpAuto.g:2470:1: rule__Variation__Group__6__Impl : ( '=' ) ;
    public final void rule__Variation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2474:1: ( ( '=' ) )
            // InternalExpAuto.g:2475:1: ( '=' )
            {
            // InternalExpAuto.g:2475:1: ( '=' )
            // InternalExpAuto.g:2476:2: '='
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
    // InternalExpAuto.g:2485:1: rule__Variation__Group__7 : rule__Variation__Group__7__Impl rule__Variation__Group__8 ;
    public final void rule__Variation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2489:1: ( rule__Variation__Group__7__Impl rule__Variation__Group__8 )
            // InternalExpAuto.g:2490:2: rule__Variation__Group__7__Impl rule__Variation__Group__8
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
    // InternalExpAuto.g:2497:1: rule__Variation__Group__7__Impl : ( ( rule__Variation__TargetAssignment_7 ) ) ;
    public final void rule__Variation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2501:1: ( ( ( rule__Variation__TargetAssignment_7 ) ) )
            // InternalExpAuto.g:2502:1: ( ( rule__Variation__TargetAssignment_7 ) )
            {
            // InternalExpAuto.g:2502:1: ( ( rule__Variation__TargetAssignment_7 ) )
            // InternalExpAuto.g:2503:2: ( rule__Variation__TargetAssignment_7 )
            {
             before(grammarAccess.getVariationAccess().getTargetAssignment_7()); 
            // InternalExpAuto.g:2504:2: ( rule__Variation__TargetAssignment_7 )
            // InternalExpAuto.g:2504:3: rule__Variation__TargetAssignment_7
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
    // InternalExpAuto.g:2512:1: rule__Variation__Group__8 : rule__Variation__Group__8__Impl rule__Variation__Group__9 ;
    public final void rule__Variation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2516:1: ( rule__Variation__Group__8__Impl rule__Variation__Group__9 )
            // InternalExpAuto.g:2517:2: rule__Variation__Group__8__Impl rule__Variation__Group__9
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
    // InternalExpAuto.g:2524:1: rule__Variation__Group__8__Impl : ( 'maxVariations' ) ;
    public final void rule__Variation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2528:1: ( ( 'maxVariations' ) )
            // InternalExpAuto.g:2529:1: ( 'maxVariations' )
            {
            // InternalExpAuto.g:2529:1: ( 'maxVariations' )
            // InternalExpAuto.g:2530:2: 'maxVariations'
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
    // InternalExpAuto.g:2539:1: rule__Variation__Group__9 : rule__Variation__Group__9__Impl rule__Variation__Group__10 ;
    public final void rule__Variation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2543:1: ( rule__Variation__Group__9__Impl rule__Variation__Group__10 )
            // InternalExpAuto.g:2544:2: rule__Variation__Group__9__Impl rule__Variation__Group__10
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
    // InternalExpAuto.g:2551:1: rule__Variation__Group__9__Impl : ( '=' ) ;
    public final void rule__Variation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2555:1: ( ( '=' ) )
            // InternalExpAuto.g:2556:1: ( '=' )
            {
            // InternalExpAuto.g:2556:1: ( '=' )
            // InternalExpAuto.g:2557:2: '='
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
    // InternalExpAuto.g:2566:1: rule__Variation__Group__10 : rule__Variation__Group__10__Impl rule__Variation__Group__11 ;
    public final void rule__Variation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2570:1: ( rule__Variation__Group__10__Impl rule__Variation__Group__11 )
            // InternalExpAuto.g:2571:2: rule__Variation__Group__10__Impl rule__Variation__Group__11
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
    // InternalExpAuto.g:2578:1: rule__Variation__Group__10__Impl : ( ( rule__Variation__MaxVariationsAssignment_10 ) ) ;
    public final void rule__Variation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2582:1: ( ( ( rule__Variation__MaxVariationsAssignment_10 ) ) )
            // InternalExpAuto.g:2583:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            {
            // InternalExpAuto.g:2583:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            // InternalExpAuto.g:2584:2: ( rule__Variation__MaxVariationsAssignment_10 )
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 
            // InternalExpAuto.g:2585:2: ( rule__Variation__MaxVariationsAssignment_10 )
            // InternalExpAuto.g:2585:3: rule__Variation__MaxVariationsAssignment_10
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
    // InternalExpAuto.g:2593:1: rule__Variation__Group__11 : rule__Variation__Group__11__Impl rule__Variation__Group__12 ;
    public final void rule__Variation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2597:1: ( rule__Variation__Group__11__Impl rule__Variation__Group__12 )
            // InternalExpAuto.g:2598:2: rule__Variation__Group__11__Impl rule__Variation__Group__12
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
    // InternalExpAuto.g:2605:1: rule__Variation__Group__11__Impl : ( 'values' ) ;
    public final void rule__Variation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2609:1: ( ( 'values' ) )
            // InternalExpAuto.g:2610:1: ( 'values' )
            {
            // InternalExpAuto.g:2610:1: ( 'values' )
            // InternalExpAuto.g:2611:2: 'values'
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
    // InternalExpAuto.g:2620:1: rule__Variation__Group__12 : rule__Variation__Group__12__Impl rule__Variation__Group__13 ;
    public final void rule__Variation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2624:1: ( rule__Variation__Group__12__Impl rule__Variation__Group__13 )
            // InternalExpAuto.g:2625:2: rule__Variation__Group__12__Impl rule__Variation__Group__13
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
    // InternalExpAuto.g:2632:1: rule__Variation__Group__12__Impl : ( '=' ) ;
    public final void rule__Variation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2636:1: ( ( '=' ) )
            // InternalExpAuto.g:2637:1: ( '=' )
            {
            // InternalExpAuto.g:2637:1: ( '=' )
            // InternalExpAuto.g:2638:2: '='
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
    // InternalExpAuto.g:2647:1: rule__Variation__Group__13 : rule__Variation__Group__13__Impl rule__Variation__Group__14 ;
    public final void rule__Variation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2651:1: ( rule__Variation__Group__13__Impl rule__Variation__Group__14 )
            // InternalExpAuto.g:2652:2: rule__Variation__Group__13__Impl rule__Variation__Group__14
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
    // InternalExpAuto.g:2659:1: rule__Variation__Group__13__Impl : ( ( rule__Variation__ValueProviderAssignment_13 ) ) ;
    public final void rule__Variation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2663:1: ( ( ( rule__Variation__ValueProviderAssignment_13 ) ) )
            // InternalExpAuto.g:2664:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            {
            // InternalExpAuto.g:2664:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            // InternalExpAuto.g:2665:2: ( rule__Variation__ValueProviderAssignment_13 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 
            // InternalExpAuto.g:2666:2: ( rule__Variation__ValueProviderAssignment_13 )
            // InternalExpAuto.g:2666:3: rule__Variation__ValueProviderAssignment_13
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
    // InternalExpAuto.g:2674:1: rule__Variation__Group__14 : rule__Variation__Group__14__Impl ;
    public final void rule__Variation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2678:1: ( rule__Variation__Group__14__Impl )
            // InternalExpAuto.g:2679:2: rule__Variation__Group__14__Impl
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
    // InternalExpAuto.g:2685:1: rule__Variation__Group__14__Impl : ( '}' ) ;
    public final void rule__Variation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2689:1: ( ( '}' ) )
            // InternalExpAuto.g:2690:1: ( '}' )
            {
            // InternalExpAuto.g:2690:1: ( '}' )
            // InternalExpAuto.g:2691:2: '}'
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
    // InternalExpAuto.g:2701:1: rule__NestedIntervalsValueProvider__Group_0__0 : rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2705:1: ( rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 )
            // InternalExpAuto.g:2706:2: rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1
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
    // InternalExpAuto.g:2713:1: rule__NestedIntervalsValueProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2717:1: ( ( '[' ) )
            // InternalExpAuto.g:2718:1: ( '[' )
            {
            // InternalExpAuto.g:2718:1: ( '[' )
            // InternalExpAuto.g:2719:2: '['
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
    // InternalExpAuto.g:2728:1: rule__NestedIntervalsValueProvider__Group_0__1 : rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2732:1: ( rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 )
            // InternalExpAuto.g:2733:2: rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2
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
    // InternalExpAuto.g:2740:1: rule__NestedIntervalsValueProvider__Group_0__1__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2744:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) )
            // InternalExpAuto.g:2745:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2745:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            // InternalExpAuto.g:2746:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 
            // InternalExpAuto.g:2747:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            // InternalExpAuto.g:2747:3: rule__NestedIntervalsValueProvider__MinAssignment_0_1
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
    // InternalExpAuto.g:2755:1: rule__NestedIntervalsValueProvider__Group_0__2 : rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2759:1: ( rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 )
            // InternalExpAuto.g:2760:2: rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3
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
    // InternalExpAuto.g:2767:1: rule__NestedIntervalsValueProvider__Group_0__2__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2771:1: ( ( ',' ) )
            // InternalExpAuto.g:2772:1: ( ',' )
            {
            // InternalExpAuto.g:2772:1: ( ',' )
            // InternalExpAuto.g:2773:2: ','
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
    // InternalExpAuto.g:2782:1: rule__NestedIntervalsValueProvider__Group_0__3 : rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2786:1: ( rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 )
            // InternalExpAuto.g:2787:2: rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4
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
    // InternalExpAuto.g:2794:1: rule__NestedIntervalsValueProvider__Group_0__3__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2798:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) )
            // InternalExpAuto.g:2799:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            {
            // InternalExpAuto.g:2799:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            // InternalExpAuto.g:2800:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 
            // InternalExpAuto.g:2801:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            // InternalExpAuto.g:2801:3: rule__NestedIntervalsValueProvider__MaxAssignment_0_3
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
    // InternalExpAuto.g:2809:1: rule__NestedIntervalsValueProvider__Group_0__4 : rule__NestedIntervalsValueProvider__Group_0__4__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2813:1: ( rule__NestedIntervalsValueProvider__Group_0__4__Impl )
            // InternalExpAuto.g:2814:2: rule__NestedIntervalsValueProvider__Group_0__4__Impl
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
    // InternalExpAuto.g:2820:1: rule__NestedIntervalsValueProvider__Group_0__4__Impl : ( ']' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2824:1: ( ( ']' ) )
            // InternalExpAuto.g:2825:1: ( ']' )
            {
            // InternalExpAuto.g:2825:1: ( ']' )
            // InternalExpAuto.g:2826:2: ']'
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
    // InternalExpAuto.g:2836:1: rule__NestedIntervalsValueProvider__Group_1__0 : rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2840:1: ( rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 )
            // InternalExpAuto.g:2841:2: rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1
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
    // InternalExpAuto.g:2848:1: rule__NestedIntervalsValueProvider__Group_1__0__Impl : ( 'nestedIntervall' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2852:1: ( ( 'nestedIntervall' ) )
            // InternalExpAuto.g:2853:1: ( 'nestedIntervall' )
            {
            // InternalExpAuto.g:2853:1: ( 'nestedIntervall' )
            // InternalExpAuto.g:2854:2: 'nestedIntervall'
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
    // InternalExpAuto.g:2863:1: rule__NestedIntervalsValueProvider__Group_1__1 : rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2867:1: ( rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 )
            // InternalExpAuto.g:2868:2: rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2
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
    // InternalExpAuto.g:2875:1: rule__NestedIntervalsValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2879:1: ( ( '(' ) )
            // InternalExpAuto.g:2880:1: ( '(' )
            {
            // InternalExpAuto.g:2880:1: ( '(' )
            // InternalExpAuto.g:2881:2: '('
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
    // InternalExpAuto.g:2890:1: rule__NestedIntervalsValueProvider__Group_1__2 : rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2894:1: ( rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 )
            // InternalExpAuto.g:2895:2: rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3
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
    // InternalExpAuto.g:2902:1: rule__NestedIntervalsValueProvider__Group_1__2__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2906:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) )
            // InternalExpAuto.g:2907:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            {
            // InternalExpAuto.g:2907:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            // InternalExpAuto.g:2908:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 
            // InternalExpAuto.g:2909:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            // InternalExpAuto.g:2909:3: rule__NestedIntervalsValueProvider__MinAssignment_1_2
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
    // InternalExpAuto.g:2917:1: rule__NestedIntervalsValueProvider__Group_1__3 : rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2921:1: ( rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 )
            // InternalExpAuto.g:2922:2: rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4
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
    // InternalExpAuto.g:2929:1: rule__NestedIntervalsValueProvider__Group_1__3__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2933:1: ( ( ',' ) )
            // InternalExpAuto.g:2934:1: ( ',' )
            {
            // InternalExpAuto.g:2934:1: ( ',' )
            // InternalExpAuto.g:2935:2: ','
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
    // InternalExpAuto.g:2944:1: rule__NestedIntervalsValueProvider__Group_1__4 : rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2948:1: ( rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 )
            // InternalExpAuto.g:2949:2: rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5
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
    // InternalExpAuto.g:2956:1: rule__NestedIntervalsValueProvider__Group_1__4__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2960:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) )
            // InternalExpAuto.g:2961:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            {
            // InternalExpAuto.g:2961:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            // InternalExpAuto.g:2962:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 
            // InternalExpAuto.g:2963:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            // InternalExpAuto.g:2963:3: rule__NestedIntervalsValueProvider__MaxAssignment_1_4
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
    // InternalExpAuto.g:2971:1: rule__NestedIntervalsValueProvider__Group_1__5 : rule__NestedIntervalsValueProvider__Group_1__5__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2975:1: ( rule__NestedIntervalsValueProvider__Group_1__5__Impl )
            // InternalExpAuto.g:2976:2: rule__NestedIntervalsValueProvider__Group_1__5__Impl
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
    // InternalExpAuto.g:2982:1: rule__NestedIntervalsValueProvider__Group_1__5__Impl : ( ')' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2986:1: ( ( ')' ) )
            // InternalExpAuto.g:2987:1: ( ')' )
            {
            // InternalExpAuto.g:2987:1: ( ')' )
            // InternalExpAuto.g:2988:2: ')'
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
    // InternalExpAuto.g:2998:1: rule__SetValueProvider__Group_0__0 : rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 ;
    public final void rule__SetValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3002:1: ( rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 )
            // InternalExpAuto.g:3003:2: rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1
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
    // InternalExpAuto.g:3010:1: rule__SetValueProvider__Group_0__0__Impl : ( '{' ) ;
    public final void rule__SetValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3014:1: ( ( '{' ) )
            // InternalExpAuto.g:3015:1: ( '{' )
            {
            // InternalExpAuto.g:3015:1: ( '{' )
            // InternalExpAuto.g:3016:2: '{'
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
    // InternalExpAuto.g:3025:1: rule__SetValueProvider__Group_0__1 : rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 ;
    public final void rule__SetValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3029:1: ( rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 )
            // InternalExpAuto.g:3030:2: rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2
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
    // InternalExpAuto.g:3037:1: rule__SetValueProvider__Group_0__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) ;
    public final void rule__SetValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3041:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) )
            // InternalExpAuto.g:3042:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            {
            // InternalExpAuto.g:3042:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            // InternalExpAuto.g:3043:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 
            // InternalExpAuto.g:3044:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            // InternalExpAuto.g:3044:3: rule__SetValueProvider__ValuesAssignment_0_1
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
    // InternalExpAuto.g:3052:1: rule__SetValueProvider__Group_0__2 : rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 ;
    public final void rule__SetValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3056:1: ( rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 )
            // InternalExpAuto.g:3057:2: rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3
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
    // InternalExpAuto.g:3064:1: rule__SetValueProvider__Group_0__2__Impl : ( ( rule__SetValueProvider__Group_0_2__0 )* ) ;
    public final void rule__SetValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3068:1: ( ( ( rule__SetValueProvider__Group_0_2__0 )* ) )
            // InternalExpAuto.g:3069:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            {
            // InternalExpAuto.g:3069:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            // InternalExpAuto.g:3070:2: ( rule__SetValueProvider__Group_0_2__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 
            // InternalExpAuto.g:3071:2: ( rule__SetValueProvider__Group_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpAuto.g:3071:3: rule__SetValueProvider__Group_0_2__0
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
    // InternalExpAuto.g:3079:1: rule__SetValueProvider__Group_0__3 : rule__SetValueProvider__Group_0__3__Impl ;
    public final void rule__SetValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3083:1: ( rule__SetValueProvider__Group_0__3__Impl )
            // InternalExpAuto.g:3084:2: rule__SetValueProvider__Group_0__3__Impl
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
    // InternalExpAuto.g:3090:1: rule__SetValueProvider__Group_0__3__Impl : ( '}' ) ;
    public final void rule__SetValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3094:1: ( ( '}' ) )
            // InternalExpAuto.g:3095:1: ( '}' )
            {
            // InternalExpAuto.g:3095:1: ( '}' )
            // InternalExpAuto.g:3096:2: '}'
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
    // InternalExpAuto.g:3106:1: rule__SetValueProvider__Group_0_2__0 : rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 ;
    public final void rule__SetValueProvider__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3110:1: ( rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 )
            // InternalExpAuto.g:3111:2: rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1
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
    // InternalExpAuto.g:3118:1: rule__SetValueProvider__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3122:1: ( ( ',' ) )
            // InternalExpAuto.g:3123:1: ( ',' )
            {
            // InternalExpAuto.g:3123:1: ( ',' )
            // InternalExpAuto.g:3124:2: ','
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
    // InternalExpAuto.g:3133:1: rule__SetValueProvider__Group_0_2__1 : rule__SetValueProvider__Group_0_2__1__Impl ;
    public final void rule__SetValueProvider__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3137:1: ( rule__SetValueProvider__Group_0_2__1__Impl )
            // InternalExpAuto.g:3138:2: rule__SetValueProvider__Group_0_2__1__Impl
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
    // InternalExpAuto.g:3144:1: rule__SetValueProvider__Group_0_2__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) ;
    public final void rule__SetValueProvider__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3148:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) )
            // InternalExpAuto.g:3149:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            {
            // InternalExpAuto.g:3149:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            // InternalExpAuto.g:3150:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 
            // InternalExpAuto.g:3151:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            // InternalExpAuto.g:3151:3: rule__SetValueProvider__ValuesAssignment_0_2_1
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
    // InternalExpAuto.g:3160:1: rule__SetValueProvider__Group_1__0 : rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 ;
    public final void rule__SetValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3164:1: ( rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 )
            // InternalExpAuto.g:3165:2: rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1
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
    // InternalExpAuto.g:3172:1: rule__SetValueProvider__Group_1__0__Impl : ( 'setValues' ) ;
    public final void rule__SetValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3176:1: ( ( 'setValues' ) )
            // InternalExpAuto.g:3177:1: ( 'setValues' )
            {
            // InternalExpAuto.g:3177:1: ( 'setValues' )
            // InternalExpAuto.g:3178:2: 'setValues'
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
    // InternalExpAuto.g:3187:1: rule__SetValueProvider__Group_1__1 : rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 ;
    public final void rule__SetValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3191:1: ( rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 )
            // InternalExpAuto.g:3192:2: rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2
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
    // InternalExpAuto.g:3199:1: rule__SetValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SetValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3203:1: ( ( '(' ) )
            // InternalExpAuto.g:3204:1: ( '(' )
            {
            // InternalExpAuto.g:3204:1: ( '(' )
            // InternalExpAuto.g:3205:2: '('
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
    // InternalExpAuto.g:3214:1: rule__SetValueProvider__Group_1__2 : rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 ;
    public final void rule__SetValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3218:1: ( rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 )
            // InternalExpAuto.g:3219:2: rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3
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
    // InternalExpAuto.g:3226:1: rule__SetValueProvider__Group_1__2__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) ;
    public final void rule__SetValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3230:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) )
            // InternalExpAuto.g:3231:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            {
            // InternalExpAuto.g:3231:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            // InternalExpAuto.g:3232:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 
            // InternalExpAuto.g:3233:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            // InternalExpAuto.g:3233:3: rule__SetValueProvider__ValuesAssignment_1_2
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
    // InternalExpAuto.g:3241:1: rule__SetValueProvider__Group_1__3 : rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 ;
    public final void rule__SetValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3245:1: ( rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 )
            // InternalExpAuto.g:3246:2: rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4
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
    // InternalExpAuto.g:3253:1: rule__SetValueProvider__Group_1__3__Impl : ( ( rule__SetValueProvider__Group_1_3__0 )* ) ;
    public final void rule__SetValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3257:1: ( ( ( rule__SetValueProvider__Group_1_3__0 )* ) )
            // InternalExpAuto.g:3258:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            {
            // InternalExpAuto.g:3258:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            // InternalExpAuto.g:3259:2: ( rule__SetValueProvider__Group_1_3__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 
            // InternalExpAuto.g:3260:2: ( rule__SetValueProvider__Group_1_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:3260:3: rule__SetValueProvider__Group_1_3__0
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
    // InternalExpAuto.g:3268:1: rule__SetValueProvider__Group_1__4 : rule__SetValueProvider__Group_1__4__Impl ;
    public final void rule__SetValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3272:1: ( rule__SetValueProvider__Group_1__4__Impl )
            // InternalExpAuto.g:3273:2: rule__SetValueProvider__Group_1__4__Impl
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
    // InternalExpAuto.g:3279:1: rule__SetValueProvider__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SetValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3283:1: ( ( ')' ) )
            // InternalExpAuto.g:3284:1: ( ')' )
            {
            // InternalExpAuto.g:3284:1: ( ')' )
            // InternalExpAuto.g:3285:2: ')'
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
    // InternalExpAuto.g:3295:1: rule__SetValueProvider__Group_1_3__0 : rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 ;
    public final void rule__SetValueProvider__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3299:1: ( rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 )
            // InternalExpAuto.g:3300:2: rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1
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
    // InternalExpAuto.g:3307:1: rule__SetValueProvider__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3311:1: ( ( ',' ) )
            // InternalExpAuto.g:3312:1: ( ',' )
            {
            // InternalExpAuto.g:3312:1: ( ',' )
            // InternalExpAuto.g:3313:2: ','
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
    // InternalExpAuto.g:3322:1: rule__SetValueProvider__Group_1_3__1 : rule__SetValueProvider__Group_1_3__1__Impl ;
    public final void rule__SetValueProvider__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3326:1: ( rule__SetValueProvider__Group_1_3__1__Impl )
            // InternalExpAuto.g:3327:2: rule__SetValueProvider__Group_1_3__1__Impl
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
    // InternalExpAuto.g:3333:1: rule__SetValueProvider__Group_1_3__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) ;
    public final void rule__SetValueProvider__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3337:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) )
            // InternalExpAuto.g:3338:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            {
            // InternalExpAuto.g:3338:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            // InternalExpAuto.g:3339:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 
            // InternalExpAuto.g:3340:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            // InternalExpAuto.g:3340:3: rule__SetValueProvider__ValuesAssignment_1_3_1
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
    // InternalExpAuto.g:3349:1: rule__LinearValueProvider__Group__0 : rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 ;
    public final void rule__LinearValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3353:1: ( rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 )
            // InternalExpAuto.g:3354:2: rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1
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
    // InternalExpAuto.g:3361:1: rule__LinearValueProvider__Group__0__Impl : ( 'linear' ) ;
    public final void rule__LinearValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3365:1: ( ( 'linear' ) )
            // InternalExpAuto.g:3366:1: ( 'linear' )
            {
            // InternalExpAuto.g:3366:1: ( 'linear' )
            // InternalExpAuto.g:3367:2: 'linear'
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
    // InternalExpAuto.g:3376:1: rule__LinearValueProvider__Group__1 : rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 ;
    public final void rule__LinearValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3380:1: ( rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 )
            // InternalExpAuto.g:3381:2: rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2
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
    // InternalExpAuto.g:3388:1: rule__LinearValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__LinearValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3392:1: ( ( '(' ) )
            // InternalExpAuto.g:3393:1: ( '(' )
            {
            // InternalExpAuto.g:3393:1: ( '(' )
            // InternalExpAuto.g:3394:2: '('
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
    // InternalExpAuto.g:3403:1: rule__LinearValueProvider__Group__2 : rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 ;
    public final void rule__LinearValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3407:1: ( rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 )
            // InternalExpAuto.g:3408:2: rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3
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
    // InternalExpAuto.g:3415:1: rule__LinearValueProvider__Group__2__Impl : ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) ;
    public final void rule__LinearValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3419:1: ( ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) )
            // InternalExpAuto.g:3420:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            {
            // InternalExpAuto.g:3420:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            // InternalExpAuto.g:3421:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 
            // InternalExpAuto.g:3422:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            // InternalExpAuto.g:3422:3: rule__LinearValueProvider__SummandAssignment_2
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
    // InternalExpAuto.g:3430:1: rule__LinearValueProvider__Group__3 : rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 ;
    public final void rule__LinearValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3434:1: ( rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 )
            // InternalExpAuto.g:3435:2: rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4
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
    // InternalExpAuto.g:3442:1: rule__LinearValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__LinearValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3446:1: ( ( ',' ) )
            // InternalExpAuto.g:3447:1: ( ',' )
            {
            // InternalExpAuto.g:3447:1: ( ',' )
            // InternalExpAuto.g:3448:2: ','
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
    // InternalExpAuto.g:3457:1: rule__LinearValueProvider__Group__4 : rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 ;
    public final void rule__LinearValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3461:1: ( rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 )
            // InternalExpAuto.g:3462:2: rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5
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
    // InternalExpAuto.g:3469:1: rule__LinearValueProvider__Group__4__Impl : ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__LinearValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3473:1: ( ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3474:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3474:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3475:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3476:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3476:3: rule__LinearValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3484:1: rule__LinearValueProvider__Group__5 : rule__LinearValueProvider__Group__5__Impl ;
    public final void rule__LinearValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3488:1: ( rule__LinearValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3489:2: rule__LinearValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3495:1: rule__LinearValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__LinearValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3499:1: ( ( ')' ) )
            // InternalExpAuto.g:3500:1: ( ')' )
            {
            // InternalExpAuto.g:3500:1: ( ')' )
            // InternalExpAuto.g:3501:2: ')'
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
    // InternalExpAuto.g:3511:1: rule__ExponentialValueProvider__Group__0 : rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 ;
    public final void rule__ExponentialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3515:1: ( rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 )
            // InternalExpAuto.g:3516:2: rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1
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
    // InternalExpAuto.g:3523:1: rule__ExponentialValueProvider__Group__0__Impl : ( 'exponential' ) ;
    public final void rule__ExponentialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3527:1: ( ( 'exponential' ) )
            // InternalExpAuto.g:3528:1: ( 'exponential' )
            {
            // InternalExpAuto.g:3528:1: ( 'exponential' )
            // InternalExpAuto.g:3529:2: 'exponential'
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
    // InternalExpAuto.g:3538:1: rule__ExponentialValueProvider__Group__1 : rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 ;
    public final void rule__ExponentialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3542:1: ( rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 )
            // InternalExpAuto.g:3543:2: rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2
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
    // InternalExpAuto.g:3550:1: rule__ExponentialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__ExponentialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3554:1: ( ( '(' ) )
            // InternalExpAuto.g:3555:1: ( '(' )
            {
            // InternalExpAuto.g:3555:1: ( '(' )
            // InternalExpAuto.g:3556:2: '('
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
    // InternalExpAuto.g:3565:1: rule__ExponentialValueProvider__Group__2 : rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 ;
    public final void rule__ExponentialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3569:1: ( rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 )
            // InternalExpAuto.g:3570:2: rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3
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
    // InternalExpAuto.g:3577:1: rule__ExponentialValueProvider__Group__2__Impl : ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) ;
    public final void rule__ExponentialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3581:1: ( ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) )
            // InternalExpAuto.g:3582:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            {
            // InternalExpAuto.g:3582:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            // InternalExpAuto.g:3583:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 
            // InternalExpAuto.g:3584:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            // InternalExpAuto.g:3584:3: rule__ExponentialValueProvider__BaseAssignment_2
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
    // InternalExpAuto.g:3592:1: rule__ExponentialValueProvider__Group__3 : rule__ExponentialValueProvider__Group__3__Impl ;
    public final void rule__ExponentialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3596:1: ( rule__ExponentialValueProvider__Group__3__Impl )
            // InternalExpAuto.g:3597:2: rule__ExponentialValueProvider__Group__3__Impl
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
    // InternalExpAuto.g:3603:1: rule__ExponentialValueProvider__Group__3__Impl : ( ')' ) ;
    public final void rule__ExponentialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3607:1: ( ( ')' ) )
            // InternalExpAuto.g:3608:1: ( ')' )
            {
            // InternalExpAuto.g:3608:1: ( ')' )
            // InternalExpAuto.g:3609:2: ')'
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
    // InternalExpAuto.g:3619:1: rule__PolynomialValueProvider__Group__0 : rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 ;
    public final void rule__PolynomialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3623:1: ( rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 )
            // InternalExpAuto.g:3624:2: rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1
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
    // InternalExpAuto.g:3631:1: rule__PolynomialValueProvider__Group__0__Impl : ( 'polynomial' ) ;
    public final void rule__PolynomialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3635:1: ( ( 'polynomial' ) )
            // InternalExpAuto.g:3636:1: ( 'polynomial' )
            {
            // InternalExpAuto.g:3636:1: ( 'polynomial' )
            // InternalExpAuto.g:3637:2: 'polynomial'
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
    // InternalExpAuto.g:3646:1: rule__PolynomialValueProvider__Group__1 : rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 ;
    public final void rule__PolynomialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3650:1: ( rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 )
            // InternalExpAuto.g:3651:2: rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2
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
    // InternalExpAuto.g:3658:1: rule__PolynomialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__PolynomialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3662:1: ( ( '(' ) )
            // InternalExpAuto.g:3663:1: ( '(' )
            {
            // InternalExpAuto.g:3663:1: ( '(' )
            // InternalExpAuto.g:3664:2: '('
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
    // InternalExpAuto.g:3673:1: rule__PolynomialValueProvider__Group__2 : rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 ;
    public final void rule__PolynomialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3677:1: ( rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 )
            // InternalExpAuto.g:3678:2: rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3
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
    // InternalExpAuto.g:3685:1: rule__PolynomialValueProvider__Group__2__Impl : ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) ;
    public final void rule__PolynomialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3689:1: ( ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) )
            // InternalExpAuto.g:3690:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            {
            // InternalExpAuto.g:3690:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            // InternalExpAuto.g:3691:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 
            // InternalExpAuto.g:3692:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            // InternalExpAuto.g:3692:3: rule__PolynomialValueProvider__ExponentAssignment_2
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
    // InternalExpAuto.g:3700:1: rule__PolynomialValueProvider__Group__3 : rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 ;
    public final void rule__PolynomialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3704:1: ( rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 )
            // InternalExpAuto.g:3705:2: rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4
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
    // InternalExpAuto.g:3712:1: rule__PolynomialValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__PolynomialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3716:1: ( ( ',' ) )
            // InternalExpAuto.g:3717:1: ( ',' )
            {
            // InternalExpAuto.g:3717:1: ( ',' )
            // InternalExpAuto.g:3718:2: ','
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
    // InternalExpAuto.g:3727:1: rule__PolynomialValueProvider__Group__4 : rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 ;
    public final void rule__PolynomialValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3731:1: ( rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 )
            // InternalExpAuto.g:3732:2: rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5
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
    // InternalExpAuto.g:3739:1: rule__PolynomialValueProvider__Group__4__Impl : ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__PolynomialValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3743:1: ( ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3744:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3744:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3745:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3746:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3746:3: rule__PolynomialValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3754:1: rule__PolynomialValueProvider__Group__5 : rule__PolynomialValueProvider__Group__5__Impl ;
    public final void rule__PolynomialValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3758:1: ( rule__PolynomialValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3759:2: rule__PolynomialValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3765:1: rule__PolynomialValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__PolynomialValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3769:1: ( ( ')' ) )
            // InternalExpAuto.g:3770:1: ( ')' )
            {
            // InternalExpAuto.g:3770:1: ( ')' )
            // InternalExpAuto.g:3771:2: ')'
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
    // InternalExpAuto.g:3781:1: rule__StopTimeCondition__Group__0 : rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 ;
    public final void rule__StopTimeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3785:1: ( rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 )
            // InternalExpAuto.g:3786:2: rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1
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
    // InternalExpAuto.g:3793:1: rule__StopTimeCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopTimeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3797:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3798:1: ( 'stop' )
            {
            // InternalExpAuto.g:3798:1: ( 'stop' )
            // InternalExpAuto.g:3799:2: 'stop'
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
    // InternalExpAuto.g:3808:1: rule__StopTimeCondition__Group__1 : rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 ;
    public final void rule__StopTimeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3812:1: ( rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 )
            // InternalExpAuto.g:3813:2: rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2
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
    // InternalExpAuto.g:3820:1: rule__StopTimeCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopTimeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3824:1: ( ( '=' ) )
            // InternalExpAuto.g:3825:1: ( '=' )
            {
            // InternalExpAuto.g:3825:1: ( '=' )
            // InternalExpAuto.g:3826:2: '='
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
    // InternalExpAuto.g:3835:1: rule__StopTimeCondition__Group__2 : rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 ;
    public final void rule__StopTimeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3839:1: ( rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 )
            // InternalExpAuto.g:3840:2: rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3
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
    // InternalExpAuto.g:3847:1: rule__StopTimeCondition__Group__2__Impl : ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopTimeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3851:1: ( ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3852:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3852:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3853:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3854:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3854:3: rule__StopTimeCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3862:1: rule__StopTimeCondition__Group__3 : rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 ;
    public final void rule__StopTimeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3866:1: ( rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 )
            // InternalExpAuto.g:3867:2: rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4
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
    // InternalExpAuto.g:3874:1: rule__StopTimeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopTimeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3878:1: ( ( '(' ) )
            // InternalExpAuto.g:3879:1: ( '(' )
            {
            // InternalExpAuto.g:3879:1: ( '(' )
            // InternalExpAuto.g:3880:2: '('
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
    // InternalExpAuto.g:3889:1: rule__StopTimeCondition__Group__4 : rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 ;
    public final void rule__StopTimeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3893:1: ( rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 )
            // InternalExpAuto.g:3894:2: rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5
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
    // InternalExpAuto.g:3901:1: rule__StopTimeCondition__Group__4__Impl : ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopTimeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3905:1: ( ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3906:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3906:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3907:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3908:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3908:3: rule__StopTimeCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3916:1: rule__StopTimeCondition__Group__5 : rule__StopTimeCondition__Group__5__Impl ;
    public final void rule__StopTimeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3920:1: ( rule__StopTimeCondition__Group__5__Impl )
            // InternalExpAuto.g:3921:2: rule__StopTimeCondition__Group__5__Impl
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
    // InternalExpAuto.g:3927:1: rule__StopTimeCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopTimeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3931:1: ( ( ')' ) )
            // InternalExpAuto.g:3932:1: ( ')' )
            {
            // InternalExpAuto.g:3932:1: ( ')' )
            // InternalExpAuto.g:3933:2: ')'
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
    // InternalExpAuto.g:3943:1: rule__StopCountCondition__Group__0 : rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 ;
    public final void rule__StopCountCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3947:1: ( rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 )
            // InternalExpAuto.g:3948:2: rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1
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
    // InternalExpAuto.g:3955:1: rule__StopCountCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopCountCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3959:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3960:1: ( 'stop' )
            {
            // InternalExpAuto.g:3960:1: ( 'stop' )
            // InternalExpAuto.g:3961:2: 'stop'
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
    // InternalExpAuto.g:3970:1: rule__StopCountCondition__Group__1 : rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 ;
    public final void rule__StopCountCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3974:1: ( rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 )
            // InternalExpAuto.g:3975:2: rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2
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
    // InternalExpAuto.g:3982:1: rule__StopCountCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopCountCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3986:1: ( ( '=' ) )
            // InternalExpAuto.g:3987:1: ( '=' )
            {
            // InternalExpAuto.g:3987:1: ( '=' )
            // InternalExpAuto.g:3988:2: '='
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
    // InternalExpAuto.g:3997:1: rule__StopCountCondition__Group__2 : rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 ;
    public final void rule__StopCountCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4001:1: ( rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 )
            // InternalExpAuto.g:4002:2: rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3
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
    // InternalExpAuto.g:4009:1: rule__StopCountCondition__Group__2__Impl : ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopCountCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4013:1: ( ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:4014:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:4014:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:4015:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:4016:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:4016:3: rule__StopCountCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:4024:1: rule__StopCountCondition__Group__3 : rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 ;
    public final void rule__StopCountCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4028:1: ( rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 )
            // InternalExpAuto.g:4029:2: rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4
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
    // InternalExpAuto.g:4036:1: rule__StopCountCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopCountCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4040:1: ( ( '(' ) )
            // InternalExpAuto.g:4041:1: ( '(' )
            {
            // InternalExpAuto.g:4041:1: ( '(' )
            // InternalExpAuto.g:4042:2: '('
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
    // InternalExpAuto.g:4051:1: rule__StopCountCondition__Group__4 : rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 ;
    public final void rule__StopCountCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4055:1: ( rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 )
            // InternalExpAuto.g:4056:2: rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5
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
    // InternalExpAuto.g:4063:1: rule__StopCountCondition__Group__4__Impl : ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopCountCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4067:1: ( ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:4068:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:4068:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:4069:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:4070:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:4070:3: rule__StopCountCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:4078:1: rule__StopCountCondition__Group__5 : rule__StopCountCondition__Group__5__Impl ;
    public final void rule__StopCountCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4082:1: ( rule__StopCountCondition__Group__5__Impl )
            // InternalExpAuto.g:4083:2: rule__StopCountCondition__Group__5__Impl
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
    // InternalExpAuto.g:4089:1: rule__StopCountCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopCountCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4093:1: ( ( ')' ) )
            // InternalExpAuto.g:4094:1: ( ')' )
            {
            // InternalExpAuto.g:4094:1: ( ')' )
            // InternalExpAuto.g:4095:2: ')'
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
    // InternalExpAuto.g:4105:1: rule__NumberOfExperiments__Group__0 : rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 ;
    public final void rule__NumberOfExperiments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4109:1: ( rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 )
            // InternalExpAuto.g:4110:2: rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1
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
    // InternalExpAuto.g:4117:1: rule__NumberOfExperiments__Group__0__Impl : ( 'repetitions' ) ;
    public final void rule__NumberOfExperiments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4121:1: ( ( 'repetitions' ) )
            // InternalExpAuto.g:4122:1: ( 'repetitions' )
            {
            // InternalExpAuto.g:4122:1: ( 'repetitions' )
            // InternalExpAuto.g:4123:2: 'repetitions'
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
    // InternalExpAuto.g:4132:1: rule__NumberOfExperiments__Group__1 : rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 ;
    public final void rule__NumberOfExperiments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4136:1: ( rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 )
            // InternalExpAuto.g:4137:2: rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2
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
    // InternalExpAuto.g:4144:1: rule__NumberOfExperiments__Group__1__Impl : ( '=' ) ;
    public final void rule__NumberOfExperiments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4148:1: ( ( '=' ) )
            // InternalExpAuto.g:4149:1: ( '=' )
            {
            // InternalExpAuto.g:4149:1: ( '=' )
            // InternalExpAuto.g:4150:2: '='
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
    // InternalExpAuto.g:4159:1: rule__NumberOfExperiments__Group__2 : rule__NumberOfExperiments__Group__2__Impl ;
    public final void rule__NumberOfExperiments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4163:1: ( rule__NumberOfExperiments__Group__2__Impl )
            // InternalExpAuto.g:4164:2: rule__NumberOfExperiments__Group__2__Impl
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
    // InternalExpAuto.g:4170:1: rule__NumberOfExperiments__Group__2__Impl : ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) ;
    public final void rule__NumberOfExperiments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4174:1: ( ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) )
            // InternalExpAuto.g:4175:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            {
            // InternalExpAuto.g:4175:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            // InternalExpAuto.g:4176:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 
            // InternalExpAuto.g:4177:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            // InternalExpAuto.g:4177:3: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2
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


    // $ANTLR start "rule__ToolDefinition__Group__0"
    // InternalExpAuto.g:4186:1: rule__ToolDefinition__Group__0 : rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 ;
    public final void rule__ToolDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4190:1: ( rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 )
            // InternalExpAuto.g:4191:2: rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1
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
    // InternalExpAuto.g:4198:1: rule__ToolDefinition__Group__0__Impl : ( 'tool' ) ;
    public final void rule__ToolDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4202:1: ( ( 'tool' ) )
            // InternalExpAuto.g:4203:1: ( 'tool' )
            {
            // InternalExpAuto.g:4203:1: ( 'tool' )
            // InternalExpAuto.g:4204:2: 'tool'
            {
             before(grammarAccess.getToolDefinitionAccess().getToolKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalExpAuto.g:4213:1: rule__ToolDefinition__Group__1 : rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 ;
    public final void rule__ToolDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4217:1: ( rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 )
            // InternalExpAuto.g:4218:2: rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2
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
    // InternalExpAuto.g:4225:1: rule__ToolDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__ToolDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4229:1: ( ( '=' ) )
            // InternalExpAuto.g:4230:1: ( '=' )
            {
            // InternalExpAuto.g:4230:1: ( '=' )
            // InternalExpAuto.g:4231:2: '='
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
    // InternalExpAuto.g:4240:1: rule__ToolDefinition__Group__2 : rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 ;
    public final void rule__ToolDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4244:1: ( rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 )
            // InternalExpAuto.g:4245:2: rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3
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
    // InternalExpAuto.g:4252:1: rule__ToolDefinition__Group__2__Impl : ( ( rule__ToolDefinition__ToolAssignment_2 ) ) ;
    public final void rule__ToolDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4256:1: ( ( ( rule__ToolDefinition__ToolAssignment_2 ) ) )
            // InternalExpAuto.g:4257:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            {
            // InternalExpAuto.g:4257:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            // InternalExpAuto.g:4258:2: ( rule__ToolDefinition__ToolAssignment_2 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 
            // InternalExpAuto.g:4259:2: ( rule__ToolDefinition__ToolAssignment_2 )
            // InternalExpAuto.g:4259:3: rule__ToolDefinition__ToolAssignment_2
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
    // InternalExpAuto.g:4267:1: rule__ToolDefinition__Group__3 : rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 ;
    public final void rule__ToolDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4271:1: ( rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 )
            // InternalExpAuto.g:4272:2: rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4
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
    // InternalExpAuto.g:4279:1: rule__ToolDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ToolDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4283:1: ( ( '{' ) )
            // InternalExpAuto.g:4284:1: ( '{' )
            {
            // InternalExpAuto.g:4284:1: ( '{' )
            // InternalExpAuto.g:4285:2: '{'
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
    // InternalExpAuto.g:4294:1: rule__ToolDefinition__Group__4 : rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 ;
    public final void rule__ToolDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4298:1: ( rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 )
            // InternalExpAuto.g:4299:2: rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5
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
    // InternalExpAuto.g:4306:1: rule__ToolDefinition__Group__4__Impl : ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) ;
    public final void rule__ToolDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4310:1: ( ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* ) )
            // InternalExpAuto.g:4311:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            {
            // InternalExpAuto.g:4311:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 )* )
            // InternalExpAuto.g:4312:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_4()); 
            // InternalExpAuto.g:4313:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:4313:3: rule__ToolDefinition__ConfigParamsAssignment_4
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ToolDefinition__ConfigParamsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalExpAuto.g:4321:1: rule__ToolDefinition__Group__5 : rule__ToolDefinition__Group__5__Impl ;
    public final void rule__ToolDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4325:1: ( rule__ToolDefinition__Group__5__Impl )
            // InternalExpAuto.g:4326:2: rule__ToolDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4332:1: rule__ToolDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ToolDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4336:1: ( ( '}' ) )
            // InternalExpAuto.g:4337:1: ( '}' )
            {
            // InternalExpAuto.g:4337:1: ( '}' )
            // InternalExpAuto.g:4338:2: '}'
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
    // InternalExpAuto.g:4348:1: rule__ConfigurationParams__Group__0 : rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 ;
    public final void rule__ConfigurationParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4352:1: ( rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1 )
            // InternalExpAuto.g:4353:2: rule__ConfigurationParams__Group__0__Impl rule__ConfigurationParams__Group__1
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
    // InternalExpAuto.g:4360:1: rule__ConfigurationParams__Group__0__Impl : ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4364:1: ( ( ( rule__ConfigurationParams__KeyAssignment_0 ) ) )
            // InternalExpAuto.g:4365:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            {
            // InternalExpAuto.g:4365:1: ( ( rule__ConfigurationParams__KeyAssignment_0 ) )
            // InternalExpAuto.g:4366:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0()); 
            // InternalExpAuto.g:4367:2: ( rule__ConfigurationParams__KeyAssignment_0 )
            // InternalExpAuto.g:4367:3: rule__ConfigurationParams__KeyAssignment_0
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
    // InternalExpAuto.g:4375:1: rule__ConfigurationParams__Group__1 : rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 ;
    public final void rule__ConfigurationParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4379:1: ( rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2 )
            // InternalExpAuto.g:4380:2: rule__ConfigurationParams__Group__1__Impl rule__ConfigurationParams__Group__2
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
    // InternalExpAuto.g:4387:1: rule__ConfigurationParams__Group__1__Impl : ( '=' ) ;
    public final void rule__ConfigurationParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4391:1: ( ( '=' ) )
            // InternalExpAuto.g:4392:1: ( '=' )
            {
            // InternalExpAuto.g:4392:1: ( '=' )
            // InternalExpAuto.g:4393:2: '='
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
    // InternalExpAuto.g:4402:1: rule__ConfigurationParams__Group__2 : rule__ConfigurationParams__Group__2__Impl ;
    public final void rule__ConfigurationParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4406:1: ( rule__ConfigurationParams__Group__2__Impl )
            // InternalExpAuto.g:4407:2: rule__ConfigurationParams__Group__2__Impl
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
    // InternalExpAuto.g:4413:1: rule__ConfigurationParams__Group__2__Impl : ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) ;
    public final void rule__ConfigurationParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4417:1: ( ( ( rule__ConfigurationParams__ValueAssignment_2 ) ) )
            // InternalExpAuto.g:4418:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            {
            // InternalExpAuto.g:4418:1: ( ( rule__ConfigurationParams__ValueAssignment_2 ) )
            // InternalExpAuto.g:4419:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2()); 
            // InternalExpAuto.g:4420:2: ( rule__ConfigurationParams__ValueAssignment_2 )
            // InternalExpAuto.g:4420:3: rule__ConfigurationParams__ValueAssignment_2
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


    // $ANTLR start "rule__SeedDefinition__Group__0"
    // InternalExpAuto.g:4429:1: rule__SeedDefinition__Group__0 : rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 ;
    public final void rule__SeedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4433:1: ( rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 )
            // InternalExpAuto.g:4434:2: rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1
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
    // InternalExpAuto.g:4441:1: rule__SeedDefinition__Group__0__Impl : ( 'seeds' ) ;
    public final void rule__SeedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4445:1: ( ( 'seeds' ) )
            // InternalExpAuto.g:4446:1: ( 'seeds' )
            {
            // InternalExpAuto.g:4446:1: ( 'seeds' )
            // InternalExpAuto.g:4447:2: 'seeds'
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedsKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalExpAuto.g:4456:1: rule__SeedDefinition__Group__1 : rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 ;
    public final void rule__SeedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4460:1: ( rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 )
            // InternalExpAuto.g:4461:2: rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2
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
    // InternalExpAuto.g:4468:1: rule__SeedDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__SeedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4472:1: ( ( '=' ) )
            // InternalExpAuto.g:4473:1: ( '=' )
            {
            // InternalExpAuto.g:4473:1: ( '=' )
            // InternalExpAuto.g:4474:2: '='
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
    // InternalExpAuto.g:4483:1: rule__SeedDefinition__Group__2 : rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 ;
    public final void rule__SeedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4487:1: ( rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 )
            // InternalExpAuto.g:4488:2: rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3
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
    // InternalExpAuto.g:4495:1: rule__SeedDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4499:1: ( ( '{' ) )
            // InternalExpAuto.g:4500:1: ( '{' )
            {
            // InternalExpAuto.g:4500:1: ( '{' )
            // InternalExpAuto.g:4501:2: '{'
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
    // InternalExpAuto.g:4510:1: rule__SeedDefinition__Group__3 : rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 ;
    public final void rule__SeedDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4514:1: ( rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 )
            // InternalExpAuto.g:4515:2: rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4
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
    // InternalExpAuto.g:4522:1: rule__SeedDefinition__Group__3__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) ;
    public final void rule__SeedDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4526:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) )
            // InternalExpAuto.g:4527:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            {
            // InternalExpAuto.g:4527:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            // InternalExpAuto.g:4528:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 
            // InternalExpAuto.g:4529:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            // InternalExpAuto.g:4529:3: rule__SeedDefinition__SeedListsAssignment_3
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
    // InternalExpAuto.g:4537:1: rule__SeedDefinition__Group__4 : rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 ;
    public final void rule__SeedDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4541:1: ( rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 )
            // InternalExpAuto.g:4542:2: rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5
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
    // InternalExpAuto.g:4549:1: rule__SeedDefinition__Group__4__Impl : ( ( rule__SeedDefinition__Group_4__0 )* ) ;
    public final void rule__SeedDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4553:1: ( ( ( rule__SeedDefinition__Group_4__0 )* ) )
            // InternalExpAuto.g:4554:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            {
            // InternalExpAuto.g:4554:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            // InternalExpAuto.g:4555:2: ( rule__SeedDefinition__Group_4__0 )*
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 
            // InternalExpAuto.g:4556:2: ( rule__SeedDefinition__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:4556:3: rule__SeedDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SeedDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalExpAuto.g:4564:1: rule__SeedDefinition__Group__5 : rule__SeedDefinition__Group__5__Impl ;
    public final void rule__SeedDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4568:1: ( rule__SeedDefinition__Group__5__Impl )
            // InternalExpAuto.g:4569:2: rule__SeedDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4575:1: rule__SeedDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__SeedDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4579:1: ( ( '}' ) )
            // InternalExpAuto.g:4580:1: ( '}' )
            {
            // InternalExpAuto.g:4580:1: ( '}' )
            // InternalExpAuto.g:4581:2: '}'
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
    // InternalExpAuto.g:4591:1: rule__SeedDefinition__Group_4__0 : rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 ;
    public final void rule__SeedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4595:1: ( rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 )
            // InternalExpAuto.g:4596:2: rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1
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
    // InternalExpAuto.g:4603:1: rule__SeedDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SeedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4607:1: ( ( ',' ) )
            // InternalExpAuto.g:4608:1: ( ',' )
            {
            // InternalExpAuto.g:4608:1: ( ',' )
            // InternalExpAuto.g:4609:2: ','
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
    // InternalExpAuto.g:4618:1: rule__SeedDefinition__Group_4__1 : rule__SeedDefinition__Group_4__1__Impl ;
    public final void rule__SeedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4622:1: ( rule__SeedDefinition__Group_4__1__Impl )
            // InternalExpAuto.g:4623:2: rule__SeedDefinition__Group_4__1__Impl
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
    // InternalExpAuto.g:4629:1: rule__SeedDefinition__Group_4__1__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) ;
    public final void rule__SeedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4633:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) )
            // InternalExpAuto.g:4634:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            {
            // InternalExpAuto.g:4634:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            // InternalExpAuto.g:4635:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 
            // InternalExpAuto.g:4636:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            // InternalExpAuto.g:4636:3: rule__SeedDefinition__SeedListsAssignment_4_1
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
    // InternalExpAuto.g:4645:1: rule__ListOfSeeds__Group__0 : rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 ;
    public final void rule__ListOfSeeds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4649:1: ( rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 )
            // InternalExpAuto.g:4650:2: rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1
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
    // InternalExpAuto.g:4657:1: rule__ListOfSeeds__Group__0__Impl : ( '{' ) ;
    public final void rule__ListOfSeeds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4661:1: ( ( '{' ) )
            // InternalExpAuto.g:4662:1: ( '{' )
            {
            // InternalExpAuto.g:4662:1: ( '{' )
            // InternalExpAuto.g:4663:2: '{'
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
    // InternalExpAuto.g:4672:1: rule__ListOfSeeds__Group__1 : rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 ;
    public final void rule__ListOfSeeds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4676:1: ( rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 )
            // InternalExpAuto.g:4677:2: rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2
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
    // InternalExpAuto.g:4684:1: rule__ListOfSeeds__Group__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) ;
    public final void rule__ListOfSeeds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4688:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) )
            // InternalExpAuto.g:4689:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            {
            // InternalExpAuto.g:4689:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            // InternalExpAuto.g:4690:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 
            // InternalExpAuto.g:4691:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            // InternalExpAuto.g:4691:3: rule__ListOfSeeds__SeedsAssignment_1
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
    // InternalExpAuto.g:4699:1: rule__ListOfSeeds__Group__2 : rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 ;
    public final void rule__ListOfSeeds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4703:1: ( rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 )
            // InternalExpAuto.g:4704:2: rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3
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
    // InternalExpAuto.g:4711:1: rule__ListOfSeeds__Group__2__Impl : ( ( rule__ListOfSeeds__Group_2__0 )* ) ;
    public final void rule__ListOfSeeds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4715:1: ( ( ( rule__ListOfSeeds__Group_2__0 )* ) )
            // InternalExpAuto.g:4716:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            {
            // InternalExpAuto.g:4716:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            // InternalExpAuto.g:4717:2: ( rule__ListOfSeeds__Group_2__0 )*
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup_2()); 
            // InternalExpAuto.g:4718:2: ( rule__ListOfSeeds__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpAuto.g:4718:3: rule__ListOfSeeds__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ListOfSeeds__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalExpAuto.g:4726:1: rule__ListOfSeeds__Group__3 : rule__ListOfSeeds__Group__3__Impl ;
    public final void rule__ListOfSeeds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4730:1: ( rule__ListOfSeeds__Group__3__Impl )
            // InternalExpAuto.g:4731:2: rule__ListOfSeeds__Group__3__Impl
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
    // InternalExpAuto.g:4737:1: rule__ListOfSeeds__Group__3__Impl : ( '}' ) ;
    public final void rule__ListOfSeeds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4741:1: ( ( '}' ) )
            // InternalExpAuto.g:4742:1: ( '}' )
            {
            // InternalExpAuto.g:4742:1: ( '}' )
            // InternalExpAuto.g:4743:2: '}'
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
    // InternalExpAuto.g:4753:1: rule__ListOfSeeds__Group_2__0 : rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 ;
    public final void rule__ListOfSeeds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4757:1: ( rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 )
            // InternalExpAuto.g:4758:2: rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1
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
    // InternalExpAuto.g:4765:1: rule__ListOfSeeds__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOfSeeds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4769:1: ( ( ',' ) )
            // InternalExpAuto.g:4770:1: ( ',' )
            {
            // InternalExpAuto.g:4770:1: ( ',' )
            // InternalExpAuto.g:4771:2: ','
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
    // InternalExpAuto.g:4780:1: rule__ListOfSeeds__Group_2__1 : rule__ListOfSeeds__Group_2__1__Impl ;
    public final void rule__ListOfSeeds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4784:1: ( rule__ListOfSeeds__Group_2__1__Impl )
            // InternalExpAuto.g:4785:2: rule__ListOfSeeds__Group_2__1__Impl
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
    // InternalExpAuto.g:4791:1: rule__ListOfSeeds__Group_2__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) ;
    public final void rule__ListOfSeeds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4795:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) )
            // InternalExpAuto.g:4796:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            {
            // InternalExpAuto.g:4796:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            // InternalExpAuto.g:4797:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 
            // InternalExpAuto.g:4798:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            // InternalExpAuto.g:4798:3: rule__ListOfSeeds__SeedsAssignment_2_1
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
    // InternalExpAuto.g:4807:1: rule__ExperimentDatasource__Group__0 : rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 ;
    public final void rule__ExperimentDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4811:1: ( rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 )
            // InternalExpAuto.g:4812:2: rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1
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
    // InternalExpAuto.g:4819:1: rule__ExperimentDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__ExperimentDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4823:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:4824:1: ( 'datasource' )
            {
            // InternalExpAuto.g:4824:1: ( 'datasource' )
            // InternalExpAuto.g:4825:2: 'datasource'
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
    // InternalExpAuto.g:4834:1: rule__ExperimentDatasource__Group__1 : rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 ;
    public final void rule__ExperimentDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4838:1: ( rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 )
            // InternalExpAuto.g:4839:2: rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2
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
    // InternalExpAuto.g:4846:1: rule__ExperimentDatasource__Group__1__Impl : ( '=' ) ;
    public final void rule__ExperimentDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4850:1: ( ( '=' ) )
            // InternalExpAuto.g:4851:1: ( '=' )
            {
            // InternalExpAuto.g:4851:1: ( '=' )
            // InternalExpAuto.g:4852:2: '='
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
    // InternalExpAuto.g:4861:1: rule__ExperimentDatasource__Group__2 : rule__ExperimentDatasource__Group__2__Impl ;
    public final void rule__ExperimentDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4865:1: ( rule__ExperimentDatasource__Group__2__Impl )
            // InternalExpAuto.g:4866:2: rule__ExperimentDatasource__Group__2__Impl
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
    // InternalExpAuto.g:4872:1: rule__ExperimentDatasource__Group__2__Impl : ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) ;
    public final void rule__ExperimentDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4876:1: ( ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) )
            // InternalExpAuto.g:4877:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            {
            // InternalExpAuto.g:4877:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            // InternalExpAuto.g:4878:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 
            // InternalExpAuto.g:4879:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            // InternalExpAuto.g:4879:3: rule__ExperimentDatasource__SourceAssignment_2
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalExpAuto.g:4888:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4892:1: ( ( ruleImport ) )
            // InternalExpAuto.g:4893:2: ( ruleImport )
            {
            // InternalExpAuto.g:4893:2: ( ruleImport )
            // InternalExpAuto.g:4894:3: ruleImport
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
    // InternalExpAuto.g:4903:1: rule__Model__DatasourcesAssignment_1 : ( ruleDatasource ) ;
    public final void rule__Model__DatasourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4907:1: ( ( ruleDatasource ) )
            // InternalExpAuto.g:4908:2: ( ruleDatasource )
            {
            // InternalExpAuto.g:4908:2: ( ruleDatasource )
            // InternalExpAuto.g:4909:3: ruleDatasource
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
    // InternalExpAuto.g:4918:1: rule__Model__ExperimentsAssignment_2 : ( ruleExperiment ) ;
    public final void rule__Model__ExperimentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4922:1: ( ( ruleExperiment ) )
            // InternalExpAuto.g:4923:2: ( ruleExperiment )
            {
            // InternalExpAuto.g:4923:2: ( ruleExperiment )
            // InternalExpAuto.g:4924:3: ruleExperiment
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
    // InternalExpAuto.g:4933:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4937:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4938:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4938:2: ( RULE_STRING )
            // InternalExpAuto.g:4939:3: RULE_STRING
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
    // InternalExpAuto.g:4948:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4952:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:4953:2: ( RULE_ID )
            {
            // InternalExpAuto.g:4953:2: ( RULE_ID )
            // InternalExpAuto.g:4954:3: RULE_ID
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


    // $ANTLR start "rule__Datasource__SpecificationAssignment_3"
    // InternalExpAuto.g:4963:1: rule__Datasource__SpecificationAssignment_3 : ( ruleDatasourceSpecification ) ;
    public final void rule__Datasource__SpecificationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4967:1: ( ( ruleDatasourceSpecification ) )
            // InternalExpAuto.g:4968:2: ( ruleDatasourceSpecification )
            {
            // InternalExpAuto.g:4968:2: ( ruleDatasourceSpecification )
            // InternalExpAuto.g:4969:3: ruleDatasourceSpecification
            {
             before(grammarAccess.getDatasourceAccess().getSpecificationDatasourceSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatasourceSpecification();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getSpecificationDatasourceSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__SpecificationAssignment_3"


    // $ANTLR start "rule__DatasourceSpecification__SpecificationAssignment"
    // InternalExpAuto.g:4978:1: rule__DatasourceSpecification__SpecificationAssignment : ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) ) ;
    public final void rule__DatasourceSpecification__SpecificationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4982:1: ( ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) ) )
            // InternalExpAuto.g:4983:2: ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) )
            {
            // InternalExpAuto.g:4983:2: ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) )
            // InternalExpAuto.g:4984:3: ( rule__DatasourceSpecification__SpecificationAlternatives_0 )
            {
             before(grammarAccess.getDatasourceSpecificationAccess().getSpecificationAlternatives_0()); 
            // InternalExpAuto.g:4985:3: ( rule__DatasourceSpecification__SpecificationAlternatives_0 )
            // InternalExpAuto.g:4985:4: rule__DatasourceSpecification__SpecificationAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DatasourceSpecification__SpecificationAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceSpecificationAccess().getSpecificationAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasourceSpecification__SpecificationAssignment"


    // $ANTLR start "rule__FileDatasourceSpecification__SourceTypeAssignment_0"
    // InternalExpAuto.g:4993:1: rule__FileDatasourceSpecification__SourceTypeAssignment_0 : ( ( 'EDP2' ) ) ;
    public final void rule__FileDatasourceSpecification__SourceTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4997:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:4998:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:4998:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:4999:3: ( 'EDP2' )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0()); 
            // InternalExpAuto.g:5000:3: ( 'EDP2' )
            // InternalExpAuto.g:5001:4: 'EDP2'
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0()); 

            }

             after(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__SourceTypeAssignment_0"


    // $ANTLR start "rule__FileDatasourceSpecification__SourceURIAssignment_2"
    // InternalExpAuto.g:5012:1: rule__FileDatasourceSpecification__SourceURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileDatasourceSpecification__SourceURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5016:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5017:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5017:2: ( RULE_STRING )
            // InternalExpAuto.g:5018:3: RULE_STRING
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDatasourceSpecification__SourceURIAssignment_2"


    // $ANTLR start "rule__MemoryDatasourceSpecification__SourceTypeAssignment"
    // InternalExpAuto.g:5027:1: rule__MemoryDatasourceSpecification__SourceTypeAssignment : ( ( 'EDP2' ) ) ;
    public final void rule__MemoryDatasourceSpecification__SourceTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5031:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:5032:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:5032:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:5033:3: ( 'EDP2' )
            {
             before(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0()); 
            // InternalExpAuto.g:5034:3: ( 'EDP2' )
            // InternalExpAuto.g:5035:4: 'EDP2'
            {
             before(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0()); 

            }

             after(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryDatasourceSpecification__SourceTypeAssignment"


    // $ANTLR start "rule__Experiment__NameAssignment_1"
    // InternalExpAuto.g:5046:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5050:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5051:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5051:2: ( RULE_ID )
            // InternalExpAuto.g:5052:3: RULE_ID
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
    // InternalExpAuto.g:5061:1: rule__Experiment__DesignAssignment_3 : ( ( rule__Experiment__DesignAlternatives_3_0 ) ) ;
    public final void rule__Experiment__DesignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5065:1: ( ( ( rule__Experiment__DesignAlternatives_3_0 ) ) )
            // InternalExpAuto.g:5066:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            {
            // InternalExpAuto.g:5066:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            // InternalExpAuto.g:5067:3: ( rule__Experiment__DesignAlternatives_3_0 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 
            // InternalExpAuto.g:5068:3: ( rule__Experiment__DesignAlternatives_3_0 )
            // InternalExpAuto.g:5068:4: rule__Experiment__DesignAlternatives_3_0
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
    // InternalExpAuto.g:5076:1: rule__Experiment__ExperimentSpecificationsAssignment_5 : ( ruleExperimentSpecifications ) ;
    public final void rule__Experiment__ExperimentSpecificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5080:1: ( ( ruleExperimentSpecifications ) )
            // InternalExpAuto.g:5081:2: ( ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:5081:2: ( ruleExperimentSpecifications )
            // InternalExpAuto.g:5082:3: ruleExperimentSpecifications
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
    // InternalExpAuto.g:5091:1: rule__ExperimentSpecifications__SpecificationsAssignment : ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__ExperimentSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5095:1: ( ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5096:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5096:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5097:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5098:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5098:4: rule__ExperimentSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5106:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5110:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5111:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5111:2: ( RULE_STRING )
            // InternalExpAuto.g:5112:3: RULE_STRING
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
    // InternalExpAuto.g:5121:1: rule__InitialModel__ModeltypAssignment_2 : ( ( 'PCM' ) ) ;
    public final void rule__InitialModel__ModeltypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5125:1: ( ( ( 'PCM' ) ) )
            // InternalExpAuto.g:5126:2: ( ( 'PCM' ) )
            {
            // InternalExpAuto.g:5126:2: ( ( 'PCM' ) )
            // InternalExpAuto.g:5127:3: ( 'PCM' )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            // InternalExpAuto.g:5128:3: ( 'PCM' )
            // InternalExpAuto.g:5129:4: 'PCM'
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
    // InternalExpAuto.g:5140:1: rule__InitialModel__InitSpecificationsAssignment_4 : ( ruleInitSpecifications ) ;
    public final void rule__InitialModel__InitSpecificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5144:1: ( ( ruleInitSpecifications ) )
            // InternalExpAuto.g:5145:2: ( ruleInitSpecifications )
            {
            // InternalExpAuto.g:5145:2: ( ruleInitSpecifications )
            // InternalExpAuto.g:5146:3: ruleInitSpecifications
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
    // InternalExpAuto.g:5155:1: rule__InitSpecifications__SpecificationsAssignment : ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__InitSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5159:1: ( ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5160:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5160:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5161:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5162:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5162:4: rule__InitSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5170:1: rule__AllocationModel__AllocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllocationModel__AllocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5174:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5175:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5175:2: ( RULE_STRING )
            // InternalExpAuto.g:5176:3: RULE_STRING
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
    // InternalExpAuto.g:5185:1: rule__UsageModel__UsageModelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsageModel__UsageModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5189:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5190:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5190:2: ( RULE_STRING )
            // InternalExpAuto.g:5191:3: RULE_STRING
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
    // InternalExpAuto.g:5200:1: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5204:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5205:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5205:2: ( RULE_STRING )
            // InternalExpAuto.g:5206:3: RULE_STRING
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
    // InternalExpAuto.g:5215:1: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5219:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5220:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5220:2: ( RULE_STRING )
            // InternalExpAuto.g:5221:3: RULE_STRING
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
    // InternalExpAuto.g:5230:1: rule__MonitorRepository__MonitorRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonitorRepository__MonitorRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5234:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5235:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5235:2: ( RULE_STRING )
            // InternalExpAuto.g:5236:3: RULE_STRING
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
    // InternalExpAuto.g:5245:1: rule__Variation__VariationTypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__VariationTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5249:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5250:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5250:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5251:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 
            // InternalExpAuto.g:5252:3: ( RULE_ID )
            // InternalExpAuto.g:5253:4: RULE_ID
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
    // InternalExpAuto.g:5264:1: rule__Variation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Variation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5268:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5269:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5269:2: ( RULE_ID )
            // InternalExpAuto.g:5270:3: RULE_ID
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
    // InternalExpAuto.g:5279:1: rule__Variation__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5283:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5284:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5284:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5285:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0()); 
            // InternalExpAuto.g:5286:3: ( RULE_ID )
            // InternalExpAuto.g:5287:4: RULE_ID
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
    // InternalExpAuto.g:5298:1: rule__Variation__MaxVariationsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Variation__MaxVariationsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5302:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5303:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5303:2: ( RULE_INT )
            // InternalExpAuto.g:5304:3: RULE_INT
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
    // InternalExpAuto.g:5313:1: rule__Variation__ValueProviderAssignment_13 : ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) ;
    public final void rule__Variation__ValueProviderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5317:1: ( ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) )
            // InternalExpAuto.g:5318:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            {
            // InternalExpAuto.g:5318:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            // InternalExpAuto.g:5319:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 
            // InternalExpAuto.g:5320:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            // InternalExpAuto.g:5320:4: rule__Variation__ValueProviderAlternatives_13_0
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
    // InternalExpAuto.g:5328:1: rule__NestedIntervalsValueProvider__MinAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5332:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5333:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5333:2: ( RULE_INT )
            // InternalExpAuto.g:5334:3: RULE_INT
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
    // InternalExpAuto.g:5343:1: rule__NestedIntervalsValueProvider__MaxAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5347:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5348:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5348:2: ( RULE_INT )
            // InternalExpAuto.g:5349:3: RULE_INT
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
    // InternalExpAuto.g:5358:1: rule__NestedIntervalsValueProvider__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5362:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5363:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5363:2: ( RULE_INT )
            // InternalExpAuto.g:5364:3: RULE_INT
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
    // InternalExpAuto.g:5373:1: rule__NestedIntervalsValueProvider__MaxAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5377:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5378:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5378:2: ( RULE_INT )
            // InternalExpAuto.g:5379:3: RULE_INT
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
    // InternalExpAuto.g:5388:1: rule__SetValueProvider__ValuesAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5392:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5393:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5393:2: ( RULE_INT )
            // InternalExpAuto.g:5394:3: RULE_INT
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
    // InternalExpAuto.g:5403:1: rule__SetValueProvider__ValuesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5407:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5408:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5408:2: ( RULE_INT )
            // InternalExpAuto.g:5409:3: RULE_INT
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
    // InternalExpAuto.g:5418:1: rule__SetValueProvider__ValuesAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5422:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5423:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5423:2: ( RULE_INT )
            // InternalExpAuto.g:5424:3: RULE_INT
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
    // InternalExpAuto.g:5433:1: rule__SetValueProvider__ValuesAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5437:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5438:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5438:2: ( RULE_INT )
            // InternalExpAuto.g:5439:3: RULE_INT
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
    // InternalExpAuto.g:5448:1: rule__LinearValueProvider__SummandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__SummandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5452:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5453:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5453:2: ( RULE_INT )
            // InternalExpAuto.g:5454:3: RULE_INT
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
    // InternalExpAuto.g:5463:1: rule__LinearValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5467:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5468:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5468:2: ( RULE_INT )
            // InternalExpAuto.g:5469:3: RULE_INT
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
    // InternalExpAuto.g:5478:1: rule__ExponentialValueProvider__BaseAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExponentialValueProvider__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5482:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5483:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5483:2: ( RULE_INT )
            // InternalExpAuto.g:5484:3: RULE_INT
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
    // InternalExpAuto.g:5493:1: rule__PolynomialValueProvider__ExponentAssignment_2 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5497:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5498:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5498:2: ( RULE_INT )
            // InternalExpAuto.g:5499:3: RULE_INT
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
    // InternalExpAuto.g:5508:1: rule__PolynomialValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5512:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5513:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5513:2: ( RULE_INT )
            // InternalExpAuto.g:5514:3: RULE_INT
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
    // InternalExpAuto.g:5523:1: rule__StopTimeCondition__StopTypAssignment_2 : ( ( 'simulationTime' ) ) ;
    public final void rule__StopTimeCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5527:1: ( ( ( 'simulationTime' ) ) )
            // InternalExpAuto.g:5528:2: ( ( 'simulationTime' ) )
            {
            // InternalExpAuto.g:5528:2: ( ( 'simulationTime' ) )
            // InternalExpAuto.g:5529:3: ( 'simulationTime' )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            // InternalExpAuto.g:5530:3: ( 'simulationTime' )
            // InternalExpAuto.g:5531:4: 'simulationTime'
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
    // InternalExpAuto.g:5542:1: rule__StopTimeCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopTimeCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5546:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5547:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5547:2: ( RULE_INT )
            // InternalExpAuto.g:5548:3: RULE_INT
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
    // InternalExpAuto.g:5557:1: rule__StopCountCondition__StopTypAssignment_2 : ( ( 'measurementCount' ) ) ;
    public final void rule__StopCountCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5561:1: ( ( ( 'measurementCount' ) ) )
            // InternalExpAuto.g:5562:2: ( ( 'measurementCount' ) )
            {
            // InternalExpAuto.g:5562:2: ( ( 'measurementCount' ) )
            // InternalExpAuto.g:5563:3: ( 'measurementCount' )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            // InternalExpAuto.g:5564:3: ( 'measurementCount' )
            // InternalExpAuto.g:5565:4: 'measurementCount'
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
    // InternalExpAuto.g:5576:1: rule__StopCountCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopCountCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5580:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5581:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5581:2: ( RULE_INT )
            // InternalExpAuto.g:5582:3: RULE_INT
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
    // InternalExpAuto.g:5591:1: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5595:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5596:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5596:2: ( RULE_INT )
            // InternalExpAuto.g:5597:3: RULE_INT
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


    // $ANTLR start "rule__ToolDefinition__ToolAssignment_2"
    // InternalExpAuto.g:5606:1: rule__ToolDefinition__ToolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ToolDefinition__ToolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5610:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5611:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5611:2: ( RULE_STRING )
            // InternalExpAuto.g:5612:3: RULE_STRING
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
    // InternalExpAuto.g:5621:1: rule__ToolDefinition__ConfigParamsAssignment_4 : ( ruleConfigurationParams ) ;
    public final void rule__ToolDefinition__ConfigParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5625:1: ( ( ruleConfigurationParams ) )
            // InternalExpAuto.g:5626:2: ( ruleConfigurationParams )
            {
            // InternalExpAuto.g:5626:2: ( ruleConfigurationParams )
            // InternalExpAuto.g:5627:3: ruleConfigurationParams
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
    // InternalExpAuto.g:5636:1: rule__ConfigurationParams__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigurationParams__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5640:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5641:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5641:2: ( RULE_ID )
            // InternalExpAuto.g:5642:3: RULE_ID
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
    // InternalExpAuto.g:5651:1: rule__ConfigurationParams__ValueAssignment_2 : ( ruleConfigValue ) ;
    public final void rule__ConfigurationParams__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5655:1: ( ( ruleConfigValue ) )
            // InternalExpAuto.g:5656:2: ( ruleConfigValue )
            {
            // InternalExpAuto.g:5656:2: ( ruleConfigValue )
            // InternalExpAuto.g:5657:3: ruleConfigValue
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


    // $ANTLR start "rule__SeedDefinition__SeedListsAssignment_3"
    // InternalExpAuto.g:5666:1: rule__SeedDefinition__SeedListsAssignment_3 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5670:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5671:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5671:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5672:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5681:1: rule__SeedDefinition__SeedListsAssignment_4_1 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5685:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5686:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5686:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5687:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5696:1: rule__ListOfSeeds__SeedsAssignment_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5700:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5701:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5701:2: ( RULE_INT )
            // InternalExpAuto.g:5702:3: RULE_INT
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
    // InternalExpAuto.g:5711:1: rule__ListOfSeeds__SeedsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5715:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5716:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5716:2: ( RULE_INT )
            // InternalExpAuto.g:5717:3: RULE_INT
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
    // InternalExpAuto.g:5726:1: rule__ExperimentDatasource__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExperimentDatasource__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5730:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5731:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5731:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5732:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalExpAuto.g:5733:3: ( RULE_ID )
            // InternalExpAuto.g:5734:4: RULE_ID
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\16\3\uffff\1\26\4\uffff\1\57\2\uffff";
    static final String dfa_3s = "\1\54\3\uffff\1\26\4\uffff\1\60\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\uffff\1\5\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\6\uffff\1\1\1\uffff\1\2\5\uffff\1\3\13\uffff\1\4\1\5\1\6\1\7",
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
            return "883:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) | ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) );";
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