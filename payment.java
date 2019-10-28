import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class payment extends JFrame{

	JButton pay = new JButton();
	JButton okay = new JButton("확인");
	
	public payment() {
		
		setTitle("PeachMelon 회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
		//배경 이미지
		ImageIcon display_pay = new ImageIcon("images/pay.png");  
		Image display_pay2= display_pay.getImage();
				 
		JPanel image = new JPanel() {//배경 넣기 
			public void paintComponent(Graphics g) {
				g.drawImage(display_pay2,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			}  
		};
		
		image.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(image);
		setContentPane(scrollPane);
		
		image.add(pay);
		image.add(okay);
		
		pay.setBounds(1233,520,210,210);
		okay.setBounds(1493,530,205,183);
		
		//버튼의 내용을 투명하게 해준다
		pay.setContentAreaFilled(false); pay.setFocusPainted(false);//버튼의 테두리 없앰
		pay.setBorderPainted(false);
		
		okay.setContentAreaFilled(false);
		
		pay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				//DB 내용 끌여들어와서 확인해줘야 함.
				JOptionPane.showMessageDialog(null, "총 금액은 49700원 입니다.\n 맞으신가요?","결제",JOptionPane.ERROR_MESSAGE);
			}
		}); 
		
		
		okay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				//DB 내용 끌여들어와서 확인해줘야 함.
				JOptionPane.showMessageDialog(null, "구매되었습니다,","결제완료",JOptionPane.ERROR_MESSAGE);
				new Sign_in();
			}
		}); 
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new payment();
		
	}

}
