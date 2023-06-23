package com.demo9.controller;

import com.demo9.model.Employ;
import com.demo9.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private IEmployService employService;



    @GetMapping("/index")
    public String indexPage(Model model) {

        return "/ep/index";
    }


    @GetMapping("/list")
    public String listPage(Model model) {

        List<Employ> employs = employService.findAll();

        model.addAttribute("students", employs);

        return "/ep/list";
    }


    @GetMapping("/edit/{studentId}")
    public String editPage(Model model, @PathVariable Long studentId) {
        Optional<Employ> studentOptional = employService.findOne(studentId);
        model.addAttribute("student", studentOptional.get());
        return "/ep/edit";
    }

    @GetMapping("/detail/{studentId}")
    public String detailPage(Model model, @PathVariable Long studentId) {
        Optional<Employ> studentOptional = employService.findOne(studentId);
        model.addAttribute("student", studentOptional.get());
        return "/ep/detail";
    }



    @PostMapping("/edit/{studentId}")
    public String editPage(Model model, @PathVariable Long studentId, @Validated @ModelAttribute Employ employ, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/ep/edit";
        }

        employ.setId(studentId);
        employService.save(employ);
        model.addAttribute("student", employ);
        return "redirect:/list";
    }



    @GetMapping("/delete/{studentId}")
    public String deletePage(Model model, @PathVariable Long studentId) {
        Optional<Employ> employOptional = employService.findOne(studentId);
        model.addAttribute("student", employOptional.get());
        return "/ep/delete";
    }

    @PostMapping("/delete/{studentId}")
    public String deletePage(Model model, @PathVariable Long studentId, @ModelAttribute Employ employ) {
        employ.setId(studentId);
        employService.delete(employ);
        model.addAttribute("student", employ);
        return "redirect:/list";
    }

    @GetMapping("/create")
    public String createPage(Model model) {

        model.addAttribute("student", new Employ());

        return "/ep/create";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute Employ employ) {
        employService.save(employ);
        return "redirect:/list";
    }

}
