package logslogslogs;

/**
 * Ejercicio 13: Logs, Logs, Logs!
 * Concepto: Enums / Switch (Tipos enumerados con atributos y constructores)
 *
 * Representa los niveles de severidad de un log con su código numérico asociado.
 */
public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int encodedLevel;

    LogLevel(int encodedLevel) {
        this.encodedLevel = encodedLevel;
    }

    public int getEncodedLevel() {
        return this.encodedLevel;
    }
}
