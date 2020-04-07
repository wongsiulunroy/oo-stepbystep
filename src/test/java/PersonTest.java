import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void should_return_person_introduce(){
        Person person = new Person("Tom", 21);
        assertEquals("My name is Tom. I am 21 years old.",person.introduce());
    }

}