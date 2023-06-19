# Sistema de Reservas de Tickets de Tren
Este proyecto es un sistema de reservas de viajes en tren por el interior del país. Permite a los usuarios reservar y administrar tickets para los recorridos disponibles.

# Descripción del Sistema
El sistema se encarga de administrar las reservas de tickets de tren. Cada reserva tiene un código único, un recorrido específico y la cantidad de personas que viajarán.
Las estaciones posibles, en orden, son: Buenos Aires, Luján, Mercedes, Suipacha, Chivilcoy, Alberti y Bragado. Se espera que el sistema sea escalable para incorporar nuevas estaciones en el futuro.
El precio de una reserva se calcula multiplicando la cantidad de personas por el precio del boleto, que actualmente es de $50. Si el viaje es de cabecera a cabecera (Buenos Aires-Bragado o viceversa), se ofrece un descuento del 20%.

# Diagrama de Clases
![train-ticket-booking-system](https://github.com/JuanHerrero28/train-ticket-booking-system/assets/95451727/3ad2d3fc-d825-4ada-a6c9-cc7edfc57d97)

# Caracteristicas
- Selección de recorridos disponibles
- Reserva de tickets para recorridos específicos
- Visualización de reservas existentes
- Cálculo de monto total recaudado por todas las reservas
- Conteo de la cantidad de personas que pasarán por una estación específica

# Tecnologías Utilizadas
- Lenguaje de programación: Java
- Control de versiones: Git

# Contribución
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

Crea un fork de este repositorio.
Realiza tus cambios en una rama separada.
Envía un pull request con tus cambios.

# Autor
Juan Manuel Herrero
Emiliano Nakayama
