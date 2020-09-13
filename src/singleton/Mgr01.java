package singleton;

/**
 * 饿汉式
 * 类加载到内存中就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管你是否使用到这个类，类加载时都会被实例化
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {};

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] srgs) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
