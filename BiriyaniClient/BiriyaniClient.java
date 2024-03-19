package biriyani;

import java.util.Scanner;

public class BiriyaniClient {
    Scanner scanner=new Scanner(System.in);
    float totalBill=0;
    boolean exit= true;
    //Main method
    public static void main(String[] args){

        Menu obj=new Menu();
        while(obj.exit) {
            obj.menu();
        }

    }
}
