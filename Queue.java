import java.util.LinkedList;

public class Queue<T> {

	int top;
	int max;
	LinkedList<T> list;
	
	Queue(){
		this.top = -1;
		this.max = 4;
		this.list = new LinkedList<>();
		
	}
	
	public void add(T obj) {
		if(top >= max) {
			System.out.println("Queue is Full!!");
		}else {
			list.add(obj);
			top++;
		}
	}
	
	public T remove(){
		if(top == -1) {
			//System.out.println("Nothing to remove");
			return null;
		}else {
			top--;
			return list.removeFirst(); 
		}
	}


}
