import java.util.Scanner;
public class Cycle1P2{
	 public static void main(String[] args){
    		System.out.println("Akshay Unni M V\n23mca010\ndt:14/02/2024\nMatrixADD");
		Scanner matObj=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=matObj.nextInt();
		System.out.println("enter the number of columns");
		int col=matObj.nextInt();
		int[][] mat1= new int[row][col];
		int[][] mat2= new int[row][col];
		int[][] add= new int[row][col];
		System.out.println("enter the elements of the first matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat1[i][j]=matObj.nextInt();
			}
		}
		System.out.println("the first matrix is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter the elements of the second matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat2[i][j]=matObj.nextInt();
			}
		}
		System.out.println("the Second matrix is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				add[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("the resultant matrix:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		matObj.close();
	}
}
		