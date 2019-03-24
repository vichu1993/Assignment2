public class Book implements Comparable<Book>{
String author;
String title;
int year;
public Book(String author, String title, int year) {
    this.author=author;
    this.title=title;
    this.year=year;
}
public String getAuthor( ) {
    return author;
}
public String  getTitle( ){
    return title;
}
public int getYear( ){
    return year;
}
public boolean  equals(Book other){
    if(other.author.equalsIgnoreCase(author)
            && other.title.equalsIgnoreCase(title)
            && other.year==year)
            {
                return true;
            }
    return false;
}
public String toString ( ) {
    return "\""+author+"\""+":"+"\t"+title+"\t"+"("+year+")";
}
 public int compareTo(Book compareBook) {
            int dif;

dif = this.getAuthor().compareTo(compareBook.getAuthor());
if(dif != 0)
    return dif;

dif = this.getTitle().compareTo(compareBook.getTitle());
if(dif != 0)
    return dif;

if(this.getYear()< compareBook.getYear())
    return -1;
else
    return 1;

         }
}
