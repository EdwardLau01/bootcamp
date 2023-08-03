package lecture.leetcode;

import java.util.Arrays;

public class LeetCode2347 {
  // 2347. Best Poker Hand

  // The following are the types of poker hands you can make from best to worst:
  // "Flush": Five cards of the same suit.
  // "Three of a Kind": Three cards of the same rank.
  // "Pair": Two cards of the same rank.
  // "High Card": Any single card.

  public static void main(String[] args) {
    // 1 flush
    int[] ranks = new int[] { 13, 2, 3, 1, 9 };
    char[] suits = new char[] { 'a', 'a', 'a', 'a', 'a' };

    // 2 three of a kind
    int[] ranks2 = new int[] { 4,4,2,4,4 };
    char[] suits2 = new char[] { 'd','a','a','b','c' };

    // 3 pair
    int[]ranks3 = new int[] { 10,10,2,12,9 };
    char[] suits3 = new char[] { 'a','a','a','b','b' };

    // 4 high card
    int[]ranks4 = new int[] { 10,12,2,12,9 };
    char[] suits4 = new char[] { 'a','c','a','d','b' };

    if (isFlush(suits2)) {
      System.out.println("Flush");
    } else if (isThreeOfAKind(ranks2)) {
      System.out.println("Thre of a Kind");
    } else if (isPair(ranks2)) {
      System.out.println("Pair");
    } else {
    System.out.println("High Card");
    }
  }

  public static int[] checkRanks(int[] ranks) {
    int[] checkRanks = new int[14];
    for (int i = 0; i < ranks.length; i++) {
        checkRanks[ranks[i]]++;
      }
      return checkRanks;
    }

  public static int[] checkSuits(char[] suits) {
    int[] checkSuits = new int[4];
    for (int i = 0; i < suits.length; i++) {
        checkSuits[suits[i] - 'a']++;
      }
      return checkSuits;
    }


  public static boolean isFlush(char[] suits) {
    boolean flush = false;
    int[] check = checkSuits(suits);
    System.out.println(Arrays.toString(check));
    for (int i = 0; i < check.length; i++) {
      if (check[i] == 5) {
        flush = true;
        return flush;
      }
    }
    return flush;
  }

  public static boolean isThreeOfAKind(int[] ranks) {
    boolean threeOfAKind = false;
    int[] check = checkRanks(ranks);
    System.out.println(Arrays.toString(check));
    for (int i = 0; i < check.length; i++) {
      if (check[i] >= 3) {
        threeOfAKind = true;
        return threeOfAKind;
      }
    }
    return threeOfAKind;
  }

  public static boolean isPair(int[] ranks) {
    boolean pair = false;
    int[] check = checkRanks(ranks);
    for (int i = 0; i < check.length; i++) {
      if (check[i] == 2) {
        pair = true;
        return pair;
      }
    }
    return pair;
  }
}
