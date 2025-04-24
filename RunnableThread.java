class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThread());
        t1.start();
    }
}

