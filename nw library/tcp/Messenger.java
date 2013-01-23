package tcp;


import java.io.Serializable;

public interface Messenger {
	public void sendGreetings();
	public boolean sendMessage(String msgType, Serializable data);
	//public static Messenger getInstance();
}