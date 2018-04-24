
public class washingMachine {
	boolean WMStatus=false;
	boolean dryer=false;
	boolean washer=false;
	boolean drainer=false;
	public boolean isWMStatus() {
		return WMStatus;
	}
	public void setWMStatus(boolean wMStatus) {
		WMStatus = wMStatus;
	}
	public boolean isDryer() {
		return dryer;
	}
	public void setDryer(boolean dryer) {
		this.dryer = dryer;
	}
	public boolean isWasher() {
		return washer;
	}
	public void setWasher(boolean washer) {
		this.washer = washer;
	}
	public boolean isDrainer() {
		return drainer;
	}
	public void setDrainer(boolean drainer) {
		this.drainer = drainer;
	}
	
	public void switchWMOn(){
		 WMStatus=true;
		 System.out.println("Washing Machine switched on.");
	 
	}
	public void switchDryerOn(){
		 if(WMStatus==true)
		 {
			 dryer=true;	
			 System.out.println("Dryer Active.");
		 }
		 else{
			 System.out.println("Turn Washing Machine On.");
		 }
	 
	}
	
	public void switchDrainerOn(){
		 if(WMStatus==true)
		 {
			 drainer=true;	
			 System.out.println("Drainer Active.");
		 }
		 else{
			 System.out.println("Turn Washing Machine On.");
		 }
	 
	}
	
	public void switchWasherOn(){
		 if(WMStatus==true)
		 {
			 drainer=true;	
			 System.out.println("Washer Active.");
		 }
		 else{
			 System.out.println("Turn Washing Machine On.");
		 }
	 
	}

}
