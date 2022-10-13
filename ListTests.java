import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    /**
     * 
     */
    // @Test 
	// public void testFilter() {
    // List<String> List = new ArrayList<String>();
    // //StringChecker sc = new Checker();
    // List.add("abc");
    // List.add("def");
    // List.add("ghi");
    // List.add("jkl");
    // assertArrayEquals(new String[]{"abc","def"}, ListExamples.filter(List,sc).toArray());

	// }
    

    @Test 
	public void testMerge() {
    List<String> List1 = new ArrayList<String>();
    List<String> List2 = new ArrayList<String>();
    //StringChecker sc = new Checker();
    List1.add("abc");
    List1.add("def");
    List2.add("ghi");
    List2.add("jkl");
    assertArrayEquals(new String[]{"abc","def","ghi","jkl"}, ListExamples.merge(List1,List2).toArray());

	}
    
}
