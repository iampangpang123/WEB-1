package string;

import org.junit.Test;

public class StringIsEqTest {

	/**
	 ** 
	 * @Description:判断字符串为空
	 * @param:
	 * @return: void
	 */
	@Test
	public void test1() {
		String aa = "bb";
		String bb = "bb";
		System.out.println(aa == bb);
		System.out.println(aa.equals(bb));
		throw new ClassCastException();
		// System.out.println("aaaaaaaaaaaa");抛异常后后面代码(不止是这个方法得代码不执行，调用他的方法后面代码也不执行了)不用执行了。所以写了也报错

	}

	@Test
	public void test2() {
		String aa = "bb";
		test1();
		System.out.println("aaaaaaaaaaaaa");
	}

	/**
	 **  
	 *抛异常,前提（异常被捕获）
	 *1.如果发生异常try()里面剩下的代码不会在执行，try外面的代码会执行
	 *2.
	 * 
	 * 
	 * 
	 */
	@Test
	public void test3() {
		String aa = null;
		int count = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(count);
			count++;
			try {
				aa.chars();
				System.out.println("aaaaaaaaa");
			} catch (Exception e) {
			System.out.println("抛异常");
				//continue;
			}
			System.out.println("bbbbbbb");
		}
		System.out.println("cccccc");
	}
}
