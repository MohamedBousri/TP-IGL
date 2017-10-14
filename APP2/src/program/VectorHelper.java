package program;

public class VectorHelper {
	
	/**
	 * 	Cette methode trie le tableau "tab" 
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

}
