package fm_system;

import java.util.*;

import javax.swing.JOptionPane;

class Animal_health {
	
	Scanner sc = new Scanner(System.in);
	
	public int num[] = new int[5];
	public int hesick[] = new int[5];
	public int lowhi;
	public int flag1;
	public int flag2;
	public int yn;
	public int book;
	String types[] = new String[5];	
	String age[] = new String[5];

	
	public void getAnimals(){
		
		types[0] = "Cow";
		types[1] = "Buffalo";
		types[2] = "Lamb";
		types[3] = "Chicken";
		
		JOptionPane.showMessageDialog(null,("Animals present in farm: \n1) Cow\n2) Buffalo\n3) Lamb\n4) Chicken"));

		
		for (int i=0; i<5; i++) {
				
			//JOptionPane.showMessageDialog(null,"\nAnimal: "+ types[i] + "\n\nWhat is the number of it?");
			num[i] = Integer.parseInt((JOptionPane.showInputDialog(null,"\nAnimal: "+ types[i] + "\n\nWhat is the number of it?")));
				for (int j=0; j<num[i]; j++) {
					//System.out.println("Infant/Adult/Mature " +types[i]+ " " +(j+1));
					age[i] = JOptionPane.showInputDialog(("Infant/Adult/Mature " +types[i]+ " " +(j+1)));
					//System.out.println("Is " +(j+1)+ " Healthy or Sick?");
					hesick[i] = Integer.parseInt(JOptionPane.showInputDialog(("Is " +(j+1)+ " Healthy or Sick?")));
			
					if (hesick[i] == 1) {
						//System.out.println(types[i]+ (" ") +(j+1)+ " is Healthy. Is Vaccination needed?");
						hesick[i] = Integer.parseInt(JOptionPane.showInputDialog((types[i]+ (" ") +(j+1)+ " is Healthy. Is Vaccination needed?")));
						if (hesick[i] == 1) {
							JOptionPane.showMessageDialog(null,"Apply for vaccination \n");
						
							JOptionPane.showMessageDialog(null,"For " +(types[i])+ " Check vet availability? \n");
								//calls method
								H_Status avai = new H_Status();
								avai.getVetDetails();
							}
						else {
							JOptionPane.showMessageDialog(null,"Vaccination skipped");
						}
						
					}
					else {
						JOptionPane.showMessageDialog(null,types[i]+ (" ") +(j+1)+ " is Sick.");
						//System.out.println("Low/High?");
						lowhi = Integer.parseInt(JOptionPane.showInputDialog(("Low/High?")));						
						
						if (lowhi==1) {
							//System.out.println("Can be vaccinated, Yes/No?");
							hesick[i] = Integer.parseInt(JOptionPane.showInputDialog(("Can be vaccinated, Yes/No?")));
							if (hesick[i] == 1) {
								JOptionPane.showMessageDialog(null,"Apply for vaccination");

								JOptionPane.showMessageDialog(null,"For " +(types[i])+ " Check vet availability? \n");
									//calls method
									H_Status avai = new H_Status();
									avai.getVetDetails();
								}
							else {
								
								JOptionPane.showMessageDialog(null,"Vaccination skipped \n");
							}
							
						}
						else {
							
							JOptionPane.showMessageDialog(null,"Cannot be vaccinated \n");

							//Calls method for illness
							dose amt = new dose();
							if (types[i] == types[0]) {
							amt.getSickDetailsCow();
							}
							else if (types[i] == types[1]) {
								amt.getSickDetailsBuffalo();
								}
							else if (types[i] == types[2]) {
								amt.getSickDetailsLamb();
								}
							else if (types[i] == types[3]) {
								amt.getSickDetailsChicken();
								}
													
						}
						}
					}
		//System.out.println("Animal " +(i+1)+ ": " +types[i]);
		}
	}
}


class H_Status extends Animal_health{
	public int vet;
	public String v_name[] = new String[3];
	public String v_address[] = new String[3];
	public double v_num[] = new double[3];
	
	public void getVetDetails() {
		//array object creation
		
		v_name[0] = "Vaishnavi";
		v_name[1] = "Jeyakumar";
		v_name[2] = "Deepthika";
		
		v_address[0] = "D-406, Agastya Nagar, Coimbatore";
		v_address[1] = "10/13F, Anna Nagar, Coimbatore";
		v_address[2] = "A1, Rithanya Enclave, Coimbatore";

		v_num[0] = 8056649528L;
		v_num[1] = 9482395322L;
		v_num[2] = 8838880441L;
		
		//System.out.println("Choose vet: \n 1)Vaishnavi \n 2)Jeyakumar \n 3)Deepthika");
		vet = Integer.parseInt(JOptionPane.showInputDialog(("Choose vet: \n 1)Vaishnavi \n 2)Jeyakumar \n 3)Deepthika")));
			if (vet == 1) {
				JOptionPane.showMessageDialog(null,"Name: " +v_name[0]+ "\nAddress: " +v_address[0]+ "\nContact: " +v_num[0]);
			}
			else if (vet == 2) {
				JOptionPane.showMessageDialog(null,"Name: " +v_name[1]+ "\nAddress: " +v_address[1]+ "\nContact: " +v_num[1]);
			}
			else if (vet == 3) {
				JOptionPane.showMessageDialog(null,"Name: " +v_name[2]+ "\nAddress: " +v_address[2]+ "\nContact: " +v_num[2]);
			}
			
		
			//System.out.println("\nIs the vet available? Enter 1 for Yes.");
			yn = Integer.parseInt(JOptionPane.showInputDialog(("\nIs the vet available? Enter 1 for Yes.")));
				if (yn == 1) {
					//System.out.println("Vet available. Book Schedule?");
					yn = Integer.parseInt(JOptionPane.showInputDialog(("Vet available. Book Schedule?")));
					
					if (yn == 1) {
						//System.out.println("Slots = 10am | 11am | 3pm | 5pm"); 
						book = Integer.parseInt(JOptionPane.showInputDialog(("Slots = 10am | 11am | 3pm | 5pm")));
						JOptionPane.showMessageDialog(null,"Slot booked for " +book+ "\n");	
							}
					else {
						JOptionPane.showMessageDialog(null,"Schedule not booked \n");	
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Vet not available. Try another vet! \n");
				}	
	}
}
	

class dose extends Animal_health{
	public int disease[] = new int[3];
	
