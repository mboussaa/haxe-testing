//import utest.ui.Report;

//class TestAll {
//  public static function main() {
//    UTest.run([
//      new thx.text.TestInflections(),
//      new thx.text.TestTable()
//    ]);
//  }
//}

import utest.Runner;
import utest.ui.Report;

class TestAll {
  public static function addTests(runner : Runner) {
    runner.addCase(new thx.text.TestInflections());
    runner.addCase(new thx.text.TestTable());
 }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}
