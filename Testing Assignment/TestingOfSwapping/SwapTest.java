package TestingOfSwapping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapTest {

	@Test
	void SwapTestEquals() {
		Swapping s=new Swapping();
		int x=3;
		int y=5;
				int result= s.swapIntegers(x,y);
		assertEquals(y,result);
		assertNotNull(x);
		assertNotNull(y);
		
	}
	@Test
	void SwapTestEqual1() {
		Swapping s=new Swapping();
		int x=3;
		int y=5;
		
		int result= s.swapIntegers(x,y);
		assertEquals(x,y);
		assertNotNull(x);
		assertNotNull(y);
		
	}

	@Test
	void SwapTestNotEqual1() {
		Swapping s=new Swapping();
		int x=5;
		int y=6;
		int result= s.swapIntegers(x,y);
		assertNotEquals(2,result);
		assertNotNull(x);
		assertNotNull(y);
	}
	@Test
	void SwapTestNotEqual2() {
		Swapping s=new Swapping();
		int x=6;
		int y=6;
		int result= s.swapIntegers(x,y);
		assertNotEquals(1,result);
		assertNotNull(x);
		assertNotNull(y);
	}
	@Test
	void SwapTestSame1() {
		Swapping s=new Swapping();
		int x=5;
		int y=6;
		int result= s.swapIntegers(x,y);
		assertSame(x,y);
		assertNotNull(x);
		assertNotNull(y);
	}
	@Test
	void SwapTestSame2() {
		Swapping s=new Swapping();
		int x=6;
		int y=6;
		int result= s.swapIntegers(x,y);
		assertSame(2,result);
		assertNotNull(x);
		assertNotNull(y);
	}
	@Test
	void SwapTestNotSame() {
		Swapping s=new Swapping();
		int x=5;
		int y=6;
		int result= s.swapIntegers(x,y);
		assertNotEquals(x,y);
		assertNotNull(x);
		assertNotNull(y);
	}
	@Test
	void SwapTestNotSame1() {
		Swapping s=new Swapping();
		int x=5;
		int y=5;
		int result= s.swapIntegers(x,y);
		assertNotEquals(x,y);
		assertNotNull(x);
		assertNotNull(y);
	}






}
