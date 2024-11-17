🏥 Hospital API
<div align="center"> <a href="#english">🇺🇸 English</a> | <a href="#portugues">🇧🇷 Português</a> </div>
🇺🇸 English
📄 Project Description
This project is a RESTful API for a hospital management system built using Java, Spring Boot, Spring Data JPA, Lombok, JWT tokens, MySQL, and documented using Springdoc OpenAPI. It allows users to manage doctors, patients, and schedule appointments.

🛠️ Technologies Used
Java: Main programming language.
Spring Boot: Framework for building the API.
Spring Data JPA: For database interaction using ORM.
Lombok: Reduces boilerplate code for models.
JWT (JSON Web Token): For user authentication and authorization.
MySQL: Relational database for storing data.
Springdoc OpenAPI: Automatically generates API documentation.
📦 Features
Doctor Management: Create, read, update, and delete (CRUD) operations for doctors.
Patient Management: CRUD operations for patients.
Appointment Scheduling: Allows scheduling, updating, and canceling appointments.
JWT Authentication: Secure the API using token-based authentication.
API Documentation: Auto-generated with Springdoc OpenAPI, accessible via Swagger UI.
🚀 Getting Started
Prerequisites
Java 17+
Maven
MySQL
Setup
Clone the repository:

bash
Copiar código
git clone https://github.com/yourusername/hospital-api.git
cd hospital-api
Configure the database connection in application.properties:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/hospital
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and run the application:

bash
Copiar código
mvn clean install
mvn spring-boot:run
Access the API at http://localhost:8080.

🔑 Authentication
To access secured endpoints, you need a valid JWT token.

Use the /auth/login endpoint to obtain a token:

json
Copiar código
POST /auth/login
{
  "username": "admin",
  "password": "admin"
}
Include the token in the Authorization header:

makefile
Copiar código
Authorization: Bearer <your-token-here>
📚 API Documentation
Access the full API documentation via Swagger UI at:
http://localhost:8080/swagger-ui.html
OpenAPI specification is available at:
http://localhost:8080/v3/api-docs
📚 API Endpoints
Method	Endpoint	Description
GET	/doctors	List all doctors
POST	/doctors	Add a new doctor
GET	/patients	List all patients
POST	/patients	Add a new patient
POST	/appointments	Schedule an appointment
DELETE	/appointments/{id}	Cancel an appointment
🇧🇷 Português
📄 Descrição do Projeto
Este projeto é uma API RESTful para um sistema de gestão hospitalar, construída com Java, Spring Boot, Spring Data JPA, Lombok, tokens JWT, MySQL e documentada com Springdoc OpenAPI. Ele permite gerenciar médicos, pacientes e agendar consultas.

🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.
Spring Boot: Framework para criação da API.
Spring Data JPA: Para interação com o banco de dados usando ORM.
Lombok: Reduz código repetitivo nos modelos.
JWT (JSON Web Token): Para autenticação e autorização de usuários.
MySQL: Banco de dados relacional para armazenamento de dados.
Springdoc OpenAPI: Gera automaticamente a documentação da API.
📦 Funcionalidades
Gerenciamento de Médicos: Operações CRUD para médicos.
Gerenciamento de Pacientes: Operações CRUD para pacientes.
Agendamento de Consultas: Permite agendar, atualizar e cancelar consultas.
Autenticação JWT: Protege a API usando autenticação baseada em token.
Documentação da API: Gerada automaticamente com Springdoc OpenAPI, acessível via Swagger UI.
🚀 Como Começar
Pré-requisitos
Java 17+
Maven
MySQL
Configuração
Clone o repositório:

bash
Copiar código
git clone https://github.com/seuusuario/hospital-api.git
cd hospital-api
Configure a conexão com o banco de dados em application.properties:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/hospital
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Construa e execute a aplicação:

bash
Copiar código
mvn clean install
mvn spring-boot:run
Acesse a API em http://localhost:8080.

🔑 Autenticação
Para acessar endpoints protegidos, você precisa de um token JWT válido.

Use o endpoint /auth/login para obter um token:

json
Copiar código
POST /auth/login
{
  "username": "admin",
  "password": "admin"
}
Inclua o token no header Authorization:

makefile
Copiar código
Authorization: Bearer <seu-token-aqui>
📚 Documentação da API
Acesse a documentação completa da API via Swagger UI em:
http://localhost:8080/swagger-ui.html
A especificação OpenAPI está disponível em:
http://localhost:8080/v3/api-docs
📚 Endpoints da API
Método	Endpoint	Descrição
GET	/doctors	Listar todos os médicos
POST	/doctors	Adicionar um novo médico
GET	/patients	Listar todos os pacientes
POST	/patients	Adicionar um novo paciente
POST	/appointments	Agendar uma consulta
DELETE	/appointments/{id}	Cancelar uma consulta
📄 Licença
Este projeto está sob a licença MIT.

🤝 Contribuindo
Sinta-se à vontade para abrir issues e enviar pull requests.

FEITO EM APRENDIZADO COM A ESCOLA ALURA
