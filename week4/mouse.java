import javax.swing.*;
import java.awt.*;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

// class MovementListener extends MouseAdapter {
    
//     public void mouseEntered(MouseEvent e) {
//         // Handle mouse entered event
//         System.out.println("Mouse entered the label.");
//     }

//     @Override
//     public void mouseExited(MouseEvent e) {
//         // Handle mouse exited event
//         System.out.println("Mouse exited the label.");
//     }

//     @Override
//     public void mouseMoved(MouseEvent e) {
//         // Handle mouse moved event
//         System.out.println("Mouse moved over the label.");
//     }
// }

class Main
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(new Dimension(200,100));
		frame.setTitle("My frame");

		JLabel label = new JLabel();
		label.setText("Move the cursor over me!");
		frame.add(label);

		MovementListener ml= new MovementListener();
		label.addMouseListener(ml);
		label.addMouseMotionListener(ml);

		frame.setVisible(true);
	}
}