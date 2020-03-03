package string;

import org.junit.Test;

public class StringIsNullTest {

	/**
	 ** 
	 * @Description:判断字符串为空
	 * @param:
	 * @return: void
	 */
	@Test
	public void test1() {
		String aa = null;
		System.out.println("aa".equals(aa));// false
		// System.out.println(aa.equals("aa"));空指针

	}

	/**
	 ** 
	 * @Description:字符串判断
	 * @param:
	 * @return: void
	 */
	@Test
	public void test2() {
		String aa = null;
		
		/*
		 * aa.equals("")等效于 aa.length()==0
		 * 
		 */
		if (aa == null || aa.equals("")) {
			// 只要a是null或者null
			System.out.println("只要a是null或者null");
		}
		
		System.out.println(aa.length());//空指针

	}

}
