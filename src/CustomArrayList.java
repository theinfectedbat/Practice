
public class CustomArrayList {
	
	int []  myArray = new int[10];
	int counter = 1;
	
	
	
	public void add (int num) {
		if (counter == myArray.length) {	
			int [] myArrayCop = new  int[15];
			for (int i = 0; i <myArray.length; i ++) {
				myArrayCop[i]= myArray[i];
			}
			myArray = new int [myArrayCop.length];
			myArray= myArrayCop;
			myArray[counter-1]=num;
			myArrayCop= null;
			
			
		}
		else {
			myArray[counter-1]=num;
			counter++;
			
		}
		
		
	}
	
	public int get(int index) {
		
		return 0;
	}

}
