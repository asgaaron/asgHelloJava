package Ch9;

public class NamedConsumerUsage
{
	public static void main(String[] args)
	{
		Producer producer = new Producer();
		new Thread(producer).start();

		NamedConsumer consumer = new NamedConsumer("one", producer);
		new Thread(consumer).start();
		consumer = new NamedConsumer("two", producer);
		new Thread(consumer).start();
		consumer = new NamedConsumer("three", producer);
		new Thread(consumer).start();
	}
}
