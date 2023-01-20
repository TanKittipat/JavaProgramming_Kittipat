import javax.swing.JOptionPane;

public class Doraemon {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Doraemon : Hello, who are you?");
        String name = JOptionPane.showInputDialog(null, "Me : My name is");
        JOptionPane.showMessageDialog(null, "Doraemon : Oh! hi, " + name + ".");
        JOptionPane.showMessageDialog(null, "Doraemon : What can I do for you?");
        JOptionPane.showMessageDialog(null, name + " : I want to go to the Future.");
        JOptionPane.showMessageDialog(null, "Doraemon : Of course, what is the present years?");
        String now = JOptionPane.showInputDialog(null, name + " : It is :");
        JOptionPane.showMessageDialog(null, "Doraemon : OK. How many years do you want to travel?");
        String year = JOptionPane.showInputDialog(null, name + " : I want to go for :");
        JOptionPane.showMessageDialog(null, "Doraemon : OK. Lets gooooooo!");
        JOptionPane.showMessageDialog(null, "......................");
        int now_to_int = Integer.parseInt(now);
        int year_to_int = Integer.parseInt(year);
        JOptionPane.showMessageDialog(null, "Doraemon : Hello, welcome to " + (year_to_int+now_to_int));
        
    }

}
