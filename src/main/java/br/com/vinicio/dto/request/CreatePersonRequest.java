package br.com.vinicio.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CreatePersonRequest {

    private String nome;

    private String documento;
}
