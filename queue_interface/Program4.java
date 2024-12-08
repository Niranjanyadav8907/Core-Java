package queue_interface;
import java.util.PriorityQueue;
import java.util.Queue;
public class Program4 {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		q1.offer(30);
		q1.offer(15);
		q1.offer(35);
		q1.offer(23);
		q1.offer(40);
		q1.offer(23);
		q1.offer(20);
		q1.offer(15);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
	}

}
