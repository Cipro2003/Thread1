import java.util.logging.Level;
import java.util.logging.Logger;

public class TimerThread extends Thread {
  private int tempo;
  public TimerThread(int t) {
    this.tempo=t;
  }
  
  @Override
  public void run(){
  for(int i = tempo; i>0; i--){
    try{
        System.out.println(i);
        sleep(1000);
    } catch (InterruptedException ex) {
      Logger.getLogger(TimerThread.class.getName()).log(Level.SEVERE, null, ex);
      } 
    }
  }
}