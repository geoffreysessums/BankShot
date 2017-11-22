package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BankShotModel;
import view.BankShotView;

/**
 * BankShotRepaintController is the event handler for the timer, which is created in the 
 * main method of BankShot
 * @author Geoffrey Sessums
 */
public class BankShotRepaintController implements ActionListener {
	private BankShotView view;
	private BankShotModel model;
	
	/**
	 * Constructor
	 * @param model the model of BankShot game
	 * @param view the view of BankShot game
	 */
	public BankShotRepaintController(BankShotModel model, BankShotView view) {
		this.model = model;
        this.view = view;  
    }
	
    @Override
    /**
     * 
     */
    public void actionPerformed(ActionEvent event) {
        view.repaint();
        model.getTarget().moveTarget();
        // if the motion is jerky, then uncomment the following line.
        // view.revalidate();
        view.repaint();
    }
} // end of BankShotRepaintController class