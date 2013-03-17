package jmunit.framework.blackberry;

public class TestCaseResult {
    private final boolean passed;
    private final Throwable error;
    private final AssertionFailedException failure;
    private final String name;

    public TestCaseResult(String name, boolean passed) {
        this.name = name;
        this.passed = passed;
        this.failure = null;
        this.error = null;
    }

    public TestCaseResult(String name, AssertionFailedException failure) {
        this.name = name;
        this.passed = false;
        this.failure = failure;
        this.error = null;
    }
    
    public TestCaseResult(String name, Throwable error) {
        this.name = name;
        this.passed = false;
        this.failure = null;
        this.error = error;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean hasPassed() {
        return passed;
    }
    
    public boolean hasErrored() {
        return error != null;
    }
    
    public AssertionFailedException getFailure() {
        return failure;
    }
    
    public Throwable getError() {
        return error;
    }
}
