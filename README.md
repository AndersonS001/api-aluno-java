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


### Topologia da Solução

![Topologia Solução](https://user-images.githubusercontent.com/31575796/132967830-cc668564-73a7-4320-bfaf-f1b7c485367b.png)


### Video Demonstrativo

https://user-images.githubusercontent.com/31575796/132954612-709ee825-41c4-4781-9c59-9c37523685f9.mp4


