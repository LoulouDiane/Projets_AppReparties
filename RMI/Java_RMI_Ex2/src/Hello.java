// Hello.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Hello extends UnicastRemoteObject implements HelloInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	protected Hello(String message) throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		this.setMessage(message);
	}


	@Override
	public String sayHello(String message) throws RemoteException {
		// TODO Auto-generated method stub
		
		System.out.println("On me demande de dire :" + message);
		return message;
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	

}
