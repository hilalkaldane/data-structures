package list;

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
			head=new Node<>(data);
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
	public void forEach()
	{
		if(head!=null)
		{
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
}
