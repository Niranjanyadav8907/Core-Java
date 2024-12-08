package queue_interface;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		q1.offer(23);
		q1.offer(40);
		q1.offer(15);
		q1.offer(23);
		//q1.offer(null);
		//q1.offer("abc");
		q1.offer(20);
		q1.offer(18);
		q1.offer(10);
		q1.offer(25);
		q1.offer(25);
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
	}

}
