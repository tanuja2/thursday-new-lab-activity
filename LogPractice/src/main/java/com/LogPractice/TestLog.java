package com.LogPractice;


import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestLog {

	private static Logger Log=Logger.getLogger(TestLog.class);
		public static void main(String[] args) throws IOException {
			
	
			//Layout layout=new SimpleLayout();
			//Layout layout=new XMLLayout();
			//Layout layout=new HTMLLayout();
	Layout layout=new PatternLayout("%d %C %M %m %n");
			
			Appender app=new FileAppender(layout,"C:\\New folder\\testapp");
			Log.addAppender(app);
		    Log.info("from info");
			Log.debug("from debug");
			Log.fatal("from fatal");
			Log.error("from error");
			Log.warn("from warn");

		}

	
	}


