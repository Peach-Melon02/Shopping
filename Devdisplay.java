import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Devdisplay extends JFrame implements ActionListener{
	JButton devbtn, designbtn,basebtn;
	private ImageIcon [] images= {
			new ImageIcon("images/c.png"),
			new ImageIcon("images/ita.png"),
			new ImageIcon("images/computer.png"),
			new ImageIcon("images/java.png"),
			new ImageIcon("images/ds.png")};
	
	private JButton clang = new JButton(new ImageIcon("images/c.png"));
	private JButton cplus = new JButton(new ImageIcon("images/cplus.png"));
	private JButton computer = new JButton(new ImageIcon("images/computer.png"));
	private JButton ita = new JButton(new ImageIcon("images/ita.png"));
	private JButton javalang = new JButton(new ImageIcon("images/java.png"));
	private JButton ds = new JButton(new ImageIcon("images/ds.png"));
		
	public Devdisplay() {
		setTitle("Book shop_개발과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		//c.setLayout(null); 
		
		devbtn = new JButton(" ");//개발과
		designbtn = new JButton(" ");//디자인과
		basebtn = new JButton(" ");//인문과 
		
		ImageIcon display = new ImageIcon("images/alldisplay.png"); //배경 이미지
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
		
		
		
		
		 
		//여기서부터 이미지 클릭 문제임
		image.add(clang);
		clang.setBounds(130,370,170,233);
		image.add(ita);
		ita.setBounds(330,370,170,233);
		image.add(javalang);
		javalang.setBounds(530,370,170,233);
		image.add(computer);
		computer.setBounds(730,370,170,233);
		
		
		
		
		
		
		 
		 
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==devbtn) new Devdisplay();
		else if(e.getSource()==designbtn) new Designdisplay();
		else if(e.getSource()==basebtn) new Basedisplay();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Devdisplay();
	}
	
}
