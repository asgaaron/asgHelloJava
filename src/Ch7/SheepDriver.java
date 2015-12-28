package Ch7;

public class SheepDriver
{
	public static void main(String args[])
	{
		Sheep one = new Sheep();
		Sheep anotherOne = one.clone();

		if (one.equals(anotherOne))
			System.out.println("They are equivalent,");
		if (!(one == anotherOne))
			System.out.println("but two seperate objects!");
	}
}
