package io.github.orionhealth.xbdd.model.xbdd;

public class XbddStepResult {
	private Long duration;
	private String error_message;
	private String status;
	private String manualStatus;

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(final Long duration) {
		this.duration = duration;
	}

	public String getError_message() {
		return this.error_message;
	}

	public void setError_message(final String error_message) {
		this.error_message = error_message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getManualStatus() {
		return this.manualStatus;
	}

	public void setManualStatus(final String manualStatus) {
		this.manualStatus = manualStatus;
	}
}
