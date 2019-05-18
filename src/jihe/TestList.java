package jihe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import page1_100.jicheng.Person;

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

	/**
	 ** 
	 * @Description:如何遍历集合
	 * @param:
	 * @return: void
	 */
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

	/**
	 ** 如何获取集合中的某个值
	 * 
	 * @Description:
	 * @param:
	 * @return: void
	 */
	@Test
	public void test3() {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		System.out.println(list.toString());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("张三")) {
				System.out.println(i);
			}
		}
	}

	// 排序
	@Test
	public void test4() {
		List<User> list = new ArrayList<User>();
		User u1 = new User((Integer) 1, "1+1", "小明", (Integer) 0, "123456");
		User u2 = new User((Integer) 2, "1+2", "小红", (Integer) 1, "123456");
		User u3 = new User((Integer) 3, "1+3", "小转", (Integer) 0, "123456");
		User u4 = new User((Integer) 4, "1+4", "小黑", (Integer) 1, "654321");
		User u5 = new User((Integer) 5, "1+5", "小兵", (Integer) 0, "666666");
		User u6 = new User((Integer) 6, "1+6", "小太阳", (Integer) 1, "888888");
		list.add(u1);
		list.add(u5);
		list.add(u4);
		list.add(u3);
		list.add(u6);
		list.add(u2);
		System.out.println(list.toString());// [id:1,userName:小明, id:5,userName:小兵, id:4,userName:小黑, id:3,userName:小转,
											// id:6,userName:小太阳, id:2,userName:小红]
		// 因为user的tostring我只写了两个
		// 排序
		list.sort(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// 这里是根据ID来排序，所以它为空的要剔除掉
				if (o1.getId() == null || o2.getId() == null)
					return 0;
				return o1.getId().compareTo(o2.getId());// 这是顺序;
			}

		});
		System.out.println("下面是排好序的樣子");
		System.out.println(list);
	}
}
