package CircleHomework;

public class Main {
	public static void main(String[] args) {
		LinkedList check = new LinkedList();
		check.add("a");
		check.add("b");
		check.add("c");

		if (check.isCircle() == true) {
			System.out.println("There is a circle in a list");
		} else {
			System.out.println("There is NOT a circle in a list");
		}
	}
}
