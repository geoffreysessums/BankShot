package controller;

import java.awt.event.*;
import model.BankShotModel;
import view.BankShotView;

/**
 * This is the mouse event handler for the PongPanel.
 * @author Geoffrey Sessums 
 */
public class BankShotMouseController implements MouseListener, MouseMotionListener {
    private BankShotModel model;
    private BankShotView view;
    
    /**
     * Constructor
     * @param model the model of this Bank Shot game.
     * @param view the view of this Bank Shot game.
     */
    public BankShotMouseController(BankShotModel model, BankShotView view) {
    	this.model = model;
    	this.view = view;
    }
	/*
	 * MouseListener event handlers
	 */ 

	/**
	 * Go back to view for possible popup menu.
	 */
	public void mouseClicked(MouseEvent event) {
		view.checkForTriggerEvent(event);
	} // end method mouseClicked

	/**
	 * Go back to view for possible popup menu.
	 */
	public void mousePressed(MouseEvent event) {
		view.checkForTriggerEvent(event);
	} // end method mousePressed

	/**
	 * nothing to do for mouse release
	 */
	public void mouseReleased(MouseEvent event) {

	} // end method mouseReleased

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * clear status bar
	 */
	public void mouseEntered(MouseEvent event) {
		view.setStatus("");
	} // end method mouseEntered

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
