package Controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class controller {

    @GetMapping("/")
    public String getIndexPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "OAuth/index";
    }

    @GetMapping("/protected")
    public String getProtectedPage(Authentication authentication) {
        if (authentication != null) {
            System.out.println(authentication);
        }
        return "OAuth/index";
    }
}
