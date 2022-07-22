import java.util.*;
public class CodeUp1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[20][20];
		for(int i=1;i<20;i++) {
			for(int j=1;j<20;j++) {
				int ball = sc.nextInt();
				board[i][j]=ball;
			}
		}
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=1;j<20;j++) {
				if(board[x][j]==0) {
					board[x][j]=1;
				}
				else {board[x][j]=0;}
			}
			for(int k=1;k<20;k++) {
				if(board[k][y]==0) {
					board[k][y]=1;
				}
				else {board[k][y]=0;}
			}
					
		}
		for(int i=1;i<20;i++) {
			for(int j=1;j<20;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
