package inClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayListDemoTest {

	@Test
	void testAddAndGet() {  // we can change the name; we can combine test for two methods together
		ArrayListDemo list = new ArrayListDemo();
		list.add(44);
		list.add(-1);
		list.add(90);
		list.add(4);
		
		assertEquals(44,list.get(0)); // compare expected vs. actual
		assertEquals(-1,list.get(1));
		assertEquals(90,list.get(2));
		assertEquals(4,list.get(3));
		
		// second attempt
		assertEquals(44,list.get(0));
	}

	@Test
	void testRemoveAndSize() {
		ArrayListDemo list = new ArrayListDemo();
		list.add(44);
		list.add(-1);
		list.add(90);
		list.add(4);
		
		assertEquals(4,list.size());
		list.remove(3);
		assertEquals(3,list.size());
		list.remove(2);
		assertEquals(2,list.size());
		list.remove(1);
		assertEquals(1,list.size());
		list.remove(0);
		assertEquals(0,list.size());
	}

	@Test
	void testIsEmpty() {
		ArrayListDemo list = new ArrayListDemo();
		assertTrue(list.isEmpty());
		
		list.add(10);
		assertFalse(list.isEmpty());
	}


}
