package listdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> setlist=new HashSet<Integer>();
		for (int i = 1; i < 9; i++) {
			setlist.add(i+7);
		}
		System.out.println("setlist容量为："+setlist.size());
		Integer [] intlist=setlist.toArray(new Integer[]{});
		for (Integer integer : intlist) {
			System.out.println(integer);
		}
		ArrayList<Integer> intlist2=new ArrayList<Integer>();
		intlist2.add(18);
		intlist2.add(19);
		intlist2.remove(Integer.valueOf(18));
		System.out.println(intlist2);
		System.out.println("setlist.getClass()值为"+setlist.getClass());
		System.out.println("setlist.isEmpty()值为"+setlist.isEmpty());
		setlist.addAll(intlist2);
		System.out.println("setlist.addAll(intlist2)结果"+setlist);
		setlist.remove(14);
		System.out.println("setlist删除元素为14的结果"+setlist);
		System.out.println("setlist中是否含有20的结果"+setlist.contains(20));
		setlist.removeAll(intlist2);
		System.out.println("setlist中删除与intlist2中相同的元素结果"+setlist);
		
		setlist.clear();
		System.out.println("清空setlist"+setlist);
		
		
	}
}
