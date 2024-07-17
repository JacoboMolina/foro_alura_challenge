# Foro Alura API challenge

Esta es una API para gestionar tópicos en el foro Alura, desarrollada con Java 17, Spring Boot, JPA Hibernate, MySQL, Spring Security y JWT.

## QUE USAMOS?
- Java 17
- Spring Boot
- JPA Hibernate
- MySQL
- Spring Security
- JWT

## Configuración del proyecto en Intellij

### Configuración de la base de datos

1. Crea una base de datos en MySQL llamada `foro_alura`:

    ```sql
    CREATE DATABASE foro_alura;
    ```

2. Configura las credenciales de acceso a la base de datos en el archivo `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/foro_alura
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    spring.security.jwt.secret=tu_secreto_jwt
    spring.security.jwt.expiration=86400000
    ```

### Construcción y ejecución

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu_usuario/foro-alura.git
    cd foro-alura
    ```

2. Construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

3. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

### Uso de la API

### EndPoints 

#### Nuevo Topico

POST /topics
Content-Type: application/json
Authorization: Bearer <token>

{
    "title": "Título del tópico",
    "message": "Contenido del mensaje",
    "author": "Autor"
}

#### Topicos creados

GET /topics
Authorization: Bearer <token>

#### Topico especifico

GET /topics/{id}
Authorization: Bearer <token>

#### Actualizar especifico

PUT /topics/{id}
Content-Type: application/json
Authorization: Bearer <token>

{
    "title": "Nuevo título del tópico",
    "message": "Nuevo contenido del mensaje",
    "author": "Nuevo autor"
}

#### Eliminar especifico

DELETE /topics/{id}
Authorization: Bearer <token>


#### Autenticación

Obtén un token JWT autenticándote con el endpoint de login:

```http
POST /auth/login
Content-Type: application/json

{
    "username": "usuario",
    "password": "contraseña"
}


