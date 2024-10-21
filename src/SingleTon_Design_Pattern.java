class ConfigurationManager{
    private static ConfigurationManager instance;

    private ConfigurationManager(){
        System.out.println("Loading");
    }
    public static ConfigurationManager getInstance(){
        if (instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }
}

public class SingleTon_Design_Pattern {
    public static void main(String[] args) {
        ConfigurationManager config_1 = ConfigurationManager.getInstance();
        System.out.println("ConfigurationManager1 - " + config_1.hashCode());
        ConfigurationManager config_2 = ConfigurationManager.getInstance();
        System.out.println("ConfigurationManager2 - " + config_2.hashCode());

    }
}