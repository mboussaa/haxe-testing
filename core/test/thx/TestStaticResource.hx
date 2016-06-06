package thx;

import utest.Assert;

class TestStaticResource {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testBasics() {
    for (i in 0...x){
    Assert.equals(1, ResourceTest.a);
    Assert.notNull(ResourceTest.b);
    Assert.equals("thx", ResourceTest.b.s);
    Assert.isTrue(ResourceTest.c);
    Assert.equals("haxe", ResourceTest.d);
    Assert.equals("value", ResourceTest.fileJson.some);
    Assert.equals("some text\n", ResourceTest.fileText);
  }}

  public function testDir() {
    for (i in 0...x){
    Assert.equals("some text\n", ResourceDir.text);
    Assert.equals("value", ResourceDir.object.some);
  }}
}

@:content({ a : 1 })
@:json("test/thx/other-resource")
@:file("test/thx/resource.json")
@:resolve("&")
class ResourceTest implements StaticResource { }

@:dir("test/thx/resources")
class ResourceDir implements StaticResource { }
