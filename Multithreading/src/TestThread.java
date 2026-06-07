public class TestThread extends Thread{
    @Override
    public void run() {
        //to make it visible lets do some task inside this thread
        for (int i = 0; i<5; i++){
            System.out.println("Printing From thread");
        }
    }
}
/*
* To Implement any thread we extends the pre-built thread class given by java.
* We overide the current implmentation accoring to our  usecase.
* */