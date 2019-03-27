package Sample.AppiumProj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void example(){
		HashSet hs = new HashSet();		  
		  ArrayList<Object > arrlist=new ArrayList<Object>();
		  arrlist.add(1);
		  arrlist.add(2);
		  //arrlist.add(1,3);
		  System.out.println(arrlist); 
		  Set<Object> set=new HashSet<Object>();
		  set.add(1);
		  set.add(1.1);
		  set.add(1.2);
		  set.addAll(arrlist);
		  System.out.println(set);
		  System.out.println("aaaaaaaaa "+set.size());
		}
	public static void set(){
		System.out.println("Arry List");
		ArrayList<Object > arrlist=new ArrayList<Object>();
		  arrlist.add(4);
		  arrlist.add(2);
		  arrlist.add(1,3);
		  System.out.println(arrlist);
		  System.out.println("set data");
		  Set<Object> set=new HashSet<Object>();
		  set.add(1);
		  set.add(1.1);
		  set.add(1.2);
		  set.add(new String("a"));
		  set.add("a");
		  set.addAll(arrlist);
		  System.out.println(set);
		  System.out.println("Linked List");
		  LinkedList<Object> linkedList=new LinkedList<Object>();
		  linkedList.add(1);
		  linkedList.add(2);
		  linkedList.add(1,3);
		  linkedList.add(1);
		  System.out.println(linkedList);
	}
	public static void maps(){
		List<Object > arrlist=new ArrayList<Object>();
		  arrlist.add("Telugu");
		  arrlist.add("Hindi");
		  Map<String, Object> map= new HashMap<String, Object>();
		  //Map<Integer, String> mp = new HashMap<Integer, String>();
		  map.put("1", arrlist);
		  map.put("2", arrlist);
		  map.put("ram", "telugu");
		  System.out.println("aaaaaaaaa "+map.get("2"));
		  System.out.println(map);
	}
	public static void main(String[] args) {
		Practice pr = new Practice();
		pr.maps();

}
}
