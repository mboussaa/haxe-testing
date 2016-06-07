import utest.Runner;
import utest.ui.Report;
import utest.Assert;

class TS3 {
  public static function addTests(runner : Runner) {
    //runner.addCase(new thx.color.TestLab());
    //runner.addCase(new thx.color.TestLCh());
    //runner.addCase(new thx.color.TestLuv());
    //runner.addCase(new thx.color.TestColor());
    //runner.addCase(new thx.color.TestColorParser());
    //runner.addCase(new thx.color.TestConversion());
var w : String = "";
for (arg in Sys.args()){
w = arg;}
trace('The value of loop_wrapper is $w');

var x : Int = Std.parseInt(w);
runner.addCase(new thx.promise.TestTryPromise(x));
}

  public static function main() {

var runner = new Runner();
addTests(runner);
Report.create(runner);
runner.run();

  }
}
