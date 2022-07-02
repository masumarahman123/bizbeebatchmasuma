package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {
	
	
	public static void main(String[] args) {
	/*int a[]=new int[3];	
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;*/
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(null);
		lst.add(30);
		lst.add(40);
		lst.add(null);
		lst.add(null);
		
		System.out.println(lst);
		//System.out.println(lst.size());
		//System.out.println(lst.get(2));
		
		ArrayList<String> st=new ArrayList<String>();
		st.add("Milk");
		st.add("Apple");
		st.add("Rice");
		st.add("Banana");
		st.add("Salt");
		st.add("Grapes");
		st.add(null);
		st.add("Rice");
		st.add(null);
		System.out.println(st);
		//System.out.println(st.size());
	//System.out.println(st.get(2));
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Milk");
		ll.add("Apple");
		ll.add("Rice");
		ll.add("Banana");
		ll.add("Salt");
		ll.add("Grapes");
		ll.add(null);
		ll.add("Rice");
		ll.add(null);
		
	System.out.println(ll);
	System.out.println(ll.size());
	//System.out.println(ll.get(2));
	
	
	HashSet<String> hs=new HashSet<String>();
	
	hs.add("Milk");
	hs.add("Apple");
	hs.add("Rice");
	hs.add("Banana");
	hs.add("Salt");
	hs.add("Grapes");
	hs.add(null);
	hs.add("Rice");
	hs.add(null);
	System.out.println("HashSet::"+hs);
	System.out.println(hs.size());
	
	
	/*for(String p: hs)
	{
		//System.out.println(p);
	}
	Iterator it= hs.iterator();
	while(it.hasNext()) {
		//System.out.println(it.next());
	
	}*/
	
	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	
	lhs.add("Milk");
	lhs.add("Apple");
	lhs.add("Rice");
	lhs.add("Banana");
	lhs.add("Salt");
	lhs.add("Grapes");
	lhs.add(null);
	lhs.add("Rice");
	lhs.add(null);
		System.out.println("LinkedHashSet::"+lhs);
	TreeSet<String> ts= new TreeSet<String>();
	ts.add("Milk");
	ts.add("Apple");
	ts.add("Rice");
	ts.add("Banana");
	ts.add("Salt");
	ts.add("Grapes");
	//ts.add(null);
	ts.add("Rice");
	//ts.add(null);
	
	
	System.out.println("TreeSet ::"+ts);
	
	
	Map<String,Integer> mp=new HashMap<String,Integer>();
	mp.put(null, null);
	mp.put(null, 0);
	//mp.put(null, null);
	mp.put("Milk",3 );
	mp.put("Apple",10 );
	//mp.put("Apple",20 );
	mp.put("Rice",14 );
	mp.put("Banana", 2);
	mp.put("Grape",5 );
	mp.put("Rice",10 );
	System.out.println(mp);
	
	
	TreeMap<String,Integer> tmp=new TreeMap<String,Integer>();
	//tmp.put(null, null);
	//tmp.put(null, 0);
	tmp.put("Modhu", null);
	tmp.put("Milk",3 );
	tmp.put("Apple",10 );
	//tmp.put("Apple",20 );
	tmp.put("Rice",14 );
	tmp.put("Banana", 2);
	tmp.put("Grape",5 );
	tmp.put("Rice",10 );
	System.out.println(tmp);
	
	Hashtable<String,Integer> tb=new Hashtable<String,Integer>();
	//tb.put(null, null);
		//tb.put(null, 0);
		//tb.put("Modhu", null);
		tb.put("Milk",3 );
		tb.put("Apple",10 );
		//tb.put("Apple",20 );
		tb.put("Rice",14 );
		tb.put("Banana", 2);
		tb.put("Grape",5 );
		tb.put("Rice",10 );
		System.out.println(tb);}
}
