package br.com.vinicio.dto.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String documento;
}
