package Ch2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable
{
	private String message;
	private int messageX = 125, messageY = 95;
	private JButton button;
	private int colorIndex;
	private static Color[] someColors =
	{
		Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN
	};
	private boolean blinkState;

	public HelloComponent4(String message)
	{
		this.message = message;
		button = new JButton("Change color");
		setLayout(new FlowLayout());
		add(button);
		button.addActionListener(this);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(blinkState ? getBackground() : currentColor());
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

	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				blinkState = !blinkState;
				repaint();
				Thread.sleep(300);
			}
		}
		catch (InterruptedException ie)
		{
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button)
			changeColor();
	}

	synchronized private Color currentColor()
	{
		return someColors[colorIndex];
	}

	private void changeColor()
	{
		if (++colorIndex == someColors.length)
			colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}
}
