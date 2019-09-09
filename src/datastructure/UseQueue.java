package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> food=new LinkedList<String>();

		food.add("Pasta");
		food.add("Chicken");
		food.add("Pizza");
		food.add("Tacos");

		food.size();

		food.remove();

		food.peek();

		food.poll();

		Iterator it=food.iterator();

		while(it.hasNext()) {

			System.out.println(it.next());

		}

		for(String st: food)

		{

			System.out.println("Remove Food: "+food.remove()+ ","+ " Peek Food: "+food.peek()+ ","+" Poll Food: "+food.poll());



		}



	}

}


