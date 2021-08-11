package app.web.dialeto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.web.dialeto.acesso.Usuario;
import app.web.dialeto.repository.UsuarioRepository;

@Controller
public class LoginController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/login")
	public String exibirLogin(Usuario usuario) {
		System.out.println("LoginController - controlller");
		return "login";
	}

	@PostMapping("/login")
	public String efetuarLogin(Usuario usuario, RedirectAttributes ra, HttpSession session) {

		usuario = this.usuarioRepository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());

		if (usuario != null) {
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:/conteudoAlunoLista";
		} else {
			ra.addFlashAttribute("mensagem", "Usuário ou senha incorretos!");
			return "redirect:/login";
		}
	}
}
