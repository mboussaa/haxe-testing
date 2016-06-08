import utest.Runner;
import utest.ui.Report;
import thx.speedTest.*;

class TS2 {
  public static function addTests(runner : Runner) {
var w : String = "";
for (arg in Sys.args()){
w = arg;}
trace('The value of loop_wrapper is $w');

var x : Int = Std.parseInt(w);
runner.addCase(new thx.speedTest.TestArray(x));
}

  public static function main() {

var runner = new Runner();
addTests(runner);
Report.create(runner);
runner.run();

  }
}

