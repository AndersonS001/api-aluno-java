package br.com.fiap.apialuno.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDomain {
    
    public AlunoDomain(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private Integer idade;

    @Id
    private String id;


}
