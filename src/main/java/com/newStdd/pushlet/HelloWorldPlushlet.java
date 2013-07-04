package com.newStdd.pushlet;

import java.io.Serializable;

import com.newStdd.util.DateUtil;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

@SuppressWarnings("serial")
	  
	public class HelloWorldPlushlet implements Serializable {  
	     public static class MySource1 extends EventPullSource {   
	        @Override   
	        protected long getSleepTime() {   
	        		//单位毫秒
	            return 1000;     
	        }   
	        @Override   
	        protected Event pullEvent() {   
	            Event event =Event.createDataEvent("myevent1");   
	            event.setField("sysDate",DateUtil.getSysDateString(DateUtil.dateFormatYyyy_MM_dd_HH_mm_ss));   
	            return event;    
	        }   
	     }   
	}  
