package logslogslogs;

/**
 * Parsea una línea de log y mapea el acrónimo al Enum LogLevel correspondiente.
 * Formato esperado: "[TRC]: Invalid operation"
 */
public class LogLine {

    private final LogLevel level;
    private final String message;

    public LogLine(String logLine) {
        // Extrae el código de 3 letras entre corchetes, por ejemplo "TRC", "INF"
        int startIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        String code = "";
        if (startIndex != -1 && endIndex > startIndex) {
            code = logLine.substring(startIndex + 1, endIndex);
        }

        switch (code) {
            case "TRC":
                this.level = LogLevel.TRACE;
                break;
            case "DBG":
                this.level = LogLevel.DEBUG;
                break;
            case "INF":
                this.level = LogLevel.INFO;
                break;
            case "WRN":
                this.level = LogLevel.WARNING;
                break;
            case "ERR":
                this.level = LogLevel.ERROR;
                break;
            case "FTL":
                this.level = LogLevel.FATAL;
                break;
            default:
                this.level = LogLevel.UNKNOWN;
                break;
        }

        // Extrae el mensaje después de ": "
        int colonIndex = logLine.indexOf(":");
        if (colonIndex != -1) {
            this.message = logLine.substring(colonIndex + 1).trim();
        } else {
            this.message = logLine;
        }
    }

    public LogLevel getLogLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    /**
     * Devuelve el formato corto de log: "{codigo_numerico}:{mensaje}"
     * Ejemplo: "6:Stack overflow"
     */
    public String getOutputForShortLog() {
        return this.level.getEncodedLevel() + ":" + this.message;
    }
}
