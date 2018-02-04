public class KeyTypeController extends Thread {
	static int i=0;
	
	KeyTypeController() {
		
	}
	public void run(){
		while(true){
			i++;
			System.out.println(i);
			
		}
	}

}
