
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);



		System.out.print("Please choose an option. \n 1. View Projects \n 2. Add Project \n 3. Delete Project \n Option: ");
		int projChoice = input.nextInt();
		
		getProjects();
		
		System.out.print("Please choose an option. \n 1. View Tasks \n 2. Add Task \n 3. Edit Task  \n 4. Delete Task \n Option: ");
		int taskChoice = input.nextInt();

		addTasks(String description, Date dueDate, char priority, Boolean completed ) {
			
		}
	}

	private static void getProjects() {
		// TODO Auto-generated method stub
		
	}

}
