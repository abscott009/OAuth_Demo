package Controller;

import Model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class controller {

    @GetMapping("/")
    public String home(Model model) {
        return "OAuth/home";
    }

    @GetMapping("/protected")
    public String protected(Model model) {
        return "OAuth/protected";
    }
}
