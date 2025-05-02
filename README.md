# Entrega 2 - Spring Boot + JPA + H2

Este proyecto es parte de una entrega académica. Consiste en una aplicación backend desarrollada con **Spring Boot**, que permite gestionar clientes y sus facturas, almacenados en una base de datos **H2 en memoria**.

---

## 🛠 Tecnologías usadas

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA
- H2 Database (en memoria)
- Maven

---

## 📦 Estructura del proyecto

- `model/` → Clases entidad: `Cliente`, `Factura`
- `repository/` → Interfaces de acceso a datos
- `service/` → Lógica de negocio
- `controller/` → Endpoints REST (`/clientes`, `/facturas`)
- `resources/` → Configuración (`application.properties`, scripts `schema.sql` y `data.sql`)

---

## ▶️ Cómo correr el proyecto

1. Clonar el repo  
   ```bash
   git clone https://github.com/ssousa2000/javaEntrega2.git
   cd javaEntrega2
Ejecuta el proyecto con Maven:

bash
Copiar
Editar
mvn spring-boot:run
Accede a los endpoints disponibles en:

http://localhost:8080/clientes

http://localhost:8080/facturas

📄 Notas
La base de datos se reinicia en cada ejecución ya que se usa H2 en memoria.

El esquema y datos de prueba se cargan automáticamente desde schema.sql y data.sql.
