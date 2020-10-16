package lab2;

public class Province {

    public static final String[] province =  { "Ontario", "Quebec","British Columbia","Alberta","Manitoba",
            "Saskatchewan","Nova Scotia","New Brunswick","Newfoundland and Labrador","Prince Edward Island"};
    public static final String[] capitals = { "Edmonton","Victoria","Winnipeg","Fredericton","St. John's","Halifax",
            "Toronto","Charlottetown","Quebec City","Regina"};

    private static final long DEFAULT_POPULATION = 4648055;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";

    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population){
        if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)){
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }
    public String getDetails() {
        return "The capital of " + name + " (population. " + population + ") is " + capital + ".";
    }

    public String toString() {
        return "The capital of " + name + " (population " + population + ") is " + capital + ".";
    }

    private boolean isValidProvince(String name) {
        for(String province: province) {
            if (province.equals(name)) {
                return true;
            }
        } return false;
    }

    public long getPopulation() {
        return population;
    }

    private boolean isValidPopulation(long population) {
        if (population >= 30000 && population <= 15000000) {
            return true;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for(String cap: capitals) {
            if (cap.equals(capital)) {
                return true;
            }
        } return false;
    }
}
