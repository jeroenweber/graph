import java.util.ArrayList;
import java.util.List;

public class Node {
	private int name;
	private List<Node> succ;
	
	public Node(int name)
	{
		name = name;
	}
	
	public void setNext(int name)
	{
		if (succ == null)
		{
			succ = new ArrayList<Node>();
		}
		succ.add(new Node(name));
	}

}
