package Ch9;

public class ConsumerProducerUsage
{
	public static void main(String[] args)
	{
		Producer producer = new Producer();
		new Thread(producer).start();
		Consumer consumer = new Consumer(producer);
		new Thread(consumer).start();
	}
}
