package Service;

import Core.Logger;
import DataAccess.Instructor.InstructorDTO;
import Entities.Instructor;

import java.util.Objects;

public class InstructorService {
    private InstructorDTO instructorDTO;

    public InstructorService(InstructorDTO instructorDTO, Logger[] loggers) {
        this.instructorDTO = instructorDTO;
    }

    public void addInstructor(Instructor instructor) throws Exception {
        Instructor[] instructors = new Instructor[] {
            new Instructor(1L, "Mehmet","Ari"),
            new Instructor(2L, "Melih" , "Selam"),
            new Instructor(3L, "Engin", "Demiroğ"),
        };
        for(Instructor ins : instructors) {
            if (Objects.equals(ins.getId(), instructor.getId())) {
                throw new Exception("Aynı id'yi kullanan kullanıcı olamaz.");
            }
        }
    }


}
