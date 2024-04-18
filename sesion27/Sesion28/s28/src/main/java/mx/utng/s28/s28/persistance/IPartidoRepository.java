package mx.utng.s28.s28.persistance;

import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.s28.model.Partido;

public interface IPartidoRepository extends CrudRepository<Partido, Long> {

    
}
