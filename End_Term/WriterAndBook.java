package End_Term;
//Design a class called Writer, which is designed to model a book's writer. It contains:
//
//Three private instance variables: name(String), email(String), and gender(char of either 'm' or 'f');
//One constructor to initialize the name, email and gender with the given values;
//public Writer(String name, String email, char gender) {......}
//public getters/setters: getName(), getEmail(), setEmail(), and getGender();
//        (There are no setters for name and gender, as these attributes cannot be changed.)
//
//A toString() method that returns "Writer[name=?,email=?,gender=?]", e.g., "Writer[name=Girdhar Gopal,email=girdhar@codequotient.com,gender=m]".
//
//
//Also, design a class called Book to model a book written by one writer. It contains:
//
//Four private instance variables: name(String), writer(of the class Writer you have just created, assume that a book has one and only one writer), price(double), and qty(int);
//Two constructors:
//public Book (String name, Writer writer, double price) { ...... }
//public Book (String name, Writer writer, double price, int qty) { ...... }
//public methods getName(), getPrice(), setPrice(), getQty(), setQty().
//A toString() that returns "Book[name=?,Writer[name=?,email=?,gender=?],price=?,qty=?". You should reuse Writer’s toString()

class Writer{
    private String name;
    private String email;
    private char gender;

    public Writer(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString(){
        return "Writer[name= " + name + ",email= " + email + ",gender= " + gender + "]";
    }
}

class Book{
    private String name;
    private Writer writer;
    private double price;
    private int qty;

    public Book (String name, Writer writer, double price) {
        this.writer = writer;
        this.name = name;
        this.price = price;
        this.qty = 0;
    }
    public Book (String name, Writer writer, double price, int qty) {
        this.writer = writer;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "Book[name= " + name + ",Writer[" + writer.toString() + "],price= " + price + ",qty= " + qty + "]";
    }

}

public class WriterAndBook {
    public static void main(String[] args) {
        Writer writer = new Writer("Girdhar Gopal", "girdhar@codequotient.com", 'm');
        Book book = new Book("Java Programming", writer, 29.99, 5);
        System.out.println(writer);
        System.out.println(book);
    }
}
