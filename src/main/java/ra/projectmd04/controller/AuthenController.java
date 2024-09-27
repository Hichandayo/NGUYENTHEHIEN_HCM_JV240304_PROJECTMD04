package ra.projectmd04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.projectmd04.exception.AuthenticationException;
import ra.projectmd04.model.dto.request.FormLogin;
import ra.projectmd04.model.dto.request.FormRegister;
import ra.projectmd04.model.dto.response.UserInfo;
import ra.projectmd04.service.user.IUserService;

import javax.servlet.http.HttpSession;

@Controller
public class AuthenController {
    @Autowired
    private IUserService userService;
    // Get
    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String register(){
        return "auth/register";
    }


    // Post
    @PostMapping("/register")
        public String handleRegister(@ModelAttribute FormRegister request){
        try{
            userService.register(request);
            return "auth/login";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    @PostMapping("/login")
    public String handleLogin(@ModelAttribute FormLogin request, HttpSession session, Model model){
        try{
            UserInfo userInfo = userService.login(request);
            session.setAttribute("userLogin",userInfo);
            if (userInfo.isRole()){
                return "redirect:/admin";
            }else{
                return "redirect:/";
            }
        }catch (AuthenticationException e){
            model.addAttribute("error", e.getMessage());
            return "auth/login";
        }
    }

}
