import nanotest.NanoTestRunner;
class TS3
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestLuv());

        return runner.run();
    }
}