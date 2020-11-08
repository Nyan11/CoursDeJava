package cours.etape1;

public class Main {

	/**
	 * Faire une méthode qui affiche la chaine de caratère "Hello\n".
	 */
	public static void sayHello() {
		// TODO 
	}
	
	/**
	 * Faire une méthode qui affiche la chaine "Le résultat est: " puis le nombre n et enfin "\n".
	 * @param n nombre à afficher
	 */
	public static void affiche(int n) {
		// TODO
	}
	
	/**
	 * Faire une méthode qui additionne deux nombres et qui renvoie le résultat.
	 * @param a nombre 1
	 * @param b nombre 2
	 * @return nombre 1 + nombre 2
	 */
	public static int addition(int a, int b) {
		// TODO
		return 0;
	}
	
	/**
	 * Faire une méthode qui soustrait deux nombres et qui renvoie le résultat.
	 * @param a nombre 1
	 * @param b nombre 2
	 * @return nombre 1 - nombre 2
	 */
	public static int soustraction(int a, int b) {
		// TODO
		return 0;
	}
	
	/**
	 * Faire une méthode qui additionne ou sosutrait deux nombres et qui renvoit le résultat.
	 * @param a nombre 1 
	 * @param b nombre 2
	 * @param c charactere de selection de l'opération
	 * @return nombre1 + nombre2 si c = '+', nombre1 - nombre2 si c = '-' sinon retourne 0
	 */
	public static int calcul(int a, int b, char c) {
		// TODO
		return 0;
	}
	
	/**
	 * Faire une méthode qui affiche un tableau d'entier.
	 * Exemple: tab = {1,2,3,4,5} -> affiche "tableau: 1 2 3 4 5 \n"
	 */
	public static void afficheTab(int tab[]) {
		// TODO
	}
	
	/**
	 * Calcul la somme de tous les éléments d'un tableau et la retourne.
	 * @param tab tableau d'entier
	 * @return somme de tous les éléments d'un tableau
	 */
	public static int calculSommeTab(int tab[]) {
		// TODO
		return 0;
	}
	
	/**
	 * calcul la moyenne d'un tableau et la retourne.
	 * Attention la moyenne peut être un nombre à virgule,
	 * donc la fonction retourne un double (ex: 3,14) et non un int (3).
	 * Rappel: moyenne = somme des éléments d'un tableau / nombre d'éléments dans un tableau.
	 * @param tab tableau d'entier
	 * @return moyenne d'un tableau
	 */
	public static double moyenneTab(int tab[]) {
		// TODO
		return 0;
	}
	
	
	public static void main(String[] args) {
		sayHello();
		affiche(42);
		
		int res;
		
		System.out.println("11 + 13");
		res = addition(11, 13);
		affiche(res);
		
		System.out.println("11 - 13");
		res = soustraction(11, 13);
		affiche(res);
		
		System.out.println("11 + 13");
		res = calcul(11, 13, '+');
		affiche(res);
		
		System.out.println("11 - 13");
		res = calcul(11, 13, '-');
		affiche(res);
		
		System.out.println("11 @ 13");
		res = calcul(11, 13, '@');
		affiche(res);
		
		int tableau[] = {1,2,3,4,5,6,7,8,9,10};
		afficheTab(tableau);
		
		System.out.println("somme du tableau");
		res = calculSommeTab(tableau);
		affiche(res);
		
		System.out.println("moyenne du tableau : " + moyenneTab(tableau));
		
	}
	
	/* 
	 * Autres exercices:
	 *   - Affichage d'un carré
	 *   - Affichage d'une matrice
	 *   - Somme d'une matrice
	 *   - Moyenne d'une matrice
	 *   - addition de deux matrice
	 *   - transposer d'une matrice
	 *   - produit de 2 matrices
	 *   - ...
	 */
	

}

