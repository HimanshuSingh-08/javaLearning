public class ThreadMethods extends Thread{
    @Override
    public void run() {
        // part where we do execution
        for(int i = 0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {
        // Create one thread
        ThreadMethods t1 = new ThreadMethods();
        t1.start();
    }
}
