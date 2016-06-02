

import nanotest.NanoTestRunner;
class TS12
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestHsl());

        return runner.run();
    }
}


