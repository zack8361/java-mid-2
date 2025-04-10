package modern.ex03.ex2;

public class RunnableEx {
    public static void main(String[] args) {


        // 1. 익명 클래스 사용
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "스레드 실행중입니다..");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // 2. My Runnable 클래스 사용
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. 람다식 사용
       new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "스레드 실행중입니다..");
        }).start();


    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "스레드 실행중입니다..");
    }
}
