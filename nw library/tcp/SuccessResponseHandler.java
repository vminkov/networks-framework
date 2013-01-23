package tcp;


import java.io.Serializable;

public class SuccessResponseHandler implements MessageResponder {

	@Override
	public String getType() {
		return Messages.SUCCESS;
	}

	@Override
	public void handleMessage(Serializable data) {
		System.out.println("Server says success: " + (String) data);
	}

}
