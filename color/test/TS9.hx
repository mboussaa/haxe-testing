

import nanotest.NanoTestRunner;
class TS9
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestCubeHelix());

        return runner.run();
    }
}


