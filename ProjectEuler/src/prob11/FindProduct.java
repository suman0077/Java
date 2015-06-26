package prob11;

public class FindProduct {
	
	public long findGreatestProduct(int[][] array){
		
		long maxProduct = 1;
		long rowProduct = 1;
		long columnProduct = 1;
		int i,j = 0;
		for(i =0; i<4; i++){
			for(j =0; j<4; j++){
			
				rowProduct = rowProduct*array[i][j];
				columnProduct = columnProduct*array[j][i];
				
			}
			if(rowProduct>columnProduct){
				
				maxProduct = rowProduct;
			}
			else{
				
				maxProduct = columnProduct;
			}
			
			 maxProduct = 1;
			 rowProduct = 1;
			
		}	
		
		long diagonal1 = 1;
		long diagonal2 = 1;
		for(i =3,j=0; i>=0 ; i--){
				
				diagonal1=diagonal1*array[j][j];
				diagonal2=diagonal2*array[i][j];	
				
				j++;
			}
		if(diagonal1>maxProduct){
			
			maxProduct = diagonal1;
			
		}
		if(diagonal2>maxProduct){
			
			maxProduct = diagonal2;
		}

		return maxProduct;
		
	}
	
//	public class findSum()

}
