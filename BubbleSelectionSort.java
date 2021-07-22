package Homeworks;

public class BubbleSelectionSort {

	private static final int j = 0;

	public static void main(String[] args) {
//	// BUBLE SORT
	int [] arr = {21,3,22,31,33,11,29};
		int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {		
			if(arr[i] > arr[j]) {
				temp= arr[i];
				arr[i] = arr[j];
		arr[j]= temp;
		}
	}
	}
		for(int a : arr) {
		System.out.println(a);
		// }
		// Selection Sort
		int [] arr2 = {21,33,11,31,25,1,4,6};
		int n = 7;
		for(int i=1;i<=n;i++)
		{
			for(int j = 0; j<(n-1); j++);
			{
		int k = j+1;
		int a1 = arr2[j];
		int b = arr2[k];
		if(b<a1)
		{
			int temp1= a1;
			int temp2=b;
			arr2[j]= b;
			arr2[k]= a1;
			
		}
		
		}
		}
		for(int d=0;d<n;d++)
			System.out.println(arr2[d]+ " ");
	}
	}
}

	
		
		


