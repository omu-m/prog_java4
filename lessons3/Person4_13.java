class Person4_13 {
  // int型のクラスフィールドcountを定義し、0を代入してください
  public static int count = 0;
  public String firstName;
  public String lastName;
  public int age;
  public double height, weight;

  Person4_13(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足してください
    Person4_13.count++;
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }
}