# Ejercicio 13: Logs, Logs, Logs!

- **Concepto:** Enums / Switch (Tipos enumerados `enum` y sentencias `switch`)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Mapear mensajes de registro a un Enum tipado con niveles de severidad y códigos numéricos.

## Niveles de Log:
- `UNKNOWN`: código 0
- `TRACE`: código 1 (`[TRC]`)
- `DEBUG`: código 2 (`[DBG]`)
- `INFO`: código 4 (`[INF]`)
- `WARNING`: código 5 (`[WRN]`)
- `ERROR`: código 6 (`[ERR]`)
- `FATAL`: código 42 (`[FTL]`)

## Tareas a Implementar:
1. `LogLevel`: Definir los valores del enum y su método `getEncodedLevel()`.
2. `LogLine.getLogLevel()`: Retorna el `LogLevel` parseado del texto.
3. `LogLine.getOutputForShortLog()`: Formatea como `"{codigo}:{mensaje}"`.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
