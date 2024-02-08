package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import javax.validation.Valid;


@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showAllUser(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "usersRead";
    }

    @GetMapping("/new")
    public String addNewUser(Model model) {
        model.addAttribute("newUser", new User());
        return "userAdd";
    }

    @PostMapping
    public String saveUser(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "userAdd";

        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String updateUser(@RequestParam("id") int id, Model model) {
        model.addAttribute("newUser", userService.getUserById(id));
        return "userAdd";
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
