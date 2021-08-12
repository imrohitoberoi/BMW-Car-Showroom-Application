/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom;


//IMPORTANT- THIS IS DONE SO THAT EVEN ONE CHANGE IN DATABASE NAME/ID/PASS, WE ONLY CHANGE IT HERE AND ITS CHANGED EVERYWHERE(EVEN TO 1000 TIMES)
//TO CALL EITHER USE IMPLEMENTS OR import static showroom.connection.myurl/dbuname/dbpass
public interface connection {
    String myurl="jdbc:mysql://localhost/showroom";  // THESE ARE STATIC AND FINAL VARIABLES
    String dbuname="root";
    String dbpass="";
    
}
