# Driver Points Application

## Descripción

Esta aplicación es una aplicación de escritorio desarrollada en JavaFX que muestra los nombres de los conductores y sus puntos totales en un `TableView`. Los datos se obtienen de una base de datos PostgreSQL utilizando la clase `QueryRepositories`.

## Funcionalidades

- Conexión a una base de datos PostgreSQL.
- Ejecución de una consulta SQL para obtener los 10 conductores con más puntos.
- Visualización de los resultados en un `TableView` con dos columnas: nombre del conductor y total de puntos.

## Requisitos

- JDK 11 o superior.
- JavaFX 11 o superior.
- PostgreSQL JDBC Driver.
- Base de datos PostgreSQL en funcionamiento con la estructura y datos necesarios.

## Instalación

1. **Clonar el repositorio:**

    ```bash
    git clone https://github.com/tuusuario/DriverPointsApp.git
    cd DriverPointsApp
    ```

2. **Configurar la base de datos:**

    Asegúrate de que la base de datos PostgreSQL esté en funcionamiento y tenga la estructura adecuada. Actualiza las credenciales de la base de datos en la clase `QueryRepositories` si es necesario.

    ```java
    // Clase QueryRepositories
    String jdbcURL = "jdbc:postgresql://localhost:5432/Formula1N";
    String username = "postgres";
    String password = "admi123";
    ```

3. **Configurar el proyecto:**

    Si estás utilizando Maven, asegúrate de que tu `pom.xml` incluya las dependencias necesarias para JavaFX y PostgreSQL:

    ```xml
    <dependencies>
        <!-- JavaFX -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>17.0.1</version>
        </dependency>
        <!-- PostgreSQL JDBC Driver -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.3.1</version>
        </dependency>
    </dependencies>
    ```

## Uso

1. **Ejecutar la aplicación:**

    Puedes ejecutar la aplicación desde tu IDE preferido (IntelliJ, Eclipse, etc.) asegurándote de que la clase `DriverPointsApp` sea la clase principal.

    ```java
    public static void main(String[] args) {
        launch(args);
    }
    ```

2. **Visualizar los resultados:**

    Al ejecutar la aplicación, se abrirá una ventana de JavaFX que mostrará un `TableView` con los nombres de los conductores y sus puntos totales, obtenidos de la base de datos.

## Imagen de la ejecución de la app

![Screenshot](ruta/a/la/imagen.png)

## Estructura del Proyecto

- `app.DriverPointsApp`: Clase principal de la aplicación JavaFX.
- `Models.DriverMaxPoint`: Clase modelo para representar los datos de los conductores.
- `Repositories.QueryRepositories`: Clase para manejar las consultas a la base de datos.

## Contribución

Si deseas contribuir a este proyecto, por favor, sigue los pasos a continuación:

1. **Fork** este repositorio.
2. **Crea** una rama para tu característica (`git checkout -b feature/AmazingFeature`).
3. **Commit** tus cambios (`git commit -m 'Add some AmazingFeature'`).
4. **Push** a la rama (`git push origin feature/AmazingFeature`).
5. Abre un **Pull Request**.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
