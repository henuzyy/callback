import java.util.concurrent.TimeUnit;

/**
 * Created by zyy on 2016/6/22.
 */
public class B {

    public void doHandler(Listener listener){
        String result = "";
        try {
            TimeUnit.SECONDS.sleep(2);
            result = "hello callback function!";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //此处，调用回调函数
            listener.getResult(result);
        }
    }
}
