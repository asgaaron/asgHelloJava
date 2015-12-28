package Ch7;

public class Annotations
{
}

/**
 * comments!
 *
 * @author agardner
 * @deprecated
 */
@Deprecated
class OldClass
{
}

class AgingClass
{
	@Deprecated
	public void someMethod()
	{
	}
}
