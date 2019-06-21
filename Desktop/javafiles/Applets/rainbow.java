import java.applet.*;
import java.awt.*;
public class rainbow extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(new Color(197, 239, 247));
		g.fillRect(0,0,500,500);
		g.setColor(new Color(75,0,130));
		g.fillArc(80,80,350,350,-180,-180);
		g.setColor(new Color(0,0,255));
		g.fillArc(90,90,330,330,-180,-180);
		g.setColor(new Color(0,255,0));
		g.fillArc(100,100,310,310,-180,-180);
		g.setColor(new Color(255,255,0));
		g.fillArc(110,110,290,290,-180,-180);
		g.setColor(new Color(255,127,0));
		g.fillArc(120,120,270,270,-180,-180);
		g.setColor(new Color(255,0,0));
		g.fillArc(130,130,250,250,-180,-180);
		g.setColor(new Color(197, 239, 247));
		g.fillArc(140,140,230,230,-180,-180);
		g.setColor(Color.YELLOW);
		g.fillOval(400,25,70,70);
		g.setColor(Color.BLACK);
		g.drawOval(400,25,70,70);
		g.setColor(new Color(25, 181, 254));
		g.fillOval(30,230,120,90);
		g.setColor(new Color(25, 181, 254));
		g.fillOval(90,200,70,60);
		g.setColor(new Color(25, 181, 254));
		g.fillOval(120,250,70,80);
		g.setColor(new Color(25, 181, 254));
		g.fillOval(140,220,90,90);
		g.setColor(new Color(63, 195, 128));
		g.fillRect(0,450,500,50);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(380,230,70,60);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(330,240,80,60);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(350,210,70,60);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(320,260,90,70);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(340,270,70,60);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(370,270,120,100);
		g.setColor(new Color(38, 166, 91));
		g.fillOval(300,290,100,80);	
		g.setColor(new Color(150, 40, 27));
		g.fillRect(380,340,30,120);	
		g.setColor(Color.BLACK);
		g.drawArc(50,50,40,20,10,110);
		g.drawArc(85,40,40,20,70,140);
		

		
	}
}