package RemoveInRange;

import java.util.*;

class StringCompartor implements Comparator<String>
{

	@Override
	public int compare(String arg0, String arg1)
	{
		// TODO Auto-generated method stub
		return arg0.compareTo(arg1);
	}
	
}

public class RemoveInRange
{
	List<String> list = null, subList = null;
	String start, end;
	public RemoveInRange(List<String> list, String start, String end)
	{
		// TODO Auto-generated constructor stub
		this.list = list;
		this.start = start;
		this.end = end;
		remove();
	}
	
	public void remove()
	{
		subList = new ArrayList<>(list);
		subList.add(start);
		subList.add(end);
		subList.sort(new StringCompartor());
		//System.out.println(subList);
		
		for(int i = subList.indexOf(start); i <= subList.indexOf(end); i++)
		{
			subList.remove(i);
			
		}
		subList.remove(end);
		//System.out.println(subList);
		
		for(int i = 0; i <= list.size(); i++)
		{
			if(subList.contains(list.get(i)))
			{		
			}
			
			else
			{
				list.remove(i);
			}
		}
	}
	
	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
		
		list.add("to");
		list.add("be");
		list.add("or");
		list.add("not");
		list.add("to");
		list.add("be");
		list.add("that");
		list.add("is");
		list.add("the");
		list.add("question");

		
		RemoveInRange rm = new RemoveInRange(list, "free", "rich");
		
		System.out.println(list);
	}

}
