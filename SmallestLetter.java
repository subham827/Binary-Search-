public class SmallestLetter {
    public static void main(String[] args ) {
        char[] letters = {'c','f','g'};
        char target = 'i';
        Ceiling(letters, target);
        
    }
    public static void Ceiling(char[] letters, char target) {
        int low=0;
        int high = letters.length-1;
        int mid;
        while(low<=high){
            if(Character.compare(target, letters[high])>=0){
                System.out.println(letters[0]);
                break;
            }
            mid= (low+high)/2;
            int comp=Character.compare(target, letters[mid]);
            if (comp>=0) {
                if (Character.compare(target, letters[mid+1])<0 && mid+1<=high) {
                    System.out.println(letters[mid+1]);
                    
                    break;

                    
                }else{
                    low=mid++;
                }
                
            }else if(comp<0){
                if (Character.compare(target, letters[mid-1])>0 && mid-1>=low) {
                    System.out.println(letters[mid]);
                    
                    break;
                    
                }else{
                    high=mid--;
                }
            }
        

        }
        
        
    }
    
}
