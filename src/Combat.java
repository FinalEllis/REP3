import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combat extends JFrame
{
	public Combat(GameMain main)
	{
	this.setBounds(300,300,500,300);
	this.setLayout(null);
	
	int winCount = 0;
	
	JLabel label = new JLabel();
	label.setLocation(new Point(100,100));
	label.setSize(400,50);
	
	JButton button1 = new JButton("Rock");
	button1.setLocation(new Point(10,200));
	button1.setSize(100,30);
	button1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(Math.random() < 0.333333)
					{
						label.setText("They threw scissors, you win - Exit combat to continue your quest!");
						winCount++;
					}
					else if(Math.random() > 0.666666)
					{
						label.setText("They threw rock too, try again");
					}
					else
					{
						label.setText("They threw paper, you lose - Try again!");
					}
					
				}
				});
	
	 
	JButton button2 = new JButton("Paper");
	button2.setLocation(new Point(180,200));
	button2.setSize(100,30);
	button2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(Math.random() < 0.333333)
					{
						label.setText("They threw rock too, you win - Exit combat to continue your quest!");
						winCount++;
					}  
					else if(Math.random() > 0.666666)
					{
						label.setText("They threw paper, try again");
					}
					else
					{
						label.setText("They threw scissors, you lose - Try again!");
					}
				}
			});
	
	JButton button3 = new JButton("Scissors");
	button3.setLocation(new Point(350,200));
	button3.setSize(100,30);
	button3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(Math.random() < 0.333333)
					{
						label.setText("They threw paper. You win - Exit combat to continue your quest!");
					}
					else if(Math.random() > 0.666666)
					{
						label.setText("They threw scissors too, try again");
					}
					else
					{
						label.setText("They threw rock, you lose - Try Again!");
					}
				}
			});
	
	this.add(button1);
	this.add(button2);
	this.add(button3);
	this.add(label);
	
	this.setVisible(true);

	}
	
	
}