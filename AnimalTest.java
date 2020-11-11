package oops;

abstract class Animal{
	
	public abstract void amimalSound();
	
	private String animalName;
	public String getAnimalName() {
		
		return animalName;
	}
	public void setAnimalName(String name) {
		
		animalName=name;
	}
	
}
class Pet extends Animal{

	@Override
	public void amimalSound() {
		System.out.println("The Sound of the pet is woof!");
		
	}
		
}
public class AnimalTest {

	public static void main(String[] args) {
	
		Pet p=new Pet();
		p.setAnimalName("Tommy");
		System.out.println(p.getAnimalName());
		p.amimalSound();
	}

}
