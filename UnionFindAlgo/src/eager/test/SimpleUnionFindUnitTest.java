package eager.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import eager.QuickFind.RuntimeArray;

public class SimpleUnionFindUnitTest {

	@Before
	public void setUp() throws Exception {
		int[] in = new int[4];
		RuntimeArray.initSimpleUnionFind(in);
		RuntimeArray.setInputArray(in);
	}

	@Test
	public void testFind() {
		assertEquals(false, RuntimeArray.find(0, 1));
	}
	@Test
	public void testUnionFalseCase() {
		assertNotEquals(RuntimeArray.getInputArray()[0], RuntimeArray.getInputArray()[1]);
	}
	@Test
	public void testUnion() {
		RuntimeArray.union(0, 1);
		assertEquals(RuntimeArray.getInputArray()[0], RuntimeArray.getInputArray()[1]);
	}


}
