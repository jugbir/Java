import java.util.LinkedList;
import java.util.Stack;

public class DFS {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		Node nodeA = new Node('A');
		Node nodeB = new Node('B');
		Node nodeC = new Node('C');
		Node nodeD = new Node('D');
		Node nodeE = new Node('E');
		Node nodeF = new Node('F');
		Node nodeG = new Node('G');
		Node nodeH = new Node('H');
		Node nodeS = new Node('S');
		
		nodeA.addNeighbor(nodeB);
		nodeA.addNeighbor(nodeS);
		
		nodeB.addNeighbor(nodeA);
		
		nodeC.addNeighbor(nodeD);
		nodeC.addNeighbor(nodeE);
		nodeC.addNeighbor(nodeF);
		nodeC.addNeighbor(nodeS);
		
		nodeD.addNeighbor(nodeC);
		
		nodeE.addNeighbor(nodeC);
		nodeE.addNeighbor(nodeH);
		
		nodeF.addNeighbor(nodeC);
		nodeF.addNeighbor(nodeG);
		
		nodeG.addNeighbor(nodeF);
		nodeG.addNeighbor(nodeH);
		nodeG.addNeighbor(nodeS);
		
		nodeH.addNeighbor(nodeE);
		nodeH.addNeighbor(nodeG);
		
		nodeS.addNeighbor(nodeA);
		nodeS.addNeighbor(nodeC);
		nodeS.addNeighbor(nodeG);
		
		LinkedList<Node> path = dfs.DepthFirstSearch(nodeA);
		
		System.out.println(path.toString());
	}
	
	private LinkedList<Node> DepthFirstSearch(Node start){
		Stack<Node> stack = new Stack<Node>();
		LinkedList<Node> visited = new LinkedList<Node>();
		
		stack.push(start);
		
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			
			if(!visited.contains(current)) {
				visited.add(current);
			}
			
			for(Node node: current.adjacentNodes) {
				if(!visited.contains(node)) {
					stack.push(node);
				}
			}
		}
		
		return visited;
	}
}
