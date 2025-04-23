class MultiTasking extends Thread {
    public void run() {
        task1();
        task2();
    }
    void task1() {
        System.out.println("Task 1 is running.");
    }
    void task2() {
        System.out.println("Task 2 is running.");
    }
    public static void main(String[] args) {
        MultiTasking t1 = new MultiTasking();
        t1.start();
    }
}

