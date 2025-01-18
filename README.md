# **LITERATURA | Challenge 2 - Oracle Next Education**

![Proyecto](https://img.shields.io/badge/version-1.0-blue) ![Estado](https://img.shields.io/badge/status-terminado-brightgreen) ![Oracle](https://img.shields.io/badge/oracle-latura%20latam-orange)

## **Índice**

- [Descripción](#descripción)
- [Características](#características)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Base de Datos](#base-de-datos)
- [Contacto](#contacto)

---

## **📚 Descripción**

**Catálogo de Libros:** es un proyecto desarrollado como parte del **Challenge ONE** del programa **Oracle Next Education**. El objetivo principal de este proyecto es interactuar con una API externa de libros, donde se realizan solicitudes para obtener información relevante sobre diversos títulos. A lo largo del proceso, se manipulan datos en formato JSON, que luego se almacenan en una base de datos para su posterior consulta y gestión. Finalmente, el proyecto permite aplicar filtros y realizar búsquedas específicas para mostrar los libros y autores de interés, facilitando así la organización y visualización eficiente de la información.

---

## **🌟 Características**

El Catálogo de Libros proporciona 5 opciones:

- **Buscar libro por título**: Encuentra libros por su título.
- **Listar libros registrados**: Muestra todos los libros registrados en la base de datos.
- **Listar autores registrados**: Muestra todos los autores registrados en la base de datos.
- **Listar autores vivos en un determinado año**: Encuentra autores que estaban vivos en un año específico.
- **Listar libros por idioma**: Filtra libros por su idioma.

**Requisitos:**

- 🔢 **Rango de números permitidos**: El sistema solo permite ingresar números del 0 al 5.
- 🚫 **Caracteres no permitidos**: No acepta letras ni caracteres especiales.
- 📚 **Registro único de libros**: No se puede registrar 2 veces un mismo libro.

---

## **🛠️ Tecnologías Utilizadas**

- **Java 17**
- **Spring Boot**
- **JPA**
- **PostgreSQL**
- **Hibernate**
- **Maven**

---

## **💾 Base de datos**

Debe configurar tu base de datos en el archivo application.properties

```
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_de_tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

---

## **Contacto**

<a href="mailto:lisbeth2536@gmail.com"><img src="https://img.icons8.com/fluency/48/000000/gmail.png" alt="Gmail" width="30" height="30"/></a>
<a href="https://www.linkedin.com/in/lisbeth-callata-churata/" target="_blank"><img src="https://cdn1.iconfinder.com/data/icons/logotypes/32/circle-linkedin-512.png" alt="LinkedIn" width="30" height="30"/></a>
<a href="https://github.com/lisbeth-callata" target="_blank"><img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" alt="GitHub" width="30" height="30"/></a>
