package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	
	/**
	 **   
	 * @Description:字符串日期转成date
	 * @param: @throws ParseException      
	 * @return: void      
	 */
	@Test
	public void test() throws ParseException {
		String str="2019-4-4 13:49:13";
		String format = "yyyy-MM-dd HH:mm:ss";//日期格式
	
		Date date = new SimpleDateFormat(format).parse(str);
		System.out.println(date);
	}
	@Test
	public void test1() {
		String a="1";
		String b="1";
		System.out.println(a.equals(b));
		 System.out.println(a==b);
	}
	@Test
	public void test2() {//日期转字符串
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat( "  " );
		 * 
		 * String str=sdf.parse(new Date());
		 */

        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss "); 

        String str = sdf.format(new Date()); 
        System.out.println(str);

		}
	

}
