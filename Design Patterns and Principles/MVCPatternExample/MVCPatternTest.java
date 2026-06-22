public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student =
                new Student(
                        "Nohitha Sri",
                        8001197,
                        "A"
                );

        // Create View
        StudentView view =
                new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(
                        student,
                        view
                );

        System.out.println("Initial Student Details:");

        controller.updateView();

        System.out.println();

        System.out.println("Updated Student Details:");

        controller.setStudentName("Ch. Nohitha Sri");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}