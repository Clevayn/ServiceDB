package com.servicedb;


import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenPDF {

    public OpenPDF(String s){
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File(s);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
            }
        }
    }
}
