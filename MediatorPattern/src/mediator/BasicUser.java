package mediator;

public class BasicUser implements IUser{
	private IChatMediator chatMediator;
	private String name;
	

	public BasicUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void receiveMessage() {
		System.out.println("Message received from : "+this.name);
		
	}

	@Override
	public void sendMessage() {
	    chatMediator.sendMessage();
		
	}

}
