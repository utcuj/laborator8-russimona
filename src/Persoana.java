
public class Persoana implements Comparable{
	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}
	
	/*
	public int compareTo(Object o) {
		return this.nume.compareTo(((Persoana)o).nume);
	}
	*/
	
	public String toString() {
		return nume+" "+prenume+" "+varsta;
	}
	
	public int compareTo(Object o) {
		return this.varsta - ((Persoana)o).varsta;
	}
}
