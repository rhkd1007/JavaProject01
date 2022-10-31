package baskinrobbins;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest extends JFrame implements ActionListener,MouseListener {
	
	static int buttonNumber = 5;
	static JButton buttonList[] = new JButton[buttonNumber];
	static String strList[]= {"게임 시작","다른 숫자","규칙 설명","전적 확인","게임 종료"};
	
	JFrameTest()
	{
		setTitle("BaskinRobbins 31 Game");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		c.setLayout(new GridLayout(buttonNumber,1,10,10));
		
		for(int i = 0; i<buttonNumber; i++) {
			buttonList[i] = new JButton(strList[i]);
			buttonList[i].setFont(new Font("SansSerif",Font.BOLD,40));
			c.add(buttonList[i]);
		}
	
		setVisible(true);

	}

	public static void main(String[] args) {
		new JFrameTest();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
