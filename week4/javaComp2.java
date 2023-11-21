import javax.swing.*;
import java.awt.*;

class Main
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setForeground(Color.MAGENTA);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(20,33));
		frame.setSize(new Dimension(400,150));
		frame.setTitle("My Frame");
		// frame.setResizable(true); //false
		frame.setVisible(true);
	}
}