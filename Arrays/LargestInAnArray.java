public static int largestElement(int[] arr) {
   int largest = arr[0];
   for(int i = 1; i < arr.length; i++) { 
      if(a[i] > largest)
         largest = a[i];
   }
   return largest;
}

//Optimal Solution : O(N)
