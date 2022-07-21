import java.util.*;
public class CodeUp1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char a = 'a';
		do {
			System.out.print(a+" ");
			a++;
		}while((int)c>=a);
	}
}
