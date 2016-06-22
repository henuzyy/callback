/**
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
