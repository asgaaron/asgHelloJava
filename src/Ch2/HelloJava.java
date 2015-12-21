package Ch2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJava
{
	private static final int WINDOWHEIGHT = 300;
	private static final int WINDOWWIDTH = 300;

	public static void main(String[] args)
	{
		path(args);
	}

	private static void path(String[] args)
	{
		if (args.length != 2)
		{
			System.out.println("Usage: <1 = console output/2 = GUI> \"<message>\"");
			System.exit(1);
		}
		switch (args[0])
		{
			case "1":
			{
				printConsole(args);
				break;
			}
			case "2":
			{
				printGUI(args);
				break;
			}
			default:
				break;
		}
	}

	private static void printGUI(String[] args)
	{
		JFrame frame = new JFrame(args[1]);
		JLabel label = new JLabel(args[1], JLabel.CENTER);
		frame.add(label);
		frame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
		frame.setVisible(true);
	}

	private static void printConsole(String[] args)
	{
		System.out.println(args[1]);
	}
}
