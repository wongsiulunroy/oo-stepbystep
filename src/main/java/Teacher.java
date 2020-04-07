public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    String introduce(){
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.",getName(),getAge());
    }
}
