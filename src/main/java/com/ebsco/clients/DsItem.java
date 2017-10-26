package com.ebsco.clients;

public class DsItem {

	private String hostIp;
	private String port;
	private String pid;
	
	public DsItem() {
		
	}
	
	public DsItem(String hostIp, String port, String pid) {
		this.hostIp = hostIp;
		this.port = port;
		this.pid = pid;
	}
	
	public String GetHostIp() {
		return this.hostIp;
	}
	
	public String GetPort() {
		return this.port;
	}
	
	public String GetPid() {
		return this.pid;
	}
}
