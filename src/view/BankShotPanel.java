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

        // Draws the Shooter
        g.setColor(model.getShooter().getShooterColor());
        g.fillOval(model.getShooter().getPositionX() - model.getShooter().getSize() / 2, 
        		model.getShooter().getPositionY() - model.getShooter().getSize() / 2, 
                model.getShooter().getSize(), model.getShooter().getSize());
        // Draws the Shooters' gun
        g.drawLine(model.getShooter().getGunX1(), model.getShooter().getGunY1(),
        		model.getShooter().getGunX2(), model.getShooter().getGunY2());
        
        // Draws the Target         
        g.setColor(model.getTarget().getTargetColor());
        g.fillOval(model.getTarget().getTargetPositionX() - model.getTarget().getTargetSize() / 2,
        		model.getTarget().getTargetPositionY() - model.getTarget().getTargetSize() / 2,
                model.getTarget().getTargetSize(), model.getTarget().getTargetSize());
        // Draws the Targets' shield
        g.drawLine(model.getTarget().getTargetPositionX() - model.getTarget().getTargetSize(),
        		model.getTarget().getTargetPositionY() + model.getTarget().getTargetSize(),
        		model.getTarget().getTargetPositionX() + model.getTarget().getTargetSize(),
        		model.getTarget().getTargetPositionY() + model.getTarget().getTargetSize());
    } // end of paintComponent method
} // end of BankShotPanel class