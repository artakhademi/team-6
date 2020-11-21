package edu.depaul.cdm.se452.concept.view;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//import edu.depaul.cdm.se452.concept.controller.database.mysql.repository.TuitionRepository;


@Controller
public class MainController {

//    private TuitionRepository tuitionRepository;
//
//    @Autowired
//    MainController(TuitionRepository tuitionRepository ) {
//        this.tuitionRepository = tuitionRepository;
//    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("name", "Account Login");
        return mv;
    }
    @GetMapping("/logout")
    public ModelAndView logout() {
        ModelAndView mv = new ModelAndView("logout");
        return mv;
    }

//    public ModelAndView showDashboard(Authentication authentication) {

    @GetMapping("/")
    public ModelAndView showDashboard() {
        ModelAndView mv;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            mv = new ModelAndView("dashboard");
            mv.addObject("name", auth.getName());
        return mv;
    }

    @GetMapping("/course_catalog")
    public ModelAndView courseCatalog() {
        ModelAndView mv = new ModelAndView("courseCatalog");
        return mv;
    }

    @GetMapping("/course")
    public ModelAndView course() {
        ModelAndView mv = new ModelAndView("course");
        return mv;
    }

    @GetMapping("/grade")
    public ModelAndView grade() {
        ModelAndView mv = new ModelAndView("grade");
        return mv;
    }

//    @GetMapping("/tuition")
//    public ModelAndView tuition() {
//        ModelAndView mv = new ModelAndView("admin/tuition");
//        mv.addObject("tuition", tuitionRepository.findAll());
//        return mv;
//    }

}