package view;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
	}
} // end of BankShotView class