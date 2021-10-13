public class Rotatedarray {
    public static void main(String[] args) {
        int [] a = {20,30,40,50,60,5,10};
        // this array is 5 times rotated , which means initial array was 5,10,20,30,40,50,60
        int target  =20;
        System.out.println(bsearch(a,target));
              
        
    }
    public static int bsearch(int[] a, int target) {
        int low=0,high=a.length-1;
        while (low<=high) {
            int mid = low+high/2;
            if (a[mid]==target) {
                return mid;
                
            }
            if (a[low]<a[mid]) {
                if (target>=a[low] && target<a[mid]) {
                    high = mid-1;

                    
                }else{
                    low=mid++;
                }
                
            }else{
                if (target>a[mid] && target<=a[high]) {
                    low = mid+1;

                    
                }else{
                    high= mid-1;
                }
            }
        }
        return -1;
        
    }

    
}
