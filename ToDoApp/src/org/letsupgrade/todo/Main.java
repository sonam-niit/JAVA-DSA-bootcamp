package org.letsupgrade.todo;

public class Main {

	public static void main(String[] args) {
		
		TodoApp app= new TodoApp(5);
		app.addTask("check papers");
		app.addTask("Conduct Youtube Live");
		app.addTask("check assignments");
		app.addTask("Corporate Session");
		app.addTask("Frontend Training");
		app.displayTask();
		app.removeTask(3);
		app.displayTask();
		app.completeTast(0);
	}
}