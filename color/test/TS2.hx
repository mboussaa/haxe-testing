import nanotest.NanoTestRunner;
class TS2
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestLCh());

        return runner.run();
    }
}