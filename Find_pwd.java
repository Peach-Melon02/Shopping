import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Find_pwd extends JFrame implements ActionListener{

	JLabel find_id, find_phone;
	JTextField id_pwd, findphone;
	JButton findpwdbtn; 
	
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	private ResultSet view = null;
	 
	public Find_pwd() { 
		setTitle("PeachMelon 비밀번호 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
		
		try { 
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","mirim2");//jdbc에 연결하귀~~~~~~~~
			//pstmt = conn.prepareStatement(sql); 
		}catch(ClassNotFoundException e) {
			handleError(e.getMessage());
		}catch (SQLException e) {
			handleError(e.getMessage());
		}	
	 
		find_id = new JLabel("아이디 : ");
		find_phone = new JLabel("전화번호 : ");
		findphone = new JTextField("");
		id_pwd = new JTextField("");
		findpwdbtn = new JButton("확인");
		
		JButton BookShop = new JButton(" ");//bookshop으로 가는 페이지 
		
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
		
		image.add(BookShop);
		BookShop.setBounds(450,20,1000,200);
		BookShop.setContentAreaFilled(false);BookShop.setFocusPainted(false);//버튼의 테두리 없앰
		BookShop.setBorderPainted(false);

		BookShop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				new Home();
				
			}
		});  
		
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
		findpwdbtn.addActionListener(this);
		
		setBounds(80,20,1800,1000); 
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource()==findpwdbtn) {
			String i_d = findphone.getText();
			String p_w_d = id_pwd.getText();
			FindPwd(i_d, p_w_d);
		}
		//DB 내용 끌여들어와서 확인해줘야 함.
		
	} 
	private void FindPwd(String i_d, String p_w_d) {
		try {
			System.out.println("id :|"+i_d +"|");
			System.out.println("pwd : |"+p_w_d+"|");
			String sql = "select pw from info where tel =? and id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, i_d);
			pstmt.setString(2, p_w_d);
			view = pstmt.executeQuery();
			
			if(view.next()) {
				
				String find_pw=view.getString("pw");
				
				int result = JOptionPane.showConfirmDialog(null,"비밀번호는 "+find_pw+"입니다." , "pw 확인", JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.OK_OPTION) {
					findpwdbtn.setText("예");
					findphone.setText(""); 
					id_pwd.setText("");
				}else {
					findphone.setText("");
					id_pwd.setText("");
				}
			}
		}catch (SQLException e){
			handleError(e.getMessage());
		} 
	}

	private void handleError(String message) {
		// TODO Auto-generated method stub
		System.out.println("문제 : "+ message);
		System.exit(1);
	}
	
}
