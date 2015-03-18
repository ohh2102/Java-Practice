//import junit.framework.*;

import org.junit.*;
import static org.junit.Assert.*;
public class mathsettest {
	@Test
	public void test_initializer(){
		mathset<Integer> testset=new<Integer>mathset(0);
		
		assertEquals(1, (int)testset.card);
		assertEquals(0, (int)testset.value(0));
	}
	@Test
	public void test_insert(){
		
		
		mathset<Integer> testset=new<Integer>mathset();
		testset.insert(5);
		assertEquals(5, (int)testset.value(0));
		assertEquals(1,(int) testset.card);
		testset.insert(3);
		assertEquals(5, (int)testset.value(0));
		assertEquals(3, (int)testset.value(1));
		assertEquals(2, (int)testset.card);
		testset.insert(5);
		assertEquals(1,(int)testset.count(5));
		
	}
	
	@Test
	public void test_delete(){
		mathset<Integer> testset=new<Integer>mathset();
		testset.insert(5);
		testset.insert(3);
		testset.delete(3);
		assertEquals(0,(long)testset.count(3));
		assertEquals(1, (long)testset.card); 
		
	}
	
	@Test
	public void test_subset(){
		mathset<Integer> testset1=new<Integer>mathset();
		mathset<Integer> testset2=new<Integer>mathset();
		mathset<Integer> testset3=new<Integer>mathset();
		testset1.insert(5);
		testset1.insert(3);
		testset1.insert(7);
		testset1.insert(4);
		
		testset2.insert(5);
		testset2.insert(3);
		testset3.insert(30);
		
		assertEquals(true, mathset.subset(testset2, testset1));
		assertEquals(false, mathset.subset(testset3, testset1)); 
		
		
		
	
	
	
	
	
	
	
	
}}