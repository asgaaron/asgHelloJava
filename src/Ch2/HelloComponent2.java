package Ch2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

class HelloComponent2 extends JComponent implements MouseMotionListener
{
	String message;
	private static int messageX = 125, messageY = 95;

	public HelloComponent2(String message)
	{
		this.message = message;
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g)
	{
		g.drawString(message, messageX, messageY);
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
	}
}
