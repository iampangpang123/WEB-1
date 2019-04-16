package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import page1_100.jicheng.Person;

public class TestConllection {
	@Test
	public void test() {
		List list = new ArrayList<>();
		Person person = new Person();
		// Collection<> collection=new LinkedList<>();
		list.add("aaa");
		list.add("bb");
		list.add("123");
		list.add(person);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));  
		}
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));  
		}  
		for (Object object : list) {
			
		}
	}

}
