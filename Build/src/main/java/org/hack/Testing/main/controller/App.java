package org.hack.Testing.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {
	
	@RequestMapping("/")
    public String index() {
        return "index.html";
    }

}
