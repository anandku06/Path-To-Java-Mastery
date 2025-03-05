public class RunningThread2 implements Runnable{
    private final String text;

    RunningThread2(String text){
        this.text = text;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
// Thread.currentThread().getName() -> returns the Thread object for the current thread. and gets the name of that thread