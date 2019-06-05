
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
	import javax.swing.JFrame;

	public class Ellis 
	{
		private Ellipse2D head;
		private Rectangle body;
		private Rectangle leftLeg;
		private Rectangle rightLeg;
		private Rectangle leftArm;
		private Rectangle rightArm;
		private int dy = 0;
		private int dx = 0;
		private int x, y, width, height;
		
		public Ellis(int x, int y)
		{
			this.x = x;
			this.y = y;
			width = 31;
			height = 56;
			head = new Ellipse2D.Double(11,0,10,10);
			body = new Rectangle(13,10,7,20);
			leftLeg = new Rectangle(10,30,5,20);
			rightLeg = new Rectangle(17,30,5,20);
			leftArm = new Rectangle(7,11,5,15);
			rightArm = new Rectangle(20,11,5,15);
			
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public int getWidth() {
			return width;
		}
		
		public int getHeight() {
			return height;
		}

		public BufferedImage getImage() 
		{
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
			Graphics2D g2 = (Graphics2D) image.getGraphics();
			g2.setColor(Color.BLUE);
			g2.fill(body);
			g2.fill(leftArm);
			g2.fill(rightArm);
			
			g2.setColor(Color.BLACK);
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			
			g2.setColor(Color.LIGHT_GRAY);
			g2.fill(head);
			
			g2.draw(head);
			g2.draw(body);
			g2.draw(leftLeg);
			g2.draw(leftArm);
			g2.draw(rightLeg);
			g2.draw(rightArm);
			
			return image;
		}
		
		public void update() 
		{
			this.x = x + dx;
			this.y = y + dy;
		}
		
		public int getDX() 
		{
			return dx;
		}
		public int getDY() 
		{
			return dy;
		}
		public void setDX(int x) 
		{
			dx = x;
		}
		public void setDY(int y)
		{
			dy = y;
		}
	}


