import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Find_pwd extends JFrame{

	JLabel find_id, find_phone;
	JTextField id_pwd, findphone;
	JButton findpwdbtn;
	
	public Find_pwd() { 
		setTitle("PeachMelon 비밀번호 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
	
		find_id = new JLabel("아이디 : ");
		find_phone = new JLabel("전화번호 : ");
		findphone = new JTextField("");
		id_pwd = new JTextField("");
		findpwdbtn = new JButton("확인");
		
		
		//배경 이미지
		ImageIcon display_pwd = new ImageIcon("images/alldisplay.png");
		Image dispaly_pwd2 = display_pwd.getImage();
		
		JPanel image = new JPanel() {//배경 넣기
			public void paintComponent(Graphics g) {
				g.drawImage(dispaly_pwd2,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		image.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(image);
		setContentPane(scrollPane);
		
		image.add(find_id);
		image.add(id_pwd);
		image.add(find_phone);
		image.add(findphone);
		image.add(findpwdbtn);
		
		
		find_id.setBounds(600, 460, 200, 100);
		id_pwd.setBounds(750,485,300,40);
		find_phone.setBounds(565,535,200,100);
		findphone.setBounds(750,565,300,40);
		findpwdbtn.setBounds(1080,495,100,100);
		
		find_id.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35));
		id_pwd.setFont(new Font("맑은고딕",Font.ITALIC,20));
		find_phone.setFont(new Font("메이플스토리 OTF",Font.ITALIC,35));
		findphone.setFont(new Font("맑은고딕",Font.ITALIC,20));
		findpwdbtn.setFont(new Font("메이플스토리 OTF",Font.ITALIC,25));
		
		//버튼의 내용을 투명하게 해준다
		findpwdbtn.setContentAreaFilled(false);
		
		findpwdbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				//DB 내용 끌여들어와서 확인해줘야 함.
				JOptionPane.showMessageDialog(null, "jooyoung1948님의 \n비밀번호는 joo1948! 입니다.","check pwd",JOptionPane.ERROR_MESSAGE);
			}
		}); 
		
		setBounds(80,50,1800,1000); 
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Find_pwd();
	}

}
