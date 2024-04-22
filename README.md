# Sistema de Peluquería Canina

Este proyecto es un sistema de gestión para una peluquería canina, organizado en tres capas distintas: interfaz gráfica (GUI), lógica de negocio y persistencia de datos.

## Estructura del Proyecto

El proyecto está dividido en las siguientes capas:

1. **Capa de Interfaz Gráfica (GUI)**:
   - La capa GUI contiene la interfaz de usuario desarrollada con JFrame para permitir a los usuarios interactuar con el sistema de manera visual. Aquí se manejan las acciones del usuario, como el registro de mascotas, la visualización de datos y la interacción con la capa de lógica.

2. **Capa de Lógica de Negocio**:
   - La capa de lógica de negocio contiene la funcionalidad principal del sistema. Aquí se implementan las reglas de negocio, la lógica de procesamiento y la manipulación de datos recibidos de la capa de interfaz. Esta capa coordina las operaciones y la lógica detrás de las acciones del usuario.

3. **Capa de Persistencia**:
   - La capa de persistencia se encarga de la conexión con la base de datos MySQL y la gestión de la persistencia de datos. Utiliza tecnologías como JPA (Java Persistence API) para mapear objetos Java a entidades de la base de datos y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.

## Tecnologías Utilizadas

- Java
- JFrame (para la interfaz gráfica)
- Java Persistence API (JPA)
- MySQL (como base de datos relacional)

## Uso

1. **Configuración del Proyecto**:
   - Clona este repositorio en tu entorno de desarrollo (por ejemplo, NetBeans).
   - Configura la conexión a la base de datos MySQL en el archivo `persistence.xml`.

2. **Ejecución**:
   - Compila y ejecuta el proyecto desde tu IDE.
   - Utiliza la interfaz gráfica para registrar, visualizar, editar y eliminar datos de mascotas.

## Estructura del Código Fuente

El código fuente del proyecto está organizado en paquetes según las capas mencionadas:

- `gui/`: Contiene las clases relacionadas con la interfaz gráfica.
- `logica/`: Contiene las clases que implementan la lógica de negocio.
- `persistencia/`: Contiene las clases para la persistencia de datos utilizando JPA.

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, siéntete libre de hacer un fork y enviar un pull request con tus mejoras.

## Autor

Desarrollado por [Mauro Heinrich](https://www.linkedin.com/in/mauroheinrich/).

## Contacto

Si tienes preguntas o sugerencias sobre este proyecto, no dudes en contactarme por correo electrónico: heinrichmauro@gmail.com
