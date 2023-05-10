/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient.RelatedRecored;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Nasr
 */
public class RecordOperation {

    public static void writeRecordToFile(ArrayList<OfflineGameDTO> fRecord, String filename) {

        Gson gson = new Gson();

        String json = gson.toJson(fRecord);
        try (FileWriter file = new FileWriter("recorded/" + filename)) {
            file.write(json);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<OfflineGameDTO> readRecordFromFile(String filename) {
        Gson gson = new Gson();
        ArrayList<OfflineGameDTO> gameRecord = new ArrayList<>();
        try (Reader reader = new FileReader("recorded/" + filename)) {
            Type type = new TypeToken<ArrayList<OfflineGameDTO>>() {
            }.getType();

            gameRecord = gson.fromJson(reader, type);
            if (!gameRecord.isEmpty()) {
                OfflineGameDTO game = gameRecord.get(0);

                System.out.println("Winner ID: " + game.getUserOne());
                ArrayList<OfflineMoveDTO> point = game.getRecord();

                System.out.println("Winner ID: " + point.get(point.size() - 1).getRow());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameRecord;
    }

}
