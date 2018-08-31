public class PeakIndexOfMountainArray{

     public static int findPeakIndex(int [] A) {
         int peakIndex = 0;
         //actually this is easy--just need to think when the content starts to decline, which means A[i+1] < A[i], so i is the peak index 
         //need to think about the bounds correctly--you can start i from 0, and compare i with i+1, then you need to think about the upper bound--however this probably isn't a problem in this particular case; the array is strickly a "mountain array" so the last element must not be the peak. 
         for (int i=0; i<A.length; i++) {
             if (A[i] > A[i+1]) {
                 peakIndex = i; 
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
