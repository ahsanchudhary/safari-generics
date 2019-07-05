package shopping;

import java.util.function.BiPredicate;

public class Shop {
  public static void main(String[] args) {
//    ClothingPair<String> cps;
    ClothingPair<Glove> pg =
        new ClothingPair<>(new Glove(44, "Red"), new Glove(45, "Red"));
    System.out.println("Gloves match? " + pg.isMatched());
    ClothingPair<Glove> pg2 =
        new ClothingPair<>(new Glove(45, "Red"), new Glove(45, "Orange"));
    System.out.println("Other gloves match? " + pg2.isMatched());

    System.out.println("pg matches by color? "
        + pg.matchesBy((g1, g2) -> g1.getColor().equals(g2.getColor())));

    System.out.println("pg matches by size? "
        + pg.matchesBy((g1, g2) -> g1.getSize() == g2.getSize()));

    BiPredicate<Clothing, Clothing> clothingTest =
        (c1, c2) -> c1.price() == c2.price();

    System.out.println("pg matches by price? "
        + pg.matchesBy(clothingTest));

  }
}
