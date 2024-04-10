package com.example.moreexample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Controller {
    @FXML
    Label welcomeText;

    @FXML
    Button browser;

    @FXML
    public void onBrowserButton(ActionEvent event) {
//        DirectoryChooser directoryChooser = new DirectoryChooser();
//        directoryChooser.setTitle("Choose Directory");
//        directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
//        Stage stage = (Stage) browser.getScene().getWindow();
//        File selectedDirectory = directoryChooser.showDialog(stage);
//
//        if (selectedDirectory != null) {
//            welcomeText.setText("");
//
//            // Hiển thị đường dẫn đến thư mục
//            welcomeText.setText("Hiển thị các file của: " + selectedDirectory.getAbsolutePath() + "\n\n");
//
//            printDirectoryTree(selectedDirectory, "", welcomeText);
//        } else {
//            // Hủy hộp thoại
//            welcomeText.setText("No directory selected.");
//        }
//    }
//
//    // Hàm đệ quy để in ra cây thư mục
//    private void printDirectoryTree(File directory, String prefix, Label label) {
//        File[] files = directory.listFiles();
//        if (files != null) {
//            for (File file : files) {
//                label.setText(label.getText() + prefix + file.getName() + "\n");
//                if (file.isDirectory()) {
//                    printDirectoryTree(file, prefix + "  ", label);
//                }
//            }
//        }
//    }
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Direct");
        directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        Stage stage = (Stage) browser.getScene().getWindow();


        File f = new File("");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while(true) {
                line = br.readLine();
                if(line==null) {
                    break;
                }else {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


