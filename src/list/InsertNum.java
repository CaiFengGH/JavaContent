package list;

/**
 * @author Ethan
 * @desc 在环形有序单链表中插入值，时间复杂度为O(N)，空间复杂度为O(1)
 */
public class InsertNum {

	public static Node insertNum(Node head,int num){
		Node node = new Node(num);
		//1-参数异常head为null
		if(head == null){
			node = node.next;
			return node;
		}
		//2-初始化遍历节点
		Node curr = head;
		Node next = head.next;
		Node temp = null;
		
		//3-循环遍历
		while(next.value >= curr.value){
			if(num <= next.value && num >= curr.value){
				curr.next = node;
				node.next = next;
				return head;
			}
			//节点更新
			temp = next.next;
			curr = next;
			next = temp;
		}
		
		curr.next = node;
		node.next = next;
		//4-判断两种不在范围内情况
		if(num > curr.value){
			return head;
		}else{
			return node;
		}
	}
	
	/**
	 * @desc 打印环形单链表
	 */
	public static void printList(Node head){
		Node node = head;
		while(node != null){
			System.out.print(node.value + "_");
			node = node.next;
			if(node == head){
				break;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(5);
		Node d = new Node(7);
		Node e = new Node(9);
		//构建环形链表
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = a;
		
		printList(a);
		Node newNode = insertNum(a,0);
		
		printList(newNode);
	}
}
