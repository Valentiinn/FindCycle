package CircleHomework;

public class LinkedList {
	private Node first;
	private Node last;

	private class Node {
		Node next;
		String value;
		boolean ch;
	}

	// public LinkedList() {
	// Node node0 = new Node();
	// Node node1 = new Node();
	// Node node2 = new Node();
	//
	// first = node0;
	//
	// node0.value = "a";
	// node0.next = node1;
	// node0.ch = false;
	//
	// node1.value = "b";
	// node1.next = node2;
	// node1.ch = false;
	//
	// node2.value = "c";
	// node2.next = node1;
	// node2.ch = false;

	// last = null;
	// }

	public void add(String value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		node.ch = false;

		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public boolean isCircle() {
		Node checking = this.first;

		while (checking != null) {

			if (checking.ch == false) {
				checking.ch = true;
			} else {
				return true;
			}
			checking = checking.next;
		}
		return false;
	}
}
