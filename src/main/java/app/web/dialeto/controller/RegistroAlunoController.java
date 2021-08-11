package app.web.dialeto.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.web.dialeto.model.RegistroAlunoModel;
import app.web.dialeto.repository.RegistroAlunoRepository;

/**
 * @author José Victor Vieira
 *
 */
@Controller
public class RegistroAlunoController {

	private List<RegistroAlunoModel> registroAluno = new ArrayList<>();
	@Autowired
	private RegistroAlunoRepository registroAlunoRepository;

	@GetMapping("/registroAluno")
	public String registroAluno(@ModelAttribute RegistroAlunoModel registroAlunoModel) {
		System.out.println("\n\n ResgistroAlunoController - controller");
		return "registroAluno";
	}

	@PostMapping("/registrarAluno")
	public String registrarAluno(RegistroAlunoModel registroAlunoModel, RedirectAttributes ra, HttpSession session) {

		this.registroAlunoRepository.save(registroAlunoModel);
		return "redirect:/login";

	}

}