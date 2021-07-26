package JavaBasics1;

public class AbstractInheritedClass extends AbstractAircraftRules{

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		AbstractInheritedClass aic= new AbstractInheritedClass();
		aic.safetyGuidelines();
		aic.bodyColor();
		
		//AbstractAircraftRules aar= new AbstractAircraftRules(); // abstract classes cannot be instantiated 
	}
}
 