/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author admin
 */
public class bangkoAccount {
     private String name;
    private int age;
    private int accNum;
    private double balance;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getaccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setAge(int a) {
        this.age = a;

    }

    public void setAccNum(int acc) {
        this.accNum = acc;

    }

    public void setBalance(double b, double c) {
        this.balance = b + c;

    }

}

class main {

    public static void main(String[] args) {

bangkoAccount j = new bangkoAccount();
        j.setName("joash rautraut");
        j.setAge(20);
        j.setAccNum(143734);
        j.setBalance(19923.29, 2712.69);

        System.out.println("BANGKOCENTRAL" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());
}
}
