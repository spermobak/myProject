package SimpleAgent;

import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class SimpleAgent {

    public static void main(String[] args) throws Exception {

        var settings = new Settings();

        ManagementFactory.getPlatformMBeanServer().registerMBean(
                settings,
                new ObjectName("SettingsAgent:name=settings")
        );

        while (true) {
            System.out.println(settings.getName());
            Thread.sleep(2000);
        }
    }
}