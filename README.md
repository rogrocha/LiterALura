OBJETIVO: Desenvolver um Catálogo de Livros que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 5 opções de interação. Os livros serão buscados através de uma API específica. As informações sobre a API e as opções de interação com o usuário serão detalhadas na coluna “Backlog”/”Pronto para iniciar”
Digite o nome do livro para busca:
Poesias Completas
Hibernate: select l1_0.id,l1_0.autor_id,l1_0.downloads,l1_0.lingua,l1_0.titulo from livros l1_0 where upper(l1_0.titulo) like upper(?) escape '\'
Hibernate: select a1_0.id,a1_0.ano_morte,a1_0.ano_nascimento,a1_0.nome from autores a1_0 where a1_0.id=?
Livro encontrado no banco de dados:
--------------------- LIVRO ---------------------
Título              : Poesias Completas
Autor               : Machado de Assis
idioma              : pt
Número de downloads : 340
--------------------------------------------------
1
Digite o nome do livro para busca:
Quincas Borba
Hibernate: select l1_0.id,l1_0.autor_id,l1_0.downloads,l1_0.lingua,l1_0.titulo from livros l1_0 where upper(l1_0.titulo) like upper(?) escape '\'
https://gutendex.com/books/?search=Quincas+Borba
Machado de Assis
Hibernate: select a1_0.id,a1_0.ano_morte,a1_0.ano_nascimento,a1_0.nome from autores a1_0 where a1_0.nome=?
Hibernate: insert into livros (autor_id,downloads,lingua,titulo) values (?,?,?,?)
Livro salvo no banco de dados.
--------------------- LIVRO ---------------------
Título              : Quincas Borba
Autor               : Machado de Assis
idioma              : pt
Número de downloads : 291
--------------------------------------------------
