package list;

public class LinkedList<T> {
	private Node<T> head;

	private int size = 0;

	/**
	 * Node class acts as a holder for each element in linked list.
	 */
	static class Node<T> {
		/**
		 * Generic variable "data" is used to store data in linked list.
		 */
		T data;

		/**
		 * next variable points to the next node linked in the linked list.
		 */
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedList() {
	}

	public void add(T data) {
		if (head == null) {
			head = new Node<>(data);
			size++;
		}
		else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
			size++;
		}
	}

	public void forEach() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public boolean removeElementAt(int position) {
		if (head != null) {
			if (position == 0) {
				head = head.next;
				return true;
			}
			else {
				if (position < size) {
					Node<T> current = head;
					while (position != 1 && current.next != null) {
						current = current.next;
					}
					if (null != current.next.next) {
						current.next = current.next.next;
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
}
