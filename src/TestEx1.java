
public class TestEx1 {
	public static void main(String[] args) {
		NumarComplex a = new NumarComplex(15,7);
		NumarComplex a1 = new NumarComplex(10,1);
		NumarFractionar b = new NumarFractionar(1.5);
		NumarFractionar c = new NumarFractionar(2.5);
		
		System.out.println(a.adunare(b));
		System.out.println(a.adunare(a1));
		System.out.println(a.scadere(a1));
		System.out.println(a.scadere(b));
		System.out.println(b.adunare(c));
		System.out.println(b.scadere(c));
		
		
		Numeric[][] num1 = new Numeric[3][3]; 
		Numeric[][] num2 = new Numeric[3][3]; 
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1.length; j++) {
				num1[i][j] = new NumarComplex(2, 2);
				num2[i][j] = new NumarFractionar(1.5);
			}
				
		}
		Matrice matrice1 = new Matrice(num1);
		Matrice matrice2 = new Matrice(num2);
		
		matrice1.adunare(matrice2);
		matrice1.afisareMatrice();
		
		System.out.println();
		
		matrice1.scadere(matrice2);
		matrice1.afisareMatrice();
	}

}
