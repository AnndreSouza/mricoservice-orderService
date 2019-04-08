# Microserviços de Order
O que é
--
> Este é um "micro" microserviço para gerenciamento de orders.

Como funciona
--
Todas as requisições precisam receber o content type json
```
Content-Type: application/json
```

## Endpoints

### Save
Método: POST
> http://localhost:8080/order/save

Enviar um json como este abaixo:
```
{
   "email": "andre@teste.com",
   "nome": "andre souza",
   "shippingAddress": "Rua teste",
   "produtos": [
       {
            "idPedido": 0,
            "descricao": "um produto legal",
            "valor": 500.00,
            "qtd": 8
       }
   ],
   "pagamento": {
        "cartao": 70707070,
        "validade": "10/10/2019",
        "bandeira": "Master Card"
   },
   "data": "20/12/2019",
   "status": "Ativo"
}
```

O retorno deste envio será a url de busca por id
```
{
    "URL": "http://localhost:8080/order/findById/0"
}
```

### FindById
Método: GET
> http://localhost:8080/order/finById/:id

Busque os orders passando um id na url. O retorno será o objeto existente
```
{
   "email": "andre@teste.com",
   "nome": "andre souza",
   "shippingAddress": "Rua teste",
   "produtos": [
       {
            "idPedido": 0,
            "descricao": "um produto legal",
            "valor": 500.00,
            "qtd": 8
       }
   ],
   "pagamento": {
        "cartao": 70707070,
        "validade": "10/10/2019",
        "bandeira": "Master Card"
   },
   "data": "20/12/2019",
   "status": "Ativo"
}
```

### Update
Método: POST
> http://localhost:8080/order/update/:id

Atualize os dados de order. Envie um objeto com os dados de order
```
{
   "email": "andre@teste.com",
   "nome": "andre souza",
   "shippingAddress": "Rua teste",
   "produtos": [
       {
            "idPedido": 0,
            "descricao": "um produto legal",
            "valor": 500.00,
            "qtd": 8
       }
   ],
   "pagamento": {
        "cartao": 70707070,
        "validade": "10/10/2019",
        "bandeira": "Master Card"
   },
   "data": "20/12/2019",
   "status": "Ativo"
}
```

Retorna a url para retornar os dados do order
```
{
    "Mensagem": "order atualizado!",
    "Url": "http://localhost:8080/order/findById/0"
}
```

### Delete
Método POST
> http://localhost:8080/order/delete/:id

Remova um order passando o id pela a url
```
{
    "Mensagem": "order: 0 removido!"
}
```