package mx.utng.s26.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.s26.sesion26.model.entity.Teacher;
import mx.utng.s26.sesion26.model.service.ITeacherService;

@Controller
@SessionAttributes("teacher")
public class TeacherController {
    @Autowired //crea una instancia de la calse para no estar poniendo "new"
    //y poder inciarlizarla fuera de un constructor
    private ITeacherService service;

    @GetMapping({"/teacher", "teacher/", "/teacher/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de maestros");
        model.addAttribute("teachers", service.list());
        return "teacher-list";
    }

    @GetMapping("/teacher/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Maestros");
        model.addAttribute("teacher", new Teacher());
        return "teachers-form";
    }

    @PostMapping("/teacher/form")
    public String save(@Valid Teacher teacher, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Maestos");
            return "teacher-form";
        }
        service.save(teacher);
        return "redirect:/teacher/list";
    }

    @GetMapping("/teacher/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Teacher teacher = null;
        if(id > 0){
            teacher=service.getByID(id);
        }else{
            return "redirect:/teacher/list";
        }
        model.addAttribute("title", "Editar maestro");
        model.addAttribute("teacher", teacher);
        return "teacher-form";
    }
    @GetMapping("/teacher/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/teacher/list";
    }

}
