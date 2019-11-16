import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Devdisplay3 extends JFrame implements ActionListener{
	JButton devbtn, designbtn,basebtn;
	
	private JButton nmt = new JButton();
	private JButton ncp = new JButton();
	private JButton before2 = new JButton();

	public Devdisplay3() {
		setTitle("Book shop_개발과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		devbtn = new JButton(" ");//개발과
		designbtn = new JButton(" ");//디자인과
		basebtn = new JButton(" ");//인문과 
		
		ImageIcon display = new ImageIcon("images/devimage3.jpg"); //배경 이미지
		Image display_1= display.getImage();
		 
		JPanel image = new JPanel() {//배경 넣기 
			 
			public void paintComponent(Graphics g) {
				g.drawImage(display_1,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			} 
		};

		image.setLayout(null);
		JScrollPane scrollPane=new JScrollPane(image);
		setContentPane(scrollPane);
	
		image.add(devbtn);
		image.add(designbtn);
		image.add(basebtn);
		
		devbtn.setBounds(673,250,140,45);
	    designbtn.setBounds(890,250,140,45);
		basebtn.setBounds(1137,250,140,45);
		
		devbtn.setContentAreaFilled(false);
		designbtn.setContentAreaFilled(false);
		basebtn.setContentAreaFilled(false);
		 
		devbtn.setFocusPainted(false);
		designbtn.setFocusPainted(false);
		basebtn.setFocusPainted(false);
		
		devbtn.setBorderPainted(false);
		designbtn.setBorderPainted(false);
		basebtn.setBorderPainted(false);
		
		devbtn.addActionListener(this); 
		designbtn.addActionListener(this);
		basebtn.addActionListener(this);
		
		//여기서 부터 교과서 이미지 부착
		image.add(nmt); 
		nmt.setBounds(137,342,220,266);
		nmt.setContentAreaFilled(false); 
		image.add(ncp);
		ncp.setBounds(447,342,220,266);//310
		ncp.setContentAreaFilled(false); 
		
		image.add(before2);
		before2.setBounds(28,870,86,50);
		before2.setContentAreaFilled(false); 
		before2.setFocusPainted(false);
		before2.setBorderPainted(false);
		before2.addActionListener(this);
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==devbtn) new Devdisplay();
		else if(e.getSource()==designbtn) new Designdisplay();
		else if(e.getSource()==basebtn) new Basedisplay();
		else if(e.getSource()==before2) new Devdisplay2();
	}
}
