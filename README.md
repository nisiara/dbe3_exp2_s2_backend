# Desarrollo Backend 3 | Exp2-S2


## Objetivo del proyecto

En este proyecto de la semana 2 de la experiencia 2 implementa un Backend for Frontend (BFF) con Spring Boot.


Este repositorio en particular representa el Backend principal al cual se conectará el BFF.


## 🛠️ Requisitos
- Java 21
- Maven 4.0
- Dependencias
  - Spring Web
  - Spring Data JPA
  - Oracle Driver
  - Spring Boot Dev Tools
  - Lomkok


## 💾 Base de datos

#### La base de datos es de Oracle Cloud.


## 📡 API Reference

#### Endpoint para Cuentas Anuales (Retorna solo el id de la cuenta)
```bash
curl -X GET http://localhost:8090/backend/api/annual-account
```

#### Endpoint para Intereses
```bash
curl -X GET http://localhost:8090/backend/api/interest
```

#### Endpoint Transacciones
```bash
curl -X GET http://localhost:8090/backend/api/transaction
```


## 🔗 Link
[![Github](https://img.shields.io/badge/github-000000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/nisiara/dbe3_exp2_s2_backend.git)