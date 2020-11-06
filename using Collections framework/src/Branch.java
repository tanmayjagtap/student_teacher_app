package src;

public enum Branch {
    COMP(0),
    MECH(1),
    EnTC(2);
    private int id;
    
    public static String setBranch(int id){
        switch (id){
            case 1:
                return "COMP";
            case 2:
                return "MECH";
            case 3:
                return "EnTC";
            default:
                return null;
        }
    }

    public int getId(){
        return this.id;
    }

    private Branch(int id){
        this.id = id;
    }
}
