package juc;

class Phone{

    public synchronized void sendEmail(){
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("---sendEmail---");
    }

    public static synchronized void sendSMS(){
        System.out.println("---sendSMS---");
    }

    public void hello(){
        System.out.println("---hello---");
    }
}

public class Lock8 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Phone phone1 = new Phone();

        new Thread(()->{phone.sendEmail();}, "A").start();
        Thread.sleep(100);
        new Thread(()->{phone.sendSMS();}, "B").start();
    }
}
