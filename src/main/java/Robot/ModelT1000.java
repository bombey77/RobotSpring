package Robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

    private boolean soundEnabled;
    private int year;
    private String color;

    private Leg sonyLeg;
    private Head sonyHead;
    private Hand sonyHand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }


    /*private ModelT1000(String color, int year, boolean soundEnabled) {
        System.out.println("constructor only primitives");
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    private ModelT1000(Leg sonyLeg, Hand sonyHand, Head sonyHead, String color, int year, boolean soundEnabled) {
        System.out.println("constructor with 6 parameters");
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
        this.sonyLeg = sonyLeg;
        this.sonyHead = sonyHead;
        this.sonyHand = sonyHand;
    }*/

//    ModelT1000(){
//        System.out.println("simple constructor");
//    }

    ModelT1000(Leg sonyLeg, Hand sonyHand, Head sonyHead) {
        System.out.println("constructor with 3 parameters");
        this.sonyLeg = sonyLeg;
        this.sonyHead = sonyHead;
        this.sonyHand = sonyHand;
    }

    @Override
    public void action(){
        System.out.println("T1000 made an action");
        sonyLeg.moveLeg();
        sonyHead.thinkWithHead();
        sonyHand.moveHand();
    }

    void primitives() {
        System.out.println(color);
        System.out.println(year);
        System.out.println(soundEnabled);
    }

    void doSomething() {

    }

    public Leg getSonyLeg() {
        return sonyLeg;
    }

    public void setSonyLeg(Leg sonyLeg) {
        this.sonyLeg = sonyLeg;
    }

    public Head getSonyHead() {
        return sonyHead;
    }

    public void setSonyHead(Head sonyHead) {
        this.sonyHead = sonyHead;
    }

    public Hand getSonyHand() {
        return sonyHand;
    }

    public void setSonyHand(Hand sonyHand) {
        this.sonyHand = sonyHand;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterProperties " + this);
    }

    @Override
    public String toString() {
        return "ModelT1000{" +
                "sonyLeg=" + sonyLeg +
                ", sonyHead=" + sonyHead +
                ", sonyHand=" + sonyHand +
                '}';
    }
}
