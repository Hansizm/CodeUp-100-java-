import java.util.*;
public class CodeUp1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] count = new int[23];
		for(int i=0;i<23;i++) {
			count[i]=0;
		}
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
			count[(num[i]-1)]+=1; 
		}
		for(int i=0;i<23;i++) {
			System.out.print(count[i]+" ");
		}
	}
}
