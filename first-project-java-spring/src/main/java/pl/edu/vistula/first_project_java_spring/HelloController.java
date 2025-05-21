package pl.edu.vistula.first_project_java_spring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

//@Controller
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String hello() { return"Hello Mr Bielecki!, in my first Spring controller."; }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute(  "name", name);
        return "greeting";

    }
    //http://localhost:8080/greeting?name=Vistula
}