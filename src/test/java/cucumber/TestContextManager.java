package cucumber;

public class TestContextManager {

    private static TestContext testContext;

    public static TestContext getTestContext(){
        if (testContext==null){
            testContext=new TestContext();
        }
        return testContext;
    }
}
