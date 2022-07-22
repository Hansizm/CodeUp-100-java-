import java.util.*;
public class CodeUp1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[11][11];
		int x=2, y=2;
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				int n = sc.nextInt();
				board[i][j]=n;
			}
		}
		while(x<11 && y<11) {
			if(board[y+1][x]==2) {
				board[y][x]=9;
				board[y+1][x]=9;
				break;
			}
			else if(board[y][x+1]==2) {
				board[y][x]=9;
				board[y][x+1]=9;
				break;
			}
			else if(board[y][x+1]==1) {
				board[y][x]=9;
				y++;
			}
			else if(board[y][x+1]==0) {
				board[y][x]=9;
				x++;
			}
		}
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
