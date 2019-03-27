package br.com.fiap.orderservice.entity;

import lombok.*;

import javax.validation.constraints.Digits;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    private int idPedido;
    private String descricao;

    @Digits(integer = 6, fraction = 2)
    private float valor;

    private int qtd;


}
