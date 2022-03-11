class Animal {
  final String species;
  private Double weight;

  Animal(double weight) {
    this.weight = weight;
  }

   public void feed() {
    if (weight == 0) {
      System.out.println("Pet's died. Can't feed.");
    } else {
      weight += 0.5;
    }
    
  }

  void takeForAWalk() {
    final double x = 0.5;
    if (weight - x <= 0.0) {
      weight = 0.0;
      System.out.println("Pet's died.");
    } else {
       weight -= x;
    }
  }
}