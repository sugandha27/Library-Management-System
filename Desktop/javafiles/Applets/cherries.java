import java.applet.Applet;
import java.awt.*;

public class cherries extends Applet
{
    public void init()
    {
        // sets the size and color of the applet graphic window
        setSize(400, 300);
        setBackground(Color.pink);
    }
	
    public void paint(Graphics g)
    {
        // Draw head
        g.setColor(Color.white);
        g.fillOval(200, 50, 100, 100);
        g.fillOval(196, 95, 6, 15);
        g.fillOval(298, 95, 6, 15);
        g.setColor(Color.black);
        g.drawOval(244, 101, 12, 13);
        g.setColor(Color.white);
        g.fillRect(244, 101, 12, 5);
	
        // Draw eyes
        g.setColor(Color.black);
        g.drawOval(227, 93, 15, 10);
        g.drawOval(258, 93, 15, 10);
        g.setColor(Color.blue);
        g.fillOval(231, 95, 6, 6);
        g.fillOval(262, 95, 6, 6);

        // Draw hair
        int hair = 200;
        g.setColor(new Color(60, 60, 0));
        g.fillRoundRect(hair, 72, 4, 22, 2, 2);
        g.fillRoundRect(hair += 6, 65, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 60, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 56, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 52, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 49, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 47, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 46, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 45, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 46, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 47, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 49, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 52, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 56, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 60, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 65, 4, 20, 2, 2);
        g.fillRoundRect(hair += 6, 72, 4, 22, 2, 2);
		
        // Draw table
        g.setColor(Color.green);
        g.fillRect(0, 114, 400, 186);
        g.setColor(Color.black);
        g.drawLine(0, 114, 400, 114);
			
        // Draw bowl
        g.setColor(Color.orange);
        g.fillOval(50, 150, 150, 100);
        g.setColor(Color.green);
        g.fillRect(50, 150, 150, 40);
        g.setColor(Color.black);
        g.fillOval(50, 175, 150, 30);		
		
        // Draw cherries
        g.setColor(Color.red);
        g.fillOval(52, 170, 20, 20);
        g.fillOval(70, 176, 20, 20);
        g.fillOval(92, 174, 20, 20);
        g.fillOval(110, 180, 20, 20);
        g.fillOval(130, 177, 20, 20);
        g.fillOval(152, 170, 20, 20);
        g.fillOval(180, 172, 20, 20);
        g.fillOval(70, 160, 20, 20);
        g.fillOval(90, 160, 20, 20);
        g.fillOval(110, 160, 20, 20);
        g.fillOval(130, 160, 20, 20);
        g.fillOval(150, 160, 20, 20);
        g.fillOval(170, 160, 20, 20);
        g.fillOval(225, 220, 20, 20);
        g.setColor(new Color(60, 60, 0));
        g.drawLine(62, 170, 65, 150);
        g.drawLine(80, 176, 79, 156);
        g.drawLine(102, 174, 100, 154);
        g.drawLine(120, 180, 124, 160);
        g.drawLine(140, 177, 140, 157);
        g.drawLine(162, 170, 160, 150);
        g.drawLine(190, 172, 193, 152);
        g.drawLine(80, 160, 79, 140);
        g.drawLine(100, 160, 105, 140);
        g.drawLine(120, 160, 122, 140);
        g.drawLine(140, 160, 136, 140);
        g.drawLine(160, 160, 160, 140);
        g.drawLine(180, 160, 181, 140);
        g.drawLine(235, 220, 236, 200);
    }
}