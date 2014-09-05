
public class Sort {
	public void selectionSort(int[] ar){
		int i, j, minj, minx;
		for(i=0; i<ar.length-1; i++){
			j=i;
			minx=ar[i];
			
				for(j=i+1; j<ar.length; j++){
					if(ar[j]<minx){
						minj=j;
						minx=ar[j];
						ar[minj]=ar[i];
						ar[i]=minx;
						
					}
				}
		}
	}

}
