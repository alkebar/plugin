package jtools.action.shortcuts.preferences;



import java.util.Arrays;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import jtools.action.shortcuts.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class ShortcutsPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ShortcutsPage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Shortcuts preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		
		
		
		
		addField(new ListEditor(PreferenceConstants.P_URL, "Enter a URL:", getFieldEditorParent()) {
			
			@Override
			protected String[] parseString(String stringList) {
		        String[] list = stringList.split("\n");
		        Arrays.sort(list);
				return list;
			}
			
			@Override
			protected String getNewInputObject() {
				InputDialog input=new InputDialog(getShell(), "URL", "Enter a URL", "http://", null);
		        input.open();
				return input.getValue();
			}
			
			@Override
			protected String createList(String[] items) {
				StringBuffer buf = new StringBuffer();
				for(int i=0;i<items.length;i++)
				{
					buf.append(items[i]).append("\n");
					
				}
				return buf.toString();

			}
			/*@Override
		      protected void createControl(Composite parent) {
		        super.createControl(parent);
		        getAddButton().setText("Inserir");
		        getRemoveButton().setText("Excluir");
		      }*/
			
		});
	}


	public void init(IWorkbench workbench) {
	}

}