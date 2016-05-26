package thx.format;

import thx.Time;
import thx.culture.Culture;
import thx.culture.Embed;
import utest.Assert;
using thx.format.TimeFormat;

class TestTimeFormat {
  static var it = Embed.culture('it-it');
  static var bn = Embed.culture('bn-in');
  static var us = Embed.culture('en-us');
  static var t1 : Time = '13:45:30';
  static var t2 : Time = '-18:40:20';
  public function new() {}


  public function testCustomFormat() {
    Assert.equals("245 30, 0,12", ("245:30:00.1234567" : Time).format("H m, s.ff", it));
    Assert.equals("10,05 30, 0,123", ("245:30:00.1234567" : Time).format("d.hh m, s.fff", it));
    Assert.equals("245 30, 0 0", ("245:30:00" : Time).format("H m, s.ff f", it));
    Assert.equals("10,05 30 1 0000", ("245:30:01" : Time).format("d.hh m s.fff ffff", it));
    Assert.equals("245 30, 0 ", ("245:30:00" : Time).format("H m, s.FF F", it));
    Assert.equals("10,05 30, 1 ", ("245:30:01" : Time).format("d.hh m, s.FFF FFFF", it));
  }
}
