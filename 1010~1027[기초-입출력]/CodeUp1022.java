import java.util.*;
public class CodeUp1022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] data = new char[2000];
		for(int i=0;i<str.length();i++) {
			data[i] = str.charAt(i);
			System.out.print(data[i]);
		}
		
	}
}	

