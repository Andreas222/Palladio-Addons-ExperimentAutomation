package org.palladiosimulator.experimentautomation.dsl.application.workflow;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.AbstractConfigurationTab;
import org.eclipse.core.runtime.CoreException;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class ExperimentAutomationDslConfigurationTab extends AbstractConfigurationTab {

    public static final String SELECT_EXPERIMENTS_FILE = "Select ExpAuto DSL File **** TEST";
    public static final String EXPERIMENTS_FILE = "ExpAuto DSL File **** TEST";
    public static final String DEFAULT_EXPERIMENTS = "";
    public static final String EXPERIMENT_AUTOMATION = "Exp Auto **** TEST";
    public static final String[] EXPERIMENTS_EXTENSION = new String[] {
        "*.expauto"
    };

    private Text experimentsText;

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        super.initializeFrom(configuration);

        try {
            experimentsText.setText(configuration.getAttribute(EXPERIMENT_AUTOMATION, DEFAULT_EXPERIMENTS));
        } catch (CoreException e) {
            experimentsText.setText(DEFAULT_EXPERIMENTS);
        }

    }

    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        super.performApply(configuration);

        configuration.setAttribute(EXPERIMENT_AUTOMATION, experimentsText.getText());
    }

    @Override
    protected void createFurtherSections(Composite parent) {
        modifyListener = new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                setDirty(true);
                updateLaunchConfigurationDialog();
            }

        };

        experimentsText = new Text(parent, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(parent, modifyListener, EXPERIMENTS_FILE, EXPERIMENTS_EXTENSION,
                experimentsText, SELECT_EXPERIMENTS_FILE, getShell(), DEFAULT_EXPERIMENTS);

    }

    @Override
    public String getName() {
        return EXPERIMENT_AUTOMATION;
    }

}
