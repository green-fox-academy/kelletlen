import java.util.ArrayList;
public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList <>();

        System.out.println(Names.size());

        Names.add("William");
        if(Names.isEmpty()) {
            System.out.println("ArrayList is Empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        Names.add("John");
        Names.add("Amanda");

        System.out.println(Names.size());

        System.out.println(Names.get(2));

        for(int i=0; i< Names.size();i++) {
            System.out.println(Names.get(i));
        }
        for(int i=0; i< Names.size(); i++) {
            System.out.println(i+1 + "." + Names.get(i));
        }

        Names.remove(1);

        for(int i=Names.size() -1; i >= 0; i--) {
            System.out.println(Names.get(i));
        }

        Names.clear();


    }


}
