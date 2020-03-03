package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	
	/**
	 ** 
	 * @Description:字String类型的日期比较大小
	 * @param: @throws ParseException
	 * @return: void
	 */
	@Test
	public void test5()  {
		String str1 = "2019-04-04";
	      str1=str1.replace("-", "").substring(0,6);
		//第一种直接用字符串类的compareTo方法：
		System.out.println(str1+"0101");
		

	}

	/**
	 ** 
	 * @Description:字String类型的日期比较大小
	 * @param: @throws ParseException
	 * @return: void
	 */
	@Test
	public void test4()  {
		String str1 = "2019-05-05";
		String str2 = "2019-05-04";
		int a = 1;
		int b = 2;
		System.out.println(a > b);//false
		//第一种直接用字符串类的compareTo方法：
		System.out.println(str1.compareTo(str2));//1
		

	}

	/**
	 ** 
	 * @Description:字符串日期转成date
	 * @param: @throws ParseException
	 * @return: void
	 */
	@Test
	public void test() throws ParseException {
		String str = "2019-4-4 13:49:13";
		String format = "yyyy-MM-dd HH:mm:ss";// 日期格式

		Date date = new SimpleDateFormat(format).parse(str);
		System.out.println(date);
	}

	@Test
	public void test1() {
		String a = "1";
		String b = "1";
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}

	@Test
	public void test2() {// 日期转字符串
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat( "  " );
		 * 
		 * String str=sdf.parse(new Date());
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");

		String str = sdf.format(new Date());
		System.out.println(str);

	}

	@Test
	public void test3() {// String 类型日期比较
		String date1 = "20190111";
		String date2 = "20190101";
		System.out.println(date1.compareTo(date2));
		if ((date1.compareTo(date2)) > 0) {
			System.out.println("aaa");
		}

	}
	
	@Test
	public void test10() {// String 类型日期比较
		String date1 = "2019-01-01";
		String date2 = "2019-01-01";
	  System.out.println(date1.substring(0, 4));

	}

}
