package test;

import static org.junit.Assert.*;

import org.junit.Test;
import program.*;

public class test {
      // Les test Unitaires

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
	//----------------------------------------------------------------------------------------------------

	@Test (expected = ExeptionTailleDifférente.class)
	public void testsommer1() {
		/* On verifie que la methode sommer lance une exception en cas ou 
		 * les deux tableau nn'ont pas la méme taille
		 */
		VectorHelper v2 = new VectorHelper();
		int [] tab1 = {5 , 8 , 6 , 1 , 2 , 10 , 7};
		int [] tab2 = {4 , 2 , 17 , 9};
		int [] tab3  = new int[0];
		try {
		v2.sommer(tab1 , tab2, tab3);
		
            } catch (ExeptionTailleDifférente e1){
            	}
            }
	//----------------------------------------------------------------------------------------------------

	@Test 
	public void testsommer2() {
		/* On verifie que la methode sommer marche correctement 
		 */
		VectorHelper v2 = new VectorHelper();
		int [] tab1 = {5 , 8 , 6 , 1 , 2 , 10 , 7};
		int [] tab2 = {4 , 2 , 17 , 9 , 2 , 6 , 8};
		int [] tab3 = new int[tab1.length];
		try {
			v2.sommer(tab1 , tab2, tab3);
			assertEquals(tab3[0],9);
			assertEquals(tab3[1],10);
			assertEquals(tab3[2],23);
			assertEquals(tab3[3],10);
			assertEquals(tab3[4],4);
			assertEquals(tab3[5],16);
			assertEquals(tab3[6],15);
	            } catch (ExeptionTailleDifférente e1){
	            	
	            }
	      }
	//----------------------------------------------------------------------------------------------------

	@Test
	public void testInver() {
		int[] tab={1,3,4,6,10};
		VectorHelper vect=new VectorHelper();
		vect.inverser(tab);
		assertEquals(10, tab[0]);
		assertEquals(6, tab[1]);
		assertEquals(4, tab[2]);
		assertEquals(3, tab[3]);
		assertEquals(1, tab[4]);
	}
	//----------------------------------------------------------------------------------------------------
	@Test
	public void testMaxMin() {
		VectorHelper vect=new VectorHelper();
		int tab[]={1,2,6,4,10,45,-5,0};
		int t[]={0,0};
		vect.maxMin(tab, t);
		assertEquals(-5, t[0]);
		assertEquals(45, t[1]);
	}
	//----------------------------------------------------------------------------------------------------
	@Test
	public void testAppliquerFormuleVect() {
		VectorHelper vect=new VectorHelper();
		int[] tab={0,1,6,8,10,12};
		vect.appliquerFormuleVect(tab, i -> i*2);
		assertEquals(0, tab[0]);
		assertEquals(2, tab[1]);
		assertEquals(12, tab[2]);
		assertEquals(16, tab[3]);
		assertEquals(20, tab[4]);
		assertEquals(24, tab[5]);
	}
}
	
	


