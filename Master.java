package fm_system;
import java.util.*;

import javax.swing.JOptionPane;

public class Master {
    public static void main(String args[])
    {
        int choice;
        choice=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice:"
                + "\n1. Animal Maintenance"
                + "\n2. Product Maintenance"
                + "\n3. Place order"));

        Scanner sc=new Scanner(System.in);


        if (choice==1)
        {
            Animal_health type = new Animal_health();
            type.getAnimals();
        }
        else if(choice==3)
        {

            Main obj=new Main();
            float total_price = 0;
            String c,o,q;
            int flag=1;
            while (flag==1)
            {
                o= JOptionPane.showInputDialog("Enter your choice of product:"
                        + "\n1. Buffalo Milk"
                        + "\n2. Cow Milk"
                        + "\n3. Chicken Meat"
                        + "\n4. Lamb Meat");
                int op=Integer.parseInt(o);

                if(op==1)
                {
                    q=JOptionPane.showInputDialog("Enter Quantity (in litres)");
                    float quantity=Float.parseFloat(q);
                    float price = obj.buffolo_milk(quantity);
                    total_price += price;
                }

                else if(op==2)
                {
                    q=JOptionPane.showInputDialog("Enter Quantity (in litres)");
                    float quantity=Float.parseFloat(q);
                    float price = obj.cow_milk(quantity);
                    total_price += price;
                }

                else if(op==3)
                {
                    q=JOptionPane.showInputDialog("Enter Quantity (in kg)");
                    float quantity=Float.parseFloat(q);
                    float price = obj.chicken_meat(quantity);
                    total_price += price;
                }

                else if(op==4)
                {
                    q=JOptionPane.showInputDialog("Enter Quantity (in kg)");
                    float quantity=Float.parseFloat(q);
                    float price = obj.lamb_meat(quantity);
                    total_price += price;
                }

                c=JOptionPane.showInputDialog("Do you want to continue purchase: 1.To continue"
                        + "\n Press any number key to proceed to order");
                flag=Integer.parseInt(c);

            }

            new Delivery(total_price);

        }

        else if(choice==2)
        {
            new StMain();
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"Enter valid option");
        }
    }
}