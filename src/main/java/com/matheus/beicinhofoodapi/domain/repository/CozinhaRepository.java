package com.matheus.beicinhofoodapi.domain.repository;
import com.matheus.beicinhofoodapi.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha,Long> {

}
