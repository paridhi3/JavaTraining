package JavaBasicsPkg;

public class threeDarray {

	public static void main(String[] args) {
		int[][][] arr3d = {
	             {
	              {1,2,3,4},
                 {5,6,7,8},
                 {1,3,5,7} 			                  
	             } ,
	             {
	               {1,2,3,4},
	               {5,6,7,8},
	               {1,3,5,7}
	             }
	             
              };
		
//		for (int i = 0; i < arr3d.length; i++) {
//			for (int j = 0; j < arr3d[i].length; j++) {
//				for (int k = 0; k < arr3d[i][j].length; k++) {
//					System.out.print(arr3d[i][j][k] + " ");
//					}
//				System.out.println();
//				}
//			System.out.println();
//		}
		
	
		for(int[][] layer:arr3d) {
			for (int[] row : layer) {
		        for (int elem : row) {
		            System.out.print(elem + " ");
		        }
		        System.out.println();
		    }
	        System.out.println();
		}

	}
}
