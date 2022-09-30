public class  Test{
    public static void main(String[] args) {
        double rate1 = EURToUSDConverter( 100, 1.22);
        double rate2 = EURToUSDConverter( 100);
        System.out.printf("%.2f\n", rate1);
        System.out.printf("%.2f\n", rate2);

    }

        static double EURToUSDConverter(double count0fEur, double exchangeCourse){
        return count0fEur * exchangeCourse;
        }
        static double EURToUSDConverter(double cou0Eur){
          double exchangeCourse = 0.973;
            return cou0Eur * exchangeCourse;
        }
        }




