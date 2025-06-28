import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    public Student(String name, String[] subjects, int[] marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        for (int i = 0; i < subjects.length; i++) {
            sb.append(subjects[i]).append(": ").append(marks[i]).append("\n");
        }
        sb.append("Average: ").append(String.format("%.2f", getAverage())).append("\n");
        sb.append("Grade: ").append(getGrade()).append("\n");
        sb.append("---------------------------\n");
        return sb.toString();
    }
}

public class StylishReportCard extends JFrame {
    private ArrayList<Student> students = new ArrayList<>();
    private JTextField[] subjectFields = new JTextField[3];
    private JTextField[] markFields = new JTextField[3];
    private JTextField nameField = new JTextField(15);
    private JTextArea reportArea = new JTextArea(15, 30);

    public StylishReportCard() {
        setTitle("Stylish Report Card Generator");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Student Name:"), gbc);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        for (int i = 0; i < 3; i++) {
            gbc.gridx = 0;
            gbc.gridy = i + 1;
            subjectFields[i] = new JTextField(10);
            panel.add(new JLabel("Subject " + (i + 1) + ":"), gbc);
            gbc.gridx = 1;
            panel.add(subjectFields[i], gbc);

            gbc.gridx = 2;
            markFields[i] = new JTextField(5);
            panel.add(new JLabel("Marks:"), gbc);
            gbc.gridx = 3;
            panel.add(markFields[i], gbc);
        }

        JButton addButton = new JButton("Add Report");
        addButton.setBackground(new Color(72, 201, 176));
        addButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(addButton, gbc);

        reportArea.setEditable(false);
        reportArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(reportArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(scrollPane, gbc);

        add(panel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    if (name.isEmpty()) throw new Exception("Name cannot be empty.");

                    String[] subjects = new String[3];
                    int[] marks = new int[3];

                    for (int i = 0; i < 3; i++) {
                        subjects[i] = subjectFields[i].getText();
                        String markStr = markFields[i].getText();
                        if (subjects[i].isEmpty() || markStr.isEmpty()) {
                            throw new Exception("Subject or mark cannot be empty.");
                        }
                        int mark = Integer.parseInt(markStr);
                        if (mark < 0 || mark > 100) {
                            throw new InvalidMarkException("Marks should be between 0 and 100");
                        }
                        marks[i] = mark;
                    }

                    Student student = new Student(name, subjects, marks);
                    students.add(student);
                    reportArea.append(student.getReport());
                    clearFields();
                } catch (InvalidMarkException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for marks.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void clearFields() {
        nameField.setText("");
        for (int i = 0; i < 3; i++) {
            subjectFields[i].setText("");
            markFields[i].setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StylishReportCard().setVisible(true));
    }
}
