package MergeSort;

public class MergeSort {
	public void merge(int[] arr, int start, int end){
		if(end < start){
			return;
		}
		
		int mid = (start + end)/2;
		merge(arr, start, mid-1);
		merge(arr, mid, end);
		sort(arr, start, mid, end);
	}
	
	public void sort(int[] arr, int start, int mid, int end){
		//This will get the amount of elements needed for the array
		//do the math for this...5, 6, 7, 8
		//5 - 8 + 1 = 4 ...yup looks right! :)
		int[] tempArr = new int[end - start + 1];
		
		int leftSlot = start;
		int rightSlot = mid + 1;
		//k will be the index position of temp array
		int k = 0;
		while(leftSlot <= mid && rightSlot <= end){
			if(arr[leftSlot] < arr[rightSlot]){
				tempArr[k] = arr[leftSlot];
				leftSlot++;
			} else {
				tempArr[k] = arr[rightSlot];
				rightSlot++;
			}
			
			k++;
		}
		
		//Now that we're here one of the sides has been completely evaluated
		//So we only have either the right or left side left
		while(leftSlot <= mid){
			tempArr[k] = arr[leftSlot];
			leftSlot++;
			k++;
		}
		
		while(rightSlot <= end){
			tempArr[k] = arr[rightSlot];
			rightSlot++;
			k++;
		}
		
		//Now we have the sorted portion in temp array, but not in the 
		//main array
		for(int i = 0; i < tempArr.length; i++){
			//think about it...[5, 6, 7]
			//start+i = 5 + 0; :)
			arr[start+i] = tempArr[i];
		}
		
		
		
		
	}
}
