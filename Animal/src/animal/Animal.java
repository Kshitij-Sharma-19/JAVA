 package animal;
// equals to inheritance code
public abstract class Animal {

	private int age; //VS public int age


	public Animal (int age) {
		this.age = age;
		System.out.println("An animal has been created!");
	}
	public abstract void eat();
	
	public void sleep() {
		System.out.println("An animal is sleeping");
	}
	
//	public abstract  void eat()
	public int getAge() {    // for private type of vars
		return age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		d.eat();
		c.eat();
//		d.ruff();
//		System.out.println(d.age);
//		c.meow();
//		System.out.println(c.age);
////		a.eat();
//		d.eat();
//		c.eat();
//		d.run();
//		c.prance();
		
//		//What happens if...
//		Animal o = new Dog();
//		o.
		
		//Casting -->
		Object dog = new Dog();
		Dog realDog = (Dog) dog;
		//god.   will not have Dog class methods
		realDog.ruff(); /*will have Dog class methods
		, cause it got converted to Dog by casting  */

		Object str = "est";
		String realS =(String) str;
		realS.getBytes();
		
		//What happens when
		Dog doggy = new Dog();
		if (doggy instanceof Animal) {
			Animal animal =(Animal) doggy; // Override methods still preserved
			animal.sleep();
		}
		doggy.sleep();

}
}