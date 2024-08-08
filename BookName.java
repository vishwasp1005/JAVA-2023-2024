// 6(2) Declare a class called book having author_name as private data 
// member. Extend book class to have two sub classes called 
// book_publication & paper_publication. Each of these classes have 
// private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to displaybook or paper publications of given author.Use command line 
// arguments for inputting data.


import java.util.Scanner;

public class BookName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter name of an author: ");
        String nameofauthor = sc.nextLine();
        // book b1 = new book(nameofauthor);

        System.out.println("enter 1 for book publication and 2 for paper publication: ");
        int a = sc.nextInt();
        sc.nextLine(); // Consume newline character
        if(a==1){
            System.out.println("Enter your title here: ");
            String t1 = sc.nextLine();
            book b1 = new book_publication(nameofauthor, t1);
            b1.display();
        }
        else if(a==2){
            System.out.println("Enter your title here: ");
            String t2 = sc.nextLine();
            book b2 = new paper_publication(nameofauthor, t2);
            b2.display();
        }
        else{
            System.out.println("Enter a valid number...");
        }
        sc.close();
    }
}

class book{
    private String author_name;
    public book(String author_name){
       this.author_name = author_name;
    }
    public void display(){
        System.out.println("Name of author is: "+author_name);
    }
}

class book_publication extends book{

    private String title;

    book_publication(String an,String title){
        super(an);
        this.title = title;
        // System.out.println(an);
        // System.out.println(this.title);
    }
    public void display(){
        System.out.println("=========================================");
        super.display();
    System.out.println("Book Title is: "+this.title);
    }
}

class paper_publication extends book{

    private String title;
    
    public paper_publication(String an,String title){
        super(an);
        this.title = title;
        // System.out.println(an);
        // System.out.println(this.title);
    }
    public void display(){
        System.out.println("=========================================");
        super.display();
        System.out.println("Paper Title is: "+this.title);
        }
}
