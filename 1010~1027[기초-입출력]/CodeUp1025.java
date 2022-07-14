import java.util.*;
public class CodeUp1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] data = Integer.toString(n).toCharArray();
		for(int i=0;i<Integer.toString(n).length();i++) {
			System.out.print("["+data[i]);
			for(int j=Integer.toString(n).length()-1;j>i;j--) {
				System.out.print("0");
			}
			System.out.println("]");
		}
	}
}	

