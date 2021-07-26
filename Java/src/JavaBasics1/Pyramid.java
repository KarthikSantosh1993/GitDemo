package JavaBasics1;

public class Pyramid {
	
	public void pyramidNumbers() {
		
		int k=1;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=5-i;j++){
				
				System.out.print(k+ "\t");	
				k++;
			}
			System.out.print("\n");
		}
	}
		
	public void reversePyramidNumbers() {		
	int k=1;
	for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=i;j++){
			
			System.out.print(k+ "\t");	
			k++;
		}
		System.out.print("\n");
	}
	
	}
	
	public static void main(String[] args) {
		
		Pyramid p=new Pyramid();
		p.pyramidNumbers();
		System.out.println("\n");
		p.reversePyramidNumbers();
	
	}

}
/* output for pyramid 
1	2	3	4	
5	6	7	
8	9	
10
*/

/* output for reverse Pyramid:
 * 1
 * 2	3
 * 4	5	6
 * 7	8	9	10
 */
