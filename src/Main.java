import com.student.model.Student;
import com.student.service.StudentService;
import com.student.util.InvalidMarksException;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        try {

            Student s1 = new Student(1, "Rahul", 85);
            Student s2 = new Student(2, "Anita", 92);

            service.addStudent(s1);
            service.addStudent(s2);

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Student Records:");
        service.displayStudents();
    }
}