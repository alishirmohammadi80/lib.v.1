package com.rasha.WarehouseProject.User;


import com.rasha.WarehouseProject.service.EmailService;
import com.rasha.WarehouseProject.token.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/signup")
    public String signupForm(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }
    @Autowired
    EmailService emailService;
    @PostMapping("/signup")
    public String saveUser(@Validated @ModelAttribute User user,  RedirectAttributes attributes){

        if (userRepository.findByEmail(user.getEmail())!=null){
            return "redirect:/signup";
        }

        String token=String.format("%s", Token.generatRandomToken());
        user.setToken(token);
        userRepository.save(user);

        String activationLink=String.format(
                "<a href='http://http://localhost:8080/activation/%s'> active your account</a>",user.getToken()
        );
        emailService.send(user.getEmail(),"activation link",activationLink);
        return "kala";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}

