import java.util.*;
public class CodeUp1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[20][20];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			board[x][y]=1;
		}
		for(int i=1;i<20;i++) {
			for(int j=1;j<20;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
