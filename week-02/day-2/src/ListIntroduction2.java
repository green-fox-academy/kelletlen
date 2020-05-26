import java.util.ArrayList;
public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList <>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList <>();

        ListB.addAll(ListA);

        for(int i=0; i<ListB.size(); i++) {
            System.out.println(ListB.get(i));
        }

         if(ListB.contains("Durian")) {
            System.out.println("ListB contains Durian");
         } else {
            System.out.println("ListB does not contain Durian");
         }

         ListB.remove(3);

         ListA.add(4, "Kiwifruit");

         System.out.println(ListA.size());
         System.out.println(ListB.size());

         if(ListA.size() == ListB.size()) {
             System.out.println("ListA is equal to ListB");
         } else if( ListA.size() >ListB.size()) {
             System.out.println("ListA is bigger than ListB");
        } else {
             System.out.println("ListB is bigger than ListA");
        }

         System.out.println(ListA.indexOf("Avocado"));

         System.out.println(ListB.indexOf("Durian"));

         ArrayList<String> newList = new ArrayList <>();

         newList.add("Passion Fruit");
         newList.add("Pomelo");

         ListB.addAll(newList);

         System.out.println(ListB);

         System.out.println(ListA.get(2));







    }




}
