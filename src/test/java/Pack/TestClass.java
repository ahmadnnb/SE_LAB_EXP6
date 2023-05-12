package Pack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestClass {

  @Test
  void computeArea1() {
    Rectangle rectangle=new Rectangle();
    assertEquals(50,rectangle.computeArea(10,5), " wrong!");
  }


  @Test
  void computeArea2() {
    Square square=new Square();
    assertEquals(196,square.computeArea(14), "  wrong!");
  }


  @Test
  void computeArea3() {
    Rectangle rectangle=new Rectangle();
    assertEquals(10,rectangle.computeArea(6,5), "  wrong!");
  }




}

