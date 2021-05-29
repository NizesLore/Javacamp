package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result( boolean success) {
		this.success=success;
	}
	
    public Result( boolean success, String message) {
    	this(success);
    	this.message=message;
	}
    //Disaridan erisimi saglamak icin iki tane get yazıyoruz, getSuccess de yazilabilir ama genellikle isSucess kullanilir
    
    public boolean isSuccess() {
    	return this.success;
    	
    }
    public String getMessage() {
    	return this.message;
    	
    }

}
