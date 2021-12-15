package com.ibm.controller.advice;

import java.util.Date;

public class ErrorResponse {
		private String errorCode;
		private Date timestamp;
		private String errorMessage;
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public ErrorResponse() {
		}
		
		public ErrorResponse(String errorCode, Date timestamp, String errorMessage) {
			super();
			this.errorCode = errorCode;
			this.timestamp = timestamp;
			this.errorMessage = errorMessage;
		}
		public Date getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}
		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	

}
