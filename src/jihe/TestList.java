package jihe;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList {

	@Test
	public void test1() {
		List list = new ArrayList();
		list.add("张三");
		list.add("12");
		list.add("男");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Object object : list) {
			System.out.println(object.toString());
			;
		}

	}

	@Test
	public void test2() {
		List list = new ArrayList();
		list.add("张三");
		list.add("12");
		list.add("男");
		System.out.println(list.get(0));// 张三
		System.out.println(list.indexOf("12"));
		;// 1
		System.out.println("****************");
		list.set(0, "lisi");
		list.add(6, "wanwu");
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
