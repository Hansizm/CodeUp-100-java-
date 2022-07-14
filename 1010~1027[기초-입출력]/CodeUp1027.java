import java.util.*;
public class CodeUp1027 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		String str = sc.nextLine();
 		String[] data = str.split("\\.");
 		int day = Integer.parseInt(data[2]);
 		int min = Integer.parseInt(data[1]);
 		int year = Integer.parseInt(data[0]);
 		System.out.printf("%02d-%02d-%04d", day, min, year);
 	}
}	

