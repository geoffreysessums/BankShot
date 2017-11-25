package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import model.BankShotModel;
import view.BankShotView;

/**
 * This reacts to selections from the menu, and also implements the keyboard
 * shortcuts.
 * @author Geoffrey Sessums
 *
 */
public class BankShotMenuController implements ActionListener {
    private BankShotModel model;
    private BankShotView view;
    
    /**
     * Constructor
     * @param model the model of this Bank Shot game
     * @param view the view of this Bank Shot game
     */
    public BankShotMenuController (BankShotModel model, BankShotView view) {
    	this.model = model;
    	this.view = view;
    }

	/**
	 * Handle the menu item that was selected.
	 */
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("Exit")) {
			view.dispose();
			System.exit(0);
		} else if (command.equals("Pause/Continue")) {
			model.setPause(! model.getPause());
		}
	}
	
	/**
	 * Handle the keyboard shortcut.
	 */
	public void keyTyped(KeyEvent event) {
		char KeyChar = event.getKeyChar();
		if (KeyChar == 'e' || KeyChar == 'E') {
			view.dispose();
			System.exit(0);
		} else if (KeyChar == 'p' || KeyChar == 'P') {
			model.setPause(! model.getPause());
		}
	}
}
