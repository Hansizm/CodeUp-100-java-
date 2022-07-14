import java.util.*;
public class CodeUp1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] data = new char[20];
		for(int i=0;i<str.length();i++) {
			data[i] = str.charAt(i);
			System.out.println("\'"+data[i]+"\'");
		}
		
	}
}	

