package maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return -1;
		else if(o1<o2)
			return +1;
		else
			return 0;
	}
	
}
public class Demo1 
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put(31, "syed");
		hm.put(21, "syed");
		hm.put(13, "syed");
		hm.put(42, "saqib");
//		hm.put(null, null);
		System.out.println(hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(31, "syed");
		lhm.put(21, "syed");
		lhm.put(13, "syed");
		lhm.put(42, "saqib");
//		hm.put(null, null);
		System.out.println(lhm);
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(31, "a");
		tm.put(21, "c");
		tm.put(13, "d");
		tm.put(42, "b");
//		hm.put(null, null);
		System.out.println(tm);
		
		TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>(new MyComparator());
		tm2.put(31, "a");
		tm2.put(21, "c");
		tm2.put(13, "d");
		tm2.put(42, "b");
//		hm.put(null, null);
		System.out.println(tm2);
		
	}

}
