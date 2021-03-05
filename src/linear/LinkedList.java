package linear;

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
	public void add(T data)
	{
		addLast(data);
	}
	public void addLast(T data) {
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
	public void addFirst(T data)
	{
	if(head==null)
	{
		head = new Node<>(data);
		size++;
	}
	else
	{
		Node<T> firstNode= new Node<>(data);
		firstNode.next=head;
		head=firstNode;
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

	public T removeElementAt(int position) {
		if (head != null) {
			if (position == 0) {
				Node<T> toReturn=head;
				head = head.next;
				size--;
				return toReturn.data;
			}
			else {
				if (position < size) {
					Node<T> current = head;
					while (position != 1 && current.next != null) {
						current = current.next;
					}
					if (null != current.next.next) {
						Node<T> toReturn = current.next;
						current.next = current.next.next;
						size--;
						return toReturn.data;
					}
					else {
						return null;
					}
				}
				else {
					return null;
				}
			}
		}
		else {
			return null;
		}
	}
	public int size()
	{
		return this.size;
	}
	public T getElementAt(int position)
	{
		if(head!=null) {
			Node<T> current=head;
			while (position != 0&& position<size) {
				current=current.next;
				position--;
			}
			if(position>=size)
			{
				return null;
			}
			else
			{
				return current.data;
			}
		}
		else
		{
			return null;
		}
	}
}
