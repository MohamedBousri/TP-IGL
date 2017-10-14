package program;

public class VectorHelper {
	
	/**
	 * 	Cette methode trie le tableau "tab" 
	 * 
	 * @param tab "le tableau qu'on veu trie " 
	 */
	
	public void tri(int[] tab){
		
		boolean fin = false; 
		
		while (  !fin    ){
			 fin = true ;
		     for (int i=0;i<tab.length-1;i++){
			 if (tab[i] >tab[i+1]){
				int c = tab [i]; 
				tab [i]=tab[i+1];
				tab [i+1]=c;
				fin = false ;
				break ;
				}
		      }
		}
		
	}
	
	/**
	 * Cette methode somme les element de deux tableaux tab1 et tab2 et met le resultat dans tab3 tab3=tab2+tab1
	 *   
	 * @param tab1 " le premier tableau a sommer "
	 * @param tab2 " le deuxieme tableau a sommer "
	 * @param tab3 " le tableau resultant de la somme de tab1 et tab2 "
	 * @throws ExeptionTailleDifférente " l'exception a lancer si les deux tableau n'ont pas la méme taille "
	 */
	
	public void sommer(int [] tab1,int [] tab2,int [] tab3) throws 
	ExeptionTailleDifférente{
		if (tab1.length != tab2.length){
			throw new ExeptionTailleDifférente ();
		}else {
			for (int i = 0 ; i< tab1.length ;i++){
				tab3[i]=tab1[i]+tab2[i];
			}
		}
		
	}

}
