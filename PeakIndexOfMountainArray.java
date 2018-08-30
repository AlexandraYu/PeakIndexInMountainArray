public class PeakIndexOfMountainArray{

     public static int findPeakIndex(int [] A) {
         int peakIndex = 0;
         //actually this is easy--just need to think about the bound correctly, such as if starting i with 0, then we can't compare i with i-1, b/c i-1 will be out of bound. If we start i from 1, we can avoid this problem.
         // you can also use i fro 0, and compare i with i+1, then you need to think about the upper bound--however this probably isn't a problem in this particular case; the array is strickly a "mountain array" so the last element must not be the peak. 
         for (int i=1; i<A.length; i++) {
             if (A[i-1] > A[i]) {
                 peakIndex = i-1; 
                 break; 
             }
         }
         return peakIndex; 
     }
     public static void main(String []args){
         int[] array = {1, 2, 3, 5, 7, 4, 3};
         int answer = 0; 
         answer=findPeakIndex(array); 
         
         System.out.println("Peak index is: "+answer+"\n");
     }
}