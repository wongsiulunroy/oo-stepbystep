public class Student extends Person {
    private String classNo;

    public Student(String name, int age, String classNo) {
        super(name, age);
        this.classNo = classNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    String introduce(){
        return String.format("My name is %s. I am %s years old. I am a student of %s. Coding for the glory of OOCL",getName(),getAge(),classNo);
    }
}
