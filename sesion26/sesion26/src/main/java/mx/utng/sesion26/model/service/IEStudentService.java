package mx.utng.sesion26.model.service;

import java.util.List;
import mx.utng.sesion26.model.entity.Student;



    public interface IEStudentService { //Inner
        List<Student>list();
        void save(Student student);
        Student getbyId(Long id);
        void delete(Long id);

    
        
    }
    

