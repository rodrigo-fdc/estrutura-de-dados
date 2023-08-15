package app;

import java.util.LinkedList;

public class Program {

	public static boolean isCircular(LinkedList<Integer> list) {
		if (list.isEmpty()) {
			return false;
		}

		LinkedList<Integer> slow = list;
		LinkedList<Integer> fast = list;

		while (fast != null && fast.size() > 1) {
			slow = getNextOrNull(slow, 1);
			fast = getNextOrNull(fast, 2);

			if (slow == fast) {
				return true;
			}
		}
		return false;

	}

	private static LinkedList<Integer> getNextOrNull(LinkedList<Integer> list, int steps) {
		LinkedList<Integer> current = list;
		for (int i = 0; i < steps && current != null; i++) {
			current = current.isEmpty() ? null : current.getNext();
		}
		return current;
	}

	public static void main(String[] args) {
		LinkedList<Integer> circularList = new LinkedList<>();
		circularList.add(1);
		circularList.add(2);
		circularList.add(3);

		// Tornando-a circular (último nó aponta para o primeiro)
		circularList.getLast().setNext(circularList.getFirst());

		// Verificando se é uma Linked List circular
		System.out.println(isCircular(circularList)); // Deve imprimir true
	}
}
