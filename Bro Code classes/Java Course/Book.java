public class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    
    String displayInfo(){
        if(this.title.startsWith("The")){
            return this.title + " has " + this.pages + " pages.";
        }
        else{
            return "The " + this.title + " has " + this.pages + " pages.";
        }
    }
}
