package Firstdaydayassignment;

public class SelectionSortingAlgoritham {
	static void bubbleSort(int[] arr) {  
		int k = arr.length;  
		int result;  
		for(int i=0; i<k; i++)
		{  
        for(int j=1;j<(k-i);j++)
        { 
        if(arr[j-1] > arr[j])
        {  
        result = arr[j-1];  
        arr[j-1] = arr[j];  
        arr[j] = result;  
     }  
   }  
 }  
}  
    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
             System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
              } 
           }



