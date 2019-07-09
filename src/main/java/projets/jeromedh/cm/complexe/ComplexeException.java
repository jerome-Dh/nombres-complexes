package projets.jeromedh.cm.complexe;

/**
 * Exception de la manipulation des nombres complexes
 *
 * <p>
 * 	Cette classe gère les exceptions survenues lors
 * 	de la manipulation des nombres complexes
 * </p>
 *
 * @version 1.0
 *
 * @since 06/07/2019
 *
 * @author Jerome Dh
 *
 */
public class ComplexeException extends Exception
{

	/**
	 * Constructeur avec paramètres
	 *
	 * @param message Le message d'érreur
	 */
	public ComplexeException(String message)
	{
		super(message);
	}

}
