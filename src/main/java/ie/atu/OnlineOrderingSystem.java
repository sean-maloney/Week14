package ie.atu;

public class OnlineOrderingSystem {
    MenuItem menuItem=null;

    public static void main(String[] args){

        MenuItem[] menuItems=new MenuItem[]{

                new Burger("Double Cheese Burger",8.50,"Two Patties, two sesame buns, lettuce, tomato pickles cheese"),
                new Burger("Smoked Burger",8.65,"Smoked Patties, bbq sauce, two brioche buns, onions, tomato pickles cheese"),
                new Burger("Chicken Burger",9.25,"Crispy chicken, two brioche buns, lettuce, tomato, pickles, garlic mayo"),

                new Pizza("Peperoni Pizza",16.50,"Pizza base, tomato sauce, mutz, peperoni"),
                new Pizza("Cheese Pizza",16.80,"Pizza base, tomato sauce, mutz"),
                new Pizza("pulled pork pizza",17.35,"Pizza base, tomato sauce, mutz, Pulled pork"),

                new Salad("Ceasar Salad",6.50,"Crustations, Lettuce, Dressing, Chicken"),
                new Salad("Fruit Salad",8.50,"Mangos, Strawberries, Banana, Kiwi"),
                new Salad("PotatoSalad",7.60,"Potatos, Eggs, Chives, mayo"),

                new Desert("Brownie",3.89,"chocolate, brownie"),
                new Desert("Ice cream",4,"Vanilla, cream, ice"),
                new Desert("Trifle",8,"Jelly, Custard, Cream, lady fingers"),
        };
        for(MenuItem MenuItem:menuItems) {
            System.out.println("Name: \n" + MenuItem.getName() + "\nDescription: \n" + MenuItem.getDescription() + "\nPrice: \n" + MenuItem.getPrice() + "\n");
        }

        double totalCost=0;
        for(MenuItem MenuItem:menuItems) {
            totalCost+=MenuItem.getPrice();
        }
        System.out.println(String.format("Total Price: €%.2f", totalCost));

    }
}
