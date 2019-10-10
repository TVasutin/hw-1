import org.apache.log4j.Logger;

public class Hello {
    private static final Logger LOG = Logger.getLogger(Hello.class);
    public static void main(String[] args) {
        LOG.info("Application started");
        System.out.println("Hello World");
        LOG.info("Application finished");

    }
}
