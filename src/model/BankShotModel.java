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

    /**
     * Constructor
     */
    public BankShotModel() {
        width = 475;
        height = 500;
        shooter = new ShooterModel(this);
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
     * @return shooer
     */
    public ShooterModel getShooter() {
        return shooter;
    }
} // end of BankShotModel class