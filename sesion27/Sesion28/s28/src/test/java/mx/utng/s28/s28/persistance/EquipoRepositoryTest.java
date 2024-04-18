package mx.utng.s28.s28.persistance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//Jupiter
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.s28.model.Equipo;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28.s28") // Paquete base
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Configuraciones para que se pueda probar

public class EquipoRepositoryTest {
    @Autowired // Crea un objeto es como el =new
    private EquipoRepository repository;

    @BeforeAll
    void cleanDatabase() {
        repository.deleteAll();

    }

    @Test
    void canSave() {
        // Instancio un equipo
        Equipo equipo = new Equipo();
        equipo.setNombre("America");
        // Guardo equipo
        equipo = repository.save(equipo);

        // Pureba que exista in id en ese equipo
        assertNotEquals(0,equipo.getId());

    }
    @Test
    @DisplayName("Buscar por nombre")
    void canFindByName(){
        String name = "Chivas"; 
        Equipo equipo = new Equipo();
        equipo.setNombre(name);

        repository.save(equipo);

        Iterable<Equipo> listaEquipos = repository.findAllByName(name);

        assertTrue(listaEquipos.iterator().hasNext());
        Equipo equipoEncontrado = listaEquipos.iterator().next(); 
        assertEquals(equipo, equipoEncontrado);



    }

}
