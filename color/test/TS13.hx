

import nanotest.NanoTestRunner;
class TS13
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestHsv());

        return runner.run();
    }
}


