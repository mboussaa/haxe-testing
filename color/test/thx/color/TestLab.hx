package thx.color;

import utest.Assert;
import thx.color.palettes.Web;

class TestLab {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    var color = Lab.create(100, 10, -10);
    Assert.equals(100, color.l);
    Assert.equals(10,  color.a);
    Assert.equals(-10, color.b);
  }}

  public function testString() {
    for (i in 0...x){
    var color = Lab.create(100, 10, -10);
    Assert.equals("lab(100,10,-10)", color.toString());
  }}

  public function testParse() {
    for (i in 0...x){
    var color : Lab = "lab(100,10,-10)";
    Assert.equals("lab(100,10,-10)", color.toString());
  }}

  public function testFromFloat() {
    for (i in 0...x){
    var s : Lab = "lab(50,10,-10)",
        f : Lab = [50.0,10.0,-10.0];
    Assert.same(s, f);
  }}

  public function testFromString() {
    for (i in 0...x){
    var s = "lab(50,10,-10)";
    var color = Lab.create(50, 10, -10);
    Assert.same(color, Lab.fromString(s));
  }}

  public function testDistance() {
    for (i in 0...x){
    var orange : Lab = Web.orange,
        red : Lab = Web.red,
        blue : Lab = Web.blue,
        distOrangeRed = orange.distance(red),
        distOrangeBlue = orange.distance(blue);
    Assert.isTrue(distOrangeRed < distOrangeBlue);
  }}

  public function testMatch() {
    for (i in 0...x){
    var arr : Array<Lab> = [Web.red, Web.blue];
    Assert.isTrue((Web.orange : Lab).match(arr) == (Web.red : Lab));
  }}
}
