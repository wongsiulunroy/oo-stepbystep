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
}