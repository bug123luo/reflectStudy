package dudu.service.pojo;

import java.io.Serializable;

public class SimpleMessage implements Serializable {
	
	private String serviceType;
	private String formatVersion;
	private Integer deviceType;
	private String serialNumber;
	private String messageType;
	private String sendTime;
	private String sessionToken;
	private Object messageBody;
	
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getFormatVersion() {
		return formatVersion;
	}
	public void setFormatVersion(String formatVersion) {
		this.formatVersion = formatVersion;
	}
	public Integer getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public Object getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(Object messageBody) {
		this.messageBody = messageBody;
	}
}