package proxy_pattern.reflection_example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/6/23.
 *
 * 参考http://www.cnblogs.com/xiaoluo501395377/p/3383130.html
 */
public class VectorProxy implements InvocationHandler {

    private Object proxyObject;

    public VectorProxy(Object o) {
        proxyObject = o;
    }

    /**
     *通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
     * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
     * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
     * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
     */
    public static Object factory(Object o) {

        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new VectorProxy(o)
        );

    }


    /**
     * 调用特定方法
     * @param proxy 指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before calling " + method);

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args " + args[i]);
            }
        }

        Object o = method.invoke(proxyObject, args);

        System.out.println("after calling " + method);


        return o;
    }

    public static void main(String[] arhs) {
        List list = null;

        list = (List) factory(new Vector(10));

        list.add("New");
        list.add("York");
    }
}
