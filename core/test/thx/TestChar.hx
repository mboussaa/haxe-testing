package thx;

import haxe.PosInfos;
import utest.Assert;
using thx.Char;

class TestChar {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testChar() {
    for (i in 0...x){
    var char : Char = 120;

    Assert.equals(120, char);
    Assert.equals("x", char.toString());

    char = "y";

    Assert.equals(121, char);
    Assert.equals("y", char.toString());

    Assert.equals(89, char.toUpperCase());
    Assert.equals("Y", char.toUpperCase().toString());

    char = char.next();

    Assert.equals(122, char);
    Assert.equals("z", char.toString());

    Assert.equals(121, char.prev());
  }}

  public function testControl() {
    for (i in 0...x){
    Assert.isTrue((7 : Char).isControl());
    Assert.isFalse(("x" : Char).isControl());
  }}

  public function testUtf8() {
    for (i in 0...x){
    Assert.equals(9786, ("☺" : Char).toInt());
    Assert.equals("☺", (9786 : Char).toString());
  }}

  public function testArrayToString() {
    for (i in 0...x){
    var chars : Array<Char> = [120, 121, 122];
    Assert.equals("xyz", Char.arrayToString(chars));
  }}
}
