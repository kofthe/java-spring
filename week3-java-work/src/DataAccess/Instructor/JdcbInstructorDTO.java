package DataAccess.Instructor;

public class JdcbInstructorDTO implements InstructorDTO{
    @Override
    public void addInstructor() {
        System.out.println("JDBC ile Eğitmen Eklendi.");
    }
}
