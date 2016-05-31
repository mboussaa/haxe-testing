package thx.color;
import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.palettes.Web;

class TestLab extends NanoTestCase {
 

  public function testBasics() {
    var color = Lab.create(100, 10, -10);
    assertTrue(100 == color.l);
    assertTrue(10 ==  color.a);
    assertTrue(-10 == color.b);
  }

  public function testString() {
    var color = Lab.create(100, 10, -10);
    assertEquals("lab(100,10,-10)", color.toString());
  }

  public function testParse() {
    var color : Lab = "lab(100,10,-10)";
    assertEquals("lab(100,10,-10)", color.toString());
  }

  public function testFromFloat() {
    var s : Lab = "lab(50,10,-10)",
        f : Lab = [50.0,10.0,-10.0];
    assertEquals(s, f);
  }

  public function testFromString() {
    var s = "lab(50,10,-10)";
    var color = Lab.create(50, 10, -10);
    assertEquals(color, Lab.fromString(s));
  }

  public function testDistance() {
    var orange : Lab = Web.orange,
        red : Lab = Web.red,
        blue : Lab = Web.blue,
        distOrangeRed = orange.distance(red),
        distOrangeBlue = orange.distance(blue);
    assertTrue(distOrangeRed < distOrangeBlue);
  }

  public function testMatch() {
    var arr : Array<Lab> = [Web.red, Web.blue];
    assertTrue((Web.orange : Lab).match(arr) == (Web.red : Lab));
  }
}
