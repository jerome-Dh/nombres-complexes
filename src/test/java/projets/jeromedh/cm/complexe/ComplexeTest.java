package projets.jeromedh.cm.complexe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test unitaire sur la classe Complexe
 *
 * <p>
 * 	Cette classe s'assure que les opérations sur les
 * 	nombres complexes donnent les résultats attendus
 * </p>
 * <b>
 * 	Si tous les tests reussissent, nous pouvons être 
 * 	fière car la classe Complexe est correcte
 * </b>
 *
 * @version 1.0
 *
 * @date 06/07/2019
 *
 * @author Jerome Dh
 *
 */
public class ComplexeTest
{
	/**
	 * Nombres complexes
	 *
	 * @var Complexe 
	 */	 
	private Complexe c1, c2, c3;
	
	/**
	 * Nombre réel
	 *
	 * @var double 
	 */	
	double reponse;

	/**
	 * Créer deux nombres complexes avant chaque test
	 *
	 * @var Complexe 
	 */	
	@Before
	public void construireComplexe()
	{
		c1 = new Complexe(this.random(), this.random());
		c2 = new Complexe(this.random(), this.random());
	}

    /**
     * Test d'addition de deux nombres
     */
    @Test
    public void testAddition()
    {
        c3 = c1.add(c2);

		assertEquals ( c3.getRe(), c1.getRe() + c2.getRe(), 5);
		assertEquals ( c3.getIm(), c1.getIm() + c2.getIm(), 5);
    }


	/**
     * Test soustraction de deux nombres
     */
    @Test
    public void testSoustraction()
    {
        c3 = c1.sub(c2);

		assertEquals ( c3.getRe(), c1.getRe() - c2.getRe(), 5);
		assertEquals ( c3.getIm(), c1.getIm() - c2.getIm(), 5);
    }

	/**
     * Test Multiplication de deux nombres
     */
    @Test
    public void testMultiplication()
    {
        c3 = c1.mul(c2);

		double r = (c1.getRe() * c2.getRe()) - (c1.getIm() * c2.getIm()),

			i = ((c1.getRe() * c2.getIm()) + (c2.getRe() * c1.getIm()));

		assertEquals ( c3.getRe(), r, 5 );
		assertEquals ( c3.getIm(), i, 5 );
    }


	/**
     * Test division
     */
    @Test
    public void testDivision()
    {
        c3 = c1.div(c2);

		double r = (c1.getRe()*c2.getRe() + c1.getIm()*c2.getIm()) / (Math.pow(c2.getRe(), 2) + Math.pow(c2.getIm(), 2)),

			i = (c2.getRe()*c1.getIm() - c1.getRe()*c2.getIm()) / (Math.pow(c2.getRe(), 2) + Math.pow(c2.getIm(), 2));

		Complexe c4 = new Complexe(r, i);

		assertTrue( c3.equals(c4) );

    }

	/**
     * Test du module
     */
	@Test
    public void testModule()
    {
        reponse = c1.mod();

		double r = Math.sqrt(Math.pow(c1.getRe(), 2) 
			+ Math.pow(c1.getIm(), 2));
	
		assertEquals ( reponse, r, 5 );
    }


	/**
	 * Générer un nombre aléatoire entre -5 et 4
	 *
	 * @return double
	 */
	private double random()
	{
		return (Math.random() * 10) - 5;
	}

}
