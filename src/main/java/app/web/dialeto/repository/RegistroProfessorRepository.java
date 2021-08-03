package app.web.dialeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.web.dialeto.model.RegistroProfessorModel;

public interface RegistroProfessorRepository extends JpaRepository<RegistroProfessorModel, String> {
	

}
