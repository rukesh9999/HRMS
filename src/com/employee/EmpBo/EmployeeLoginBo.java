package com.employee.EmpBo;

import com.sun.istack.internal.NotNull;

public class EmployeeLoginBo {
    
	protected String userName;
    
    protected String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeLoginBo [userName=" + userName + ", password=" + password + "]";
	}
	

}
