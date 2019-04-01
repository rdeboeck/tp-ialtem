
public class LoggingState extends ServerState {
	
	public LoggingState(Server server) {
		super(server);
	}
	
	@Override
	public void disconnect() {
		//Implementation for disconnecting...
		server.setState(new DisconnectState(server));
	}
	
	@Override
	public void query() {
		//implementation 
		//State does not change
	}
	
	@Override
	public void switchLogMode() {
		//Implementation for connecting...
		server.setState(new ConnectState(server));
	}
}
