package eager.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import eager.QuickFind.SimpleUnionFind;

public class SimpleUnionFindUnitTest {

	@Before
	public void setUp() throws Exception {
		int[] in = new int[4];
		SimpleUnionFind.initSimpleUnionFind(in);
		SimpleUnionFind.setInputArray(in);
	}

	@Test
	public void testFind() {
		assertEquals(false, SimpleUnionFind.find(0, 1));
	}
	@Test
	public void testUnionFalseCase() {
		assertNotEquals(SimpleUnionFind.getInputArray()[0], SimpleUnionFind.getInputArray()[1]);
	}
	@Test
	public void testUnion() {
		SimpleUnionFind.union(0, 1);
		assertEquals(SimpleUnionFind.getInputArray()[0], SimpleUnionFind.getInputArray()[1]);
	}


}
