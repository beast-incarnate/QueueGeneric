import java.util.Scanner;

public class TestQueue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new Queue<>();
		boolean done = false;
		while(!done) {
			int opt = sc.nextInt();
			switch(opt){
				case 1: String s = sc.next();
						queue.add(s);
						break;
				case 2: String s1 = String.valueOf(queue.remove());
						System.out.println(s1);
						break;
				case 3: done = true;
						break;
			}
		}
		sc.close();
	}
}
