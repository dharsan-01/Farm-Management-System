package fm_system;
import java.util.*;

import javax.swing.JOptionPane;

public class StMain extends Stockmen {

    StMain()
    {
       // Scanner ss = new Scanner(System.in);
        int oppt;
        oppt=Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to Process Management Team!!" +
                "\n1.StockMen Entry Details!" +
                "\n2.Process Management Details!" +
                "\nEnter your choice: "));
        if(oppt != 4) {
            do
            {
                switch(oppt)
                {
                    case 1:
                    	JOptionPane.showMessageDialog(null,"Welcome to StockMen Entry Details !!!");
                        //System.out.println("Welcome to StockMen Entry Details !!!");
                        Stockmen St = new Stockmen();
                        St.getDet();
                        JOptionPane.showMessageDialog(null,"Entry details done !!");
                        //System.out.println("Entry details done !!");
                        break;
                    case 2:
                    	  JOptionPane.showMessageDialog(null,"Welcome to Process Entry Details !!!");
                    	//System.out.println("Welcome to Process Entry Details !!!");
                        int option,check,flag=0,dum,dum1,dum2;
                       check=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter\\n1.Enter the Raw Process Unit!!\\n2.Exit"));
                        
                        if (check == 1) {
                        	option=Integer.parseInt(JOptionPane.showInputDialog(null,"Choose which condition to check!!" +
                                    "\n1.Thermometer availability" +
                                    "\n2.RawProduct Availilbity" +
                                    "\n3.Level of Product" +
                                    "\n4.Exit" +
                                    "\nEnter your choice: "));
                            
                            do {
                                switch (option) {
                                    case 1:
                                    	JOptionPane.showMessageDialog(null,"Checking the requirements for each Thermometer!!");
                                        //System.out.println("Checking the requirements for each Thermometer!!");
                                        Stockmen ps = new Stockmen();
                                        dum = ps.dataRAW();
                                        ps.StockRAW(dum);
                                    	JOptionPane.showMessageDialog(null,"1st Condition Checked");
                                        //System.out.println("1st Condition Checked");
                                        break;
                                    case 2:
                                    	JOptionPane.showMessageDialog(null,"Checking the requirements for each RawProduct!!");
                                        //System.out.println("Checking the requirements for each RawProducts!!");
                                        Stockmen ps1 = new Stockmen();
                                        dum1 = ps1.dataPROD();
                                        ps1.StockPROD(dum1);
                                    	JOptionPane.showMessageDialog(null,"2nd Condition Checked");
                                        //System.out.println("2nd Condition Checked");
                                        break;
                                    case 3:
                                    	JOptionPane.showMessageDialog(null,"Checking the requirements for each LevelofProd!!");
                                        //System.out.println("Checking the requirements for each LevelofProd!!");
                                        Stockmen ps2 = new Stockmen();
                                        dum2 = ps2.dataLEVEL();
                                        ps2.StockLEVEL(dum2);
                                    	JOptionPane.showMessageDialog(null,"3rd Condition Checked");
                                        //System.out.println("3rd Condition Checked");
                                        break;
                                }
                                /*System.out.println("Choose which condition to check:" +
                                        "\n1.Thermometer availability" +
                                        "\n2.RawProduct Availilbity" +
                                        "\n3.Level of Product" +
                                        "\nEnter your choice: ");*/
                                option = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose which condition to check!!" +
                        "\n1.Thermometer availability" +
                        "\n2.RawProduct Availilbity" +
                        "\n3.Level of Product" +
                        "\n4.Exit" +
                        "\nEnter your choice: "));
                            }while(option != 4);
                        }
                        break;
                    case 3:
                    	JOptionPane.showMessageDialog(null,"Thank U For purchaising!!");
                    	break;
                }
                oppt=Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Process Management Team!!" +
                        "\n1.StockMen Entry Details!" +
                        "\n2.Process Management Details!" +
                        "\n3.Exit!"+
                        "\nEnter your choice: "));
            }while(oppt != 4);
        }
    }
}