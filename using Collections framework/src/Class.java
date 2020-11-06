package src;

public enum Class {
    FIRST_YEAR (0),
    SECOND_YEAR (1),
    THIRD_YEAR (2),
    BACHELOR_YEAR (3);

    private int id;

    public int getId() {
        return this.id;
    }

    public static String setClass(int id){
        switch (id) {
            case 1:
                return "FIRST_YEAR";
            case 2:
                return "SECOND_YEAR";
            case 3:
                return "THIRD_YEAR";
            case 4:
                return "LAST_YEAR";
            default:
                return null;
        }
    }
    
    private Class(int id){
        this.id = id;
    }
}