package framework.tests;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

/**
 * Sample test
 * 
 * @author Saurav
 *
 */
public class Test1 {
	public static Logger LOG = Logger.getLogger(Test1.class);

	@Test
	public void test() {
		PropertyConfigurator.configure(
				System.getProperty("user.dir") + File.separator + "resources" + File.separator + "log4j.properties");
		LOG.info("test");
	}
}
