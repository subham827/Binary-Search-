public class Ceiling {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,12,16,36,81};
        int target = 22;
        int low=0;
        int mid;
        int high = arr.length-1;
        while(low<=high){

        mid = (low+high)/2;

        if (arr[mid]==target) {
            System.out.println(arr[mid]);
            break;
            
        }else if(target>arr[mid]){
          if (mid+1<=high && target<=mid+1) {
              System.out.println(arr[mid+1]);
              break;
              
          }else{
              low = mid++;
          }
        }else{
            if(mid-1>=low && target>arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }else{
                high = mid--;
            }
        }

    }
}
}


