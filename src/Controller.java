import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("1", "Ivanov Ivan");
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "John"));
        students.add(new Student("2", "Joshua"));

        Controller controller = new Controller();
        StudyGroup studyGroup = controller.formStudyGroup(teacher, students);

        System.out.println(studyGroup);
    }
}