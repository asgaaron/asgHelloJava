package Ch9;

import java.awt.Graphics;
import java.util.Date;

public class Clock extends UpdateApplet
{
	public void paint(Graphics g)
	{
		g.drawString(new Date().toString(), 10, 25);
	}
}
