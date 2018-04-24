import java.util.Scanner;  


public class airConditioner {
	Scanner sc=new Scanner(System.in);  
	
	boolean status=false;
	int temp;
	boolean fanStatus;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public boolean isFanStatus() {
		return fanStatus;
	}

	public void setFanStatus(boolean fanStatus) {
		this.fanStatus = fanStatus;
	}

	
	
	public void switchACOn(){
		this.status=true;
		System.out.println("AC on.");
	}
	
	public void switchACOff(){
		this.status=false;
		System.out.println("AC Off.");
	}
	
	public void ChangeTemp(int tmp){
		this.temp=tmp;
		System.out.println("Temperature set to "+tmp+" degrees");	
	}
	
	public void switchACFanOn(){
			 fanStatus=true;
			 System.out.println("AC Fan switched on.");
		 }
	public void switchACFanOff(){
		 fanStatus=false;
		 System.out.println("AC Fan switched off.");
	 }

}
