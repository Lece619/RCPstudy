package org.o7planning.tutorial.rcp.cmd;

import java.util.Map;

import com.study.rcputorial01.dialog.AboutDialog;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.commands.AbstractHandler;
import org.eclipse.ui.handlers.HandlerUtil;

public class AboutCommand extends AbstractHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		AboutDialog dialog = new AboutDialog(shell, SWT.DIALOG_TRIM
				| SWT.APPLICATION_MODAL);
		dialog.open();
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(Map parameterValuesByName) throws org.eclipse.ui.commands.ExecutionException {

		return null;
	}

}
