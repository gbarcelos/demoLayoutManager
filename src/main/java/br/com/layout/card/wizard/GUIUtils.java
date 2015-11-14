package br.com.layout.card.wizard;

import javax.swing.SwingUtilities;

public class GUIUtils {

	public static void invokeLater(Runnable runnable) {
		if (!SwingUtilities.isEventDispatchThread()) {
			SwingUtilities.invokeLater(runnable);
		} else {
			runnable.run();
		}
	}
}
