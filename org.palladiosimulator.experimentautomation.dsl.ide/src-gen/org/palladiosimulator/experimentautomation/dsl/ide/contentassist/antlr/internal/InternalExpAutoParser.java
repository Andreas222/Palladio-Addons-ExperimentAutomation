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

                if ( (LA1_0==21||LA1_0==23||LA1_0==29||(LA1_0>=41 && LA1_0<=43)) ) {
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
    // InternalExpAuto.g:726:1: ruleConfigurationParams : ( ( ( rule__ConfigurationParams__ParamsAssignment ) ) ( ( rule__ConfigurationParams__ParamsAssignment )* ) ) ;
    public final void ruleConfigurationParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:730:2: ( ( ( ( rule__ConfigurationParams__ParamsAssignment ) ) ( ( rule__ConfigurationParams__ParamsAssignment )* ) ) )
            // InternalExpAuto.g:731:2: ( ( ( rule__ConfigurationParams__ParamsAssignment ) ) ( ( rule__ConfigurationParams__ParamsAssignment )* ) )
            {
            // InternalExpAuto.g:731:2: ( ( ( rule__ConfigurationParams__ParamsAssignment ) ) ( ( rule__ConfigurationParams__ParamsAssignment )* ) )
            // InternalExpAuto.g:732:3: ( ( rule__ConfigurationParams__ParamsAssignment ) ) ( ( rule__ConfigurationParams__ParamsAssignment )* )
            {
            // InternalExpAuto.g:732:3: ( ( rule__ConfigurationParams__ParamsAssignment ) )
            // InternalExpAuto.g:733:4: ( rule__ConfigurationParams__ParamsAssignment )
            {
             before(grammarAccess.getConfigurationParamsAccess().getParamsAssignment()); 
            // InternalExpAuto.g:734:4: ( rule__ConfigurationParams__ParamsAssignment )
            // InternalExpAuto.g:734:5: rule__ConfigurationParams__ParamsAssignment
            {
            pushFollow(FOLLOW_5);
            rule__ConfigurationParams__ParamsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationParamsAccess().getParamsAssignment()); 

            }

            // InternalExpAuto.g:737:3: ( ( rule__ConfigurationParams__ParamsAssignment )* )
            // InternalExpAuto.g:738:4: ( rule__ConfigurationParams__ParamsAssignment )*
            {
             before(grammarAccess.getConfigurationParamsAccess().getParamsAssignment()); 
            // InternalExpAuto.g:739:4: ( rule__ConfigurationParams__ParamsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==14||LA3_0==41||LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpAuto.g:739:5: rule__ConfigurationParams__ParamsAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ConfigurationParams__ParamsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConfigurationParamsAccess().getParamsAssignment()); 

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
    // $ANTLR end "ruleConfigurationParams"


    // $ANTLR start "entryRuleSeedDefinition"
    // InternalExpAuto.g:749:1: entryRuleSeedDefinition : ruleSeedDefinition EOF ;
    public final void entryRuleSeedDefinition() throws RecognitionException {
        try {
            // InternalExpAuto.g:750:1: ( ruleSeedDefinition EOF )
            // InternalExpAuto.g:751:1: ruleSeedDefinition EOF
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
    // InternalExpAuto.g:758:1: ruleSeedDefinition : ( ( rule__SeedDefinition__Group__0 ) ) ;
    public final void ruleSeedDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:762:2: ( ( ( rule__SeedDefinition__Group__0 ) ) )
            // InternalExpAuto.g:763:2: ( ( rule__SeedDefinition__Group__0 ) )
            {
            // InternalExpAuto.g:763:2: ( ( rule__SeedDefinition__Group__0 ) )
            // InternalExpAuto.g:764:3: ( rule__SeedDefinition__Group__0 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup()); 
            // InternalExpAuto.g:765:3: ( rule__SeedDefinition__Group__0 )
            // InternalExpAuto.g:765:4: rule__SeedDefinition__Group__0
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
    // InternalExpAuto.g:774:1: entryRuleListOfSeeds : ruleListOfSeeds EOF ;
    public final void entryRuleListOfSeeds() throws RecognitionException {
        try {
            // InternalExpAuto.g:775:1: ( ruleListOfSeeds EOF )
            // InternalExpAuto.g:776:1: ruleListOfSeeds EOF
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
    // InternalExpAuto.g:783:1: ruleListOfSeeds : ( ( rule__ListOfSeeds__Group__0 ) ) ;
    public final void ruleListOfSeeds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:787:2: ( ( ( rule__ListOfSeeds__Group__0 ) ) )
            // InternalExpAuto.g:788:2: ( ( rule__ListOfSeeds__Group__0 ) )
            {
            // InternalExpAuto.g:788:2: ( ( rule__ListOfSeeds__Group__0 ) )
            // InternalExpAuto.g:789:3: ( rule__ListOfSeeds__Group__0 )
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup()); 
            // InternalExpAuto.g:790:3: ( rule__ListOfSeeds__Group__0 )
            // InternalExpAuto.g:790:4: rule__ListOfSeeds__Group__0
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
    // InternalExpAuto.g:799:1: entryRuleExperimentDatasource : ruleExperimentDatasource EOF ;
    public final void entryRuleExperimentDatasource() throws RecognitionException {
        try {
            // InternalExpAuto.g:800:1: ( ruleExperimentDatasource EOF )
            // InternalExpAuto.g:801:1: ruleExperimentDatasource EOF
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
    // InternalExpAuto.g:808:1: ruleExperimentDatasource : ( ( rule__ExperimentDatasource__Group__0 ) ) ;
    public final void ruleExperimentDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:812:2: ( ( ( rule__ExperimentDatasource__Group__0 ) ) )
            // InternalExpAuto.g:813:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            {
            // InternalExpAuto.g:813:2: ( ( rule__ExperimentDatasource__Group__0 ) )
            // InternalExpAuto.g:814:3: ( rule__ExperimentDatasource__Group__0 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getGroup()); 
            // InternalExpAuto.g:815:3: ( rule__ExperimentDatasource__Group__0 )
            // InternalExpAuto.g:815:4: rule__ExperimentDatasource__Group__0
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


    // $ANTLR start "entryRuleKeyValue"
    // InternalExpAuto.g:824:1: entryRuleKeyValue : ruleKeyValue EOF ;
    public final void entryRuleKeyValue() throws RecognitionException {
        try {
            // InternalExpAuto.g:825:1: ( ruleKeyValue EOF )
            // InternalExpAuto.g:826:1: ruleKeyValue EOF
            {
             before(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getKeyValueRule()); 
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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // InternalExpAuto.g:833:1: ruleKeyValue : ( ( rule__KeyValue__Group__0 ) ) ;
    public final void ruleKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:837:2: ( ( ( rule__KeyValue__Group__0 ) ) )
            // InternalExpAuto.g:838:2: ( ( rule__KeyValue__Group__0 ) )
            {
            // InternalExpAuto.g:838:2: ( ( rule__KeyValue__Group__0 ) )
            // InternalExpAuto.g:839:3: ( rule__KeyValue__Group__0 )
            {
             before(grammarAccess.getKeyValueAccess().getGroup()); 
            // InternalExpAuto.g:840:3: ( rule__KeyValue__Group__0 )
            // InternalExpAuto.g:840:4: rule__KeyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "entryRuleConfigValue"
    // InternalExpAuto.g:849:1: entryRuleConfigValue : ruleConfigValue EOF ;
    public final void entryRuleConfigValue() throws RecognitionException {
        try {
            // InternalExpAuto.g:850:1: ( ruleConfigValue EOF )
            // InternalExpAuto.g:851:1: ruleConfigValue EOF
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
    // InternalExpAuto.g:858:1: ruleConfigValue : ( ( rule__ConfigValue__Alternatives ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:862:2: ( ( ( rule__ConfigValue__Alternatives ) ) )
            // InternalExpAuto.g:863:2: ( ( rule__ConfigValue__Alternatives ) )
            {
            // InternalExpAuto.g:863:2: ( ( rule__ConfigValue__Alternatives ) )
            // InternalExpAuto.g:864:3: ( rule__ConfigValue__Alternatives )
            {
             before(grammarAccess.getConfigValueAccess().getAlternatives()); 
            // InternalExpAuto.g:865:3: ( rule__ConfigValue__Alternatives )
            // InternalExpAuto.g:865:4: rule__ConfigValue__Alternatives
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


    // $ANTLR start "rule__DatasourceSpecification__SpecificationAlternatives_0"
    // InternalExpAuto.g:873:1: rule__DatasourceSpecification__SpecificationAlternatives_0 : ( ( ruleFileDatasourceSpecification ) | ( ruleMemoryDatasourceSpecification ) );
    public final void rule__DatasourceSpecification__SpecificationAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:877:1: ( ( ruleFileDatasourceSpecification ) | ( ruleMemoryDatasourceSpecification ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==14||LA4_1==18) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
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
                    // InternalExpAuto.g:878:2: ( ruleFileDatasourceSpecification )
                    {
                    // InternalExpAuto.g:878:2: ( ruleFileDatasourceSpecification )
                    // InternalExpAuto.g:879:3: ruleFileDatasourceSpecification
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
                    // InternalExpAuto.g:884:2: ( ruleMemoryDatasourceSpecification )
                    {
                    // InternalExpAuto.g:884:2: ( ruleMemoryDatasourceSpecification )
                    // InternalExpAuto.g:885:3: ruleMemoryDatasourceSpecification
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
    // InternalExpAuto.g:894:1: rule__Experiment__DesignAlternatives_3_0 : ( ( 'FullFactorial' ) | ( 'OneFactor' ) );
    public final void rule__Experiment__DesignAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:898:1: ( ( 'FullFactorial' ) | ( 'OneFactor' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpAuto.g:899:2: ( 'FullFactorial' )
                    {
                    // InternalExpAuto.g:899:2: ( 'FullFactorial' )
                    // InternalExpAuto.g:900:3: 'FullFactorial'
                    {
                     before(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExperimentAccess().getDesignFullFactorialKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:905:2: ( 'OneFactor' )
                    {
                    // InternalExpAuto.g:905:2: ( 'OneFactor' )
                    // InternalExpAuto.g:906:3: 'OneFactor'
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
    // InternalExpAuto.g:915:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) );
    public final void rule__ExperimentSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:919:1: ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalExpAuto.g:920:2: ( ruleDescription )
                    {
                    // InternalExpAuto.g:920:2: ( ruleDescription )
                    // InternalExpAuto.g:921:3: ruleDescription
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
                    // InternalExpAuto.g:926:2: ( ruleInitialModel )
                    {
                    // InternalExpAuto.g:926:2: ( ruleInitialModel )
                    // InternalExpAuto.g:927:3: ruleInitialModel
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
                    // InternalExpAuto.g:932:2: ( ruleVariation )
                    {
                    // InternalExpAuto.g:932:2: ( ruleVariation )
                    // InternalExpAuto.g:933:3: ruleVariation
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
                    // InternalExpAuto.g:938:2: ( ruleStopTimeCondition )
                    {
                    // InternalExpAuto.g:938:2: ( ruleStopTimeCondition )
                    // InternalExpAuto.g:939:3: ruleStopTimeCondition
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
                    // InternalExpAuto.g:944:2: ( ruleStopCountCondition )
                    {
                    // InternalExpAuto.g:944:2: ( ruleStopCountCondition )
                    // InternalExpAuto.g:945:3: ruleStopCountCondition
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
                    // InternalExpAuto.g:950:2: ( ruleNumberOfExperiments )
                    {
                    // InternalExpAuto.g:950:2: ( ruleNumberOfExperiments )
                    // InternalExpAuto.g:951:3: ruleNumberOfExperiments
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
                    // InternalExpAuto.g:956:2: ( ruleToolDefinition )
                    {
                    // InternalExpAuto.g:956:2: ( ruleToolDefinition )
                    // InternalExpAuto.g:957:3: ruleToolDefinition
                    {
                     before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleToolDefinition();

                    state._fsp--;

                     after(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsToolDefinitionParserRuleCall_0_6()); 

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
    // InternalExpAuto.g:966:1: rule__InitSpecifications__SpecificationsAlternatives_0 : ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) );
    public final void rule__InitSpecifications__SpecificationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:970:1: ( ( ruleAllocationModel ) | ( ruleUsageModel ) | ( ruleMiddlewareRepository ) | ( ruleEventMiddlewareRepository ) | ( ruleMonitorRepository ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
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
                    // InternalExpAuto.g:971:2: ( ruleAllocationModel )
                    {
                    // InternalExpAuto.g:971:2: ( ruleAllocationModel )
                    // InternalExpAuto.g:972:3: ruleAllocationModel
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
                    // InternalExpAuto.g:977:2: ( ruleUsageModel )
                    {
                    // InternalExpAuto.g:977:2: ( ruleUsageModel )
                    // InternalExpAuto.g:978:3: ruleUsageModel
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
                    // InternalExpAuto.g:983:2: ( ruleMiddlewareRepository )
                    {
                    // InternalExpAuto.g:983:2: ( ruleMiddlewareRepository )
                    // InternalExpAuto.g:984:3: ruleMiddlewareRepository
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
                    // InternalExpAuto.g:989:2: ( ruleEventMiddlewareRepository )
                    {
                    // InternalExpAuto.g:989:2: ( ruleEventMiddlewareRepository )
                    // InternalExpAuto.g:990:3: ruleEventMiddlewareRepository
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
                    // InternalExpAuto.g:995:2: ( ruleMonitorRepository )
                    {
                    // InternalExpAuto.g:995:2: ( ruleMonitorRepository )
                    // InternalExpAuto.g:996:3: ruleMonitorRepository
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
    // InternalExpAuto.g:1005:1: rule__Variation__ValueProviderAlternatives_13_0 : ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) );
    public final void rule__Variation__ValueProviderAlternatives_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1009:1: ( ( ruleNestedIntervalsValueProvider ) | ( ruleSetValueProvider ) | ( ruleLinearValueProvider ) | ( ruleExponentialValueProvider ) | ( rulePolynomialValueProvider ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 33:
            case 36:
                {
                alt8=1;
                }
                break;
            case 19:
            case 37:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            case 40:
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
                    // InternalExpAuto.g:1010:2: ( ruleNestedIntervalsValueProvider )
                    {
                    // InternalExpAuto.g:1010:2: ( ruleNestedIntervalsValueProvider )
                    // InternalExpAuto.g:1011:3: ruleNestedIntervalsValueProvider
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
                    // InternalExpAuto.g:1016:2: ( ruleSetValueProvider )
                    {
                    // InternalExpAuto.g:1016:2: ( ruleSetValueProvider )
                    // InternalExpAuto.g:1017:3: ruleSetValueProvider
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
                    // InternalExpAuto.g:1022:2: ( ruleLinearValueProvider )
                    {
                    // InternalExpAuto.g:1022:2: ( ruleLinearValueProvider )
                    // InternalExpAuto.g:1023:3: ruleLinearValueProvider
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
                    // InternalExpAuto.g:1028:2: ( ruleExponentialValueProvider )
                    {
                    // InternalExpAuto.g:1028:2: ( ruleExponentialValueProvider )
                    // InternalExpAuto.g:1029:3: ruleExponentialValueProvider
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
                    // InternalExpAuto.g:1034:2: ( rulePolynomialValueProvider )
                    {
                    // InternalExpAuto.g:1034:2: ( rulePolynomialValueProvider )
                    // InternalExpAuto.g:1035:3: rulePolynomialValueProvider
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
    // InternalExpAuto.g:1044:1: rule__NestedIntervalsValueProvider__Alternatives : ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) );
    public final void rule__NestedIntervalsValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1048:1: ( ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) ) | ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpAuto.g:1049:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1049:2: ( ( rule__NestedIntervalsValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1050:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1051:3: ( rule__NestedIntervalsValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1051:4: rule__NestedIntervalsValueProvider__Group_0__0
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
                    // InternalExpAuto.g:1055:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1055:2: ( ( rule__NestedIntervalsValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1056:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1057:3: ( rule__NestedIntervalsValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1057:4: rule__NestedIntervalsValueProvider__Group_1__0
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
    // InternalExpAuto.g:1065:1: rule__SetValueProvider__Alternatives : ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) );
    public final void rule__SetValueProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1069:1: ( ( ( rule__SetValueProvider__Group_0__0 ) ) | ( ( rule__SetValueProvider__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpAuto.g:1070:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    {
                    // InternalExpAuto.g:1070:2: ( ( rule__SetValueProvider__Group_0__0 ) )
                    // InternalExpAuto.g:1071:3: ( rule__SetValueProvider__Group_0__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_0()); 
                    // InternalExpAuto.g:1072:3: ( rule__SetValueProvider__Group_0__0 )
                    // InternalExpAuto.g:1072:4: rule__SetValueProvider__Group_0__0
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
                    // InternalExpAuto.g:1076:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    {
                    // InternalExpAuto.g:1076:2: ( ( rule__SetValueProvider__Group_1__0 ) )
                    // InternalExpAuto.g:1077:3: ( rule__SetValueProvider__Group_1__0 )
                    {
                     before(grammarAccess.getSetValueProviderAccess().getGroup_1()); 
                    // InternalExpAuto.g:1078:3: ( rule__SetValueProvider__Group_1__0 )
                    // InternalExpAuto.g:1078:4: rule__SetValueProvider__Group_1__0
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


    // $ANTLR start "rule__ConfigurationParams__ParamsAlternatives_0"
    // InternalExpAuto.g:1086:1: rule__ConfigurationParams__ParamsAlternatives_0 : ( ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleKeyValue ) );
    public final void rule__ConfigurationParams__ParamsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1090:1: ( ( ruleSeedDefinition ) | ( ruleExperimentDatasource ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleKeyValue ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case 41:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==22) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==48) ) {
                        alt11=4;
                    }
                    else if ( (LA11_5==47) ) {
                        alt11=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalExpAuto.g:1091:2: ( ruleSeedDefinition )
                    {
                    // InternalExpAuto.g:1091:2: ( ruleSeedDefinition )
                    // InternalExpAuto.g:1092:3: ruleSeedDefinition
                    {
                     before(grammarAccess.getConfigurationParamsAccess().getParamsSeedDefinitionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSeedDefinition();

                    state._fsp--;

                     after(grammarAccess.getConfigurationParamsAccess().getParamsSeedDefinitionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1097:2: ( ruleExperimentDatasource )
                    {
                    // InternalExpAuto.g:1097:2: ( ruleExperimentDatasource )
                    // InternalExpAuto.g:1098:3: ruleExperimentDatasource
                    {
                     before(grammarAccess.getConfigurationParamsAccess().getParamsExperimentDatasourceParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExperimentDatasource();

                    state._fsp--;

                     after(grammarAccess.getConfigurationParamsAccess().getParamsExperimentDatasourceParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpAuto.g:1103:2: ( ruleStopTimeCondition )
                    {
                    // InternalExpAuto.g:1103:2: ( ruleStopTimeCondition )
                    // InternalExpAuto.g:1104:3: ruleStopTimeCondition
                    {
                     before(grammarAccess.getConfigurationParamsAccess().getParamsStopTimeConditionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStopTimeCondition();

                    state._fsp--;

                     after(grammarAccess.getConfigurationParamsAccess().getParamsStopTimeConditionParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpAuto.g:1109:2: ( ruleStopCountCondition )
                    {
                    // InternalExpAuto.g:1109:2: ( ruleStopCountCondition )
                    // InternalExpAuto.g:1110:3: ruleStopCountCondition
                    {
                     before(grammarAccess.getConfigurationParamsAccess().getParamsStopCountConditionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStopCountCondition();

                    state._fsp--;

                     after(grammarAccess.getConfigurationParamsAccess().getParamsStopCountConditionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpAuto.g:1115:2: ( ruleKeyValue )
                    {
                    // InternalExpAuto.g:1115:2: ( ruleKeyValue )
                    // InternalExpAuto.g:1116:3: ruleKeyValue
                    {
                     before(grammarAccess.getConfigurationParamsAccess().getParamsKeyValueParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyValue();

                    state._fsp--;

                     after(grammarAccess.getConfigurationParamsAccess().getParamsKeyValueParserRuleCall_0_4()); 

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
    // $ANTLR end "rule__ConfigurationParams__ParamsAlternatives_0"


    // $ANTLR start "rule__ConfigValue__Alternatives"
    // InternalExpAuto.g:1125:1: rule__ConfigValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__ConfigValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1129:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalExpAuto.g:1130:2: ( RULE_STRING )
                    {
                    // InternalExpAuto.g:1130:2: ( RULE_STRING )
                    // InternalExpAuto.g:1131:3: RULE_STRING
                    {
                     before(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConfigValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpAuto.g:1136:2: ( RULE_INT )
                    {
                    // InternalExpAuto.g:1136:2: ( RULE_INT )
                    // InternalExpAuto.g:1137:3: RULE_INT
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
    // InternalExpAuto.g:1146:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1150:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpAuto.g:1151:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalExpAuto.g:1158:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1162:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalExpAuto.g:1163:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalExpAuto.g:1163:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalExpAuto.g:1164:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalExpAuto.g:1164:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalExpAuto.g:1165:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1166:3: ( rule__Model__ImportsAssignment_0 )
            // InternalExpAuto.g:1166:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_7);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalExpAuto.g:1169:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalExpAuto.g:1170:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalExpAuto.g:1171:3: ( rule__Model__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpAuto.g:1171:4: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalExpAuto.g:1180:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1184:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalExpAuto.g:1185:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalExpAuto.g:1192:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1196:1: ( ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) ) )
            // InternalExpAuto.g:1197:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            {
            // InternalExpAuto.g:1197:1: ( ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* ) )
            // InternalExpAuto.g:1198:2: ( ( rule__Model__DatasourcesAssignment_1 ) ) ( ( rule__Model__DatasourcesAssignment_1 )* )
            {
            // InternalExpAuto.g:1198:2: ( ( rule__Model__DatasourcesAssignment_1 ) )
            // InternalExpAuto.g:1199:3: ( rule__Model__DatasourcesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1200:3: ( rule__Model__DatasourcesAssignment_1 )
            // InternalExpAuto.g:1200:4: rule__Model__DatasourcesAssignment_1
            {
            pushFollow(FOLLOW_9);
            rule__Model__DatasourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 

            }

            // InternalExpAuto.g:1203:2: ( ( rule__Model__DatasourcesAssignment_1 )* )
            // InternalExpAuto.g:1204:3: ( rule__Model__DatasourcesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDatasourcesAssignment_1()); 
            // InternalExpAuto.g:1205:3: ( rule__Model__DatasourcesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpAuto.g:1205:4: rule__Model__DatasourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__DatasourcesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalExpAuto.g:1214:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1218:1: ( rule__Model__Group__2__Impl )
            // InternalExpAuto.g:1219:2: rule__Model__Group__2__Impl
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
    // InternalExpAuto.g:1225:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1229:1: ( ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) ) )
            // InternalExpAuto.g:1230:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            {
            // InternalExpAuto.g:1230:1: ( ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* ) )
            // InternalExpAuto.g:1231:2: ( ( rule__Model__ExperimentsAssignment_2 ) ) ( ( rule__Model__ExperimentsAssignment_2 )* )
            {
            // InternalExpAuto.g:1231:2: ( ( rule__Model__ExperimentsAssignment_2 ) )
            // InternalExpAuto.g:1232:3: ( rule__Model__ExperimentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1233:3: ( rule__Model__ExperimentsAssignment_2 )
            // InternalExpAuto.g:1233:4: rule__Model__ExperimentsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__Model__ExperimentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 

            }

            // InternalExpAuto.g:1236:2: ( ( rule__Model__ExperimentsAssignment_2 )* )
            // InternalExpAuto.g:1237:3: ( rule__Model__ExperimentsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getExperimentsAssignment_2()); 
            // InternalExpAuto.g:1238:3: ( rule__Model__ExperimentsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpAuto.g:1238:4: rule__Model__ExperimentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__ExperimentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalExpAuto.g:1248:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1252:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalExpAuto.g:1253:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:1260:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1264:1: ( ( 'import' ) )
            // InternalExpAuto.g:1265:1: ( 'import' )
            {
            // InternalExpAuto.g:1265:1: ( 'import' )
            // InternalExpAuto.g:1266:2: 'import'
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
    // InternalExpAuto.g:1275:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1279:1: ( rule__Import__Group__1__Impl )
            // InternalExpAuto.g:1280:2: rule__Import__Group__1__Impl
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
    // InternalExpAuto.g:1286:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1290:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // InternalExpAuto.g:1291:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // InternalExpAuto.g:1291:1: ( ( rule__Import__PathAssignment_1 ) )
            // InternalExpAuto.g:1292:2: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // InternalExpAuto.g:1293:2: ( rule__Import__PathAssignment_1 )
            // InternalExpAuto.g:1293:3: rule__Import__PathAssignment_1
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
    // InternalExpAuto.g:1302:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1306:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalExpAuto.g:1307:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:1314:1: rule__Datasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1318:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:1319:1: ( 'datasource' )
            {
            // InternalExpAuto.g:1319:1: ( 'datasource' )
            // InternalExpAuto.g:1320:2: 'datasource'
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
    // InternalExpAuto.g:1329:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1333:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalExpAuto.g:1334:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalExpAuto.g:1341:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1345:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1346:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1346:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalExpAuto.g:1347:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1348:2: ( rule__Datasource__NameAssignment_1 )
            // InternalExpAuto.g:1348:3: rule__Datasource__NameAssignment_1
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
    // InternalExpAuto.g:1356:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1360:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalExpAuto.g:1361:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalExpAuto.g:1368:1: rule__Datasource__Group__2__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1372:1: ( ( ':' ) )
            // InternalExpAuto.g:1373:1: ( ':' )
            {
            // InternalExpAuto.g:1373:1: ( ':' )
            // InternalExpAuto.g:1374:2: ':'
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
    // InternalExpAuto.g:1383:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1387:1: ( rule__Datasource__Group__3__Impl )
            // InternalExpAuto.g:1388:2: rule__Datasource__Group__3__Impl
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
    // InternalExpAuto.g:1394:1: rule__Datasource__Group__3__Impl : ( ( rule__Datasource__SpecificationAssignment_3 ) ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1398:1: ( ( ( rule__Datasource__SpecificationAssignment_3 ) ) )
            // InternalExpAuto.g:1399:1: ( ( rule__Datasource__SpecificationAssignment_3 ) )
            {
            // InternalExpAuto.g:1399:1: ( ( rule__Datasource__SpecificationAssignment_3 ) )
            // InternalExpAuto.g:1400:2: ( rule__Datasource__SpecificationAssignment_3 )
            {
             before(grammarAccess.getDatasourceAccess().getSpecificationAssignment_3()); 
            // InternalExpAuto.g:1401:2: ( rule__Datasource__SpecificationAssignment_3 )
            // InternalExpAuto.g:1401:3: rule__Datasource__SpecificationAssignment_3
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
    // InternalExpAuto.g:1410:1: rule__FileDatasourceSpecification__Group__0 : rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1 ;
    public final void rule__FileDatasourceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1414:1: ( rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1 )
            // InternalExpAuto.g:1415:2: rule__FileDatasourceSpecification__Group__0__Impl rule__FileDatasourceSpecification__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:1422:1: rule__FileDatasourceSpecification__Group__0__Impl : ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) ) ;
    public final void rule__FileDatasourceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1426:1: ( ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) ) )
            // InternalExpAuto.g:1427:1: ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) )
            {
            // InternalExpAuto.g:1427:1: ( ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 ) )
            // InternalExpAuto.g:1428:2: ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeAssignment_0()); 
            // InternalExpAuto.g:1429:2: ( rule__FileDatasourceSpecification__SourceTypeAssignment_0 )
            // InternalExpAuto.g:1429:3: rule__FileDatasourceSpecification__SourceTypeAssignment_0
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
    // InternalExpAuto.g:1437:1: rule__FileDatasourceSpecification__Group__1 : rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2 ;
    public final void rule__FileDatasourceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1441:1: ( rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2 )
            // InternalExpAuto.g:1442:2: rule__FileDatasourceSpecification__Group__1__Impl rule__FileDatasourceSpecification__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:1449:1: rule__FileDatasourceSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__FileDatasourceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1453:1: ( ( '(' ) )
            // InternalExpAuto.g:1454:1: ( '(' )
            {
            // InternalExpAuto.g:1454:1: ( '(' )
            // InternalExpAuto.g:1455:2: '('
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
    // InternalExpAuto.g:1464:1: rule__FileDatasourceSpecification__Group__2 : rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3 ;
    public final void rule__FileDatasourceSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1468:1: ( rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3 )
            // InternalExpAuto.g:1469:2: rule__FileDatasourceSpecification__Group__2__Impl rule__FileDatasourceSpecification__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:1476:1: rule__FileDatasourceSpecification__Group__2__Impl : ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) ) ;
    public final void rule__FileDatasourceSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1480:1: ( ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) ) )
            // InternalExpAuto.g:1481:1: ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) )
            {
            // InternalExpAuto.g:1481:1: ( ( rule__FileDatasourceSpecification__SourceURIAssignment_2 ) )
            // InternalExpAuto.g:1482:2: ( rule__FileDatasourceSpecification__SourceURIAssignment_2 )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURIAssignment_2()); 
            // InternalExpAuto.g:1483:2: ( rule__FileDatasourceSpecification__SourceURIAssignment_2 )
            // InternalExpAuto.g:1483:3: rule__FileDatasourceSpecification__SourceURIAssignment_2
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
    // InternalExpAuto.g:1491:1: rule__FileDatasourceSpecification__Group__3 : rule__FileDatasourceSpecification__Group__3__Impl ;
    public final void rule__FileDatasourceSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1495:1: ( rule__FileDatasourceSpecification__Group__3__Impl )
            // InternalExpAuto.g:1496:2: rule__FileDatasourceSpecification__Group__3__Impl
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
    // InternalExpAuto.g:1502:1: rule__FileDatasourceSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__FileDatasourceSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1506:1: ( ( ')' ) )
            // InternalExpAuto.g:1507:1: ( ')' )
            {
            // InternalExpAuto.g:1507:1: ( ')' )
            // InternalExpAuto.g:1508:2: ')'
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
    // InternalExpAuto.g:1518:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1522:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalExpAuto.g:1523:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:1530:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1534:1: ( ( 'experiment' ) )
            // InternalExpAuto.g:1535:1: ( 'experiment' )
            {
            // InternalExpAuto.g:1535:1: ( 'experiment' )
            // InternalExpAuto.g:1536:2: 'experiment'
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
    // InternalExpAuto.g:1545:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1549:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalExpAuto.g:1550:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalExpAuto.g:1557:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1561:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalExpAuto.g:1562:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalExpAuto.g:1562:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalExpAuto.g:1563:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalExpAuto.g:1564:2: ( rule__Experiment__NameAssignment_1 )
            // InternalExpAuto.g:1564:3: rule__Experiment__NameAssignment_1
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
    // InternalExpAuto.g:1572:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1576:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalExpAuto.g:1577:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalExpAuto.g:1584:1: rule__Experiment__Group__2__Impl : ( ':' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1588:1: ( ( ':' ) )
            // InternalExpAuto.g:1589:1: ( ':' )
            {
            // InternalExpAuto.g:1589:1: ( ':' )
            // InternalExpAuto.g:1590:2: ':'
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
    // InternalExpAuto.g:1599:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1603:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalExpAuto.g:1604:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:1611:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__DesignAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1615:1: ( ( ( rule__Experiment__DesignAssignment_3 ) ) )
            // InternalExpAuto.g:1616:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            {
            // InternalExpAuto.g:1616:1: ( ( rule__Experiment__DesignAssignment_3 ) )
            // InternalExpAuto.g:1617:2: ( rule__Experiment__DesignAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAssignment_3()); 
            // InternalExpAuto.g:1618:2: ( rule__Experiment__DesignAssignment_3 )
            // InternalExpAuto.g:1618:3: rule__Experiment__DesignAssignment_3
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
    // InternalExpAuto.g:1626:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1630:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalExpAuto.g:1631:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalExpAuto.g:1638:1: rule__Experiment__Group__4__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1642:1: ( ( '{' ) )
            // InternalExpAuto.g:1643:1: ( '{' )
            {
            // InternalExpAuto.g:1643:1: ( '{' )
            // InternalExpAuto.g:1644:2: '{'
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
    // InternalExpAuto.g:1653:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1657:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalExpAuto.g:1658:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalExpAuto.g:1665:1: rule__Experiment__Group__5__Impl : ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1669:1: ( ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) ) )
            // InternalExpAuto.g:1670:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            {
            // InternalExpAuto.g:1670:1: ( ( rule__Experiment__ExperimentSpecificationsAssignment_5 ) )
            // InternalExpAuto.g:1671:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            {
             before(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5()); 
            // InternalExpAuto.g:1672:2: ( rule__Experiment__ExperimentSpecificationsAssignment_5 )
            // InternalExpAuto.g:1672:3: rule__Experiment__ExperimentSpecificationsAssignment_5
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
    // InternalExpAuto.g:1680:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1684:1: ( rule__Experiment__Group__6__Impl )
            // InternalExpAuto.g:1685:2: rule__Experiment__Group__6__Impl
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
    // InternalExpAuto.g:1691:1: rule__Experiment__Group__6__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1695:1: ( ( '}' ) )
            // InternalExpAuto.g:1696:1: ( '}' )
            {
            // InternalExpAuto.g:1696:1: ( '}' )
            // InternalExpAuto.g:1697:2: '}'
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
    // InternalExpAuto.g:1707:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1711:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalExpAuto.g:1712:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:1719:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1723:1: ( ( 'description' ) )
            // InternalExpAuto.g:1724:1: ( 'description' )
            {
            // InternalExpAuto.g:1724:1: ( 'description' )
            // InternalExpAuto.g:1725:2: 'description'
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
    // InternalExpAuto.g:1734:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1738:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalExpAuto.g:1739:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:1746:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1750:1: ( ( '=' ) )
            // InternalExpAuto.g:1751:1: ( '=' )
            {
            // InternalExpAuto.g:1751:1: ( '=' )
            // InternalExpAuto.g:1752:2: '='
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
    // InternalExpAuto.g:1761:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1765:1: ( rule__Description__Group__2__Impl )
            // InternalExpAuto.g:1766:2: rule__Description__Group__2__Impl
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
    // InternalExpAuto.g:1772:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1776:1: ( ( ( rule__Description__DescriptionAssignment_2 ) ) )
            // InternalExpAuto.g:1777:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            {
            // InternalExpAuto.g:1777:1: ( ( rule__Description__DescriptionAssignment_2 ) )
            // InternalExpAuto.g:1778:2: ( rule__Description__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalExpAuto.g:1779:2: ( rule__Description__DescriptionAssignment_2 )
            // InternalExpAuto.g:1779:3: rule__Description__DescriptionAssignment_2
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
    // InternalExpAuto.g:1788:1: rule__InitialModel__Group__0 : rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 ;
    public final void rule__InitialModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1792:1: ( rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1 )
            // InternalExpAuto.g:1793:2: rule__InitialModel__Group__0__Impl rule__InitialModel__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:1800:1: rule__InitialModel__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1804:1: ( ( 'initial' ) )
            // InternalExpAuto.g:1805:1: ( 'initial' )
            {
            // InternalExpAuto.g:1805:1: ( 'initial' )
            // InternalExpAuto.g:1806:2: 'initial'
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
    // InternalExpAuto.g:1815:1: rule__InitialModel__Group__1 : rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 ;
    public final void rule__InitialModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1819:1: ( rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2 )
            // InternalExpAuto.g:1820:2: rule__InitialModel__Group__1__Impl rule__InitialModel__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalExpAuto.g:1827:1: rule__InitialModel__Group__1__Impl : ( '=' ) ;
    public final void rule__InitialModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1831:1: ( ( '=' ) )
            // InternalExpAuto.g:1832:1: ( '=' )
            {
            // InternalExpAuto.g:1832:1: ( '=' )
            // InternalExpAuto.g:1833:2: '='
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
    // InternalExpAuto.g:1842:1: rule__InitialModel__Group__2 : rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 ;
    public final void rule__InitialModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1846:1: ( rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3 )
            // InternalExpAuto.g:1847:2: rule__InitialModel__Group__2__Impl rule__InitialModel__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:1854:1: rule__InitialModel__Group__2__Impl : ( ( rule__InitialModel__ModeltypAssignment_2 ) ) ;
    public final void rule__InitialModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1858:1: ( ( ( rule__InitialModel__ModeltypAssignment_2 ) ) )
            // InternalExpAuto.g:1859:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            {
            // InternalExpAuto.g:1859:1: ( ( rule__InitialModel__ModeltypAssignment_2 ) )
            // InternalExpAuto.g:1860:2: ( rule__InitialModel__ModeltypAssignment_2 )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypAssignment_2()); 
            // InternalExpAuto.g:1861:2: ( rule__InitialModel__ModeltypAssignment_2 )
            // InternalExpAuto.g:1861:3: rule__InitialModel__ModeltypAssignment_2
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
    // InternalExpAuto.g:1869:1: rule__InitialModel__Group__3 : rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 ;
    public final void rule__InitialModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1873:1: ( rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4 )
            // InternalExpAuto.g:1874:2: rule__InitialModel__Group__3__Impl rule__InitialModel__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalExpAuto.g:1881:1: rule__InitialModel__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1885:1: ( ( '{' ) )
            // InternalExpAuto.g:1886:1: ( '{' )
            {
            // InternalExpAuto.g:1886:1: ( '{' )
            // InternalExpAuto.g:1887:2: '{'
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
    // InternalExpAuto.g:1896:1: rule__InitialModel__Group__4 : rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 ;
    public final void rule__InitialModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1900:1: ( rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5 )
            // InternalExpAuto.g:1901:2: rule__InitialModel__Group__4__Impl rule__InitialModel__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalExpAuto.g:1908:1: rule__InitialModel__Group__4__Impl : ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) ;
    public final void rule__InitialModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1912:1: ( ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) ) )
            // InternalExpAuto.g:1913:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            {
            // InternalExpAuto.g:1913:1: ( ( rule__InitialModel__InitSpecificationsAssignment_4 ) )
            // InternalExpAuto.g:1914:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            {
             before(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4()); 
            // InternalExpAuto.g:1915:2: ( rule__InitialModel__InitSpecificationsAssignment_4 )
            // InternalExpAuto.g:1915:3: rule__InitialModel__InitSpecificationsAssignment_4
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
    // InternalExpAuto.g:1923:1: rule__InitialModel__Group__5 : rule__InitialModel__Group__5__Impl ;
    public final void rule__InitialModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1927:1: ( rule__InitialModel__Group__5__Impl )
            // InternalExpAuto.g:1928:2: rule__InitialModel__Group__5__Impl
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
    // InternalExpAuto.g:1934:1: rule__InitialModel__Group__5__Impl : ( '}' ) ;
    public final void rule__InitialModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1938:1: ( ( '}' ) )
            // InternalExpAuto.g:1939:1: ( '}' )
            {
            // InternalExpAuto.g:1939:1: ( '}' )
            // InternalExpAuto.g:1940:2: '}'
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
    // InternalExpAuto.g:1950:1: rule__AllocationModel__Group__0 : rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 ;
    public final void rule__AllocationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1954:1: ( rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1 )
            // InternalExpAuto.g:1955:2: rule__AllocationModel__Group__0__Impl rule__AllocationModel__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:1962:1: rule__AllocationModel__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__AllocationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1966:1: ( ( 'allocation' ) )
            // InternalExpAuto.g:1967:1: ( 'allocation' )
            {
            // InternalExpAuto.g:1967:1: ( 'allocation' )
            // InternalExpAuto.g:1968:2: 'allocation'
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
    // InternalExpAuto.g:1977:1: rule__AllocationModel__Group__1 : rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 ;
    public final void rule__AllocationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1981:1: ( rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2 )
            // InternalExpAuto.g:1982:2: rule__AllocationModel__Group__1__Impl rule__AllocationModel__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:1989:1: rule__AllocationModel__Group__1__Impl : ( '=' ) ;
    public final void rule__AllocationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:1993:1: ( ( '=' ) )
            // InternalExpAuto.g:1994:1: ( '=' )
            {
            // InternalExpAuto.g:1994:1: ( '=' )
            // InternalExpAuto.g:1995:2: '='
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
    // InternalExpAuto.g:2004:1: rule__AllocationModel__Group__2 : rule__AllocationModel__Group__2__Impl ;
    public final void rule__AllocationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2008:1: ( rule__AllocationModel__Group__2__Impl )
            // InternalExpAuto.g:2009:2: rule__AllocationModel__Group__2__Impl
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
    // InternalExpAuto.g:2015:1: rule__AllocationModel__Group__2__Impl : ( ( rule__AllocationModel__AllocationAssignment_2 ) ) ;
    public final void rule__AllocationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2019:1: ( ( ( rule__AllocationModel__AllocationAssignment_2 ) ) )
            // InternalExpAuto.g:2020:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            {
            // InternalExpAuto.g:2020:1: ( ( rule__AllocationModel__AllocationAssignment_2 ) )
            // InternalExpAuto.g:2021:2: ( rule__AllocationModel__AllocationAssignment_2 )
            {
             before(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2()); 
            // InternalExpAuto.g:2022:2: ( rule__AllocationModel__AllocationAssignment_2 )
            // InternalExpAuto.g:2022:3: rule__AllocationModel__AllocationAssignment_2
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
    // InternalExpAuto.g:2031:1: rule__UsageModel__Group__0 : rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 ;
    public final void rule__UsageModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2035:1: ( rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1 )
            // InternalExpAuto.g:2036:2: rule__UsageModel__Group__0__Impl rule__UsageModel__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2043:1: rule__UsageModel__Group__0__Impl : ( 'usageModel' ) ;
    public final void rule__UsageModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2047:1: ( ( 'usageModel' ) )
            // InternalExpAuto.g:2048:1: ( 'usageModel' )
            {
            // InternalExpAuto.g:2048:1: ( 'usageModel' )
            // InternalExpAuto.g:2049:2: 'usageModel'
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
    // InternalExpAuto.g:2058:1: rule__UsageModel__Group__1 : rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 ;
    public final void rule__UsageModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2062:1: ( rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2 )
            // InternalExpAuto.g:2063:2: rule__UsageModel__Group__1__Impl rule__UsageModel__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:2070:1: rule__UsageModel__Group__1__Impl : ( '=' ) ;
    public final void rule__UsageModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2074:1: ( ( '=' ) )
            // InternalExpAuto.g:2075:1: ( '=' )
            {
            // InternalExpAuto.g:2075:1: ( '=' )
            // InternalExpAuto.g:2076:2: '='
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
    // InternalExpAuto.g:2085:1: rule__UsageModel__Group__2 : rule__UsageModel__Group__2__Impl ;
    public final void rule__UsageModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2089:1: ( rule__UsageModel__Group__2__Impl )
            // InternalExpAuto.g:2090:2: rule__UsageModel__Group__2__Impl
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
    // InternalExpAuto.g:2096:1: rule__UsageModel__Group__2__Impl : ( ( rule__UsageModel__UsageModelAssignment_2 ) ) ;
    public final void rule__UsageModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2100:1: ( ( ( rule__UsageModel__UsageModelAssignment_2 ) ) )
            // InternalExpAuto.g:2101:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            {
            // InternalExpAuto.g:2101:1: ( ( rule__UsageModel__UsageModelAssignment_2 ) )
            // InternalExpAuto.g:2102:2: ( rule__UsageModel__UsageModelAssignment_2 )
            {
             before(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2()); 
            // InternalExpAuto.g:2103:2: ( rule__UsageModel__UsageModelAssignment_2 )
            // InternalExpAuto.g:2103:3: rule__UsageModel__UsageModelAssignment_2
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
    // InternalExpAuto.g:2112:1: rule__MiddlewareRepository__Group__0 : rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 ;
    public final void rule__MiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2116:1: ( rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2117:2: rule__MiddlewareRepository__Group__0__Impl rule__MiddlewareRepository__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2124:1: rule__MiddlewareRepository__Group__0__Impl : ( 'middlewareRepository' ) ;
    public final void rule__MiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2128:1: ( ( 'middlewareRepository' ) )
            // InternalExpAuto.g:2129:1: ( 'middlewareRepository' )
            {
            // InternalExpAuto.g:2129:1: ( 'middlewareRepository' )
            // InternalExpAuto.g:2130:2: 'middlewareRepository'
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
    // InternalExpAuto.g:2139:1: rule__MiddlewareRepository__Group__1 : rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 ;
    public final void rule__MiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2143:1: ( rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2144:2: rule__MiddlewareRepository__Group__1__Impl rule__MiddlewareRepository__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:2151:1: rule__MiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2155:1: ( ( '=' ) )
            // InternalExpAuto.g:2156:1: ( '=' )
            {
            // InternalExpAuto.g:2156:1: ( '=' )
            // InternalExpAuto.g:2157:2: '='
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
    // InternalExpAuto.g:2166:1: rule__MiddlewareRepository__Group__2 : rule__MiddlewareRepository__Group__2__Impl ;
    public final void rule__MiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2170:1: ( rule__MiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2171:2: rule__MiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2177:1: rule__MiddlewareRepository__Group__2__Impl : ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) ;
    public final void rule__MiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2181:1: ( ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2182:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2182:1: ( ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2183:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            {
             before(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2184:2: ( rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 )
            // InternalExpAuto.g:2184:3: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2
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
    // InternalExpAuto.g:2193:1: rule__EventMiddlewareRepository__Group__0 : rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 ;
    public final void rule__EventMiddlewareRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2197:1: ( rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1 )
            // InternalExpAuto.g:2198:2: rule__EventMiddlewareRepository__Group__0__Impl rule__EventMiddlewareRepository__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2205:1: rule__EventMiddlewareRepository__Group__0__Impl : ( 'eventMiddlewareRepository' ) ;
    public final void rule__EventMiddlewareRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2209:1: ( ( 'eventMiddlewareRepository' ) )
            // InternalExpAuto.g:2210:1: ( 'eventMiddlewareRepository' )
            {
            // InternalExpAuto.g:2210:1: ( 'eventMiddlewareRepository' )
            // InternalExpAuto.g:2211:2: 'eventMiddlewareRepository'
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
    // InternalExpAuto.g:2220:1: rule__EventMiddlewareRepository__Group__1 : rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 ;
    public final void rule__EventMiddlewareRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2224:1: ( rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2 )
            // InternalExpAuto.g:2225:2: rule__EventMiddlewareRepository__Group__1__Impl rule__EventMiddlewareRepository__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:2232:1: rule__EventMiddlewareRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__EventMiddlewareRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2236:1: ( ( '=' ) )
            // InternalExpAuto.g:2237:1: ( '=' )
            {
            // InternalExpAuto.g:2237:1: ( '=' )
            // InternalExpAuto.g:2238:2: '='
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
    // InternalExpAuto.g:2247:1: rule__EventMiddlewareRepository__Group__2 : rule__EventMiddlewareRepository__Group__2__Impl ;
    public final void rule__EventMiddlewareRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2251:1: ( rule__EventMiddlewareRepository__Group__2__Impl )
            // InternalExpAuto.g:2252:2: rule__EventMiddlewareRepository__Group__2__Impl
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
    // InternalExpAuto.g:2258:1: rule__EventMiddlewareRepository__Group__2__Impl : ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) ;
    public final void rule__EventMiddlewareRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2262:1: ( ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2263:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2263:1: ( ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2264:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            {
             before(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2()); 
            // InternalExpAuto.g:2265:2: ( rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 )
            // InternalExpAuto.g:2265:3: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2
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
    // InternalExpAuto.g:2274:1: rule__MonitorRepository__Group__0 : rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 ;
    public final void rule__MonitorRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2278:1: ( rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1 )
            // InternalExpAuto.g:2279:2: rule__MonitorRepository__Group__0__Impl rule__MonitorRepository__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2286:1: rule__MonitorRepository__Group__0__Impl : ( 'monitorRepository' ) ;
    public final void rule__MonitorRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2290:1: ( ( 'monitorRepository' ) )
            // InternalExpAuto.g:2291:1: ( 'monitorRepository' )
            {
            // InternalExpAuto.g:2291:1: ( 'monitorRepository' )
            // InternalExpAuto.g:2292:2: 'monitorRepository'
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
    // InternalExpAuto.g:2301:1: rule__MonitorRepository__Group__1 : rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 ;
    public final void rule__MonitorRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2305:1: ( rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2 )
            // InternalExpAuto.g:2306:2: rule__MonitorRepository__Group__1__Impl rule__MonitorRepository__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExpAuto.g:2313:1: rule__MonitorRepository__Group__1__Impl : ( '=' ) ;
    public final void rule__MonitorRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2317:1: ( ( '=' ) )
            // InternalExpAuto.g:2318:1: ( '=' )
            {
            // InternalExpAuto.g:2318:1: ( '=' )
            // InternalExpAuto.g:2319:2: '='
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
    // InternalExpAuto.g:2328:1: rule__MonitorRepository__Group__2 : rule__MonitorRepository__Group__2__Impl ;
    public final void rule__MonitorRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2332:1: ( rule__MonitorRepository__Group__2__Impl )
            // InternalExpAuto.g:2333:2: rule__MonitorRepository__Group__2__Impl
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
    // InternalExpAuto.g:2339:1: rule__MonitorRepository__Group__2__Impl : ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) ;
    public final void rule__MonitorRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2343:1: ( ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) ) )
            // InternalExpAuto.g:2344:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            {
            // InternalExpAuto.g:2344:1: ( ( rule__MonitorRepository__MonitorRepositoryAssignment_2 ) )
            // InternalExpAuto.g:2345:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            {
             before(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2()); 
            // InternalExpAuto.g:2346:2: ( rule__MonitorRepository__MonitorRepositoryAssignment_2 )
            // InternalExpAuto.g:2346:3: rule__MonitorRepository__MonitorRepositoryAssignment_2
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
    // InternalExpAuto.g:2355:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2359:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // InternalExpAuto.g:2360:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2367:1: rule__Variation__Group__0__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2371:1: ( ( 'variation' ) )
            // InternalExpAuto.g:2372:1: ( 'variation' )
            {
            // InternalExpAuto.g:2372:1: ( 'variation' )
            // InternalExpAuto.g:2373:2: 'variation'
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
    // InternalExpAuto.g:2382:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2386:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // InternalExpAuto.g:2387:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:2394:1: rule__Variation__Group__1__Impl : ( '=' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2398:1: ( ( '=' ) )
            // InternalExpAuto.g:2399:1: ( '=' )
            {
            // InternalExpAuto.g:2399:1: ( '=' )
            // InternalExpAuto.g:2400:2: '='
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
    // InternalExpAuto.g:2409:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2413:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // InternalExpAuto.g:2414:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:2421:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__VariationTypAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2425:1: ( ( ( rule__Variation__VariationTypAssignment_2 ) ) )
            // InternalExpAuto.g:2426:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            {
            // InternalExpAuto.g:2426:1: ( ( rule__Variation__VariationTypAssignment_2 ) )
            // InternalExpAuto.g:2427:2: ( rule__Variation__VariationTypAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getVariationTypAssignment_2()); 
            // InternalExpAuto.g:2428:2: ( rule__Variation__VariationTypAssignment_2 )
            // InternalExpAuto.g:2428:3: rule__Variation__VariationTypAssignment_2
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
    // InternalExpAuto.g:2436:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl rule__Variation__Group__4 ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2440:1: ( rule__Variation__Group__3__Impl rule__Variation__Group__4 )
            // InternalExpAuto.g:2441:2: rule__Variation__Group__3__Impl rule__Variation__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:2448:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__NameAssignment_3 ) ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2452:1: ( ( ( rule__Variation__NameAssignment_3 ) ) )
            // InternalExpAuto.g:2453:1: ( ( rule__Variation__NameAssignment_3 ) )
            {
            // InternalExpAuto.g:2453:1: ( ( rule__Variation__NameAssignment_3 ) )
            // InternalExpAuto.g:2454:2: ( rule__Variation__NameAssignment_3 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_3()); 
            // InternalExpAuto.g:2455:2: ( rule__Variation__NameAssignment_3 )
            // InternalExpAuto.g:2455:3: rule__Variation__NameAssignment_3
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
    // InternalExpAuto.g:2463:1: rule__Variation__Group__4 : rule__Variation__Group__4__Impl rule__Variation__Group__5 ;
    public final void rule__Variation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2467:1: ( rule__Variation__Group__4__Impl rule__Variation__Group__5 )
            // InternalExpAuto.g:2468:2: rule__Variation__Group__4__Impl rule__Variation__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalExpAuto.g:2475:1: rule__Variation__Group__4__Impl : ( '{' ) ;
    public final void rule__Variation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2479:1: ( ( '{' ) )
            // InternalExpAuto.g:2480:1: ( '{' )
            {
            // InternalExpAuto.g:2480:1: ( '{' )
            // InternalExpAuto.g:2481:2: '{'
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
    // InternalExpAuto.g:2490:1: rule__Variation__Group__5 : rule__Variation__Group__5__Impl rule__Variation__Group__6 ;
    public final void rule__Variation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2494:1: ( rule__Variation__Group__5__Impl rule__Variation__Group__6 )
            // InternalExpAuto.g:2495:2: rule__Variation__Group__5__Impl rule__Variation__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2502:1: rule__Variation__Group__5__Impl : ( 'target' ) ;
    public final void rule__Variation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2506:1: ( ( 'target' ) )
            // InternalExpAuto.g:2507:1: ( 'target' )
            {
            // InternalExpAuto.g:2507:1: ( 'target' )
            // InternalExpAuto.g:2508:2: 'target'
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
    // InternalExpAuto.g:2517:1: rule__Variation__Group__6 : rule__Variation__Group__6__Impl rule__Variation__Group__7 ;
    public final void rule__Variation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2521:1: ( rule__Variation__Group__6__Impl rule__Variation__Group__7 )
            // InternalExpAuto.g:2522:2: rule__Variation__Group__6__Impl rule__Variation__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:2529:1: rule__Variation__Group__6__Impl : ( '=' ) ;
    public final void rule__Variation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2533:1: ( ( '=' ) )
            // InternalExpAuto.g:2534:1: ( '=' )
            {
            // InternalExpAuto.g:2534:1: ( '=' )
            // InternalExpAuto.g:2535:2: '='
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
    // InternalExpAuto.g:2544:1: rule__Variation__Group__7 : rule__Variation__Group__7__Impl rule__Variation__Group__8 ;
    public final void rule__Variation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2548:1: ( rule__Variation__Group__7__Impl rule__Variation__Group__8 )
            // InternalExpAuto.g:2549:2: rule__Variation__Group__7__Impl rule__Variation__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalExpAuto.g:2556:1: rule__Variation__Group__7__Impl : ( ( rule__Variation__TargetAssignment_7 ) ) ;
    public final void rule__Variation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2560:1: ( ( ( rule__Variation__TargetAssignment_7 ) ) )
            // InternalExpAuto.g:2561:1: ( ( rule__Variation__TargetAssignment_7 ) )
            {
            // InternalExpAuto.g:2561:1: ( ( rule__Variation__TargetAssignment_7 ) )
            // InternalExpAuto.g:2562:2: ( rule__Variation__TargetAssignment_7 )
            {
             before(grammarAccess.getVariationAccess().getTargetAssignment_7()); 
            // InternalExpAuto.g:2563:2: ( rule__Variation__TargetAssignment_7 )
            // InternalExpAuto.g:2563:3: rule__Variation__TargetAssignment_7
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
    // InternalExpAuto.g:2571:1: rule__Variation__Group__8 : rule__Variation__Group__8__Impl rule__Variation__Group__9 ;
    public final void rule__Variation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2575:1: ( rule__Variation__Group__8__Impl rule__Variation__Group__9 )
            // InternalExpAuto.g:2576:2: rule__Variation__Group__8__Impl rule__Variation__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2583:1: rule__Variation__Group__8__Impl : ( 'maxVariations' ) ;
    public final void rule__Variation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2587:1: ( ( 'maxVariations' ) )
            // InternalExpAuto.g:2588:1: ( 'maxVariations' )
            {
            // InternalExpAuto.g:2588:1: ( 'maxVariations' )
            // InternalExpAuto.g:2589:2: 'maxVariations'
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
    // InternalExpAuto.g:2598:1: rule__Variation__Group__9 : rule__Variation__Group__9__Impl rule__Variation__Group__10 ;
    public final void rule__Variation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2602:1: ( rule__Variation__Group__9__Impl rule__Variation__Group__10 )
            // InternalExpAuto.g:2603:2: rule__Variation__Group__9__Impl rule__Variation__Group__10
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:2610:1: rule__Variation__Group__9__Impl : ( '=' ) ;
    public final void rule__Variation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2614:1: ( ( '=' ) )
            // InternalExpAuto.g:2615:1: ( '=' )
            {
            // InternalExpAuto.g:2615:1: ( '=' )
            // InternalExpAuto.g:2616:2: '='
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
    // InternalExpAuto.g:2625:1: rule__Variation__Group__10 : rule__Variation__Group__10__Impl rule__Variation__Group__11 ;
    public final void rule__Variation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2629:1: ( rule__Variation__Group__10__Impl rule__Variation__Group__11 )
            // InternalExpAuto.g:2630:2: rule__Variation__Group__10__Impl rule__Variation__Group__11
            {
            pushFollow(FOLLOW_27);
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
    // InternalExpAuto.g:2637:1: rule__Variation__Group__10__Impl : ( ( rule__Variation__MaxVariationsAssignment_10 ) ) ;
    public final void rule__Variation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2641:1: ( ( ( rule__Variation__MaxVariationsAssignment_10 ) ) )
            // InternalExpAuto.g:2642:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            {
            // InternalExpAuto.g:2642:1: ( ( rule__Variation__MaxVariationsAssignment_10 ) )
            // InternalExpAuto.g:2643:2: ( rule__Variation__MaxVariationsAssignment_10 )
            {
             before(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10()); 
            // InternalExpAuto.g:2644:2: ( rule__Variation__MaxVariationsAssignment_10 )
            // InternalExpAuto.g:2644:3: rule__Variation__MaxVariationsAssignment_10
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
    // InternalExpAuto.g:2652:1: rule__Variation__Group__11 : rule__Variation__Group__11__Impl rule__Variation__Group__12 ;
    public final void rule__Variation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2656:1: ( rule__Variation__Group__11__Impl rule__Variation__Group__12 )
            // InternalExpAuto.g:2657:2: rule__Variation__Group__11__Impl rule__Variation__Group__12
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:2664:1: rule__Variation__Group__11__Impl : ( 'values' ) ;
    public final void rule__Variation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2668:1: ( ( 'values' ) )
            // InternalExpAuto.g:2669:1: ( 'values' )
            {
            // InternalExpAuto.g:2669:1: ( 'values' )
            // InternalExpAuto.g:2670:2: 'values'
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
    // InternalExpAuto.g:2679:1: rule__Variation__Group__12 : rule__Variation__Group__12__Impl rule__Variation__Group__13 ;
    public final void rule__Variation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2683:1: ( rule__Variation__Group__12__Impl rule__Variation__Group__13 )
            // InternalExpAuto.g:2684:2: rule__Variation__Group__12__Impl rule__Variation__Group__13
            {
            pushFollow(FOLLOW_28);
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
    // InternalExpAuto.g:2691:1: rule__Variation__Group__12__Impl : ( '=' ) ;
    public final void rule__Variation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2695:1: ( ( '=' ) )
            // InternalExpAuto.g:2696:1: ( '=' )
            {
            // InternalExpAuto.g:2696:1: ( '=' )
            // InternalExpAuto.g:2697:2: '='
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
    // InternalExpAuto.g:2706:1: rule__Variation__Group__13 : rule__Variation__Group__13__Impl rule__Variation__Group__14 ;
    public final void rule__Variation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2710:1: ( rule__Variation__Group__13__Impl rule__Variation__Group__14 )
            // InternalExpAuto.g:2711:2: rule__Variation__Group__13__Impl rule__Variation__Group__14
            {
            pushFollow(FOLLOW_20);
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
    // InternalExpAuto.g:2718:1: rule__Variation__Group__13__Impl : ( ( rule__Variation__ValueProviderAssignment_13 ) ) ;
    public final void rule__Variation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2722:1: ( ( ( rule__Variation__ValueProviderAssignment_13 ) ) )
            // InternalExpAuto.g:2723:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            {
            // InternalExpAuto.g:2723:1: ( ( rule__Variation__ValueProviderAssignment_13 ) )
            // InternalExpAuto.g:2724:2: ( rule__Variation__ValueProviderAssignment_13 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAssignment_13()); 
            // InternalExpAuto.g:2725:2: ( rule__Variation__ValueProviderAssignment_13 )
            // InternalExpAuto.g:2725:3: rule__Variation__ValueProviderAssignment_13
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
    // InternalExpAuto.g:2733:1: rule__Variation__Group__14 : rule__Variation__Group__14__Impl ;
    public final void rule__Variation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2737:1: ( rule__Variation__Group__14__Impl )
            // InternalExpAuto.g:2738:2: rule__Variation__Group__14__Impl
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
    // InternalExpAuto.g:2744:1: rule__Variation__Group__14__Impl : ( '}' ) ;
    public final void rule__Variation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2748:1: ( ( '}' ) )
            // InternalExpAuto.g:2749:1: ( '}' )
            {
            // InternalExpAuto.g:2749:1: ( '}' )
            // InternalExpAuto.g:2750:2: '}'
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
    // InternalExpAuto.g:2760:1: rule__NestedIntervalsValueProvider__Group_0__0 : rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2764:1: ( rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1 )
            // InternalExpAuto.g:2765:2: rule__NestedIntervalsValueProvider__Group_0__0__Impl rule__NestedIntervalsValueProvider__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:2772:1: rule__NestedIntervalsValueProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2776:1: ( ( '[' ) )
            // InternalExpAuto.g:2777:1: ( '[' )
            {
            // InternalExpAuto.g:2777:1: ( '[' )
            // InternalExpAuto.g:2778:2: '['
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
    // InternalExpAuto.g:2787:1: rule__NestedIntervalsValueProvider__Group_0__1 : rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2791:1: ( rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2 )
            // InternalExpAuto.g:2792:2: rule__NestedIntervalsValueProvider__Group_0__1__Impl rule__NestedIntervalsValueProvider__Group_0__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalExpAuto.g:2799:1: rule__NestedIntervalsValueProvider__Group_0__1__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2803:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) ) )
            // InternalExpAuto.g:2804:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            {
            // InternalExpAuto.g:2804:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 ) )
            // InternalExpAuto.g:2805:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1()); 
            // InternalExpAuto.g:2806:2: ( rule__NestedIntervalsValueProvider__MinAssignment_0_1 )
            // InternalExpAuto.g:2806:3: rule__NestedIntervalsValueProvider__MinAssignment_0_1
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
    // InternalExpAuto.g:2814:1: rule__NestedIntervalsValueProvider__Group_0__2 : rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2818:1: ( rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3 )
            // InternalExpAuto.g:2819:2: rule__NestedIntervalsValueProvider__Group_0__2__Impl rule__NestedIntervalsValueProvider__Group_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:2826:1: rule__NestedIntervalsValueProvider__Group_0__2__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2830:1: ( ( ',' ) )
            // InternalExpAuto.g:2831:1: ( ',' )
            {
            // InternalExpAuto.g:2831:1: ( ',' )
            // InternalExpAuto.g:2832:2: ','
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
    // InternalExpAuto.g:2841:1: rule__NestedIntervalsValueProvider__Group_0__3 : rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2845:1: ( rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4 )
            // InternalExpAuto.g:2846:2: rule__NestedIntervalsValueProvider__Group_0__3__Impl rule__NestedIntervalsValueProvider__Group_0__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalExpAuto.g:2853:1: rule__NestedIntervalsValueProvider__Group_0__3__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2857:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) ) )
            // InternalExpAuto.g:2858:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            {
            // InternalExpAuto.g:2858:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 ) )
            // InternalExpAuto.g:2859:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3()); 
            // InternalExpAuto.g:2860:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_0_3 )
            // InternalExpAuto.g:2860:3: rule__NestedIntervalsValueProvider__MaxAssignment_0_3
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
    // InternalExpAuto.g:2868:1: rule__NestedIntervalsValueProvider__Group_0__4 : rule__NestedIntervalsValueProvider__Group_0__4__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2872:1: ( rule__NestedIntervalsValueProvider__Group_0__4__Impl )
            // InternalExpAuto.g:2873:2: rule__NestedIntervalsValueProvider__Group_0__4__Impl
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
    // InternalExpAuto.g:2879:1: rule__NestedIntervalsValueProvider__Group_0__4__Impl : ( ']' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2883:1: ( ( ']' ) )
            // InternalExpAuto.g:2884:1: ( ']' )
            {
            // InternalExpAuto.g:2884:1: ( ']' )
            // InternalExpAuto.g:2885:2: ']'
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
    // InternalExpAuto.g:2895:1: rule__NestedIntervalsValueProvider__Group_1__0 : rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2899:1: ( rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1 )
            // InternalExpAuto.g:2900:2: rule__NestedIntervalsValueProvider__Group_1__0__Impl rule__NestedIntervalsValueProvider__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:2907:1: rule__NestedIntervalsValueProvider__Group_1__0__Impl : ( 'nestedIntervall' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2911:1: ( ( 'nestedIntervall' ) )
            // InternalExpAuto.g:2912:1: ( 'nestedIntervall' )
            {
            // InternalExpAuto.g:2912:1: ( 'nestedIntervall' )
            // InternalExpAuto.g:2913:2: 'nestedIntervall'
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
    // InternalExpAuto.g:2922:1: rule__NestedIntervalsValueProvider__Group_1__1 : rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2926:1: ( rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2 )
            // InternalExpAuto.g:2927:2: rule__NestedIntervalsValueProvider__Group_1__1__Impl rule__NestedIntervalsValueProvider__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:2934:1: rule__NestedIntervalsValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2938:1: ( ( '(' ) )
            // InternalExpAuto.g:2939:1: ( '(' )
            {
            // InternalExpAuto.g:2939:1: ( '(' )
            // InternalExpAuto.g:2940:2: '('
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
    // InternalExpAuto.g:2949:1: rule__NestedIntervalsValueProvider__Group_1__2 : rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2953:1: ( rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3 )
            // InternalExpAuto.g:2954:2: rule__NestedIntervalsValueProvider__Group_1__2__Impl rule__NestedIntervalsValueProvider__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalExpAuto.g:2961:1: rule__NestedIntervalsValueProvider__Group_1__2__Impl : ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2965:1: ( ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) ) )
            // InternalExpAuto.g:2966:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            {
            // InternalExpAuto.g:2966:1: ( ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 ) )
            // InternalExpAuto.g:2967:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2()); 
            // InternalExpAuto.g:2968:2: ( rule__NestedIntervalsValueProvider__MinAssignment_1_2 )
            // InternalExpAuto.g:2968:3: rule__NestedIntervalsValueProvider__MinAssignment_1_2
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
    // InternalExpAuto.g:2976:1: rule__NestedIntervalsValueProvider__Group_1__3 : rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2980:1: ( rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4 )
            // InternalExpAuto.g:2981:2: rule__NestedIntervalsValueProvider__Group_1__3__Impl rule__NestedIntervalsValueProvider__Group_1__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:2988:1: rule__NestedIntervalsValueProvider__Group_1__3__Impl : ( ',' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:2992:1: ( ( ',' ) )
            // InternalExpAuto.g:2993:1: ( ',' )
            {
            // InternalExpAuto.g:2993:1: ( ',' )
            // InternalExpAuto.g:2994:2: ','
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
    // InternalExpAuto.g:3003:1: rule__NestedIntervalsValueProvider__Group_1__4 : rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3007:1: ( rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5 )
            // InternalExpAuto.g:3008:2: rule__NestedIntervalsValueProvider__Group_1__4__Impl rule__NestedIntervalsValueProvider__Group_1__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:3015:1: rule__NestedIntervalsValueProvider__Group_1__4__Impl : ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3019:1: ( ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) ) )
            // InternalExpAuto.g:3020:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            {
            // InternalExpAuto.g:3020:1: ( ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 ) )
            // InternalExpAuto.g:3021:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            {
             before(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4()); 
            // InternalExpAuto.g:3022:2: ( rule__NestedIntervalsValueProvider__MaxAssignment_1_4 )
            // InternalExpAuto.g:3022:3: rule__NestedIntervalsValueProvider__MaxAssignment_1_4
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
    // InternalExpAuto.g:3030:1: rule__NestedIntervalsValueProvider__Group_1__5 : rule__NestedIntervalsValueProvider__Group_1__5__Impl ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3034:1: ( rule__NestedIntervalsValueProvider__Group_1__5__Impl )
            // InternalExpAuto.g:3035:2: rule__NestedIntervalsValueProvider__Group_1__5__Impl
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
    // InternalExpAuto.g:3041:1: rule__NestedIntervalsValueProvider__Group_1__5__Impl : ( ')' ) ;
    public final void rule__NestedIntervalsValueProvider__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3045:1: ( ( ')' ) )
            // InternalExpAuto.g:3046:1: ( ')' )
            {
            // InternalExpAuto.g:3046:1: ( ')' )
            // InternalExpAuto.g:3047:2: ')'
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
    // InternalExpAuto.g:3057:1: rule__SetValueProvider__Group_0__0 : rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 ;
    public final void rule__SetValueProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3061:1: ( rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1 )
            // InternalExpAuto.g:3062:2: rule__SetValueProvider__Group_0__0__Impl rule__SetValueProvider__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3069:1: rule__SetValueProvider__Group_0__0__Impl : ( '{' ) ;
    public final void rule__SetValueProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3073:1: ( ( '{' ) )
            // InternalExpAuto.g:3074:1: ( '{' )
            {
            // InternalExpAuto.g:3074:1: ( '{' )
            // InternalExpAuto.g:3075:2: '{'
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
    // InternalExpAuto.g:3084:1: rule__SetValueProvider__Group_0__1 : rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 ;
    public final void rule__SetValueProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3088:1: ( rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2 )
            // InternalExpAuto.g:3089:2: rule__SetValueProvider__Group_0__1__Impl rule__SetValueProvider__Group_0__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:3096:1: rule__SetValueProvider__Group_0__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) ;
    public final void rule__SetValueProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3100:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) ) )
            // InternalExpAuto.g:3101:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            {
            // InternalExpAuto.g:3101:1: ( ( rule__SetValueProvider__ValuesAssignment_0_1 ) )
            // InternalExpAuto.g:3102:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1()); 
            // InternalExpAuto.g:3103:2: ( rule__SetValueProvider__ValuesAssignment_0_1 )
            // InternalExpAuto.g:3103:3: rule__SetValueProvider__ValuesAssignment_0_1
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
    // InternalExpAuto.g:3111:1: rule__SetValueProvider__Group_0__2 : rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 ;
    public final void rule__SetValueProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3115:1: ( rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3 )
            // InternalExpAuto.g:3116:2: rule__SetValueProvider__Group_0__2__Impl rule__SetValueProvider__Group_0__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:3123:1: rule__SetValueProvider__Group_0__2__Impl : ( ( rule__SetValueProvider__Group_0_2__0 )* ) ;
    public final void rule__SetValueProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3127:1: ( ( ( rule__SetValueProvider__Group_0_2__0 )* ) )
            // InternalExpAuto.g:3128:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            {
            // InternalExpAuto.g:3128:1: ( ( rule__SetValueProvider__Group_0_2__0 )* )
            // InternalExpAuto.g:3129:2: ( rule__SetValueProvider__Group_0_2__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_0_2()); 
            // InternalExpAuto.g:3130:2: ( rule__SetValueProvider__Group_0_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpAuto.g:3130:3: rule__SetValueProvider__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SetValueProvider__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalExpAuto.g:3138:1: rule__SetValueProvider__Group_0__3 : rule__SetValueProvider__Group_0__3__Impl ;
    public final void rule__SetValueProvider__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3142:1: ( rule__SetValueProvider__Group_0__3__Impl )
            // InternalExpAuto.g:3143:2: rule__SetValueProvider__Group_0__3__Impl
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
    // InternalExpAuto.g:3149:1: rule__SetValueProvider__Group_0__3__Impl : ( '}' ) ;
    public final void rule__SetValueProvider__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3153:1: ( ( '}' ) )
            // InternalExpAuto.g:3154:1: ( '}' )
            {
            // InternalExpAuto.g:3154:1: ( '}' )
            // InternalExpAuto.g:3155:2: '}'
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
    // InternalExpAuto.g:3165:1: rule__SetValueProvider__Group_0_2__0 : rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 ;
    public final void rule__SetValueProvider__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3169:1: ( rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1 )
            // InternalExpAuto.g:3170:2: rule__SetValueProvider__Group_0_2__0__Impl rule__SetValueProvider__Group_0_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3177:1: rule__SetValueProvider__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3181:1: ( ( ',' ) )
            // InternalExpAuto.g:3182:1: ( ',' )
            {
            // InternalExpAuto.g:3182:1: ( ',' )
            // InternalExpAuto.g:3183:2: ','
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
    // InternalExpAuto.g:3192:1: rule__SetValueProvider__Group_0_2__1 : rule__SetValueProvider__Group_0_2__1__Impl ;
    public final void rule__SetValueProvider__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3196:1: ( rule__SetValueProvider__Group_0_2__1__Impl )
            // InternalExpAuto.g:3197:2: rule__SetValueProvider__Group_0_2__1__Impl
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
    // InternalExpAuto.g:3203:1: rule__SetValueProvider__Group_0_2__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) ;
    public final void rule__SetValueProvider__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3207:1: ( ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) ) )
            // InternalExpAuto.g:3208:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            {
            // InternalExpAuto.g:3208:1: ( ( rule__SetValueProvider__ValuesAssignment_0_2_1 ) )
            // InternalExpAuto.g:3209:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1()); 
            // InternalExpAuto.g:3210:2: ( rule__SetValueProvider__ValuesAssignment_0_2_1 )
            // InternalExpAuto.g:3210:3: rule__SetValueProvider__ValuesAssignment_0_2_1
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
    // InternalExpAuto.g:3219:1: rule__SetValueProvider__Group_1__0 : rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 ;
    public final void rule__SetValueProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3223:1: ( rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1 )
            // InternalExpAuto.g:3224:2: rule__SetValueProvider__Group_1__0__Impl rule__SetValueProvider__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:3231:1: rule__SetValueProvider__Group_1__0__Impl : ( 'setValues' ) ;
    public final void rule__SetValueProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3235:1: ( ( 'setValues' ) )
            // InternalExpAuto.g:3236:1: ( 'setValues' )
            {
            // InternalExpAuto.g:3236:1: ( 'setValues' )
            // InternalExpAuto.g:3237:2: 'setValues'
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
    // InternalExpAuto.g:3246:1: rule__SetValueProvider__Group_1__1 : rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 ;
    public final void rule__SetValueProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3250:1: ( rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2 )
            // InternalExpAuto.g:3251:2: rule__SetValueProvider__Group_1__1__Impl rule__SetValueProvider__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3258:1: rule__SetValueProvider__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SetValueProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3262:1: ( ( '(' ) )
            // InternalExpAuto.g:3263:1: ( '(' )
            {
            // InternalExpAuto.g:3263:1: ( '(' )
            // InternalExpAuto.g:3264:2: '('
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
    // InternalExpAuto.g:3273:1: rule__SetValueProvider__Group_1__2 : rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 ;
    public final void rule__SetValueProvider__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3277:1: ( rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3 )
            // InternalExpAuto.g:3278:2: rule__SetValueProvider__Group_1__2__Impl rule__SetValueProvider__Group_1__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalExpAuto.g:3285:1: rule__SetValueProvider__Group_1__2__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) ;
    public final void rule__SetValueProvider__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3289:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) ) )
            // InternalExpAuto.g:3290:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            {
            // InternalExpAuto.g:3290:1: ( ( rule__SetValueProvider__ValuesAssignment_1_2 ) )
            // InternalExpAuto.g:3291:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2()); 
            // InternalExpAuto.g:3292:2: ( rule__SetValueProvider__ValuesAssignment_1_2 )
            // InternalExpAuto.g:3292:3: rule__SetValueProvider__ValuesAssignment_1_2
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
    // InternalExpAuto.g:3300:1: rule__SetValueProvider__Group_1__3 : rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 ;
    public final void rule__SetValueProvider__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3304:1: ( rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4 )
            // InternalExpAuto.g:3305:2: rule__SetValueProvider__Group_1__3__Impl rule__SetValueProvider__Group_1__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalExpAuto.g:3312:1: rule__SetValueProvider__Group_1__3__Impl : ( ( rule__SetValueProvider__Group_1_3__0 )* ) ;
    public final void rule__SetValueProvider__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3316:1: ( ( ( rule__SetValueProvider__Group_1_3__0 )* ) )
            // InternalExpAuto.g:3317:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            {
            // InternalExpAuto.g:3317:1: ( ( rule__SetValueProvider__Group_1_3__0 )* )
            // InternalExpAuto.g:3318:2: ( rule__SetValueProvider__Group_1_3__0 )*
            {
             before(grammarAccess.getSetValueProviderAccess().getGroup_1_3()); 
            // InternalExpAuto.g:3319:2: ( rule__SetValueProvider__Group_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpAuto.g:3319:3: rule__SetValueProvider__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SetValueProvider__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalExpAuto.g:3327:1: rule__SetValueProvider__Group_1__4 : rule__SetValueProvider__Group_1__4__Impl ;
    public final void rule__SetValueProvider__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3331:1: ( rule__SetValueProvider__Group_1__4__Impl )
            // InternalExpAuto.g:3332:2: rule__SetValueProvider__Group_1__4__Impl
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
    // InternalExpAuto.g:3338:1: rule__SetValueProvider__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SetValueProvider__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3342:1: ( ( ')' ) )
            // InternalExpAuto.g:3343:1: ( ')' )
            {
            // InternalExpAuto.g:3343:1: ( ')' )
            // InternalExpAuto.g:3344:2: ')'
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
    // InternalExpAuto.g:3354:1: rule__SetValueProvider__Group_1_3__0 : rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 ;
    public final void rule__SetValueProvider__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3358:1: ( rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1 )
            // InternalExpAuto.g:3359:2: rule__SetValueProvider__Group_1_3__0__Impl rule__SetValueProvider__Group_1_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3366:1: rule__SetValueProvider__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__SetValueProvider__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3370:1: ( ( ',' ) )
            // InternalExpAuto.g:3371:1: ( ',' )
            {
            // InternalExpAuto.g:3371:1: ( ',' )
            // InternalExpAuto.g:3372:2: ','
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
    // InternalExpAuto.g:3381:1: rule__SetValueProvider__Group_1_3__1 : rule__SetValueProvider__Group_1_3__1__Impl ;
    public final void rule__SetValueProvider__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3385:1: ( rule__SetValueProvider__Group_1_3__1__Impl )
            // InternalExpAuto.g:3386:2: rule__SetValueProvider__Group_1_3__1__Impl
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
    // InternalExpAuto.g:3392:1: rule__SetValueProvider__Group_1_3__1__Impl : ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) ;
    public final void rule__SetValueProvider__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3396:1: ( ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) ) )
            // InternalExpAuto.g:3397:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            {
            // InternalExpAuto.g:3397:1: ( ( rule__SetValueProvider__ValuesAssignment_1_3_1 ) )
            // InternalExpAuto.g:3398:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            {
             before(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1()); 
            // InternalExpAuto.g:3399:2: ( rule__SetValueProvider__ValuesAssignment_1_3_1 )
            // InternalExpAuto.g:3399:3: rule__SetValueProvider__ValuesAssignment_1_3_1
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
    // InternalExpAuto.g:3408:1: rule__LinearValueProvider__Group__0 : rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 ;
    public final void rule__LinearValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3412:1: ( rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1 )
            // InternalExpAuto.g:3413:2: rule__LinearValueProvider__Group__0__Impl rule__LinearValueProvider__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:3420:1: rule__LinearValueProvider__Group__0__Impl : ( 'linear' ) ;
    public final void rule__LinearValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3424:1: ( ( 'linear' ) )
            // InternalExpAuto.g:3425:1: ( 'linear' )
            {
            // InternalExpAuto.g:3425:1: ( 'linear' )
            // InternalExpAuto.g:3426:2: 'linear'
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
    // InternalExpAuto.g:3435:1: rule__LinearValueProvider__Group__1 : rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 ;
    public final void rule__LinearValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3439:1: ( rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2 )
            // InternalExpAuto.g:3440:2: rule__LinearValueProvider__Group__1__Impl rule__LinearValueProvider__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3447:1: rule__LinearValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__LinearValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3451:1: ( ( '(' ) )
            // InternalExpAuto.g:3452:1: ( '(' )
            {
            // InternalExpAuto.g:3452:1: ( '(' )
            // InternalExpAuto.g:3453:2: '('
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
    // InternalExpAuto.g:3462:1: rule__LinearValueProvider__Group__2 : rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 ;
    public final void rule__LinearValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3466:1: ( rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3 )
            // InternalExpAuto.g:3467:2: rule__LinearValueProvider__Group__2__Impl rule__LinearValueProvider__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalExpAuto.g:3474:1: rule__LinearValueProvider__Group__2__Impl : ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) ;
    public final void rule__LinearValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3478:1: ( ( ( rule__LinearValueProvider__SummandAssignment_2 ) ) )
            // InternalExpAuto.g:3479:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            {
            // InternalExpAuto.g:3479:1: ( ( rule__LinearValueProvider__SummandAssignment_2 ) )
            // InternalExpAuto.g:3480:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2()); 
            // InternalExpAuto.g:3481:2: ( rule__LinearValueProvider__SummandAssignment_2 )
            // InternalExpAuto.g:3481:3: rule__LinearValueProvider__SummandAssignment_2
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
    // InternalExpAuto.g:3489:1: rule__LinearValueProvider__Group__3 : rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 ;
    public final void rule__LinearValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3493:1: ( rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4 )
            // InternalExpAuto.g:3494:2: rule__LinearValueProvider__Group__3__Impl rule__LinearValueProvider__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3501:1: rule__LinearValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__LinearValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3505:1: ( ( ',' ) )
            // InternalExpAuto.g:3506:1: ( ',' )
            {
            // InternalExpAuto.g:3506:1: ( ',' )
            // InternalExpAuto.g:3507:2: ','
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
    // InternalExpAuto.g:3516:1: rule__LinearValueProvider__Group__4 : rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 ;
    public final void rule__LinearValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3520:1: ( rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5 )
            // InternalExpAuto.g:3521:2: rule__LinearValueProvider__Group__4__Impl rule__LinearValueProvider__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:3528:1: rule__LinearValueProvider__Group__4__Impl : ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__LinearValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3532:1: ( ( ( rule__LinearValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3533:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3533:1: ( ( rule__LinearValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3534:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3535:2: ( rule__LinearValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3535:3: rule__LinearValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3543:1: rule__LinearValueProvider__Group__5 : rule__LinearValueProvider__Group__5__Impl ;
    public final void rule__LinearValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3547:1: ( rule__LinearValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3548:2: rule__LinearValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3554:1: rule__LinearValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__LinearValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3558:1: ( ( ')' ) )
            // InternalExpAuto.g:3559:1: ( ')' )
            {
            // InternalExpAuto.g:3559:1: ( ')' )
            // InternalExpAuto.g:3560:2: ')'
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
    // InternalExpAuto.g:3570:1: rule__ExponentialValueProvider__Group__0 : rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 ;
    public final void rule__ExponentialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3574:1: ( rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1 )
            // InternalExpAuto.g:3575:2: rule__ExponentialValueProvider__Group__0__Impl rule__ExponentialValueProvider__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:3582:1: rule__ExponentialValueProvider__Group__0__Impl : ( 'exponential' ) ;
    public final void rule__ExponentialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3586:1: ( ( 'exponential' ) )
            // InternalExpAuto.g:3587:1: ( 'exponential' )
            {
            // InternalExpAuto.g:3587:1: ( 'exponential' )
            // InternalExpAuto.g:3588:2: 'exponential'
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
    // InternalExpAuto.g:3597:1: rule__ExponentialValueProvider__Group__1 : rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 ;
    public final void rule__ExponentialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3601:1: ( rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2 )
            // InternalExpAuto.g:3602:2: rule__ExponentialValueProvider__Group__1__Impl rule__ExponentialValueProvider__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3609:1: rule__ExponentialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__ExponentialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3613:1: ( ( '(' ) )
            // InternalExpAuto.g:3614:1: ( '(' )
            {
            // InternalExpAuto.g:3614:1: ( '(' )
            // InternalExpAuto.g:3615:2: '('
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
    // InternalExpAuto.g:3624:1: rule__ExponentialValueProvider__Group__2 : rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 ;
    public final void rule__ExponentialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3628:1: ( rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3 )
            // InternalExpAuto.g:3629:2: rule__ExponentialValueProvider__Group__2__Impl rule__ExponentialValueProvider__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:3636:1: rule__ExponentialValueProvider__Group__2__Impl : ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) ;
    public final void rule__ExponentialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3640:1: ( ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) ) )
            // InternalExpAuto.g:3641:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            {
            // InternalExpAuto.g:3641:1: ( ( rule__ExponentialValueProvider__BaseAssignment_2 ) )
            // InternalExpAuto.g:3642:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            {
             before(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2()); 
            // InternalExpAuto.g:3643:2: ( rule__ExponentialValueProvider__BaseAssignment_2 )
            // InternalExpAuto.g:3643:3: rule__ExponentialValueProvider__BaseAssignment_2
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
    // InternalExpAuto.g:3651:1: rule__ExponentialValueProvider__Group__3 : rule__ExponentialValueProvider__Group__3__Impl ;
    public final void rule__ExponentialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3655:1: ( rule__ExponentialValueProvider__Group__3__Impl )
            // InternalExpAuto.g:3656:2: rule__ExponentialValueProvider__Group__3__Impl
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
    // InternalExpAuto.g:3662:1: rule__ExponentialValueProvider__Group__3__Impl : ( ')' ) ;
    public final void rule__ExponentialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3666:1: ( ( ')' ) )
            // InternalExpAuto.g:3667:1: ( ')' )
            {
            // InternalExpAuto.g:3667:1: ( ')' )
            // InternalExpAuto.g:3668:2: ')'
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
    // InternalExpAuto.g:3678:1: rule__PolynomialValueProvider__Group__0 : rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 ;
    public final void rule__PolynomialValueProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3682:1: ( rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1 )
            // InternalExpAuto.g:3683:2: rule__PolynomialValueProvider__Group__0__Impl rule__PolynomialValueProvider__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:3690:1: rule__PolynomialValueProvider__Group__0__Impl : ( 'polynomial' ) ;
    public final void rule__PolynomialValueProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3694:1: ( ( 'polynomial' ) )
            // InternalExpAuto.g:3695:1: ( 'polynomial' )
            {
            // InternalExpAuto.g:3695:1: ( 'polynomial' )
            // InternalExpAuto.g:3696:2: 'polynomial'
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
    // InternalExpAuto.g:3705:1: rule__PolynomialValueProvider__Group__1 : rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 ;
    public final void rule__PolynomialValueProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3709:1: ( rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2 )
            // InternalExpAuto.g:3710:2: rule__PolynomialValueProvider__Group__1__Impl rule__PolynomialValueProvider__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3717:1: rule__PolynomialValueProvider__Group__1__Impl : ( '(' ) ;
    public final void rule__PolynomialValueProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3721:1: ( ( '(' ) )
            // InternalExpAuto.g:3722:1: ( '(' )
            {
            // InternalExpAuto.g:3722:1: ( '(' )
            // InternalExpAuto.g:3723:2: '('
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
    // InternalExpAuto.g:3732:1: rule__PolynomialValueProvider__Group__2 : rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 ;
    public final void rule__PolynomialValueProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3736:1: ( rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3 )
            // InternalExpAuto.g:3737:2: rule__PolynomialValueProvider__Group__2__Impl rule__PolynomialValueProvider__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalExpAuto.g:3744:1: rule__PolynomialValueProvider__Group__2__Impl : ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) ;
    public final void rule__PolynomialValueProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3748:1: ( ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) ) )
            // InternalExpAuto.g:3749:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            {
            // InternalExpAuto.g:3749:1: ( ( rule__PolynomialValueProvider__ExponentAssignment_2 ) )
            // InternalExpAuto.g:3750:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2()); 
            // InternalExpAuto.g:3751:2: ( rule__PolynomialValueProvider__ExponentAssignment_2 )
            // InternalExpAuto.g:3751:3: rule__PolynomialValueProvider__ExponentAssignment_2
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
    // InternalExpAuto.g:3759:1: rule__PolynomialValueProvider__Group__3 : rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 ;
    public final void rule__PolynomialValueProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3763:1: ( rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4 )
            // InternalExpAuto.g:3764:2: rule__PolynomialValueProvider__Group__3__Impl rule__PolynomialValueProvider__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3771:1: rule__PolynomialValueProvider__Group__3__Impl : ( ',' ) ;
    public final void rule__PolynomialValueProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3775:1: ( ( ',' ) )
            // InternalExpAuto.g:3776:1: ( ',' )
            {
            // InternalExpAuto.g:3776:1: ( ',' )
            // InternalExpAuto.g:3777:2: ','
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
    // InternalExpAuto.g:3786:1: rule__PolynomialValueProvider__Group__4 : rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 ;
    public final void rule__PolynomialValueProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3790:1: ( rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5 )
            // InternalExpAuto.g:3791:2: rule__PolynomialValueProvider__Group__4__Impl rule__PolynomialValueProvider__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:3798:1: rule__PolynomialValueProvider__Group__4__Impl : ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) ;
    public final void rule__PolynomialValueProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3802:1: ( ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) ) )
            // InternalExpAuto.g:3803:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            {
            // InternalExpAuto.g:3803:1: ( ( rule__PolynomialValueProvider__FactorAssignment_4 ) )
            // InternalExpAuto.g:3804:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            {
             before(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4()); 
            // InternalExpAuto.g:3805:2: ( rule__PolynomialValueProvider__FactorAssignment_4 )
            // InternalExpAuto.g:3805:3: rule__PolynomialValueProvider__FactorAssignment_4
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
    // InternalExpAuto.g:3813:1: rule__PolynomialValueProvider__Group__5 : rule__PolynomialValueProvider__Group__5__Impl ;
    public final void rule__PolynomialValueProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3817:1: ( rule__PolynomialValueProvider__Group__5__Impl )
            // InternalExpAuto.g:3818:2: rule__PolynomialValueProvider__Group__5__Impl
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
    // InternalExpAuto.g:3824:1: rule__PolynomialValueProvider__Group__5__Impl : ( ')' ) ;
    public final void rule__PolynomialValueProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3828:1: ( ( ')' ) )
            // InternalExpAuto.g:3829:1: ( ')' )
            {
            // InternalExpAuto.g:3829:1: ( ')' )
            // InternalExpAuto.g:3830:2: ')'
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
    // InternalExpAuto.g:3840:1: rule__StopTimeCondition__Group__0 : rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 ;
    public final void rule__StopTimeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3844:1: ( rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1 )
            // InternalExpAuto.g:3845:2: rule__StopTimeCondition__Group__0__Impl rule__StopTimeCondition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:3852:1: rule__StopTimeCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopTimeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3856:1: ( ( 'stop' ) )
            // InternalExpAuto.g:3857:1: ( 'stop' )
            {
            // InternalExpAuto.g:3857:1: ( 'stop' )
            // InternalExpAuto.g:3858:2: 'stop'
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
    // InternalExpAuto.g:3867:1: rule__StopTimeCondition__Group__1 : rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 ;
    public final void rule__StopTimeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3871:1: ( rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2 )
            // InternalExpAuto.g:3872:2: rule__StopTimeCondition__Group__1__Impl rule__StopTimeCondition__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalExpAuto.g:3879:1: rule__StopTimeCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopTimeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3883:1: ( ( '=' ) )
            // InternalExpAuto.g:3884:1: ( '=' )
            {
            // InternalExpAuto.g:3884:1: ( '=' )
            // InternalExpAuto.g:3885:2: '='
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
    // InternalExpAuto.g:3894:1: rule__StopTimeCondition__Group__2 : rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 ;
    public final void rule__StopTimeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3898:1: ( rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3 )
            // InternalExpAuto.g:3899:2: rule__StopTimeCondition__Group__2__Impl rule__StopTimeCondition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:3906:1: rule__StopTimeCondition__Group__2__Impl : ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopTimeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3910:1: ( ( ( rule__StopTimeCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:3911:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:3911:1: ( ( rule__StopTimeCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:3912:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:3913:2: ( rule__StopTimeCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:3913:3: rule__StopTimeCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:3921:1: rule__StopTimeCondition__Group__3 : rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 ;
    public final void rule__StopTimeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3925:1: ( rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4 )
            // InternalExpAuto.g:3926:2: rule__StopTimeCondition__Group__3__Impl rule__StopTimeCondition__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:3933:1: rule__StopTimeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopTimeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3937:1: ( ( '(' ) )
            // InternalExpAuto.g:3938:1: ( '(' )
            {
            // InternalExpAuto.g:3938:1: ( '(' )
            // InternalExpAuto.g:3939:2: '('
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
    // InternalExpAuto.g:3948:1: rule__StopTimeCondition__Group__4 : rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 ;
    public final void rule__StopTimeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3952:1: ( rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5 )
            // InternalExpAuto.g:3953:2: rule__StopTimeCondition__Group__4__Impl rule__StopTimeCondition__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:3960:1: rule__StopTimeCondition__Group__4__Impl : ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopTimeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3964:1: ( ( ( rule__StopTimeCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:3965:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:3965:1: ( ( rule__StopTimeCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:3966:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:3967:2: ( rule__StopTimeCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:3967:3: rule__StopTimeCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:3975:1: rule__StopTimeCondition__Group__5 : rule__StopTimeCondition__Group__5__Impl ;
    public final void rule__StopTimeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3979:1: ( rule__StopTimeCondition__Group__5__Impl )
            // InternalExpAuto.g:3980:2: rule__StopTimeCondition__Group__5__Impl
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
    // InternalExpAuto.g:3986:1: rule__StopTimeCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopTimeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:3990:1: ( ( ')' ) )
            // InternalExpAuto.g:3991:1: ( ')' )
            {
            // InternalExpAuto.g:3991:1: ( ')' )
            // InternalExpAuto.g:3992:2: ')'
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
    // InternalExpAuto.g:4002:1: rule__StopCountCondition__Group__0 : rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 ;
    public final void rule__StopCountCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4006:1: ( rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1 )
            // InternalExpAuto.g:4007:2: rule__StopCountCondition__Group__0__Impl rule__StopCountCondition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:4014:1: rule__StopCountCondition__Group__0__Impl : ( 'stop' ) ;
    public final void rule__StopCountCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4018:1: ( ( 'stop' ) )
            // InternalExpAuto.g:4019:1: ( 'stop' )
            {
            // InternalExpAuto.g:4019:1: ( 'stop' )
            // InternalExpAuto.g:4020:2: 'stop'
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
    // InternalExpAuto.g:4029:1: rule__StopCountCondition__Group__1 : rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 ;
    public final void rule__StopCountCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4033:1: ( rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2 )
            // InternalExpAuto.g:4034:2: rule__StopCountCondition__Group__1__Impl rule__StopCountCondition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalExpAuto.g:4041:1: rule__StopCountCondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StopCountCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4045:1: ( ( '=' ) )
            // InternalExpAuto.g:4046:1: ( '=' )
            {
            // InternalExpAuto.g:4046:1: ( '=' )
            // InternalExpAuto.g:4047:2: '='
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
    // InternalExpAuto.g:4056:1: rule__StopCountCondition__Group__2 : rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 ;
    public final void rule__StopCountCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4060:1: ( rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3 )
            // InternalExpAuto.g:4061:2: rule__StopCountCondition__Group__2__Impl rule__StopCountCondition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalExpAuto.g:4068:1: rule__StopCountCondition__Group__2__Impl : ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) ;
    public final void rule__StopCountCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4072:1: ( ( ( rule__StopCountCondition__StopTypAssignment_2 ) ) )
            // InternalExpAuto.g:4073:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            {
            // InternalExpAuto.g:4073:1: ( ( rule__StopCountCondition__StopTypAssignment_2 ) )
            // InternalExpAuto.g:4074:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2()); 
            // InternalExpAuto.g:4075:2: ( rule__StopCountCondition__StopTypAssignment_2 )
            // InternalExpAuto.g:4075:3: rule__StopCountCondition__StopTypAssignment_2
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
    // InternalExpAuto.g:4083:1: rule__StopCountCondition__Group__3 : rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 ;
    public final void rule__StopCountCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4087:1: ( rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4 )
            // InternalExpAuto.g:4088:2: rule__StopCountCondition__Group__3__Impl rule__StopCountCondition__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:4095:1: rule__StopCountCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__StopCountCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4099:1: ( ( '(' ) )
            // InternalExpAuto.g:4100:1: ( '(' )
            {
            // InternalExpAuto.g:4100:1: ( '(' )
            // InternalExpAuto.g:4101:2: '('
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
    // InternalExpAuto.g:4110:1: rule__StopCountCondition__Group__4 : rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 ;
    public final void rule__StopCountCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4114:1: ( rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5 )
            // InternalExpAuto.g:4115:2: rule__StopCountCondition__Group__4__Impl rule__StopCountCondition__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalExpAuto.g:4122:1: rule__StopCountCondition__Group__4__Impl : ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) ;
    public final void rule__StopCountCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4126:1: ( ( ( rule__StopCountCondition__StopParamAssignment_4 ) ) )
            // InternalExpAuto.g:4127:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            {
            // InternalExpAuto.g:4127:1: ( ( rule__StopCountCondition__StopParamAssignment_4 ) )
            // InternalExpAuto.g:4128:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4()); 
            // InternalExpAuto.g:4129:2: ( rule__StopCountCondition__StopParamAssignment_4 )
            // InternalExpAuto.g:4129:3: rule__StopCountCondition__StopParamAssignment_4
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
    // InternalExpAuto.g:4137:1: rule__StopCountCondition__Group__5 : rule__StopCountCondition__Group__5__Impl ;
    public final void rule__StopCountCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4141:1: ( rule__StopCountCondition__Group__5__Impl )
            // InternalExpAuto.g:4142:2: rule__StopCountCondition__Group__5__Impl
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
    // InternalExpAuto.g:4148:1: rule__StopCountCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__StopCountCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4152:1: ( ( ')' ) )
            // InternalExpAuto.g:4153:1: ( ')' )
            {
            // InternalExpAuto.g:4153:1: ( ')' )
            // InternalExpAuto.g:4154:2: ')'
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
    // InternalExpAuto.g:4164:1: rule__NumberOfExperiments__Group__0 : rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 ;
    public final void rule__NumberOfExperiments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4168:1: ( rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1 )
            // InternalExpAuto.g:4169:2: rule__NumberOfExperiments__Group__0__Impl rule__NumberOfExperiments__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:4176:1: rule__NumberOfExperiments__Group__0__Impl : ( 'repetitions' ) ;
    public final void rule__NumberOfExperiments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4180:1: ( ( 'repetitions' ) )
            // InternalExpAuto.g:4181:1: ( 'repetitions' )
            {
            // InternalExpAuto.g:4181:1: ( 'repetitions' )
            // InternalExpAuto.g:4182:2: 'repetitions'
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
    // InternalExpAuto.g:4191:1: rule__NumberOfExperiments__Group__1 : rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 ;
    public final void rule__NumberOfExperiments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4195:1: ( rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2 )
            // InternalExpAuto.g:4196:2: rule__NumberOfExperiments__Group__1__Impl rule__NumberOfExperiments__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:4203:1: rule__NumberOfExperiments__Group__1__Impl : ( '=' ) ;
    public final void rule__NumberOfExperiments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4207:1: ( ( '=' ) )
            // InternalExpAuto.g:4208:1: ( '=' )
            {
            // InternalExpAuto.g:4208:1: ( '=' )
            // InternalExpAuto.g:4209:2: '='
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
    // InternalExpAuto.g:4218:1: rule__NumberOfExperiments__Group__2 : rule__NumberOfExperiments__Group__2__Impl ;
    public final void rule__NumberOfExperiments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4222:1: ( rule__NumberOfExperiments__Group__2__Impl )
            // InternalExpAuto.g:4223:2: rule__NumberOfExperiments__Group__2__Impl
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
    // InternalExpAuto.g:4229:1: rule__NumberOfExperiments__Group__2__Impl : ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) ;
    public final void rule__NumberOfExperiments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4233:1: ( ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) ) )
            // InternalExpAuto.g:4234:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            {
            // InternalExpAuto.g:4234:1: ( ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 ) )
            // InternalExpAuto.g:4235:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            {
             before(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2()); 
            // InternalExpAuto.g:4236:2: ( rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 )
            // InternalExpAuto.g:4236:3: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2
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
    // InternalExpAuto.g:4245:1: rule__ToolDefinition__Group__0 : rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 ;
    public final void rule__ToolDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4249:1: ( rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1 )
            // InternalExpAuto.g:4250:2: rule__ToolDefinition__Group__0__Impl rule__ToolDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:4257:1: rule__ToolDefinition__Group__0__Impl : ( 'tool' ) ;
    public final void rule__ToolDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4261:1: ( ( 'tool' ) )
            // InternalExpAuto.g:4262:1: ( 'tool' )
            {
            // InternalExpAuto.g:4262:1: ( 'tool' )
            // InternalExpAuto.g:4263:2: 'tool'
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
    // InternalExpAuto.g:4272:1: rule__ToolDefinition__Group__1 : rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 ;
    public final void rule__ToolDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4276:1: ( rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2 )
            // InternalExpAuto.g:4277:2: rule__ToolDefinition__Group__1__Impl rule__ToolDefinition__Group__2
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
    // InternalExpAuto.g:4284:1: rule__ToolDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__ToolDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4288:1: ( ( '=' ) )
            // InternalExpAuto.g:4289:1: ( '=' )
            {
            // InternalExpAuto.g:4289:1: ( '=' )
            // InternalExpAuto.g:4290:2: '='
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
    // InternalExpAuto.g:4299:1: rule__ToolDefinition__Group__2 : rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 ;
    public final void rule__ToolDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4303:1: ( rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3 )
            // InternalExpAuto.g:4304:2: rule__ToolDefinition__Group__2__Impl rule__ToolDefinition__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:4311:1: rule__ToolDefinition__Group__2__Impl : ( ( rule__ToolDefinition__ToolAssignment_2 ) ) ;
    public final void rule__ToolDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4315:1: ( ( ( rule__ToolDefinition__ToolAssignment_2 ) ) )
            // InternalExpAuto.g:4316:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            {
            // InternalExpAuto.g:4316:1: ( ( rule__ToolDefinition__ToolAssignment_2 ) )
            // InternalExpAuto.g:4317:2: ( rule__ToolDefinition__ToolAssignment_2 )
            {
             before(grammarAccess.getToolDefinitionAccess().getToolAssignment_2()); 
            // InternalExpAuto.g:4318:2: ( rule__ToolDefinition__ToolAssignment_2 )
            // InternalExpAuto.g:4318:3: rule__ToolDefinition__ToolAssignment_2
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
    // InternalExpAuto.g:4326:1: rule__ToolDefinition__Group__3 : rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 ;
    public final void rule__ToolDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4330:1: ( rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4 )
            // InternalExpAuto.g:4331:2: rule__ToolDefinition__Group__3__Impl rule__ToolDefinition__Group__4
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
    // InternalExpAuto.g:4338:1: rule__ToolDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ToolDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4342:1: ( ( '{' ) )
            // InternalExpAuto.g:4343:1: ( '{' )
            {
            // InternalExpAuto.g:4343:1: ( '{' )
            // InternalExpAuto.g:4344:2: '{'
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
    // InternalExpAuto.g:4353:1: rule__ToolDefinition__Group__4 : rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 ;
    public final void rule__ToolDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4357:1: ( rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5 )
            // InternalExpAuto.g:4358:2: rule__ToolDefinition__Group__4__Impl rule__ToolDefinition__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalExpAuto.g:4365:1: rule__ToolDefinition__Group__4__Impl : ( ( rule__ToolDefinition__ConfigParamsAssignment_4 ) ) ;
    public final void rule__ToolDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4369:1: ( ( ( rule__ToolDefinition__ConfigParamsAssignment_4 ) ) )
            // InternalExpAuto.g:4370:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 ) )
            {
            // InternalExpAuto.g:4370:1: ( ( rule__ToolDefinition__ConfigParamsAssignment_4 ) )
            // InternalExpAuto.g:4371:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )
            {
             before(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_4()); 
            // InternalExpAuto.g:4372:2: ( rule__ToolDefinition__ConfigParamsAssignment_4 )
            // InternalExpAuto.g:4372:3: rule__ToolDefinition__ConfigParamsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ToolDefinition__ConfigParamsAssignment_4();

            state._fsp--;


            }

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
    // InternalExpAuto.g:4380:1: rule__ToolDefinition__Group__5 : rule__ToolDefinition__Group__5__Impl ;
    public final void rule__ToolDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4384:1: ( rule__ToolDefinition__Group__5__Impl )
            // InternalExpAuto.g:4385:2: rule__ToolDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4391:1: rule__ToolDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ToolDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4395:1: ( ( '}' ) )
            // InternalExpAuto.g:4396:1: ( '}' )
            {
            // InternalExpAuto.g:4396:1: ( '}' )
            // InternalExpAuto.g:4397:2: '}'
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


    // $ANTLR start "rule__SeedDefinition__Group__0"
    // InternalExpAuto.g:4407:1: rule__SeedDefinition__Group__0 : rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 ;
    public final void rule__SeedDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4411:1: ( rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1 )
            // InternalExpAuto.g:4412:2: rule__SeedDefinition__Group__0__Impl rule__SeedDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:4419:1: rule__SeedDefinition__Group__0__Impl : ( 'seeds' ) ;
    public final void rule__SeedDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4423:1: ( ( 'seeds' ) )
            // InternalExpAuto.g:4424:1: ( 'seeds' )
            {
            // InternalExpAuto.g:4424:1: ( 'seeds' )
            // InternalExpAuto.g:4425:2: 'seeds'
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
    // InternalExpAuto.g:4434:1: rule__SeedDefinition__Group__1 : rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 ;
    public final void rule__SeedDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4438:1: ( rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2 )
            // InternalExpAuto.g:4439:2: rule__SeedDefinition__Group__1__Impl rule__SeedDefinition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:4446:1: rule__SeedDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__SeedDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4450:1: ( ( '=' ) )
            // InternalExpAuto.g:4451:1: ( '=' )
            {
            // InternalExpAuto.g:4451:1: ( '=' )
            // InternalExpAuto.g:4452:2: '='
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
    // InternalExpAuto.g:4461:1: rule__SeedDefinition__Group__2 : rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 ;
    public final void rule__SeedDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4465:1: ( rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3 )
            // InternalExpAuto.g:4466:2: rule__SeedDefinition__Group__2__Impl rule__SeedDefinition__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:4473:1: rule__SeedDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4477:1: ( ( '{' ) )
            // InternalExpAuto.g:4478:1: ( '{' )
            {
            // InternalExpAuto.g:4478:1: ( '{' )
            // InternalExpAuto.g:4479:2: '{'
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
    // InternalExpAuto.g:4488:1: rule__SeedDefinition__Group__3 : rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 ;
    public final void rule__SeedDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4492:1: ( rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4 )
            // InternalExpAuto.g:4493:2: rule__SeedDefinition__Group__3__Impl rule__SeedDefinition__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:4500:1: rule__SeedDefinition__Group__3__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) ;
    public final void rule__SeedDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4504:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_3 ) ) )
            // InternalExpAuto.g:4505:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            {
            // InternalExpAuto.g:4505:1: ( ( rule__SeedDefinition__SeedListsAssignment_3 ) )
            // InternalExpAuto.g:4506:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3()); 
            // InternalExpAuto.g:4507:2: ( rule__SeedDefinition__SeedListsAssignment_3 )
            // InternalExpAuto.g:4507:3: rule__SeedDefinition__SeedListsAssignment_3
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
    // InternalExpAuto.g:4515:1: rule__SeedDefinition__Group__4 : rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 ;
    public final void rule__SeedDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4519:1: ( rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5 )
            // InternalExpAuto.g:4520:2: rule__SeedDefinition__Group__4__Impl rule__SeedDefinition__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:4527:1: rule__SeedDefinition__Group__4__Impl : ( ( rule__SeedDefinition__Group_4__0 )* ) ;
    public final void rule__SeedDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4531:1: ( ( ( rule__SeedDefinition__Group_4__0 )* ) )
            // InternalExpAuto.g:4532:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            {
            // InternalExpAuto.g:4532:1: ( ( rule__SeedDefinition__Group_4__0 )* )
            // InternalExpAuto.g:4533:2: ( rule__SeedDefinition__Group_4__0 )*
            {
             before(grammarAccess.getSeedDefinitionAccess().getGroup_4()); 
            // InternalExpAuto.g:4534:2: ( rule__SeedDefinition__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExpAuto.g:4534:3: rule__SeedDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SeedDefinition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalExpAuto.g:4542:1: rule__SeedDefinition__Group__5 : rule__SeedDefinition__Group__5__Impl ;
    public final void rule__SeedDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4546:1: ( rule__SeedDefinition__Group__5__Impl )
            // InternalExpAuto.g:4547:2: rule__SeedDefinition__Group__5__Impl
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
    // InternalExpAuto.g:4553:1: rule__SeedDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__SeedDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4557:1: ( ( '}' ) )
            // InternalExpAuto.g:4558:1: ( '}' )
            {
            // InternalExpAuto.g:4558:1: ( '}' )
            // InternalExpAuto.g:4559:2: '}'
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
    // InternalExpAuto.g:4569:1: rule__SeedDefinition__Group_4__0 : rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 ;
    public final void rule__SeedDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4573:1: ( rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1 )
            // InternalExpAuto.g:4574:2: rule__SeedDefinition__Group_4__0__Impl rule__SeedDefinition__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalExpAuto.g:4581:1: rule__SeedDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SeedDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4585:1: ( ( ',' ) )
            // InternalExpAuto.g:4586:1: ( ',' )
            {
            // InternalExpAuto.g:4586:1: ( ',' )
            // InternalExpAuto.g:4587:2: ','
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
    // InternalExpAuto.g:4596:1: rule__SeedDefinition__Group_4__1 : rule__SeedDefinition__Group_4__1__Impl ;
    public final void rule__SeedDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4600:1: ( rule__SeedDefinition__Group_4__1__Impl )
            // InternalExpAuto.g:4601:2: rule__SeedDefinition__Group_4__1__Impl
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
    // InternalExpAuto.g:4607:1: rule__SeedDefinition__Group_4__1__Impl : ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) ;
    public final void rule__SeedDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4611:1: ( ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) ) )
            // InternalExpAuto.g:4612:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            {
            // InternalExpAuto.g:4612:1: ( ( rule__SeedDefinition__SeedListsAssignment_4_1 ) )
            // InternalExpAuto.g:4613:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            {
             before(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1()); 
            // InternalExpAuto.g:4614:2: ( rule__SeedDefinition__SeedListsAssignment_4_1 )
            // InternalExpAuto.g:4614:3: rule__SeedDefinition__SeedListsAssignment_4_1
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
    // InternalExpAuto.g:4623:1: rule__ListOfSeeds__Group__0 : rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 ;
    public final void rule__ListOfSeeds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4627:1: ( rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1 )
            // InternalExpAuto.g:4628:2: rule__ListOfSeeds__Group__0__Impl rule__ListOfSeeds__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:4635:1: rule__ListOfSeeds__Group__0__Impl : ( '{' ) ;
    public final void rule__ListOfSeeds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4639:1: ( ( '{' ) )
            // InternalExpAuto.g:4640:1: ( '{' )
            {
            // InternalExpAuto.g:4640:1: ( '{' )
            // InternalExpAuto.g:4641:2: '{'
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
    // InternalExpAuto.g:4650:1: rule__ListOfSeeds__Group__1 : rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 ;
    public final void rule__ListOfSeeds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4654:1: ( rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2 )
            // InternalExpAuto.g:4655:2: rule__ListOfSeeds__Group__1__Impl rule__ListOfSeeds__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:4662:1: rule__ListOfSeeds__Group__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) ;
    public final void rule__ListOfSeeds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4666:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_1 ) ) )
            // InternalExpAuto.g:4667:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            {
            // InternalExpAuto.g:4667:1: ( ( rule__ListOfSeeds__SeedsAssignment_1 ) )
            // InternalExpAuto.g:4668:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1()); 
            // InternalExpAuto.g:4669:2: ( rule__ListOfSeeds__SeedsAssignment_1 )
            // InternalExpAuto.g:4669:3: rule__ListOfSeeds__SeedsAssignment_1
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
    // InternalExpAuto.g:4677:1: rule__ListOfSeeds__Group__2 : rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 ;
    public final void rule__ListOfSeeds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4681:1: ( rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3 )
            // InternalExpAuto.g:4682:2: rule__ListOfSeeds__Group__2__Impl rule__ListOfSeeds__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalExpAuto.g:4689:1: rule__ListOfSeeds__Group__2__Impl : ( ( rule__ListOfSeeds__Group_2__0 )* ) ;
    public final void rule__ListOfSeeds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4693:1: ( ( ( rule__ListOfSeeds__Group_2__0 )* ) )
            // InternalExpAuto.g:4694:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            {
            // InternalExpAuto.g:4694:1: ( ( rule__ListOfSeeds__Group_2__0 )* )
            // InternalExpAuto.g:4695:2: ( rule__ListOfSeeds__Group_2__0 )*
            {
             before(grammarAccess.getListOfSeedsAccess().getGroup_2()); 
            // InternalExpAuto.g:4696:2: ( rule__ListOfSeeds__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalExpAuto.g:4696:3: rule__ListOfSeeds__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ListOfSeeds__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalExpAuto.g:4704:1: rule__ListOfSeeds__Group__3 : rule__ListOfSeeds__Group__3__Impl ;
    public final void rule__ListOfSeeds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4708:1: ( rule__ListOfSeeds__Group__3__Impl )
            // InternalExpAuto.g:4709:2: rule__ListOfSeeds__Group__3__Impl
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
    // InternalExpAuto.g:4715:1: rule__ListOfSeeds__Group__3__Impl : ( '}' ) ;
    public final void rule__ListOfSeeds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4719:1: ( ( '}' ) )
            // InternalExpAuto.g:4720:1: ( '}' )
            {
            // InternalExpAuto.g:4720:1: ( '}' )
            // InternalExpAuto.g:4721:2: '}'
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
    // InternalExpAuto.g:4731:1: rule__ListOfSeeds__Group_2__0 : rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 ;
    public final void rule__ListOfSeeds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4735:1: ( rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1 )
            // InternalExpAuto.g:4736:2: rule__ListOfSeeds__Group_2__0__Impl rule__ListOfSeeds__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalExpAuto.g:4743:1: rule__ListOfSeeds__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOfSeeds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4747:1: ( ( ',' ) )
            // InternalExpAuto.g:4748:1: ( ',' )
            {
            // InternalExpAuto.g:4748:1: ( ',' )
            // InternalExpAuto.g:4749:2: ','
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
    // InternalExpAuto.g:4758:1: rule__ListOfSeeds__Group_2__1 : rule__ListOfSeeds__Group_2__1__Impl ;
    public final void rule__ListOfSeeds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4762:1: ( rule__ListOfSeeds__Group_2__1__Impl )
            // InternalExpAuto.g:4763:2: rule__ListOfSeeds__Group_2__1__Impl
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
    // InternalExpAuto.g:4769:1: rule__ListOfSeeds__Group_2__1__Impl : ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) ;
    public final void rule__ListOfSeeds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4773:1: ( ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) ) )
            // InternalExpAuto.g:4774:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            {
            // InternalExpAuto.g:4774:1: ( ( rule__ListOfSeeds__SeedsAssignment_2_1 ) )
            // InternalExpAuto.g:4775:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            {
             before(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1()); 
            // InternalExpAuto.g:4776:2: ( rule__ListOfSeeds__SeedsAssignment_2_1 )
            // InternalExpAuto.g:4776:3: rule__ListOfSeeds__SeedsAssignment_2_1
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
    // InternalExpAuto.g:4785:1: rule__ExperimentDatasource__Group__0 : rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 ;
    public final void rule__ExperimentDatasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4789:1: ( rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1 )
            // InternalExpAuto.g:4790:2: rule__ExperimentDatasource__Group__0__Impl rule__ExperimentDatasource__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalExpAuto.g:4797:1: rule__ExperimentDatasource__Group__0__Impl : ( 'datasource' ) ;
    public final void rule__ExperimentDatasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4801:1: ( ( 'datasource' ) )
            // InternalExpAuto.g:4802:1: ( 'datasource' )
            {
            // InternalExpAuto.g:4802:1: ( 'datasource' )
            // InternalExpAuto.g:4803:2: 'datasource'
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
    // InternalExpAuto.g:4812:1: rule__ExperimentDatasource__Group__1 : rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 ;
    public final void rule__ExperimentDatasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4816:1: ( rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2 )
            // InternalExpAuto.g:4817:2: rule__ExperimentDatasource__Group__1__Impl rule__ExperimentDatasource__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalExpAuto.g:4824:1: rule__ExperimentDatasource__Group__1__Impl : ( '=' ) ;
    public final void rule__ExperimentDatasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4828:1: ( ( '=' ) )
            // InternalExpAuto.g:4829:1: ( '=' )
            {
            // InternalExpAuto.g:4829:1: ( '=' )
            // InternalExpAuto.g:4830:2: '='
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
    // InternalExpAuto.g:4839:1: rule__ExperimentDatasource__Group__2 : rule__ExperimentDatasource__Group__2__Impl ;
    public final void rule__ExperimentDatasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4843:1: ( rule__ExperimentDatasource__Group__2__Impl )
            // InternalExpAuto.g:4844:2: rule__ExperimentDatasource__Group__2__Impl
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
    // InternalExpAuto.g:4850:1: rule__ExperimentDatasource__Group__2__Impl : ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) ;
    public final void rule__ExperimentDatasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4854:1: ( ( ( rule__ExperimentDatasource__SourceAssignment_2 ) ) )
            // InternalExpAuto.g:4855:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            {
            // InternalExpAuto.g:4855:1: ( ( rule__ExperimentDatasource__SourceAssignment_2 ) )
            // InternalExpAuto.g:4856:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2()); 
            // InternalExpAuto.g:4857:2: ( rule__ExperimentDatasource__SourceAssignment_2 )
            // InternalExpAuto.g:4857:3: rule__ExperimentDatasource__SourceAssignment_2
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


    // $ANTLR start "rule__KeyValue__Group__0"
    // InternalExpAuto.g:4866:1: rule__KeyValue__Group__0 : rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 ;
    public final void rule__KeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4870:1: ( rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 )
            // InternalExpAuto.g:4871:2: rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__KeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__0"


    // $ANTLR start "rule__KeyValue__Group__0__Impl"
    // InternalExpAuto.g:4878:1: rule__KeyValue__Group__0__Impl : ( ( rule__KeyValue__KeyAssignment_0 ) ) ;
    public final void rule__KeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4882:1: ( ( ( rule__KeyValue__KeyAssignment_0 ) ) )
            // InternalExpAuto.g:4883:1: ( ( rule__KeyValue__KeyAssignment_0 ) )
            {
            // InternalExpAuto.g:4883:1: ( ( rule__KeyValue__KeyAssignment_0 ) )
            // InternalExpAuto.g:4884:2: ( rule__KeyValue__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValueAccess().getKeyAssignment_0()); 
            // InternalExpAuto.g:4885:2: ( rule__KeyValue__KeyAssignment_0 )
            // InternalExpAuto.g:4885:3: rule__KeyValue__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__0__Impl"


    // $ANTLR start "rule__KeyValue__Group__1"
    // InternalExpAuto.g:4893:1: rule__KeyValue__Group__1 : rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 ;
    public final void rule__KeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4897:1: ( rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 )
            // InternalExpAuto.g:4898:2: rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__KeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__1"


    // $ANTLR start "rule__KeyValue__Group__1__Impl"
    // InternalExpAuto.g:4905:1: rule__KeyValue__Group__1__Impl : ( '=' ) ;
    public final void rule__KeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4909:1: ( ( '=' ) )
            // InternalExpAuto.g:4910:1: ( '=' )
            {
            // InternalExpAuto.g:4910:1: ( '=' )
            // InternalExpAuto.g:4911:2: '='
            {
             before(grammarAccess.getKeyValueAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKeyValueAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__2"
    // InternalExpAuto.g:4920:1: rule__KeyValue__Group__2 : rule__KeyValue__Group__2__Impl ;
    public final void rule__KeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4924:1: ( rule__KeyValue__Group__2__Impl )
            // InternalExpAuto.g:4925:2: rule__KeyValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__2"


    // $ANTLR start "rule__KeyValue__Group__2__Impl"
    // InternalExpAuto.g:4931:1: rule__KeyValue__Group__2__Impl : ( ( rule__KeyValue__ValueAssignment_2 ) ) ;
    public final void rule__KeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4935:1: ( ( ( rule__KeyValue__ValueAssignment_2 ) ) )
            // InternalExpAuto.g:4936:1: ( ( rule__KeyValue__ValueAssignment_2 ) )
            {
            // InternalExpAuto.g:4936:1: ( ( rule__KeyValue__ValueAssignment_2 ) )
            // InternalExpAuto.g:4937:2: ( rule__KeyValue__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValueAccess().getValueAssignment_2()); 
            // InternalExpAuto.g:4938:2: ( rule__KeyValue__ValueAssignment_2 )
            // InternalExpAuto.g:4938:3: rule__KeyValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__2__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalExpAuto.g:4947:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4951:1: ( ( ruleImport ) )
            // InternalExpAuto.g:4952:2: ( ruleImport )
            {
            // InternalExpAuto.g:4952:2: ( ruleImport )
            // InternalExpAuto.g:4953:3: ruleImport
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
    // InternalExpAuto.g:4962:1: rule__Model__DatasourcesAssignment_1 : ( ruleDatasource ) ;
    public final void rule__Model__DatasourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4966:1: ( ( ruleDatasource ) )
            // InternalExpAuto.g:4967:2: ( ruleDatasource )
            {
            // InternalExpAuto.g:4967:2: ( ruleDatasource )
            // InternalExpAuto.g:4968:3: ruleDatasource
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
    // InternalExpAuto.g:4977:1: rule__Model__ExperimentsAssignment_2 : ( ruleExperiment ) ;
    public final void rule__Model__ExperimentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4981:1: ( ( ruleExperiment ) )
            // InternalExpAuto.g:4982:2: ( ruleExperiment )
            {
            // InternalExpAuto.g:4982:2: ( ruleExperiment )
            // InternalExpAuto.g:4983:3: ruleExperiment
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
    // InternalExpAuto.g:4992:1: rule__Import__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:4996:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:4997:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:4997:2: ( RULE_STRING )
            // InternalExpAuto.g:4998:3: RULE_STRING
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
    // InternalExpAuto.g:5007:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5011:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5012:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5012:2: ( RULE_ID )
            // InternalExpAuto.g:5013:3: RULE_ID
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
    // InternalExpAuto.g:5022:1: rule__Datasource__SpecificationAssignment_3 : ( ruleDatasourceSpecification ) ;
    public final void rule__Datasource__SpecificationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5026:1: ( ( ruleDatasourceSpecification ) )
            // InternalExpAuto.g:5027:2: ( ruleDatasourceSpecification )
            {
            // InternalExpAuto.g:5027:2: ( ruleDatasourceSpecification )
            // InternalExpAuto.g:5028:3: ruleDatasourceSpecification
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
    // InternalExpAuto.g:5037:1: rule__DatasourceSpecification__SpecificationAssignment : ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) ) ;
    public final void rule__DatasourceSpecification__SpecificationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5041:1: ( ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) ) )
            // InternalExpAuto.g:5042:2: ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) )
            {
            // InternalExpAuto.g:5042:2: ( ( rule__DatasourceSpecification__SpecificationAlternatives_0 ) )
            // InternalExpAuto.g:5043:3: ( rule__DatasourceSpecification__SpecificationAlternatives_0 )
            {
             before(grammarAccess.getDatasourceSpecificationAccess().getSpecificationAlternatives_0()); 
            // InternalExpAuto.g:5044:3: ( rule__DatasourceSpecification__SpecificationAlternatives_0 )
            // InternalExpAuto.g:5044:4: rule__DatasourceSpecification__SpecificationAlternatives_0
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
    // InternalExpAuto.g:5052:1: rule__FileDatasourceSpecification__SourceTypeAssignment_0 : ( ( 'EDP2' ) ) ;
    public final void rule__FileDatasourceSpecification__SourceTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5056:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:5057:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:5057:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:5058:3: ( 'EDP2' )
            {
             before(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0()); 
            // InternalExpAuto.g:5059:3: ( 'EDP2' )
            // InternalExpAuto.g:5060:4: 'EDP2'
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
    // InternalExpAuto.g:5071:1: rule__FileDatasourceSpecification__SourceURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileDatasourceSpecification__SourceURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5075:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5076:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5076:2: ( RULE_STRING )
            // InternalExpAuto.g:5077:3: RULE_STRING
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
    // InternalExpAuto.g:5086:1: rule__MemoryDatasourceSpecification__SourceTypeAssignment : ( ( 'EDP2' ) ) ;
    public final void rule__MemoryDatasourceSpecification__SourceTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5090:1: ( ( ( 'EDP2' ) ) )
            // InternalExpAuto.g:5091:2: ( ( 'EDP2' ) )
            {
            // InternalExpAuto.g:5091:2: ( ( 'EDP2' ) )
            // InternalExpAuto.g:5092:3: ( 'EDP2' )
            {
             before(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0()); 
            // InternalExpAuto.g:5093:3: ( 'EDP2' )
            // InternalExpAuto.g:5094:4: 'EDP2'
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
    // InternalExpAuto.g:5105:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5109:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5110:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5110:2: ( RULE_ID )
            // InternalExpAuto.g:5111:3: RULE_ID
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
    // InternalExpAuto.g:5120:1: rule__Experiment__DesignAssignment_3 : ( ( rule__Experiment__DesignAlternatives_3_0 ) ) ;
    public final void rule__Experiment__DesignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5124:1: ( ( ( rule__Experiment__DesignAlternatives_3_0 ) ) )
            // InternalExpAuto.g:5125:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            {
            // InternalExpAuto.g:5125:2: ( ( rule__Experiment__DesignAlternatives_3_0 ) )
            // InternalExpAuto.g:5126:3: ( rule__Experiment__DesignAlternatives_3_0 )
            {
             before(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0()); 
            // InternalExpAuto.g:5127:3: ( rule__Experiment__DesignAlternatives_3_0 )
            // InternalExpAuto.g:5127:4: rule__Experiment__DesignAlternatives_3_0
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
    // InternalExpAuto.g:5135:1: rule__Experiment__ExperimentSpecificationsAssignment_5 : ( ruleExperimentSpecifications ) ;
    public final void rule__Experiment__ExperimentSpecificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5139:1: ( ( ruleExperimentSpecifications ) )
            // InternalExpAuto.g:5140:2: ( ruleExperimentSpecifications )
            {
            // InternalExpAuto.g:5140:2: ( ruleExperimentSpecifications )
            // InternalExpAuto.g:5141:3: ruleExperimentSpecifications
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
    // InternalExpAuto.g:5150:1: rule__ExperimentSpecifications__SpecificationsAssignment : ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__ExperimentSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5154:1: ( ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5155:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5155:2: ( ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5156:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5157:3: ( rule__ExperimentSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5157:4: rule__ExperimentSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5165:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5169:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5170:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5170:2: ( RULE_STRING )
            // InternalExpAuto.g:5171:3: RULE_STRING
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
    // InternalExpAuto.g:5180:1: rule__InitialModel__ModeltypAssignment_2 : ( ( 'PCM' ) ) ;
    public final void rule__InitialModel__ModeltypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5184:1: ( ( ( 'PCM' ) ) )
            // InternalExpAuto.g:5185:2: ( ( 'PCM' ) )
            {
            // InternalExpAuto.g:5185:2: ( ( 'PCM' ) )
            // InternalExpAuto.g:5186:3: ( 'PCM' )
            {
             before(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0()); 
            // InternalExpAuto.g:5187:3: ( 'PCM' )
            // InternalExpAuto.g:5188:4: 'PCM'
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
    // InternalExpAuto.g:5199:1: rule__InitialModel__InitSpecificationsAssignment_4 : ( ruleInitSpecifications ) ;
    public final void rule__InitialModel__InitSpecificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5203:1: ( ( ruleInitSpecifications ) )
            // InternalExpAuto.g:5204:2: ( ruleInitSpecifications )
            {
            // InternalExpAuto.g:5204:2: ( ruleInitSpecifications )
            // InternalExpAuto.g:5205:3: ruleInitSpecifications
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
    // InternalExpAuto.g:5214:1: rule__InitSpecifications__SpecificationsAssignment : ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) ;
    public final void rule__InitSpecifications__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5218:1: ( ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) ) )
            // InternalExpAuto.g:5219:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5219:2: ( ( rule__InitSpecifications__SpecificationsAlternatives_0 ) )
            // InternalExpAuto.g:5220:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            {
             before(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0()); 
            // InternalExpAuto.g:5221:3: ( rule__InitSpecifications__SpecificationsAlternatives_0 )
            // InternalExpAuto.g:5221:4: rule__InitSpecifications__SpecificationsAlternatives_0
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
    // InternalExpAuto.g:5229:1: rule__AllocationModel__AllocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllocationModel__AllocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5233:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5234:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5234:2: ( RULE_STRING )
            // InternalExpAuto.g:5235:3: RULE_STRING
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
    // InternalExpAuto.g:5244:1: rule__UsageModel__UsageModelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsageModel__UsageModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5248:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5249:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5249:2: ( RULE_STRING )
            // InternalExpAuto.g:5250:3: RULE_STRING
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
    // InternalExpAuto.g:5259:1: rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5263:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5264:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5264:2: ( RULE_STRING )
            // InternalExpAuto.g:5265:3: RULE_STRING
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
    // InternalExpAuto.g:5274:1: rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5278:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5279:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5279:2: ( RULE_STRING )
            // InternalExpAuto.g:5280:3: RULE_STRING
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
    // InternalExpAuto.g:5289:1: rule__MonitorRepository__MonitorRepositoryAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonitorRepository__MonitorRepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5293:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5294:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5294:2: ( RULE_STRING )
            // InternalExpAuto.g:5295:3: RULE_STRING
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
    // InternalExpAuto.g:5304:1: rule__Variation__VariationTypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__VariationTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5308:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5309:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5309:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5310:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getVariationTypValueVariationCrossReference_2_0()); 
            // InternalExpAuto.g:5311:3: ( RULE_ID )
            // InternalExpAuto.g:5312:4: RULE_ID
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
    // InternalExpAuto.g:5323:1: rule__Variation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Variation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5327:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5328:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5328:2: ( RULE_ID )
            // InternalExpAuto.g:5329:3: RULE_ID
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
    // InternalExpAuto.g:5338:1: rule__Variation__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Variation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5342:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5343:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5343:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5344:3: ( RULE_ID )
            {
             before(grammarAccess.getVariationAccess().getTargetIdentifierCrossReference_7_0()); 
            // InternalExpAuto.g:5345:3: ( RULE_ID )
            // InternalExpAuto.g:5346:4: RULE_ID
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
    // InternalExpAuto.g:5357:1: rule__Variation__MaxVariationsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Variation__MaxVariationsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5361:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5362:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5362:2: ( RULE_INT )
            // InternalExpAuto.g:5363:3: RULE_INT
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
    // InternalExpAuto.g:5372:1: rule__Variation__ValueProviderAssignment_13 : ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) ;
    public final void rule__Variation__ValueProviderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5376:1: ( ( ( rule__Variation__ValueProviderAlternatives_13_0 ) ) )
            // InternalExpAuto.g:5377:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            {
            // InternalExpAuto.g:5377:2: ( ( rule__Variation__ValueProviderAlternatives_13_0 ) )
            // InternalExpAuto.g:5378:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            {
             before(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0()); 
            // InternalExpAuto.g:5379:3: ( rule__Variation__ValueProviderAlternatives_13_0 )
            // InternalExpAuto.g:5379:4: rule__Variation__ValueProviderAlternatives_13_0
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
    // InternalExpAuto.g:5387:1: rule__NestedIntervalsValueProvider__MinAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5391:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5392:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5392:2: ( RULE_INT )
            // InternalExpAuto.g:5393:3: RULE_INT
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
    // InternalExpAuto.g:5402:1: rule__NestedIntervalsValueProvider__MaxAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5406:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5407:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5407:2: ( RULE_INT )
            // InternalExpAuto.g:5408:3: RULE_INT
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
    // InternalExpAuto.g:5417:1: rule__NestedIntervalsValueProvider__MinAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MinAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5421:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5422:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5422:2: ( RULE_INT )
            // InternalExpAuto.g:5423:3: RULE_INT
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
    // InternalExpAuto.g:5432:1: rule__NestedIntervalsValueProvider__MaxAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__NestedIntervalsValueProvider__MaxAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5436:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5437:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5437:2: ( RULE_INT )
            // InternalExpAuto.g:5438:3: RULE_INT
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
    // InternalExpAuto.g:5447:1: rule__SetValueProvider__ValuesAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5451:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5452:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5452:2: ( RULE_INT )
            // InternalExpAuto.g:5453:3: RULE_INT
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
    // InternalExpAuto.g:5462:1: rule__SetValueProvider__ValuesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5466:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5467:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5467:2: ( RULE_INT )
            // InternalExpAuto.g:5468:3: RULE_INT
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
    // InternalExpAuto.g:5477:1: rule__SetValueProvider__ValuesAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5481:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5482:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5482:2: ( RULE_INT )
            // InternalExpAuto.g:5483:3: RULE_INT
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
    // InternalExpAuto.g:5492:1: rule__SetValueProvider__ValuesAssignment_1_3_1 : ( RULE_INT ) ;
    public final void rule__SetValueProvider__ValuesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5496:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5497:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5497:2: ( RULE_INT )
            // InternalExpAuto.g:5498:3: RULE_INT
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
    // InternalExpAuto.g:5507:1: rule__LinearValueProvider__SummandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__SummandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5511:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5512:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5512:2: ( RULE_INT )
            // InternalExpAuto.g:5513:3: RULE_INT
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
    // InternalExpAuto.g:5522:1: rule__LinearValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__LinearValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5526:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5527:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5527:2: ( RULE_INT )
            // InternalExpAuto.g:5528:3: RULE_INT
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
    // InternalExpAuto.g:5537:1: rule__ExponentialValueProvider__BaseAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExponentialValueProvider__BaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5541:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5542:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5542:2: ( RULE_INT )
            // InternalExpAuto.g:5543:3: RULE_INT
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
    // InternalExpAuto.g:5552:1: rule__PolynomialValueProvider__ExponentAssignment_2 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5556:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5557:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5557:2: ( RULE_INT )
            // InternalExpAuto.g:5558:3: RULE_INT
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
    // InternalExpAuto.g:5567:1: rule__PolynomialValueProvider__FactorAssignment_4 : ( RULE_INT ) ;
    public final void rule__PolynomialValueProvider__FactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5571:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5572:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5572:2: ( RULE_INT )
            // InternalExpAuto.g:5573:3: RULE_INT
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
    // InternalExpAuto.g:5582:1: rule__StopTimeCondition__StopTypAssignment_2 : ( ( 'simulationTime' ) ) ;
    public final void rule__StopTimeCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5586:1: ( ( ( 'simulationTime' ) ) )
            // InternalExpAuto.g:5587:2: ( ( 'simulationTime' ) )
            {
            // InternalExpAuto.g:5587:2: ( ( 'simulationTime' ) )
            // InternalExpAuto.g:5588:3: ( 'simulationTime' )
            {
             before(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0()); 
            // InternalExpAuto.g:5589:3: ( 'simulationTime' )
            // InternalExpAuto.g:5590:4: 'simulationTime'
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
    // InternalExpAuto.g:5601:1: rule__StopTimeCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopTimeCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5605:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5606:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5606:2: ( RULE_INT )
            // InternalExpAuto.g:5607:3: RULE_INT
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
    // InternalExpAuto.g:5616:1: rule__StopCountCondition__StopTypAssignment_2 : ( ( 'measurementCount' ) ) ;
    public final void rule__StopCountCondition__StopTypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5620:1: ( ( ( 'measurementCount' ) ) )
            // InternalExpAuto.g:5621:2: ( ( 'measurementCount' ) )
            {
            // InternalExpAuto.g:5621:2: ( ( 'measurementCount' ) )
            // InternalExpAuto.g:5622:3: ( 'measurementCount' )
            {
             before(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0()); 
            // InternalExpAuto.g:5623:3: ( 'measurementCount' )
            // InternalExpAuto.g:5624:4: 'measurementCount'
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
    // InternalExpAuto.g:5635:1: rule__StopCountCondition__StopParamAssignment_4 : ( RULE_INT ) ;
    public final void rule__StopCountCondition__StopParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5639:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5640:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5640:2: ( RULE_INT )
            // InternalExpAuto.g:5641:3: RULE_INT
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
    // InternalExpAuto.g:5650:1: rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5654:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5655:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5655:2: ( RULE_INT )
            // InternalExpAuto.g:5656:3: RULE_INT
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
    // InternalExpAuto.g:5665:1: rule__ToolDefinition__ToolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ToolDefinition__ToolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5669:1: ( ( RULE_STRING ) )
            // InternalExpAuto.g:5670:2: ( RULE_STRING )
            {
            // InternalExpAuto.g:5670:2: ( RULE_STRING )
            // InternalExpAuto.g:5671:3: RULE_STRING
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
    // InternalExpAuto.g:5680:1: rule__ToolDefinition__ConfigParamsAssignment_4 : ( ruleConfigurationParams ) ;
    public final void rule__ToolDefinition__ConfigParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5684:1: ( ( ruleConfigurationParams ) )
            // InternalExpAuto.g:5685:2: ( ruleConfigurationParams )
            {
            // InternalExpAuto.g:5685:2: ( ruleConfigurationParams )
            // InternalExpAuto.g:5686:3: ruleConfigurationParams
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


    // $ANTLR start "rule__ConfigurationParams__ParamsAssignment"
    // InternalExpAuto.g:5695:1: rule__ConfigurationParams__ParamsAssignment : ( ( rule__ConfigurationParams__ParamsAlternatives_0 ) ) ;
    public final void rule__ConfigurationParams__ParamsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5699:1: ( ( ( rule__ConfigurationParams__ParamsAlternatives_0 ) ) )
            // InternalExpAuto.g:5700:2: ( ( rule__ConfigurationParams__ParamsAlternatives_0 ) )
            {
            // InternalExpAuto.g:5700:2: ( ( rule__ConfigurationParams__ParamsAlternatives_0 ) )
            // InternalExpAuto.g:5701:3: ( rule__ConfigurationParams__ParamsAlternatives_0 )
            {
             before(grammarAccess.getConfigurationParamsAccess().getParamsAlternatives_0()); 
            // InternalExpAuto.g:5702:3: ( rule__ConfigurationParams__ParamsAlternatives_0 )
            // InternalExpAuto.g:5702:4: rule__ConfigurationParams__ParamsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationParams__ParamsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationParamsAccess().getParamsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationParams__ParamsAssignment"


    // $ANTLR start "rule__SeedDefinition__SeedListsAssignment_3"
    // InternalExpAuto.g:5710:1: rule__SeedDefinition__SeedListsAssignment_3 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5714:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5715:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5715:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5716:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5725:1: rule__SeedDefinition__SeedListsAssignment_4_1 : ( ruleListOfSeeds ) ;
    public final void rule__SeedDefinition__SeedListsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5729:1: ( ( ruleListOfSeeds ) )
            // InternalExpAuto.g:5730:2: ( ruleListOfSeeds )
            {
            // InternalExpAuto.g:5730:2: ( ruleListOfSeeds )
            // InternalExpAuto.g:5731:3: ruleListOfSeeds
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
    // InternalExpAuto.g:5740:1: rule__ListOfSeeds__SeedsAssignment_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5744:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5745:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5745:2: ( RULE_INT )
            // InternalExpAuto.g:5746:3: RULE_INT
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
    // InternalExpAuto.g:5755:1: rule__ListOfSeeds__SeedsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ListOfSeeds__SeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5759:1: ( ( RULE_INT ) )
            // InternalExpAuto.g:5760:2: ( RULE_INT )
            {
            // InternalExpAuto.g:5760:2: ( RULE_INT )
            // InternalExpAuto.g:5761:3: RULE_INT
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
    // InternalExpAuto.g:5770:1: rule__ExperimentDatasource__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExperimentDatasource__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5774:1: ( ( ( RULE_ID ) ) )
            // InternalExpAuto.g:5775:2: ( ( RULE_ID ) )
            {
            // InternalExpAuto.g:5775:2: ( ( RULE_ID ) )
            // InternalExpAuto.g:5776:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalExpAuto.g:5777:3: ( RULE_ID )
            // InternalExpAuto.g:5778:4: RULE_ID
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


    // $ANTLR start "rule__KeyValue__KeyAssignment_0"
    // InternalExpAuto.g:5789:1: rule__KeyValue__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__KeyValue__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5793:1: ( ( RULE_ID ) )
            // InternalExpAuto.g:5794:2: ( RULE_ID )
            {
            // InternalExpAuto.g:5794:2: ( RULE_ID )
            // InternalExpAuto.g:5795:3: RULE_ID
            {
             before(grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__KeyAssignment_0"


    // $ANTLR start "rule__KeyValue__ValueAssignment_2"
    // InternalExpAuto.g:5804:1: rule__KeyValue__ValueAssignment_2 : ( ruleConfigValue ) ;
    public final void rule__KeyValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpAuto.g:5808:1: ( ( ruleConfigValue ) )
            // InternalExpAuto.g:5809:2: ( ruleConfigValue )
            {
            // InternalExpAuto.g:5809:2: ( ruleConfigValue )
            // InternalExpAuto.g:5810:3: ruleConfigValue
            {
             before(grammarAccess.getKeyValueAccess().getValueConfigValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigValue();

            state._fsp--;

             after(grammarAccess.getKeyValueAccess().getValueConfigValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__ValueAssignment_2"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\25\3\uffff\1\26\2\uffff\1\57\2\uffff";
    static final String dfa_3s = "\1\53\3\uffff\1\26\2\uffff\1\60\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\uffff\1\4\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\5\uffff\1\3\13\uffff\1\4\1\5\1\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "",
            "\1\10\1\11",
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
            return "915:1: rule__ExperimentSpecifications__SpecificationsAlternatives_0 : ( ( ruleDescription ) | ( ruleInitialModel ) | ( ruleVariation ) | ( ruleStopTimeCondition ) | ( ruleStopCountCondition ) | ( ruleNumberOfExperiments ) | ( ruleToolDefinition ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000E0020A00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000120000004042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000E0020A00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001F200080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000120000004040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});

}