	public void getSickDetailsCow() {

	for (int i=0; i < 1; i++) {
			
			/*System.out.println("1) Black Quarter");
			System.out.println("2) Foot-and-mouth disease");
			System.out.println("3) Botulism");*/
			disease[i] = Integer.parseInt(JOptionPane.showInputDialog("1) Black Quarter\n2) Foot-and-mouth disease\n3) Botulism\n"));
			
			if (disease[i] == 1) {
				JOptionPane.showMessageDialog(null,"Penicillin @ 10,000 units /Kg body weight 1M & locally daily for 5-6 days \n"
									+ "Oxytetracycline in high doses i.e. 5-10 mg/Kg body weight 1M or IV \n"
									+ "Injection. Avil / Cadistin @ 5-10 ml IM \n");
			}
			else if (disease[i] == 2) {
				JOptionPane.showMessageDialog(null,"Mixture of coal-tar and copper sulphate in the proportion of 5:1 to be applied in feet. \n");
			}
			else {
				JOptionPane.showMessageDialog(null,"Administration of antitoxin - Botulism Antitoxin Heptavalent \n");
			}
		}
	}
		
	public void getSickDetailsBuffalo() {
			
		for (int i=0; i < 1; i++) {
			
			/*System.out.println("1) Malignant Catarrhal Fever");
			System.out.println("2) Theilariasis");
			System.out.println("3) Brucellosis");*/
			disease[i] = Integer.parseInt(JOptionPane.showInputDialog("1) Malignant Catarrhal Fever\n2) Theilariasis\n3) Brucellosis"));
			
			if (disease[i] == 1) {
				JOptionPane.showMessageDialog(null,"Oxytetracycline intravenously, vit A, and good nursing should be carried out \n");
			}
			else if (disease[i] == 2) {
				JOptionPane.showMessageDialog(null,"BUTALEX (BUPARVAQUONE) 1.5mg/kg body wt 1/musular. \n"
						+ "Supportive treatment such as B.Complex,Iron,Dextrose are given \n"
						+ "Blood transfusion/PCV transfusion is also effective \n");
			}
			else {
				JOptionPane.showMessageDialog(null,"Antibiotics doxycycline and rifampin in combination for a minimum of 6-8 weeks \n");
			}
		}
	}
	
	public void getSickDetailsLamb() {
		
		System.out.println("What disease?");
		for (int i=0; i < 1; i++) {
			/*System.out.println("1) Enterotoxemia");
			System.out.println("2) Scabby mouth");
			System.out.println("3) Barber's pole worm");*/
			disease[i] = Integer.parseInt(JOptionPane.showInputDialog("1) Enterotoxemia\n2) Scabby mouth\n3) Barber's pole worm"));
			
			if (disease[i] == 1) {
				JOptionPane.showMessageDialog(null,"Administer C and D antitoxin \n"
						+ "Administer penicillin \n");
			}
			else if (disease[i] == 2) {
				JOptionPane.showMessageDialog(null,"Treatment with local antiseptics and pain relief. \n");
			}
			else {
				JOptionPane.showMessageDialog(null,"Administration of Tramisol, levamisole and ivermectin \n");
			}
		}
	}
	
	public void getSickDetailsChicken() {
		
		for (int i=0; i < 1; i++) {
			/*System.out.println("1) Coccidiosis");
			System.out.println("2) Salmonellosis");
			System.out.println("3) Infectious Coryza");*/
			disease[i] = Integer.parseInt(JOptionPane.showInputDialog("1) Coccidiosis\n2) Salmonellosis\n3) Infectious Coryza"));
			
			if (disease[i] == 1) {
				JOptionPane.showMessageDialog(null,"Administer Antiprotozoal Amprolium \n");
			}	
			else if (disease[i] == 2) {
				JOptionPane.showMessageDialog(null,"Combined therapy with oxytetracycline plus neomycin and bacterial culture. \n");
			}
			else {
				JOptionPane.showMessageDialog(null,"Administration of Erythromycin and oxytetracycline or fluoroquinolones and macrolides. \n");
			}		
		}
	}
	}




