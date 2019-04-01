
public class OptimizingState extends ServerState {
	
	public OptimizingState(Server server) {
		super(server);
	}
	
	private void ready() {
		//Implementation
		server.setState(new ConnectState(server));
	}
}
