import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.sql.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentDatabaseTest {

    static dbConnect db;
    static Connection conn;
    static Statement stmt;

    @BeforeAll
    static void setup() throws SQLException, ClassNotFoundException {
        db = new dbConnect();
        conn = db.getConnection();
        stmt = conn.createStatement();
    }

    @Test
    @Order(1)
    void testAddStudent() throws SQLException {
        String studentId = "007";
        String sql = "INSERT INTO sdata (Student_ID, first_name, last_name, major, Phone, gpa, DOB) " +
                     "VALUES ('" + studentId + "', 'Alice', 'Wong', 'IT', '0112345678', '3.7', '2002-03-15')";
        stmt.executeUpdate(sql);

        ResultSet rs = stmt.executeQuery("SELECT * FROM sdata WHERE student_id = '" + studentId + "'");
        assertTrue(rs.next(), "Student should be added successfully");
    }

    @Test
    @Order(2)
    void testSearchStudent() throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM sdata WHERE student_id = '005'");
        assertTrue(rs.next(), "Student should exist after adding");
        assertEquals("meghana", rs.getString("first_name"));
    }

    @AfterAll
    static void teardown() throws SQLException {
        stmt.executeUpdate("DELETE FROM sdata WHERE student_id = '006'");
        conn.close();
    }
}
