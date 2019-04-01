
public class DisconnectState extends ServerState {
	
	public DisconnectState(Server server) {
		super(server);
	}
	
	@Override
	public void connect() {
		//Implementation for connecting...
		server.setState(new ConnectState(server));
	}
}
