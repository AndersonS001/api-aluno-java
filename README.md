# API ALUNO - JAVA

## Configurando o Ambiente

Para executar a aplicação localmente, é necessário possuir instalado e configurado os seguintes programas:

- [Java JDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
- [IDE Visual Studio Code](https://code.visualstudio.com/Download)
- [Java no Visual Studio Code](https://code.visualstudio.com/docs/languages/java)
- [Lombok Annotations Support for VS Code](https://marketplace.visualstudio.com/items?itemName=GabrielBB.vscode-lombok)


## Código Fonte

Para executar a aplicação é necessário clonar o projeto:

```shell
docker network create -d overlay net

git clone https://github.com/AndersonS001/api-aluno-java.git

cd api-aluno-java

docker stack deploy -c docker-compose.yml apialuno

docker stack ps apialuno

docker service ls

docker stack ps apialuno
```

Para encerrar todos os serviços

```shell
docker stack rm apialuno
```
## ENDPOINTS

A documentação da API pode ser encontrada no [Swagger](http://localhost:8080/swagger-ui.html)

## Ferramentas

### Banco de Dados

O Banco de dados utilizado no projeto é o MongoDB Atlas

### Docker

A imagem pode ser encontrada no [Docker Hub](https://hub.docker.com/repository/docker/anderson0000/apialuno)

Aplicação preparada para rodar em cluster Swarm
