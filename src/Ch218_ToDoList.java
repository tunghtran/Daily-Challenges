import java.util.*;
/** DESCRIPTION (https://www.reddit.com/r/dailyprogrammer/comments/39ws1x/20150615_challenge_218_easy_todo_list_part_1/)
 * Okay maybe I need some help on organising my thoughts
 * before I submit my challenge. A to-do list would be fine, 
 * just something so that I can organise my thoughts!
 * It should have the following basic functionality
 * - Add an item to the to-do list
 * - Delete a selected item from the to-do list
 * - And obviously, print out the list so I can see what to do!
 */

/**
 *
 * @author Tung Tran
 */
public class Ch218_ToDoList implements Solution {
    ArrayList<String> taskList = new ArrayList<>();
    ArrayList<String> programming = new ArrayList<>();
    ArrayList<String> music = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println(new Ch218_ToDoList().run());
    }

    @Override
    public String run() {
//        addItem("Take a shower");
//        addItem("Go to work");
//        viewList();
//        
//        addItem("Buy a new phone");
//        deleteItem("Go to work");
//        viewList();
        
        addItem("A pixel is not a pixel is not a pixel", "programming");
        addItem("The Scheme Programming Language", "programming");
        addItem("Memory in C", "programming");
        addItem("Haskell's School of Music", "programming");
        
        
        addItem("Modes in Folk Music", "music");
        addItem("The use of the Melodic Minor Scale", "music");
        addItem("Haskell's School of Music", "music");
        
        
        addItem("Algorithmic Symphonies from one line of code", "music", "programming");
        addItem("Music Coding for Dummies", "music", "programming");
        
        viewList("programming");
        viewList("music");
        viewList("music" + "programming");
        return ""; 
    }

    public String addItem(String task){
        taskList.add(task);
        return task;
    }
    
    public void deleteItem(String task){
        if(taskList.contains(task)){
            taskList.remove(task);
        }
        else{
            System.out.println("Task doesn't exist");
        }
    }
    
    
    public String addItem(String task, String ... cat){
        for(String s: cat){
            switch(s){
                case "music":
                    music.add(task);
                    break;
                case "programming":
                    programming.add(task);
                    break;
            }
        }
        return task;
    }
    
    public void viewList(){
        for(String s : taskList){
            System.out.println(s);
        }
    }
    
    public void viewList(String... str){
        for(String cat : str){
            switch(cat){
                case "music":
                    System.out.println("----MUSIC----");
                    for(String s: music){
                        System.out.println("- " + s);
                    }
                    System.out.println();
                    break;
                case "programming":
                    System.out.println("----PROGRAMMING----");
                    for(String s: programming){
                        System.out.println("- " + s);
                    }
                    System.out.println();
                    break;
                case "music" + "programming":
                    System.out.println("----MUSIC & PROGRAMMING----");
                    for(String s: programming){
                        if(music.contains(s)){
                            System.out.println("- " + s);
                        }
                    }
                    System.out.println();
                    break;
                    
            }
        }
    }
}
