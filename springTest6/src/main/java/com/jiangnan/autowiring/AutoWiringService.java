package com.jiangnan.autowiring;

public class AutoWiringService {
	public AutoWiringDao autoWiringDao;
	
	public AutoWiringService(AutoWiringDao autoWiringDao){
		this.autoWiringDao = autoWiringDao;
	}
	/*
	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}
	*/

	public void say(String word){
		this.autoWiringDao.say(word);
	}	
}
