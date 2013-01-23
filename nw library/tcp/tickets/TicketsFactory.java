package tcp.tickets;


import java.util.LinkedList;
import java.util.List;


import org.joda.time.DateTime;

public class TicketsFactory {
	/*
	 * Singleton
	 */
	private final static TicketsFactory instance = new TicketsFactory();
	private static List<TicketType> types;
	
	public final static TicketType DEFAULT_TICKET_TYPE = getTicketType(0);
	
	private TicketsFactory(){	
		types = new LinkedList<TicketType>();
		TicketType defaultTicketType = new TicketType("default message", 15, 0);
		types.add(defaultTicketType);
	}
	
	public static TicketsFactory getInstance(){
		return instance;
	}
	
	public boolean addTicketType(String reason_arg, int duration_arg, int type_arg){
		for(TicketType tt : types){
			if(tt.type == type_arg)
				return false;
		}
		
		types.add(new TicketType(reason_arg, duration_arg, type_arg));
		return true;
	}
	
	public boolean removeTicketType(int type_arg){
		for(TicketType tt : types){
			if(tt.type == type_arg)
				types.remove(tt);
				return true;
		}
		return false;
	}
	
	public static TicketType getTicketType(int type){
		for(TicketType tt : types){
			if(tt.type == type)
				return tt;
		}
		for(TicketType tt : types){
			if(tt == DEFAULT_TICKET_TYPE)
				return tt;
		}
		return DEFAULT_TICKET_TYPE;
	}
	
	public static Ticket getTicketFromType(TicketType tt, DateTime startTime, int uniqueID){
		if(tt == null){
			tt = DEFAULT_TICKET_TYPE;
		}
		if(startTime == null){
			startTime = new DateTime(0);
		}
		return new Ticket(tt, startTime, uniqueID);
	}
	
}
