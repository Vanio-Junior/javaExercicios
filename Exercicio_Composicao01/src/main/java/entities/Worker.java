/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vanio.oliveira
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Department departement;
    private List<HourContract> contracts = new ArrayList<>();
      

    public Worker(String name, WorkerLevel level, Double baseSalary, Department departement) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departement = departement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartement() {
        return departement;
    }

    public void setDepartement(Department deparetment) {
        this.departement = deparetment;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public Double income (int year, int month){
        double soma = baseSalary;
        for(HourContract c: contracts){
            Date dataContrato = c.getDate();
            int c_year = dataContrato.getYear();
            int c_month = dataContrato.getMonth();
            if(c_year == year && c_month == month){
                soma = soma + c.totalValue();
            }
        }
        return soma;
    }
    
    
}
