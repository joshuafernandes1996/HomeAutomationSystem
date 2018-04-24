import java.util.Scanner;

public class audioSystem {
	boolean audioStatus;
	int volume;
	
	public boolean isAudioStatus() {
		return audioStatus;
	}
	public void setAudioStatus(boolean audioStatus) {
		this.audioStatus = audioStatus;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void switchAudioOn(){
		this.audioStatus=true;
		System.out.println("Audio System on.");
	}
	
	public void ChangeVolume(){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Increase or Decrease Volume. Reply(I/D)");
		 String reply=sc.next(); 
		 if(reply=="i" | reply=="I")
		 {
			 System.out.println("Enter Volume.");
			 int vol=sc.nextInt(); 
			 this.volume=this.volume+vol;
		 }
		 else if(reply=="d" | reply=="D")
		 {
			 System.out.println("Enter Volume.");
			 int vol=sc.nextInt(); 
			 this.volume=this.volume-vol;
		 }
		 else{
			 System.out.println("Enter Proper Input");
		 }
		 sc.close(); 
	}
	

}
