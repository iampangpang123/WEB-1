package poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import mysql.JdbcUtil;

public class ExcelUtil {

	/**
	 **   
	 * @Description:根据user表的数据，到处到excle表格
	 * @param: @throws Exception      
	 * @return: void      
	 */
	@Test
	public void sqlUserToExcel() throws Exception {
		int   count=1;
		// 获得Excel文件输出流
		FileOutputStream out = new FileOutputStream(new File("F:\\JavaIO\\User.xls"));
		// 创建excel工作簿对象
		HSSFWorkbook wb = new HSSFWorkbook();
		// 创建excel页
		HSSFSheet sheet = wb.createSheet("POI导出测试");
		// 创建表头
		HSSFRow row1 = sheet.createRow(0);
		// 创建表头的单元格-------------------------------
		HSSFCell cell1_1 = row1.createCell(0);
		cell1_1.setCellValue("sid");
		
		HSSFCell cell1_2 = row1.createCell(1);
		cell1_2.setCellValue("sname");
		
		HSSFCell cell1_6 = row1.createCell(2);
		cell1_6.setCellValue("age");
		
		HSSFCell cell1_3 = row1.createCell(3);
		cell1_3.setCellValue("gander");
		
		HSSFCell cell1_4 = row1.createCell(4);
		cell1_4.setCellValue("province");
		
		HSSFCell cell1_5 = row1.createCell(5);
		cell1_5.setCellValue("money");

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "123");
		System.out.println(conn);
		String sql = "select * from stu";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()) {
			HSSFRow row=sheet.createRow(count);//第二行開始記錄，下次遍歷開始count++
			
			HSSFCell cell0 = row.createCell(0);//第一个单元格，下表从0开始。
			cell0.setCellValue(rs.getInt(1));
			
			HSSFCell cell1 = row.createCell(1);//第二个单元格
			cell1.setCellValue(rs.getString(2));
			
			HSSFCell cell2 = row.createCell(2);
			cell2.setCellValue(rs.getInt(3));
			
			HSSFCell cell3 = row.createCell(3);
			cell3.setCellValue(rs.getString(4));
			
			HSSFCell cell4 = row.createCell(4);
			cell4.setCellValue(rs.getString(5));
			
			HSSFCell cell5 = row.createCell(5);
			cell5.setCellValue(rs.getInt(6));
			count++;//因为count++代表下行开始，不加数据就覆盖了
		}
		wb.write(out);
		// 关流
		out.close();

	}
}
