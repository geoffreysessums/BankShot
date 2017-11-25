package main;

import javax.swing.JFrame;
import javax.swing.Timer;
import model.BankShotModel;
import view.BankShotView;
import controller.*;

/**
 * This implements a Bank Shot game to illustrate a more complex
 * GUI with multiple classes for the controller and view parts of 
 * the MVC pattern.
 * @author Geoffrey Sessums 
 */
public class  BankShot {
    /**
     * Create the objects for the model, view, and controller,
     * then lauch the application.
     */
    public static void main(String[] args) {
        // Create new model, view, and controller
        BankShotModel model = new BankShotModel();
        BankShotView view = new BankShotView(model);
        
        BankShotMenuController menuController =
        		new BankShotMenuController(model, view);
        BankShotPopupController popupController =
        		new BankShotPopupController(model, view);
        BankShotRepaintController repaintController = 
        		new BankShotRepaintController(model, view);
        BankShotMouseController mouseController =
        		new BankShotMouseController(model,view);
        BankShotKeyboardController keyboardController =
        		new BankShotKeyboardController(model, view);

        // Repaint timer so that the window will update
        new Timer(25, repaintController).start();
         
        view.registerListeners(popupController, mouseController,
        		menuController, keyboardController);
        // Display
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500, 500);
        view.setVisible(true);
    } // end of main
} // end of BankShot class