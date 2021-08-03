package app.web.dialeto.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author José Victor Vieira
 *
 */
@Entity
@Table(name = "tb_usuarios")
public class RegistroProfessorModel {

	private String nome;
	private String sexo;	
	private String email;
	@Id
	private String cpf;
	private String telefone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dataNascimento;
	private String senha;
	private String senhaConfirm;
	private String sobre;
	private String tipo_usuario = "PROFESSOR";

	public String getNome() {
		System.out.println("RegistroProfessorModel");
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaConfirm() {
		return senhaConfirm;
	}

	public void setSenhaConfirm(String senhaConfirm) {
		this.senhaConfirm = senhaConfirm;
	}
	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroProfessorModel other = (RegistroProfessorModel) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroProfessorModel [nome=" + nome + ", sexo=" + sexo + ", email=" + email + ", cpf=" + cpf
				+ ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", senha=" + senha
				+ ", senhaConfirm=" + senhaConfirm + ", sobre=" + sobre + ", tipo_usuario=" + tipo_usuario + "]";
	}

}
