package mx.utng.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import mx.utng.sesion26.model.entity.Student;
import mx.utng.sesion26.model.service.IEStudentService;

//controlador de la aplicacion
@Controller
public class StudentController {

    @Autowired //Crea una instancia para poder utilizarla sin poner =new / inicializar sin un constructor inteyectandola

        private IEStudentService service;

        @GetMapping({"", "/", "/list"})//Va a llamar este metodo cuando pongan estos valores
        public String list(Model model){//apartado de lista
            model.addAttribute("title","Listado de Estudiantes");
            model.addAttribute("students",service.list());
            return "list";

        }
        @GetMapping //*/ */
        public String create(Model model) { //Lo que se mande no se va a ver
            model.addAttribute("title", "Formulario de estudiantes");
            model.addAttribute("student", new Student());
            return "form";
        }
        @PostMapping("/form/{id}") //No se va a ver los datos que se vayan a mandar
        public String save(@Valid Student student, BindingResult br, Model model){ //Valida un estuduante //Biding Result es que si sale mal mande error
            if(br.hasErrors()){
                model.addAttribute("title", "Formulario Estudiantes");
                return "form";
            }
            service.save(student);
            return "redirect:list";
          
        }

        @GetMapping("/form/{id}") //
        public String update(@PathVariable Long id, Model model){
            Student student = null;
            if(id>0){
            student = service.getbyId(id);

            }else{
                return "redirect:list";
            }
            model.addAttribute("title", "Editar");
            model.addAttribute("student", student);
            return "form";

        }
        @GetMapping("/delete/{id}") //
        public String delete(@PathVariable Long id, Model model){
            if(id > 0){
                service.delete(id);
            }
            return "redirect:/list";
        }
        
}
