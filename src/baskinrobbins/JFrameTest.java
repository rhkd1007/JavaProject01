package baskinrobbins;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	JFrameTest()
	{
		setTitle("첫번째 프레임");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JButton j = new JButton("확인");
		JButton j2 = new JButton("취소");

		c.add(j);
		c.add(j2);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new JFrameTest();
	}
}
