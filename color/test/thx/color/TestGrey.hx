package thx.color;

import utest.Assert;

class TestGrey {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var grey = new Grey(0.2);
    Assert.equals(0.2, grey.grey);
  }}

  public function testStrings() {
    for (i in 0...x){
    var grey = new Grey(0.5);
    Assert.equals("grey(50%)", grey.toString());
  }}

  public function testFromString() {
    for (i in 0...x){
    Assert.isTrue(new Grey(0.2).equals("grey(20%)"));
  }}
}
