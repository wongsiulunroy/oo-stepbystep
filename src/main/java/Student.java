public class Student extends Person {
    private int classNo;

    public Student(String name, int age) {
        super(name, age);
        //this.classNo = classNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    String introduce(){
        return String.format("My name is %s. I am %s years old. I am a student of Class %s. Coding for the glory of OOCL",getName(),getAge(),getClassNo());
    }

    void JoinClass(int classNo){
        if (this.getClassNo() != 0) {
            this.setClassNo(classNo);
        }
    }
}
