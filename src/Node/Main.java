package Node;

public class Main {
	public static void main(String[] args) {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		// System.out.println(list.peek());
		if (!list.isCircle() == true) {
			System.out.println("Circle");
		} else {
			System.out.println("Isn`t circle");
		}
	}
}
