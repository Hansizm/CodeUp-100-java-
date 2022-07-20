import java.util.*;
public class CodeUp1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		n[0] = sc.nextInt();
		n[1] = sc.nextInt();
		n[2] = sc.nextInt();
		for(int i=0;i<3;i++) {
			if(n[i]%2==0) {
				System.out.println("even");
			}
			else { System.out.println("odd"); }
		}
	}
}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] n = new int[3];
//		n[0] = sc.nextInt();
//		n[1] = sc.nextInt();
//		n[2] = sc.nextInt();
//		for(int i=0;i<3;i++) {
//			if(n[i]%2==0) {
//				System.out.println("even");
//			}
//			else { System.out.println("odd"); }
//		}
//	}
