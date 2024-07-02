import javax.swing.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Expense Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ExpensePanel expensePanel = new ExpensePanel();
        frame.getContentPane().add(expensePanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
