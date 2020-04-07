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

    void AddStudent(Student student) {
        if (student.getClassNo() != ClassNo){
            students.add(student);
        }
    }

    void AssignLeader(Student student) {
        if (student.getClassNo()==getClassNo()){
            this.leader = student;
      }
    }
}
