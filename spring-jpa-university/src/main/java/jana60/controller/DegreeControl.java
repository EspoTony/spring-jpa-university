package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.repository.DegreeRepository;

@Controller
@RequestMapping("/degrees")
public class DegreeControl {
	
	@Autowired
	private DegreeRepository repo;

	@GetMapping
	public String degreelist(Model m) {
		m.addAttribute("degree", repo.findAll());
		return "degrees";
	}
}