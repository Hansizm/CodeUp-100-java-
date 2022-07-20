import java.util.*;
public class CodeUp1069 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch(c) {
		case 'A':
			System.out.print("best!!");
			break;
		case 'B':
			System.out.print("good!!");
			break;
		case 'C':
			System.out.print("run!");
			break;
		case 'D':
			System.out.print("slowly~");
			break;
		default: 
			System.out.print("what?");
			break;
		}
	}
}
