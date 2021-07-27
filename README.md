# TODO-LIST-API

Repositório para desenvolver uma RESTFUL API simples em Java que armazena e atualiza tarefas(TODO-LIST API)


### 💻 Desenvolvedor
- [Bruno Oliveira](https://github.com/BrunoSantosdeOliveira)
- Aluno de graduação em Ciência da Computação na UFABC.



## 🚀 Ferramentas Utilizadas

Tecnologias que utilizamos para desenvolver este web client:

- [Java](https://www.java.com/pt-BR/)
- [IDE Eclipse](https://www.eclipse.org/eclipseide/)
- [MySql](https://www.mysql.com/downloads/)
- [SQLServer](https://www.microsoft.com/pt-br/sql-server/sql-server-downloads)
- [SpringBoot](https://start.spring.io/)



## 👨🏻‍💻 Objetivos
<p>-API RESTFUL com login :</p>
<p>-Gerenciamento de tarefas para cada usuario cadastrado</p>




## ⚙️ ESPECIFICAÇÕES
Algumas tecnologias são obrigatórias para este projeto:
Banco de Dados: MySQL
API:Java

## ⚙️ Funcionalidades
Funcionalidades que o sistema oferece:
- API Todo-list-api que faz Login 
  - Atributos definidos classe(UsuarioMOdel.java):
   - nome(string)
	  -senha(int)
    -codigo(Integer)
    Coreespondete no Banco Mysql(table :usuario):
   - nome(varchar(40))
	  -senha(int)
    -codigo(int primary key)
  -Interface UsuarioReposytory herda da classe CrudRepository:
   - Metodo findUsuarioByloginSenha que passa uma querry busca por nome e senha
    
    Funcionalidades que o sistema oferece:
- API agenda 
  - Atributos definidos classe(AgendaMOdel.java):
   - id(Integer)
	  -datainclusao(Date)
    -resumo(String)
    -descricao(String)
    -status(String)
    -da_altera(Date)
    -codigo(int)
    Coreespondete no Banco Mysql(table: agenda):
   - id(id int primary key)
	  -datainclusao(datetime)
    -resumo(varchar(60))
    -descricao(varchar(30))
    -status(varchar(30))
    -da_altera(datitime)
    -codigo(int foreign key)
