
public class NumarComplex implements Numeric {
	private double parteReala;
	private double parteImaginara;
	
	public NumarComplex(double parteReala, double parteImaginara) {
		this.parteImaginara = parteImaginara;
		this.parteReala = parteReala;
	}
	

	@Override
	public Numeric adunare(Numeric x) {
		if( x instanceof NumarComplex ) {
			this.parteImaginara += ((NumarComplex) x).parteImaginara ;
			this.parteReala += ((NumarComplex)x).parteReala;
			return this;
		}else
		{
			this.parteReala += ((NumarFractionar)x).getFractie();
			return this;
		}
		
	}

	@Override
	public Numeric scadere(Numeric x) {
		if( x instanceof NumarComplex ) {
			this.parteImaginara -= ((NumarComplex) x).parteImaginara ;
			this.parteReala -= ((NumarComplex)x).parteReala;
			return this;
		}else {
			this.parteReala -= ((NumarFractionar)x).getFractie();
			return this;
		}
			
		
	}

	public String toString( ) {
		if ( this.parteImaginara > 0 )
			return this.parteReala + " + " + this.parteImaginara+"i";
		else
			return this.parteImaginara + this.parteReala +"i";
	}
	
	
	public double getParteReala() {
		return parteReala;
	}


	public void setParteReala(double parteReala) {
		this.parteReala = parteReala;
	}


	public double getParteImaginara() {
		return parteImaginara;
	}


	public void setParteImaginara(double parteImaginara) {
		this.parteImaginara = parteImaginara;
	}
	
	
}
