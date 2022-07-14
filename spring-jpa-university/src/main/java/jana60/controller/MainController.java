package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.repository.*;
import jana60.model.*;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/departments")
	public String index(Model model) {
		List<String> dep = List.of("Ingegneria", "Architettura", "Economia");
		model.addAttribute("depar", dep);
		return "index";
	}

	@Autowired
	private DepartmentsRepository repo;
}
