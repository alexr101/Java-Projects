package ads;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		Node nodeB = new Node();
		Node nodeC = new Node();
		Node nodeD = new Node();
		
		nodeA.data = 1;
		nodeB.data = 2;
		nodeC.data = 3;
		nodeD.data = 4;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(nodeLength(nodeA)); //4
		System.out.println(nodeLength(nodeB)); //3
		
	}
	
	public static int nodeLength(Node node){
		//Count the passed Node
		int length = 1;
		Node currentNode = node;

		while(currentNode.next != null){
			currentNode = currentNode.next;
			length++;
		}
		
		return length;
	}

}
