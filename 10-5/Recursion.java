public class Recursion{
	
	public static void initArray(){
		//int[] array = {1,2,3,4,5};
		//printArray(new int[] {1,2,3,4,5});
		//System.out.println("-----");
		int[] array = null;
		array = new int[10];
		for(int i=0; i<10; i++){
			array[i] = i;
		}
		printArray(array);
		
	}
	
	public static void printArray(int[] array){
		
		for(int item : array){//for-each
			System.out.println(item);
		}
		System.out.println("-----");
		for(int i=0; i<array.length; i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		initArray();
	}
}

