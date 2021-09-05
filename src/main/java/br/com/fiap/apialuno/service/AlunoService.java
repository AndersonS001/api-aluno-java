package br.com.fiap.apialuno.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.apialuno.domain.AlunoDomain;
import br.com.fiap.apialuno.model.AlunoModel;
import br.com.fiap.apialuno.repository.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository aRepository;

    public AlunoService(AlunoRepository aRepository) {
        this.aRepository = aRepository;
    }

    public AlunoModel cadastraAluno(AlunoModel aluno) {
        AlunoDomain alunoSalvo = aRepository.save(new AlunoDomain(aluno.getNome(), aluno.getIdade()));

        return criaAlunoModel(alunoSalvo);
    }

    public List<AlunoModel> obtemAlunos() {
        return aRepository.findAll().stream().map(x -> criaAlunoModel(x))
        .collect(Collectors.toList());
    }
    
    public void deletaAlunos() {
        aRepository.deleteAll();
    }
    
    public void removeAlunoPorId(String id) {
        AlunoDomain alunoDomain = findById(id);
        
        aRepository.delete(alunoDomain);
    }
    
    public AlunoModel obtemAlunoPorId(String id) {
        AlunoDomain alunoDomain = findById(id);
        
        return criaAlunoModel(alunoDomain);
    }
    
    public AlunoModel atualizaAlunoPorId(String id, AlunoModel aluno) {
        AlunoDomain alunoDomain = findById(id);
        
        alunoDomain.setNome(aluno.getNome());
        alunoDomain.setIdade(aluno.getIdade());
        
        AlunoDomain alunoAlterado = aRepository.save(alunoDomain);
        
        return criaAlunoModel(alunoAlterado);
    }
    
    private AlunoDomain findById(String id) {
        Optional<AlunoDomain> aDomain = aRepository.findById(id);
        
        if (!aDomain.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        return aDomain.get();
    }
    
    private AlunoModel criaAlunoModel(AlunoDomain alunoDomain) {
        return new AlunoModel(alunoDomain.getNome(), alunoDomain.getIdade(), alunoDomain.getId());
    }
}
