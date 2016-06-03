
package thx.color;

import utest.Assert;

class TestCmyk {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var cmyk = Cmyk.create(0.1, 0.2, 0.3, 0.4);
    Assert.equals(0.1, cmyk.cyan);
    Assert.equals(0.2, cmyk.magenta);
    Assert.equals(0.3, cmyk.yellow);
    Assert.equals(0.4, cmyk.black);
  }}

  public function testStrings() {
    for (i in 0...x){
    var cmyk = Cmyk.create(0,1,1,0);
    Assert.equals("cmyk(0,1,1,0)", cmyk.toString());
  }}

  public function testWhite() {
    for (i in 0...x){
    Assert.isTrue(thx.color.palettes.Web.white.toCmyk().equals(Cmyk.create(0,0,0,0)));
  }}

  public function testFromString() {
    for (i in 0...x){
    Assert.isTrue(Cmyk.create(0.5, 0.2, 0.1, 0.3).equals("cmyk(50%,0.2,10%,0.3)"));
  }}
}
