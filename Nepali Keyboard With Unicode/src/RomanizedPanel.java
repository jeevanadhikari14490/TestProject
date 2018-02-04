import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class RomanizedPanel extends JPanel {
	Color c;
	private int KEYBOARD_LENGTH = 1320;
	private int KEYBOARD_BREADTH = 320;
	JLabel l;

	RomanizedPanel() {
		setLayout(new FlowLayout());
		setBounds(20, 370, KEYBOARD_LENGTH, KEYBOARD_BREADTH);
		c = new Color(119, 136, 153);
		setBackground(c);
		setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, Color.white, Color.black, Color.white));
		l = new JLabel("ka= \u0915");
		add(l);
		setVisible(true);

	}

}
