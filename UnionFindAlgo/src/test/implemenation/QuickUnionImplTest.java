package test.implemenation; 

import implemenation.QuickUnionImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** 
* QuickUnionImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>02/25/2015</pre> 
* @version 1.0 
*/ 
public class QuickUnionImplTest extends TestCase {
    QuickUnionImpl quickUnion = null;
public QuickUnionImplTest(String name) {
super(name);
}

public void setUp() throws Exception {
super.setUp();
    quickUnion = new QuickUnionImpl();
    quickUnion.setInputSize(10);
    quickUnion.initializeInput();
} 

public void tearDown() throws Exception { 
super.tearDown();
    quickUnion = null;
} 

/** 
* 
* Method : initializeInput()
* 
*/ 
public void testInitializeInput() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: find(int p, int q) 
* 
*/ 
public void testFind() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: union(int p, int q) 
* 
*/ 
public void testUnion() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getRootOf(int nodeP) 
* 
*/ 
public void testGetRootOf() throws Exception { 
    quickUnion.setElementAt(0,1);
    quickUnion.setElementAt(1,2);
    assertEquals(quickUnion.getRootOf(0), 2);
} 

/** 
* 
* Method: setRootOf(int nodeP, int newRoot) 
* 
*/ 
public void testSetRootOf() throws Exception { 
//TODO: Test goes here... 
}

    public void testProcess() throws Exception {

    }


    public static Test suite() {
return new TestSuite(QuickUnionImplTest.class); 
} 
} 
