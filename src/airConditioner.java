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

	
	
	public void switchACOn(boolean status)
	{
		System.out.println("Switch AC on? Yes/No");
		 String reply=sc.next(); 
		 
		 if(reply=="yes" | reply=="Yes")
		 {
			 status=true;
			 System.out.println("AC switched on.");
		 }
		 sc.close(); 
	}
	
	public void ChangeTemp(int tmp){
		this.temp=tmp;
		System.out.println("Temperature set to "+tmp+" degrees");	
	}
	
	public void switchACFanOn(boolean fanStatus){
		System.out.println("Switch AC Fan on? Yes/No");
		 String reply=sc.next(); 
		 
		 if(reply=="yes" | reply=="Yes")
		 {
			 fanStatus=true;
			 System.out.println("AC Fan switched on.");
		 }
		 sc.close(); 
	}

}
