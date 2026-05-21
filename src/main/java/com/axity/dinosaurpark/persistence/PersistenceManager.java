package com.axity.dinosaurpark.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersistenceManager {

    // simulacion base de datos
    private static final String FILE_INGRESOS = "ingresos.csv";
    private static final String FILE_GASTOS = "gastos.csv";
    private static final String FILE_EVENTOS = "eventos.csv";

    public PersistenceManager() {
        //prepara los archivos con sus encabezados
        initFile(FILE_INGRESOS, "Tipo_Ingreso,Monto,Fecha");
        initFile(FILE_GASTOS, "Descripcion_Gasto,Monto,Fecha");
        initFile(FILE_EVENTOS, "Timestamp,Descripcion_Evento");
    }

    private void initFile(String fileName, String header) {
        try (FileWriter fw = new FileWriter(fileName, false);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(header);
        } catch (IOException e) {
            System.err.println("Error al inicializar archivo: " + fileName);
        }
    }

    //INGRESOS
    public void saveRevenue(RevenueRecord record) {
        String data = record.type() + "," + record.amount() + "," + record.date();
        appendLine(FILE_INGRESOS, data);
        System.out.println("[Backend] Ingreso registrado: " + record.type());
    }

    // GASTOS
    public void saveExpense(ExpenseRecord record) {
        String data = record.description() + "," + record.amount() + "," + record.date();
        appendLine(FILE_GASTOS, data);
        System.out.println("[Backend] Gasto registrado: " + record.description());
    }

    //EVENTOS (Bitácora)
    public void logEvent(String description) {
        String data = System.currentTimeMillis() + "," + description;
        appendLine(FILE_EVENTOS, data);
        System.out.println("[Backend] Evento en bitácora: " + description);
    }

    //escribir al final de un archivo sin borrar lo anterior
    private void appendLine(String fileName, String line) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}