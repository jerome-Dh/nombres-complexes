package projets.jeromedh.cm.complexe;

/**
 * Quelques exécutions sur les nombres complexes
 *
 * <p>
 * 	Cette classe utilise la classe Complexe pour opérer 
 * 	sur les nombres complexes
 * </p>
 *
 * @version 1.0
 *
 * @since 06/07/2019
 *
 * @author Jerome Dh
 */
public class App 
{
	/**
	 * @param args Argument de la ligne de commande
	 *
	 */
    public static void main( String[] args )
    {
        System.out.println( "Bienvenue dans le programme complexe" );

		Complexe c1 = new Complexe(2, -3),
				c2 = new Complexe(-1, 2);

		//Addition
		System.out.println("\n" + c1 + " - " + c2 + " = " + c1.sub(c2));

		//Module
		System.out.println("\n|" + c2 + "| = " + c2.mod());

	}
}
