import java.util.*;
public class CodeUp1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("minus");
		}
		else { System.out.println("plus"); }
		if(n%2==0) {
			System.out.println("even");
		}
		else { System.out.println("odd"); }
	}
}
