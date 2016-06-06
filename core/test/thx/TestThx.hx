package thx;

using Thx;
import utest.Assert;

class TestThx {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testUsing() {
  	for (i in 0...x){
    Assert.equals("thx using", "ThxUsing".humanize());
}
  }
}
