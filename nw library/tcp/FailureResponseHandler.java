package tcp;


import java.io.Serializable;

public class FailureResponseHandler implements MessageResponder {

	@Override
	public String getType() {
		return Messages.FAILURE;
	}

	@Override
	public void handleMessage(Serializable data) {
		System.out.println("Server says failure: " + (String) data);
	}

}
