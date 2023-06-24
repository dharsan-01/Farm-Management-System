package fm_system;
import javax.swing.*;

public class Main implements Products {

		public float buffolo_milk(float q)
	    {
	        float stock=150;
	        float price=70;
	        //setTitle("Volume Calculator");
	        if(stock>=q)
	        {
	            JOptionPane.showMessageDialog(null,"Stock left before this purchase: "+stock+" L \n"+"Remaining stock "+(stock-q)+" L \n"+"Cost of purchase "+price*q);
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(null,"Only "+(q-stock)+" L is not available . We'll proceed to order now");
	        }
	        return price*q;
	    }

	    public float cow_milk(float q)
	    {

	        float stock=100;
	        float price=40;
	        if(stock>=q)
	        {
	            JOptionPane.showMessageDialog(null,"Stock left before this purchase: "+stock+" L \n"+"Remaining stock "+(stock-q)+" L \n"+"Cost of purchase "+price*q);
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(null,"Only "+(q-stock)+" L is not available . We'll proceed to order now");
	        }        return price*q;
	    }

	    public float chicken_meat(float q)
	    {
	        float stock=100;
	        float price=200;
	        if(stock>=q)
	        {
	            JOptionPane.showMessageDialog(null,"Stock left before this purchase: "+stock+" Kg \n"+"Remaining stock "+(stock-q)+" Kg \n"+"Cost of purchase "+price*q);
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(null,"Only "+(q-stock)+" Kg is not available . We'll proceed to order now");
	        }        return price*q;
	    }

	    public float lamb_meat(float q)
	    {
	        float stock=70;
	        float price=600;
	        if(stock>=q)
	        {
	            JOptionPane.showMessageDialog(null,"Stock left before this purchase: "+stock+" Kg \n"+"Remaining stock "+(stock-q)+" Kg \n"+"Cost of purchase "+price*q);
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(null,"Only "+(q-stock)+" Kg is not available . We'll proceed to order now");
	        }
	        return price*q;
	    }
	
    

    @Override
    public float cow_milk() {
        return 0;
    }

    @Override
    public float buffolo_milk() {
        return 0;
    }

    @Override
    public float chicken_meat() {
        return 0;
    }

    @Override
    public float lamb_meat() {
        return 0+-+6;
    }
}
