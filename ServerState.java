
public abstract class ServerState implements ServerOperations {
	protected final Server server;
	
	protected ServerState(Server srv) {
		server = srv;
	}

	@Override
	public void connect() throws IllegalStateException {
		throw new IllegalStateException();
	}

	@Override
	public void disconnect() throws IllegalStateException {
		throw new IllegalStateException();
	}

	@Override
	public void query() throws IllegalStateException {
		throw new IllegalStateException();
	}

	@Override
	public void optimize() throws IllegalStateException {
		throw new IllegalStateException();
	}

	@Override
	public void switchLogMode() throws IllegalStateException {
		throw new IllegalStateException();
	}

}
