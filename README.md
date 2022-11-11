
# Consulta de preços com taxa de juros

Projeto responsável pela consutla de preços e vendas.

efetuar a chamada do endpoint no endereço:

localhost:8080/compra

Exemplo de payload:

{
    "product": {
        "id": 123,
        "name": "Nome do Produto",
        "price": 9999.99
    },
    "payment": {
        "entry": 9999.99,
        "installments": 999
    }
}

Efetuar a chamada via GET e a passagem do payload via body