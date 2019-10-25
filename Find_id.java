import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Find_id extends JFrame{

	JLabel findphone;
	JTextField phonefield;
	JButton phonebtn;
	Find_id(){ 
		setTitle ("PeachMelon 아이디 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); 
		c.setLayout(null);//배치관리자를  null로 고정시킴
		  
		findphone = new JLabel("전화번호 : ");
		phonefield = new JTextField("");
		phonebtn = new JButton("확인");
		
		c.add(findphone); 
		c.add(phonefield);
		c.add(phonebtn); 
		 
		findphone.setFont(new Font("메이플스토리 OTF", Font.ITALIC, 35));
		phonefield.setFont(new Font("맑은고딕", Font.ITALIC, 20));
		phonebtn.setFont(new Font("메이플스토리 OTF", Font.ITALIC,20));
		 
		findphone.setBounds(540,400,200,200);
		phonefield.setBounds(700, 470, 400, 50);
		phonebtn.setBounds(540,550,560,50);
		
		//버튼의 내용을 투명하게 해준다
		phonebtn.setContentAreaFilled(false);
		
		phonebtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) { 
				//DB 내용 끌여들어와서 확인해줘야 함.
				JOptionPane.showMessageDialog(null, "아이디는 jooyoung1948 입니다","check id",JOptionPane.ERROR_MESSAGE);
			}
		}); 
		
		setBounds(80,50,1800,1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Find_id();
	}	
}
