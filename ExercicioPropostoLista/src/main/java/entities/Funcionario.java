/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author vanio.oliveira
 */
public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public void setIncrease(double porc){
        salary = salary * (1+(porc/100));
    }
    
    public String dadosEmployee(){
        String dados = String.format("%d, %s, %.2f", id, name, salary);
        return dados;
    }
    
}
