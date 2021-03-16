package chainrespattern;

public interface ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler = null;
	public void handleRequest(LeaveRequest leaveRequest);

}
