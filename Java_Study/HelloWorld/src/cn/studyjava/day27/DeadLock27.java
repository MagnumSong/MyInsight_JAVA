package cn.studyjava.day27;

public class DeadLock27 implements Runnable {
    private int i = 0;

    public void run() {
        while (true) {
            if (i%2 == 0) {
                // 先进入A同步，再进入B同步
                synchronized (LockA27.locka27) {
                    System.out.println("if...lock a");
                    synchronized (LockB27.lockb27) {
                        System.out.println("if lock b");
                    }
                }
            } else  {
                //  先进入B同步，再进入A同步
                synchronized (LockB27.lockb27) {
                    System.out.println("if...lock b");
                    synchronized (LockA27.locka27) {
                        System.out.println("if lock a");
                    }
                }
            }
            i++;
        }
    }
}
