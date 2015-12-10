/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Caglar
 */
public class Room {
    
    public String name;
    public int  roomNo;
    public int  flor;
    public int  size;
    public boolean isEmpty;
    
    public Room()
    {
        name = null;
        roomNo = 0;
        flor = 0;
        size = 0;
        isEmpty = false;
    }
    public Room(String name, int roomNo, int flor, int size, boolean isEmpty)
    {
        this.name = name;
        this.roomNo = roomNo;
        this.flor = flor;
        this.size = size;
        this.isEmpty = isEmpty;
    }
    
    public String getRoomInfo()
    {
        return  "<html> <cr>Room No: " + roomNo+"</cr>" +   "<br> Flor : " + flor + "</br>" +  "<p>For " + size +"</p></html>";
    }
    
    
    public String toString()
    {
        return  "Room " + roomNo;
    }
}
