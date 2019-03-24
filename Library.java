import java.util.Arrays;
public class Library {
     int size;
     Book books[];
     int count=0;
     public Library ( int size ){
         this.size=size;
         this.books = new Book[size];

     }
     public void addBook (Book book ){
         if(count<size)
         {
             books[count]=book;
             count++;
         }
         else
         {
             System.out.println("The library is full");
         }
         
         
     }
      public void printLibrary ( ) {
          for(Book b:books)
          {
            System.out.println(b);

          }
      }
       public void searchAuthor ( String author ){
           Book sameAuthorbook[]=new Book[size] ;
           int count = 0;
              for(Book b:books)
          {
              if(b.author.equalsIgnoreCase(author))
              {
                   sameAuthorbook[count]=b;
                   count++;
              }
                
          }
              for(int i=0;i<count;i++)
              {
                 System.out.println(sameAuthorbook[i]);

              }
       }
       public void searchTitle ( String title ){ 
            Book sameTitlebook[]=new Book[size] ;
           int count = 0;
              for(Book b:books)
          {
              if(b.title.equalsIgnoreCase(title))
              {
                   sameTitlebook[count]=b;
                   count++;
              }
                
          }
              for(int i=0;i<count;i++)
              {
                 System.out.println(sameTitlebook[i]);

              }
       
       }
        public void searchYear ( int year ){ 
        Book sameYearbook[]=new Book[size] ;
           int count = 0;
              for(Book b:books)
          {
              if(b.year==year)
              {
                   sameYearbook[count]=b;
                   count++;
              }
                
          }
              for(int i=0;i<count;i++)
              {
                 System.out.println(sameYearbook[i]);

              }
       }
         public void sort () {
             Arrays.sort(books);
         }
         public int compareTo(Book compareBook) {
             return 0;
         }
}
