package tudelft.evennumber;

public class EvenNumber {

    public void findEvenOdd (int A, int B) {
        if (A > 20) {
            if ( A % 2 == 0 ){
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        }

        if (B > 100) {
            if ( B % 2 == 0 ){
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        }
    }
}
