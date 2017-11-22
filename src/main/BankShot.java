package main;

import javax.swing.JFrame;
import javax.swing.Timer;
import model.BankShotModel;
import view.BankShotView;
import controller.BankShotRepaintController;

/**
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
        BankShotRepaintController repaintController = 
        		new BankShotRepaintController(model, view);

        // Repaint timer so that the window will update
        new Timer(25, repaintController).start();

        // Display
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500, 500);
        view.setVisible(true);
    } // end of main
} // end of BankShot class