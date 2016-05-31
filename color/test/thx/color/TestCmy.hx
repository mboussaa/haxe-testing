package thx.color;
import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
//import utest.Assert;

class TestCmy extends NanoTestCase{


  public function testBasics() {
    var color = Cmy.create(0.5,0.5,0.5);
    assertEquals(0.5, color.cyan);
    assertEquals(0.5, color.magenta);
    assertEquals(0.5, color.yellow);

    color = Cmy.create(2,-2,2).normalize();
    assertTrue(1 == color.cyan);
    assertTrue(0 == color.magenta);
    assertTrue(1 == color.yellow);
  }

  public function testString() {
    var color = Cmy.create(0.5,0.5,0.5);
    assertEquals("cmy(0.5,0.5,0.5)", color.toString());
  }

  public function testParse() {
    var color : Cmy = "cmy(0.5,0.5,0.5)";
    assertEquals("cmy(0.5,0.5,0.5)", color.toString());
  }

  public function testFromFloat() {
    var s : Cmy = "cmy(0.5,0.5,0.5)",
        f : Cmy = [0.5,0.5,0.5];
    assertTrue(s == f);
  }
}
