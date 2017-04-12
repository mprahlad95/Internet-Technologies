import java.awt.*;
import java.applet.*;
@SuppressWarnings("serial")
public class car extends Applet implements Runnable {
	int x,y;

	public void init()
	{
		Thread t=new Thread(this);
		x=30;
		y=75;
		t.start();
	}
	public void paint(Graphics g)
		{
		g.drawRect(x+50, y+100, 100, 50);
		g.drawOval(x+120, y+150, 25, 25);
		g.drawOval(x+60, y+150, 25, 25);
		g.fillOval(x+60, y+150, 25, 25);
		g.fillOval(x+120, y+150, 25, 25);
		g.setColor(Color.RED);
		g.fillRect(x+50, y+100, 100, 50);
		
		
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;)
		{
			
			while(x<1366)
			{
				x+=5;
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				repaint();
			}
		 while(x>0)
			{
			x-=5;
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			repaint();
			}
		 		
		}
		
	}
		}
		
		

