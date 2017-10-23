package view;

import java.awt.*;
import javax.swing.*;
import model.*;
import view.BankShotView;

/**
 * This along BankShotView implements the view of BankShot
 * @author Geoffrey Sessums
 */
public class BankShotPanel extends JPanel {
    // Instance Variables
    private BankShotModel model;
    private BankShotView view;
    /**
     * Initialize model and view
     * @param model the model of BankShot
     * @param view the view of BankShot
     */
    public BankShotPanel(BankShotModel model, BankShotView view) {
        this.model = model;
        this.view = view;
        
        // allow JPanel to listen to Keyboard
        this.setFocusable(true);
    }
    
    @Override
    /**
     *
     */
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
        //Draws Shooter
        g.setColor(model.getShooter().getShooterColor());
        g.fillOval(model.getShooter().getPositionX(), model.getShooter().getPositionY(), 
                model.getShooter().getSize(), model.getShooter().getSize());
        g.fillRect(model.getShooter().getPositionX() + 10, 
                model.getShooter().getPositionY() - (model.getShooter().getGunSize() - 1),
                2, model.getShooter().getGunSize());
    }
} // end of BankShotPanel class