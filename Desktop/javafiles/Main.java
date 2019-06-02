package brickBreaker;
import javax.swing.JFrame;
public class Main 
{
	public static void main(String s[])
	{
		JFrame obj=new JFrame();
		obj.setBounds(10,10,700,600);		//set background
		obj.setTitle("BreakOut Ball");    //set title for the game 
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
