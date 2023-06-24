package fm_system;
import java.util.*;

import javax.swing.JOptionPane;

public class Stockmen {
    //System.out.println("Hello World ");
    public int st_id;
    public String S_Name;
    public String S_Dept;
    public int n,cDept,pDept,paDept;
    int a = 4;
    public int arr[] = new int[n];
    public String arr1[] = new String[a];
    public String arr2[] = new String[a];
    public String arr3[] = new String[a];
    Scanner s = new Scanner(System.in);
    void StockMen(int st_id ,String S_Name,String S_Dept){
        this.st_id=st_id;
        this.S_Name=S_Name;
        this.S_Dept=S_Dept;
    }

    public void getDet() {
    	
        n=Integer.parseInt( JOptionPane.showInputDialog("Enter the no of Stockmen!!"));
        if (n > 12) {
            do {
         
                n =Integer.parseInt(JOptionPane.showInputDialog("Enter valid no of Stockmen(less than 13)!!")) ;
            } while (n > 12);
        }

        String s1 = "Raw";
        String s2 = "Process";
        String s3 = "Pack";
        cDept = arr1.length;
        pDept = arr2.length;
        paDept = arr3.length;
        JOptionPane.showMessageDialog(null,"Entered no " + n + " is Valid ! You may proceed further!!");


        for (int i = 0; i < n; i++) {
        	JOptionPane.showMessageDialog(null,"Enter Stockman" + (i+1) + " details!!");
        	
            S_Name = JOptionPane.showInputDialog("Enter Name!!");

            S_Dept = JOptionPane.showInputDialog("Enter Dept!!");
            while (true) {
                if (S_Dept.equals(s1)) {
                	JOptionPane.showMessageDialog(null,"Raw Class welcomes you Mr." + S_Name);
                    arr1[i] = S_Dept;
                    break;
                } else if (S_Dept.equals(s2)) {
                	JOptionPane.showMessageDialog(null,"Process Class welcomes you Mr." + S_Name);
                    arr2[i] = S_Dept;
                    break;
                } else if (S_Dept.equals(s3)) {
                	JOptionPane.showMessageDialog(null,"Package Class welcomes you Mr." + S_Name);
                    arr3[i] = S_Dept;
                    break;
                } else {
                	
                    S_Dept = JOptionPane.showInputDialog("Enter Dept again!!");
                }
            }
        }
    }

    Scanner sc = new Scanner(System.in);
    {
        float rawprod=100;
        float equipments=20;
        float packages=150;
    }
    public void StockRAW(int ther1) {
        int ther2;
        do
        {
        	
            ther2=Integer.parseInt(JOptionPane.showInputDialog("Thermometer Purchase!!\\nEnter the amt of Thermometer to be added !!"));
        }while(ther2>20);
        JOptionPane.showMessageDialog(null,"Purchased Amt is " + ther2);
        JOptionPane.showMessageDialog(null,"Current available number of thermometers is " + (ther1+ther2));
    }
    public int dataRAW() {
        int ther1;
        do
        {
        	
            ther1=Integer.parseInt(JOptionPane.showInputDialog("Enter the available amount of thermometer:"));
        }while(ther1<5);
        JOptionPane.showMessageDialog(null,"Available Stock is " + ther1);
        return ther1;
    }
    public void StockPROD(int Prod1) {
        int Prod2;
        do
        {
        	
            Prod2=Integer.parseInt(JOptionPane.showInputDialog("Products Purchase!!\\nEnter the amt of Product to be added !!"));
        }while(Prod2>20);
        JOptionPane.showMessageDialog(null,"Purchased Amt is" + Prod2);
        JOptionPane.showMessageDialog(null,"Current available number of thermometers is " + (Prod1+Prod2));
    }
    public int dataPROD() {
        int Prod1;
        do
        {
        	
            Prod1=Integer.parseInt(JOptionPane.showInputDialog("Enter the available amount of Products"));
        }while(Prod1<10);
        JOptionPane.showMessageDialog(null,"Available Stock of Prod is " + Prod1);
        return Prod1;
    }
    public void StockLEVEL(int data1) {
        int data2;
        do
        {
        	
            data2=Integer.parseInt(JOptionPane.showInputDialog("Level of Products Purchase!!\nEnter the Level of Product to be checked!!"));
        }while(data2>20);
        JOptionPane.showMessageDialog(null,"Purchased Amt is" + data2);
        JOptionPane.showMessageDialog(null,"Current available number of Stock is " + (data1+data2));
    }
    public int dataLEVEL() {
        int data1;
        do
        {
        	
            data1=Integer.parseInt(JOptionPane.showInputDialog("Enter the Level of Products"));
        }while(data1<10);
        return data1;
    }
}