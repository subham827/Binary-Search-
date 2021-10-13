public class PositioninInfiniteArray {
 public static void main(String[] args) {
    int a[] = {1,3,7,8,12,58,72,78,79,96,101,102,109};
    // just consider this as a really big array
    int target = 58;
    System.out.println(searchInfinite(a,target)); 

        
    }
    public static int searchInfinite(int [] a,int target) {
        int low =0;
        int high=1;
        while(a[high]<target){
            low=high;
            high= 2*high;
        }
        return binarySearch(a,target,low,high);
        
    }
    public static int binarySearch(int[] a,int target,int low,int high) {
        if (low>high) {
            return -1;
            
        }
        int mid = (low+high)/2;
        if (a[mid]==target) {
            return mid;
            
        }else if(a[mid]<target){
           return binarySearch(a, target, mid+1, high);
      
        }else{
            return binarySearch(a, target, low, mid-1);
            
        }



        
    }
    
}
