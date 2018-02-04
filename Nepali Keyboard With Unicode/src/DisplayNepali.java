import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

//import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

 @SuppressWarnings("serial")
public class DisplayNepali extends JPanel {

	static  JTextArea TextArea;
	Color c;
	JScrollPane scroll;
	static int Display_PANEL_LENGTH=1320;
	static int Display_PANEL_BREADTH=305;
	DisplayNepali(){
		//TextArea= new JTextArea(12,260);
		TextArea= new JTextArea(10,59);
		setLayout(new FlowLayout());
		setBounds(20,15,Display_PANEL_LENGTH,Display_PANEL_BREADTH);
		c=new Color(122, 122, 122);

		setBackground(c);
		TextArea.setEditable(true);
		setBorder(new BevelBorder(BevelBorder.RAISED,Color.black, Color.white,Color.black, Color.white));
		//TextArea.setFont(new Font("Preeti",Font.PLAIN,23));	
		TextArea.setFont(new Font(null,Font.PLAIN,23));	
		TextArea.addKeyListener(new TextAreaKeyListener());

  		scroll =new JScrollPane(TextArea);
		add(scroll);
		setVisible(true);
	}
	public static void setText(String nep_ch){
			TextArea.insert(nep_ch, TextArea.getCaretPosition());
	}
	public static JTextArea getTextArea(){
		return TextArea;
		
	}
/*	public static void main(String[] args) {		
		JFrame f= new JFrame();
		DisplayNepali keyboard= new DisplayNepali();
		f.setTitle("Nepali Keyboard");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(25,25);
		f.setLayout(null);
		f.setSize(600,600);  
	    f.setVisible(true); 
	    //f.setBackground(Color.WHITE);
	    f.add(keyboard);
	
	}  
*/
}
