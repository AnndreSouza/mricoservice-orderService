package br.com.fiap.orderservice.entity;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private String email;
    private String nome;
    private String shippingAddress;
    private ArrayList<Pedido> produtos;
    private Pagamento pagamento;
    private String data;
    private String status;
}
