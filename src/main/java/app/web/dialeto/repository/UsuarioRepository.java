package app.web.dialeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.web.dialeto.acesso.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	public Usuario findByEmailAndSenha(String email, String senha);
	
}
