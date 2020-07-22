public class UnderstandingStaticVariables {
    int rollNo;
    String name;
    static String collage = "COLLAGE";

    public UnderstandingStaticVariables(int id, String firstName){
        this.rollNo = id;
        this.name = firstName;
    }

    void display(){
        collage = "NEW COLLAGE";
        System.out.println(rollNo + " " + name + " " + collage);
    }
}
