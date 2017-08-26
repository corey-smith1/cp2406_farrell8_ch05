import javax.swing.*;

public class EvenOdd {

    public static void main(String[] args) {
        String str;
        int checkNumber;
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        checkNumber = Integer.parseInt(str);

        if ((checkNumber % 2) == 0)
            JOptionPane.showMessageDialog(null, checkNumber +" is an even number");
        else
            JOptionPane.showMessageDialog(null, checkNumber +" is an odd number");



    }
}
