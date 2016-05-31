package thx.color;
import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
//import utest.Assert;

class TestLuv extends NanoTestCase{

  public function testBasics() {
    var color = Luv.create(0.5, 0.4, 0.6).normalize();
    assertEquals(0.5, color.l);
    assertEquals(0.4, color.u);
    assertEquals(0.6, color.v);
  }

  public function testString() {
    var color = Luv.create(0.5, 0.4, 0.6).normalize();
    assertEquals("cieluv(0.5,0.4,0.6)", color.toString());
  }

  public function testParse() {
    var color : Luv = "cieluv(0.5,0.4,0.6)";
    assertEquals("cieluv(0.5,0.4,0.6)", color.toString());
  }

  public function testFromFloat() {
    var s : Luv = "cieluv(0.5,0.4,0.6)",
        f : Luv = [0.5,0.4,0.6];
    assertTrue(s == f);
  }

  public function testXyz() {
    var luv = Luv.create(0.5, 0.4, 0.6),
        xyz = (luv : Xyz),
        out = (xyz : Luv);
    assertTrue(luv.nearEquals(xyz));
  }
}
