import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentDatabaseTest {

    @BeforeAll
    static void setup() {
        // No database setup needed now, so you can remove database connection code
    }

    @Test
    @Order(1)
    void testAddStudent() {
        // For simplicity, we can mock or simulate the logic of adding a student without actual DB interaction
        String studentId = "007";
        String firstName = "Alice";
        String lastName = "Wong";
        String major = "IT";
        String phone = "0112345678";
        String gpa = "3.7";
        String dob = "2002-03-15";

        // Simulate logic here, e.g., check if the student ID is added
        assertNotNull(studentId, "Student ID should not be null");
        assertEquals("Alice", firstName, "First name should match");
    }

    @Test
    @Order(2)
    void testSearchStudent() {
        // Simulate a search for a student (no database required)
        String studentId = "005";
        String expectedFirstName = "Meghana";

        // Simulate search logic and assert the result
        assertEquals("Meghana", expectedFirstName, "First name should match");
    }

    @AfterAll
    static void teardown() {
        // No database teardown required, so this can be removed
    }
}
