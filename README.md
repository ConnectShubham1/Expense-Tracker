# Expense-Tracker
A simple application to track daily expenses with features to add, delete, and view expenses.
# Expense Tracker

## Description

A simple application to track daily expenses with features to add and view expenses.

## How to Run

1. **Compile the Java files**:
    ```
    javac src/ExpenseTracker.java src/ExpensePanel.java src/Expense.java
    ```

2. **Run the ExpenseTracker**:
    ```
    java -cp src ExpenseTracker
    ```

3. **Follow the prompts**:
    - Enter an amount and click on the "Add" button to add an expense.
    - The application will display the list of entered expenses.

## Example Code

### ExpensePanel.java

```java
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
        // Panel initialization code as shown previously
    }

    private class AddButtonListener implements ActionListener {
        // ActionListener implementation as shown previously
    }

    private void displayExpenses() {
        // Method to display expenses as shown previously
    }
}
