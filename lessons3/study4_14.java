class study4_14 {
  public static void main(String[] args) {
    Person4_14 person1 = new Person4_14("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person4_14 person2 = new Person4_14("John", "Smith", 65, 1.75, 80.0);
    person2.printData();

    // printCountメソッドを呼び出してください
    Person4_14.printCount();
  }
}