package jihe;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {
	
	
	
	
	@Test
	public void test1() {
		Set<String> set =new HashSet<String>();
		
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("a");
		
		System.out.println(set.contains("a"));
		
		
	}

}
