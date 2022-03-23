package MBeanTest;

public class Settings implements SettingsMBean {

    private static final String DEFAULT_PHRASE = "Why you thing the song N**gas In Paris is called N**gas In Paris?";

    private String name = DEFAULT_PHRASE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = DEFAULT_PHRASE;
    }
}