/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exercicio_composicao02;

import entities.Post;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vanio.oliveira
 */
public class Exercicio_Composicao02 {

    public static void main(String[] args) {
        List<Post> posts = new ArrayList<>();
        
        LocalDateTime momentPost1 = LocalDateTime.parse("2018-06-21T13:05:44");
        Date date1 = Date.from(momentPost1.atZone(ZoneId.systemDefault()).toInstant());
        String titlePost1 = "Traveling new Zealand";
        String contentPost1 = "I'm going to visit this wonderful country";
        int likesPost1 = 12;
        
        Post post1 = new Post(date1, titlePost1, contentPost1, likesPost1);
        posts.add(post1);
        
    }
}
