package br.com.fiap.apialuno.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.apialuno.domain.AlunoDomain;

public interface AlunoRepository extends MongoRepository<AlunoDomain, String> {
    
}
