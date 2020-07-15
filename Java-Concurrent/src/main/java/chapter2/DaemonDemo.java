package chapter2;

public class DaemonDemo {
    public static class DaemonT extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("I am Daemon");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        DaemonT daemonT = new DaemonT();
        daemonT.setDaemon(true);
        daemonT.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main end");
    }
}
