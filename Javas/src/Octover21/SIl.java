package Octover21;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class SIl {
	
	public static void main(String[] a) {
		//해쉬맵이요
		//맵이요
		List<Map<Integer, String>> limap = new ArrayList<Map<Integer, String>>(); 
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "가나");
		map.put(11, "가나디");
		map.put(12, "가나라");
		map.put(13, "가나마");
		limap.add(map);
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(14, "가");
		map2.put(15, "나디");
		map2.put(16, "나라");
		map2.put(17, "나마");
		limap.add(map2);
		System.out.println(limap);
	}
}
