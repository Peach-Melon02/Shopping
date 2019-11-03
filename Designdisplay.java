import java.awt.*;
import javax.swing.*;

public class Designdisplay extends JFrame{
	public Designdisplay() {
		setTitle("Book shop_디자인과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null); 
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}
}
