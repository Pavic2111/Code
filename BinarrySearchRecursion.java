package Homeworks;

public class BinarrySearchRecursion {

	public static int BinarySearchWithRecursion(int []arr , int key , int first , int last) {
		
		if (last>=first) {
			int mid =(first+last)/2;
			if(arr[mid]<key) {
				first = mid +1;
			return 	BinarySearchWithRecursion(arr, key, first, last);
			} else if (arr[mid] == key) {
				return mid;
			} else {
				last = mid -1;
				return BinarySearchWithRecursion(arr, key, first, last);
			}
		
		} 
		return -1;
	}
	public static void main(String[] args) {
	 System.out.println("index of my search element : " + BinarySearchWithRecursion(new int [] {1,2,3,8,9}, 70, 0, 4));
	 System.out.println("index of my search element :  " + BinarySearchWithRecursion(new int [] {1,2,3,8,9}, 8, 0, 4));
	 System.out.println("index of my search element : "+ BinarySearchWithRecursion(new int [] {1,2,3,8,9}, 5, 0, 4));
	}
	}

