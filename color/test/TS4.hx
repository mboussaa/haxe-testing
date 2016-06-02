import nanotest.NanoTestRunner;
class TS4
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestColor());

        return runner.run();
    }
}
