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
		int [] tab2 = {1 , 2 , 5 , 6 , 7 , 8 , 10};
		v1.tri(tab);
		assertArrayEquals(tab2, tab);
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
            	System.out.println("Taille differentes des tableaus");
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
		int [] tabExpected  = {9,10,23,10,4,16,15};
		int [] tabResult = new int[tab1.length];
		try {
			v2.sommer(tab1 , tab2, tabResult);
		assertArrayEquals(tabExpected, tabResult);
	            } catch (ExeptionTailleDifférente e1){
	            	
	            }
	      }
	//----------------------------------------------------------------------------------------------------

	@Test
	public void testInver() {
		int[] tab={1,3,4,6,10};
		int[] tabExpected= {10,6,4,3,1};
		VectorHelper vect=new VectorHelper();
		vect.inverser(tab);
		assertArrayEquals(tabExpected, tab);
		
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
		int[] tabExepcted={0,2,12,16,20,24};
		vect.appliquerFormuleVect(tab, i -> i*2);
		assertArrayEquals(tabExepcted, tab);
		
	}
}
	
	


