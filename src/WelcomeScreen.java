import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeScreen extends JFrame
{
	public WelcomeScreen(GameMain main) 
	{
		this.setBounds(300,300,500,300);
		this.setLayout(null);
		
		JLabel label1 = new JLabel("Welcome to Mr. Ellis SuperQuest! Your mission is to explore the map,");
		label1.setBounds(10,10,500,100);
		this.add(label1);
		
		JLabel label2 = new JLabel("find and defeat the three bosses of Michigan, and conquer the state in order to spite");
		label2.setBounds(10,30,500,100);
		this.add(label2);
		
		JLabel label3 = new JLabel("The University of Michigan. Use the arrow keys to move, and beat Michigan!");
		label3.setBounds(10,50,500,100);
		this.add(label3);
		
		JLabel label4 = new JLabel("Exit this window to begin!");
		label4.setBounds(10,70,500,100);
		this.add(label4);
		
		
		this.setVisible(true);
		
	}
}
