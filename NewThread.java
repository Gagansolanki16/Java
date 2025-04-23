class NewThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start();
    }
}
