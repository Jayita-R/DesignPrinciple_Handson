package chainrespattern;

public class HR implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();

		if (leaveDays > 5) {
			System.out.println("Meet HR for getting your Leave Request");
		} 

	}

}
