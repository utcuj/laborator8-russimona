
public class NumarFractionar implements Numeric {
	private double fractie;

	public NumarFractionar(double fractie) {
		this.fractie = fractie;
	}
	@Override
	
	public Numeric adunare(Numeric x) {
		if ( x instanceof NumarFractionar ) {
			this.fractie += ((NumarFractionar)x).fractie;
			return this;
		}else
		{
			NumarComplex rezultat = new NumarComplex(0,0);
			rezultat.setParteReala(this.fractie+((NumarComplex)x).getParteReala());
			rezultat.setParteImaginara(((NumarComplex)x).getParteImaginara());
			return rezultat;
		}
		
	}
	

	@Override
	public Numeric scadere(Numeric x) {
		if ( x instanceof NumarFractionar ) {
			this.fractie -= ((NumarFractionar)x).fractie;
			return this;
		}
		else
		{
			NumarComplex rezultat = new NumarComplex(0,0);
			rezultat.setParteReala(this.fractie-((NumarComplex)x).getParteReala());
			rezultat.setParteImaginara(-((NumarComplex)x).getParteImaginara());
			return rezultat;
		}
		
	}
	
	public String toString() {
		return this.fractie + " ";
	}

	public double getFractie() {
		return fractie;
	}

	public void setFractie(double fractie) {
		this.fractie = fractie;
	}
	
	
	
}
