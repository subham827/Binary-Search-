public class Mountarray {
    public static void main(String[] args) {
        
        int [] a = {20,30,40,50,60,10,5,2,1};
        
        int low=0;
        
        int high = a.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if (a[mid]>=a[low] && a[mid]<a[mid-1]) 
                 {
                     high=mid;
                    }
                else if (a[mid]>a[mid+1] && mid+1<=a.length-1) {
                        System.out.println(mid);
                      
                        break;

                        
                    }else{
                        low=mid++;
                    }
                
                
            }
        }
       
    
        }
        

    
    

