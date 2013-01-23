package tcp;


import java.io.Serializable;

public class NetworkMessage implements Serializable {
	/**
	 * generated
	 */
	private static final long serialVersionUID = -6138556437643363586L;
	
	private final String type;
	private final Serializable data;
	public NetworkMessage(String type, Object data){
		this.type = type;

		this.data = (Serializable) data;
	}
	public String getType() {
		return type;
	}
	public Serializable getData() {
		return data;
	}
}
