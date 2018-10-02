package W2;


public class Problem_one{

    String name;
    String id;
    int yearofstudy;
    Problem_one (String name, String id, int yearofstudy){
        this.name = name;
        this.id = id;
        this.yearofstudy = yearofstudy;
    }
    public void setStudent(String newName, String newID, int newYearofstudy){
        this.name = newName;
        this.id = newID;
        this.yearofstudy = newYearofstudy;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getYearofstudy(){
        return this.yearofstudy;
    }

}
