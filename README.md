# callback(回调函数)
 * 回调函数：[分为同步回调和异步回调，此种情况为异步回调]
 *  A类中调用B类的b(A a)方法[B类是A类中的成员变量]；<br/>
 *  接着B类的b(A a)方法在执行完成之后，又调用A类的d()方法，那么d()函数就称之为回调函数<br/>
 * 一般情况下，回调的函数会声明为一个接口
