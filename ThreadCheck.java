class ThreadCheck extends Thread {
    public void run() {
        System.out.println("New thread is running.");
    }

    public static void main(String[] args) {
        System.out.println("Active threads before: " + Thread.activeCount());
        ThreadCheck t1 = new ThreadCheck();
        t1.start();
        System.out.println("Active threads after: " + Thread.activeCount());
    }
}

