package jihe;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestSet {

	/**
	 ** 
	 * @Description:判断集合是否存在某个元素
	 * @param:
	 * @return: void
	 */
	@Test
	public void test1() {
		Set<String> set = new HashSet<String>();
		set.add("CWBBYSBQC");
		set.add("CWBBLXQC");
		set.add("CWBBZCZEQC");

//		System.out.println(set.contains("CWBBYSBQC")==false);
//		System.out.println(set.contains("CWBBYSC"));
		
		if(set.contains("CWBBYSBC")||set.contains("CWBBYSBQC")||set.contains("CWBBYSBQC")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
