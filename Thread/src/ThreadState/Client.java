package ThreadState;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ThreadState state = new ThreadState();
        Thread thread = new Thread(state);
        System.out.println("新建线程："+ thread.getState());
        thread.start();
        System.out.println("启动线程：" + thread.getState());
        thread.sleep(100);
        System.out.println("计时等待：" +thread.getState());
        thread.sleep(1000);
        System.out.println("等待线程：" + thread.getState());
        state.notifyNow();
        System.out.println("唤醒线程：" + thread.getState());
        thread.sleep(1000);
        System.out.println("终止线程：" +thread.getState());
    }
}
