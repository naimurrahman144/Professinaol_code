package capter9;

public class Bank {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee employee = new Employee();
        manager.setBaseSalary(20000);
        manager.setBonus(10000);
        System.out.println(manager.getSalary());
    }
}
