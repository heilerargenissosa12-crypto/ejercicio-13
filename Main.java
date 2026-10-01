package logslogslogs;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 13: Logs, Logs, Logs! (Enums / Switch)");
        System.out.println("==================================================");

        LogLine line1 = new LogLine("[ERR]: Disk full exception");
        LogLine line2 = new LogLine("[INF]: Application started");
        LogLine line3 = new LogLine("[XYZ]: Alien signal received");

        System.out.println("1. Linea 1: [ERR]: Disk full exception");
        System.out.println("   LogLevel:  " + line1.getLogLevel() + " (Esperado: ERROR)");
        System.out.println("   Short Log: " + line1.getOutputForShortLog() + " (Esperado: 6:Disk full exception)");

        System.out.println("\n2. Linea 2: [INF]: Application started");
        System.out.println("   LogLevel:  " + line2.getLogLevel() + " (Esperado: INFO)");
        System.out.println("   Short Log: " + line2.getOutputForShortLog() + " (Esperado: 4:Application started)");

        System.out.println("\n3. Linea 3: [XYZ]: Alien signal received");
        System.out.println("   LogLevel:  " + line3.getLogLevel() + " (Esperado: UNKNOWN)");
        System.out.println("   Short Log: " + line3.getOutputForShortLog() + " (Esperado: 0:Alien signal received)");

        boolean ok = line1.getLogLevel() == LogLevel.ERROR &&
                     line1.getOutputForShortLog().equals("6:Disk full exception") &&
                     line2.getLogLevel() == LogLevel.INFO &&
                     line3.getLogLevel() == LogLevel.UNKNOWN;

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
