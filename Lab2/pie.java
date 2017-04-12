
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class pie extends JFrame {
   @SuppressWarnings("unused")
private Font font; 

   @SuppressWarnings("deprecation")
public pie ()
   {
      super( "Sales: January" );

      setSize( 600, 400 );
      setLocation( 70, 70 ) ;
      show();
   }

   public void paint( Graphics g )
   {

      font = new Font("Sanserif", Font.BOLD, 14);
      // start at 0 and sweep 360 degrees

      g.setColor( Color.black );

      g.fillArc( 110, 80, 300, 300, 0, 36 );
     g.drawString("Beef: 10%", 420, 80);

      g.setColor( Color.red );
      g.fillArc( 110, 80, 300, 300, 36, 120 );
      g.drawString("Pork: 33%", 420, 100);

      g.setColor( Color.blue );
      g.fillArc( 110, 80, 300, 300, 156, 80 );
     g.drawString("Chicken: 22%", 420, 120);

      g.setColor( Color.green );
      g.fillArc( 110, 80, 300, 300, 236, 80 );
     g.drawString("Tuna: 22%", 420, 140);

      g.setColor( Color.orange );
      g.fillArc( 110, 80, 300, 300, 316, 44 );
      g.drawString("Turkey: 12%", 420, 160);

      g.setColor( Color.black );
      g.drawArc( 110, 80, 300, 300, 0, 360 );
         }
   

   public static void main( String args[] )
   {
      pie app = new pie ();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}