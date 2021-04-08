package com.company;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Lab12 {

    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/javadb";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String pass = "1111";

    public static void main(String[] args) throws SQLException {

        Statement statement; //виконання статичного оператора SQL і повернення створених ним результатів
        String query; //написання SQL-запиту
        ResultSet resultSet; //результати запиту MySQL

        //масив для вмісту таблиці за замовченням
        Object rowData[][] = {{"null", "null", "null", "null", "null", "null"}};
        //масив для заголовків стовбців
        Object columnNames[] = {"id", "First name", "Last name", "Date of birth", "Gender", "Phone"};

        // створення моделі таблиці та таблиці на її основі
        DefaultTableModel mTableModel = new DefaultTableModel(rowData, columnNames);
        JTable table = new JTable(mTableModel);

        JButton add = new JButton("Add");
        add.addActionListener(e -> {
            int index = table.getSelectedRow(); //номер виділеного рядка
            //додавання нового рядка після виділеного рядка із значеннями за замовченням
            mTableModel.insertRow(index + 1, new String[] {
                    String.valueOf(table.getRowCount() + 1), "null", "null", "null", "null", "null"});
        });

        JButton remove = new JButton("Delete");
        remove.addActionListener(e -> {
            int index = table.getSelectedRow(); //номер виділеного рядка
            mTableModel.removeRow(index); //Видалення виділеного рядка
        });

        try {
            Class.forName(driver).getDeclaredConstructor().newInstance();
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

        query = "SELECT * FROM patients;";
        statement = con.createStatement();
        resultSet = statement.executeQuery(query);

        //створення gui
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(600, 200);
        JPanel buttons = new JPanel();
        buttons.add(add);
        buttons.add(remove);
        frame.add(buttons, "South");
        frame.setVisible(true);

        //видалення першого ятвореного рядка за замовчуванням
        mTableModel.removeRow(0);

        Object[] rows; //тимчасовий масив об'єктів для зберігання результату для кожного рядка
        while (resultSet.next()) {
            //додавання значень до тимчасового рядка
            rows = new Object[]{resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getDate(4),
                    resultSet.getString(5), resultSet.getString(6)};
            mTableModel.addRow(rows);
        }
    }
}