package com.mavenproj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MAPs {
		
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("Name", "Diwakar");
		m.put("last", "Kumar");
		m.put("las", "kumar");
		m.put(null, "k");//hashmap one key ca be null
		m.remove("las");
		String s=m.get("Name");
		System.out.println(s);
		//contains key or not check
		boolean b=m.containsKey("Name");
		System.out.println(b); //true
		boolean k=m.containsValue("Diwakar");
		System.out.println(k);//true
		//"all key will display using keyset"
		//get keys
		Set<String> set =m.keySet();
		for(String i:set) {
			System.out.println("key="+i);
		}
		//onlye values
		
		Collection<String> collectionofmapvalue =m.values();
		for(String value:m.values()) {
			System.out.println("value="+value);
		}
		//get key value pair
		for(String name:m.keySet()) {
			System.out.println(name+":"+m.get(name));
			
		}
		Set<Map.Entry<String, String>> kv=m.entrySet();
		for(Map.Entry<String,String> v:kv) {
			System.out.println(v.getKey()+":"+v.getValue());
			
		}
		
		Hashtable<String, String> hs=new Hashtable<String, String>();
		hs.put("name", "hashdiwakat:");
		//hs.put(null, "bal"); //hastable not accept null key or value
		Set<String> ks=hs.keySet();
		Set<Map.Entry<String,String>> mtable=hs.entrySet();
		
		
		for (Map.Entry<String, String> h:mtable) {
			h.getKey();
			h.getValue();
			
		}
		
		
		
	}
}
