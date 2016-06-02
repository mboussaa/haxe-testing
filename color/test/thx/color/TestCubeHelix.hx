package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.CubeHelix;

class TestCubeHelix extends NanoTestCase{
 

  public function testBasics() {
    var cubeHelix = CubeHelix.create(1, 0, 0);
    assertEquals(1, Std.int(cubeHelix.hue));
    assertEquals(0, Std.int(cubeHelix.saturation));
    assertEquals(0, Std.int(cubeHelix.lightness));
  }

  public function testStrings() {
    var cubeHelix = CubeHelix.create(0, 0, 1);
    assertEquals("cubehelix(0,0,1)", cubeHelix.toString());
  }

  public function testFromString() {
    assertTrue(CubeHelix.create(0.5, 0.2, 0.1).equals("cubehelix(50%,0.2,10%)"));
  }

  public function testNearEquals() {
    var c1 = CubeHelix.create(206.182, 0.441, 0.090),
        c2 = CubeHelix.create(206.181, 0.440, 0.090);
    assertFalse(c1 == c2);
    assertTrue(c1.nearEquals(c2, 0.01));
  }
}
