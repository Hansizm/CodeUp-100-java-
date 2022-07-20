import java.util.*;
public class CodeUp1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=90) {
			System.out.print("A");
		}
		else if(n>=70 && n<90) {
			System.out.print("B");
		}
		else if(n>=40 && n<70) {
			System.out.print("C");
		}
		else if(n>=0 && n<40) {
			System.out.print("D");
		}
	}
}
