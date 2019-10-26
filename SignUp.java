import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUp extends JFrame{
	
	private JLabel idL, passwdL, number;
	private JTextField Idfield, Passwdfield,numberfield,mailfield;
	private JButton checkbtn,createbtn;
	private ImageIcon checkIcon, okayIcon;
	
	SignUp(){  
		 
		
		setTitle("PeachMelon 회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
		 

		idL= new JLabel("          ID : ");
		passwdL = new JLabel("      Pwd : ");
		number=new JLabel("    전화번호 :");
		
		//배경 이미지
		ImageIcon display_sign = new ImageIcon("images/alldisplay.png");  
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
		
		//추가
		image.add(number);
		image.add(idL);
		image.add(passwdL);

		
		//아이디 비밀번호 위치 & 가로세로 조정
		idL.setBounds(529,400,200,200); 
		passwdL.setBounds(529,470,200,200);
		number.setBounds(500,530,200,200);
		//아이디 비밀번호 폰트 & 크기
		idL.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35)); 
		passwdL.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35)); 
		number.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35));
		
		Idfield = new JTextField("");
		Passwdfield = new JTextField("");
		numberfield=new JTextField("");
		//추가
		image.add(Idfield); 
		image.add(Passwdfield);
		image.add(numberfield); 
		//아이디 비밀번호 적기의 위칭 & 가로세로 조정
		Idfield.setBounds(690, 470, 400, 50);
		Passwdfield.setBounds(690, 540, 400,50);
		numberfield.setBounds(690,610,400,50);
		//써지는 폰트 정하기 
		Idfield.setFont(new Font("맑은고딕", Font.ITALIC, 20)); 
		Passwdfield.setFont(new Font("맑은고딕", Font.ITALIC, 20)); 
		numberfield.setFont(new Font("맑은고딕",Font.ITALIC,20));
		//중복체크 이미지 아이콘
		checkIcon = new ImageIcon("images/check1.png");
		checkbtn = new JButton("id 중복체크",checkIcon);
		//중복체크버튼 위치 & 가로 세로 조정
		checkbtn.setBounds(1100,450,190,80);
		//중복체크버튼 폰트 정하기
		checkbtn.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 18)); 
		//추가
		image.add(checkbtn);
		 
		//중복체크 팝업 다이얼로그
		checkbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				//DB 내용 끌여들어와서 확인해줘야 함.
				JOptionPane.showMessageDialog(null, "아이디가 이미 있습니다.","id 중복체크",JOptionPane.ERROR_MESSAGE);
			}
		});  
		  
		//오케이 이미지 아이콘
		okayIcon = new ImageIcon("images/okay.png");
 		createbtn=new JButton("생성",okayIcon);
		//생성버튼 위치 & 가로세로 조정
		createbtn.setBounds(1090,630,150,70);
		//생성버튼 위치 & 가로세로 조정
		createbtn.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 15));
		//추가
		image.add(createbtn);
		 
		//버튼의 외곽선을 없애준다. 
		checkbtn.setBorderPainted(false);
		createbtn.setBorderPainted(false); 
		//버튼의 선택되었을 때 생기는 테두리 없앤다.
		checkbtn.setFocusPainted(false);
		createbtn.setFocusPainted(false);
		//버튼의 내용을 투명하게 해준다
		checkbtn.setContentAreaFilled(false);
		createbtn.setContentAreaFilled(false);
	
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignUp();
	} 

	
}

