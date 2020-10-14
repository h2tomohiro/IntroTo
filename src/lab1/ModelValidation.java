package lab1;

public class ModelValidation {

    public static final int NAME_MIN = 3;
    public static final int NAME_MAX = 20;
    public static final int HEIGHT_MIN = 24;
    public static final int HEIGHT_MAX = 84;
    public static final double WIGHT_MIN = 80;
    public static final double WIGHT_MAX = 280;

    public static boolean checkName(String name){
        if (name.length() < NAME_MIN || name.length() > NAME_MAX ){
            return false;
        }else {
            return true;
        }
    }

    public static boolean checkHeight(int height){
        if (height < HEIGHT_MIN || height > HEIGHT_MAX){
            return false;
        }else {
            return true;
        }
    }

    public static boolean checkWeight(double weight){
        if (WIGHT_MIN < 80|| WIGHT_MAX > 280){
            return false;
        }else {
            return true;
        }
    }
}