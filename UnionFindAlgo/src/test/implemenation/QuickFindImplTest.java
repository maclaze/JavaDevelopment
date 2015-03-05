package test.implemenation; 

import implemenation.QuickFindImpl;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* QuickUnionImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>02/24/2015</pre> 
* @version 1.0 
*/ 
public class QuickFindImplTest extends TestCase {
public QuickFindImplTest(String name) {
super(name); 
} 

public void setUp() throws Exception { 
super.setUp();
    QuickFindImpl quickUnion = new QuickFindImpl();

} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: initializeInput() 
* 
*/ 
public void testInitializeInput() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: find(int nodeP, int nodeQ)
* 
*/ 
public void testFind() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: union(int nodeP, int nodeQ)
* 
*/ 
public void testUnion() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(QuickFindImplTest.class);
} 
} 
