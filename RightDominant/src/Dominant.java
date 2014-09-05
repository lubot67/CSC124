
import java.util.ArrayList;

public class Dominant {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void rightelem (int[] array){
		 

		 
	          for(int i=0; i < array.length; i++){
	              int a = array[i];
	             for(int j=i+1;j < array.length; j++){ 
	                 if(a < array[j]){
	                     break;
	                 } 
	                 if(j == array.length-1){
	                     list.add(a);
	                 }
	             }
	          }
	          
	      //   System.out.print(list.size());
	          /*
	         System.out.println();
	          for(int k = 0; k< list.size();k++){
	              System.out.print(list.get(k)+" ");
	          }
	          */
	     }
}

