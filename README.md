# API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

##Tecnologias<br>
Spring Boot<br>
Spring MVC<br>
Spring Data JPA<br>
SpringDoc OpenAPI 3<br>
Mysql<br>

### Práticas adotadas:
SOLID, DRY, YAGNI, KISS
API REST
Consultas com Spring Data JPA
Injeção de Dependências
Tratamento de respostas de erro
Geração automática do Swagger com a OpenAPI 3

Como executar

Clonar repositório git
Construir o projeto:
$ ./mvnw clean package
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar

A API poderá ser acessada em localhost:8080. <br>
O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

### Criar tarefa

```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```    

### Listar Tarefas

```
$ http GET :8080/todos
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
] 
```

### Atualizar Tarefa

```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
] 
```
### Remover Tarefa

```
http DELETE :8080/todos/1

[ ]
```




