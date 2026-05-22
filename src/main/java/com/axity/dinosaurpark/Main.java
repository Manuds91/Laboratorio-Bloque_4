package com.axity.dinosaurpark;

import com.axity.dinosaurpark.persistence.ExpenseRecord;
import com.axity.dinosaurpark.persistence.PersistenceManager;
import com.axity.dinosaurpark.persistence.RevenueRecord;

public class Main {

    public static void main(String[] args) {
        // inicia gestor de archivos
        PersistenceManager pm = new PersistenceManager();
        System.out.println("--- SISTEMA DE PERSISTENCIA INICIADO ---");

        // simula una venta
        RevenueRecord ingreso = new RevenueRecord("Boleto Alan Grace", 25.0, "2023-10-27");
        pm.saveRevenue(ingreso);

        // simula mantenimiento gasto
        ExpenseRecord gasto = new ExpenseRecord("Reparación de valla eléctrica", 1500.0, "2023-10-27");
        pm.saveExpense(gasto);

        // simulamos algo que pasó (Evento para la bitácora)
        pm.logEvent("Se detectó movimiento en la zona del T-Rex");

        System.out.println("--- PRUEBA FINALIZADA ---");
    }

}