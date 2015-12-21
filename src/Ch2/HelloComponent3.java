package Ch2;

import java.awt.PopupMenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener
{
	private String message;
	private int messageX = 125, messageY = 95;
	private JButton button;
	private int colorIndex;
	private static Color[] someColors =
	{
		Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN
	};

	public HelloComponent3(String message)
	{
		this.message = message;
		button = new JButton("Change color");
		setLayout(new FlowLayout());
		add(button);
		button.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button)
			changeColor();
	}

	synchronized private void changeColor()
	{
		if (++colorIndex == someColors.length)
			colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}

	synchronized private Color currentColor()
	{
		return someColors[colorIndex];
	}
}
