package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import model.BankShotModel;
import view.BankShotView;

/**
 * This reacts to input from the keyboard 
 * @author Geoffrey Sessums 
 */
public class BankShotKeyboardController extends KeyAdapter {
    private BankShotModel model;
    private BankShotView view;
    
    /**
     * Constructor
     * @param model the model of the Bank Shot game
     * @param view the view of the Bank Shot game
     */
    public BankShotKeyboardController(BankShotModel model, BankShotView view) {
        this.model = model;
        this.view = view;
    }
    
    /**
     * Handles movement commands from keyboard input and implements keyboard
     * shortcuts
     */
    public void keyTyped(KeyEvent event) {
    	char keyChar = event.getKeyChar();
    	int keyCode = event.getKeyCode();
    	// exits game
    	if (keyChar  == 'e' || keyChar == 'E') {
    		view.dispose();
    		System.exit(0);
    	// moves shooter left
    	} else if (keyCode == KeyEvent.VK_LEFT || keyChar  == 'a') {
    		model.getShooter().moveShooterLeft();
    		view.revalidate();
    		view.repaint();
        // moves shooter right
    	} else if (keyCode == KeyEvent.VK_RIGHT || keyChar  == 'f') {
    		model.getShooter().moveShooterRight();
    		view.revalidate();
    		view.repaint();
    	// moves gun left
    	} else if (keyChar == 's') {
    		model.getShooter().moveGunLeft();
    		view.revalidate();
    		view.repaint();
    	// moves gun right 
    	} else if (keyChar == 'd') {
    		model.getShooter().moveGunRight();
    		view.revalidate();
    		view.repaint();	
    	}
    }
} // end of BankShotKeyboardController class