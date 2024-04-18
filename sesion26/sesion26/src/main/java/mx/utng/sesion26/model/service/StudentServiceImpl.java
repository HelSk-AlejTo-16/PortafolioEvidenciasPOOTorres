package mx.utng.sesion26.model.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.IStudentDao;
import mx.utng.sesion26.model.entity.Student;
@Service
public class StudentServiceImpl implements IEStudentService {
//*clase service esta basada en el patron de diseño fachada
/*Es un unico punto de acceso hacia los DAO (data access object). Dentro de la
clase service podemos operar con distintas clases DAO
 */



 ///Inyectamos la interfaz para utilizar los etodos de CRUD
 //C-Create, R-Read, U-Update D-Delete 
 @Autowired//Esto inyecta 
 private IStudentDao dao;
    
 @Transactional(readOnly = true)
    @Override
    public List<Student> list() {
        return dao.list();
    }
@Transactional
    @Override
    public void save(Student student) {
       dao.save(student);
   
    }
@Transactional(readOnly = true)
    @Override
    public Student getbyId(Long id) {
      
        return dao.getById(id);
    }
@Transactional
    @Override
    public void delete(Long id) {
       dao.delete(id);
        
    }
    
    
    
}
