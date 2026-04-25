package edu.teamrocket.golfstrokes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

public class Course {

    private final Table<String, Byte, Byte> course = HashBasedTable.create();



    public void addPlayerCourse(Player player, Byte[] course){
        Byte holeNumber = 0;
        for (Byte holeStrokes : course) {
            this.course.put(player.getInitials(), holeNumber++, holeStrokes);
        } 
    }

   
      
      
     
    byte[] getPlayerCourse(Player player) {
        return Bytes.toArray(this.course.row(player.getInitials()).values());
    }
        
    
}
