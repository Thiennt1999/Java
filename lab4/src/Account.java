
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Account {
    public String AccountNo;
    public String AccountName;
    public String Address;
    public double Amount;
    
public Account()
    {
        
    }
public Account(String no,String name ,String add,double amt)
    {
        AccountNo = no;
        AccountName = name;
        Address = add;
        Amount = amt;
    }
}
