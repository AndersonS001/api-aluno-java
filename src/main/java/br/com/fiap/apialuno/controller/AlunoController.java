package br.com.fiap.apialuno.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.apialuno.model.AlunoModel;
import br.com.fiap.apialuno.service.AlunoService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/alunos")
@Api(value = "Aluno Controller")
public class AlunoController {

    private final AlunoService aService;

    public AlunoController(AlunoService aService) {
        this.aService = aService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Cadastra um aluno")
    public AlunoModel cadastraAluno(
            @Parameter(description = "Objeto do aluno cadastrado") @RequestBody AlunoModel aluno) {
        return aService.cadastraAluno(aluno);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtem aluno por id")
    public AlunoModel findAlunoById(@Parameter(description = "Id do aluno cadastrado") @PathVariable String id) {
        return aService.obtemAlunoPorId(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza aluno por id")
    public AlunoModel obtemAlunoPorIdd(@Parameter(description = "Id do aluno cadastrado") @PathVariable String id,
            @RequestBody AlunoModel aluno) {
        return aService.atualizaAlunoPorId(id, aluno);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta aluno por id")
    public void removeAlunoPorId(@Parameter(description = "Id do aluno cadastrado") @PathVariable String id) {
        aService.removeAlunoPorId(id);
    }

    @GetMapping
    @Operation(summary = "Lista todos os alunos")
    public List<AlunoModel> getAlunos() {
        return aService.obtemAlunos();
    }

    @DeleteMapping
    @Operation(summary = "Deleta todos os alunos")
    public void deletaAlunos() {
        aService.deletaAlunos();
    }

}
