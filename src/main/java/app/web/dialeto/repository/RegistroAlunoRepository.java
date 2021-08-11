package app.web.dialeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.web.dialeto.model.RegistroAlunoModel;

public interface RegistroAlunoRepository extends JpaRepository<RegistroAlunoModel, String> {

}
