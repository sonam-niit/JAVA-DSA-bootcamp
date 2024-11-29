package org.letsupgrade.todo;

public class TodoApp {

	private Task[] tasks;
	private int taskCount;
	
	public TodoApp(int size) {
		tasks= new Task[size];
		taskCount=0;
	}
	//Add Task
	public void addTask(String description) {
		if(taskCount<tasks.length) {
			tasks[taskCount++]=new Task(description);
			System.out.println("Task added: "+description);
		}else {
			System.out.println("Task List is full, Cannot add More tasks");
		}
	}
	public void removeTask(int index) {
		if(index>=0 && index<taskCount) {
			System.out.println("Task Removed: "+tasks[index]);
			for(int i=index;i<taskCount-1;i++) {
				tasks[i]=tasks[i+1];
			}
			tasks[--taskCount]=null;
		}
		else {
			System.out.println("Invalid Index");
		}
	}
	public void completeTast(int index) {
		if(index>=0 && index<taskCount) {
			tasks[index].markCompleted();
			System.out.println("Task Marked As completed: "+tasks[index].getDescription());
		}
		else {
			System.out.println("Invalid Index");
		}
	}
	public void displayTask() {
		if(taskCount==0) {
			System.out.println("No Task available to show");
		}else {
			System.out.println("To Do List");
			for (int i = 0; i <taskCount; i++) {
				System.out.println((i+1)+". "+tasks[i]);
			}
		}
	}
}













