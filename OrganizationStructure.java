import java.util.Queue;
import java.util.ArrayList;
public class OrganizationStructure {
	public Employee ceo;
	class Employee{
		String name;
		String title;
		ArrayList<Employee> directReports;    //direct children of that node
	}
	Queue<Employee> q= new Queue<Employee>();
	public void printLevelByLevel(){
		int num;
		for (Employee e:directReports){
			q.add(e);
		}
		if (directReports!=0) {
			num++;
		}
		q.pop.printLevelByLevel();
		if (q.isEmpty()) {
			System.out.println(num-1);
		}
	}
}