package Ch2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2
{
	public static void main(String args[])
	{
		usage(args);
		JFrame frame = new JFrame("HelloJava2");
		frame.add(new HelloComponent2(args[0]));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	private static void usage(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: <message>");
			System.exit(1);
		}
	}
}
