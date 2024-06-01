package TestDemo;

// StudentValidatorTest.java

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StudentValidatorTest {

    @Test
    public void testValidStudentId() {
        assertTrue(StudentValidator.isValidStudentId("HS-1234"));
        assertTrue(StudentValidator.isValidStudentId("HS-0000"));
        assertTrue(StudentValidator.isValidStudentId("HS-9999"));
    }

    @Test
    public void testInvalidStudentIdFormat() {
        assertFalse(StudentValidator.isValidStudentId("HS-123"));
        assertFalse(StudentValidator.isValidStudentId("HS-12345"));
        assertFalse(StudentValidator.isValidStudentId("1234"));
        assertFalse(StudentValidator.isValidStudentId("HS1234"));
    }

    @Test
    public void testInvalidCharactersInStudentId() {
        assertFalse(StudentValidator.isValidStudentId("HS-12A4"));
        assertFalse(StudentValidator.isValidStudentId("HS-ABCD"));
        assertFalse(StudentValidator.isValidStudentId("HS-12 4"));
    }

    @Test
    public void testNullOrEmptyStudentId() {
        assertFalse(StudentValidator.isValidStudentId(null));
        assertFalse(StudentValidator.isValidStudentId(""));
    }
}
