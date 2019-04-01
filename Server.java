
public class Server implements ServerOperations {
	
	private ServerState state = new DisconnectState(this);
	
	public void setState(ServerState newState) {
		assert state != null;
		
		state = newState;
		System.out.println("new server state is " + state.getClass().getName());
	}

	@Override
	public void connect() throws IllegalStateException {
		state.connect();		
	}

	@Override
	public void disconnect() throws IllegalStateException {
		state.disconnect();		
	}

	@Override
	public void query() throws IllegalStateException {
		state.query();		
	}

	@Override
	public void optimize() throws IllegalStateException {
		state.optimize();		
	}

	@Override
	public void switchLogMode() throws IllegalStateException {
		state.switchLogMode();		
	}
	
	public ServerState getState()
	{
		return state;
	}

}
