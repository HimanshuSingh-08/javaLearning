public class ThreadInterupt extends Thread {
    @Override
    public void run(){
        try{
            ThreadInterupt.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Thread is interrupted : " + e);
        }
        System.out.println("Thread is running ....");
    }
    public static void main(String[] args) {
        ThreadInterupt t1;
        t1 = new ThreadInterupt();
        t1.start();
        t1.interrupt();
    }
}

/*
* The concept of thread is like : If we have hold for a thread and we explicitly interrupt
*
* */