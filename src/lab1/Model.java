package lab1;

import static lab1.ModelValidation.*;

/**
 * @author Tomohiro Meo
 */

public class Model {

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     * First constructor
     * no-arg constructor
     */
    public Model(){
    }

    /**
     * Second constructor which initialize all parameters
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Third constructor that only initialize first four parameters
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
    }

    /**
     * Set FirstName
     * it must be 3 to 20 characters long, otherwise do not store
     * @param firstName
     */
    public void setFirstName(String firstName) {
        checkName(firstName);
        this.firstName = firstName;
    }

    /**
     * Set LastName
     * it must be 3 to 20 characters long, otherwise do not store
     * @param lastName
     */
    public void setLastName(String lastName) {
        checkName(firstName);
        this.lastName = lastName;
    }

    /**
     * Set the weight in pounds
     * Weight must be 80 to 280 pounds or it won't be stored
     * @param pounds
     */
    public void setWeight(double pounds){
        checkWeight(pounds);
        this.weight = pounds;
    }

    /**
     * Set the weight in kilograms
     * @param kilograms
     */
    public void setWeight(long kilograms){
        double convertedKg = kilograms*POUNDS_PER_KG;
        checkWeight(convertedKg);
        this.weight = convertedKg;
    }

    /**
     * Set the height in inches
     * Height must be 24 to 84 inches or it won't be stored
     * @param inches
     */
    public void setHeight(int inches){
        checkHeight(inches);
        this.height = inches;
    }

    /**
     * Set the height in inches when the input includes feet and inches
     * @param feet
     * @param inches
     */
    public void setHeight(int feet, int inches){
        int convertedInches = feet * INCHES_PER_FOOT + inches;
        checkHeight(convertedInches);
        this.height = convertedInches;
    }

    /**
     * Set the canTravel
     * if the model can travel or not
     * @param canTravel
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Set the setSmokes
     * smokes or not in smokes
     * @param smokes
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Get firsName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get instance height (inches)
     * @return height (inches)
     */
    public int getHeight() {
        return height;
    }

    /**
     * Get instance weight (kg)
     * @return weight (kg)
     */
    public long getWeightKg() {
        return Math.round( weight / POUNDS_PER_KG);
    }

    /**
     * Get instance weight (lb)
     * @return weight (lb)
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns height in feet and inches
     * @return height in feet and inches
     */
    public String getHeightInFeetAndInches(){
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;

        if (inches == 0)
            return String.format("%d", feet);
        else if (inches == 1)
            return String.format("%d and %d inch", feet, inches);
        else
            return String.format("%d and %d inches", feet, inches);
    }

    /**
     * Get instance that travel or not
     * @return boolean
     */
    public boolean getCanTravel() {
        return canTravel;
    }

    /**
     * Get instance that smoke or not
     * @return boolean
     */
    public boolean getSmokes() {
        return smokes;
    }

    /**
     * Prints detail information about Model
     */
    public void printDetails() {
        String weightPoint = String.format("%.1f", getWeight());

        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + weightPoint + " pounds");

        if (getCanTravel() == true){
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (getSmokes() == true){
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

    /**
     * Calculate Pay rate per hour
     * @return pay rate
     */
    public int calculatePayDollarsPerHour(){
        int perHourRate = BASE_RATE_DOLLARS_PER_HOUR;

        if (weight <= THIN_POUNDS && height >= TALL_INCHES) {
            perHourRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (canTravel == true) {
            perHourRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (smokes == true) {
            perHourRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        return perHourRate;
    }

    /**
     * Prints detail information about this Model
     */
    public void displayModelDetails() {
        String weightInOneDec = String.format("%.1f", getWeight());

        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + weightInOneDec + " pounds");

        if (getCanTravel() == true){
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
        if (getSmokes() == true){
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }

        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }
}
