import java.util.*;
public class CodeUp1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] board = new int[h+1][w+1];
		for(int i=0;i<n;i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(d==0) {
				for(int j=0;j<l;j++) {
					board[x][y+j]=1;
				}
			}
			else {
				for(int j=0;j<l;j++) {
					board[x+j][y]=1;
				}
			}
		}
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=w;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
