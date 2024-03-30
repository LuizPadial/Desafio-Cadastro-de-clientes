#API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.
Tecnologias
Spring Boot
Spring MVC
Spring Data JPA
SpringDoc OpenAPI 3
Mysql

Práticas adotadas:
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
] ```



