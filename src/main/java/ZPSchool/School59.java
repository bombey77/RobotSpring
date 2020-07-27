package ZPSchool;

import org.springframework.stereotype.Component;

@Component
public class School59 implements Building {

    SchoolTable table;
    private int children;
    private String className;

    @Override
    public void build() {
        System.out.println("Build school 59");
    }

    School59() {
        System.out.println("Simple constructor 59");
    }

    School59(String className, int children, SchoolTable table) {
        System.out.println("Constructor with parameters 59");
        this.className = className;
        this.children = children;
        this.table = table;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "School59{" +
                "table=" + table +
                ", children=" + children +
                ", className='" + className + '\'' +
                '}';
    }
}
