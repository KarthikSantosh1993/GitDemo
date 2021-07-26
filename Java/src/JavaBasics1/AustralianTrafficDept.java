package JavaBasics1;

public class AustralianTrafficDept implements InterfaceTrafficRules{

	@Override
	public void greenGO() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		
	}
	public void walkBlinkToWalk() {
		//this is an AustralianTrafficDept method 
	}
	public static void main(String[] args) {
		InterfaceTrafficRules tr=new AustralianTrafficDept();  //*****can be used to create and call interface methods but not class methods****//
		tr.redStop();
		AustralianTrafficDept ar= new AustralianTrafficDept(); //can be used to call  class methods and interface methods ****//
		ar.walkBlinkToWalk();  
		
		
	}
}
