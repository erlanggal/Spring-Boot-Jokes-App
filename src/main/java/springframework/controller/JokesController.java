package springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.service.JokesService;

@Controller
public class JokesController {

    private JokesService service;

    public JokesController(JokesService service) {
        this.service = service;
    }

    @RequestMapping({"", "/", "/home"})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", this.service.getJoke());
        return "chuckNorris";
    }
}
