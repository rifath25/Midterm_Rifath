package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> employeeName = new ArrayList<String>();


		employeeName.add("Cristian Cally");
		employeeName.add("Alif Laila");
		employeeName.add("Cristian Grey");
		employeeName.add("Salman Khan");
		employeeName.add("Ali Goni");


		List<String> position = new ArrayList<String>();

		position.add("Product Owner");
		position.add("Business Analyst");
		position.add("Developer");
		position.add("Designer");
		position.add("QA");



		Map<String, List<String>> employee = new HashMap<String, List<String>>();

		employee.put("NAME ", employeeName);

		employee.put("JOB TITLE", position);



		System.out.println("Printing HashMap by using For Each Loop :\n");

		for(Map.Entry<String,List<String>> employeeList : employee.entrySet()){

			System.out.println(employeeList.getKey()+ " " +employeeList.getValue());

		}

		System.out.println("\n---------------------------------------\n");

		System.out.println("Printing HashMap by using Iterator :\n");

		Iterator<Map.Entry<String, List<String>>> it = employee.entrySet().iterator();

		while(it.hasNext()){

			Map.Entry<String,List<String>> join = it.next();

			System.out.println(join.getKey()+ " " +join.getValue());

		}


	}

}
