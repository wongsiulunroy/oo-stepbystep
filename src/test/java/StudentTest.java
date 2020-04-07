import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void should_return_student_introduce(){
        Person student = new Student("Tom", 21,"Class 2");
        assertEquals("My name is Tom. I am 21 years old. I am a student of Class 2. Coding for the glory of OOCL",student.introduce());
    }

}