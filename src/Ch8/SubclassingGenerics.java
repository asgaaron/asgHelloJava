package Ch8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubclassingGenerics
{
	class DateList extends ArrayList<Date>
	{
	}

	DateList dateList = new DateList();


	{
		dateList.add(new Date());
		List<Date> ld = dateList;
	}
}
