package string;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringChange {

	@Test
	public void test1() {
		double a = 0.00;
		double b = 0.0;
		double c = 0;
		System.out.println(b == 0);
		System.out.println(a == 0);

		System.out.println(Double.valueOf(a));
		test2(c);
	}

	public void test2(double c) {

	}

	@Test
	public void test3() {
		// double valueOf = Double.valueOf("");
		// System.out.println(valueOf);
		// System.out.println(Double.valueOf(""));
		System.out.println(Double.valueOf("0"));
		System.out.println(Double.valueOf("0.00"));

		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.get("aa"));

		int a = 1;
		double aa=1.0;
		double b = 0.9;
		double c = a - b;
		System.out.println(a - b);
		System.out.println(aa - b);
		System.out.println(aa*0.9);
	}

	@Test
	public void test4() {
		// double valueOf = Double.valueOf("");
		// System.out.println(valueOf);
		// System.out.println(Double.valueOf(""));.
		Map<String, String> map = new HashMap<String, String>();
		String valueOf = String.valueOf(map.get("map"));
		System.out.println(valueOf);
	}
	
	@Test
	public void test5() {
		String type = "HXZGSB00290Request";
		String fileName = "TaxMLBw_HXZG_SB_00290_Request_V1.0.xsd";
	//	NsrxxDto nsrxxDto = NsrzxContextsHolder.getNsrxx(djxh);
		// 拼接申报报表
		String content ="<ns2:dkdjwhsyjsfsb>\r\n" + 
				"    <ns2:nsrxxForm>\r\n" + 
				"      <ns2:kjywrsbh>440605110105198</ns2:kjywrsbh>\r\n" + 
				"      <ns2:kjywrmc>wyx国税纳税人，谁动砍谁</ns2:kjywrmc>\r\n" + 
				"      <ns2:tbrq>2020-02-11</ns2:tbrq>\r\n" + 
				"      <ns2:skssqq>2020-01-01</ns2:skssqq>\r\n" + 
				"      <ns2:skssqz>2020-01-31</ns2:skssqz>\r\n" + 
				"      <ns2:bkjdjxh/>\r\n" + 
				"      <ns2:bkjnsrsbh/>\r\n" + 
				"      <ns2:bkjnsrmc/>\r\n" + 
				"    </ns2:nsrxxForm>\r\n" + 
				"	\r\n" + 
				"    <ns2:dkdjwhsyjsfGrid>\r\n" + 
				"      <ns2:dkdjwhsyjsfGridlb>\r\n" + 
				"        <ns2:xmdl>0</ns2:xmdl>\r\n" + 
				"        <ns2:lc>0.0</ns2:lc>\r\n" + 
				"        <ns2:bys>1000</ns2:bys>\r\n" + 
				"        <ns2:bnlj>1000.0</ns2:bnlj>\r\n" + 
				"        <ns2:sl>0.0010</ns2:sl>\r\n" + 
				"        <ns2:byyj>0.0</ns2:byyj>\r\n" + 
				"        <ns2:bnyj>0.0</ns2:bnyj>\r\n" + 
				"        <ns2:zspmDm>302170200</ns2:zspmDm>\r\n" + 
				"      </ns2:dkdjwhsyjsfGridlb>\r\n" + 
				"    </ns2:dkdjwhsyjsfGrid>\r\n" + 
				"    <ns2:slxxform>\r\n" + 
				"      <ns2:bsr>wyx国税纳税人，谁动砍谁</ns2:bsr>\r\n" + 
				"      <ns2:cwfzr>*财务负责人姓名</ns2:cwfzr>\r\n" + 
				"      <ns2:fddbrqz>*法定代表人（负责人）名称</ns2:fddbrqz>\r\n" + 
				"      <ns2:bsrlxdh>123</ns2:bsrlxdh>\r\n" + 
				"      <ns2:dlrmc/>\r\n" + 
				"      <ns2:jbr/>\r\n" + 
				"      <ns2:dlrjbrxm/>\r\n" + 
				"      <ns2:dlrlxdh>123</ns2:dlrlxdh>\r\n" + 
				"      <ns2:jsr>广东国税局长室</ns2:jsr>\r\n" + 
				"      <ns2:sdrq>2020-02-11</ns2:sdrq>\r\n" + 
				"      <ns2:slswjgDm>14400000001</ns2:slswjgDm>\r\n" + 
				"      <ns2:blrysfzjlxDm>201</ns2:blrysfzjlxDm>\r\n" + 
				"      <ns2:blrysfzjhm>452427199103232922</ns2:blrysfzjhm>\r\n" + 
				"    </ns2:slxxform>\r\n" + 
				"  </ns2:dkdjwhsyjsfsb>";
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<taxML xsi:type=\"");
		sb.append(type);
		sb.append(
				"\" bbh=\"String\" xmlbh=\"String\" xmlmc=\"String\" xsi:schemaLocation=\"http://www.chinatax.gov.cn/dataspec/");
		sb.append(fileName);
		sb.append(
				"\" xmlns=\"http://www.chinatax.gov.cn/dataspec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><sbxxGrid><sbxxGridlb><rdpzuuid/><sbxxGridlb/><jmxxGrid/><yhpzuuid/></jmxxGridlb>");
		sb.append("<dkdjwhsyjsfsbsbxx xmlbh=\"String\" bbh=\"String\" xmlmc=\"String\"><dkdjwhsyjsfsbsbSbb>");
		sb.append(content);
		sb.append("</dkdjwhsyjsfsbsbSbb></dkdjwhsyjsfsbsbxx>");
		sb.append("</dkdjwhsyjsfsbsbSbb></dkdjwhsyjsfsbsbxx>");
		sb.append("<sbbcTjqtxxVO><djxh>");
		sb.append("String");
		sb.append("</sbbcTjqtxxVO></djxh></taxML>");

		   System.out.println(sb.toString());
	}


}
