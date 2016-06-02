package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.Rgba;

class TestRgb extends NanoTestCase{
 

  public function testBasics() {
    var red = new Rgb(0xFF0000);
   assertEquals(0xFF, red.red);
    assertEquals(0x00, red.green);
    assertEquals(0x00, red.blue);

    var green = new Rgb(0x00FF00);
    assertEquals(0x00, green.red);
    assertEquals(0xFF, green.green);
    assertEquals(0x00, green.blue);

    var blue = new Rgb(0x0000FF);
    assertEquals(0x00, blue.red);
    assertEquals(0x00, blue.green);
    assertEquals(0xFF, blue.blue);

    var cyan = new Rgb(0x00FFFF);
    assertEquals(0x00, cyan.red);
    assertEquals(0xFF, cyan.green);
    assertEquals(0xFF, cyan.blue);

    var yellow = new Rgb(0xFFFF00);
    assertEquals(0xFF, yellow.red);
    assertEquals(0xFF, yellow.green);
    assertEquals(0x00, yellow.blue);

    var magenta = new Rgb(0xFF00FF);
    assertEquals(0xFF, magenta.red);
    assertEquals(0x00, magenta.green);
    assertEquals(0xFF, magenta.blue);

    var white = new Rgb(0xFFFFFF);
    assertEquals(0xFF, white.red);
    assertEquals(0xFF, white.green);
    assertEquals(0xFF, white.blue);

    var black = new Rgb(0x000000);
    assertEquals(0x00, black.red);
    assertEquals(0x00, black.green);
    assertEquals(0x00, black.blue);
  }

  public function testStrings() {
    var color = new Rgb(0x00AAFF);
    assertEquals("#00AAFF", color.toHex());
    assertEquals("#00AAFF", color.toString());
    assertEquals("rgb(0,170,255)", color.toCss3());
  }

  public function testFromString() {
    assertTrue(new Rgb(0xFF0000).equals("#ff0000"));
    assertTrue(new Rgb(0xFF0000).equals("#f00"));
    assertTrue(new Rgb(0xFF0000).equals("rgb(255,0,0)"));
    assertTrue(new Rgb(0xFF0000).equals("rgb(100%,0,0)"));

    assertTrue(new Rgba(0x00FF00FF).equals("#ff00ff00"));
    assertTrue(new Rgba(0x00FF00FF).equals("#f0f0"));
    assertTrue(new Rgba(0x00FF00FF).equals("rgba(0,255,0,1)"));
    assertTrue(new Rgba(0x00FF00FF).equals("rgba(0,100%,0,1)"));
  }

  public function testCombineColor() {
    var rgba     = Rgb.fromInts([255, 0, 0]).withAlphaf(.42),
        bg       = Rgb.fromInts([153, 200, 224]),
        combined = rgba.combineColor(bg),
        result   = Rgb.fromInts([196, 116, 130]);

    assertTrue(result.equals(combined), 'expected ${result} but it is ${combined}');
  }
}
