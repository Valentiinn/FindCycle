package Node;

public class CustomLinkedList<E> {

	private Node first;
	private Node last;

	private class Node {
		E value;
		Node next;
		boolean bool;
	}

	public void add(E value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		node.bool = false;

		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public E poll() {
		E out = first.value;
		first = first.next;
		return out;
	}

	public E peek() {
		return first.value;
	}

	public boolean isCircle() {
		Node check = this.first;

		while (check != null) {

			if (check.bool == false) {
				check.bool = true;
			} else {
				return true;
			}
			check = check.next;
		}
		return false;
	}
}
