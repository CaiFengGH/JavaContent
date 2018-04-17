/**
 * @author Ethan
 * @desc 
 * 原理：
 * JDK动态代理：利用反射机制实现代理接口的匿名类，调用具体方法前调用InvokeHandler来处理；
 * CGLIB动态代理：加载代理对象的class文件，通过修改字节码生成子类来处理； 
 * JDK动态代理不能代理类原因：反编译后的类继承自Proxy，由于Java多继承，不能再继承其他类；
 * https://blog.csdn.net/u013126379/article/details/52121096
 * https://blog.csdn.net/mhmyqn/article/details/48474815
 */
package DynamicProxy;