package Stack;

public class Stack {

	private String[] array;
	private int index;
	private static final int SIZE = 5;

	Stack() {
		array = new String[SIZE];
		index = -1;
	}

	public void push(String element) throws StackFullException {
		if (index == SIZE - 1)
			throw new StackFullException("FullException!!!");
		index++;
		array[index] = element;
	}

	public String pop() throws StackEmpetyException {
		if (index < 0) {
			throw new StackEmpetyException("Empty Exception");
		}
		index--;
		String element = null;
		array[index] = element;
		return element;
	}

	public String toString() {
		String str = new String();
		for (String var : array)
			if (var != null)
				str += var + ',';
		return str;

	}

}
