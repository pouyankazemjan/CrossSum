public class CrossSum {

        public static int calculateCrossSum (int n) {
            int result = 0;
            while (n > 0) {
                int letzteZiffer = n % 10;//125%10=R 5
                result = result + letzteZiffer;
                n = n / 10;//125/10=12


            }
            return result;
        }
        public static void main(String[] args) {
// Testen Sie Ihr Programm hier
           System.out.println(calculateCrossSum(125));

        }

}
