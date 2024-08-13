/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exercicio_composicao01;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Exercicio_Composicao01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        //Define departamento
        System.out.print("enter department's name: ");
        String department = sc.nextLine();
        
        //Define o Worker
        System.out.println("enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("level: ");
        String level = sc.nextLine();
        System.out.print("base Salary: ");
        double baseSalary = sc.nextDouble();
        
        //define o worker 
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
        
        System.out.print("How Many contracts to this worker? ");
        int nContract = sc.nextInt();
        
        for(int i=1;i<=nContract;i++){
            System.out.printf("Enter Contract #%d data: %n", i);
            System.out.print("Date (DD/MM/YY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            
            HourContract contract = new HourContract(dataContrato, valuePerHour, hours);
            worker.addContract(contract);
        }
        
        
            System.out.println();
            System.out.print("Enter month and year to calculate (MM/yyyy): ");
            String monthYear = sc.next();
            int month = Integer.parseInt(monthYear.substring(0,2));
            int year = Integer.parseInt(monthYear.substring(3));
            
            System.out.println("Name: " + worker.getName());
            System.out.println("Department: " + worker.getDepartement().getDepartment());
            System.out.println("Income for " + monthYear + ":" + String.format("%.2f", worker.income(year, month)));
        
        
        
        
        sc.close();
    }
}
