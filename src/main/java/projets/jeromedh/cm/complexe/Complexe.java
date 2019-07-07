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
 * @date 06/07/2019
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
	 */
	public Complexe()
	{
		setRe(0);
		setIm(0);
	}
	
	/**
	 * Constructeur avec paramètres
	 *
	 * @param double re - Partie réel
	 * @param double im - Partie imaginaire
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
	 * Addition
	 *
	 * @param Complexe c - Un nombre complexe
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
	 * Soustration
	 *
	 * @param Complexe c - Un nombre complexe
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
	 * Multiplication
	 *
	 * @param Complexe c - Un nombre complexe
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
	 * Division
	 *
	 * @param Complexe c - Un nombre complexe
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
	 * @param int n - Le n-ième terme de la racine
	 *
	 * @throws ComplexeException
	 * 
	 * @return List<Complexe>
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

	public double getRe()
	{
		return this.re;
	}

	public double getIm()
	{
		return this.im;
	}

	//
	//================ Setters ================
	//

	public void setRe(double re)
	{
		this.re = re;
	}

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
	 * @param Complexe c
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
