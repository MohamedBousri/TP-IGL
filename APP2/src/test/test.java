package test;

import static org.junit.Assert.*;

import org.junit.Test;
import program.*;

public class test {


	@Test
	public void testTri() {
		VectorHelper v1 = new VectorHelper();
		int [] tab = {5 , 8 , 6 , 1 , 2 , 10 , 7};
		v1.tri(tab);
		assertEquals(tab[0],1);
		assertEquals(tab[1],2);
		assertEquals(tab[2],5);
		assertEquals(tab[3],6);
		assertEquals(tab[4],7);
		assertEquals(tab[5],8);
		assertEquals(tab[6],10);
	}

}
