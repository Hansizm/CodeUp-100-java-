import java.util.*;
public class CodeUp1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		String[] str = Float.toString(f).split("\\.");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		System.out.print(a+"\n"+b);
	}
}	

