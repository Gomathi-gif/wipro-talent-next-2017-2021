import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(11, "Sita, "123 street, India", 20000.0));
		list.add(new Employee(12, "Gita", "234 street, India", 30000.0));
		list.add(new Employee(13, "Rita, "345 street, India", 25000.0));
		list.add(new Employee(14, "Remo, "456 street, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		int searchId = 12;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}
