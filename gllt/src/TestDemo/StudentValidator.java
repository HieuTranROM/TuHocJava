package TestDemo;


public class StudentValidator {
    public static boolean isValidStudentId(String studentId) {
        return studentId.matches("HS-\\d{4}");
    }
}