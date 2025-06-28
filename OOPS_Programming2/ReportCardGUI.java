package OOPS_Programming2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class ReportCardGUI extends JFrame {
    private JTextField nameField;
    private JTextField[] subjectFields;
    private JTextField[] markFields;
    private JButton generateButton;
    private JTextArea resultArea;

    public ReportCardGUI() {
        setTitle("Report Card Generator");
        setSize(500, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(9, 2, 10, 10));

        nameField = new JTextField();
        inputPanel.add(new JLabel("Student Name:"));
        inputPanel.add(nameField);

        subjectFields = new JTextField[3];
        markFields = new JTextField[3];

        for (int i = 0; i < 3; i++) {
            subjectFields[i] = new JTextField();
            markFields[i] = new JTextField();
            inputPanel.add(new JLabel("Subject " + (i + 1) + " Name:"));
            inputPanel.add(subjectFields[i]);
            inputPanel.add(new JLabel("Marks for Subject " + (i + 1) + ":"));
            inputPanel.add(markFields[i]);
        }

        generateButton = new JButton("Generate Report Card");
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultArea);

        generateButton.addActionListener(e -> generateReportCard());

        add(inputPanel, BorderLayout.NORTH);
        add(generateButton, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void generateReportCard() {
        String name = nameField.getText().trim();
        String[] subjects = new String[3];
        int[] marks = new int[3];

        try {
            for (int i = 0; i < 3; i++) {
                subjects[i] = subjectFields[i].getText().trim();
                marks[i] = Integer.parseInt(markFields[i].getText().trim());
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new Exception("Marks must be between 0 and 100.");
                }
            }

            double average = (marks[0] + marks[1] + marks[2]) / 3.0;
            String grade = getGrade(average);

            StringBuilder report = new StringBuilder();
            report.append("==================================\n");
            report.append("Report Card\n");
            report.append("Name: ").append(name).append("\n");
            for (int i = 0; i < 3; i++) {
                report.append(subjects[i]).append(": ").append(marks[i]).append("\n");
            }
            report.append("Average Marks: ").append(String.format("%.2f", average)).append("\n");
            report.append("Grade: ").append(grade).append("\n");
            report.append("==================================");

            resultArea.setText(report.toString());

            saveToFile(name, report.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integer marks.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    private void saveToFile(String name, String content) {
        try {
            String filename = "ReportCard_" + name.replaceAll("\\s+", "") + ".txt";
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            JOptionPane.showMessageDialog(this, "Report saved as " + filename, "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error writing file: " + ex.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ReportCardGUI();
    }
}
