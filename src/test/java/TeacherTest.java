import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_return_teacher_introduce(){
        Person teacher = new Teacher("Tom", 21);
        assertEquals("My name is Tom. I am 21 years old. Teaching for the future of world.",teacher.introduce());
    }

}