import java.util.HashSet;
import java.util.Set;
public class findDuplicateElement {
static void duplicate(int arr[]){
    Set<Integer>uniqNumber =new HashSet<>();
    boolean isduplicateExist = false;
    for(int i=0; i<arr.length; i++){
        if (uniqNumber.contains(arr[i])){
            isduplicateExist = true;
            System.out.println("Duplicate element:" +arr[i]);
        }else {
            uniqNumber.add(arr[i]);
        }
    }
    if (! isduplicateExist){
        System.out.println(-1);
    }
}
    public static void main(String[] args) {
  int arr[]={1,5,4,2,1,4,2,7};
  duplicate(arr);
    }
}
