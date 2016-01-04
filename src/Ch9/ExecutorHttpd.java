package Ch9;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static javafx.scene.input.KeyCode.T;

public class ExecutorHttpd
{
	ExecutorService executor = Executors.newFixedThreadPool(3);

	public void start(int port) throws IOException
	{
		final ServerSocket ss = new ServerSocket(port);
		while (executor.isShutdown())
			executor.submit(new TinyHttpdConnection(ss.accept()));
	}

	public void shutdown() throws InterruptedException
	{
		executor.shutdown();
		executor.awaitTermination(30, TimeUnit.SECONDS);
		executor.shutdownNow();
	}

	public static void main(String argv[]) throws Exception
	{
		new ExecutorHttpd().start(Integer.parseInt(argv[0]));
	}

	private static class TinyHttpdConnection<T> implements Callable<T>
	{
		public TinyHttpdConnection(Socket accept)
		{
			throw new UnsupportedClassVersionError("DUMMY CLASS");
		}

		@Override
		public T call() throws Exception
		{
			throw new UnsupportedOperationException("DUMMY CLASS");
		}
	}
}
