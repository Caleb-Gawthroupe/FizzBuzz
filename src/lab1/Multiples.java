package lab1;

public class Multiples {
    static void main() {
        int answer = multiples(1000, 3, 5);
        System.out.println(answer);
    }

    public static int multiples(int a, int b, int c) {
        int count = 0;
        for (int i = 1; i < a; i++){
            if (i % b == 0 || i % c == 0){
                count++;
            }
        }
        return count;
    }
}
