import javax.swing.*;

class Main
{
	public static void main(String args[])
	{
		System.out.println("welcome To GUI");
		// JOptionPane.showMessageDialog(null, "Hello, world!");
		// JOptionPane.showConfirmDialog(null, "Is this basar");
		// JOptionPane.showInputDialog(null, "Enter your college  name?");
		// System.out.println(JOptionPane.YES_OPTION);

		// String name = JOptionPane.showInputDialog(null,"Your Name Please...");
		// int choice = JOptionPane.showConfirmDialog(null,"Do you Play Games?");
		// if(choice == JOptionPane.YES_OPTION) JOptionPane.showMessageDialog(null,"You are Great " + name);
		// else JOptionPane.showMessageDialog(null,"Games are Important");

		String ageText = JOptionPane.showInputDialog(null,"Enter Your age?");
		int age;
		try
		{
			age = Integer.parseInt(ageText);
			// age = Double.parseDouble(ageText);
			// boolean yes = Boolean.parseBoolean("true");
			// System.out.println(yes);
			JOptionPane.showMessageDialog(null,"Your age is " + age);
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Number Cannot Be Convereted");
			JOptionPane.showMessageDialog(null,"Enter a valid Integer");
		}
	}
}