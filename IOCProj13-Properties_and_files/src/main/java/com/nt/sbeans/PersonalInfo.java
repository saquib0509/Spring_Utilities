package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonalInfo {
	//values collected from properties files, are injected here
	@Value("${per.myname}") 
	private String myname;
	@Value("${per.age}")
	private Integer age;     //wrapper type- Integer instead of int	
	@Value("${per.addr}")
	private String address;
	@Value("${per.marital}")
	private Boolean marital;
	//Hardcoded Value
	@Value("1002")             
	private Integer id;
	
	//values collected from system files, are injected here
	@Value("${user.name}")
	private String name;
	@Value("${os.version}")
	private String osversion;
	@Value("${os.name}")
	private String osName;
	
	//values collected from env variables, are injected here
	@Value("${Path}")
	private String pathData;
	
	
	
	//toString method
	@Override
	public String toString() {
		return "PersonalInfo [name=" + myname + ", age=" + age + ", address=" + address + ", marital=" + marital + ", id="
				+ id + ", uname=" + name + ", osversion=" + osversion + ", osName=" + osName + ", pathData=" + pathData
				+ "]";
	}
	
	
	
}
