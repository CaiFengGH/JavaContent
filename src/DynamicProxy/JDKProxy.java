package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

	private Object targetObj;
	
	public Object newProxy(Object obj){
		this.targetObj = obj;
		return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
				targetObj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkPopedom();
		Object res = null;
		res = method.invoke(targetObj, args);
		return null;
	}

	private void checkPopedom() {
		System.out.println("checkPopedom");
	}
}
