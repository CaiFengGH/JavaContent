package list;

/**
 * @author Ethan
 * @desc ��ת���ֵ���������
 */
public class ReversePart {

	public static Node reversePart(Node head,int from,int to){
		Node node = head;
		Node fPre = null;
		Node tPos = null;

		int len = 0;
		while(node != null){
			len++;
			if(len == from - 1){
				fPre = node;
			}
			if(len == to + 1){
				tPos = node;
			}
			node = node.next;
		}
		
		//1-from/to�����쳣���
		if(from > to || from < 1 || to > len){
			return head;
		}

		//2-��ת�Ƿ����ͷ�ڵ�
		node = fPre == null ? head : fPre.next;
		Node node1 = node.next;
		node.next = tPos;
		Node next = null;
		
		//3-��ת�еĽڵ��ϵ
		while(node1 != tPos){
			next = node1.next;
			node1.next = node;
			node = node1;
			node1 = next;
		}
		
		//4-���ַ�ת�����Ƿ����ͷ�ڵ�
		if(fPre != null){
			fPre.next = node;
			return head;
		}
		return node;
	}
	
	private static void printList(Node a) {
		while(a != null){
			System.out.print(a.value+"_");
			a = a.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
		a.next =b;
		b.next =c;
		c.next =d;
		d.next =e;
		
		//1-��תǰ
		printList(a);
		//2-��ת
		Node newHead = reversePart(a,2,4);
		//3-��ת��
		printList(newHead);
	}

}
