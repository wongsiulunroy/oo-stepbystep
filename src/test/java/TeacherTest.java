import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_return_teacher_introduce(){
        Person teacher = new Teacher("Tom", 21);
        assertEquals("My name is Tom. I am 21 years old. Teaching for the future of world.",teacher.introduce());
    }

    @Test
    public void should_check_addClass(){
        Teacher MsChan = new Teacher("MsChan",25);
        //System.out.println(MsChan.getClasses().size());
        Class Class1 = new Class(1);
        Class Class2 = new Class(2);
        Class Class3 = new Class(3);
        Class Class4 = new Class(4);
        Class Class5 = new Class(5);
        Class Class6 = new Class(6);
        Class Class7 = new Class(7);
        MsChan.AddClass(Class1);
        MsChan.AddClass(Class2);
        MsChan.AddClass(Class3);
        MsChan.AddClass(Class4);
        MsChan.AddClass(Class5);
        MsChan.AddClass(Class6);
        MsChan.AddClass(Class7);
        for (int i = 0; i < MsChan.getClasses().size(); i++) {
            System.out.println(MsChan.getClasses().get(i));
        }
        System.out.println(MsChan.getClasses().size());

        assertThat(MsChan.getClasses(), hasItems(Class1,Class2,Class3,Class4,Class5,Class7));
    }
    @Test
    public void should_check_addClass_false(){
        Teacher MsChan = new Teacher("MsChan",25);
        //System.out.println(MsChan.getClasses().size());
        Class Class1 = new Class(1);
        Class Class2 = new Class(2);
        Class Class3 = new Class(3);
        Class Class4 = new Class(4);
        Class Class5 = new Class(5);
        Class Class6 = new Class(6);
        Class Class7 = new Class(7);
        MsChan.AddClass(Class1);
        MsChan.AddClass(Class2);
        MsChan.AddClass(Class3);
        MsChan.AddClass(Class4);
        MsChan.AddClass(Class5);
        MsChan.AddClass(Class6);
        MsChan.AddClass(Class7);
        assertThat(MsChan.getClasses(), not(hasItems(Class7)));
    }
}