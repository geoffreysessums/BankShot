package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.BankShotModel;
import view.BankShotView;

/**
 * This class passes the decision to show the popup menu to the PongView. 
 * @author Geoffrey Sessums 
 */
public class BankShotPopupController extends MouseAdapter {
	private BankShotModel model;
	private BankShotView view;

	/**
	 * @param model the model of this Bank Shot game;
	 * @param view the view of this Bank Shot game;
	 */
	public BankShotPopupController(BankShotModel model, BankShotView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * Go back to the view object to do the pop up menu. 
	 */
    public void mousePressed(MouseEvent event) { 
       view.checkForTriggerEvent(event); 
    } 

    /**
     * Go back to the view object to do the pop up menu.
     */
    public void mouseReleased(MouseEvent event) { 
       view.checkForTriggerEvent(event); 
    } 
}
