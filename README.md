# ToDoList

## Comando Docker para PostgreSQL:

docker run --name postgres-todolist -e POSTGRES_DB=todolist -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=12345 -p 5432:5432 -d postgres

#### Após rodar o seguinte comando, um container docker com postgres será inicializado. Desta forma, é possível acessar o banco por um aplicativo, como o Dbeaver, por exemplo, com o respectivo usuário e senha. Em seguida, é possível configurar o projeto para utilizar este banco. 

## Task
### 1. Criar task:
- O projeto deve conter uma rota para criacao de uma nova task.
- A task deve conter um id obrigatório, um nome obrigatório, uma descricao opcional, data de criacao, data de vencimento opcional e um status indicator (pendente, concluída, etc).

### 2. Visualizar task:
- O projeto deve conter uma rota para a visualizacao da task criada e sua busca deve ser realizada a partir do Id gerado na criacao.

### 3. Editar task:
- O projeto deve conter uma rota para edicao de uma task.
- Todos os dados podem ser editados pelo usuário, com excessao do id gerado no momento da criacao e a data de criacao.

### 4. Deletar task:
- O projeto deve conter uma rota que permite o usuário a deletar uma task e a exclui do banco de dados.
