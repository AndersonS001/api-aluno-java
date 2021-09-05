package br.com.fiap.apialuno.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoModel {

    private String nome;
    private Integer idade;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;
    
}
