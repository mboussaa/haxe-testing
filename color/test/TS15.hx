

import nanotest.NanoTestRunner;
class TS15
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestRgbx());

        return runner.run();
    }
}


