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
	
	@Test (expected = ExeptionTailleDifférente.class)
	public void testsommer1() {
		/* On verifier que la methode sommer lance une exception en cas ou 
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
	
	@Test 
	public void testsommer2() {
		/* On verifier que la methode sommer marche correctement 
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
		
}
	
	


