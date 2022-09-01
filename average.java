package AverageArray;

public class average {
    public static void main(String[] args) {

        int[] num ={34,24,6,6,67,54,5665,56,64,3,3,654,67,987,34234,578,9,76};

        int sum = 0;

        for (int i: num) {
            sum+=i;
        }
        System.out.println("The sum is: "+sum);

        System.out.println("The array size is: "+num.length);

        double average = (double) sum/ num.length;

        System.out.println("The average is: "+average);
    }
}
