package Octover21;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class SIl {
	
	public static void main(String[] a) {
		//�ؽ����̿�
		//���̿�
		List<Map<Integer, String>> limap = new ArrayList<Map<Integer, String>>(); 
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "����");
		map.put(11, "������");
		map.put(12, "������");
		map.put(13, "������");
		limap.add(map);
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(14, "��");
		map2.put(15, "����");
		map2.put(16, "����");
		map2.put(17, "����");
		limap.add(map2);
		System.out.println(limap);
	}
}
