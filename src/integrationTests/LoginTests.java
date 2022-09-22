package integrationTests;

public class LoginTests {

    public int getAge() {
        return age;
    }

    public LoginTests(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println("Hello");
        sayGoodBye("Boban");
        sayGoodBye("Bojan");

        boolean flag = true;
        if (flag){
            System.out.println("Value of flag is true");
        }else {
            System.out.println("Value of flag is false");
        }
    }

    private int age = 8;


    // ovoj metod printa good bye i vrednosta na promenlivata
    /*
    kda;lk
    ajdl
    sdjsaoi
    ojaoi
    sokao
     */
    public static void sayGoodBye(String name){
        // TODO: Add support for multiple users
        // TODO: To be run once BUG-155 is fixed
         System.out.println("Good bye " +name);
    }
}
