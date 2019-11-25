import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;

import javax.swing.*;

class Find_id extends JFrame implements ActionListener {

	JLabel findphone;
	JTextField phonefield; 
	JButton phonebtn;
	 
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	private ResultSet view = null;
	Find_id(){ 
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","mirim2");//jdbc에 연결하귀~~~~~~~~
			//pstmt = conn.prepareStatement(sql); 
		}catch(ClassNotFoundException e) {
			handleError(e.getMessage());
		}catch (SQLException e) {
			handleError(e.getMessage());
		}	
		 
		 
		setTitle ("Book Shop 아이디 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
		  
	 
		JButton BookShop = new JButton(" ");//bookshop으로 가는 페이지 
		
		findphone = new JLabel("전화번호 : "); 
		phonefield = new JTextField("");
		phonebtn = new JButton("확인"); 
		
		//배경 이미지
		ImageIcon display_id = new ImageIcon("images/alldisplay.png");  
		Image display_id2= display_id.getImage();
		 
		JPanel image = new JPanel() {//배경 넣기 
			public void paintComponent(Graphics g) {
				g.drawImage(display_id2,0,0,getWidth(),getHeight(),this);
				setOpaque(false);
				super.paintComponent(g);
			} 
		};
		 
		image.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(image);
		setContentPane(scrollPane);
		
		image.add(findphone); 
		image.add(phonefield);
		image.add(phonebtn); 
		
		image.add(BookShop); 
		BookShop.setBounds(450,20,1000,200);
		BookShop.setContentAreaFilled(false);BookShop.setFocusPainted(false);//버튼의 테두리 없앰
		BookShop.setBorderPainted(false);

		BookShop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				new Home();
				
			} 
		});  
		 
		 
		findphone.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35));
		phonefield.setFont(new Font("맑은고딕", Font.ITALIC, 20));
		phonebtn.setFont(new Font("메이플스토리 OTF", Font.ITALIC,20));
		 
		findphone.setBounds(540,400,200,200);
		phonefield.setBounds(700, 470, 400, 50);
		phonebtn.setBounds(540,550,560,50);
		
		//버튼의 내용을 투명하게 해준다  
		phonebtn.setContentAreaFilled(false);
		
		phonebtn.addActionListener(this);  
		
		setBounds(80,20,1800,1000);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==phonebtn) {
			String str = phonefield.getText();
			FindshowID(str);
		}
	}

	private void FindshowID(String str) {
		// TODO Auto-generated method stub
		try {
			System.out.println("str :|"+ str+"|");
			String sql="select id from info where tel = ?";			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,str);
			view = pstmt.executeQuery();
            		
			if(view.next()) {
					//String findid 
					//phonefield.setText(view.getString("id"));
					String find = view.getString("id");
					  
					int result=JOptionPane.showConfirmDialog(null, "아이디는 "+find+"입니다." , "id 확인", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.OK_OPTION) {
						phonebtn.setText("예");
						
						phonefield.setText("");
					
					}else {
						phonefield.setText("");
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
