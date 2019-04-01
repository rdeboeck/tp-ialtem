
public class ConnectState extends ServerState {

	public ConnectState(Server server) {
		super(server);
	}
	
	@Override
	public void disconnect() {
		//Implementation for disconnecting...
		server.setState(new DisconnectState(server));;
	}
	
	@Override
	public void switchLogMode()
	{
		//Implementation for switching log mode...
		server.setState(new LoggingState(server));
	}
	
	@Override
	public void query()
	{
		//Implementation for query...
		//State does not change
	}
}
