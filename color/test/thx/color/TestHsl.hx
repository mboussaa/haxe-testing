package thx.color;

import utest.Assert;
import thx.color.Hsla;

class TestHsl {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var hsl = Hsl.create(1, 0, 0);
    Assert.equals(1, hsl.hue);
    Assert.equals(0, hsl.saturation);
    Assert.equals(0, hsl.lightness);
  }}

  public function testStrings() {
    for (i in 0...x){
    var hsl = Hsl.create(0, 0, 1);
    Assert.equals("hsl(0,0%,100%)", hsl.toString());
    Assert.equals("hsl(0,0%,100%)", hsl.toCss3());
  }}

  public function testFromString() {
    for (i in 0...x){
    Assert.isTrue(Hsl.create(0.5, 0.2, 0.1).equals("hsl(50%,0.2,10%)"));
    Assert.isTrue(Hsla.create(0.5, 0.2, 0.1, 0.3).equals("hsla(50%,0.2,10%,0.3)"));
  }}
}
