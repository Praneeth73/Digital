package digital;


import java.util.ArrayList;
import java.util.List;

public class Arrayset {
static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
	List<Integer> result =new ArrayList<Integer>();
        int counta  = 0 ;
        int countb = 0 ;
//        if( a.size() != b.size() ){
//            return result;
//        }
        
        for(int i= 0 ; i<a.size();i++  ){
            if(a.get(i) > b.get(i)){
                counta++;
            }
            if(a.get(i) < b.get(i)){
                countb++;
            }
          
        }
        result.add(counta);
        result.add(countb);
        return result;
    }

public static void main(String args[]) {
	List<Integer> a = new ArrayList<Integer>();
	a.add(5); 
    a.add(6); 
    a.add(7); 
 
	
	List<Integer> b = new ArrayList<Integer>();
	b.add(3); 
    b.add(6); 
    b.add(10); 
    
    System.out.println(compareTriplets(a, b));
}
}
