public class TaskManagementTest {

    public static void main(String[] args) {

        TaskLinkedList taskManager =
                new TaskLinkedList();

        taskManager.addTask(
                101,
                "Complete Java Assignment",
                "Pending");

        taskManager.addTask(
                102,
                "Prepare Presentation",
                "In Progress");

        taskManager.addTask(
                103,
                "Submit Report",
                "Completed");

        taskManager.displayTasks();

        System.out.println(
                "\nSearching Task ID 102:"
        );

        Task foundTask =
                taskManager.searchTask(102);

        if (foundTask != null) {

            System.out.println(foundTask);

        } else {

            System.out.println(
                    "Task not found."
            );
        }

        System.out.println(
                "\nDeleting Task ID 101"
        );

        taskManager.deleteTask(101);

        taskManager.displayTasks();
    }
}