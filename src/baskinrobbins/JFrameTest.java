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

public class JFrameTest extends JFrame implements ActionListener, MouseListener, BaskinGame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BaskinRobbinsGame brGame = new BaskinRobbinsGame();

	static int playnumber = 0;

	static int buttonNumber = 5;
	static JButton buttonList[] = new JButton[buttonNumber];
	static String strList[] = { "게임 시작", "다른 숫자", "규칙 설명", "전적 확인", "게임 종료" };

	JFrameTest() {
		setTitle("BaskinRobbins 31 Game");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(buttonNumber, 1, 10, 10));

		
		  for(int i = 0; i<buttonNumber; i++) 
		  { buttonList[i] = new JButton(strList[i]);
		  buttonList[i].setFont(new Font("SansSerif",Font.BOLD,40));
		  
		  buttonList[i].addActionListener(this);
		 
		  c.add(buttonList[i]); }
		 

		/*
		 * j1 = new JButton("게임 시작"); j2 = new JButton("다른 숫자"); j3 = new
		 * JButton("규칙 설명"); j4 = new JButton("전적 확인"); j5 = new JButton("게임 종료");
		 * 
		 * j1.addActionListener(this); j2.addActionListener(this);
		 * j3.addActionListener(this); j4.addActionListener(this);
		 * j5.addActionListener(this);
		 * 
		 * j1.setFont(new Font("SansSerif",Font.BOLD,40)); j2.setFont(new
		 * Font("SansSerif",Font.BOLD,40)); j3.setFont(new
		 * Font("SansSerif",Font.BOLD,40)); j4.setFont(new
		 * Font("SansSerif",Font.BOLD,40)); j5.setFont(new
		 * Font("SansSerif",Font.BOLD,40));
		 * 
		 * c.add(j1); c.add(j2); c.add(j3); c.add(j4); c.add(j5);
		 */

		setVisible(true);

	}

	public static void main(String[] args) {
		new JFrameTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonList[0]) {
//			brGame.realgame();
			new windowrealgame();
		} else if (e.getSource() == buttonList[1]) {
//			JButton j2 = (JButton) e.getSource();
			if (buttonList[1].getText() == "다른 숫자") {
				buttonList[1].setText("죄송합니다. 구현 준비중입니다.");
			} else {
				buttonList[1].setText("다른 숫자");
			}
		} else if (e.getSource() == buttonList[2]) {
//			JButton j3 = (JButton) e.getSource();
			if (buttonList[2].getText() == "규칙 설명") {
				buttonList[2].setText("<html>상대방과 번호를 1부터 숫자를세어 31을 얘기하면 지는 게임입니다." 
						+ "<br>한턴 당 숫자는 최대 3번만 셀 수 있습니다."
						+ "<br>31이 아닌 다른 숫자로 게임을 하려면 다른 숫자를 클릭해 주세요.</html>");
				buttonList[2].setFont(new Font("SansSerif", Font.BOLD, 20));
			} else {
				buttonList[2].setText("규칙 설명");
				buttonList[2].setFont(new Font("SansSerif", Font.BOLD, 40));
			}
		} else if (e.getSource() == buttonList[3]) {
//			JButton j4 = (JButton) e.getSource();
			if (buttonList[3].getText() == "전적 확인") {
				buttonList[3].setText("죄송합니다. 구현 준비중입니다.");
			} else {
				buttonList[3].setText("전적 확인");
			}
		} else if (e.getSource() == buttonList[4]) {
			this.dispose();
		}
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
	public void baskingame() {
		// TODO Auto-generated method stub

	}

}
