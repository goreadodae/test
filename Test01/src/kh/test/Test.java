package kh.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1", "123");
		hm.put("2", "234");
		hm.put("3", "345");
		hm.put("4", "456");
		Set<String> s = hm.keySet();
		for(String i:s) {
			System.out.println(i);
		}
	}

}
