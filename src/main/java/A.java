/**
 * 回调函数：
 *  A类中调用B类的b(A a)方法[B类是A类中的成员变量]；<br/>
 *  接着B类的b(A a)方法在执行完成之后，又调用A类的d()方法，那么d()函数就称之为回调函数<br/>
 * Created by zyy on 2016/6/22.
 */
public class A implements Listener {

    private B handler;

    public A(B handler) {
        this.handler = handler;
    }

    public void ask() {
        new Thread(new Runnable() {
            public void run() {
                handler.doHandler(A.this);
            }
        }).start();
    }


    public void getResult(String result){
        System.out.println("result = " + result);
    }

}
