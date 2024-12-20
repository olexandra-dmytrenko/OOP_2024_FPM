package lecture8.constructosSetters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getBirthName() {
        assertEquals("John", new Person("John", 30).getBirthName());
    }

    @Test
    void setKidsQuantity() {
    }
}