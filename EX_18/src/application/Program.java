package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awsome!!!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with your");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New zeland", "I'm going to visit this wonderful contry", 12);

        p1.addComment(c1);
        p1.addComment(c2);
        p1.addComment(c3);
        p1.addComment(c4);

        System.out.println(p1);
    }
}
