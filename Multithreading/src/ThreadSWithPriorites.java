public class ThreadSWithPriorites extends Thread{
    //constructor
    ThreadSWithPriorites(String name){
        super(name);
    }
    @Override
    public void run() {
        // part where we do execution
        for(int i = 0; i<5; i++){
            // lets do some extra stuff
            String a = "";
            for(int j = 0 ; j<10000;j++){
                a+=a;
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() +
                     " - count " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSWithPriorites l = new ThreadSWithPriorites("Low Priority Thread");
        ThreadSWithPriorites m = new ThreadSWithPriorites("Medium Priority Thread");
        ThreadSWithPriorites h = new ThreadSWithPriorites("High Priority Thread");

        l.setPriority(1);
        m.setPriority(5);
        h.setPriority(10);

        l.start();
        m.start();
        h.start();
    }
}
