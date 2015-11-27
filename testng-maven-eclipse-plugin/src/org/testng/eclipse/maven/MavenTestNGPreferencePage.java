package org.testng.eclipse.maven;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.internal.ui.preferences.PropertyAndPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class MavenTestNGPreferencePage extends PropertyAndPreferencePage {

  private static final String PREF_ID = "org.testng.eclipse.maven.preferencePage"; //$NON-NLS-1$
  private static final String PROP_ID = "org.testng.eclipse.maven.propertyPage"; //$NON-NLS-1$

  private MavenTestNGOptionsConfigurationBlock configBlock;

  @Override
  protected Control createPreferenceContent(Composite parent) {
    configBlock = new MavenTestNGOptionsConfigurationBlock(getProject());
    return configBlock.createContents(parent);
  }

  @Override
  public boolean performOk() {
    return configBlock.performOk();
  }

  @Override
  protected void performDefaults() {
    configBlock.performDefaults();
  }

  @Override
  protected boolean hasProjectSpecificOptions(IProject project) {
    return false;
  }

  @Override
  protected String getPreferencePageID() {
    return PREF_ID;
  }

  @Override
  protected String getPropertyPageID() {
    return PROP_ID;
  }

}
