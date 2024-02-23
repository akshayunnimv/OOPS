import java.util.Scanner;
public class Cycle1P4{
	 public static void main(String[] args){
    		System.out.println("Akshay Unni M V\n23mca010\ndt:14/02/2024\nMatrixsymmetry");
		Scanner matObj=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=matObj.nextInt();
		System.out.println("enter the number of columns");
		int col=matObj.nextInt();
		int[][] mat= new int[row][col];
		System.out.println("enter the elements of the  matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=matObj.nextInt();
			}
		}
		System.out.println("the  matrix is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int flag=0;
		
		if(row!=col){
			System.out.println(" A non-square matrix cannot be symmetric");
		}
		else if(row==col){
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					if(mat[i][j]==mat[j][i]){
						flag=flag+1;
					}
				}
			}
		}
		if(flag==(row*col)){
			System.out.println("the matrix is symmetric");
		}
		else{
			System.out.println("the matrix is not symmetric");
		}
		matObj.close();
	}
}
		
					
		
			