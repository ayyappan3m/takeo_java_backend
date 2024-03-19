package biriyani;
public class Menu extends BiriyaniClient{

    void menu(){
        System.out.println("Choose your option:\n1-Biryani\n2-Drinks\n3-IceCrean\n4-Bill\n5-Exit");
        int menuOption=scanner.nextInt();
        switch (menuOption){
            case 1:
                BiryaniMenu();
                break;
            case 2:
                drinkMenu();
                break;
            case 3:
                iceCream();
                break;
            case 4:
                if(totalBill>0){
                System.out.println("your bill is ::"+totalBill);
                }else System.out.println("you haven't ordered anything!!");
                break;
            case 5:
                System.out.println("Your GrandTotal is:"+totalBill+"\n8Thank you! Come Again!");
                exit=false;
                break;
        }
    }
    void BiryaniMenu(){
        boolean back=true;
        System.out.println("!!!Choose the type of Biryani!!! \n1-ChickenBN\n2-VegBn\n3-FishBn\n4-Back");
        while(back) {
        int biryaniOption=scanner.nextInt();

            switch (biryaniOption) {
                case 1:
                    totalBill += 10;
                    break;
                case 2:
                    totalBill += 15;
                    break;
                case 3:
                    totalBill += 20;
                    break;
                case 4:
                    back=false;
                    menu();
                    break;
                default:
                    System.out.println("Wrong Option!");
            }
        }
    }

    void drinkMenu(){
        boolean back=true;
        System.out.println("Choose your drink option: \n1-ColdDrink\n2-HotDrink\n3-Back");
        while(back) {
            int drinkOption = scanner.nextInt();
            switch (drinkOption) {
                case 1:
                    coldDrink();
                    break;
                case 2:
                    hotDrink();
                    break;
                case 3:
                    back=false;
                    menu();
                    break;
            }
        }
    }

    void coldDrink(){
        boolean back=true;
        System.out.println("Choose your ColdDrink: \n1-Sprite\n2-Thumbsup\n3-Back");
        while(back) {
            int coldDrinkOption = scanner.nextInt();
            switch (coldDrinkOption) {
                case 1:
                    totalBill += 5;
                    break;
                case 2:
                    totalBill += 6;
                    break;
                case 3:
                    back=false;
                    drinkMenu();
                    break;
            }
        }
    }

    void hotDrink(){
        boolean back=true;
        System.out.println("Choose your HotDrink:\n1-Tea\n2-Coffee\n3-Back");
        while(back) {
            int hotDrinkOption = scanner.nextInt();
            switch (hotDrinkOption) {
                case 1:
                    totalBill += 5;
                    break;
                case 2:
                    totalBill += 6;
                    break;
                case 3:
                    back=false;
                    drinkMenu();
                    break;
            }
        }
    }

    void iceCream(){
        boolean back=true;
        System.out.println("Choose your IceCream option: \n1- ButterScotch\n2-back");
        while(back) {
            int iceCreamOption = scanner.nextInt();
            switch (iceCreamOption) {
                case 1:
                    totalBill += 8;
                    break;
                case 2:
                    back=false;
                    menu();
                    break;
            }
        }
    }
}