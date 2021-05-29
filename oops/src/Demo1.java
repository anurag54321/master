class Animal
{
	Animal()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal
{
	Dog()
	{
		System.out.println("Dog");
	}
}
public class Demo1 {

	public static void main(String[] args) 
	{
		Animal a = new Dog();
		

	}

}
