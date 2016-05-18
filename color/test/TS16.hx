import utest.Runner;
import utest.ui.Report;

class TS16 {
  public static function addTests(runner : Runner) {

    runner.addCase(new thx.color.TestTemperature());
  //  runner.addCase(new thx.color.TestXyz());
  //  runner.addCase(new thx.color.TestYxy());

   // runner.addCase(new thx.color.TestRoundTrip());
  }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}

