package chainrespattern;

public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Jayita");
		leaveRequest.setLeaveDays(4);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.handleRequest(leaveRequest);


	}

}
