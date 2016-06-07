package thx.text;

import utest.Assert;
using thx.text.Inflections;

class TestInflections {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testUncountable() {
    for (i in 0...x){
    Assert.equals("information", "information".pluralize());
    Assert.equals("news", "news".pluralize());
  }}

  public function testPluralize() {
    for (i in 0...x){
    Assert.equals("days", "day".pluralize());
    Assert.equals("women", "woman".pluralize());
    Assert.equals("autobuses", "autobus".pluralize());
    Assert.equals("quizzes", "quiz".pluralize());
  }}

  public function testSingularize() {
    for (i in 0...x){
    Assert.equals("day", "days".singularize());
    Assert.equals("woman", "women".singularize());
    Assert.equals("autobus", "autobuses".singularize());
    Assert.equals("quiz", "quizzes".singularize());
  }}
}
