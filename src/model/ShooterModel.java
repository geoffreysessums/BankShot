package model;

import java.awt.Color;

/**
 * This is the model of the shooter. It contains all the characteristics and behavior of the shooter
 * which the player controls.
 * @author Geoffrey Sessums
 */
public class ShooterModel {
    private Color shooterColor;
	private BankShotModel model;
    private static final int SHOOTER_SIZE = 20; // Shooter diameter
    private static final int GUN_SIZE = 10; // Gun length
    private final int SHOOTER_DELTA_X = 10;
    private int shooterDeltaX;    
    private double gunAngle;
    private int shooterPositionX;
    private int shooterPositionY;
    private int gunx1;
    private int guny1;
    private int gunx2;
    private int guny2;

	/**
	 * Constructor
	 * @param model the basic properties of the game.
	 */
	public ShooterModel(BankShotModel model) {
    	this.model = model;
        this.shooterPositionX = model.getWidth() / 2;
        this.shooterPositionY = model.getHeight() - 3 * SHOOTER_SIZE;
        this.shooterColor = Color.RED;      
        this.gunAngle = 0;
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

	/**
	 * Return the side opposite the given angle of a right triangle with given hypotenuse
	 * @param angleDegrees
	 * @param hypotenuse
	 * @return the side adjacent to the given angle of a right triangle with the given hypotenuse
	 */
	public static double triangleX(double angleDegrees, double hypotenuse) {
	    double angleRadians = angleDegrees * Math.PI/180;
	    return hypotenuse * Math.sin(angleRadians);
	}
	  
	/**
	 * Return the side adjacent to the given angle of a right triangle with the given hypotenuse
	 * @param angleDegrees
	 * @param hypotenuse
	 * @return the side adjacent to the given angle of a right triangle with the given hypotenuse 
	 */
	public static double triangleY(double angleDegrees, double hypotenuse) {
	    double angleRadians = angleDegrees * Math.PI/180;
	    return hypotenuse * Math.cos(angleRadians);
	}	

	/**
	 * Get x1 value for shooter gun
	 * @return x1 gun value
	 */
	public int getGunX1() {
		return shooterPositionX + (int)Math.round(triangleX(gunAngle,SHOOTER_SIZE/2));
	}

	/**
	 * Get y value for shooter gun
	 * @return y1 gun value
	 */
	public int getGunY1() {
		return shooterPositionY - (int)Math.round(triangleY(gunAngle,SHOOTER_SIZE/2));
	}

	/**
	 * Get x2value for shooter gun
	 * @return x2gun value
	 */
	public int getGunX2() {
		return shooterPositionX + (int)Math.round(triangleX(gunAngle,SHOOTER_SIZE/2 + GUN_SIZE));
	}

	/**
	 * Get y2 value for shooter gun
	 * @return y2gun value
	 */
	public int getGunY2() {
		return shooterPositionY - (int)Math.round(triangleY(gunAngle,SHOOTER_SIZE/2 + GUN_SIZE));
	}

	/**
	 * Move the shooter right.
	 */
    public void moveShooterRight() {
    	shooterDeltaX = SHOOTER_DELTA_X;
    	if (shooterPositionX + SHOOTER_SIZE/2 >= model.getWidth())
    		shooterPositionX = model.getWidth() - SHOOTER_SIZE/2;
    	else
			shooterPositionX += shooterDeltaX;
    }

    /**
     * Move the shooter left.
     */
    public void moveShooterLeft() {
    	shooterDeltaX = -SHOOTER_DELTA_X;
    	if (shooterPositionX - SHOOTER_SIZE/2 <= 0)
    		shooterPositionX = SHOOTER_SIZE/2;
    	else
          shooterPositionX += shooterDeltaX;
    }
} // end of ShooterModel class