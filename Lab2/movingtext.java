import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
public class movingtext extends Applet implements Runnable, ActionListener{
	TextField t1;
	int x=50;
	String s="";
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t1=new TextField();
	    add(t1);
	    t1.addActionListener(this);
		t1.setText("");
		

	}
public void paint(Graphics g)
{
	g.drawString(s, x+0, 50);
}

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
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	s=t1.getText();
	t.start();
}
}



		

