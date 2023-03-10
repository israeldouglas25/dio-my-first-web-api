# Projeto Spring web com Swagger

💎 O objetivo principal é colocar em prática umas das principais ferramentas de desenvolvimento de um projeto web com documentação utilizando o swagger,
através de um projeto Java.

## 🛑 Pré-Requisitos
✅ Java JDK 17 </br >
✅ IDE para desenvolvimento Java </br >
✅ Spring boot 2.7.9 </br >

## 👣 Passo-a-Passo
1. Neste projeto foram aplicadas técnicas de controle com camadas de MODEL, REPOSITORY, CONTROLLER, 
HANDLER e DOC, para modelar aplicação.
2. Classe MODEL foram criados os atributos com seus respectivos GET, SET e TOSTRING;
3. Classe REPOSITORY foi criado a persistência, onde a classe extende a interface 
JPARepository para utilização de recursos especificos como CRUD.
4. Classe CONTROLLER foram criados os mapiamentos, por ser uma API usamos o padrão REST com as 
anotações específicas para recursos HTTPs.
5. Classe HANDLER foram criadas os tratamentos das exceções utilizando a EXCEPTIONHANDLER para 
customizar o retorno das mensagens.
6. Classe DOC foi criada a configuração para utilização e documentação do projeto utilizando o 
SWAGGER para descrever a API RESTFul usando JSON.

## 👏 Conclusão
Neste projeto foi possível aplicar técnicas de desenvolvimento web através de uma API RESTFul.
