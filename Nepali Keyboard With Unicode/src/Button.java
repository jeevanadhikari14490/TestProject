import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class Button {
	
	public static JButton choose_keyboard;
	public static RomanizedPanel roman_panel;
	public static NepaliKeyboard keyboard;
	static boolean ROMANIZED = false;
	private static KeyTypeController keyController;
	
	
	Button() {
		choose_keyboard = new JButton("Romanized keyboard");
		roman_panel = new RomanizedPanel();
		keyboard = new NepaliKeyboard();
		//mainFrame=new MainFrame();
		choose_keyboard.setBounds(30, 330, 200, 30);
		choose_keyboard
				.setBorder(new BevelBorder(BevelBorder.RAISED, Color.white, Color.black, Color.white, Color.black));
		choose_keyboard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ROMANIZED) {
					ROMANIZED = false;
					choose_keyboard.setText("Romanized keyboard");
					roman_panel.setVisible(false);
					keyboard.setVisible(true);
					MainFrame.getMainFrame().setFocusTraversalKeysEnabled(true);
				} else {
					ROMANIZED = true;
					choose_keyboard.setText("Nepali Keyboard");
					MainFrame.getMainFrame().setFocusTraversalKeysEnabled(true);
					// MainFrame.mainFrame.display.nepaliText.setEditable(false);
					// MainFrame.mainFrame.display.nepaliText.addeyListener(new
					// KeyTypeController());
					// MainFrame.mainFrame.addKeyListener(new
					// KeyTypeController());
					//keyController= new KeyTypeController();
					//keyController.start();
					keyboard.setVisible(false);
					roman_panel.setVisible(true);
					

				}

			}

		});

	}
	public static boolean isROMANIZED() {
		return ROMANIZED;
	}

	public static void setROMANIZED(boolean rOMANIZED) {
		ROMANIZED = rOMANIZED;
	}
	public static KeyTypeController getKeyController() {
		return keyController;
	}
	public static void setKeyController(KeyTypeController keyController) {
		Button.keyController = keyController;
	}

}