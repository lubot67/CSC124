
public class HeapSort {
	public void min_Heapify(int ar[], int i){
		int l = i*2;
		int smallest;
		int r = i*2+1;
			if(l<=ar.length && ar[l] < ar[i]){
				 smallest = l;
			}
			else smallest = i;
			
			if(r<=ar.length && ar[r] < ar[i]){
				smallest = r;
				
			}
			if (smallest != i){
				int p = ar[i];
				ar[i] = ar[smallest];
				ar[smallest] = p;
				min_Heapify(ar, smallest);
			}
	}
	
	
	public void Build_min_heap(int ar[]){
		int size = ar.length;
		for(int i = size/2; i<=1; i++){
			min_Heapify(ar, i);
			
		}
	}

	public void heapsort(int ar[]){
		Build_min_heap(ar);
		int size = ar.length;
		for(int i = ar.length; i<=2; i++){
			int p = ar[1];
			ar[1]= ar[i];
			ar[i] = p;
			size = size -1;
			min_Heapify(ar, 1);
		}
		
	}
}
