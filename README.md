# Basic Banking System — Java Reconstruction

A new **Java console prototype** inspired by an earlier Android/MySQL academic banking project. This is not the recovered Android application.

## Features
Create accounts, deposit, withdraw, transfer, check balances. In-memory balances use integer cents to avoid floating-point rounding errors.

## Structure
- `src/Bank.java` — business rules
- `src/Main.java` — console demonstration
- `tests/BankTest.java` — self-contained tests

## Run (JDK 17+)
```bash
javac -d out src/Bank.java src/Main.java tests/BankTest.java
java -cp out Main
java -cp out BankTest
```

## Limitations
No database, persistence, authentication, encryption or transaction rollback. Educational use only, never real financial operations.
