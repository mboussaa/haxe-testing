import nanotest.NanoTestRunner;
class TS5
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestRoundTrip());

        return runner.run();
    }
}


