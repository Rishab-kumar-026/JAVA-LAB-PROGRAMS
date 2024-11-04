class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running : " + i);
        
        try {
            Thread.sleep(1000);  // Sleep after the loop
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}