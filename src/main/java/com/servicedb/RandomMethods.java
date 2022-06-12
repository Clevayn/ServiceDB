package com.servicedb;

import com.servicedb.MVC.Entities.PumpStation;
import com.servicedb.MVC.Entities.Pump;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RandomMethods {
    private PumpStation ps;
    private Pump pump;
    private final HibernateUtil hu = new HibernateUtil();
    RandomMethods() throws Exception {}


    void pumpModelList() throws IOException {
        File file = new File("Pump Models1.txt");

        FileWriter fw = new FileWriter(file);

        List<String> list = new LinkedList<>();
        /*for (PumpsE p: new EntityList<PumpsE>(new PumpsE()).getObservableList()
             ) {
            String s = p.getModel().strip().replaceAll("\\.\\d+", "");
            if (!list.contains(p.getBrand().strip() + " : " + s)) {
                list.add(p.getBrand().strip() + " : " + s);

            }
        }*/
        fw.write(list.size() + "\n");

        for (String s: list
             ) {
            fw.write(s + "\n");
        }
        fw.close();
    }

    void spillExcel(){


    }


}
