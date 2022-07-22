import java.util.*;
public class CodeUp1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		array.sort(null);
		System.out.print(array.get(0));
	}
}
