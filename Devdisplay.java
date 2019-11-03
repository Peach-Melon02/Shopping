import java.awt.*;
import javax.swing.*;

public class Devdisplay extends JFrame{
	public Devdisplay() {
		setTitle("Book shop_개발과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null); 
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}
}
