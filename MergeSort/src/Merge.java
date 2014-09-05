
public class Merge {
	public void mergeSort(int[] ar, int p, int r){
		int q;
		if (p<r){
		q = ((p+r)/2);
			mergeSort(ar, p , q);
			mergeSort(ar, q+1, r);
			merge(ar, p ,q ,r);
		}

		
	}
	public void merge(int[] ar, int p, int q, int r){
		int n1 = q-p+1;
		int n2 = r-q;
		
		
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i=0; i<n1; i++){
			L[i]=ar[p+i];
		}
		for(int j=0; j<n2; j++){
			R[j]= ar[q+j+1];
			
		}
		
		int j = 0;
		int i = 0;
		int k;
		
			for (k=p; k<r; k++){
				if (L[i] <= R[j]){
					ar[k] = L[i];
					i++;
					if(i==L.length){
						k++;
						break;
					}
					}
				else{ ar[k]= R[j];
				j++;
				if(j>=R.length){
					k++;
					break;
				}
				}
			}
			for(int a= i;a<L.length;a++){
				ar[k]=L[a];
				k++;
			}
		for (int b=j; b<R.length;b++){
			ar[k]= R[b];
			k++;
		}
	}
}
