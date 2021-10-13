public class FindElement {
    public static void main (String[] args){
        int arr[] = {5,4,3,2,1};
        int target = 4;
        int targett =90;
        int low=0;
        int high = arr.length-1;
     
        System.out.println(Searchelement(arr, target));
        System.out.println(Searchelementbyrecursion(arr, targett, low,high));
    }
    // by iteration 
    public static int Searchelement(int arr[], int target){
        int high =0;
        int low = arr.length-1;
        while(high<=low){
            int mid = (low+high)/2;
            if (arr[mid] == target) {
                return mid;
                
            }else if(target>arr[mid]){
                low =mid--;

            }
            else{
                low=mid--;
                
            }
        }
        return -1;


    }
    // by recursion
    public static int Searchelementbyrecursion(int [] arr, int target, int low,int high){
        if (low>high) {
            return -1;
            
        }
        int mid = (low+high)/2;
        if (arr[mid]==target) {
            return mid;
            
        }else if(arr[mid]<target){
           return Searchelementbyrecursion(arr, target, mid+1, high);
        }else{
            return Searchelementbyrecursion(arr, target, low, mid-1);
            
        }


    }
    
    
}
