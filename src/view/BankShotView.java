package view;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;

import controller.BankShotKeyboardController;
import controller.BankShotMenuController;
import controller.BankShotMouseController;
import controller.BankShotPopupController;
import model.BankShotModel;

/**
 * This along with BankShotPanel implements the view of BankShot.
 * @author Geoffrey Sessums
 */
public class BankShotView extends JFrame {
	private BankShotModel model;
	private BankShotPanel bankShotPanel;
	//private JLabel statusBar;
	private JMenu bankShotMenu;
	private JPopupMenu popupMenu;

	/**
	 * Constructor create the components and places them in the window.
	 * @param model the model for this Bank Shot game.
	 */
	public BankShotView(BankShotModel model) {
	    super("BankShot");
	    this.model = model;

	    // Create the menu.
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    bankShotMenu = new JMenu("Menu");
	    bankShotMenu.setMnemonic('M');;
	    menuBar.add(bankShotMenu);
	    
	    JMenuItem pauseItem = new JMenuItem("Pause/Continue");
	    pauseItem.setMnemonic('P');
	    bankShotMenu.add(pauseItem);
	    
	    JMenuItem exitItem = new JMenuItem("Exit");
	    exitItem.setMnemonic('E');
	    bankShotMenu.add(exitItem);
	    
	    // Create the popup menu, need new JMenuItems
	    popupMenu = new JPopupMenu();
	    popupMenu.add(new JMenuItem("Pause/Continue"));
	    popupMenu.add(new JMenuItem("Exit"));

		/*
		 * CENTER: The panel where Face Off is played
		 */		
		bankShotPanel = new BankShotPanel(model, this);
		add(bankShotPanel, BorderLayout.CENTER);
		bankShotPanel.setBackground(Color.DARK_GRAY);
//		Dimension size = bankShotPanel.getSize();
//		model.setSize(size.width, size.height);
		
		// so panel can listen to keyboard
		bankShotPanel.requestFocus();
	}
    
	/**
	 * Register event handlers with the appropriate components.
	 * @param keyboardController a BankShot keyboard controller
	 */
	public void registerListeners(BankShotPopupController bankShotPopupController,
			BankShotMouseController bankShotMouseController,
			BankShotMenuController bankShotMenuController,
			BankShotKeyboardController keyboardController) {	
		bankShotPanel.addMouseListener(bankShotMouseController);
		bankShotPanel.addMouseMotionListener(bankShotMouseController);
		bankShotPanel.addKeyListener(keyboardController);
		this.addMouseListener(bankShotPopupController);
		
        Component[] components = bankShotMenu.getMenuComponents();
        for (Component component : components) {
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.addActionListener(bankShotMenuController);
            }
        }	
        
        components = popupMenu.getComponents();
        for (Component component : components) {
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.addActionListener(bankShotMenuController);
            }
        }
	}

    /**
     * Show popup if right click
     * 
     * @param event
     */
    public void checkForTriggerEvent(MouseEvent event) {
        if (event.isPopupTrigger()) {
            popupMenu.show(event.getComponent(), event.getX(), event.getY());
        }
    }
} // end of BankShotView class