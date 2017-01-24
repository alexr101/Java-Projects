package QuickSort;

public class QuickSort {
	
	//Worst case run time of O(n2)
	//Best case run time of O(log n);
	public void merge(int[] arr, int start, int end){
		if(end > start){
			//partition point
			int pp = partition(arr, start, end);
			merge(arr, start, pp-1);
			merge(arr, pp+1, end);
		}
		
	}
	
	public int partition(int[] arr, int start, int end){
		
		int pivot = arr[end];
		int i = start-1;
		
		//int j = start
		for(int j = start; j < end-1; j++){
			if(arr[j] < pivot){
				i++;
				int jval = arr[j];
				int ival = arr[i];
				arr[j] = ival;
				arr[i] = jval;
			}
		}
		
		int ival = arr[i+1];
		arr[end] = ival;
		arr[i+1] = pivot;
		
		//the pivot is the guaranteed array element that is in the 
		//correct sorted position
		return i+1;
		
	}
}
