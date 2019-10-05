public class BinarySearch{
	/*public static int binarySearch(int[] array, int key) {
		int leftArray = array[0];//leftArray,rightArray都是下标！！
		int rightArray = array[array.length];
		int midArray = (rightArray - leftArray) / 2;//每次循环都会改变，要重新算
		//为了防止溢出，
		int midArray = leftArray + (rightArray - leftArray)/2;
		
		while(leftArray <= rightArray){
			if(key > array[midArray]){
				leftArray = midArray;
			}else if(key < array[midArray]){
				rightArray = midArray;
			}else{
				return midArray;
			}
		}
		return -1;
	}
	*/
	
	public static int binarySearch(int[] array, int key) {
		int leftArray = 0;
		int rightArray = array.length;
		
		//[leftArray, rightArra)区间还有数继续循环
		while(leftArray < rightArray){
			
			int midArray = leftArray + (rightArray - leftArray)/2;
			
			if(key == array[midArray]){
				return midArray;
				
			}else if(key < array[midArray]){
				rightArray = midArray;
			}else{
				leftArray = midArray + 1;
			}
		}
		return -1;
}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		int index1 = binarySearch(array,7);
		System.out.println("7 的下标是：" + index1);
	}
}


	

