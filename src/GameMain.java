
	import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


	public class GameMain extends JFrame implements ActionListener
	{
		private Ellis ellis = new Ellis(10,10);
		private boolean isCombat = false;
		private Image background;
		
		
		public GameMain()
		{ 
			try 
			{
				background = ImageIO.read(new File("mich3.jpg"));
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel label = new JLabel(new ImageIcon(background));
			
			this.setTitle("Mr. Ellis Super Quest: The Fall of Michigan");
			this.setLayout(null);
			this.setBounds(100,25,700,700);
		
			
			Timer t = new Timer(100,(ActionListener) this);
			t.start();
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			WelcomeScreen welc = new WelcomeScreen(this);
			this.addKeyListener(new KeyListener() 
			{
				public void keyPressed(KeyEvent p)
				{
					if(p.getKeyCode() == KeyEvent.VK_UP) 
						ellis.setDY(-5);
					
					if(p.getKeyCode() == KeyEvent.VK_DOWN) 
						ellis.setDY(+5);
					
					if(p.getKeyCode() == KeyEvent.VK_LEFT) 
						ellis.setDX(-5);
					
					if(p.getKeyCode() == KeyEvent.VK_RIGHT) 
						ellis.setDX(+5);
					
					
				}

				public void keyReleased(KeyEvent e) 
				{
					if(e.getKeyCode() == KeyEvent.VK_UP) 
					{
						ellis.setDY(0);
					}
					
					else if(e.getKeyCode() == KeyEvent.VK_DOWN) 
					{
						ellis.setDY(0);
					}
					
					else if(e.getKeyCode() == KeyEvent.VK_LEFT) 
					{
						ellis.setDX(0);
					}
					
					else if(e.getKeyCode() == KeyEvent.VK_RIGHT) 
					{
						ellis.setDX(0);
					}
					
				}

				public void keyTyped(KeyEvent e)
				{
					
				}
			});
			
		}
		
		public void actionPerformed(ActionEvent arg0) 
		{
			if(ellis.getX() + ellis.getDX() >= 0 && ellis.getX() + ellis.getDX() <= getWidth() - ellis.getWidth() &&  ellis.getY() + ellis.getDY() >= 0 && ellis.getY() + ellis.getDY() <= getHeight() - ellis.getHeight())
				{
					ellis.update();
					repaint();
				}
		
			// frame triggers 
			
			if(ellis.getX() >= 0 && ellis.getX() <= 100 && ellis.getY() == 100 && isCombat == false) 
			{
				ellis.setDX(0);
				ellis.setDY(0);
				Combat eminem = new Combat(this);
				JLabel picture = null;
				try 
				{
					picture = new JLabel(new ImageIcon(ImageIO.read(new File("eminem1.jpg"))));
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				picture.setBounds(130,30,200,200);
				eminem.add(picture);
				eminem.setTitle("Battle with: EMINEM!");
				isCombat = true;
				
			}
			
			else if(ellis.getX() >= 200 && ellis.getX() <= 400 && ellis.getY() == 300 && isCombat == false) 
			{
				ellis.setDX(0);
				ellis.setDY(0);
				Combat stevie = new Combat(this);
				JLabel picture = null;
				try 
				{
					picture = new JLabel(new ImageIcon(ImageIO.read(new File("stevie.jpg"))));
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				picture.setBounds(130,30,200,200);
				stevie.add(picture);
				stevie.setTitle("Battle with: STEVIE WONDER!");
				isCombat = true;
				
			}
			
			else if(ellis.getX() >= 500 && ellis.getX() <= 700 && ellis.getY() == 500 && isCombat == false) 
			{
				ellis.setDX(0);
				ellis.setDY(0);
				Combat henry = new Combat(this);
				JLabel picture = null;
				try 
				{
					picture = new JLabel(new ImageIcon(ImageIO.read(new File("henry1.jpg"))));
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				picture.setBounds(130,30,200,200);
				henry.add(picture);
				henry.setTitle("Battle with: HENRY FORD!");
				isCombat = true;
				
				
			}
			
		}
		
		
		{
		
		}
		
		public void paint(Graphics g)
		{
			BufferedImage image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
			Graphics g2 = image.getGraphics();
			g2.setColor(Color.white);
			g2.fillRect(0, 0, image.getWidth(), image.getHeight());
			g2.drawImage(background, 0,0,null);
			g2.drawImage(ellis.getImage(), ellis.getX(), ellis.getY(), null);
			g.drawImage(image, 0, 0, null);
		}
		
		public static void main(String[] args)
		{
			new GameMain();
		}


	}
	 
