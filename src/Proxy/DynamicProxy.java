package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	private Object subject;
	public DynamicProxy(Object sbject){
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("befor rent house");
		System.out.println("Method:"+method);
		method.invoke(subject, args);
		System.out.println("after rent house");
		return null;
	}

}
