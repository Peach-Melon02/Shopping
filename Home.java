import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame {
	public Home() {
		setTitle("Book shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setLayout(null);
		 
		JTextField id=new JTextField(""); //ID입력란
		JTextField pw=new JTextField(""); //PW입력란
		
		JButton findID=new JButton(" "); //아이디 찾기
		JButton findPW=new JButton(" "); //비밀번호 찾기
		JButton Login=new JButton(" "); //로그인
		JButton AddInfor=new JButton(" "); //회원가입
		
		ImageIcon display = new ImageIcon("images/bookshopmain.png"); //배경 이미지
		Image display_1= display.getImage();
		 
		JPanel image = new JPanel() {//배경 넣기 
			public void paintComponent(Graphics g) {
				g.drawImage(display_1,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			} 
		};
		
		//TextField
		image.add(id);
		image.add(pw);
		
		id.setBounds(1127,327,208,52);  // x, y, 가로, 세로
		pw.setBounds(1127,390,208,52);
		
		//Button
		image.add(findID);
		image.add(findPW);
		image.add(Login);
		image.add(AddInfor);

		findID.setBounds(1340,329,140,45);  // x, y, 가로, 세로
		findPW.setBounds(1510,329,140,45);
		Login.setBounds(1340,390,140,45);
		AddInfor.setBounds(1510,390,140,45);
		
		
		//버튼을 투명하게 바꿔준다
		findID.setContentAreaFilled(false); 
		findPW.setContentAreaFilled(false);
		Login.setContentAreaFilled(false);
		AddInfor.setContentAreaFilled(false);
		 
		//버튼선택후에 생기는 표시 없앰
		findID.setFocusPainted(false);
		findPW.setFocusPainted(false);
		Login.setFocusPainted(false);
		AddInfor.setFocusPainted(false);
		
		image.setLayout(null);
		
		JScrollPane scrollPane=new JScrollPane(image);
		setContentPane(scrollPane);
		
		
		//다른 창으로 넘어가기_아이디 찾기 눌렀을 때
		findID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Find_id();
			}
			
		});
		//다른 창으로 넘어가기_비밀번호 찾기 눌렀을 때
		findPW.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Find_pwd();
			}
			
		});
		//다른창으로 넘어가기_로그인 눌렀을 때
		Login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//new Sign_in();
				
			}
		});
		//다른창으로 넘어가기_회원가입 눌렀을 때
		AddInfor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new SignUp();
			}
		});
		
		
		
		
		setBounds(80,50,1800,1000);
		setVisible(true);
		
	}
	public static void main(String [] args) {
		new Home();
	}
}