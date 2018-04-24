import java.util.Scanner;  

public class tv {
	boolean TVStatus=false;
	int ChannelNo=0;
	int VolumeUp=0;
	int VolumeDown=0;
	
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
	
	public void swtichTvOff(){
		 TVStatus=false;
		 System.out.println("TV switched off.");
	 }
	
	public void ChangeVolume(){
		volume(); 
	}
	private void volume() {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Increase or Decrease Volume. Reply(I/D)");
		 String reply=sc.next(); 
		 checkReply(sc, reply);
		 sc.close();
	}
	private void checkReply(Scanner sc, String reply) {
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
	}
	
	public void ChangeChannel(){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Channel Number.");
		 int ch=sc.nextInt();
		 this.ChannelNo=ch;
		 sc.close(); 
		
	}
}


