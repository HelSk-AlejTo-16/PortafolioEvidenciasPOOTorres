package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PartidoRepositoryTest {
    
    @Autowired/**este crea un obajeto es como el (= new) */
    private PartidoRepository repository;

    @Autowired
    private EquipoRepository equipoRepository; 
    @BeforeAll/**Antes de todo limpia las tablas de las base de datos */
    void cleanDatabase(){
        repository.deleteAll();
        equipoRepository.deleteAll();
    }
@Test
    void canSave(){
        //Instancia un equipo
        Equipo equipo = new Equipo();
        Equipo equipo1 = new Equipo();
        equipo.setNombre("America");
        equipo1.setNombre("Chivas");

        equipoRepository.save(equipo);
        equipoRepository.save(equipo1);
       
        
        Partido partido = new Partido();
        partido.setEquipo1(equipo); 
        partido.setEquipo2(equipo1);

        partido.setMarcadorEquipo1(0);
        partido.setMarcadorEquipo2(0);

        repository.save(partido);
        assertNotNull(partido.getId());
        assertNotEquals(0, partido.getId());


        //Guardo el equipo
        

        //Prueba de que se guardo un equipo
        //assertNotNull(equipo.getId());

        assertNotEquals(0, partido.getId());
    }

    
}