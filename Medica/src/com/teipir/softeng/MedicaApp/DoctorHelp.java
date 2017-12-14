package com.teipir.softeng.MedicaApp;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class DoctorHelp {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DoctorHelp window = new DoctorHelp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(11, 6, 410, 248);
		label.setText("\u0395\u03A3\u0391\u0399 \u039F \u0393\u0399\u0391\u03A4\u03A1\u039F\u03A3 \u039A\u0391\u0399 \u0398\u0395\u03A3 \u03A9\u039F\u0397\u0398\u0395\u0399\u0391");

	}
}
