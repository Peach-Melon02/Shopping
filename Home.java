import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame {
	
	public Home() {
		setTitle("Book shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame f = new JFrame("Book Shop");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("bookicon.jpg");
		f.setIconImage(img);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());  
		 
		JTextField id=new JTextField(""); //ID입력란
		JTextField pw=new JTextField(""); //PW입력란
		
		JButton findID=new JButton("ID찾기"); //아이디 찾기
		JButton findPW=new JButton("PW 찾기"); //비밀번호 찾기
		JButton Login=new JButton("로그인"); //로그인 
		JButton AddInfor=new JButton("회원가입"); //회원가입
		JButton devbtn = new JButton(" ");//개발과
		JButton designbtn = new JButton(" ");//디자인과
		JButton basebtn = new JButton(" ");//인문과 

	
		   
		ImageIcon display = new ImageIcon("images/alldisplay.png"); //배경 이미지
		Image display_1= display.getImage();
		 
		JPanel image = new JPanel() {//배경 넣기 
			
			public void paintComponent(Graphics g) {
				g.drawImage(display_1,0,0,1781,950,this);
				setOpaque(false);
				super.paintComponent(g);
			} 
		};
		image.setLayout(null);
		
		JScrollPane scrollPane=new JScrollPane(image);
		setContentPane(scrollPane);
		
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
		image.add(devbtn);
		image.add(designbtn);
		image.add(basebtn);
		
		findID.setBounds(1360,329,120,45);  // x, y, 가로, 세로
		findPW.setBounds(1527,329,120,45);
		Login.setBounds(1360,390,120,45);
		AddInfor.setBounds(1527,390,120,45);
		devbtn.setBounds(673,250,140,45);
	    designbtn.setBounds(890,250,140,45);
		basebtn.setBounds(1137,250,140,45);
		
		findID.setFont(new Font("배달의민족 도현",Font.CENTER_BASELINE, 20));
		findPW.setFont(new Font("배달의민족 도현", Font.CENTER_BASELINE, 20));
		Login.setFont(new Font("배달의민족 도현", Font.CENTER_BASELINE, 20)); 
		AddInfor.setFont(new Font("배달의민족 도현", Font.CENTER_BASELINE, 20));
		//버튼을 투명하게 바꿔준다
		findID.setContentAreaFilled(false); 
		findPW.setContentAreaFilled(false);
		Login.setContentAreaFilled(false);
		AddInfor.setContentAreaFilled(false);
		devbtn.setContentAreaFilled(false);
		designbtn.setContentAreaFilled(false);
		basebtn.setContentAreaFilled(false);
		 
		//버튼선택후에 생기는 표시 없앰
		findID.setFocusPainted(false);
		findPW.setFocusPainted(false);
		Login.setFocusPainted(false);
		AddInfor.setFocusPainted(false);
		devbtn.setFocusPainted(false);
		designbtn.setFocusPainted(false);
		basebtn.setFocusPainted(false);
		
		//버튼의 테두리를 투명하게 해준다
		devbtn.setBorderPainted(false);
		designbtn.setBorderPainted(false);
		basebtn.setBorderPainted(false);
		
		//창 이동
		findID.addActionListener(new Findid());
		findPW.addActionListener(new Findpw());
		Login.addActionListener(new LOgin());
		AddInfor.addActionListener(new Inforadd());
		devbtn.addActionListener(new Dev());
		designbtn.addActionListener(new Design());
		basebtn.addActionListener(new Base());
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
} 

class Findid implements ActionListener{
		@Override 
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Find_id();
	}
}
class Findpw implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {			
			// TODO Auto-generated method stub
				new Find_pwd();
	}
}
class LOgin implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Sign_in();
					 
	}
}
class Inforadd implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
					
		new SignUp();
	}
}
class Dev implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Devdisplay();
		}
}
class Design implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Designdisplay();
	}
}
class Base implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Basedisplay();
		}
}