import utest.Runner;
import utest.ui.Report;

class TS1 {
  public static function addTests(runner : Runner) {
    runner.addCase(new thx.color.TestLab());
  }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}

