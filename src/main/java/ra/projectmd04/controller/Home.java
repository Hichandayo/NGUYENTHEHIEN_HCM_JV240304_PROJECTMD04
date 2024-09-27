package ra.projectmd04.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {
    @GetMapping("/")
    public String home() {
        return "user/index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/index";
    }
}
