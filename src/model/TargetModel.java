package model;

import java.awt.Color;
import java.awt.Color.*;
import java.util.Random;

public class TargetModel {
    // Target Values 
    private BankShotModel model;
    private final Random RANDOM = new Random();
    private Color targetColor;
    private final Color TARGET_HIT_COLOR = Color.BLACK;
    private final Color BACKGROUND_COLOR = Color.DARK_GRAY;
    private final int TARGET_SIZE = 20;
    private final int TARGET_POSITION_Y = 40;
    private final int TARGET_DELTA_X = 5;
    private int targetPositionX;
    private int targetDeltaX;
    private boolean targetMovement = true;
    private int targetHitTimer; // target hit recently if greater than 0
    private int count; 
    
    // Shield Values
    private final Color SHIELD_HIT_COLOR = Color.BLACK;
    private final Color SHIELD_COLOR = Color.CYAN;
    private boolean shieldActive = true;
    private int shieldHitTimer; // shield hit recently if greater than 0

    /**
     * Constructor
     * @param model
     */
    public TargetModel(BankShotModel model) {
    	this.model = model;
    	this.targetPositionX = model.getWidth() / 2;
    	this.count = 3;
        this.targetColor = Color.CYAN;
    }
    
    public void setTargetColor(Color targetColor) {
    	this.targetColor = targetColor;
    }
    
    public void setTargetPositionX(int targetPositionX) {
	    this.targetPositionX = targetPositionX;
    }    
    
    public int getTargetPositionX() {
        return targetPositionX;
    }
    
    public int getTargetPositionDeltaX() {
        return TARGET_DELTA_X;
    }

    public int getTargetPositionY() {
        return TARGET_POSITION_Y;
    } 
    
    public Color getTargetColor() {
        return targetColor;
    }
    
    public int getTargetSize() {
        return TARGET_SIZE;
    }    
    
    public void hitChangeColor() {
		if (targetColor == Color.CYAN && count == 3) {
			targetColor = Color.BLUE;
			count = 0;
		}
		else
			targetColor = Color.CYAN;
		count++;
		
	} 
    
	public int getTargetHitTimer() {
        return targetHitTimer;
    }
    
    // move the target horizontally by targetDeltaX
    // reset targetDeltaX with probability .06.
    // If changed, it is changed to 0, TARGET_DELTA_X, or -TARGET_DELTA_X with equal probability
    public void moveTarget() {
        if (!targetMovement)
          return;
        if (targetHitTimer > 0)
          return;
        targetPositionX += targetDeltaX;
        // Limit Target movement to playable area taking the shield into account
        if (model.getTarget().getTargetPositionX() + model.getTarget().getTargetSize() > model.getWidth())
          targetDeltaX = -TARGET_DELTA_X;
        if (model.getTarget().getTargetPositionX() - model.getTarget().getTargetSize() < 0)
          targetDeltaX = TARGET_DELTA_X;
        // Provides randomize movement for Target
        double randomMove = RANDOM.nextDouble();
        if (randomMove > .98)
          targetDeltaX = TARGET_DELTA_X;
        else if (randomMove > .96)
          targetDeltaX = -TARGET_DELTA_X;
        else if (randomMove > .94)
          targetDeltaX = 0;
    }    
} // end of TargetModel class