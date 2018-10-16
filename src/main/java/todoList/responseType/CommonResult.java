package todoList.responseType;

public class CommonResult {

	public CommonResult (boolean _state, Object _result) {
		this.result = _result;
		this.state = _state;
	}
	
	public boolean state;
	public Object result;
	
}
