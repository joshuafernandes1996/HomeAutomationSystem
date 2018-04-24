import java.util.Scanner;  
public class homeLights {
	Scanner sc=new Scanner(System.in);  
	
	boolean lightStatus;

	public boolean isLightStatus() {
		return lightStatus;
	}

	public void setLightStatus(boolean lightStatus) {
		this.lightStatus = lightStatus;
	}
	
	public void switchLightsOn(){
		System.out.println("Switch Lights on? Yes/No");
		 String reply=sc.next(); 
		 
		 if(reply=="yes" | reply=="Yes")
		 {
			 lightStatus=true;
			 System.out.println("Lights switched on.");
		 }
		 sc.close(); 
		 
	}

}
