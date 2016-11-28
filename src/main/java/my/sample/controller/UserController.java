package my.sample.controller;

import my.sample.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @ModelAttribute
    public UserForm setUpUserForm() {

        return new UserForm("Takahide FUJII", "32");
    }

    @RequestMapping(value = "create")
    public String createForm() {
        return "userForm";
    }

}
