package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Student;
/**Clase Repositorio o dao. Guarda datos
 * anotacion @Repository
 * 
 */
@Repository
public class StudentDaoImpl implements IStudentDao {
    //Entity manager y contexto persistencia
    //Guarda internamente todas las entidades y utiliza 
    //como una cache datos de BD
    @Autowired
    private EntityManager em;

    @Override
    public List<Student> list() {
        
        return em.createQuery("from Student").getResultList();
    }
    @Override
    public void save(Student student) {
        if(student.getId() != null && student.getId() > 0){
            //actualiza valores (student)
            em.merge(student);


        }else{
            em.persist(student);
        }
    }@Override
    public Student getById(Long id) {
      
        return em.find(Student.class, id);

    }
    @Override
    public void delete(Long id) {
        Student student = getById(id);
        em.remove(student);
    }
    
}
