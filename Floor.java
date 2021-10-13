public class Floor {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9,11,23,24};
        int target = 12;
        int mid,low=0;
        int high = arr.length-1;
        while (low<=high) {
            mid=(high+low)/2;
            if (arr[mid]==target) {
                System.out.println(arr[mid]);
                break;
                
            }
            else if(arr[mid]<target){
                if (arr[mid+1]>target && mid+1<=high) {
                    System.out.println(arr[mid]);
                    break;
                    
                }else{
                    low=mid++;
                }
            }else{
                if (arr[mid-1]<=target && mid-1>=low) {
                    System.out.println(arr[mid-1]);
                    break;
                    
                }else{
                    high=mid--;
                }
            }
            
        }
        
    }
    
}
