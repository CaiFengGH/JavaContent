package list;

/**
 * @author Ethan
 * @desc �ڻ������������в���ֵ��ʱ�临�Ӷ�ΪO(N)���ռ临�Ӷ�ΪO(1)
 */
public class InsertNum {

	public static Node insertNum(Node head,int num){
		Node node = new Node(num);
		//1-�����쳣headΪnull
		if(head == null){
			node = node.next;
			return node;
		}
		//2-��ʼ�������ڵ�
		Node curr = head;
		Node next = head.next;
		Node temp = null;
		
		//3-ѭ������
		while(next.value >= curr.value){
			if(num <= next.value && num >= curr.value){
				curr.next = node;
				node.next = next;
				return head;
			}
			//�ڵ����
			temp = next.next;
			curr = next;
			next = temp;
		}
		
		curr.next = node;
		node.next = next;
		//4-�ж����ֲ��ڷ�Χ�����
		if(num > curr.value){
			return head;
		}else{
			return node;
		}
	}
	
	/**
	 * @desc ��ӡ���ε�����
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
		//������������
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
