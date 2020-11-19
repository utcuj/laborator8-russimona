
public class Masina implements Cloneable{
	String marca;
	String culoare;
	
	public Masina(String marca, String culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}
	
	/// Deep copy
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
	public String toString() {
		return marca+" "+culoare;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	
}
