import org.omg.Messaging.SyncScopeHelper;

public class DrawChessTable {
    public static void main(String[] args) {

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}




            /* if (j % 2 == 0) {
                System.out.print("% ");
            } else {
                System.out.println(" %");
            }
            } */





