

import nanotest.NanoTestRunner;
class TS14
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestRgb());

        return runner.run();
    }
}


