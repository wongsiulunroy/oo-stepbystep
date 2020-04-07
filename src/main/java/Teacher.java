import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Class> classes = new ArrayList<Class>();

    public Teacher(String name, int age) {
        super(name, age);

    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    String introduce(){
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.",getName(),getAge());
    }

    public void AddClass(Class Class) {
        if (this.getClasses().size()<=4) {
            //System.out.println(getClasses().size());
            classes.add(Class);
        }
    }


    /*boolean checkMaxClass(List<Class> classes){
        if (classes.size()<=5) {
            return true;
        }
        return false;
    }*/
}
