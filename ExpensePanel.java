import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExpensePanel extends JPanel {
    private final JTextField amountField;
    private final JTextArea expenseArea;
    private final ArrayList<Expense> expenses;

    public ExpensePanel() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.white);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Expense Tracker", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel amountLabel = new JLabel("Amount: ");
        amountField = new JTextField(10);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.CENTER);

        expenseArea = new JTextArea(10, 30);
        expenseArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(expenseArea);
        add(scrollPane, BorderLayout.SOUTH);

        expenses = new ArrayList<>();
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String amountText = amountField.getText().trim();
            if (!amountText.isEmpty()) {
                try {
                    double amount = Double.parseDouble(amountText);
                    Expense newExpense = new Expense(amount);
                    expenses.add(newExpense);
                    displayExpenses();
                    amountField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid amount format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an amount.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void displayExpenses() {
        expenseArea.setText("");
        for (Expense expense : expenses) {
            expenseArea.append("Amount: $" + expense.getAmount() + "\n");
        }
    }
}
