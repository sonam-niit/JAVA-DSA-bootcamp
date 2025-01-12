package org.letsupgrade.todo;

public class Task {

	private String description;
	private boolean isCompleted;
	public Task(String description) {
		this.description = description;
		isCompleted=false;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void markCompleted() {
		this.isCompleted = true;
	}
	@Override
	public String toString() {
		return (isCompleted? "[Completed]": "[Pending] "+ description);
	}
	
	
}












