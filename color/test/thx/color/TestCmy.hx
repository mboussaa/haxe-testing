package thx.color;

import utest.Assert;

class TestCmy {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
for (i in 0...x){
    var color = Cmy.create(0.5,0.5,0.5);
    Assert.equals(0.5, color.cyan);
    Assert.equals(0.5, color.magenta);
    Assert.equals(0.5, color.yellow);

    color = Cmy.create(2,-2,2).normalize();
    Assert.equals(1, color.cyan);
    Assert.equals(0, color.magenta);
    Assert.equals(1, color.yellow);
} 
 }

  public function testString() {
for (i in 0...x){    
var color = Cmy.create(0.5,0.5,0.5);
    Assert.equals("cmy(0.5,0.5,0.5)", color.toString());
  }}

  public function testParse() {
for (i in 0...x){
    var color : Cmy = "cmy(0.5,0.5,0.5)";
    Assert.equals("cmy(0.5,0.5,0.5)", color.toString());
  }}

  public function testFromFloat() {
for (i in 0...x){    
var s : Cmy = "cmy(0.5,0.5,0.5)",
        f : Cmy = [0.5,0.5,0.5];
    Assert.isTrue(s == f);
  }}
}
