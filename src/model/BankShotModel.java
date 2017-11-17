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

    /**
     * Constructor
     */
    public BankShotModel() {
        width = 500;
        height = 500;
        shooter = new ShooterModel(this);
        target = new TargetModel(this);
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
} // end of BankShotModel class