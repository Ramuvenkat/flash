package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		Employee e1 = new Employee("Venkat",27,10000);
		Employee e2 = new Employee("Gopi",25,12000);
		Employee e3 = new Employee("Vamsi",24,25000);
		Employee e4 = new Employee("Ravi",30,30000);
		Employee e5 = new Employee("ramu",23,20000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println(employees);
		List<Employee> sortedlist=employees.stream().sorted((o1,o2)->(int)(o1.getAge() - o2.getAge())).collect(Collectors.toList());
		
		System.out.println(sortedlist);
		
		
	}

}
