package jtools.action.shortcuts.handlers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import jtools.action.shortcuts.Activator;
import jtools.action.shortcuts.preferences.PreferenceConstants;
import jtools.action.shortcuts.wizards.SampleNewWizard;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ShortcutHandler extends AbstractHandler  {
	/**
	 * The constructor.
	 */
	public ShortcutHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		/*IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		String url = store.getString(PreferenceConstants.P_URL);/*

		/*try {
			PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(url));
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		/*String[] urls = StringUtils.split(url,"/n");
		
		List<String> lista = new ArrayList<>();
		
		for(int i=0; i<urls.length; i++ ) {
             lista.add(urls[i]);
        }*/

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		//MessageDialog.openInformation(window.getShell(), "Jtools Shortcuts", "Hello, Eclipse world");
		

		SampleNewWizard wiz = new SampleNewWizard();


	      // Create the wizard dialog
	      WizardDialog dialog = new WizardDialog(window.getShell(), wiz);
	      // Open the wizard dialog
	      dialog.create();
	      dialog.setBlockOnOpen(true);
	      dialog.open();
		
		
		/*ElementListSelectionDialog dialog = new ElementListSelectionDialog(window.getShell(), new LabelProvider());

		dialog.setTitle("Selecione o link");

		//dialog.setMessage("Select a String (* = any string, ? = any char):");

		dialog.setElements(new Object[] { "one", "two", "three" });
		
		dialog.setInitialElementSelections(lista);

		dialog.open();*/

		/*ListSelectionDialog dialog = new ListSelectionDialog(window.getShell(), lista, new BaseWorkbenchContentProvider(),
				new WorkbenchLabelProvider(), "Selecione o link:");
		dialog.setInitialSelections(lista.toArray());
		dialog.setTitle("Save Resources");
		dialog.open();*/

		// PopupDialog pop = new PopupDialog(window.getShell(), 1, true, true,
		// true, true, "titulo", "textoo");
		// pop.open();
		return null;
	}
}
