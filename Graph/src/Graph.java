import java.util.ArrayList;
import java.util.List;


public class Graph {
	private Node[] graph;
	private int current;
	
	public Graph()
	{
		graph = new Node[20];
		current = 0;
	}
	
	public void addNode(int start, int name)
	{
		if (start == current)
			graph[current++] = new Node(name);
		else
			graph[start].setNext(name);
	}

}
