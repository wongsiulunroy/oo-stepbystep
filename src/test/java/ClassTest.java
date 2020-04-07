import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class ClassTest {

    @Test
    public void should_check_addStudent() {
        Class class1 = new Class(1);
        Student john = new Student("john",18);
        class1.AddStudent(john);
        assertThat(class1.getStudents(), hasItems(john));
    }

    @Test
    public void should_check_assignLeader() {
        Class class1 = new Class(1);
        Student john = new Student("john",18);
        class1.AddStudent(john);
        john.setClassNo(1);
        class1.AssignLeader(john);
        //class1.setLeader(john);
        assertEquals("john", class1.getLeader().getName());
        System.out.println(class1.getLeader().getName());
    }
    @Test
    public void should_check_studentJoinClass() {
        Class class2 = new Class(2);
        Student john = new Student("john",18);
        Teacher MsChan = new Teacher("MsChan", 35);
        class2.setTeacher(MsChan);
        String welcome = "My Name is MsChan. I am 35 years old. Teaching for the future of world. Welcome John join Class 2";
        Assert.assertEquals(welcome, class2.AddStudent(john));
    }
    @Test
    public void should_check_welcomeLeader() {
        Class class2 = new Class(2);
        Student john = new Student("john",18);
        Teacher MsChan = new Teacher("MsChan", 35);
        class2.setTeacher(MsChan);
        String welcome = "My name is MsChan. I am 35 years old. Teaching for the future of world. john is the leader of Class 2";
        Assert.assertEquals(welcome, class2.AssignLeader(john));
    }


}