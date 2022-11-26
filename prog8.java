// Encapsulation
// it uses set and get function

public class Person {
  public String name; // private = restricted access

  // Getter - fetching any value
  public String getName() {
    return name;
  }

  // Setter - setting any value
  public void setName(String newName) {
    this.name = newName;
  }
}

public class prog8 {
  public static void main(String[] args) {
    Person myObj = new Person();
    // input setter
    myObj.name = "John";  // error
    // output getter
    System.out.println(myObj.name); // error 
  }
}