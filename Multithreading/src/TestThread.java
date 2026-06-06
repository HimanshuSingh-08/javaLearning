public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("Printing From thread");
    }
}
/*
* To Implement any thread we extends the pre-built thread class given by java.
* We overide the current implmentation accoring to our  usecase.
* */