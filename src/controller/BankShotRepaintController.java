package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BankShotView;

/**
 * BankShotRepaintController is the event handler for the timer, which is created in the 
 * main method of BankShot
 * @author Geoffrey Sessums
 */
public class BankShotRepaintController implements ActionListener {
	private BankShotView view;
	
	/**
	 * Constructor
	 * @param model the model of BankShot game
	 * @param view the view of BankShot game
	 */
	public BankShotRepaintController(BankShotView view) {
        this.view = view;  
    }
	
    @Override
    /**
     * 
     */
    public void actionPerformed(ActionEvent event) {
        view.repaint();
    }
} // end of BankShotRepaintController class