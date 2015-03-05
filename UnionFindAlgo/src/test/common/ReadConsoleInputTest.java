package test.common; 

import common.ReadConsoleInput;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* ReadConsoleInput Tester. 
* 
* @author <Authors name> 
* @since <pre>02/24/2015</pre> 
* @version 1.0 
*/ 
public class ReadConsoleInputTest extends TestCase {

private ReadConsoleInput instanceOne = null;
private ReadConsoleInput instanceTwo = null;

public ReadConsoleInputTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
    super.setUp();
    instanceOne = ReadConsoleInput.getInstance();
    instanceTwo = ReadConsoleInput.getInstance();
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

public void testUniqueness() throws Exception {
assertEquals(instanceOne,instanceTwo);
} 





public static Test suite() { 
return new TestSuite(ReadConsoleInputTest.class); 
} 
} 
