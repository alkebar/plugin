package jtools.action.shortcuts.preferences;



import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import jtools.action.shortcuts.Activator;
import jtools.action.shortcuts.preferences.editors.shortcutsListEditor;

public class ShortcutsPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ShortcutsPage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Shortcuts preferences");
	}

	//dialog do botão NEW na tela de preferencias
	public void createFieldEditors() {
		addField (new shortcutsListEditor(PreferenceConstants.P_URL, "Enter a URL:", getFieldEditorParent()));
	}


	public void init(IWorkbench workbench) {
	}

}