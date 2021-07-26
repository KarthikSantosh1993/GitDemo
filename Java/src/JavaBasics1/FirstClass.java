package JavaBasics1;

public class FirstClass {

	static int a= 4;
	
	public void getData() {
		int a =10;
		int b= 4;
		int c;
		c= a+b;
		System.out.println("adding a and b gives =" + c);

	}
	public static void main(String[] args) {		
		System.out.print("Hi");             // Prints a string "Hi" after printing cursor stays in same line 
		System.out.println("Hello World");  // Prints a string "Hello World" after printing cursor moves to next line  
		System.out.print("hello!");         // Prints a string "hello" and cursor doesn't move to next line 
		System.out.println(a);              // Prints variable a
		
		FirstClass fc=new FirstClass();       // creating object for FirstClass
		SecondClass sc= new SecondClass();  // creating object for SecondClass 
		fc.getData();                         // calling method 
		sc.setData();
		System.out.println(fc.getClass());    ///get class name 
} 
}