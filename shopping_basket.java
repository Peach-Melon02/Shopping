import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class shopping_basket extends JFrame{
 
	JCheckBox ck1 = new JCheckBox("");
	JCheckBox ck2 = new JCheckBox("");
	JCheckBox ck3 = new JCheckBox("");
	JButton delete = new JButton("");
	JButton buy = new JButton("");
	JButton okay=new JButton("확인");
	
	shopping_basket(){
		setTitle("장바구니");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴 
		
		
		 
		//배경 이미지
		ImageIcon display_sign = new ImageIcon("images/shopping_basket.png");  
		Image display_sign2= display_sign.getImage();
				 
		JPanel image = new JPanel() {//배경 넣기 
			public void paintComponent(Graphics g) {
				g.drawImage(display_sign2,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			} 
		};
		
		image.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(image);
		setContentPane(scrollPane);
		
		
		image.add(ck1);
		image.add(ck2);
		image.add(ck3);
		
		image.add(delete);
		image.add(buy);
		image.add(okay);
		
		ck1.setBounds(1220,510,50,50);
		ck2.setBounds(1220,625,50,50);
		ck3.setBounds(1220,748,50,50);
		 
		delete.setBounds(1440,498,170,170);
		buy.setBounds(1440,697,170,170);
		okay.setBounds(1640,623,100,100);
		
		//버튼의 내용을 투명하게 해준다
		delete.setContentAreaFilled(false); delete.setFocusPainted(false);//버튼의 테두리 없앰
		delete.setBorderPainted(false);

		buy.setContentAreaFilled(false); buy.setFocusPainted(false);//버튼의 테두리 없앰
		buy.setBorderPainted(false);

		okay.setContentAreaFilled(false);
		okay.setFont(new Font("맑은 고딕", Font.ITALIC, 25));
		
		okay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new payment();
			}
			
		});
		
		setBounds(80,50,1800,1000);
		setVisible(true);
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new shopping_basket();
	}
}
