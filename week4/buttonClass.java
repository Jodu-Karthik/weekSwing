import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MessageListener implements ActionListener
{
	public void Action(ActionEvent event)
	{
		JOptionPane.showMessageDialog(null,"You Clicked the button!");
	}

	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300,100));
		frame.setTitle("My Frame");

		JButton btn1 = new JButton();
		btn1.setText("Button1");
		btn1.setBackground(Color.MAGENTA);
		frame.add(btn1);


		JButton btn2 = new JButton();
		btn2.setText("Button2");
		btn2.setBackground(Color.MAGENTA);
		frame.add(btn2);

		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
	}
}