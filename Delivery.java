package fm_system;

import java.util.Random;
import javax.swing.JOptionPane;

public class Delivery {
    public String c_name, address, mobile_number, state;
    public int s_fix;
    public int delivery_time;
    public float delivery_charge, price, tot_amt;

    Delivery(float a) {
        price = a;
        this.cust_info();
        this.chk_state();
        this.del_charge();
        this.del_time();
        this.del_info();
    }

    String[] db_name=new String[] {"Sandy", "Maddy", "Joe", "Jack", "Mark Antony"};
    String[] db_number=new String[] {"8838889823", "987655679", "9845768821", "9875667493", "8768995432"};

    public void cust_info() {
        c_name = JOptionPane.showInputDialog("Enter your name : ");
        address = JOptionPane.showInputDialog("Enter your Address : ");
        mobile_number = JOptionPane.showInputDialog("Enter your mobile number : ");
    }

    public void chk_state(){
        state = JOptionPane.showInputDialog("Enter state name : ");
        if (state.equalsIgnoreCase("Tamil Nadu")) {
            s_fix = 1;
        }
        else if (state.equalsIgnoreCase("Karnataka") || state.equalsIgnoreCase("kerala") || state.equalsIgnoreCase("andhra pradesh")){
            s_fix = 2;
        }
        else {
            s_fix = 3;
        }
    }
    public void del_charge(){
        if(s_fix == 1) {
            delivery_charge=250;
        }
        else if (s_fix == 2) {
            delivery_charge=350;
        }
    }

    public void del_time() {

        if (s_fix==1) {
            delivery_time=2;
        }
        else if (s_fix == 2) {
            delivery_time=3;
        }
    }

    public int getRandomElement(String[]arr) {
        return (new Random()).nextInt(arr.length);
    }

    public void del_info() {
        int index= getRandomElement(db_name);
        tot_amt = price + delivery_charge;
        if (s_fix == 3) {
            JOptionPane.showMessageDialog(null, "We apologize, delivery is not available for your state.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Thanks for purchasing with us " + c_name + "! Your delivery has been scheduled:" +
                    "\n\nHere are your delivery details: " +
                    "\nDelivery Man Name: " + db_name[index] +
                    "\nDelivery Man Number: " + db_number[index] +
                    "\nDelivery Duration: " + delivery_time + " Days" +
                    "\nPurchase price: " + price +
                    "\nDelivery Charge: " + delivery_charge +
                    "\nTotal Amount: " + tot_amt +
                    "\n\nYou will be contacted on your mobile number " + mobile_number + " for further information.");
        }
    }
}