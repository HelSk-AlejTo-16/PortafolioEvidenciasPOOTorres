package mx.utng.s28.s28.persistance;
import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.s28.model.Equipo;




public interface EquipoRepository extends CrudRepository<Equipo, Long>{
    Iterable<Equipo> findAllByName(String nombre); 


    
    
}
