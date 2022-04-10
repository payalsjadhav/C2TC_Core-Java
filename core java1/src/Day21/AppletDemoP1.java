package Day21;

import java.awt.*;
import java.applet.*;

public class AppletDemoP1 extends Applet
{
	 String msg="";
     public void init()
    {
         msg="Hello Everyone";
     }
  
     public void start()
     {
         msg=msg+",Welcome Home";
     }
  
     public void paint(Graphics g)
     {
         g.drawString(msg,20,20);
     }

}
