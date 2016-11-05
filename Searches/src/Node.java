import java.util.LinkedList;

public class Node {
	char data;
	LinkedList<Node> adjacentNodes;
	
	public Node(char value) {
		data = value;
		adjacentNodes = new LinkedList<Node>(); 
	}
	
	public void addNeighbor(Node node) {
		if(node == null) {
			return;
		}
		
		if(!adjacentNodes.contains(node)) {
			adjacentNodes.add(node);
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Node ");
		sb.append(data);
		sb.append(" -> {");
		
		for(Node node: adjacentNodes){
			sb.append(" ");
			sb.append(node.data);
		}
		
		sb.append(" }");
		return sb.toString();
	}
}
