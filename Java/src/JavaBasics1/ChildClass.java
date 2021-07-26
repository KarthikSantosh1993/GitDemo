package JavaBasics1;

public class ChildClass extends ParentClass {
	
	/* for Overriding Methods -- if there is no child class method object calls parent class method 
	 * but if there is a child class method same as parent class method -- 
	 * local method gets first preference overriding parent class method
	 * 
	 */
	
	String name= "ChildClass KIA";
	public void getName() { 
		System.out.println(name); 			//child class variable is called 
		System.out.println(super.name);     //parent class variable as super keyword is mentioned 
	}
	public void engine() {
		
	}
	public void color() {
		System.out.println(color);    ///***** Color is a variable created in parent class accessible from child class
	}
	
	public static void main(String[] args) {
		
		ParentClass pc= new ChildClass();
		ChildClass cc= new ChildClass();
		cc.color();
		pc.breaks();     // calls parent class methods as return type of pc object is Parent class
		//pc.color();    // ****doesnot call color of child class as object is of parent type ****//
		cc.getName();
		
		
	}
	
}
