public class Student extends Person {


    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    String introduce(){
        return String.format("My name is %s. I am %s years old. Coding for the glory of OOCL",getName(),getAge());
    }
}
