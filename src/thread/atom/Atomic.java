package thread.atom;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Ethan
 * @desc ����Atomic���е���
 */
public class Atomic {

	public static void main(String[] args) {
		
		//1-����AtomicReference����
		Person p1 = new Person(111);
		Person p2 = new Person(112);
		
		AtomicReference<Person> ar = new AtomicReference<Person>(p1);
		ar.getAndSet(p2);
		
		Person p3 = (Person)ar.get();
		
		System.out.println(p3);
		//û����дequals�������˴��Ƚϵ��Ƕ�������ã������Ƕ��������
		System.out.println("p3.equal(p1):"+ p3.equals(p1));
		
		//2-����AtomicLongFieldUpdater
		Class<Person> cls = Person.class;
		
		AtomicLongFieldUpdater<Person> al = AtomicLongFieldUpdater.newUpdater(cls, "id"); 
		
		Person p4 = new Person(113);
		
		al.compareAndSet(p4, 113, 114);
		
		System.out.println(p4);
	}
}
class Person{
	volatile long id;
	public Person(long id){
		this.id = id;
	}
	
	public String toString(){
		return "id:" + id;
	}
}