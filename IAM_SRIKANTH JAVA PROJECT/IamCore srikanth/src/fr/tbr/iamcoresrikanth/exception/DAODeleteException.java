package fr.tbr.iamcore.exception;

public class DAODeleteException extends Exception {
	
	private String deleteflt;

	public DAODeleteException(String message) {
		// TODO Auto-generated constructor stub
		this.deleteflt=message;
	}

	public String getDeleteflt() {
		return deleteflt;
	}

	
}
