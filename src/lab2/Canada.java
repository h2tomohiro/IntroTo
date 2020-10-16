package lab2;

public class Canada {
    private static Province[] provinces;

    public Canada() {
        this.provinces = new Province[10];
        this.provinces[0] = new Province("Quebec", "Quebec City", 8164361);
        this.provinces[1] = new Province("Nova Scotia", "Halifax", 923598);
        this.provinces[2] = new Province("New Brunswick", "Fredericton", 747101);
        this.provinces[3] = new Province("Manitoba", "Winnipeg", 1278365);
        this.provinces[4] = new Province("British Columbia", "Victoria", 4648055);
        this.provinces[5] = new Province("Prince Edward Island", "Charlottetown", 142907);
        this.provinces[6] = new Province("Saskatchewan", "Regina", 1098352);
        this.provinces[7] = new Province("Alberta", "Edmonton", 4067175);
        this.provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 519716);
        this.provinces[9] = new Province("Ontario", "Toronto", 13448494);}

    public void displayAllProvinces() {
        for(Province province: provinces) {
            System.out.println(province);
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int count = 0;
        for(Province province: provinces) {
            if (province.getPopulation() > min * 1000000 && province.getPopulation() < max * 1000000) {
                count += 1;
            }
        } return count;
    }
}
