package org.yujuan.write.thread.lock;

public class Main {

    public static final String objA = "strA";
    public static final String objB = "strB";

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();

    }


    static class Lock1 implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (Main.objA) {
                        System.out.println("Lock1 lock objA");
                        Thread.sleep(3000);
                        synchronized (Main.objB) {
                            System.out.println("Lock1 lock objB");
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class Lock2 implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (Main.objB) {
                        System.out.println("Lock1 lock objB");
                        Thread.sleep(3000);
                        synchronized (Main.objA) {
                            System.out.println("Lock1 lock objA");
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
