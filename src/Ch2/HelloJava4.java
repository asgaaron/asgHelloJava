package Ch2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava4
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Hello, Java!");
		frame.add(new HelloComponent4("Hello, Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
