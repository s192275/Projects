import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList< ArrayList<String> >groceryList=new ArrayList< ArrayList<String> >();
        ArrayList<String>bakeryList=new ArrayList<String>();
    bakeryList.add("pasta");
    bakeryList.add("garlic breads");
    bakeryList.add("donuts");

    ArrayList<String>produceList=new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    ArrayList<String>drinksList=new ArrayList<String>();
    drinksList.add("Ayran");
    drinksList.add("Water");
    drinksList.add("Coffee");
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);
    System.out.println(groceryList);
    }
}
