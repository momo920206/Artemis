package listdemo;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mapdemo=new HashMap<>();
		mapdemo.put(1, "黄鹏");
		mapdemo.put(2, "李明");
		mapdemo.put(3, "张三");
		mapdemo.put(4, "李四");
		System.out.println(mapdemo);
		Set<Map.Entry<Integer, String>> setmap=mapdemo.entrySet();
		for (Entry<Integer, String> entry : setmap) {
			System.out.println(entry);
		}
		System.out.println("setmap.size()="+setmap.size());
		System.out.println("setmap.isEmpty()="+setmap.isEmpty());
		System.out.println("mapdemo.containsKey(5)="+mapdemo.containsKey(5));
		System.out.println("mapdemo.values()"+mapdemo.values());
		Set<Integer> keynum =mapdemo.keySet();
		for (Integer integer : keynum) {
			System.out.print(integer+"\t");
		}
		System.out.println(mapdemo.get(2));
	}

}
