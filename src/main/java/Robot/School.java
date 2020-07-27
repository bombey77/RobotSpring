package Robot;

public class School {

    Tool tool;

    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "School{" +
                "tool=" + tool +
                ", student=" + student +
                '}';
    }
}
