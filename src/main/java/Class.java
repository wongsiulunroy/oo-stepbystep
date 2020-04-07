import java.util.ArrayList;
import java.util.List;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Class {
    private int ClassNo;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;

    public Class(int classNo) {
        this.ClassNo = classNo;
        //this.students = students;
        this.students = new ArrayList<Student>();
        //this.leader = new Student student();
        //this.teacher = new Teacher();
    }

    public int getClassNo() {
        return ClassNo;
    }

    public void setClassNo(int classNo) {
        ClassNo = classNo;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    String  AddStudent(Student student) {
        String WelcomeMessage = "";
        if (student.getClassNo() != ClassNo){
            students.add(student);
            student.setClassNo(this.ClassNo);
        }
        if (this.teacher != null) {
            WelcomeMessage+= teacher.introduce()+" Welcome "+ student.getName()+ " join Class "+ this.ClassNo;
        }
        if (this.teacher == null){
            WelcomeMessage = " Welcome "+ student.getName()+ " join Class "+ this.ClassNo;
        }
        return (WelcomeMessage);
    }


    String AssignLeader(Student student) {
        String LeaderMessage="";
        if (student.getClassNo()==getClassNo()){
            this.leader = student;
        }
        if (this.teacher != null){
            LeaderMessage = this.teacher.introduce() + " "+ student.getName()+ " is the leader of Class "+ this.ClassNo;
        }
        if (this.teacher == null){
            LeaderMessage =  student.getName()+ " is the leader of Class "+ this.ClassNo;
        }
        return LeaderMessage;

    }
}
