package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService{
	 protected HelloServiceImpl() throws RemoteException {}
	 
	    @Override
	    public String sayHello(String name) throws RemoteException {
	        return String.format("Hello %s", name);
	    }

		@Override
		public String sqyHello() {
			// TODO Auto-generated method stub
			return null;
		}
}
