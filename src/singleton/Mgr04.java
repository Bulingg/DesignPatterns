package singleton;

/**
 * lazy loading
 * 懒汉式
 * 也达到了按需初始化的目的，但是带来了线程不安全的问题
 * 可以通过synchronized来解决，但也带来效率下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {
    }

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
