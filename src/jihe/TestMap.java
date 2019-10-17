package jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class TestMap {

	@Test
	public void test() {

		System.out.println(2 << 3);
	}

	@Test
	public void find() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(2, "李四");
		map.put(3, "王五");
		map.put(4, "孙六");
		// 1. entrySet遍历，在键和值都需要时使用（最常用）
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		// 2. 通过keySet或values来实现遍历,性能略低于第一种方式
		// 遍历map中的键
		for (Integer key : map.keySet()) {
			System.out.println("key = " + key);
		}
		// 遍历map中的值
		for (String value : map.values()) {
			System.out.println("key = " + value);
			
		}
		// 3. 使用Iterator遍历
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}

		// 4. java8 Lambda
		// java8提供了Lambda表达式支持，语法看起来更简洁，可以同时拿到key和value，
		// 不过，经测试，性能低于entrySet,所以更推荐用entrySet的方式
		map.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});

	}

}
