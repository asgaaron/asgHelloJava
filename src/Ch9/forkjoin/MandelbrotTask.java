package Ch9.forkjoin;

import java.awt.image.BufferedImage;
import java.util.concurrent.RecursiveAction;

class MandelbrotTask extends RecursiveAction
{
	private static double size = 3.0, offsetX = -.7, thresholdSq = 100;
	private static int maxIterations = 30;
	private BufferedImage image;
	private int xStart, xEnd, yStart, yEnd;
	private static int taskSplitThreshold = 1024;

	public MandelbrotTask(BufferedImage image, int xStart, int xEnd, int yStart, int yEnd)
	{
		this.image = image;
		this.xStart = xStart;

	}

	@Override
	protected void compute()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
