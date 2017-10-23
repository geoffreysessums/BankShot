package model;

import java.awt.Color;

/**
 * This is the model of the shooter. It contains all the characteristics and behavior of the shooter
 * which the player controls.
 * @author Geoffrey Sessums
 */
public class ShooterModel {
    private Color shooterColor;
    private static final int SHOOTER_SIZE = 20; // Shooter diameter
    private static final int GUN_SIZE = 10; // Gun length
    private int shooterPositionX;
    private int shooterPositionY;
    private int gunPositionX;
    private int gunPositionY;
	private BankShotModel model;

	/**
	 * Constructor
	 * @param model the basic properties of the game.
	 */
	public ShooterModel(BankShotModel model) {
    	this.model = model;
        this.shooterPositionX = (model.getWidth() - SHOOTER_SIZE) / 2;
        this.shooterPositionY = model.getHeight() - (5 * SHOOTER_SIZE);
        this.shooterColor = Color.RED;      
    }

	/**
	 * 
	 * @param shooterPositionX
	 */
	public void setShooterPositionX(int shooterPositionX) {
		this.shooterPositionX = shooterPositionX;
	}
	
	/**
	 * 
	 * @param shooterPositionY
	 */
	public void setShooterPositionY(int shooterPositionY){
		this.shooterPositionY = shooterPositionY;
	}
	/**
	 * Get the shooter color.
	 * @return shooterColor (Red)
	 */
	public Color getShooterColor() {
		return shooterColor;
	}

	/**
	 * Get the shooter's horizontal position.
	 * @return shooterPositionX the shooter's horizontal position
	 */
	public int getPositionX() {
		return shooterPositionX;
	}

	/**
	 * Get the shooter's vetical position.
	 * @return shooterPositionY the shooter's vetical position
	 */
	public int getPositionY() {
		return shooterPositionY;
	}

	/**
	 * Get the shooter's size.
	 * @return SHOOTER_SIZE the shooter's size
	 */
	public int getSize() {
		return SHOOTER_SIZE;
	}
	
	/**
	 * Get the gun size.
	 * @return GUN_SIZE the size of the gun
	 */
	public int getGunSize() {
		return GUN_SIZE;
	}
} // end of ShooterModel class