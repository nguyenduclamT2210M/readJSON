package readJSON;

public class MainClass {
    public MainClass(){

    }
     public static void main(String[] args) {
        try {
           JSONManagement jsonManagement = new JSONManagement();
           jsonManagement.readDemo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
