package app.web.dialeto.acesso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author José Victor Santos V
 *
 */
@Entity(name = "tb_usuarios")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	private String nome;
	@Column(unique = true, length = 50)
	private String email;
	@Column(length = 30)
	private String senha;

	public Integer getId_usuario() {
		System.out.println("Usuarios - acesso");
		return id_usuario;
	}

	public void setId(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
