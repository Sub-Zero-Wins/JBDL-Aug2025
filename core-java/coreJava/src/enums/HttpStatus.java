package enums;

public enum HttpStatus 
{
	NOT_FOUND(404),OK(200);

	int statusCode;
	HttpStatus(int statusCode) {
		this.statusCode=statusCode;
	}

}
