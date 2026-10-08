# Patrones creacionales

| Patrón | Intención | Componentes y su objetivo | Ejemplo del curso | Uso real |
|---|---|---|---|---|
| **Builder** | Construir objetos complejos paso a paso, con validación | **Producto:** el objeto final, idealmente inmutable.<br>**Builder:** acumula los valores con métodos encadenables.<br>**`build()`:** valida y entrega el objeto terminado.<br>**Director (opcional):** encapsula recetas de construcción predefinidas. | `Computer` + `ComputerBuilder` | `StringBuilder`, Lombok `@Builder`, DTOs |
| **Factory Method** | Delegar a las subclases qué objeto concreto se crea | **Producto (interfaz):** define el contrato común de lo que se crea.<br>**Productos concretos:** implementan el comportamiento específico.<br>**Creador abstracto:** declara el método fábrica y la lógica que lo usa.<br>**Creadores concretos:** deciden qué producto instanciar. | `Hamburguer` + `Restaurante` | Notificaciones (email/SMS/push), loggers |