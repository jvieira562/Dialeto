package app.web.dialeto.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author José Victor Vieira
 *
 */
@Entity
@Table(name = "tb_usuarios")
public class RegistroAlunoModel {

	private String nome;
	//private String sexo;
	private String email;
	@Id
	private String cpf;

	private String sexo;
	private String telefone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dataNascimento;
	private String senha;
	private String senhaConfirm;
	private String tipo_usuario = "ALUNO";

	public String getNome() {
		System.out.println("RegistroAlunoModel- model");
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public void setSenhaConfirm(String senhaComfirm) {
		this.senhaConfirm = senhaComfirm;
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
		RegistroAlunoModel other = (RegistroAlunoModel) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroAlunoModel [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", sexo=" + sexo
				+ ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", senha=" + senha
				+ ", senhaConfirm=" + senhaConfirm + ", tipo_usuario=" + tipo_usuario + "]";
	}



}
