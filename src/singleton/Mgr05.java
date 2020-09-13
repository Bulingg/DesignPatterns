package singleton;

/**
 * lazy loading
 * 懒汉式
 * 也达到了按需初始化的目的，但是带来了线程不安全的问题
 * 可以通过synchronized来解决，但也带来效率下降
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            //试图减小加锁代码块，失败不可行
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
