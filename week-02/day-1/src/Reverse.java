public class Reverse {
    public static void main(String[] args) {
        int [] numbers = {3,4,5,6,7};

        int temp = numbers[0];
        numbers[0] = numbers[4];
        numbers[4] = temp;

        int temp2 = numbers [1];
        numbers[1] = numbers [3];
        numbers[3] = temp2;



        for (int i =0; i<numbers.length; i++){
            System.out.print(numbers[i]);

        }
    }
}
