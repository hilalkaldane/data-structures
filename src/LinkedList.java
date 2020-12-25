public class LinkedList<T> {
	private Node<T> head;
	static class Node<T>
	{
		T data;
		Node<T> next;
		Node(T data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public LinkedList() {
	}

	public void add(T data)
	{
		if(head==null)
		{
			head.next=null;
			head.data=data;
		}
		else
		{
			Node<T> current= head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=new Node(data);

		}
	}
	void forEach()
	{
		if(head!=null)
		{
			Node current=head;
			while(current.next!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
}
