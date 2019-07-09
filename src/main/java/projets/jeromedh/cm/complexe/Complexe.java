package projets.jeromedh.cm.complexe;

import java.util.List;
import java.util.ArrayList;

/**
 * Manipulation des nombres complexe
 * <p>
 * 	Cette classe effectue les opérations basiques
 * 	sur les nombres complexes vus en classe de Terminale 
 * 	scientifique
 * </p>
 * <b>Les opérations compatibles sont</b>
 * <ul>
 * 		<li>Addition avec un complexe</li>
 * 		<li>Soustration avec un complexe</li>
 * 		<li>Multiplication avec un complexe</li>
 * 		<li>Division avec un complexe</li>
 * 		<li>Le module du nombre complexe</li>
 * 		<li>L'argument du nombre complexe</li>
 * 		<li>La racine n-ième du nombre complexe</li>
 * </ul>
 *
 * @version 1.0
 *
 * @since 06/07/2019
 *
 * @author Jerome Dh
 *
 */
public class Complexe 
{
	/**
	 * Partie réel
	 *
	 * @var double
	 */
    private double re;

	/**
	 * Partie imaginaire
	 *
	 * @var double
	 */
    private double im;

	/**
	 * Constructeur par défaut
	 * <p>
	 * 	Ce constructeur permet de créer un nombre
	 * 	complexe avec les valeurs nulles: 
	 *	<b>Il s'agit d'un complexe nul</b>
	 * </p>
	 */
	public Complexe()
	{
		setRe(0);
		setIm(0);
	}
	
	/**
	 * Constructeur avec paramètres:
	 * <p>
	 * 	Ce contructeur crée un nombre complexe avec 
	 * 	une partie réelle et une partie imaginaire
	 *	L'une des deux partie peut être nulle ou 
	 * 	signé
	 * </p>
	 *
	 * @param re Partie réel
	 * @param im Partie imaginaire
	 */
	public Complexe(double re, double im)
	{
		setRe(re);
		setIm(im);
	}
	
	//
	//================ Calculs =================
	//

	/**
	 * Addition avec un autre nombre complexe
	 *
	 * @param c Un nombre complexe
	 * 
	 * @return Complexe
	 */
	public Complexe add(Complexe c)
	{
		return new Complexe(
			this.re + c.re,
			this.im + c.im
		);
	}

	/**
	 * Soustration avec un autre nombre complexe
	 *
	 * @param c Un nombre complexe
	 * 
	 * @return Complexe
	 */
	public Complexe sub(Complexe c)
	{
		return new Complexe(
			this.re - c.re,
			this.im - c.im
		);
	}

	/**
	 * Multiplication avec un autre nombre complexe
	 *
	 * @param c Un nombre complexe
	 * 
	 * @return Complexe
	 */
	public Complexe mul(Complexe c)
	{
		double r = (this.getRe() * c.getRe()) 
					- (this.getIm() * c.getIm()),

			i = ((this.getRe() * c.getIm()) 
					+ (c.getRe() * this.getIm()));

		return new Complexe(r, i);

	}

	/**
	 * Division avec un autre nombre complexe
	 *
	 * @param c Un nombre complexe
	 * 
	 * @return Complexe
	 */
	public Complexe div(Complexe c)
	{
		double r = (this.getRe() * c.getRe() 
				+ this.getIm() * c.getIm())
				/ (Math.pow(c.getRe(), 2) 
				+ Math.pow(c.getIm(), 2)),

			i = (c.getRe() * this.getIm() 
			- this.getRe() * c.getIm()) 
			/ (Math.pow(c.getRe(), 2) 
			+ Math.pow(c.getIm(), 2));

		return new Complexe(r, i);

	}

	/**
	 * Argument du nombre complexe
	 *
	 * <b>
	 *	Dans le cas présent la valeur de l'argument 
	 * 	rétournée est en radian
	 * </b>
	 * 
	 * @return double
	 */
	public double arg()
	{
		double module = this.mod(),
			partieR = this.re / module,
			partieI = this.im / module,
			argCos = Math.acos(partieR),
			argSin = Math.asin(partieI);
			
		return (Math.cos(argCos) == Math.cos(argSin)) ?
						argSin : argCos;

	}

	/**
	 * Module du nombre complexe
	 * 
	 * @return Complexe
	 */
	public double mod()
	{
		
		double r = Math.sqrt(Math.pow(this.getRe(), 2) 
			+ Math.pow(this.getIm(), 2));

		return r;

	}

	/**
	 * Racine n-ième du  nombre complexe
	 *
	 * @param n Le n-ième terme de la racine
	 *
	 * @throws ComplexeException : Un nombre négatif pour
	 * n lévera une exception
	 * 
	 * @return List
	 */
	public List<Complexe> rac(int n) throws ComplexeException
	{
		if(n < 0)
		{
			throw new ComplexeException("Le nombre n-ième doit être superieur ou egal a zero");
		}

		List<Complexe> liste = new ArrayList<Complexe>();

        double r = Math.pow(this.mod(), 1/n),
			alpha = 0.0;

        for (int k = 0; k < n; ++k)
		{
            alpha = (this.arg() + 2 * k * Math.PI) / n;

            liste.add(new Complexe());
        }

		return liste;
		
	}


	//
	//=============== Getters =================
	//

	/**
	 * Retourne la partie réelle du nombre complexe
	 * 
	 * @return double
	 */
	public double getRe()
	{
		return this.re;
	}

	/**
	 * Retourne la partie imaginaire du nombre complexe
	 * 
	 * @return double
	 */
	public double getIm()
	{
		return this.im;
	}

	//
	//================ Setters ================
	//

	/**
	 * Modifie la partie réelle du nombre complexe
	 * 
	 * @param re Un réel
	 */
	public void setRe(double re)
	{
		this.re = re;
	}

	/**
	 * Modifie la partie imaginaire du nombre complexe
	 * 
	 * @param im Un réel
	 */
	public void setIm(double im)
	{
		this.im = im;
	}

	//
	//============== Additionnels ===========
	//
	/**
	 * Comparaison avec un autre nombre complexe
	 * 
	 * <p>
	 *	Les deux nombres complexes sont comparés suivant
	 * 	les valeurs algébriques de la partie réelle et la 
	 * 	partie imaginaire
	 * </p>
	 * 
	 * @param c Un autre nombre complexe
	 * 
	 * @return boolean
	 */
	//@Override
	public boolean equals(Complexe c)
	{
		return (this.re == c.re && this.im == c.im);
	}


	/**
	 * Répresentation textuelle du nombre complexe
	 *
	 * <p>
	 *	Cette répresentation utilise la notation algébrique
	 * 	pour formater le nombre complexe 
	 * </p>
	 * <b>
	 * 	Notez que le symbole <i>i</i> situé après la partie
	 * 	imaginaire ne sert qu'à la distinguer de la partie réelle
	 * </b>
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		String z = "";

		z += this.re == 0 ? "" : this.re;

		z += this.im == 0 ? "" : 
			(this.im < 0 ? " - " : " + ") + Math.abs(this.im) + "i";
 
		z = (this.re == 0 && this.im == 0) ? "0" : z;

		z = (this.re != 0 && this.im != 0) ? "(" + z + ")" : z;

		return z;

	}
	
}
