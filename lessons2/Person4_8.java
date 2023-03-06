class Person4_8 {
  public String name;

  // コンストラクタがString型の引数を受け取るようにしてください
  Person4_8(String name) {
    System.out.println("インスタンスが生成されました");
    // インスタンスフィールドnameに値をセットしてください
    this.name = name;
  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}