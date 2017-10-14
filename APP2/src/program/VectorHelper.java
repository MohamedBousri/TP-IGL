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
	/**
	 * cette methode inverse les elements d'un tableau (le dernier elem devient le premier...)
	 * @param tab " le tableau a inverser "
	 */
	void inverser(int[] tab)
	{
		int i=0,j=tab.length-1;
		int tempo=0;
		while(i<j)
		{
			tempo=tab[j];
			tab[j]=tab[i];
			tab[i]=tempo;
			i++;
			j--;
		}
		
	}
	/**
	 * cette methode retourne dans un tableau le max et le min du tableau tab
	 * @param tab " le tableau des donnees "
	 * @param t " t[0] contient le minimum, t[1] contient le maximum "
	 */
	void maxMin(int[] tab,int[] t)
	{
		
		if (tab.length!=0)
		{
		int i=0,min=tab[0],max=tab[0];
		while(i<=tab.length-1)
		{
			if (tab[i]<min)
			{
				min=tab[i];
			}
			else
			if (tab[i]>max)
			{
				max=tab[i];
			}
			i++;
		}
		t[0]=min;
		t[1]=max;
		
		}
		else // dans le cas ou le tableau est vide
		{
			t[0]=0;
			t[1]=-1;
			
		}
	}

}
