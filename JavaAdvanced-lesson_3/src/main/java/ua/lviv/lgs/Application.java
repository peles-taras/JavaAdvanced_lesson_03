package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Application.class);

		DOMConfigurator.configure("loggerSettings.xml");
		log.debug("TEST DEBUG MESSAGE");
		log.info("TEST INFO MESSAGE");
		log.warn("TEST WARN MESSAGE");
		log.error("TEST ERROR MESSAGE");
		log.fatal("TEST FATAL MESSAGE");

	}
}