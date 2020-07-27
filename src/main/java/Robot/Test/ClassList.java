package Robot.Test;

import java.util.Collection;

public class ClassList implements StudentPool {

    private Collection<Student> studentList;

    public void setStudentList(Collection<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Collection<Student> getStudentList() {
        return studentList;
    }

    public void runningTest() {
        for (Student s : studentList) {
            s.doHomeWork();
        }
    }
}
