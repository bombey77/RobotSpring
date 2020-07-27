package ZPSchool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class School104 implements Building {

    private int children;
    private String className;

    @Autowired
    @Qualifier(value="school59")
    School59 school59;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public School104 makeBean() {
        System.out.println("make bean /////////////////");
        return new School104();
    }

    public School59 getSchool59() {
        return school59;
    }

    public void setSchool59(School59 school59) {
        this.school59 = school59;
    }

    @Override
    public void build() {
        System.out.println("Build school 104");    
    }

    School104() {
        System.out.println("Simple constructor 104");
    }

    School104(String className, int children) {
        System.out.println("Constructor with parameters 104");
        this.className = className;
        this.children = children;
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
        return "School104{" +
                "children=" + children +
                ", className='" + className + '\'' +
                ", school59=" + school59 +
                '}';
    }
}
