package model;

/**
 * This is the model of the BankShot game.
 * It contains the basic properties of the game.
 * 
 * @author Geoffrey Sessums
 */
public class BankShotModel {
    //panel properties
    private int width;
    private int height;

    private ShooterModel shooter;
    private TargetModel target;
    
    private boolean pause;

    /**
     * Constructor
     */
    public BankShotModel() {
        width = 500;
        height = 500;
        shooter = new ShooterModel(this);
        target = new TargetModel(this);
        pause = false;
    }

    /**
     * Get the panel width
     * @return width of the panel
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Get the panel height
     * @return height of the panel
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Get the shooter
     * @return shooter
     */
    public ShooterModel getShooter() {
        return shooter;
    }
    
    /**
     * Get the target
     * @return target
     */
    public TargetModel getTarget() {
    	return target;
    }
    
    /**
     * Get pause status
     * @return pause the pause status of the game.
     */
    public boolean getPause() {
    	return pause;
    }
    
    /**
     * Pause the game
     * @param pause
     */
    public void setPause(boolean pause) {
    	this.pause = pause;
    }
} // end of BankShotModel class