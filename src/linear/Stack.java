package linear;

public class Stack<T> {
	private LinkedList<T> linkedList;

	public void push(T data) {
		if (linkedList == null) {
			linkedList = new LinkedList<>();
		}
		linkedList.addFirst(data);
	}
	public T pop()
	{
		return linkedList.removeElementAt(0);
	}
	public T peek()
	{
		return linkedList.getElementAt(0);
	}
	public boolean isEmpty()
	{
		if(linkedList.size()>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
