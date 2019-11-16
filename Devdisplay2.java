import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Devdisplay2 extends JFrame implements ActionListener{
	JButton devbtn, designbtn,basebtn;
	
	private JButton python = new JButton();
	private JButton JSP = new JButton();
	private JButton php = new JButton();
	private JButton Spring = new JButton();
	private JButton ASP = new JButton();
	private JButton JQuery = new JButton();
	private JButton servlet = new JButton();
	private JButton jscp = new JButton();//자바 스크립트
	private JButton 정보보호 = new JButton();
	private JButton wsm = new JButton();
	private JButton next2 = new JButton();
	private JButton before = new JButton();
	
	public Devdisplay2() {
		setTitle("Book shop_개발과목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		
		devbtn = new JButton(" ");//개발과
		designbtn = new JButton(" ");//디자인과
		basebtn = new JButton(" ");//인문과 
		
		ImageIcon display = new ImageIcon("images/devimage2.jpg"); //배경 이미지
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
		image.add(python); 
		python.setBounds(137,342,220,266);
		python.setContentAreaFilled(false); 
		image.add(JSP);
		JSP.setBounds(447,342,220,266);//310
		JSP.setContentAreaFilled(false); 
		image.add(php);
		php.setBounds(757,342,220,266);
		php.setContentAreaFilled(false); 
		image.add(Spring); 
		Spring.setBounds(1067,342,220,266);
		Spring.setContentAreaFilled(false); 
		image.add(ASP);
		ASP.setBounds(1377,342,220,266);
		ASP.setContentAreaFilled(false); 
		image.add(JQuery);
		JQuery.setBounds(137,648,220,266);
		JQuery.setContentAreaFilled(false); 
		image.add(jscp);
		jscp.setBounds(447,648,220,266);
		jscp.setContentAreaFilled(false); 
		image.add(servlet);
		servlet.setBounds(757,648,220,266);
		servlet.setContentAreaFilled(false); 
		image.add(정보보호);
		정보보호.setBounds(1067,648,220,266);
		정보보호.setContentAreaFilled(false); 
		image.add(wsm);
		wsm.setBounds(1377,648,220,266);
		wsm.setContentAreaFilled(false); 
		
		image.add(next2);
		next2.setBounds(1670,870,86,50);
		next2.setContentAreaFilled(false); 
		next2.setFocusPainted(false);
		next2.setBorderPainted(false);
		next2.addActionListener(this);
		
		image.add(before);
		before.setBounds(28,870,86,50);
		before.setContentAreaFilled(false); 
		before.setFocusPainted(false);
		before.setBorderPainted(false);
		before.addActionListener(this);
		
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==devbtn) new Devdisplay();
		else if(e.getSource()==designbtn) new Designdisplay();
		else if(e.getSource()==basebtn) new Basedisplay();
		else if(e.getSource()==next2) new Devdisplay3();
		else if(e.getSource()==before) new Devdisplay();
	} 
}
