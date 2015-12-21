package Ch2;

import java.awt.Graphics;
import javax.swing.JComponent;

public class HelloComponent extends JComponent
{
	private static final int xCoord = 125;
	private static final int yCoord = 95;
	private static String input;

	public HelloComponent(String input)
	{
		this.input = input;
	}

	public void paintComponent(Graphics g)
	{
		g.drawString(input, xCoord, yCoord);
	}
}
