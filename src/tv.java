import java.util.Scanner;  

public class tv {
	boolean TVStatus;
	int ChannelNo;
	int VolumeUp;
	int VolumeDown;
	
	public boolean isTVStatus() {
		return TVStatus;
	}
	public void setTVStatus(boolean tVStatus) {
		TVStatus = tVStatus;
	}
	public int getChannelNo() {
		return ChannelNo;
	}
	public void setChannelNo(int channelNo) {
		ChannelNo = channelNo;
	}
	
	public int getVolumeUp() {
		return VolumeUp;
	}
	public void setVolumeUp(int volumeUp) {
		VolumeUp = volumeUp;
	}
	public int getVolumeDown() {
		return VolumeDown;
	}
	public void setVolumeDown(int volumeDown) {
		VolumeDown = volumeDown;
	}
	
	public void swtichTvOn(){
			 TVStatus=true;
			 System.out.println("TV switched on.");
		 }
	
	public void ChangeVolume(){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Increase or Decrease Volume. Reply(I/D)");
		 String reply=sc.next(); 
		 if(reply=="i" | reply=="I")
		 {
			 System.out.println("Enter Volume.");
			 int vol=sc.nextInt(); 
			 this.VolumeUp=this.VolumeUp+vol;
		 }
		 else if(reply=="d" | reply=="D")
		 {
			 System.out.println("Enter Volume.");
			 int vol=sc.nextInt(); 
			 this.VolumeUp=this.VolumeUp-vol;
		 }
		 else{
			 System.out.println("Enter Proper Input");
		 }
		 sc.close(); 
		 
	}
	
	public void ChangeChannel(){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Channel Number.");
		 int ch=sc.nextInt();
		 this.ChannelNo=ch;
		 sc.close(); 
		
	}
}


