import nanotest.NanoTestRunner;
class TS1
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestLab());

        return runner.run();
    }
}
