package co.vinod.model.d3;

import java.util.Objects;

public class RoundRobinExample {

	static class Task {
		String pid;
		long remainingTime;

		public Task(String pid, long remainingTime) {
			this.pid = pid;
			this.remainingTime = remainingTime;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Task other = (Task) obj;
			return Objects.equals(pid, other.pid);
		}

		@Override
		public String toString() {
			return String.format("Task (pid=%s, remaining time=%d)", this.pid, this.remainingTime);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		CircularLinkedList<Task> scheduler = new CircularLinkedList<Task>();

		long quantum = 5; // time allotted by CPU to a task

		scheduler.add(new Task("P-001", 45));
		scheduler.add(new Task("P-002", 20));
		scheduler.add(new Task("P-003", 15));
		scheduler.add(new Task("P-004", 50));
		var curr = scheduler.getHead();
		var activeTaskCount = scheduler.size();

		while (activeTaskCount > 0) {
			var task = curr.data;
			if (task.remainingTime > 0) {
				System.out.println(task);
				task.remainingTime -= quantum;
			} else {
				System.out.println(task);
				System.out.printf("Task (pid=%s) completed\n", task.pid);
				activeTaskCount--;
			}
			curr = curr.next;
		}

	}

}
