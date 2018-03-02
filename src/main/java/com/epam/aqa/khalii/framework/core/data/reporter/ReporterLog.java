package com.epam.aqa.khalii.framework.core.data.reporter;


import com.epam.aqa.khalii.framework.core.data.Constants;
import com.epam.aqa.khalii.framework.core.data.PropertyFactory;
import net.bytebuddy.implementation.FieldAccessor;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;

import java.util.logging.Logger;

public class ReporterLog {

    private static final Logger LOG = Logger.getLogger("Logger");

    static {
        PropertyConfigurator.configure(PropertyFactory.getInstance(Constants.LOG4J_PROPERTY_FILE));
    }

    public static void reportStep(String message) {
        Reporter.log(message);
        LOG.info(message);
    }

    public 	static void reportPass(String message){
        Reporter.log(message);
        LOG.info(message);
    }

    public static void reportFail(String message){
        Reporter.log(message);
        LOG.warning(message);
    }
}
