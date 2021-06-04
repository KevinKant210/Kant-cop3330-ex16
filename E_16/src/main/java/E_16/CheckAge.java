package E_16;

public class CheckAge {
    private int age;
    public CheckAge(int age){
        this.age = age;
    }

    public boolean isLegal(){

        return (age >= 16 ? true : false);
    }
}
