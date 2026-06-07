public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // New
        t1.start();
        System.out.println(t1.getState()); // Runnable
//        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}

/*
In this we are trying to explore all possible states of thread
- New : When one thread is created
- Runnable : When thread is created and waiting for execution
- Running : When thread is executing or under execution
- Blocked/Waiting : When thread is in waiting or put on hold due certain task.
-
* */


/*
*Time = 0ms

Main:
Create Thread

State = NEW

----------------

Main:
start()

State = RUNNABLE

----------------

Scheduler:
Thread-0 run()

Output:
RUNNING

----------------

Thread-0:
sleep(2000)

State:
TIMED_WAITING

----------------

Main:
Checks state

Output:
TIMED_WAITING

----------------

Main:
join()

WAITING

----------------

2000ms complete

Thread-0 ends

State:
TERMINATED

----------------

Main wakes up

Output:
TERMINATED
* */