package MyCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsLatest {
	public void testarraylist() {
		ArrayList<Integer> objlist = new ArrayList<>();
		objlist.add(33);
		objlist.add(null);
		objlist.add(444);
		objlist.add(3333);
		objlist.add(555);
		objlist.add(null);

		System.out.println("Size of collection "+ objlist.size());   //Checking the size of Int array list & find the location

		for(int i=0; i<objlist.size(); i++)
		{
			System.out.println(objlist.get(i));
		}
	}
	public void testhashmap() {
		HashMap <Integer,String> objmap = new HashMap<Integer, String>();

		objmap.put(55,"T");
		objmap.put(5566, "MyData");
		objmap.put(6666, "Test1");
		objmap.put(7777, "Test3");
		objmap.put(8888, "java");

		System.out.println(objmap.get(12));
		System.out.println(objmap.get("T"));
	}
	public void testmap() {
		HashMap <Integer,String> objmap = new HashMap<Integer, String>();
		objmap.put(11, "Selenium");
		objmap.put(3333, "Selenium1");
		objmap.put(4545, "Selenium34");
		objmap.put(7777, "Selenium2422");

		System.out.println(objmap.get(11));
	}
	public void testhashset() {
		HashSet<Integer> objset = new HashSet<Integer>();
		objset.add(2);
		objset.add(222);
		objset.add(55);
		objset.add(null);
		objset.add(null);
		objset.add(777);
		objset.add(777);
		System.out.println("Size " +objset.size());

		Iterator<Integer> obji = objset.iterator();
		while(obji.hasNext()) {
			System.out.println(obji.next());
		}
	}
	public static void main(String[] args) {
		CollectionsLatest obj = new CollectionsLatest();
		obj.testarraylist();
		//obj.testhashmap();
		//obj.testmap();
		//obj.testhashset();
	}
}
