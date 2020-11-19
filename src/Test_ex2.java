import java.util.Arrays;

public class Test_ex2 {	
	public static void main(String[] args) {
		Persoana p1 = new Persoana("Rus", "Simona", 19);
		Persoana p2 = new Persoana("Pasca", "Maria", 20);
		Persoana p3 = new Persoana("John", "Doe", 23);
		Persoana p4 = new Persoana("Presley", "Elvis", 75);
		
		Persoana[] persoane = new Persoana[]{p1, p2, p3, p4};
		
		for(int i=0; i<persoane.length; i++) {
			System.out.print(persoane[i].toString()+" ");
		}
		
		System.out.println();
		Arrays.sort(persoane);
		
		for(int i=0; i<persoane.length; i++) {
			System.out.print(persoane[i].toString()+" ");
		}
	}

}
