
public class MainState {

	public static void main(String[] args) {
		Server server = new Server();
		server.connect();
		server.disconnect();
		server.connect();
		server.switchLogMode();
		server.switchLogMode();
		server.disconnect();
		server.switchLogMode();  // This throws an exception because the server cannot switch in log mode when the state is disconnected.
	}

}
