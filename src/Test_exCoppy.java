
public class Test_exCoppy {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Masina masina = new Masina("BMW", "Rosu");
		Student studentOriginal = new Student("Burian", "Andrei", masina);
		
///Shallow copy 
		System.out.println("Orignal : "+studentOriginal.getNume()+" "+studentOriginal.getPrenume()+" are "+studentOriginal.getMasina());
	
		Student studentCopie = (Student)studentOriginal.clone();
		System.out.println("Copie : "+studentCopie.getNume()+" "+studentCopie.getPrenume()+" are "+studentCopie.getMasina());
		System.out.println();
		
		studentOriginal.setNume("Rus");
		studentOriginal.masina.setCuloare("Alb");
		System.out.println("Copie : "+studentCopie.getNume()+" "+studentCopie.getPrenume()+" are "+studentCopie.getMasina());
		System.out.println("Orignal : "+studentOriginal.getNume()+" "+studentOriginal.getPrenume()+" are "+studentOriginal.getMasina());
		System.out.println();
		
	
	/// Deep copy 
		
		Masina masina2 = new Masina("Mercedes","Negru");
		Student student2Original = new Student("Rus", "Simona", masina2);
		
		Student student2Copie = (Student)student2Original.clone();
		System.out.println("Original : "+student2Original.getNume()+" "+student2Original.getPrenume()+" are "+student2Original.getMasina());
		System.out.println("Copie : "+student2Copie.getNume()+" "+student2Copie.getPrenume()+" are "+student2Copie.getMasina());
		System.out.println();
		
		student2Original.setPrenume("Maria");
		student2Original.masina.setCuloare("Gri");
		System.out.println("Original : "+student2Original.getNume()+" "+student2Original.getPrenume()+" are "+student2Original.getMasina());
		System.out.println("Copie : "+student2Copie.getNume()+" "+student2Copie.getPrenume()+" are "+student2Copie.getMasina());
		
	}
	
	

}
