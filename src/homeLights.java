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
			 lightStatus=true;
			 System.out.println("Lights switched on.");
		 
	}

}
