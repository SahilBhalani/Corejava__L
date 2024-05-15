package com;

import java.util.List;
import java.util.Set;

public class User {
	
	int id;
	String name,email,password;
	List<String> lang;
	Set<String> sub;
	Address adr;
	List<Info> info;
	
	
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public List<Info> getInfo() {
		return info;
	}
	public void setInfo(List<Info> info) {
		this.info = info;
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}
	public Set<String> getSub() {
		return sub;
	}
	public void setSub(Set<String> sub) {
		this.sub = sub;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+password);
		System.out.println("*******************************");
		
		for(String l : lang)
		{
			System.out.println(l);
		}
		System.out.println("*******************************");
		
		for(String s : sub)
		{
			System.out.println(s);
		}
		System.out.println("*******************************");
		adr.display();
		
		System.out.println("*******************************");
		for(Info i : info)
		{
				i.display();
		}
		
	}
	

}
