Parcial 2 – Proyecto de Prácticas con Interfaces y Pruebas
Este proyecto implementa un prototipo de solución de software con interfaces, implementaciones y pruebas unitarias en Java (Maven + JUnit 5). El objetivo es demostrar buenas prácticas de desarrollo en equipo, control de versiones con Git y pruebas automatizadas.
Integrantes
- Integrante A (Usuarios): Jeisson
  - Rama: feature/jeisson
  - Archivos: IUserService.java, UserServiceImpl.java, UserServiceTest.java
- Integrante B (Pedidos): [Nombre del compañero B]
  - Rama: feature/order-b
  - Archivos: IOrderService.java, OrderServiceImpl.java, OrderServiceTest.java
- Integrante C (Notificaciones + Integración): [Nombre del compañero C]
  - Rama: feature/notify-c
  - Archivos: INotificationService.java, NotificationServiceImpl.java, NotificationServiceTest.java, IntegrationFlowTest.java
Estructura del proyecto
parcial2/
├─ pom.xml
├─ .gitignore
├─ README.md
└─ src
   ├─ main/java/com/practice/
   │  ├─ user/   (Usuarios)
   │  ├─ order/  (Pedidos)
   │  └─ notify/ (Notificaciones)
   └─ test/java/com/practice/
      ├─ user/   (Pruebas de Usuarios)
      ├─ order/  (Pruebas de Pedidos)
      ├─ notify/ (Pruebas de Notificaciones)
      └─ IntegrationFlowTest.java (Prueba de integración)
Tecnologías utilizadas
- Lenguaje: Java 17
- Gestor de dependencias: Maven
- Framework de pruebas: JUnit 5
- Control de versiones: Git + GitHub
Cómo ejecutar el proyecto
1. Clonar el repositorio:
   git clone https://github.com/jeisson88/parcial2.git
   cd parcial2

2. Compilar y ejecutar las pruebas:
   mvn -q -B test

3. Resultado esperado:
   [INFO] BUILD SUCCESS
Flujo de trabajo en Git
- main: rama estable para entregas finales.
- develop: rama de integración de los módulos.
- feature/...: ramas de cada integrante para sus cambios.

Pasos para cada integrante:
1. Cambiar a develop:
   git checkout develop
   git pull origin develop

2. Crear su rama de trabajo:
   git checkout -b feature/<modulo>-<nombre>

3. Subir sus cambios:
   git add .
   git commit -m "feat(<modulo>): interfaz, implementación y pruebas"
   git push -u origin feature/<modulo>-<nombre>

4. Crear Pull Request hacia develop en GitHub.
