package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.junit.Test;

public class CalendarTest {

	@Test
	public void test() {
		Calendar cale = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String firstday, lastday;
		// 获取上个月的今天

		// 获取第一天
		cale = Calendar.getInstance();
		cale.add(Calendar.MONTH, 0);
		cale.set(Calendar.DAY_OF_MONTH, 1);
		firstday = format.format(cale.getTime());
		// 获取最后一天
		cale = Calendar.getInstance();
		cale.add(Calendar.MONTH, 1);
		cale.set(Calendar.DAY_OF_MONTH, 0);
		lastday = format.format(cale.getTime());
		System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);

	}

	@Test
	public void test1() {
		LocalDate today = LocalDate.now();
		today = today.minusMonths(1);
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM");
		System.out.println(formatters.format(today));

	}
	
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		String firstDay,lastDay;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 

		//获取前月的第一天
		Calendar cal_1=Calendar.getInstance();//获取当前日期 
		cal_1.add(Calendar.MONTH, -1);
		cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		firstDay = format.format(cal_1.getTime());
		System.out.println("-----1------firstDay:"+firstDay);
		//获取前月的最后一天
		Calendar cale = Calendar.getInstance(); 
		cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
		lastDay = format.format(cale.getTime());
		System.out.println("-----2------lastDay:"+lastDay); 
		
	}
	
	
	@Test
	public void test3() {//获取上个月第一天
	
		String firstDay;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		//获取前月的第一天
		Calendar cal_1=Calendar.getInstance();//获取当前日期 
		cal_1.add(Calendar.MONTH, -1);
		cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		firstDay = format.format(cal_1.getTime());
		System.out.println("-----1------firstDay:"+firstDay);
	}
	
	
	@Test
	public void test4() {//获取上个月最后一天
		String lastDay;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		//获取前月的最后一天
		Calendar cale = Calendar.getInstance(); 
		cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
		lastDay = format.format(cale.getTime());
		System.out.println("-----2------lastDay:"+lastDay); 
	}
}
