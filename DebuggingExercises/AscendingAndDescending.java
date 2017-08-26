import javax.swing.*;
import java.util.Arrays;


public class AscendingAndDescending {


    public static void main(String[] args) {

        String str, ascendOutput,descendOutput;
        int[] a = new int[3];
        int[] reverse = new int[3];

        a[0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an integer"));
        a[1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an integer"));
        a[2] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an integer"));

        Arrays.sort(a);
        ascendOutput = Arrays.toString(a);

        // Tricky stuff: i turned the numbers to a negative and then sorted them then turned it back into a positive and displayed it
        // was the best way i could think of doing it with the current knowledge i have now
        for(int i = 0; i < a.length; i++){
            reverse[i] = a[i] * -1;
        }

        Arrays.sort(reverse);

        for(int i = 0; i < reverse.length; i++){
            reverse[i] = reverse[i] * -1;
        }
        descendOutput = Arrays.toString(reverse);


        JOptionPane.showMessageDialog(null, ascendOutput);
        JOptionPane.showMessageDialog(null, descendOutput);




    }
}
