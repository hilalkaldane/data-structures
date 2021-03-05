package nonlinear;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Graph {
	private List<List<Integer>> adjacencyList;
	private int initialCapacity=10;
	public Graph()
	{
		if (adjacencyList==null)
		{
			adjacencyList= new ArrayList<>(initialCapacity);
			for(int i=0;i<initialCapacity;i++)
			{
				adjacencyList.add(new LinkedList<>());
			}
		}
	}
	public void addVertice(Integer vertice,Integer edge)
	{
		if(vertice>=initialCapacity)
		{
			initialCapacity=initialCapacity+10;
			for(int i=0;i<10;i++)
			{
				adjacencyList.add(new ArrayList<>());
			}
		}
		if(null==adjacencyList.get(vertice))
		{
			adjacencyList.add(vertice,new ArrayList<>());
		}
			adjacencyList.get(vertice).add(edge);
	}
	public void printGraph()
	{
		for(int i=0;i<adjacencyList.size();i++)
		{
			if(adjacencyList.get(i)!=null) {
				System.out.println("Adjacent nodes for node " + i);
				adjacencyList.get(i).stream().iterator().forEachRemaining(integer -> {
					System.out.println(integer);
				});
			}
		}
	}
	public void BFS()
	{
		Queue<Integer> bfsQueue= new LinkedList();
		Set<Integer> visitedSet= new HashSet<>();
		bfsQueue.add(0);
		visitedSet.add(0);

		while(!bfsQueue.isEmpty())
		{
			Integer currInteger = bfsQueue.remove();
			System.out.println(currInteger);
			for(int i=0;i<adjacencyList.get(currInteger).size();i++)
			{
				if(!visitedSet.contains(adjacencyList.get(currInteger).get(i)))
				{
					bfsQueue.add(adjacencyList.get(currInteger).get(i));
					visitedSet.add(adjacencyList.get(currInteger).get(i));
				}
			}
		}

	}
}
