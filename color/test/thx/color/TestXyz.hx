package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestXyz extends NanoTestCase{
   

  public function testBasics() {
    var color = Xyz.create(0.5, 0.4, 0.3);
    assertEquals(0.5, color.x);
    assertEquals(0.4, color.y);
    assertEquals(0.3, color.z);
  }

  public function testString() {
    var color = Xyz.create(0.5, 0.4, 0.3);
    assertEquals("xyz(0.5,0.4,0.3)", color.toString());
  }

  public function testParse() {
    var color : Xyz = "xyz(0.5,0.4,0.3)";
    assertEquals("xyz(0.5,0.4,0.3)", color.toString());
  }

  public function testFromFloat() {
    var s : Xyz = "xyz(0.5,0.4,0.3)",
        f : Xyz = [0.5,0.4,0.3];
    assertTrue(s == f);
  }
}
