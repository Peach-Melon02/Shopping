import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Devdisplay extends JFrame implements ActionListener{
	JButton devbtn, designbtn,basebtn;
	
	private JButton clang = new JButton();
	private JButton computer = new JButton();
	private JButton ita = new JButton();
	private JButton javalang = new JButton();
	private JButton website = new JButton();
	private JButton cg = new JButton();
	private JButton cplus = new JButton();
	private JButton database = new JButton();
	private JButton ds = new JButton();
	private JButton linux = new JButton();
	private JButton next = new JButton();
	
	
	public Devdisplay() {
		setTitle("Book shop_개발과목"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		devbtn = new JButton(" ");//개발과
		designbtn = new JButton(" ");//디자인과
		basebtn = new JButton(" ");//인문과 
		
		ImageIcon display = new ImageIcon("images/DEVimage1.jpg"); //배경 이미지
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
		clang.setBounds(137,342,220,266);
		clang.setContentAreaFilled(false); 
		image.add(computer);
		computer.setBounds(447,342,220,266);//310
		computer.setContentAreaFilled(false); 
		image.add(ita);
		ita.setBounds(757,342,220,266);
		ita.setContentAreaFilled(false); 
		image.add(javalang); 
		javalang.setBounds(1067,342,220,266);
		javalang.setContentAreaFilled(false); 
		image.add(website);
		website.setBounds(1377,342,220,266);
		website.setContentAreaFilled(false); 
		image.add(cg);
		cg.setBounds(137,648,220,266);
		cg.setContentAreaFilled(false); 
		image.add(cplus);
		cplus.setBounds(447,648,220,266);
		cplus.setContentAreaFilled(false); 
		image.add(database);
		database.setBounds(757,648,220,266);
		database.setContentAreaFilled(false); 
		image.add(ds);
		ds.setBounds(1067,648,220,266);
		ds.setContentAreaFilled(false); 
		image.add(linux);
		linux.setBounds(1377,648,220,266);
		linux.setContentAreaFilled(false); 
		
		image.add(next);
		next.setBounds(1670,870,86,50);
		next.setContentAreaFilled(false); 
		next.setFocusPainted(false);
		next.setBorderPainted(false);
		next.addActionListener(this);
		
		
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==devbtn) new Devdisplay();
		else if(e.getSource()==designbtn) new Designdisplay();
		else if(e.getSource()==basebtn) new Basedisplay();
		else if(e.getSource()==next) new Devdisplay2();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Devdisplay();
	}
}
