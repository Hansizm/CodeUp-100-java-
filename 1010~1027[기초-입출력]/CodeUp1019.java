import java.util.*;
public class CodeUp1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] st = str.split("\\.");
		int x = Integer.parseInt(st[0]);
		int y = Integer.parseInt(st[1]);
		int z = Integer.parseInt(st[2]);
		System.out.printf("%d.%02d.%02d", x, y, z);
		System.out.print(.);
	}
}	

