package Ch8;

class Mouse
{
}

class Bear
{
}

class Trap<T>
{
	T trapped;

	public void snare(T trapped)
	{
		this.trapped = trapped;
	}

	public T release()
	{
		return trapped;
	}

	<T> Trap<T> makeTrap()
	{
		return new Trap<T>();
	}

	/**
	 * Type Inference from Assignment Context
	 */
	void run()
	{
		Trap<Mouse> mouseTrap = makeTrap();
		Trap<Bear> bearTrap = makeTrap();
	}
}

public class TypeVariable
{
	public static void main(String[] args)
	{
		Trap<Mouse> mouseTrap = new Trap<Mouse>();
		mouseTrap.snare(new Mouse());
		Mouse mouse = mouseTrap.release();
	}
}

class AdjustableTrap<T> extends Trap<T>
{
	public void setSize(int i)
	{
	}
}
