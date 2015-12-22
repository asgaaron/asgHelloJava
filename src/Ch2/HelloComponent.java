package Ch2;

import java.awt.Graphics;
import javax.swing.JComponent;

public class HelloComponent extends JComponent
{
	private final int xCoord = 125;
	private final int yCoord = 95;
	private String input;

	public HelloComponent(String input)
	{
		this.input = input;
	}

	public void paintComponent(Graphics g)
	{
		g.drawString(input, xCoord, yCoord);
	}
}
