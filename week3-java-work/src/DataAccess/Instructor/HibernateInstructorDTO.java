package DataAccess.Instructor;

public class HibernateInstructorDTO implements InstructorDTO{

    @Override
    public void addInstructor() {
        System.out.println("Hibernate ile Eğitmen Eklendi");
    }
}
