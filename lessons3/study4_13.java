class study4_13 {
  public static void main(String[] args) {
    Person4_13 person1 = new Person4_13("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    Person4_13 person2 = new Person4_13("John", "Smith", 65, 1.75, 80.0);
    person2.printData();

    // 「合計◯◯人です」と出力してください
    System.out.println("合計" + Person4_13.count + "人です");
  }
}