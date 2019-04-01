
public interface ServerOperations {
	public void connect() throws IllegalStateException;
	public void disconnect() throws IllegalStateException;
	public void query() throws IllegalStateException;
	public void optimize() throws IllegalStateException;
	public void switchLogMode() throws IllegalStateException;
}
