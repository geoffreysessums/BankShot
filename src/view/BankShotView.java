package view;

import java.awt.*;
import java.awt.event.KeyListener;

import javax.swing.*;

import controller.BankShotKeyboardController;
import model.BankShotModel;

/**
 * This along with BankShotPanel implements the view of BankShot.
 * @author Geoffrey Sessums
 */
public class BankShotView extends JFrame {
	private BankShotModel model;
	private BankShotPanel bankShotPanel;

	/**
	 * Constructor
	 * @param model
	 */
	public BankShotView(BankShotModel model) {
	    super("BankShot");
	    this.model = model;

		/*
		 * CENTER: The panel where Face Off is played
		 */		
		bankShotPanel = new BankShotPanel(model, this);
		add(bankShotPanel, BorderLayout.CENTER);
		bankShotPanel.setBackground(Color.DARK_GRAY);
//		Dimension size = bankShotPanel.getSize();
//		model.setSize(size.width, size.height);
		
		// so panel can listen to keboard
		bankShotPanel.requestFocus();
	}
    
	/**
	 * Register event handlers with the appropriate components.
	 * @param keyboardController a BankShot keyboard controller
	 */
	public void registerListeners(BankShotKeyboardController keyboardController) {	
		bankShotPanel.addKeyListener(keyboardController);
	}
} // end of BankShotView class