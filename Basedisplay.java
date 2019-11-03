import java.awt.*;
import javax.swing.*;

public class Basedisplay extends JFrame{
	public Basedisplay() {
		setTitle("Book shop_인문과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null); 
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}
	
}
