package Firstdaydayassignment;

public class QuadraticEquation {
public static void main(String[] args) {
	int a[][] = {{1,1,1},{2,2,2}};
	int b[][] = {{1,1,1},{2,2,2}};
	
	int[][] c =new int[2][2];
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			c[i][j]=0;
			for(int k=0;k<2;k++) {
				c[i][j]+=a[i][j]*b[k][j];
					System.out.println(c[i][j]+"");
				}
			}
		}
	}
}
