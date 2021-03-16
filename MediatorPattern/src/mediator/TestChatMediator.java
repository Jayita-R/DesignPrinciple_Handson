package mediator;

public class TestChatMediator {

	public static void main(String[] args) {
		IChatMediator chatmediator = new ChatMediator();
		IUser user1 = new BasicUser(chatmediator, "Jayita");
		IUser user2 = new BasicUser(chatmediator, "Ishita");

		chatmediator.AddUser(user1);
		chatmediator.AddUser(user2);

		user1.sendMessage();
		user2.receiveMessage();
		user2.sendMessage();
		user1.receiveMessage();

	}

}
